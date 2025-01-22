package Progress_250122;

public class WrapperTest1 {
    public static void main(String[] args) {
    String str1 = "10";
    String str2 = "20";
    
    String [] Strs  = {str1,str2};
    int sum = 0 ;
        for (String str : Strs) {
            sum += Integer.parseInt(str);
        }
        System.out.println("sum = " + sum);
    }  
}