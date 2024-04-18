import java.util.*;
class SpiralOrderMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
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
        int rowStart=0;
        int colStart=0;
        int rowEnd=m-1;
        int colEnd=n-1;

        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(arr[rowStart][col]+" ");
            }
            rowStart++;
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(arr[row][colEnd]+" ");
            }
            colEnd--;
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(arr[rowEnd][col]+" ");
            }
            rowEnd--;
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(arr[row][colStart]+" ");
            }
            colStart++;
        }
    }
}