import java.util.Scanner;
class Age{
    public static void main (String arg[]){
Scanner one=new Scanner(System.in);
//System.out.println("want to calculate your age ");

int dob;
int current;


System.out.println("input your dob");
dob=one.nextInt();

System.out.println("input your current year");
current=one.nextInt();


int result=current-dob;

System.out.println("your age is:"+result);
    }

}