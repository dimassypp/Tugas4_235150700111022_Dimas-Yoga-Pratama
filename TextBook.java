class TextBook extends Book {
    private String subject;

    public TextBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }
    @Override
    public void borrowBook() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println(getTitle() + " borrowed successfully.");
        } else {
            System.out.println(getTitle() + " is already borrowed.");
        }
    }
    
    @Override
    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println(getTitle() + " returned successfully.");
        } else {
            System.out.println(getTitle() + " is not borrowed.");
        }
    }
}