import java.util.*;
class Patterns{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        //Butterfly
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }


    //Solid rhombus
    for(int i=0;i<n;i++){
        for(int k=0;k<=i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print(" * ");
        }
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print(" * ");
        }
        System.out.println();
        }
    for(int i=n;i>=0;i--){
        for(int k=0;k<=i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print(" * ");
        }
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print(" * ");
        }
        System.out.println();
        }

        //Hollow rhombus

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }

        //Pyramid
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        System.out.println();
        }

        //Palindrome pattern
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();
        }

        //Diamond
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
        System.out.println();
        }

        int row=6,col=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==col||i==row||j==0||j==6){
                    System.out.print(row+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}