import java.util.HashSet;

public class UniqueEmails {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("alice@example.com");
        emails.add("bob@example.com");
        emails.add("alice@example.com"); // duplicate

        System.out.println("Unique Emails:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}

