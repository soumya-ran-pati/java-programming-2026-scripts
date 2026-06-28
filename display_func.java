class Main {
    public void Display(String Output){
        System.out.println(Output);
    }
    
    public static void main(String[] args){
        Main func = new Main();
        String name = "Bob";
        func.Display("Hello, " + name + "!");
    }
}
