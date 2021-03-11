import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int clicks=0;
        int x1;
        int y1;
        int x2;
        int y2;
        Scanner sc =new Scanner(System.in);
        Troops board = new  Troops();
	board.fillTroops();

        System.out.println(board.toString());
    while (true){
        System.out.println("enter x1");
        x1=sc.nextInt();
        System.out.println("enter y1");
        y1=sc.nextInt();
        System.out.println("enter x2");
        x2=sc.nextInt();
        System.out.println("enter y2");
        y2=sc.nextInt();
        board.moveTroop(x1,y1,x2,y2);
        System.out.println(board.toString());
        System.out.println("Next Player");
    }
    }
}
