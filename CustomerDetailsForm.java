import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerDetailsForm extends JFrame {

    private JTextField firstNameField, lastNameField, emailField, phoneField, addressField;
    private JTextArea customerDetailTextArea;

    public CustomerDetailsForm() {
        setTitle("Customer Details Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createForm();

        setVisible(true);
    }

    private void createForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        panel.add(firstNameField);

        panel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        panel.add(lastNameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("Address:"));
        addressField = new JTextField();
        panel.add(addressField);

        customerDetailTextArea = new JTextArea();
        customerDetailTextArea.setEditable(false); // Make it non-editabl
        JScrollPane scrollPane = new JScrollPane(customerDetailTextArea);
        panel.add(scrollPane);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });

        panel.add(submitButton);

        add(panel);
    }

    private void submitForm() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();

        // Update JTextArea
        customerDetailTextArea.setText("Customer details submitted:\n"
                + "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "Email: " + email + "\n"
                + "Phone Number: " + phone + "\n"
                + "Address: " + address);

        // Save to file without displaying
        data_saver.saves(customerDetailTextArea);

        // Additional actions...
        Cafe_sys.main(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerDetailsForm();
            }
        });
    }
}
