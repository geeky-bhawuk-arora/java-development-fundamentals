// Composition & Wrapper Classes -> In this approach, the target class creates objects of appropriate classes and assigns method calls as needed.

class RCAT {
    public void courses() {
        System.out.println("Core Java");
    }
}

class Student {
    public void learn() {
        System.out.println("Oracle Cloud");
    }
}

class RCATStudent {
    private RCAT r1;
    private Student s1;

    RCATStudent() {
        r1 = new RCAT();
        s1 = new Student();
    }

    public void courses() {
        r1.courses();
    }

    public void learn() {
        s1.learn();
    }

    public static void main(String[] args) {
        RCATStudent rs1 = new RCATStudent();
        rs1.courses();
        rs1.learn();
    }
}