package ucu.edu.ua.Decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CashedDocument implements Document{
    private Document document;

    @Override
    public String parse() {
        String cached =
        DBConnection.getInstance().getDociment(getGcsPath());
        if (cached != null) {
            return cached;
        }
        else {
            String parsed = document.parse();
            DBConnection.getInstance().createDocument(getGcsPath(), parsed);
            return parsed;
        }
    }

    @Override
    public String getGcsPath() {
        return document.getGcsPath();
    }

}
