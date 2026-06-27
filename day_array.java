class Main {
    public static void main(String[] args) {
        String[] days = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        
        System.out.println("WEEKDAYS:");
        
        for (int day=0; day<5; day++){
            System.out.println((day + 1) + ". " + days[day]);
        }
        
        System.out.println("WEEKEND:");
        
        for (int i=5; i<7; i++){
            System.out.println((i - 4) + ". " + days[i]);
        }
    }
}
