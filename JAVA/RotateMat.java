import java.util.Scanner;
class RotateMat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        int[][] trans=new int[n][m];
        int[][] rotate=new int[n][m];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         trans[i][j]=arr[j][i];
        //     }
        // }
        // System.out.println("Transposed matrix");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(trans[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("Rotated matrix");
        // for(int i=0;i<n;i++){
        //     for(int j=m-1,k=0;j>=0 && k<m;j--,k++){
        //         rotate[i][k]=trans[i][j];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(rotate[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<m;i++){
            for(int j=0,k=n-1;j<n && k>=0;j++,k--){
                rotate[i][j]=arr[k][i];
            }
        }
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
                 System.out.print(rotate[i][j]+" ");
             }
             System.out.println();
         }

    }
}