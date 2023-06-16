package HomeWork6.task3;

import lombok.Data;

@Data
public class Greeter {
    private String formality;


    public void setFormality(String formality) {
        this.formality = formality;
    }
}
