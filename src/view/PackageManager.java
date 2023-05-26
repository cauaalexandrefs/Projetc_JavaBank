package view;

import java.io.*;
import java.util.ArrayList;

public class PackageManager {

    private final String path;

    public PackageManager() {
        this.path = "Users.txt";
    }

    public void writeObject(Object object) throws IOException, ClassNotFoundException {
        new ObjectOutputStream(new FileOutputStream(path)).writeObject(object);
    }

    public Object getObject() throws ClassNotFoundException, IOException {
        return new ObjectInputStream(new FileInputStream(path)).readObject();
    }

    public void deleteUser(User user) {
        ArrayList<User> list = new ArrayList<>();
        try {
            list = (ArrayList<User>) this.getObject();
            list.remove(list.get(findIndexOf(user)));
            this.writeObject(list);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    
    public int findIndexOf(User user) {
        ArrayList<User> list = new ArrayList<>();
        try {
            list = (ArrayList<User>) this.getObject();
            for (User element : list) {
                if (element.getCpf().equals(user.getCpf()) && element.getPassword().equals(user.getPassword())) {
                    return list.indexOf(element);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return -1;
    }
    
    public User findForCpf(String Cpf){
            
            ArrayList<User> list = new ArrayList<>();
        try {
            list = (ArrayList<User>) this.getObject();
            for (User element : list) {
                if (element.getCpf().equals(Cpf)){
                    return element;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }        
        return null;
    }

}
