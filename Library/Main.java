/*
Create a class Boook

*/
class Main{
    public static void  main(String args[]){
        
        Book b1 = new Book(
            "Math", 
            "RD Sharma", 
            2);

        Book b2 = new Book(
            "Science", 
            "gandhi ji", 
            6);

        Book b3 = new Book(
            "Political Science", 
            "Modi ji", 
            5);

        b1.printDetails();
        // System.out.println(b1.bookName);
        // System.out.println(b1.bookAuthor);
        // System.out.println(b1.bookId);
        // System.out.println(b1.isIssued);
        // System.out.println(b1.borrowedBy);
        // b2.printDetails();
        // b3.printDetails();
    }
}