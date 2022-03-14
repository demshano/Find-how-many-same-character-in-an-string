import java.util.Scanner;
public class Tesla {

    public static void main (String []args){


/*-----write a program to find how many same character in an string
ex: w3school, two characters of 'o'.---------*/
Scanner scan=new Scanner(System.in);
Tesla obj = new Tesla();
System.out.println("enter name: ");
String name=scan.nextLine();

System.out.print("enter the character to count: ");
char x=scan.next().charAt(0);

obj.find(name,x);

}

void find(String name, char x){
int count=0;
for(int i=0;i<name.length();i++){
if(name.charAt(i)==x){
	count++;
}
}
System.out.println(count);
}

}