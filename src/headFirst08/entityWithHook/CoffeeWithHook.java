package headFirst08.entityWithHook;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wangjize on 2025/6/10.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error occurred");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
