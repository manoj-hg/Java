import java.io.*;

class GFG {

    // To print hollow rectangle
    static void print_rectangle(int k, int l)
    {
        int a, b;
        // Nested for loops for iterations
        // Outer loop for rows
        for (a = 1; a <= k; a++) {
            // Inner loop for columns
            for (b = 1; b <= l; b++) {
                // Condition check using logical OR operator
                // over rows and columns positions
                // if found at circumference of rectangle
                if (a == 1 || a == k || b == 1 || b == l)

                    // Print the star pattern
                    System.out.print("*");
                else

                    // Rest inside square print the empty
                    // spaces
                    System.out.print(" ");
            }

            // By now we are done with only 1 row so
            // New line
            System.out.println();
        }
    }

   }