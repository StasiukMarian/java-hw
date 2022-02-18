package cw2.instruments;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Drums implements Instrument{
    private String size;
    @Override
    public void play() {
        System.out.println("Now you listening a drums with " + this.size + " size");
    }
}
