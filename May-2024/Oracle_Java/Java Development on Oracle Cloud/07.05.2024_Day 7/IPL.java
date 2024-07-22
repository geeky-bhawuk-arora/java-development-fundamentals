
public class IPL {
    static int a = 19;
    static void show() {
        System.out.println("Hallo Bhawuk!");
    }
    static class RR {
        static void play() { // If this method won't be static; IPL.RR.play(); -> It would throw an error.
            System.out.println("Guten Morgen!");
        }
    }
    public static void main(String args[]) {
        
        System.out.println(IPL.a);
        IPL.show();
        IPL.RR.play(); //  Class RR didn't had any recognition that's why it's referenced to the parent as IPL.RR 
        // If the play() method won't be static; IPL.RR.play(); -> It would throw an error.
        IPL.RR r1 = new IPL.RR();
        r1.play();
    }
}
