package basic.flow;

import java.util.ArrayList;
import java.util.List;

public class JavaControlFlow {

    private static abstract class PersonJava { public int pay = 0; }
    private static class WorkerJava extends PersonJava { public int pay = 1000; }
    private static class BossJava extends PersonJava { public int pay = 2000; }
    private static class CleanerJava extends PersonJava { public int pay = 1300; }

    public static void main(String[] args) {

        // if
        String name = "Name";
        String uppercase = name;
        if (name.length() > 5) {
            uppercase = name.toUpperCase();
        }
        uppercase = name.length() > 5 ? name.toUpperCase() : name;

        // switch on simple value
        Boolean isOk = false;
        switch (name.length()) {
            case 1:
                System.out.println("Length is 1");
                isOk = false;
                break;
            case 2:
            case 3:
                System.out.println("Length is 2 or 3");
                isOk = true;
                break;
            case 4:
                System.out.println("Length is 4");
                isOk = false;
                break;
            default:
                System.out.println("Length is >4");
                isOk = true;
                break;
        }

        List<PersonJava> people = new ArrayList<>();
        people.add(new WorkerJava());
        people.add(new BossJava());
        people.add(new CleanerJava());
        people.add(new WorkerJava());

//        people.forEach(person -> JavaControlFlow.processPerson(person));


    }

//    public static void processPerson(PersonJava person) {
//        switch (person) {
//            case person instanceof WorkerJava:
//                System.out.println("Worker");
//                person.pay *= 1.1;
//                break;
//            case person instanceof BossJava:
//                System.out.println("Boss");
//                person.pay *= 0.9;
//                break;
//            case person instanceof CleanerJava:
//                System.out.println("Cleaner");
//                person.pay *= 1.2;
//                break;
//            default:
//                System.out.println("It it a person?");
//                break;
//        }
//    }

}
