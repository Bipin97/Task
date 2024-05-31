/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.NewBookController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bipin
 */
public class BookFrame extends JFrame {
    private NewBookController controller;

    public BookFrame() {
        controller = new NewBookController();
        setTitle("Add New Book");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField editionField = new JTextField();
        JTextField pubYearField = new JTextField();
        JTextField ISBNField = new JTextField();
        JTextField publisherField = new JTextField();
        JTextField catalogNumberField = new JTextField();

        JButton addButton = new JButton("Add Book");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                String edition = editionField.getText();
                String pubYear = pubYearField.getText();
                String ISBN = ISBNField.getText();
                String publisher = publisherField.getText();
                String catalogNumber = catalogNumberField.getText();

                controller.createNewBook(title, author, edition, pubYear, ISBN, publisher, catalogNumber);
            }
        });

        add(new JLabel("Title:"));
        add(titleField);
        add(new JLabel("Author:"));
        add(authorField);
        add(new JLabel("Edition:"));
        add(editionField);
        add(new JLabel("Publication Year:"));
        add(pubYearField);
        add(new JLabel("ISBN:"));
        add(ISBNField);
        add(new JLabel("Publisher:"));
        add(publisherField);
        add(new JLabel("Catalog Number:"));
        add(catalogNumberField);
        add(addButton);

        setVisible(true);
    }
}
