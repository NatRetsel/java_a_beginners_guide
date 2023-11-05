/*
 * CHange the ListDemo program so that it allows multiple items in the list to be selected.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class solution implements ListSelectionListener {
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Create an array of names.
    String[] names = {"Sherry", "Jon", "Rachel","Sasha", "Josselyn", "Randy", "Tom", "Mary", "Ken", "Andrew","Matt", "Todd"};

    solution() {
        // Create a new JFarme container.
        JFrame jfrm = new JFrame("Jlist Demo");

        // Specifyt a flow layout
        jfrm.setLayout(new FlowLayout());

        // Give the frame and initial size.
        jfrm.setSize(200, 160);

        // Terminate thew program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JList.
        jlst = new JList<String>(names);

        // Set the lsit selection mode to single-selection.
        jlst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add list to scroll pane.
        jscrlp = new JScrollPane(jlst);

        // Set the preferred size of scroll pane.
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Make a label that displays the selection.
        jlab = new JLabel("Please choose a name");

        // Add lsit selection handler.
        jlst.addListSelectionListener(this);

        // Add the list and label to the content pane.
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
 
    }

    // Handle list selection events.
    public void valueChanged(ListSelectionEvent le) {
        // Get the index of the changed item.
        int idx = jlst.getSelectedIndex();

        // Display selection, if item was selected.
        if(idx != -1) {
            int [] idxs = jlst.getSelectedIndices();
            if (idxs.length > 1){
                String msg = "Current selecion: ";
                for (int i=0; i< idxs.length; i++) {
                    msg += names[idxs[i]];
                    if (i != idxs.length - 1)
                        msg += ", ";
                }
                jlab.setText(msg);
            }

            else
                jlab.setText("Current selection: " + names[idx]);
        }else{
            jlab.setText("Please choose a name");
        } 
            
    }

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new solution();
            }
        });
    }
}