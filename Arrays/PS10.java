public class PS10 {
    public static void main(String[] args) {
        // Identity matrix 
        int r=0,c=0;
        boolean flag=false;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j && arr[i][j]==1){
                    flag=true;
                }
                else{
                    flag=false;
                }
            }
        }
        if(flag==false){
            System.out.println("Not Identity matrix");
        }
        else{
            System.out.println("Identity matrix");
        }
    }
}
