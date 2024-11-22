package it.epicode.elemento_multimediale;

import it.epicode.elemento_multimediale.interfacce.Luminosita;
import it.epicode.elemento_multimediale.interfacce.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita {
    private int volume;
    private int luminosita;
    private int duration;

    public Video(String title, int luminosita, int volume, int duration) {
        super(title);
        this.luminosita = luminosita;
        this.volume = volume;
        this.duration = duration;
    }

    public int getLuminosita() {
        return this.luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        if (this.luminosita == 10) {
            System.out.println("Luminosità già al massimo!");
            return;
        }
        this.luminosita++;
    }

    @Override
    public void riduciLuminosita() {
        if (this.luminosita == 0) {
            System.out.println("Luminosità già al minimo!");
            return;
        }
        this.luminosita--;
    }

    @Override
    public void alzaVolume() {
        if (this.volume == 10) {
            System.out.println("Volume già al massimo!");
            return;
        }
        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        if (this.volume == 0) {
            System.out.println("Volume già al minimo!");
            return;
        }
        this.volume--;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.println(i + 1 + ") Video in riproduzione: " + this.getTitolo() + ", volume: " + "!".repeat(this.volume) + ", luminosità: " + "*".repeat(this.luminosita));
        }
    }


}
