package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

//You might need to do something to the following line
public class ControlPane extends VBox {
	
	private Text drawnNumberText;
	private Text drawCountText;
	private Text bingoText;
	private Button drawButton;
	private Button newRoundButton;
	private NumberGrid numberGrid;

	
	public ControlPane(NumberGrid numberGrid) {
		// TODO
		super();
		this.numberGrid = numberGrid;
		setAlignment(Pos.CENTER);
		setPrefWidth(300);
		setSpacing(20);
		setBorder(new Border(new BorderStroke
				(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.DEFAULT_WIDTHS)));
		drawnNumberText = new Text();
		drawnNumberText.setFont(Font.font(20));
//		this.drawCountText = getDrawCountText();
		drawCountText = new Text();
		initializeBingoText();
		initializeDrawButton();
		initializeNewRoundButton();
//		getChildren().addAll(getDrawnNumberText(), getDrawCountText(), getBingoText(), getDrawButton(), getNewRoundButton());
		getChildren().addAll(drawnNumberText, drawCountText, bingoText, drawButton, newRoundButton);
		BingoUtil.setTextsBeginning(getDrawnNumberText(), getDrawCountText());

	}
	
	private void initializeBingoText() {
		// TODO
		bingoText = new Text();
		bingoText.setText("Bingo!!");
		bingoText.setFont(Font.font(40));
		bingoText.setVisible(false);
	}

	private void initializeDrawButton() {
		// TODO
		drawButton = new Button();
		drawButton.setText("Draw a number");
		drawButton.setPrefWidth(100);
		drawButton.setOnAction(event -> drawButtonHandler());
	}

	private void initializeNewRoundButton() {
		// TODO
		newRoundButton = new Button();
		newRoundButton.setText("New Round");
		newRoundButton.setPrefWidth(100);
		newRoundButton.setDisable(true);
		newRoundButton.setOnAction(event -> newRoundButtonHandler());
	}
	
	private void drawButtonHandler() {
		// TODO
		int num = BingoUtil.drawNumber();
		numberGrid.highlightNumber(num);
		if(BingoUtil.isBingo(numberGrid)) {
			bingoText.setVisible(true);
			drawButton.setDisable(true);
			newRoundButton.setDisable(false);
		}
		BingoUtil.updateTextsAfterDrawn(num, getDrawnNumberText(), getDrawCountText());
		
	}
	
	private void newRoundButtonHandler() {
		// TODO
//		BingoUtil.
		BingoUtil.assignRandomNumbers(numberGrid.getNumberSquares());
//		BingoUtil.assignRandomNumbers();

		bingoText.setVisible(false);
		drawButton.setDisable(false);
		newRoundButton.setDisable(true);

		BingoUtil.setTextsBeginning(getDrawnNumberText(), getDrawCountText());
	}

	public Text getDrawnNumberText() {
		return drawnNumberText;
	}

	public Text getDrawCountText() {
		return drawCountText;
	}

	public Text getBingoText() {
		return bingoText;
	}

	public Button getDrawButton() {
		return drawButton;
	}

	public Button getNewRoundButton() {
		return newRoundButton;
	}

	public NumberGrid getNumberGrid() {
		return numberGrid;
	}
}
