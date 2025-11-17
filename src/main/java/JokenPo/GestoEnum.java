package JokenPo;

public enum GestoEnum {

    PEDRA,
    PAPEL,
    TESOURA;

    public Resultado enfrenta(GestoEnum adversario) {

        if (this == adversario) {
            return Resultado.EMPATADA;
        }

        switch (this) {
            case PEDRA:
                return (adversario == TESOURA) ? Resultado.GANHA : Resultado.PERDE;

            case PAPEL:
                return (adversario == PEDRA) ? Resultado.GANHA : Resultado.PERDE;

            case TESOURA:
                return (adversario == PAPEL) ? Resultado.GANHA : Resultado.PERDE;

            default:
                throw new IllegalStateException("Gesto inválido: " + this);
        }
    }
}