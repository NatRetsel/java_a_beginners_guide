/*
 * A lambda expression can be used in any context that provides a target type. The target contexts used by the preceding examples
 * are assignment and initialization. Another one is when a lambda expression is passed as an argument. In fact, passing a
 * lambda expession as an argument is a common use of lambdas. Moreover, it is a very powerful use because it gives you a way
 * to pass executable code as an argument to a method. This greatly enhances the expressive power of Java.
 * 
 * This project creates three string functions that perform the following operations: reverse a string, reverse the case of 
 * letters within a string, and replace spaces with hyphens. These functions are implemented as lambda expressions of the 
 * functional interface StringFunc. They are then passed as the first argument to a method called changeStr(). This method
 * applies the string function to the string passed as the second argument to changeStr() and returns the result. Thus,
 * changeStr() can be used to apply a variety of different string functions
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

        // Define a lambda expression that reverses the contents
        // of a string and assign it to a StringFunc reference variable
        StringFunc reverse = (str) -> {
            String result = "";
            for(int i= str.length()-1; i>=0; i--)
                result += str.charAt(i);
            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // This lambda expression replaces spaces with hyphens.
        // It is embedded directly in the call to changeStr().
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        // This lambda expression replaces spaces with hyphens.
        // It is embedded directly in the call to changeStr().
        outStr = changeStr((str) -> {
            String result = "";
            char ch;

            for (int i=0; i<str.length(); i++) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);

        System.out.println("The string in reversed case: " + outStr);
    }
}