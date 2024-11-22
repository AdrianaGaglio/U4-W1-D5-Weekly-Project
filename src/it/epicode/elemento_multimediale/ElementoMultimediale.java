package it.epicode.elemento_multimediale;

import java.util.Scanner;

public class ElementoMultimediale  {
    private String title;

    public ElementoMultimediale(String title) {
        this.title = title;
    }

    public String getTitolo() {
        return title;
    }

    public static void esegui(ElementoMultimediale elemento) {
        Scanner scanner = new Scanner(System.in);
        if(elemento instanceof Immagine) {
            System.out.println("La luminosità dell'immagine è impostata a: " + ((Immagine) elemento).getLuminosita());
            System.out.println("Vuoi modificarla? 1-aumenta 2-riduci 0-ignora");
            int scelta;
            scelta = scanner.nextInt();
            scanner.nextLine();
            if (scelta == 1) {
                ((Immagine) elemento).aumentaLuminosita();
            } else if (scelta == 2) {
                ((Immagine) elemento).riduciLuminosita();
            }
            ((Immagine) elemento).show();
        } else {
            if (elemento instanceof Audio) {
                System.out.println("Il volume dell'audio è impostato a: " + ((Audio) elemento).getVolume());
                System.out.println("Vuoi modificarlo? 1-aumenta 2-riduci 0-ignora");
                int scelta;
                scelta = scanner.nextInt();
                scanner.nextLine();
                if (scelta == 1) {
                    ((Audio) elemento).alzaVolume();
                } else if (scelta == 2) {
                    ((Audio) elemento).abbassaVolume();
                }
                ((Audio) elemento).play();
            } else {
                System.out.println("Volume attuale: " + ((Video) elemento).getVolume());
                System.out.println("Vuoi modificarlo? 1-aumenta 2-riduci 0-ignora");
                int scelta;
                scelta = scanner.nextInt();
                scanner.nextLine();
                if (scelta == 1) {
                    ((Video) elemento).alzaVolume();
                } else if (scelta == 2) {
                    ((Video) elemento).abbassaVolume();
                }
                System.out.println("Luminosità attuale: " + ((Video) elemento).getLuminosita());
                scelta = scanner.nextInt();
                scanner.nextLine();
                if (scelta == 1) {
                    ((Video) elemento).aumentaLuminosita();
                } else if (scelta == 2) {
                    ((Video) elemento).riduciLuminosita();
                }
                System.out.println("Vuoi modificarla? 1-aumenta 2-riduci 0-ignora");

                ((Video) elemento).play();
            }
        }
    };

}
