package it.epicode.elemento_multimediale;

import it.epicode.elemento_multimediale.interfacce.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private int luminosita;
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return this.luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        if(this.luminosita == 10) {
            System.out.println("Luminosità già al massimo!");
            return;
        }
        this.luminosita++;
    }

    @Override
    public void riduciLuminosita() {
        if(this.luminosita == 0) {
            System.out.println("Luminosità già al minimo!");
            return;
        }
        this.luminosita--;
    }

    public void show() {
        System.out.println("Immagine: " + this.getTitolo() + ", luminosità: " + "*".repeat(this.luminosita));
    }


}