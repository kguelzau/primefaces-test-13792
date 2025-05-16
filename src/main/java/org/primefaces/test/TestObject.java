package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class TestObject implements Serializable {

    private String id;
    private String name;
    private String artist;
    private Integer released;
    private List<String> images = new ArrayList<>(List.of(
            "https://www.primefaces.org/showcase/javax.faces.resource/images/home/jsf-components.png.xhtml?ln=showcase",
            "https://www.primefaces.org/showcase/javax.faces.resource/images/home/jsf-opensource.png.xhtml?ln=showcase"
    ));
    public TestObject(String name, String artist, Integer released) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.artist = artist;
        this.released = released;
    }

}
