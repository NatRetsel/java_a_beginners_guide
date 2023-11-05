/*
 * Bonus challenge: Convert the Help class  developed in Try This 4-1 into a Swing-based GUI program. Display the keywords
 * (for, while, switch, etc) in a JList. When the user selects on, display the keyword's syntax. To display multiple lines
 * of text within a label, you can use HTML. When doing so, you must begin the text with the sequence <html>. When this is done,
 * the text is automatically formatted as described by the markup. In addition to other benefits, using HTML enables you to create
 * labels that span two or more lines. For example, this creates a label that displays two lines of text, with the string
 * "Top" over the "Bottom".
 * 
 * JLabel jlabhtml = new JLabel("<html>Top<br>Bottom</html>");
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class solution implements ListSelectionListener {
    JList<String> jlst; // list showing the keywords
    JLabel jlabhtml; // html output of keyword syntax
    JScrollPane jscrlp;

    // Keyword array
    String[] keywords = {"The if", "The traditional switch", "The for", "The while", "The do-while", "The break", "The continue"};

    solution() {
        // create JFrame container
        JFrame jfrm = new JFrame("Syntax Help");

        // Specify flow layout
        jfrm.setLayout(new FlowLayout());

        // Give frame initial size.
        jfrm.setSize(200, 160);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a JList.
        jlst = new JList<String>(keywords);

        // Add list to scroll pane
        jscrlp = new JScrollPane(jlst);

        // Set preferred size of scroll pane
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Make a label that displays the selection.
        jlabhtml = new JLabel("Which syntax would you like help with?");

        // Add list selection handler.
        jlst.addListSelectionListener(this);

        // Add the list and label to content pane.
        jfrm.add(jscrlp);
        jfrm.add(jlabhtml);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle list selection events
    public void valueChanged(ListSelectionEvent le) {
        // get value of changed item.
        int idx = jlst.getSelectedIndex();
        if(idx != -1) {
            // switch case
            String what = keywords[idx];
            switch(what) {
                case "The if":
                    jlabhtml.setText("<html>The if:<br>if(condition) statement; <br> else statement;</html>");
                    break;
                case "The traditional switch":
                    jlabhtml.setText("<html>The traditional switch:<br>switch(expression) {<br>&nbsp&nbsp&nbsp&nbsp case constant:<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp statement sequence<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp break;<br>&nbsp&nbsp&nbsp&nbsp //...<br>}</html>");
                    break;
                case "The for":
                    jlabhtml.setText("<html>The for:<br>for(init; condition; iteration); <br>   statement;</html>");
                    break;
                case "The while":
                    jlabhtml.setText("<html>The while:<br>while(condition) statement;</html>");
                    break;
                case "The do-while":
                    jlabhtml.setText("<html>The do-while:<br>do {<br>   statement;<br>} while (condition);</html>");
                    break;
                case "The break":
                    jlabhtml.setText("<html>The break:<br>break; or break label;</html>");
                    break;
                case "The continue":
                    jlabhtml.setText("<html>The continue:<br>continue; or continue label;</html>");
                    break;
            }
        }else{
            jlabhtml.setText("Which syntax would you like help with?");
        }

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new solution();
            } 
        });
    }

}

