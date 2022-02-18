package cw2.instruments;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Guitar implements Instrument{
    private int stringCount;
    @Override
    public void play() {
        System.out.println("Now you listening a guitar with " + this.stringCount + " strings");
    }

}
