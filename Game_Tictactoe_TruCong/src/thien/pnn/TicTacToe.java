package thien.pnn;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private boolean xTurn = true; 
    private Button[][] buttons = new Button[3][3];

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setStyle("-fx-background-color: #2b2b2b; -fx-padding: 10;");

     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = new Button("");
                btn.setFont(Font.font("Arial", FontWeight.BOLD, 40));
                btn.setPrefSize(100, 100);
                btn.setStyle("-fx-background-color: #ffffff; -fx-cursor: hand;");
                
            
                btn.setOnAction(e -> handleButtonClick(btn));
                
                buttons[i][j] = btn;
                grid.add(btn, j, i);
            }
        }

        Scene scene = new Scene(grid, 340, 340);
        primaryStage.setTitle("Game Tic-Tac-Toe");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void handleButtonClick(Button btn) {

        if (!btn.getText().isEmpty()) return;

      
        btn.setText(xTurn ? "X" : "O");
        btn.setStyle(xTurn ? "-fx-background-color: #ffffff; -fx-text-fill: #ff4757;" 
                           : "-fx-background-color: #ffffff; -fx-text-fill: #1e90ff;");

    
        if (checkWin()) {
            showAlert("Chúc mừng!", "Người chơi " + (xTurn ? "X" : "O") + " đã chiến thắng!");
            resetBoard();
        } else if (isBoardFull()) {
            showAlert("Kết quả", "Trận đấu hòa!");
            resetBoard();
        } else {
            xTurn = !xTurn; 
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2])) return true;
            if (checkLine(buttons[0][i], buttons[1][i], buttons[2][i])) return true;
        }

        if (checkLine(buttons[0][0], buttons[1][1], buttons[2][2])) return true;
        if (checkLine(buttons[0][2], buttons[1][1], buttons[2][0])) return true;
        
        return false;
    }

    private boolean checkLine(Button b1, Button b2, Button b3) {
        return !b1.getText().isEmpty() 
            && b1.getText().equals(b2.getText()) 
            && b2.getText().equals(b3.getText());
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().isEmpty()) return false;
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setStyle("-fx-background-color: #ffffff; -fx-cursor: hand;");
            }
        }
        xTurn = true; 
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}