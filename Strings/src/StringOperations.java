public class StringOperations {
    public static void main(String[] args){
        String str = new String("markram");
        System.out.println(str.indexOf('u'));
        System.out.println(str.charAt(2));
        System.out.println(str.lastIndexOf('m'));
        SubStrings(str);
    }
    public static boolean palindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left <= right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static void SubStrings(String str ){
        int n = str.length();
        for(int i =0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
