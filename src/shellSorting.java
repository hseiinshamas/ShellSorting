import java.util.Arrays;

public class shellSorting {
    public static void main(String[] args) {


         /*
 Shell sorting example =
  */

        int[] a = { 23, 29, 15, 19, 31 ,7 ,9 , 5 , 2}; // initializing the array.
        int length = a.length;

        int[] temp = new int[a.length]; // creating a temporary array, if swapping takes place.

        int gap, i, j;
        for (gap = length/ 2; gap >= 1; gap /= 2) { // outer loop, we gap 1 is reached we break out this loop.

            for (j = gap; j < length; j++) { // inner loop to increment the gap.

                for (i = j - gap; i >= 0; i -= gap) { // inner loop to increment i, which is the first element in the array.

                    if (a[i + gap] > a[i]) { // we're checking if the element at gap (4 in this case)
                                            // greater than the first one, than don't swap, and break
                        break;
                        }

                    else
                        // if it's not, then swapping should take place, and we swap these elements.

                        temp[i] = a[i + gap];
                    a[i + gap] = a[i];
                    a[i] = temp[i];


                    }
                }
            }
            System.out.println(Arrays.toString(a));
    }
}
