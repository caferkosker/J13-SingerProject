import java.util.Scanner;
public class Test {
    private static Singers singers = new Singers();
    private static  Scanner scanner = new Scanner(System.in);
    public static void writeTransaction(){
        System.out.println("\t 0-View Transactions ");
        System.out.println("\t 1-View Singers ");
        System.out.println("\t 2-Add Singer ");
        System.out.println("\t 3-Update Singer ");
        System.out.println("\t 4-Delete Singer ");
        System.out.println("\t 5-Search Singer ");
        System.out.println("\t 6-Exit the Application ");
    }
    public static void view(){
        singers.writeSingers();
    }
    public static void add_Singer(){
        System.out.println("Write the name of the singer you want to add : ");
        String name = scanner.nextLine();
        singers.addSinger(name);
    }
    public static void updateSinger(){
        System.out.println("The position you want to update (1,2,3....) ");
        int position = scanner.nextInt();
        scanner.nextLine();
        String new_name = scanner.nextLine();
        singers.singerUpdate(new_name,position-1);
    }
    public static void delete(){
        System.out.println("The position you want to delete (1,2,3......)");
        int position = scanner.nextInt();
        singers.singerRemove(position-1);
    }
    public static void search(){
        System.out.println("The singer you want to search : ");
        String name = scanner.nextLine();
        singers.singerSearch(name);
    }

    public static void main (String[] args){
        System.out.println("\t Welcome to the singer application... ");
        writeTransaction();
        boolean exit = false;
        int transaction;

        while(!exit){
            System.out.println("Choose a transaction : ");
            transaction = scanner.nextInt();
            scanner.nextLine();

            switch (transaction){
                case 0:
                    writeTransaction();
                    break;
                case 1:
                    view();
                    break;
                case 2:
                    add_Singer();
                    break;
                case 3:
                    updateSinger();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the Application... ");
                    break;
            }

        }


    }
}
