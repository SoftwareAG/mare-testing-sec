import java.net.URI; 

class HelloWorld {

  //Hopefully CodeQL will spot this... also what happens if I mention stackoverflow.com?
  String password = "supersecretvalue"; 
  
  public static void main(String argv[]) throws Exception {
    System.out.println("Hello World");
    URI uri = new URI(argv[0]); 
  }
}
