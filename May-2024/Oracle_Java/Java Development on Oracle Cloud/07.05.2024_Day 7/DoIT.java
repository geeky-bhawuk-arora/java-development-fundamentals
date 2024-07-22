
interface DoIT {

    interface RCAT {

        int b = 200;

        void display();
    }

    public static void main(String args[]) {
        int a = 100;
        void show();
    }
    
  class Student implements DoIT.RCAT {

        public void display() {
            System.out.println("Ich bin Bhawuk!");
        }

        public static void main(String args[]) {
            DoIT.RCAT s1 = new Student();
            s1.display();
        }

    }
}
