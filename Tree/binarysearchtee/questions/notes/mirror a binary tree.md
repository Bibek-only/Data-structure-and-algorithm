# Mirror a binary serarch tree
## 1) Thinking approach — how to recognize the pattern

## When you read “Invert Binary Tree / mirror a tree” ask:

- What’s being transformed? — <mark>a tree structure (every node’s left/right children are swapped).</mark>

- Is the operation local or global? — <mark>local (swap at a node) but must be applied to every node → suggests recursion or a traversal.</mark>

- What traversal fits? — any DFS/BFS that visits all nodes works. <mark>Recursion is the simplest because the subtrees are identical subproblems (mirror left/right subtrees).</mark>

- <b>Pattern identified:</b> Tree recursion / traversal (Divide & Conquer flavor: operate on node, recurse on subproblems).

- <b>Mnemonic: S.R.R</b> — Swap, Recurse left, Recurse right (or Swap after recursion — both fine).

# 📘 Algorithm: Invert (Mirror) a Binary Tree

## Objective:
- For every node in the binary tree, swap its left and right children.

### Input:

- Root node of a Binary Tree.

### Output:

- Root node of the inverted (mirrored) Binary Tree.

### Algorithm Steps:

- If the current node is null,
- ``` return null (no operation needed). ```

- Store the left subtree in a temporary variable:
- ```temp = node.left.```

- Recursively invert the right subtree and assign it to the left:
- ``` node.left = invertTree(node.right).```

- Recursively invert the saved left subtree and assign it to the right:
``` node.right = invertTree(temp). ```

- Return the node (now inverted).

### Pseudocode (Java style):
```
Node invertTree(Node node) {
    if (node == null)
        return null;

    Node temp = node.left;
    node.left = invertTree(node.right);
    node.right = invertTree(temp);

    return node;
}
```
### Example:

```
Original Tree

          4
        /   \
       2     6
      / \   / \
     1  3  5  7


After Inversion

          4
        /   \
       6     2
      / \   / \
     7  5  3  1
```

### 🧩 Complexity

- Time: O(n) — each node visited once

- Space: O(h) recursion depth (balanced → O(log n), skewed → O(n))