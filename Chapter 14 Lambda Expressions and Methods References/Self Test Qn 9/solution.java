/*
 * Using the program shown in try This 14-1, create a lambda expression that removes all spaces from a string and
 * returns the result. Demonstrate this method by passing it to changeStr()
 */
interface StringFunc {
    String func(String str);
}

class LambdaArgumentDemo {
    // This method has a functional interface as the type of its
    // first parameter. Thus, it can be passed a reference to any
    // instance of that interface, including an instance created 
    // by a lambda expression. The second parameter specifies the
    // string to operate on.
    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args){
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // Define a lambda expression that removes all spaces from a string and returns the result
        StringFunc remove_space = (n) -> {
            int length = n.length();
            String res = "";
            for (int i = 0; i < length; i++) {
                if (n.charAt(i) == ' ') {
                    continue;
                }
                res += n.charAt(i);
            }
            return res;
        };

        outStr = changeStr(remove_space, inStr);

        System.out.println("String after removing spaces: " + outStr);
        
    }
}