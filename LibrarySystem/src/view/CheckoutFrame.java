/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import javax.swing.*;
import controller.CheckOutHandler;
import model.BookCopy;
import model.LibraryPatron;

/**
 *
 * @author bipin
 */
public class CheckoutFrame extends JFrame {
    private CheckOutHandler controller;

    public CheckoutFrame() {
        controller = new CheckOutHandler();
        setTitle("Checkout Book");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextField bookIdField = new JTextField();
        JTextField patronIdField = new JTextField();

        JButton checkoutButton = new JButton("Checkout Book");

        checkoutButton.addActionListener(e -> {
            String bookId = bookIdField.getText();
            String patronId = patronIdField.getText();
            BookCopy bookCopy = new BookCopy(Integer.parseInt(bookId), "available");
            LibraryPatron patron = new LibraryPatron(patronId, "", ""); 
        });

        add(new JLabel("Book ID:"));
        add(bookIdField);
        add(new JLabel("Patron ID:"));
        add(patronIdField);
        add(checkoutButton);

        setVisible(true);
    }
}
