import java.util.Arrays;
import java.util.Random;

public class Main {

    static  String[] completed = new String[0];
    static int completedI = 0;

    public static void main(String[] args)
    {
        long startTime;
        long elapsedTime;

        System.out.println("Question 1:");
        int[] a = new int[10];

        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            a[i] = rand.nextInt(21) - 10;

        System.out.println("Unsorted Array: " + Arrays.toString(a));
        peakValley(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));

        System.out.println();

        System.out.println("Question 2:");

        boolean success;
        String[] p = new String[]{"a", "b", "c", "d", "e", "f"};
        String[][] d = new String[][] {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"},
        };

        startTime = System.currentTimeMillis();
        success = buildOrder(p, d);
        elapsedTime = System.currentTimeMillis() - startTime;

        if (success){
            System.out.println(p.length + " projects with " + d.length + " dependencies");
            System.out.println("Valid Build Order: " + Arrays.toString(completed) + " in " + elapsedTime + " milliseconds");
        } else {
            System.out.println("No Valid Build Path. " + elapsedTime + " milliseconds");
        }
        System.out.println();

        completedI = 0;
        d = new String[][] {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"},
        };

        startTime = System.currentTimeMillis();
        success = buildOrder(p, d);
        elapsedTime = System.currentTimeMillis() - startTime;

        if (success){
            System.out.println(p.length + " projects with " + d.length + " dependencies");
            System.out.println("Valid Build Order: " + Arrays.toString(completed) + " in " + elapsedTime + " milliseconds");
        } else {
            System.out.println("No Valid Build Path. " + elapsedTime + " milliseconds");
        }
        System.out.println();


        completedI = 0;
        p = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        d = new String[][] {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "h"},
                {"a", "i"},
                {"f", "e"},
                {"i", "d"},
                {"f", "a"},
                {"j", "c"},
        };

        startTime = System.currentTimeMillis();
        success = buildOrder(p, d);
        elapsedTime = System.currentTimeMillis() - startTime;

        if (success){
            System.out.println(p.length + " projects with " + d.length + " dependencies");
            System.out.println("Valid Build Order: " + Arrays.toString(completed) + " in " + elapsedTime + " milliseconds");
        } else {
            System.out.println("No Valid Build Path. " + elapsedTime + " milliseconds");
        }
        System.out.println();

    }

    /* Code for Solving Question 1 */
    static void peakValley (int[] array)
    {
        int minPointer, maxPointer;

        for (int i = 0; i < array.length - 1; i++)
        {
            if (i % 2 == 0)
            {
                maxPointer = findMax(array, i);
                swap (array, i, maxPointer);
            } else {
                minPointer = findMin(array, i);
                swap (array, i, minPointer);
            }
        }
    }

    static void swap(int[] array, int a, int b)
    {
        int temp = array [a];
        array[a] = array[b];
        array[b] = temp;
    }

    static int findMax (int[] array, int pt)
    {
        int maxIndex = pt;
        for (int i = pt + 1; i < array.length; i++)
            if (array[maxIndex] < array[i])
                maxIndex = i;

        return maxIndex;
    }

    private static int findMin(int[] array, int pt)
    {
        int minIndex = pt;
        for (int i = pt + 1; i < array.length; i++)
            if (array[minIndex] > array[i])
                minIndex = i;

        return minIndex;
    }

    /* Code for solving Question 2 */
    static boolean buildOrder (String[] projects, String[][] dependencies)
    {
        completed = new String[projects.length];
        boolean possible = false;

         // Check for projects that have no dependencies
        for (int i = 0; i < projects.length; i++)
        {
            boolean conditions = false;
            for (int j = 0; j < dependencies.length; j++)
                if (projects[i] == dependencies[j][1])
                {
                    conditions = true;
                    break;
                }
            if (!conditions)
            {
                System.out.print("");
                completed[completedI] = projects[i];
                completedI++;
                possible = true;
            }
        }

        // If there are no projects that do not have a dependency, throw an exception
        if (!possible)
            return false;

        for (int i = 0; i < completedI; i++)
            findRequ(dependencies, completed[i]);

        // If completed is not full, throw an exception
        if (completedI < completed.length)
            return false;

        return true;
    }

    // Traverse the dependants of each target, then recursively call the dependants of that dependant
    static void findRequ(String[][] d, String target)
    {
        for (int i = 0; i < d.length; i++)
        {
            if (d[i][0] == target)
            {
                d[i][0] = null;

                int onlyRequ = 0;
                for (int j = 0; j < d.length; j ++)
                    if (d[i][1] == d[j][1])
                        onlyRequ ++;

                if (onlyRequ == 1)
                {
                    completed[completedI] = d[i][1];
                    completedI++;
                }

                findRequ(d, d[i][1]);

                d[i][1] = null;
            }
        }
    }
}
