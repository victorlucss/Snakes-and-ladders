package Fabrica.TiposEnum;

public enum EfeitoEspecialEnum {

    OBSTACULO_COBRA(1),
    OBSTACULO_ESCADA(2);
;
    private int tipoEfeitoEspecial;

    private EfeitoEspecialEnum(int tipoEfeitoEspecial){
        this.tipoEfeitoEspecial = tipoEfeitoEspecial;
    }
}
