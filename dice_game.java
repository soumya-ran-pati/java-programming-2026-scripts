import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random dice = new Random();
        
        int player = dice.nextInt(6) + 1;
        int bot = dice.nextInt(6) + 1;
        
        System.out.println("Player: " + player);
        System.out.println("Bot: " + bot);
        
        if(player > bot){
            System.out.println("Player win the match.");
        }
        
        else if(player < bot){
            System.out.println("Bot win the match. you lose.");
        }
        
        else if(player == bot){
            System.out.println("It's a draw.");
        }
    }
}
