public class Main {
    public static void main(String[] args) {
        Audifonos misAudifonos = new AudifonosBluetooth();
        misAudifonos.encender();
        misAudifonos.conectar();
        misAudifonos.subirVolumen();
        misAudifonos.siguienteCancion();
        misAudifonos.pausarCancion();
        misAudifonos.bajarVolumen();
        misAudifonos.apagar();
    }
}

class AudifonosBluetooth extends Audifonos {

    @Override
    public void encender() {
        System.out.println("🎧 Audífonos encendidos.");
    }

    @Override
    public void apagar() {
        System.out.println(" Audífonos apagados.");
    }

    @Override
    public void conectar() {
        System.out.println("📡 Audífonos conectados vía Bluetooth.");
    }

    @Override
    public void pausarCancion() {
        System.out.println("⏸ Canción pausada.");
    }

    @Override
    public void siguienteCancion() {
        System.out.println("⏭ Siguiente canción...");
    }

    @Override
    public void subirVolumen() {
        volumen += 10;
        System.out.println("🔊 Volumen: " + volumen + "%%");
    }

    @Override
    public void bajarVolumen() {
        volumen -= 10;
        System.out.println("🔉 Volumen: " + volumen + "%%");
    }
}
