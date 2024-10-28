package com.eldars.camsystem;


public class SecuritySystem {
    public static void main(String[] args) {
        // Crear cámaras y monitores
        Camera camera1 = new Camera();
        Monitor monitor1 = new Monitor("Monitor 1");
        Monitor monitor2 = new Monitor("Monitor 2");

        // Asignar monitores a la cámara
        camera1.addObserver(monitor1);
        camera1.addObserver(monitor2);

        // Capturar imágenes
        camera1.captureImage("Imagen 1"); // Se notificará a los monitores
        camera1.captureImage("Imagen 1"); // No se notificará porque la imagen es igual
        camera1.captureImage("Imagen 2"); // Se notificará a los monitores

        // Quitar un monitor y capturar otra imagen
        camera1.removeObserver(monitor1);
        camera1.captureImage("Imagen 3"); // Solo el monitor 2 recibe la notificación
    }
}
