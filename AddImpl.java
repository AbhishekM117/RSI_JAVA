//c) Develop a client that questions the aforementioned server object. Use the following class name, and method names:
//
//        Client Side:


import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.*;
import java.util.*;
import java.rmi.server.*;


public class AddImpl extends UnicastRemoteObject
        implements RegistryServiceInterface
{

    public AddImpl() throws RemoteException
    {
        super( );
    }

    public String record(String firstName, String lastName,
                         String phone) throws RemoteException
    {
        String res = firstName+" "+lastName+" "+phone;
        Person p = new Person(firstName,lastName,phone);
        return res;
    }

    public String find(String firstName, String lastName)
            throws RemoteException
    {
        String res = firstName+" "+lastName;
        Person p = new Person();
        return res;
    }
}
