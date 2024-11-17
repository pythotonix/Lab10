import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Random;
import ucu.edu.ua.Decorator.Document;
import ucu.edu.ua.Decorator.MockedDocument;


public class DocumentTest {
    private Document document;

    @Test
    public void testParse() {
        document = new MockedDocument("Mocked GCS Path");
        Assertions.assertEquals("Mocked Parse Result", document.parse());
    }
}