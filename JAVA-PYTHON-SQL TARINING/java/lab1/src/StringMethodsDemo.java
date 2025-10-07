class StringMethodsDemo {

    public void testMethods(String input) {
        System.out.println("Input: \"" + input + "\"");

        System.out.println("charAt(2): " + (input.length() > 2 ? input.charAt(2) : "Index out of range"));
        System.out.println("contains(\"Sum\"): " + input.contains("Sum"));
        System.out.println("length(): " + input.length());
        System.out.println("indexOf(\"12\"): " + input.indexOf("12"));
        System.out.println("equals(\"test\"): " + input.equals("test"));
        System.out.println("equalsIgnoreCase(\"sum of 12 and 20 is 32\"): " + input.equalsIgnoreCase("sum of 12 and 20 is 32"));
        System.out.println("join(\"-\", \"one\", \"two\", \"three\"): " + String.join("-", "one", "two", "three"));
        System.out.println("lastIndexOf(\"is\"): " + input.lastIndexOf("is"));
        System.out.println("substring(4, 10): " + (input.length() >= 10 ? input.substring(4, 10) : "Input too short"));
        System.out.println("toLowerCase(): " + input.toLowerCase());
        System.out.println("toUpperCase(): " + input.toUpperCase());
        System.out.println("trim(): \"" + input.trim() + "\"");
    }
}
