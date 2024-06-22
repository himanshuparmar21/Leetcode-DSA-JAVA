package GeekForGeeks;

public class ExtractTheNumberfromtheString {
    public static void main(String[] args) {
        System.out.println(ExtractNumber("This is alpha 5057 and 97"));
    }
    static long ExtractNumber(String sentence) {
        String[] s = sentence.split(" ");
        long num = Long.MIN_VALUE;
        for(String temp : s){
            if(Character.isDigit(temp.charAt(0))){
                if(!temp.contains("9")){
                    num = Math.max(Long.parseLong(temp),num);
                }
            }
        }
        return num;
    }
}
