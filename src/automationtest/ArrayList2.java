package automationtest;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Selenium");
        list.add("Java");
        list.add("Postman");
        list.add("Cucumber");
        list.add("Scrum");
        list.add("Jira");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
