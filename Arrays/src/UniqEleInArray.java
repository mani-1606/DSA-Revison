public class UniqEleInArray {
    public int helper(int[] arr){
        int x =0;
        for(int ele : arr){
            x = x ^ ele;
        }
        return x;
    }
    private static void helper1(int i, int j){
        i = i^j;
        j= i^j;
        i = i^j;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
    static void main() {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        UniqEleInArray u = new UniqEleInArray();
        System.out.println(u.helper(arr));
        int i = 1;
        int j = 2;
        helper1(i,j);
    }
}
