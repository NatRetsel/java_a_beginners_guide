/*
 * In this project, we will be creating a disk-based help system. The disk-based Help system stores help information in a help file. The
 * help file is a standard text file that can be changed or expanded at will, without changing the Help program. The user obtains help about
 * a topic by typing in its name. The Help system searches the help file for the topic. If it is found, information about the topic is
 * displayed.
 */

import java.io.*;

class Help {
    String helpfile; // name of help file

    Help(String fname) {
        helpfile = fname;
    }

    // Display help on a topic
    boolean helpOn(String what) {
        int ch;
        String topic, info;

        // Open the help file.
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                // read characters until a # is found
                ch = helpRdr.read();

                // now see if topic match
                if(ch == '#') {
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) { // found topic
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("")!=0));
                        return true;
                    }
                }
            } while (ch != -1);
        }catch (IOException exc) {
            System.out.println("error accessing help file.");
            return false;
        }
        return false;
    }

    // Get a Help topic
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        }catch (IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

// Demonstrate the file-based Help system.
class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop' to end.");

        do {
            topic = hlpobj.getSelection();

            if (!hlpobj.helpOn(topic))
                System.out.println("Topic not found.\n");
        }while(topic.compareTo("stop") != 0);
    }
}