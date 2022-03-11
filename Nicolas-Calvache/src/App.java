public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game(4, 25);
        game.printGame();
        while (true) {
            game.advance();
            game.printGame();
            Thread.sleep(300);

            if (game.gameEnds()) {
                System.exit(0);
            }
        }
    }
}
