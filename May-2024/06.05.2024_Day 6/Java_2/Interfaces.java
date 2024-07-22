
interface NewClass1 {

    void show();
    void display();
    

    public static void main(String[] args) {
        NewClass1 i1 = new NewClass1() {
            public void show() {
                System.out.println("Bhawuk");
            }
		public void display() {
                System.out.println("Arora");
            }
        };
        
      
        i1.show();
        i1.display();
    }

}
