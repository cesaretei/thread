public class Salvadanaio{
    int monete=0;

    public void inserisci(){

        usa(true);

    }

    public void preleva(){

        usa(false);
    }
    public void usa(boolean inserisci){
        if(inserisci){
            monete++;
        }else{
            monete--;
        }

    }

}