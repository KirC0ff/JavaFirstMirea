package ru.mirea.task21.bank;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    List<Client> clients = new ArrayList<>();
    List<Manager> managers = new ArrayList<>();

    public GenericsTest(int countOfClients, int countOfManagers){
        for(int i=0; i<countOfClients; i++){
            Client a = new Client((int)(Math.random()*1000000));
            a.addCash((int)(Math.random()*10000));
            a.addDeposit((int)(Math.random()*10000));
            a.addCredit((int)(Math.random()*50000));
            clients.add(a);
        }
        for(int i=0; i<countOfManagers; i++){
            Manager b = new Manager((int)(Math.random()*1000000));
            b.setSalary(1000+(int)(Math.random()*1000));
            managers.add(b);
        }
    }

    public static void main(String[] args){
        GenericsTest test = new GenericsTest(10, 3);
        for(Manager manager : test.managers){
            System.out.println(manager);
        }
        for(Client client : test.clients){
            System.out.println(client);
        }
    }
}
