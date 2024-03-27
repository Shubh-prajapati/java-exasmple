package Array;

public class MultiDimentioalAray {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];
        marks[0][0] = 56;
        marks[0][1] = 95;
        marks[0][1] = 98;

        marks[1][0] =66;
        marks[1][1] = 95;
        marks[1][2] = 96;

        marks[2][0] = 69;
        marks[2][1] = 36;
        marks[2][2] = 56;


        System.out.println("Size of Array is: " + marks.length); // size of Array length


        System.out.println("----------------------------");
        System.out.println("Demo of th for Loop: "); // check the position is lesser than size using for loop
        //for loop demo for Array
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }

        System.out.println("----------------------------");
        System.out.println("Demo of the For Each Loop");// check the position is lesser than using for Each Loop
        for (int row = 0; row < marks.length; row++) {
            for(int column =0; column<marks.length; column++){
                System.out.print(marks[row][column]+"\t");
            }
            System.out.println();
        }


        }
    }
