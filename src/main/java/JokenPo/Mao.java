package JokenPo;

public class Mao {
    private GestoEnum gesto;

    public Mao(GestoEnum gesto) {
        this.gesto = gesto;
    }

    public GestoEnum getGesto() {
        return gesto;
    }

    public Resultado enfrenta(Mao adversario) {
        return gesto.enfrenta(adversario.getGesto());
    }
}