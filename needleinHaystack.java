import java.util.Scanner;

public class needleinHaystack {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Haystack:");
        String haystack=sc.nextLine();
        System.out.println("Enter a needle:");
        String needle=sc.nextLine();
        int position = haystack.indexOf(needle);
        if (position == -1){
            System.out.println("Not found Needle in a Haystack !");
        }
        else{
            System.out.println("Found the Needle at:"+position);
        }
    }
}
