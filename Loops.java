package Java_Lessons;

public class Loops {
    public static void main(String[] args) {
        System.out.println("This is being printed by the for loop");
        for(int i=0;i<5;++i){
            System.out.print(i+" ");
        }
        System.out.println("\nThis is being printed by the while loop");
        int i=0;
        while(i<5){
            System.out.print(i+" ");
            ++i;
        }
        System.out.println("\nThis is being printed by the do while loop");
        i=0;
        do{
            System.out.print(i+" ");
            ++i;
        }while(i<5);
    }
}
