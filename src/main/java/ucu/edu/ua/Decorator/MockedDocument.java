package ucu.edu.ua.Decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MockedDocument implements Document {

    private String gcsPath;

    @Override
    public String parse() {
        try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {}
        return "Mocked Parse Result";
    }

    @Override
    public String getGcsPath() {
        return "Mocked GCS Path";
    }

}
