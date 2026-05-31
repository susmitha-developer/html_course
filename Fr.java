
import java.util.Scanner;

class Fr{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
      /*int[] a=new int[3];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();*/
       // a[3]=60;

       int[] a=new int[3];

       for(int i=0;i<a.length;i=i+1){
        System.out.println("enter ur value:");
        a[i]=sc.nextInt();
       }

       System.out.println("------ output----");

        for(int i=0;i<a.length;i=i+1){
            System.out.println(a[i]);
        }

       
    }
}