package Array;

public class ForEachArray {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 45;
        marks[1] = 65;
        marks[2] = 69;
        marks[3] = 69;
        marks[4] = 96;

        System.out.println("Size of Array is: " + marks.length); // size of Array length
        int position = 0;
        System.out.println("Demo of the While Loop: ");

        while (position < marks.length) {           // check the position is lesser than size
            System.out.println(marks[position]);
            position++;
        }

        System.out.println("----------------------------");
        System.out.println("Demo of th for Loop: "); // check the position is lesser than size using for loop
        //for loop demo for Array
        for(int index = 0; index < marks.length; index++)
        {
            System.out.println(marks[index]);
        }

        System.out.println("----------------------------");
        System.out.println("Demo of the For Each Loop");// check the position is lesser than using for Each Loop
        for(int element :marks)
        {
            System.out.println(element);
        }

    }

    }

