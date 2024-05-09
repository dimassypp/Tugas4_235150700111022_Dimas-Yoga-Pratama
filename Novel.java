class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
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