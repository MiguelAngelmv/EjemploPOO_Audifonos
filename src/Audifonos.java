public abstract class Audifonos implements ControlEnergia, Bluetooth {
    protected int volumen = 50;

    public abstract void pausarCancion();
    public abstract void siguienteCancion();
    public abstract void subirVolumen();
    public abstract void bajarVolumen();
}
