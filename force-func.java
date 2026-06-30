class Main {
    public int calc_force(int mass, int acceleration){
        return mass * acceleration;
    }
    
    public static void main(String[] args){
        Main physics = new Main();
        System.out.println(physics.calc_force(30, 10) + "N");
    }
}
