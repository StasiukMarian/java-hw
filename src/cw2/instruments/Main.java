package cw2.instruments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(4);
        Drums drums = new Drums("20x14");
        Trompete trompete = new Trompete(123);

        List<Instrument> instrumentList = new ArrayList<>();
        instrumentList.add(guitar);
        instrumentList.add(drums);
        instrumentList.add(trompete);

        for (Instrument instrument : instrumentList) {
            instrument.play();
        }
    }
}
