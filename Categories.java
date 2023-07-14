import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Categories{
    Hashtable<String, LinkedList<String>> three = new Hashtable<>();
    int counter = 0;

    public void classify(String input) {
        String mail = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        String phone = "^([+]?[\\s0-9]+)?(\\d{3}|[(]?[0-9]+[)])?([-]?[\\s]?[0-9])+$";
        String date = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";

        LinkedList<String> mails = new LinkedList<>();       
        LinkedList<String> phones = new LinkedList<>();
        LinkedList<String> dates = new LinkedList<>();

        int mailcont = 0;
        int phonocont = 0;
        int datescont = 0;

        three.put("mail", mails);
        three.put("phone", phones);
        three.put("date", dates);
        
        Pattern mailpat = Pattern.compile(mail);
        Pattern phonepat = Pattern.compile(phone);
        Pattern datepat = Pattern.compile(date);

        Matcher mailmatch = mailpat.matcher(input);
        while (mailmatch.find()) {
            String mailo = mailmatch.group();
            three.get("mail").add(mailo);
            mailcont++;
        }

        Matcher phonematch = phonepat.matcher(input);
        while (phonematch.find()) {
            String phono = mailmatch.group();
            three.get("phone").add(phono);
            phonocont++;
        }

        Matcher datematch = datepat.matcher(input);
        while (datematch.find()) {
            String dato = datematch.group();
            three.get("date").add(dato);
            datescont++;
        }

    }

    public void printPhones() {
        
    }

    public void printDates() {
        
    }

    public void countByCategory() {
        
    }
}


