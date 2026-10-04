public class LargeEleInArray {
    public int helper(int[] a){
        int op = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]> op) op = a[i];
        }
        return op;
    }
    public static void main(String[] args){
        int[] a = {99,102,87,55,22,54};
        LargeEleInArray l = new LargeEleInArray();
        System.out.println(l.helper(a));
    }
}
