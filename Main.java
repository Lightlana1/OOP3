package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String userString(String msg){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }

    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }

    public static void main(String[] args) {

        ArrayList<Node> tree = new ArrayList<>(); // создаём список для занесения родственных связей
        ArrayList<Person> person = new ArrayList<>(); // создаем список для внесения данных о персонах

        Person alice = new Person("Алиса", "Иванова", "75");
        Person ivan = new Person("Иван", "Иванов", "75");
        Node generation1 = new Node(alice, Status.жена, ivan); // Иван муж Алисы
        tree.add(generation1);
        Node generation11 = new Node(ivan, Status.муж, alice); // Алиса жена Ивана
        tree.add(generation11);
        person.add(alice);
        person.add(ivan);

        Person oksana = new Person("Оксана", "Петрова", "48");
        Person denis = new Person("Денис", "Петров", "48");
        Node generation2 = new Node(denis, Status.муж, oksana); // Денис муж Оксаны
        tree.add(generation2);
        Node generation21 = new Node(oksana, Status.жена, denis); // Оксана жена Дениса
        tree.add(generation21);
        Node generation6 = new Node(alice, Status.родитель, oksana); // Алиса родитель Оксаны
        tree.add(generation6);
        Node generation61 = new Node(ivan, Status.родитель, oksana);// Иван родитель Оксаны
        tree.add(generation61);
        Node generation62 = new Node(oksana, Status.ребенок, alice); // Оксаны ребенок Алисы
        tree.add(generation62);
        Node generation63 = new Node(oksana, Status.ребенок, ivan);// Оксаны ребенок Ивана
        tree.add(generation63);
        person.add(oksana);
        person.add(denis);

        Person igor = new Person("Игорь", "Иванов", "43");
        Person anna = new Person("Анна", "Иванова", "43");
        Node generation3 = new Node(anna, Status.жена, igor); // Анна жена Игоря
        tree.add(generation3);
        Node generation31 = new Node(igor, Status.муж, anna); // Игорь муж Анны
        tree.add(generation31);
        Node generation4 = new Node(alice, Status.родитель, igor); // Алиса родитель Игоря
        tree.add(generation4);
        Node generation5 = new Node(ivan, Status.родитель, igor);// Иван родитель Игоря
        tree.add(generation5);
        Node generation52 = new Node(igor, Status.ребенок, alice); // Игорь ребенок Алисы
        tree.add(generation52);
        Node generation53 = new Node(igor, Status.ребенок, ivan);// Игорь ребенок Ивана
        tree.add(generation53);
        person.add(igor);
        person.add(anna);

        int numParametr = userInput("Выберите, что вас интересует: \n 1. Показать информацию о возрасте персоны " +
                "\n 2. Показать информацию о  родственниках персоны ");
        if (numParametr == 1){
            String stringSearch = userString("Для получения информации введите имя: ");
            for( Person p : person){
                if(p.getName().equalsIgnoreCase(stringSearch)){
                    p.printInfoPerson();
                    System.out.println(" ");
                }

            }
        } else if (numParametr == 2){
            String stringSearch = userString("Для получения информации введите имя: ");
            for( Node t : tree){
                if(t.p1.getName().equalsIgnoreCase(stringSearch)){
                    t.printInfo();
                    System.out.println(" ");
                }
            }
        }
        else {
            System.out.println("Вы ввели неверное значение");
        }



    }
}
