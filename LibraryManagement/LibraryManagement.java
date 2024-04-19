package LibraryManagement;

import java.util.*;

public class LibraryManagement {
    private static final String UNIVERSAL_PASSWORD = "LibManPT2024"; // The Universal Password
    private static final LinkedList<Book> books = new LinkedList<>();
    private static final LinkedList<User> users = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static class Book {
        private String name;
        private String author;
        private String category;
        private int availabilityCount;
        private int price;

        Book(String name, String author, String category, int price) {
            this.name = name;
            this.author = author;
            this.category = category;
            this.price = price;
            this.availabilityCount = 0;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public String getCategory() {
            return category;
        }

        public int getPrice() {
            return price;
        }
    }

    static class User {
        private boolean admin;
        private String password;
        private String username;
        private Book issuedBook;

        User(String username, String password) {
            this.admin = false;
            this.username = username;
            this.password = password;
            this.issuedBook = null;
        }

        public String getUsername() {
            return username;
        }
    }

    static void addBook(String name, String author, String category, int price) {
        Book newBook = new Book(name, author, category, price);
        books.add(newBook);
        System.out.println("New Book Added");
    }

    static void listBooks() {
        System.out.println("\nThe Available Books Are:");
        for (Book book : books) {
            System.out.println(book.getName() + " by " + book.getAuthor() + " of category " +
                    book.getCategory() + " worth " + book.getPrice() + " Rupees.");
        }
    }

    static void addUser(String username, String password) {
        User newUser = new User(username, password);
        System.out.print("Is the User an Admin? Enter Yes/No : ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            String enteredPassword;
            do {
                System.out.print("Enter The Universal Password : ");
                enteredPassword = scanner.next();
                if (enteredPassword.equals(UNIVERSAL_PASSWORD)) {
                    newUser.admin = true;
                    users.add(newUser);
                    System.out.println("Admin User Added Successfully");
                    break;
                } else {
                    System.out.println("Wrong Password");
                }
            } while (true);
        } else {
            users.add(newUser);
            System.out.println("User Added Successfully");
        }
    }

    public static void main(String[] args) {
        addBook("OS Concepts", "Galvin", "Engineering", 789);
        addBook("Humpty Dumpty", "Lewis Carroll", "Kids", 78);
        listBooks();
        addUser("Shashank", "1234");
    }
}
