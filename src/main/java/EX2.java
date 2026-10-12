public class EX2 {
    public static boolean isBalanced(String exp) {

        SingleArrayStack stack = new SingleArrayStack(exp.length());

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if (ch == ')' && opening != '(') {
                    return false;
                }

                if (ch == ']' && opening != '[') {
                    return false;
                }

                if (ch == '}' && opening != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String[] expressions = {
                "(a + b)",
                "{[()]}",
                "([)]",
                "((a + b)",
                "a + b)"
        };

        for (String exp : expressions) {

            if (isBalanced(exp)) {
                System.out.println(exp + " -> Balanced");
            } else {
                System.out.println(exp + " -> Not Balanced");
            }
        }
    }
}
