package codejam;
import java.util.*;

public class SavingTheUniverseAgain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T  = Integer.parseInt(sc.nextLine());
        for(int i=0;i<T;i++){
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            int D = Integer.parseInt(tokens[0]);
            String code = tokens[1];
            int count=0;
            while(true){
                if(computeStrength(code)<=D){
                    break;
                }
                code = reorganiseCode(code);
                if(code.equals("IMPOSSIBLE")){
                    break;
                }
                count++;
            }
            if(code.equals("IMPOSSIBLE")){
                System.out.println("Case #"+(i+1)+": IMPOSSIBLE");
            }
            else{
                System.out.println("Case #"+(i+1)+": "+count);
            }
        }
    }
    
    private static String reorganiseCode(String code){
        StringBuilder sb = new StringBuilder(code);
        int flag=0;
        for(int i=code.length()-1;i>0;i--){
            if(code.charAt(i)=='S' && code.charAt(i-1)=='C'){
                sb.setCharAt(i,'C');
                sb.setCharAt(i-1,'S');
                flag=1;
                break;
            }
        }
        if(flag==0)
            return "IMPOSSIBLE";
        return sb.toString();
    }
    
    private static int computeStrength(String code){
        int i=1,dam=0;
        for(char c:code.toCharArray()){
            if('S'==c){
                dam=dam+i;
            }
            else if('C'==c){
                i=i*2;
            }
        }
        return dam;
    }
}