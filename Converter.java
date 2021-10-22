package Main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;


import java.io.File;
import java.io.IOException;

/**
 * Класс конвертор
 */
public class Converter {

    /**
     * Сереализация JSON
     */
    public static void toJSON(Test[] test, String filePath) throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(filePath), test);
            System.out.println("\n" + filePath + " создан!");
            //обработчик ошибок
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Десереализация JSON
     */
    public static Test[] JSONtoJavaObject(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), Test[].class);
    }

    /**
     * Сериализация XML
     */
    public  static void toXML(Patient[] patient, String filePath) throws IOException {
        try {
            XmlMapper mapper = new XmlMapper();
            mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
            mapper.writeValue(new File(filePath), patient);
            System.out.println("\n" + filePath + " создан!");
            //обработчик ошибок
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Десереализация xml
     */
    public static Patient[] XMLtoJavaObject(String filePath) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(new File(filePath), Patient[].class);
    }
}
