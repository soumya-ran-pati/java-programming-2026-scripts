class Main {
    public int dif(int operand1, int operand2){
        return operand1 - operand2;
    }
    
    public static void main(String[] args) {
        Main math = new Main();
        int result = math.dif(50, 45);
        System.out.println(result);
    }
}
