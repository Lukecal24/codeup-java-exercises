package AbstractAndInterfaceLecture;

abstract class Media {

    protected String newspapers;
    protected String books;
    protected String microfiche;
    protected String magazines;
    protected String records;
    protected String cds;

    public void checkout(){
        System.out.println("was checked out..");
    }

    public abstract void play();


}


/*


================================= INTERFACE MINI EXERCISE
Consider the library scenario from the previous mini-exercise.
Consider the following abstract class: Person
Person could be extended in these sub-types
  Librarian
  Archivist
  Patron
  Researcher
  etc.
Between Media and Person, what are some common interfaces that may exist? In other words, what are some things that can be done with or done to both Media and Person? Yet another way of considering the relationship between these two ideas: in what ways can you interact with
both a Person and form of Media in a library the same way?
For each shared aspect/way to interface with/interact with, create an interface. Define methods (no implementation) that one could expect
to do when interfacing with both a Person and a form of Media.
BONUS: consider the abstract class LibraryFurniture. What are additional interfaces or previously created interfaces that may be implemented by a LibraryFurniture class?
 */