🎧 Ejemplo POO en Java 21

Este proyecto es un ejemplo básico de Programación Orientada a Objetos (POO) en Java 21, desarrollado en IntelliJ IDEA.
Simula unos Audífonos que pueden encenderse, apagarse, conectarse por Bluetooth y realizar acciones como pausar, cambiar canción, subir y bajar volumen.

🚀 Cómo ejecutar el proyecto
1. Requisitos previos

Asegúrate de tener instalado:

Java JDK 21

IntelliJ IDEA (Community o Ultimate)

Git

Verifica tu versión de Java:

java -version
Abrir en IntelliJ IDEA

Abrir IntelliJ IDEA.

Ve a File → Open y selecciona la carpeta del proyecto.
Ejecutar el programa

Ubica el archivo principal con el método main, por ejemplo:

public class Main {
public static void main(String[] args) {
// el codigo XD
}
}

Luego haz clic en ▶️ (Run) para ejecutar.

Estructura del proyecto
src/

├── interfaces/
│    └── Conectable.java

├── models/
│    └── Audifonos.java

├── utils/
│    └── ControladorAudio.java

└── Main.java