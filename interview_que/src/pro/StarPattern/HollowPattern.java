package pro.StarPattern;

public class HollowPattern {
public static void main(String[] args) {
	int n = 5;
    // outer loop
    for (int i = 0; i < n; i++) {
      // inner loop
      for (int j = 0; j < n; j++) {
        // print only star in first and last row
        if (i == 0 || i == n - 1) {
          System.out.print("*");
        }
        else {
          // print star only at first and last position row
          if (j == 0 || j == n - 1) {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}