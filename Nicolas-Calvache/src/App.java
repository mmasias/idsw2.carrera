public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game(2, 8);
        game.printGame();
        while (true) {
            game.advance();
            game.printGame();
            Thread.sleep(1000);

            if (game.gameEnds()) {
                System.exit(0);
            }
        }
    }
}
