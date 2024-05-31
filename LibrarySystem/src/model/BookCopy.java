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
public class BookCopy {
    private int copyNumner;
    private String status;
    private Date dueBack;

    public int getCopyNumner() {
        return copyNumner;
    }

    public void setCopyNumner(int copyNumner) {
        this.copyNumner = copyNumner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueBack() {
        return dueBack;
    }

    public void setDueBack(Date dueBack) {
        this.dueBack = dueBack;
    }
    
}
