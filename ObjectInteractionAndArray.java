class Book {
    private int bookId;
    private String title;
    private double price;
    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public void displayInfo() {
    System.out.println("Book ID: " + bookId + ", Title: " + title + ", Price: " + price);
    }
}
public class ObjectInteractionAndArray {
public static void main(String[] args) {
    Book[] books = new Book[5];
    books[0] = new Book(101, "Java Programming", 450);
    books[1] = new Book(102, "Data Structures", 600);
    books[2] = new Book(103, "Algorithms", 750);
    books[3] = new Book(104, "Database Systems", 500);
    books[4] = new Book(105, "Operating Systems", 650);
    System.out.println("Books with price greater than 500:");
    for (Book b : books) {
    if (b.getPrice() > 500) {
        b.displayInfo();
        }
        }
        double total = 0;
        for (Book b : books) {
        total += b.getPrice();
        }
        double average = total / books.length;
        System.out.println("\nAverage price of all books: " + average);
    }
}
