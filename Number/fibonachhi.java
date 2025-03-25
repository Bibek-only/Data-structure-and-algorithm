class solution {
    // using loop
    public static void loopApproach(int terms) {
        int term1 = 0;
        int term2 = 1;
        int term3;
        System.out.println(term1 + "\n" + term2);
        for (int i = 1; i <= terms - 2; i++) {
            term3 = term1 + term2;
            System.out.println(term3);
            term1 = term2;
            term2 = term3;
        }
    }

    // using the recursion
    public static void recursion(int terms, int term1, int term2) {

        if (terms <= 2) {
            return;
        }

        int term3 = term1 + term2;
        System.out.println(term3);
        recursion(terms - 1, term2, term3);

    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("1\n2");
        recursion(terms, 0, 1); //recursion approach

    }
}