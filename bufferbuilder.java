public class bufferbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("world");
        System.out.println(sb);

        sb.insert(5, "Java");   
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);


        sb.reverse();
        System.out.println(sb);

        String finalString = sb.toString();  // Convert String builder to string
        System.out.println(finalString);


        
}
}
