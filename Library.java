class Library {
    class Book {
        private String bookName;
        private String author;

        public Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }
        public void displayDetails() {
            System.out.println("Book Name: " + bookName);
            System.out.println("Author: " + author);
        }
    }
    public static void main(String[] args) {
        Library library = new Library();
        Library.Book book1 = library.new Book("The Life of Pi", "Yann Martel");
        Library.Book book2 = library.new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayDetails();
        book2.displayDetails();
    }
}
