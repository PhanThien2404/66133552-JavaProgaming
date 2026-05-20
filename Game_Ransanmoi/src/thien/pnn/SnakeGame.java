package thien.pnn;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class SnakeGame extends Application {

   
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int TILE_SIZE = 25;
    

    private List<Point> snake = new ArrayList<>();
    private Point food;
    private Direction direction = Direction.RIGHT;
    private boolean gameOver = false;
    private int score = 0;

    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);


        scene.setOnKeyPressed(event -> {
            KeyCode code = event.getCode();
            if ((code == KeyCode.UP || code == KeyCode.W) && direction != Direction.DOWN) direction = Direction.UP;
            if ((code == KeyCode.DOWN || code == KeyCode.S) && direction != Direction.UP) direction = Direction.DOWN;
            if ((code == KeyCode.LEFT || code == KeyCode.A) && direction != Direction.RIGHT) direction = Direction.LEFT;
            if ((code == KeyCode.RIGHT || code == KeyCode.D) && direction != Direction.LEFT) direction = Direction.RIGHT;
            
            // Chơi lại khi game over
            if (code == KeyCode.SPACE && gameOver) {
                startGame();
            }
        });


        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(130), e -> run(gc)));
        timeline.setCycleCount(Timeline.INDEFINITE);
        
        startGame();
        timeline.play();

        primaryStage.setTitle("Game Rắn Săn Mồi - JavaFX");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void startGame() {
        snake.clear();
        snake.add(new Point(WIDTH / TILE_SIZE / 2, HEIGHT / TILE_SIZE / 2));
        direction = Direction.RIGHT;
        score = 0;
        gameOver = false;
        spawnFood();
    }

    private void spawnFood() {
        int maxX = WIDTH / TILE_SIZE;
        int maxY = HEIGHT / TILE_SIZE;
        int foodX = (int) (Math.random() * maxX);
        int foodY = (int) (Math.random() * maxY);
        food = new Point(foodX, foodY);
    }

    private void run(GraphicsContext gc) {
        if (gameOver) {
            gc.setFill(Color.RED);
            gc.setFont(new Font("Arial", 40));
            gc.fillText("GAME OVER", WIDTH / 4.0, HEIGHT / 2.0);
            gc.setFont(new Font("Arial", 20));
            gc.fillText("Nhấn SPACE để chơi lại", WIDTH / 3.5, HEIGHT / 2.0 + 40);
            return;
        }

  
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

 
        for (int i = snake.size() - 1; i >= 1; i--) {
            snake.get(i).x = snake.get(i - 1).x;
            snake.get(i).y = snake.get(i - 1).y;
        }


        Point head = snake.get(0);
        switch (direction) {
            case UP -> head.y--;
            case DOWN -> head.y++;
            case LEFT -> head.x--;
            case RIGHT -> head.x++;
        }


        if (head.x < 0) head.x = (WIDTH / TILE_SIZE) - 1;
        if (head.y < 0) head.y = (HEIGHT / TILE_SIZE) - 1;
        if (head.x >= WIDTH / TILE_SIZE) head.x = 0;
        if (head.y >= HEIGHT / TILE_SIZE) head.y = 0;

        for (int i = 1; i < snake.size(); i++) {
            if (head.x == snake.get(i).x && head.y == snake.get(i).y) {
                gameOver = true;
            }
        }

  
        if (head.x == food.x && head.y == food.y) {
            score += 10;
            snake.add(new Point(-1, -1)); 
            spawnFood();
        }


        gc.setFill(Color.WHITE);
        gc.setFont(new Font("Arial", 20));
        gc.fillText("Điểm: " + score, 10, 25);


        gc.setFill(Color.RED);
        gc.fillOval(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        for (int i = 0; i < snake.size(); i++) {
            if (i == 0) gc.setFill(Color.LIGHTGREEN);
            else gc.setFill(Color.GREEN); 
            
            gc.fillRect(snake.get(i).x * TILE_SIZE, snake.get(i).y * TILE_SIZE, TILE_SIZE - 1, TILE_SIZE - 1);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}