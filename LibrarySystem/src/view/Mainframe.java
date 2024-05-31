/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bipin
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Library System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JButton addBookButton = new JButton("Add Book");
        JButton checkoutBookButton = new JButton("Checkout Book");
        JButton returnBookButton = new JButton("Return Book");

        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookFrame().setVisible(true);
            }
        });

        checkoutBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CheckoutFrame().setVisible(true);
            }
        });

        returnBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReturnFrame().setVisible(true);
            }
        });

        add(addBookButton);
        add(checkoutBookButton);
        add(returnBookButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}