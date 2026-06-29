class Main {
    public int calc_age(int birth_year, int present_year){
        return present_year - birth_year;
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(obj.calc_age(2003, 2026));
    }
}
