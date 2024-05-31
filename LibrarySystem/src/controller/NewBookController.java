/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.BookTitle;
import java.util.ArrayList;

/**
 *
 * @author bipin
 */
public class NewBookController {
    private ArrayList <BookTitle> bookTitles;
    
    public NewBookController(){
        this.bookTitles = new ArrayList<>();
     
    }
    public boolean checkForExisting(String title){
        for (BookTitle bookTitle : bookTitles){
            if (bookTitle.getTitle().equals(title)){
                return true;
            }
           
        }
        return false;
        
    }
    public boolean checkForEdition(String title, String edition) {
        for (BookTitle bookTitle : bookTitles) {
            if (bookTitle.getTitle().equals(title) &&
            bookTitle.getEdition().equals(edition)) {
                return true;
            }
        }
        return false;
    }
    public void createNewBook(String title, String author, String edition, String pubYear, String ISBN, String publisher, String catalogNumber) {
        if(!checkForExisting(title)){
            BookTitle newBook = new BookTitle(title, author, edition, pubYear, ISBN, publisher, catalogNumber);
            bookTitles.add(newBook);
        }
        else {
        System.out.println("Book already exists.");
        }
    } 
    
}
