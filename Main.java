public class Main {
    public static void main(String[] args) {
        TextBook java1 = new TextBook("Java Fundamentals", "Austin Pryo", 2023, "Programming");
        Novel meong = new Novel("Meong", "Clawdia Prameswari", 2018, "Romance");
        Magazine songBillboard = new Magazine("2021 Song Billboard", "CNN", 2021, "Music");

        java1.displayInfo();
        meong.displayInfo();
        songBillboard.displayInfo();

        System.out.println("\n---- Borrowing and Returning Books ----");
        java1.borrowBook();
        songBillboard.borrowBook();
        java1.returnBook();
        meong.returnBook();
    }
}