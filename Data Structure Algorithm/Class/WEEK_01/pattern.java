package WEEK_1;
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         int i = 1, j = 1;
//         while (i <= n){
//             if (j <= i){
//                 System.out.print("*");
//                 j++;
//             }
//             else{
//                 System.out.println();
//                 i++;
//                 j = 1;
//             }
//         }
//     }
// }

public class pattern {
    public static void main(String[] args) {
        int n = 5, i = 0, j = 0;
        while (i <= n && j <= n) {
            if (j == i) {
                i++;
                j = 0;
                System.out.println();
            } else {
                System.out.print("*");
                j++;
            }
        }
    }
}