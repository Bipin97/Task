/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
/**
 *
 * @author bipin
 */
public class Loan {
    private Date dateofLoan;
    private Date dueDate;
    private Date returnedDate;

    public Date getDateofLoan() {
        return dateofLoan;
    }

    public void setDateofLoan(Date dateofLoan) {
        this.dateofLoan = dateofLoan;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }
    
    
}
