public class hashcode {
    public static int HashFunction(String input) {
        int hashCode = 0;
        for (int i = 0; i < input.length(); i++) {
            hashCode += input.charAt(i);
        }
        return hashCode;
    }

    public static void main(String[] args) {
        String name = "Kavya Sri";
        int hashCode = HashFunction(name);
        System.out.println(name);
        System.out.println(hashCode);
        // String name = "Pushpanjali";
        // int hashCode = name.hashCode();

        // System.out.println("Name: " + name + "\nHashCode: " + hashCode);
    }
}
