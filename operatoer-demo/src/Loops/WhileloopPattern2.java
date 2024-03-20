package Loops;
//              #
//            # #
//          # # #
//        # # # #
//      # # # # #
public class WhileloopPattern2 {
    public static void main(String[] args) {
        int row=1;
        while (row<=5){
            int column=row;

            while(column <5)
            {
                System.out.print("\t");
                column++;
            }

            int character =1;
            while(character <=row){
                System.out.print("#\t");
                character++;
            }
            System.out.println();
            row++;
        }
    }
}
