//We wish to implement a registry service that records names and phone numbers and allows the user to access them using a name.
//        The registry must be accessible remotely via RMI. We consider that the name and number are chains of characters.
//
//        a) Use the following RMI interface that responds to these specifications:

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RegistryServiceInterface extends Remote{
    public String record(String firstName, String lastName,
                         String phone) throws RemoteException;

    public String find(String firstName, String lastName)
            throws RemoteException;
}
