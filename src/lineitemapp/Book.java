package lineitemapp;

public class Book extends Product{
    
    private String author;
    
    public Book()
    {
        super();
        author = "";
        count++; //update count in the Product superclass
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
        
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +
            "Author:      " + author + "\n";
    }
    
}
