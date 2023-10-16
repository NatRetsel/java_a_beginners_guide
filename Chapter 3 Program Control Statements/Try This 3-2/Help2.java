/*
 * This project expands on the Java help system that was created in Try This 3-1. This version adds the syntax for the
 * for, while, and do-while loops. It also checks the user's menu selection, looping until a valid response is entered.
*/

class Help2 {
    public static void main(String[] args) 
        throws java.io.IOException {
            char choice, ignore;
            do {
                System.out.println("Help on:");
                System.out.println("    1. if");
                System.out.println("    2. switch");
                System.out.println("    3. for");
                System.out.println("    4. while");
                System.out.println("    5. do-while\n");
                System.out.print("Choose one: ");
                choice = (char) System.in.read();

                System.out.println("\n");

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                
            } while (choice < '1' | choice > '5');

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

            }
        }
    
}