
class VarKeyword {
//    var z = 42; // var -> Global mei allowed nhi hei
//    var show() {
//        Not Allowed -> Var type ka
//        Parameters -> yha bhi allowed nhi hei, kyoki overloading mei dikkat aa jayegi 
//    }
    public static void main(String args[]) {
        System.out.println("Hallo Bhawuk!");
        int a = 19;
        char k = 'B'; // Double quote are allowed in a string but not in character
        float f = 12.3f;
        double d = 89.9d;
        // Here, mention the data type as var for all, data type would be auto-detected by the compiler
        var b = 19.0;
        var m = 19;
//        var x; // Error -> Compiler ko nhi pta, what to do; initialise kr dena
        // var -> it's not a keyword; special word that can be used to represent data types; 
//        identfier bhi use kr sakte hei
        
        VarKeyword obj = new VarKeyword();
        var ob = new VarKeyword(); // Allowed -> ob ka type = kei bad deccide ho jayega
    }
}
// Generic, Collections mei use kr sakege (Later)
