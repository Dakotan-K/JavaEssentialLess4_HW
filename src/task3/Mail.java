package task3;

public class Mail {
    public static void main(String[] args) {

        Player player1 = new Player();

        player1.play();
        player1.pause();
        player1.stop();

        System.out.println("-----------");

        player1.record();
        player1.pause();
        player1.stop();
    }
}
