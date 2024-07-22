
enum Days {
//    Mon, Tues, Wed, Thurs, Fri, Sat, Sun; // Enum fields -> To be mentioned always at the start
    // These fields are actually the instances of our enum class that's why the constructor is called 7 times
    Mon(1), Tues(2), Wed(3), Thurs(4), Fri; // This list is always final & static by default.
    
    enum Dinank { // Nested Enum
        Kota, Jaipur;   
    }
    
    static int num = 42;

    Days() {
        System.out.println("Guten Morgen, Bhawuk");
    }

    Days(int order) {
        System.out.println(order);
    }

    static void show() {
        System.out.println("Guten Morgen, Bhawuk");
    }

    public static void main(String args[]) {
        System.out.println("Guten Abend, Bhawuk!");
        show();
        Days d = Days.Mon; // Creating instances of the enum class
        d.show();
        System.out.println(Days.Dinank.Kota);
        
        for(Days.Dinank dd: Days.Dinank.values()) {
            System.out.println(dd);
        }
    }

}
