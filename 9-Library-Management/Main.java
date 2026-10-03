import java.util.*;
class Book {
    private String bookId;
    private String title;
    private boolean available;
    private Member borrowedBy;
    Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.available = true;
        this.borrowedBy = null;
    }
    String getBookId() {
        return bookId;
    }
    String getTitle() {
        return title;
    }
    boolean isAvailable() {
        return available;
    }
    boolean issueBook(Member member) {
        if (!available) {
            return false;
        }
        available = false;
        borrowedBy = member;
        return true;
    }
    boolean returnBook(Member member) {
        if (borrowedBy != member) {
            return false;
        }
        available = true;
        borrowedBy = null;
        return true;
    }
}
abstract class Member {
    protected String memberId;
    protected String name;
    protected ArrayList<Book> borrowedBooks;
    Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }
    abstract int getBorrowingLimit();
    boolean borrowBook(Book book) {
        if (borrowedBooks.size() >= getBorrowingLimit()) {
            return false;
        }
        if (!book.isAvailable()) {
            return false;
        }
        if (book.issueBook(this)) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }
    boolean returnBook(Book book) {
        if (!borrowedBooks.contains(book)) {
            return false;
        }
        if (book.returnBook(this)) {
            borrowedBooks.remove(book);
            return true;
        }
        return false;
    }
    int getBorrowedCount() {
        return borrowedBooks.size();
    }
}
class StudentMember extends Member {
    StudentMember(String memberId, String name) {
        super(memberId, name);
    }
    @Override
    int getBorrowingLimit() {
        return 2;
    }
}
class FacultyMember extends Member {
    FacultyMember(String memberId, String name) {
        super(memberId, name);
    }
    @Override
    int getBorrowingLimit() {
        return 5;
    }
}
class GuestMember extends Member {
    GuestMember(String memberId, String name) {
        super(memberId, name);
    }
    @Override
    int getBorrowingLimit() {
        return 1;
    }
}
class Library {
    private ArrayList<Book> books;
    Library() {
        books = new ArrayList<>();
    }
    void addBook(Book book) {
        books.add(book);
    }
    Book findBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
    void borrowBook(Member member, String bookId) {
        Book book = findBook(bookId);

        if (book != null && member.borrowBook(book)) {
            System.out.println("Borrowed: " + book.getTitle());
        }
        else if (member.getBorrowedCount() >= member.getBorrowingLimit()) {
            System.out.println("Borrow failed: Borrowing limit reached");
        }
        else {
            System.out.println("Borrow failed: Book unavailable");
        }
    }
    void returnBook(Member member, String bookId) {
        Book book = findBook(bookId);

        if (book != null && member.returnBook(book)) {
            System.out.println("Returned: " + book.getTitle());
        }
        else {
            System.out.println("Return failed");
        }
    }
}
class Librarian {
    private String name;

    Librarian(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Library library = new Library();

        for (int i = 0; i < n; i++) {
            String bookId = sc.next();
            String title = sc.next();

            Book book = new Book(bookId, title);
            library.addBook(book);
        }
        String memberType = sc.next();
        String memberId = sc.next();
        String memberName = sc.next();
        Member member;

        if (memberType.equals("STUDENT")) {
            member = new StudentMember(memberId, memberName);
        }
        else if (memberType.equals("FACULTY")) {
            member = new FacultyMember(memberId, memberName);
        }
        else {
            member = new GuestMember(memberId, memberName);
        }
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            String bookId = sc.next();

            if (operation.equals("BORROW")) {
                library.borrowBook(member, bookId);
            }
            else if (operation.equals("RETURN")) {
                library.returnBook(member, bookId);
            }
        }
        System.out.println("Books Borrowed: " + member.getBorrowedCount());
        sc.close();
    }
}