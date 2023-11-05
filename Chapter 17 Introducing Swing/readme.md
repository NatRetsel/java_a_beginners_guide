# Chapter 17 Self Test

1. In general, AWT components are heavyweight and Swing compoenents are _____.
   - Lightweight.
  
2. Can the look and feel of a Swing component be changed? If so, what features enables this?
   - Yes, pluggable look and feel.
  
3. What is the most commonly-used top-level container for an application?
   - `JFrame`.
  
4. Top-level containers have several panes. To what pane are components added?
   - Content pane.

5. Show how to construct a label that contains the message "Select an entry from the list".
   - `JLabel jlabel = new JLabel("Select an entry from the list");`
  
6. All interactions with GUI components must take place on what thread?
   - event-dispatching thread.

7. What is the default action command associated with `JButton`? How can the action command be changed?
   - It is the text shown inside the button. It can be changed with `setActionCommand()`.

8. What even is generated when a push button is pressed?
   - `ActionEvent`.
  
9. Show how to create a text field that has 32 columns.
    -  `JTextField jtf = new JTextField(32);`;
  
10. Can a `JTextField` have its action command set? If so, how?
    - Yes, by calling the `setActionCommand()`.
   
11. What Swing component creates a check box? What event is generated when a check box is selected or deselected?
    - `JCheckBox`, `ItemEvent`.
   
12. `JList` displays a list of items from which the user can select. True or False?
    - True.
   
13. What event is generated when the user selects or deselects an item in a `JList`?
    - `ListSelectionEvent`.
   
14. What method sets the selection mode of a `JList`? What method obtains the index of the first selected item?
    - `setSelectionMode()`, `getSelectedIndex()`.
   
15. Add a check box to the file comparer develoepd in Try This 17-1 that has the following text: Show position of mismatch. When this box is checked, have the program display the location of the first point in the files at which a mismatch occurs.
    - Visit solution folder.
   
16. Change the `ListDemo` program so that it allows multiple items in the list to be selected.
    - Visit solution folder.
   
17. Bonus challenge: Convert the Help class developed in Try This 4-1 into a Swing-based GUI program. Display the keywords (for, while, switch, etc) in a JList. When the user selects one, display the keyword's syntax. To display multiple lines of text within a label, you can use HTML. When doing so, you must begin the text with the sequence `<html>`. When this is done, the text is automatically formatted as described by the markup. IN addition to other benefits, using HTML enables you to create labels that span two or more lines. For example, this creates a label that displays two lines of text, with the string "Top" over the string "Bottom".
    `JLabel jlabhtml = new JLabel("<html>Top<br>Bottom</html>");`
    - Visit solution folder.
