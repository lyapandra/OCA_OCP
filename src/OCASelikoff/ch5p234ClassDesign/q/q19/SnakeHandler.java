package OCASelikoff.ch5p234ClassDesign.q.q19;

/**
 * Created by a on 08.04.2018.
 */
class Snake {}
class Cobra extends Snake {}
class GardenSnake {}
public class SnakeHandler {
    private Snake snake;
    public void setSnake(Snake snake) { this.snake = snake; }
    public static void main(String[] args) {
//        new SnakeHandler().setSnake(null);
        new SnakeHandler().setSnake(new Snake());
//        new SnakeHandler().setSnake(new Cobra());
    }
}