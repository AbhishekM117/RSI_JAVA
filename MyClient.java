
import java.rmi.*;
import java.util.Scanner;

public class MyClient
{
    private Scanner keyboard = null;
    RegistryServiceInterface h = null;

    public static void main(String args[])
    { //This method is complete, do not change it. Use it.
        new MyClient();
    }

    public MyClient()
    { //This constructor is complete, do not change it. Use it.
        try
        {
            int port = 16790;
            String host = "localhost";
            String registryURL = "rmi://" + host + ":" + port + "/hello";
            h = (RegistryServiceInterface)Naming.lookup(registryURL);
            keyboard = new Scanner(System.in);
            while(true)
            {
                System.out.print(
                        "Enter 1 to add a name, 2 to find a phone #, 3 to end:");
                int choice = keyboard.nextInt();
                while(choice < 1 || choice > 3)
                {
                    System.out.println("Please only enter 1 , 2, or 3.");
                    choice = keyboard.nextInt();
                }
                if(choice == 3)
                    System.exit(0);
                if(choice == 1)
                    add();
                else
                    find();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void add() throws RemoteException { //Complete this method.

        System.out.println("First name, last name, and phone number separated by space: ");

        String name = keyboard.next();
        String[] splited = name.split("\\s+");
        if (splited.length == 3) {
//            Person p = new Person(splited[0], splited[1], splited[2]);
            AddImpl addImpl = new AddImpl();
            String record = addImpl.record(splited[0], splited[1], splited[2]);
        }else {
            add();
        }
    }

    private void find()
    { //Complete this method.
        System.out.println("First Name, and last name, separated by space: ");

        String name = keyboard.next();
        String[] splited = name.split("\\s+");
        for (int i = 0; i < splited.length; i++) {

        }
    }
}
