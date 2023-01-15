public class Book {
    private final String bookName;
    private final Author author;
    private int publishDate;
    public Book(String bookName, Author author, int publishDate) {
        this.bookName = bookName;
        this.author = author;
        this.publishDate = publishDate;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(int publishDate) {this.publishDate = publishDate;}
}
