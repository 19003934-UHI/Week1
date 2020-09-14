import java.util.Arrays;

class BubbleSort
{
    static void bubbleSort(int[] Array)
    {
        int n = Array.length; // find length of array 
        int newPosition = 0; // declare newPosition ready for use in the sorting method

            for (int i = 0; i < n; i++) // so long as i is less than the length of array, keep comparing
            {
                for(int p = 1; p < (n-i); p++) // finds the position of a number in array, so long as o is less than the sum of array length - i, keep comparing
                {
                    if(Array[p-1] > Array[p])
                    {
                        // swap elements
                        newPosition = Array[p-1]; 
                        Array[p-1] = Array[p];
                        Array[p] = newPosition;
                    }

                }
            }

    }

public static void main(String[] args)
    {
        int[] Array = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        
        System.out.println("Array before bubble sort");
        System.out.println(Arrays.toString(Array));
        

        bubbleSort(Array); // call bubbleSort method and apply it to the unordered array.

        System.out.println("Array after bubble sort");
        for(int i = 0; i < Array.length; i++)
        {
            System.out.println((Array[i]));
        }
    }

}