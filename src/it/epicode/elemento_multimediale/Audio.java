package it.epicode.elemento_multimediale;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private int volume;
    private int duration;

    public Audio(String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
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

    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.println(i + 1 + ") Audio in riproduzione: " + this.getTitolo() + ", volume: " + "!".repeat(this.volume));
        }
    }
}
