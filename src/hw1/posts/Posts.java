package hw1.posts;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Posts {
    private int userID;
    private int id;
    private String title;
    private String body;
}
