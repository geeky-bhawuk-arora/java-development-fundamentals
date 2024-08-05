
interface Interfaces {

    void show();
}

class Hello implements Interfaces {

    public void show() {
        System.out.println("Bhawuk");
    }

    public static void main(String[] args) {
        Interfaces i1 = new Interfaces();
        
    }
}
