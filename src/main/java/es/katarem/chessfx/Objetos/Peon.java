package es.katarem.chessfx.Objetos;

public class Peon extends Pieza{

    public Peon(char color,int posX,int posY){
        setCanMove(true);
        setCanEat(false);
        setPosX(posX);
        setPosY(posY);
        setMove(1);
        pieza = 'p';
        if(color == 'b')
            isBlanca=true;
        else
            isNegra=true;
    }

    @Override
    public boolean isCanMove() {
        Pieza p = new Pieza();
        if(this.isBlanca)
            p.posY = this.posY+1;
        else
            p.posY = this.posY-1;
        if(Character.isLetter(p.pieza))
            return canMove = false;
        else
            return canMove = true;
    }

    @Override
    public void mover(int newPos) {
    if(isCanMove()){
        if(newPos==posY+1)
            posY = newPos;
        else if(isBlanca && posX==1 && newPos == posY+2)
            posY = newPos;
        else if(isNegra && posX==6 && newPos == posY-2)
            posY = newPos;
        }
    else
        System.out.println("No se puede mover.");
    }

    @Override
    public void comer(int posx,int posy) {
        if(canEat){
            setPosX(posX+1);
            setPosY(posY+1);
        }
        else
            System.out.println("No puede comer");
    }

    // public void coronar(){
    //     if(isBlanca && posY==7);
    //     else if(isNegra && posY==0);
    // }
}