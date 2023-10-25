package fileHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.util.Iterator;

public class FileHandler {

    private String filename;

    public FileHandler(String filename) {
        this.filename = filename;
    }

    public String readFile() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public void writeFile(String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }

    public String jsonToXml(String jsonContent) throws Exception {
        // Using org.json for JSON parsing.
        JSONObject json = new JSONObject(jsonContent);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("root");
        doc.appendChild(rootElement);

        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Element keyElement = doc.createElement(key);
            keyElement.appendChild(doc.createTextNode(json.get(key).toString()));
            rootElement.appendChild(keyElement);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);

        java.io.StringWriter writer = new java.io.StringWriter();
        StreamResult result = new StreamResult(writer);

        transformer.transform(source, result);
        return writer.toString();
    }

    public static void main(String[] args) {
        try {
            FileHandler handler = new FileHandler("src/main/resources/sample.txt");
            String content = handler.readFile();
            System.out.println(content);

            String jsonContent = "{\"name\": \"Rachel\", \"age\": 30}";
            String xmlContent = handler.jsonToXml(jsonContent);

            handler.writeFile(xmlContent);
            System.out.println(xmlContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
