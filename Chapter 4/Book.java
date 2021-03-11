/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/31/19                                               
// Program name: Book                                      
// Function: Assigns information and returns it as a string           
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public class Book
{
    private String title;
    private String author;
    private String publisher;
    private String date;
    public Book(String myTitle, String myAuthor, String myPublisher, String myDate)
    {
       
        title= myTitle;
        author=myAuthor;
        publisher=myPublisher;
        date=myDate;
        
        
        
        
        
    }  
    public void setTitle (String myTitle)
{
    title = myTitle;
}
public String getTitle()
{
   return title;
}


    public void setAuthor (String myAuthor)
{
    author = myAuthor;
}
public String getAuthor()
{
   return author;
}

    public void setPublisher (String myPublisher)
{
    publisher = myPublisher;
}
public String getPublisher()
{
   return publisher;
}

    public void setDate (String myDate)
{
    date = myDate;
}
public String getDate()
{
   return date;
}

public String toString()
{
        String result = title + " is a book by ";
        result += author + ". "; 
        result += "It was published in "+ date + " by " + publisher+".";
        return result;
}
}
