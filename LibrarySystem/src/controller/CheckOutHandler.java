/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.BookCopy;
import model.LibraryPatron;
import model.Loan;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bipin
 */
public class CheckOutHandler {
    private ArrayList<Loan> loans;
    public CheckOutHandler(){
        loans = new ArrayList<>();
    }
    public boolean verifyPatronForLoan(String ID){
    return true;
   
    }
    public void checkoutBook(BookCopy bookCopy,LibraryPatron patron){
        if (bookCopy.getStatus().equals("available")) {
        
            Loan newLoan = new Loan(new Date(), new Date());
            loans.add(newloan);
            bookcopy.setStatus("onLoan");
        }else{
            System.out.println("Book is not available for loan.");
        }
    }
    public void returnBook(BookCopy bookCopy) {
        bookCopy.setStatus("returned");
    }

    
}
