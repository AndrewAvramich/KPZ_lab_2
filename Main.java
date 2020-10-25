public class Main{
      
    public static void main(String[] args) {
         
        Book book1 = new Book("some name 1", 2001, "Vasserman", "test desc 1");
        Book book2 = new Book("some name 2", 2019, "London", "test desc 2");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        
    }
}


final class Book implements Cloneable,Comparable<Book>{

    public String Name;
    public int Year;
    public String Author;
    public String Description;

    Book(String name,int year,String author,String description){
        this.Author = author;
        this.Description = description;
        this.Name = name;
        this.Year = year;
    }
    Book(){}
    

    public String getName(){
        return this.Name;
    }

    public boolean equals(Book book) {
        return this.Name ==  book.Name;
    }

    public Object clone()
    {
      Book book = new Book();
      book.Author = this.Author;
      book.Description = this.Description;
      book.Name = this.Name;
      book.Year = this.Year;
      return book;
    }

    @Override
    public int hashCode() {
      int result = Name.hashCode();
      result = result + Year;
      return result;
    }

    @Override
    public String toString()
    {
        return "Name is: " + this.Name + " Is about: " + this.Description + "  written by: " + this.Author;
    }

    @Override
    public int compareTo(Book o) {
        return Name.compareTo(o.getName());
    }


}











