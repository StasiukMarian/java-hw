package cw3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person>{
    private String name;

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
