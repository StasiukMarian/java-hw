package cw2.instruments;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Trompete implements Instrument{
    private int diameter;

    @Override
    public void play() {
        System.out.println("Now you listening a trompete with a diameter " + this.diameter + " mm");
    }
}
