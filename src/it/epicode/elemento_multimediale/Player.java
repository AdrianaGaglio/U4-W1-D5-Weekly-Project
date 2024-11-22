package it.epicode.elemento_multimediale;

import java.util.Scanner;

public class Player {

    public static void aggiungiElementi(ElementoMultimediale[] player) {
        Scanner scanner = new Scanner(System.in);

        int tipo = 0;
        for (int i = 0; i < player.length; i++) {
            System.out.println("Scegli tipo di file: \n1-immagine\n2-audio\n3-video");
            tipo = scanner.nextInt();
            scanner.nextLine();
            if (tipo == 1) {
                System.out.println("Inserisci titolo immagine");
                String titoloImmagine = scanner.nextLine();
                System.out.println("Definisci luminosità (da 0 a 10)");
                player[i] = new Immagine(titoloImmagine, scanner.nextInt());
            } else if (tipo == 2) {
                System.out.println("Inserisci titolo audio");
                String titoloAudio = scanner.nextLine();
                System.out.println("Definisci volume (da 0 a 10)");
                int volumeAudio = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Definisci durata (in minuti)");
                int durataAudio = scanner.nextInt();
                player[i] = new Audio(titoloAudio, volumeAudio, durataAudio);
            } else if (tipo == 3) {
                System.out.println("Inserisci titolo video");
                String titoloVideo = scanner.nextLine();
                System.out.println("Definisci luminosità (da 0 a 10)");
                int luminositaVideo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Definisci volume (da 0 a 10)");
                int volumeVideo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Definisci durata (in minuti)");
                int durataVideo = scanner.nextInt();
                player[i] = new Video(titoloVideo, luminositaVideo, volumeVideo, durataVideo);
            } else {
                System.out.println("Scelta non valida!");
            }
        }
        scanner.close();
    }

    public static void riproduciElementi(ElementoMultimediale[] player) {
        Scanner scanner = new Scanner(System.in);
        int selection;
        while (true) {
            System.out.println("Seleziona seleziona un elemento (da 1 a 5 - 0 per uscire):");
            selection = scanner.nextInt();
            scanner.nextLine();
            if (selection == 0) {
                return;
            } else {
                if (selection < 1 || selection > 5) {
                    System.out.println("Scelta non valida!");
                    Player.riproduciElementi(player);
                }
            }
            ElementoMultimediale elemento = player[selection - 1];
            ElementoMultimediale.esegui(elemento);
        }


    }

    public static void main(String[] args) {

        ElementoMultimediale[] player = new ElementoMultimediale[5];

        Player.aggiungiElementi(player);

        Player.riproduciElementi(player);

        System.out.println("Vuoi aggiungere nuovi elementi multimediali? (s/n)");
        Scanner scanner = new Scanner(System.in);
        String risposta = scanner.nextLine();
        if(risposta.equals("s")) {
            Player.aggiungiElementi(player);
            System.out.println("Vuoi eseguire i nuovi elementi? (s/n)");
            risposta = scanner.nextLine();
            if(risposta.equals("s")) {
                Player.riproduciElementi(player);
            }
        } else {
            return;
        }
    }
}


