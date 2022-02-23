package hw3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Comparable<User> {
    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.getSkills().size();
    }

    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List skills;
    private Car car;
}
