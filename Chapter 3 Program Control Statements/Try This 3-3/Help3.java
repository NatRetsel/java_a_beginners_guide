/*
 * This project expands on the Java help system that was created in Try This 3-1. This version adds the syntax for the
 * for, while, do-while loops, break and continue. It also checks the user's menu selection, 
 * looping until a valid response is entered. It also allows the user to request for more than one statement using
 * an outer loop that runs until the user enters q as a menu selection.
*/

class Help3 {
    public static void main(String[] args) 
        throws java.io.IOException {
            char choice, ignore;
            for(;;){
                do {
                    System.out.println("Help on:");
                    System.out.println("    1. if");
                    System.out.println("    2. switch");
                    System.out.println("    3. for");
                    System.out.println("    4. while");
                    System.out.println("    5. do-while");
                    System.out.println("    6. break");
                    System.out.println("    7. continue\n");
                    System.out.print("Choose one (q to quit): ");
                    choice = (char) System.in.read();

                    System.out.println("\n");

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                    
                } while (choice < '1' | choice > '7' & choice != 'q');

                if (choice == 'q') break;
                switch(choice) {
                    case '1':
                        System.out.println("The if:\n");
                        System.out.println("if(condition) statement;");
                        System.out.println("else statement;");
                        break;
                    case '2':
                        System.out.println("The traditional switch:\n");
                        System.out.println("switch (expression) {");
                        System.out.println("    case constant");
                        System.out.println("        statment sequence");
                        System.out.println("        break;");
                        System.out.println("    // ...");
                        System.out.println("}");
                        break;
                    case '3':
                        System.out.println("The for:\n");
                        System.out.print("for(init; condition; iteration)");
                        System.out.println("    statement;");
                        break;
                    case '4':
                        System.out.println("The while:\n");
                        System.out.println("while (condition) statement;");
                        break;
                    case '5':
                        System.out.println("The do-while:\n");
                        System.out.println("do {");
                        System.out.println("    statement;");
                        System.out.println("} while (condition);");
                        break;
                    case '6':
                        System.out.println("The break:\n");
                        System.out.println("break; or break label;");
                        break;
                    case '7':
                        System.out.println("The continue:\n");
                        System.out.println("continue; or continue label;");
                        break;

                }
            }
        }
}