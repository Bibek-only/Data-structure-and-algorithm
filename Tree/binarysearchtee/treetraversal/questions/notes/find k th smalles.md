# Problem: kth smallest in BST
## Pattern: Iterative In-order (L → Node → R)

### Algorithm:
```
1. stack = empty
2. curr = root
3. while curr != null OR stack not empty:
   a. while curr != null:
        push curr
        curr = curr.left
   b. curr = pop()
      k--
      if k == 0 → return curr.value
   c. curr = curr.right
4. Return null (k too large)

Time: O(h + k)  → worst O(n)
Space: O(h)  → stack
```