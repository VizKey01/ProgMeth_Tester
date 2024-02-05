package logic;

public class Fighter extends Piece{

    private boolean promoted;
    private PositionList promotedMovePositions;

    public Fighter (int initialPositionX, int initialPositionY, boolean reverse,String name) {
        super(initialPositionX, initialPositionY, reverse, name);
        promotedMovePositions = new PositionList();
        promotedMovePositions.add(0, 2);
        promotedMovePositions.add(1, 0);
        promotedMovePositions.add(0, -2);
        promotedMovePositions.add(-1, 0);
        movePositions.add(1, 2);
        movePositions.add(-1, 2);
        if(isReverse()) {
            for(Position pos : promotedMovePositions) {
                pos.reverse();
            }
            for(Position pos : movePositions) {
                pos.reverse();
            }

        }
        setPromoted(false);
    }

    public void move(int movePattern) {
        PositionList e;
        if(isPromoted()){
            e = promotedMovePositions;
        }
        else {
            e = movePositions;
        }
        Position targetPosition = this.currentPosition.addPositionValue(e.get(movePattern));
        setCurrentPosition(targetPosition);
        this.currentPosition.normalizedPosition();
    }

    public Position attackTargetPosition(int actionPattern) {
        Position targetPosition = this.currentPosition.addPositionValue(movePositions.get(actionPattern));
        targetPosition.normalizedPosition();
        setCurrentPosition(targetPosition);
        return targetPosition;
    }

    public PositionList getPromotedMovePositions() {
        return promotedMovePositions;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }
}
