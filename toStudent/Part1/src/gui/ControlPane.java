package Part1.src.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import Part1.src.logic.GameLogic;

public class ControlPane extends VBox{
	
	private Text gameText;
	private Button newGameButton;
	private TicTacToePane ticTacToePane;
	
	public ControlPane(TicTacToePane ticTacToePane) {
		super();
		this.ticTacToePane = ticTacToePane;
		//To be implemented
		setAlignment(Pos.CENTER);
//		this.ticTacToePane.prefWidth(300);
//		this.ticTacToePane.snapSpaceX(20);
//		this.ticTacToePane.snapSpaceY(20);
		setPrefWidth(300);
		setSpacing(20);
//		this.ticTacToePane.setPadding(new Insets(20,20,20,20));
		initializeGameText();
		initializeNewGameButton();
		this.getChildren().addAll(gameText, newGameButton);
	}
	
	private void initializeGameText() {
//		updateGameText("O Turn");
		this.gameText = new Text("O Turn");
		this.gameText.setFont(Font.font(35));
		
	}
	
	public void updateGameText(String text) {
		gameText.setText(text);
	}
	
	private void initializeNewGameButton() {
//		this.newGameButton = newGameButton;
//		this.newGameButton.setText("New Game");
		this.newGameButton = new Button("New Game");
		this.newGameButton.prefWidth(100);
		newGameButton.setOnAction(event -> newGameButtonHandler());
	}
	
	private void newGameButtonHandler() {
		//To be implemented
		GameLogic.getInstance().newGame();
		updateGameText("O Turn");
		for (TicTacToeCell tictoe : ticTacToePane.getAllCells()){
			tictoe.initializeCellColor();
		}
	}
}
