    class Diagonaldiffernceinarr{
    public static void diagonal(int arr,int n){
    int d1=0,d2=0;
    for(int i=0;i<n;i++){
    for(int j=0;j<=n;j++)
    {
        if(i==j){
            d1+=arr[i][j];
        }
        if(i==n-j-1){
            d2+=arr[i][j];
        }
    }
    }
    return math.abs(d2-d1);
    public static void main(strings[] args){
    int arr[][]=
    {
        {11, 2, 4},
        {4 , 5, 6},
        {10, 8, -12}
    };
    int n=arr.lenght;

