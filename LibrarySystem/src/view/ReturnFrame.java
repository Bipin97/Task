/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import javax.swing.*;
import controller.CheckOutHandler;
import model.BookCopy;

/**
 *
 * @author bipin
 */
public class ReturnFrame extends JFrame {
    private CheckOutHandler controller;

    public ReturnFrame() {
        controller = new CheckOutHandler();
        setTitle("Return Book");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextField bookIdField = new JTextField();

        JButton returnButton = new JButton("Return Book");

        returnButton.addActionListener(e -> {
            String bookId = bookIdField.getText();
            BookCopy bookCopy = new BookCopy(Integer.parseInt(bookId), "onLoan");
            controller.returnBook(bookCopy);
        });

        add(new JLabel("Book ID:"));
        add(bookIdField);
        add(returnButton);

        setVisible(true);
    }
}
