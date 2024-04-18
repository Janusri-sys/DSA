import java.util.*;
class Loops{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter a number :");
        // int n=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n+"*"+i+"="+n*i);
        // }

        
        //1.Hollow rectangle
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1||i==n||j==1||j==n)
        //             System.out.print("* ");
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // 2.Half pyramid
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //3.Inverted Half pyramid
        // for(int i=n;i>=0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //4.Inverted Half pyramid(rotated by 180deg)
        // for(int i=0;i<n;i++){
        //     for(int k=0;k<=n-i-1;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Floyd's triangle
        //int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(++count+" ");
        //     }
        //     System.out.println();
        // }

        // int count=1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(i+(count)+" ");
        //     }
        //     count+=i;
        //     System.out.println();
        // }

        0 and 1 matrix
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print("1");
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
        

    }

}