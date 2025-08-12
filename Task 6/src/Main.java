import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("TODO-wooo");
        JTextField titleField = new JTextField(50);
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");

        DefaultListModel<Todo> listModel = new DefaultListModel<>();
        JList<Todo> list = new JList<>(listModel);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));


        addButton.addActionListener(e -> {
           String title = titleField.getText();
           listModel.addElement(new Todo(listModel.size() + 1, title));
        });

        deleteButton.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();

            if (selectedIndex != -1) {
                int confirm = JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to delete this task?",
                        "Confirm Deletion",
                        JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    listModel.remove(selectedIndex);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Please select a task to delete.");
                }
            }
        });
        frame.add(titleField);
        frame.add(addButton);
        frame.add(deleteButton);
        frame.add(new JScrollPane(list));
        frame.setVisible(true);
    }
}
