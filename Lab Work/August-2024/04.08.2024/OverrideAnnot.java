class xyz {
    void add() {
        System.out.println("Hallo");
    }
}

class pqr extends xyz {
    @Override
    void add() {
        System.out.println("Guten Morgen");
    }

    public static void main(String[] args) {
        System.out.println("Testing..");
        pqr p1 = new pqr();
        p1.add();
    }
}