package Actividad6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactManagerGUI extends JFrame implements ActionListener {
    private JTextField nameField, numberField;
    private JTextArea resultField;
    private List<Contact> contacts = new ArrayList<>();
    private File contactsFile = new File("friendsContact.txt");
    private JButton createButton,readButton,deleteButton, updateButton,clearButton,exitButton;

    public ContactManagerGUI() {
        setTitle("Contact Manager");
        setSize(400, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(10);
        JLabel numberLabel = new JLabel("Number:");
        numberField = new JTextField(10);


        JButton createButton = new JButton("Create");
        createButton.addActionListener(this);

        JButton readButton = new JButton("Read");
        readButton.addActionListener(this);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(this);

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(this);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        resultField = new JTextArea(15, 20); // Establece las filas y columnas deseadas
        resultField.setEditable(false);

        setLayout(new BorderLayout(10, 10));

        JPanel datosPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel.add(nameLabel);
        datosPanel.add(nameField);
        datosPanel.add(numberLabel);
        datosPanel.add(numberField);

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel.add(createButton);
        botonesPanel.add(readButton);
        botonesPanel.add(updateButton);
        botonesPanel.add(deleteButton);
        botonesPanel.add(clearButton);
        botonesPanel.add(exitButton);

        JPanel responsePanel = new  JPanel(new GridLayout(1, 2, 5, 5));
        responsePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
        JScrollPane scrollPane = new JScrollPane(resultField);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        responsePanel.add(scrollPane);

        add(datosPanel, BorderLayout.NORTH);
        add(botonesPanel,BorderLayout.CENTER);
        add(responsePanel, BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //CREATE
        if (e.getActionCommand().equals("Create")) {
            String newName = nameField.getText();
            long newNumber;

            try {
                newNumber = Long.parseLong(numberField.getText());
            } catch (NumberFormatException ex) {
                resultField.setText("Please enter a valid number.");
                return;
            }

            try {
                File file = new File("friendsContact.txt");

                if (!file.exists()) {
                    file.createNewFile();
                }

                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                boolean found = false;

                while (raf.getFilePointer() < raf.length()) {
                    String nameNumberString = raf.readLine();
                    String[] lineSplit = nameNumberString.split("!");

                    if (lineSplit.length >= 2) {
                        String name = lineSplit[0];
                        long number = Long.parseLong(lineSplit[1]);

                        if (name.equals(newName) || number == newNumber) {
                            found = true;
                            break;
                        }
                    }
                }
                if (!found) {
                    String nameNumberString = newName + "!" + String.valueOf(newNumber);
                    raf.writeBytes(nameNumberString);
                    raf.writeBytes(System.lineSeparator());
                    raf.close();
                    resultField.setText("Friend added: " + newName);
                } else {
                    raf.close();
                    resultField.setText("Friend already exists.");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                resultField.setText("Error while creating the contact.");
            }

        }

        //READ
        else if (e.getActionCommand().equals("Read")) {
            try {
                StringBuilder contactList = new StringBuilder("Contacts:\n\n");

                // Using file pointer creating the file.
                File file = new File("friendsContact.txt");

                if (!file.exists()) {
                    resultField.setText("No contacts found.");
                    return;
                }

                // Opening file in reading mode.
                RandomAccessFile raf = new RandomAccessFile(file, "r");

                while (raf.getFilePointer() < raf.length()) {
                    // Reading line from the file.
                    String nameNumberString = raf.readLine();

                    // Splitting the string to get name and number.
                    String[] lineSplit = nameNumberString.split("!");

                    // Separating name and number.
                    String name = lineSplit[0];
                    long number = Long.parseLong(lineSplit[1]);

                    // Append the contact data to the contactList StringBuilder with a line break.
                    contactList.append("Friend Name: ").append(name).append("\n");
                    contactList.append("Contact Number: ").append(number).append("\n\n");
                }

                // Set the resultField text to the contact list.
                resultField.setText(contactList.toString());

                // Closing the resources.
                raf.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
                resultField.setText("Error while reading contacts.");
            } catch (NumberFormatException nef) {
                nef.printStackTrace();
                resultField.setText("Error while parsing contact number.");
            }
        }

        //UPDATE
        else if (e.getActionCommand().equals("Update")) {
            String newName = nameField.getText();
            long newNumber;

            try {
                newNumber = Long.parseLong(numberField.getText());
            } catch (NumberFormatException ex) {
                resultField.setText("Please enter a valid number.");
                return;
            }

            try {
                File file = new File("friendsContact.txt");

                if (!file.exists()) {
                    resultField.setText("File not found.");
                    return;
                }

                BufferedReader reader = new BufferedReader(new FileReader(file));
                List<String> updatedLines = new ArrayList<>();
                String line;
                boolean found = false;

                while ((line = reader.readLine()) != null) {
                    String[] lineSplit = line.split("!");
                    String name = lineSplit[0];
                    long number = Long.parseLong(lineSplit[1]);

                    if (name.equals(newName)) {
                        found = true;
                        updatedLines.add(newName + "!" + newNumber);
                    } else {
                        updatedLines.add(line);
                    }
                }

                reader.close();

                if (!found) {
                    resultField.setText("Contact not found: " + newName);
                } else {
                    // Sobrescribir el archivo original con el contenido actualizado
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
                    for (String updatedLine : updatedLines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                    writer.close();
                    resultField.setText("Contact updated: " + newName);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                resultField.setText("Error while updating the contact.");
            }
        }


        //DELETE
        else if (e.getActionCommand().equals("Delete")) {
            String nameToDelete = nameField.getText();
            boolean found = false;

            try {
                File file = new File("friendsContact.txt");

                if (!file.exists()) {
                    resultField.setText("No contacts found.");
                    return;
                }

                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                List<String> remainingLines = new ArrayList<>();
                String line;

                while ((line = raf.readLine()) != null) {
                    String[] lineSplit = line.split("!");
                    if (lineSplit.length >= 1) {
                        String name = lineSplit[0];
                        if (name.equals(nameToDelete)) {
                            found = true;
                        } else {
                            remainingLines.add(line);
                        }
                    }
                }

                raf.close();

                if (!found) {
                    resultField.setText("Contact not found: " + nameToDelete);
                } else {
                    // Sobrescribir el archivo original sin el registro eliminado
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
                    for (String updatedLine : remainingLines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                    writer.close();
                    resultField.setText("Contact deleted: " + nameToDelete);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                resultField.setText("Error while deleting the contact.");
            }
        }

        else if (e.getActionCommand().equals("Clear")) {
            clearFields();
            resultField.setText("");
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }
    private void saveContactsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(contactsFile))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readContactsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(contactsFile))) {
            contacts = (List<Contact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        nameField.setText("");
        numberField.setText("");
    }

}



