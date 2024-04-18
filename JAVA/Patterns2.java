class Patterns2{
    public static void main(String[] args){
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(n%2==0){
                    int ans=n-i+1;
                }
                else{
                    int ans=n-i;
                }
                if(i==1||i==n||j==1||j==n||(i>=n/2+1 && (i+j)==n+1)||(i==n/2+1 && j>=n/2)||(i>=n/2+1 && j==n/2)){
                    System.out.print("* ");
                }
                else if(i>=n/2+2 && j>=n/2+1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Square diagonal
        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n||i==j||((i+j)==n+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n||i==j||(i+j)==n+1){
                    System.out.print("* ");
                }
                else if((j>i && j<=n-i)||(i>=n/2+2 && j<i && j>n-i+1)){
                    System.out.print("# ");
                }
                else{
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }

        System.out.println();
        char[] a={'#','@','$'};
        int evenCount=0,oddCount=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<7;j++){
                    if(j%2==0){
                        evenCount+=2;
                        System.out.print(evenCount+" ");
                    }
                    else{
                        System.out.print(a[(i+j)%3]+" ");
                    }
                }
            }
            else{
                for(int j=0;j<7;j++){
                    if(j%2==0){
                        System.out.print(oddCount+" ");
                        oddCount+=2;
                    }
                    else{
                        System.out.print(a[(i+j)%3]+" ");
                    }
                }
            }
            System.out.println();
        }

    }
}