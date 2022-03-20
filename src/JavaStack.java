//Mindula Dilthushan
//Hacker Rank - Java
import java.util.*;

class JavaStack {

    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (isBalanced(scanner.nextLine())) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    static boolean isBalanced(String string) {
        List<String> stringList = Arrays.asList("}", ")", "]");
        boolean isBalanced = true;
        ArrayList<String> stack = new ArrayList<String>();
        if (string.length() > 0) {
            for (int i = 0; i < string.length(); i++) {
                String paran = string.substring(i, i + 1);
                if (stack.size() == 0 && stringList.contains(paran)) {
                    isBalanced = false;
                    break;
                } else {
                    if (paran.equals("{") || paran.equals("(") || paran.equals("[")) {
                        stack.add(paran);
                    } else {
                        String stackParan = stack.get(stack.size() - 1);
                        if ((stackParan.equals("{") && paran.equals("}")) || (stackParan.equals("(") && paran.equals(")") || (stackParan.equals("[") && paran.equals("]")))) {
                            stack.remove(stack.size() - 1);
                        } else {
                            isBalanced = false;
                            break;
                        }
                    }
                }
            }
        }
        if (stack.size() > 0) isBalanced = false;
        return isBalanced;
    }
}



