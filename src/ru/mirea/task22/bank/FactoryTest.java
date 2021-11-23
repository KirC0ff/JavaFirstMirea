package ru.mirea.task22.bank;
import java.util.ArrayList;
import java.util.List;

enum UserType{
    CLIENT, CURATOR, MANAGER;
}

public class FactoryTest {
    List users = new ArrayList<>();

    public void addUser(UserType type, List users){
        User tempUser = null;
        switch (type){
            case CLIENT:
                tempUser = new Client();
                users.add(tempUser);
                break;
            case CURATOR:
                tempUser = new Curator();
                users.add(tempUser);
                break;
            case MANAGER:
                tempUser = new Manager();
                users.add(tempUser);
                break;
        }
    }

    public static void main(String[] args) {
        FactoryTest test = new FactoryTest();
        List userList = new ArrayList<>();
        test.addUser(UserType.MANAGER, userList);
        test.addUser(UserType.CURATOR, userList);
        test.addUser(UserType.CURATOR, userList);
        test.addUser(UserType.CLIENT, userList);
        test.addUser(UserType.CLIENT, userList);
        test.addUser(UserType.CLIENT, userList);
        test.addUser(UserType.CLIENT, userList);

        for(int i = 0; i<userList.size(); i++){
            Object user = userList.get(i);
            System.out.println(user);
        }
    }
}
