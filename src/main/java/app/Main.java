package app;

import me.legrange.haveibeenpwned.Breach;
import me.legrange.haveibeenpwned.HaveIBeenPwndApi;
import me.legrange.haveibeenpwned.HaveIBeenPwndException;

import java.util.List;

public class Main {

    public static void main(String[] args) throws HaveIBeenPwndException {
        HaveIBeenPwndApi hibp = new HaveIBeenPwndApi("My-A-Pwnage-Testing-App");
        List<Breach> breaches = hibp.getAllBreachesForAccount("youremail@goes.here");
        for(Breach breach: breaches) {
            System.out.println(breach.toString());
        }

    }

}
