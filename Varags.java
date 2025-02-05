class Varags {
    public void getnames(String... n) { 
        for (String str : n) {
            System.out.print(str + " "); 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Varags h = new Varags();
        h.getnames("Hi");
        h.getnames("Hi", "how", "r", "u");
        h.getnames("Hi", "Lets", "Party", "or", "movie");
    }
}
