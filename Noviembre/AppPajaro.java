package Noviembre;

public class AppPajaro {
    public static void main(String[] args) {
        Pajaro Pajaro0 = new Pajaro("8327KSJD", "Loro", "Pipu", "alto");
        Pajaro Pajaro1 = new Pajaro("235FGYJD", "comun", "Luca", "marron");
        Pajaro Pajaro2 = new Pajaro("34gDFSFE", "Raro", "pipi", "amarillo");
        Pajaro Pajaro3 = new Pajaro("3234SDFE", "salvaje", "pupu", "verde");
        Pajaro Pajaro4 = new Pajaro("467FFSEF", "Gaviota", "silvi", "bajo");
        Pajaro[] lista_Pajaros = new Pajaro[5];
        lista_Pajaros [0]= Pajaro0;
        lista_Pajaros [1]= Pajaro1;
        lista_Pajaros [2]= Pajaro2;
        lista_Pajaros [3]= Pajaro3;
        lista_Pajaros [4]= Pajaro4;
        for (int i = 0; i < 5;i++){
            lista_Pajaros[i].imprimePajaro();
        }
    }
}



