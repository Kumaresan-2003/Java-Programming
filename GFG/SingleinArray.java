class UniqueinArray{
    public static void main(String[] args) {
        int [] nums={1,2,1,2,4};
        int n=nums.length;
        int num=0;
        for(int i=0;i<n;i++){
            num=num^nums[i];
        }
        System.out.print(num);
    }
}