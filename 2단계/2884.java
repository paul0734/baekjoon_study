import java.util.Scanner;

public class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if(m>=45){
             System.out.println(h + " " + (m-45));   
        }
        else{
            h--;
            m = 60 - (45 - m);
            if(h<0) {
                h=23;
            }
            System.out.println(h + " " + m);
        }
    }
}
