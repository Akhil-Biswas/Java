public class Book{
    String bookName;
    String bookAuthor;
    int bookId;
    boolean isIssued;
    String borrowedBy;

    public Book(
        String bookName,
        String bookAuthor,
        int bookId

        // Not required
        //Boolean isIssued,
        //String borrowedBy
    ){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.isIssued= false;

    //this.isIssued = isIssued;
    //this.borrowedBy = borrowedBy;
    }

    public void updateStatus(){
        //True= borrowed
        //False = returned
        if(this.isIssued == true){
            this.isIssued = false;
            System.out.println("Status Updated");
        }else if (this.isIssued == false){ 
            this.isIssued = true;
            System.out.println("Status Updated");
        }
    }

    public void borrowedBook(String name){
        if(this.isIssued == true){
            System.out.println("Book Not Available");
        }
        else{
            updateStatus();
            this.borrowedBy = name;
            System.out.println("Book Borrowed by "+ this.borrowedBy);
        }
    }

    public void returnBook(){
        if(this.isIssued == false){
            System.out.println("Book is Not Borrowed By Anyone");
        }else{
            updateStatus();
        }
    }
    public void printDetails(){
        System.out.println("============== " + this.bookName +" ==============");
        System.out.println("Book Id: "+ this.bookId);
        System.out.println("Author: "+ this.bookAuthor);
        
        if(this.isIssued == true){
            System.out.println("Status: Not Available");
        }else{
            System.out.println("Status: Available");
            System.out.println("Borrower: "+ this.borrowedBy);
        }

        System.out.println("           -+ END +--           ");
    }
}