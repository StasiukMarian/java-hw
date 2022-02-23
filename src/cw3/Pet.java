package cw3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet implements Comparable<Pet>{
    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.getName());
    }

    private String name;
}
