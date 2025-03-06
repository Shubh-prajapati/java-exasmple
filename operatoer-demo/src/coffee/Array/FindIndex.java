package coffee.Array;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={12,1,5,3,1,44,545,2};
        System.out.println("Enter the Value to Be Search ");
        int value=sc.nextInt();

        boolean flag=false;
        int i;
        for(i=0; i<a.length; i++){
            if(a[i]==value){
                flag=true;
                break;
            }
        }

        if (flag==true){
            System.out.println("The value if found at"+i+"tn Index");
        }
        else{
            System.out.println("Element not Found!");
        }
    }
}
