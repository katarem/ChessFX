package es.katarem.chessfx.Objetos;


public class Rey extends Pieza{
    public Rey(char color){
        setCanMove(true);
        setCanEat(false);
        setMove(1);
        pieza = 'R';
        if(color == 'b'){
            isBlanca=true;
            setPosX(0);
            setPosY(4);
        }
        else{
            isNegra=true;
            setPosX(7);
            setPosY(4);
        }

    }





    @Override
    public void mover(int newPosX,int newPosY) {
        if(newPosX==1)
            posX +=1;
        if(newPosY==1)
            posY +=1;
        if(newPosX==-1)
            posX -=1;
        if(newPosY==-1)
            posY -=1;
    }
}
