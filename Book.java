class Book {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void displayInfo() {
        System.out.println("---- Book Information ----");
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("Year     : " + year);
        System.out.println("Borrowed : " + borrowed);
    }

    public void borrowBook() {
        setBorrowed(true);
        System.out.println(getTitle() + " borrowed successfully.");
    }

    public void returnBook() {
        setBorrowed(false);
        System.out.println(getTitle() + " returned successfully.");
    }
}
