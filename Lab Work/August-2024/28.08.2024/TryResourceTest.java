// import java.io.*;

// class TryResourceTest {
//     public static void main(String[] args) {
//         String line;
//         try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
//             while((line = br.readLine())!=null) {
//                 System.out.println(line);
//             }
//         } catch(Exception e) {
//             System.out.println(e);
//         }
//     }
// }

import java.io.*;
import java.util.*;

class abc {
    public static void main(String[] args) throws IOException {
    try (Scanner scanner = new Scanner(new File("test.txt"));
    PrintWriter writer = new PrintWriter(new File("newtest.txt"))) {
        while (scanner.hasNext()) {
            writer.print(scanner.nextLine());
        }
    }
}
