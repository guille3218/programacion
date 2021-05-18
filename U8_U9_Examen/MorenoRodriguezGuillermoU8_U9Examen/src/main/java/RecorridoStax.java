import javax.naming.InitialContext;
import javax.swing.text.Element;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import java.io.FileInputStream;

public class RecorridoStax {
    public static void main(String[] args) {
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("src/biblioteca.xml"));

            while(xmlReader.hasNext()){
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
