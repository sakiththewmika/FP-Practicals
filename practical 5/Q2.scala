case class Book(
    title: String, 
    author: String, 
    ISBN: String,
);

object libraryManagement {
    var library : Set[Book] = Set(
        Book("Book1", "Author1", "ISBN1"),
        Book("Book2", "Author2", "ISBN2"),
        Book("Book3", "Author3", "ISBN3"),
        Book("Book4", "Author2", "ISBN4"),
        Book("Book5", "Author5", "ISBN5"),
    );

    def addBook(book: Book) : Unit = {
        library += book;
        println(book.title + "(" + book.ISBN + ")" + " Book added successfully");
    }

    def removeBook(ISBN : String) : Unit = {
        library.find(_.ISBN == ISBN) match {
            case Some(book) => {
                library -= book;
                println(book.title + "(" + book.ISBN + ")" + " Book removed successfully");
            }
            case None => println("Book not found in the library");
        }
    }

    def bookInLibrary(ISBN : String) : Unit = {
        library.find(_.ISBN == ISBN) match {
            case Some(book) => println(book.title + "(" + book.ISBN + ")" + " Book found in the library");
            case None => println("Book not found in the library");
        }
    }

    def displayLibrary() : Unit = {
        println("Books in the library");
        library.foreach(book => println("Title : " + book.title + ", Author : " + book.author + ", ISBN : " + book.ISBN));
    }

    def searchByTitle(title : String) : Unit = {
        library.find(_.title == title) match {
            case Some(book) => println("Title : " + book.title + ", Author : " + book.author + ", ISBN : " + book.ISBN);
            case None => println("Book not found in the library");
        }
    }

    def displayBokksByAuthor(author : String) : Unit = {
        val booksByAuthor = library.filter(_.author == author);
        if(booksByAuthor.isEmpty){
            println("No books found by " + author);
        }
        else{
            println("Books by " + author);
            booksByAuthor.foreach(book => println("Title : " + book.title + ", Author : " + book.author + ", ISBN : " + book.ISBN));
        }
    }

    def main(args: Array[String]) : Unit = {
        addBook(Book("Book6", "Author6", "ISBN6"));
        displayLibrary();
        removeBook("ISBN6");
        bookInLibrary("ISBN6");
        searchByTitle("Book1");
        displayBokksByAuthor("Author2");
    }
}