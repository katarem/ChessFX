package es.katarem.chessfx.Objetos;

public class Pieza {
    protected int move;
    protected int posX;
    protected int posY;
    protected boolean canEat,canMove,isJaque, isBlanca,isNegra;

    public int getMove() {
        return move;
    }
    public void setMove(int move) {
        this.move = move;
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public boolean isCanEat() {
        return canEat;
    }
    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }
    public boolean isCanMove() {
        return canMove;
    }
    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }
    public boolean isJaque() {
        return isJaque;
    }
    public void setJaque(boolean isJaque) {
        this.isJaque = isJaque;
    }

    public void mover(int newPos){
    }
    public void comer(int posx,int posy){
    }









}
