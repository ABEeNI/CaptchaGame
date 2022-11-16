package Logic;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class SetOfSameTypes {
    private Long id;
    private String name;

    public SetOfSameTypes(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
