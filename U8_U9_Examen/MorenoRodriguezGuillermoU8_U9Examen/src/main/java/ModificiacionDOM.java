import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class ModificiacionDOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo;
        String autor;
        String editorial;
        String paginas;


        System.out.println("Introduce el titulo del libro");
        titulo=sc.nextLine();
        System.out.println("Introduce el autor");
        autor = sc.nextLine();
        System.out.println("Introduce la editorial");
        editorial = sc.nextLine();
        System.out.println("Introduce el numero de páginas");
        paginas = sc.nextLine();

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("src/biblioteca.xml"));

            Element root = doc.getDocumentElement();

            Element libro = (Element) doc.getElementsByTagName("libro").item(0);

            Element libroClonado = (Element) libro.cloneNode(true);

            NodeList nl = libroClonado.getChildNodes();


            for (int i = 0; i < nl.getLength(); i++) {
                    if (nl.item(i).getNodeName().equals("titulo")) {
                        nl.item(i).setTextContent(titulo);
                    }else if (nl.item(i).getNodeName().equals("autor")) {
                        nl.item(i).setTextContent(autor);
                    }else if (nl.item(i).getNodeName().equals("editorial")) {
                        nl.item(i).setTextContent(editorial);
                    }else if (nl.item(i).getNodeName().equals("paginas")){
                            nl.item(i).setTextContent(paginas);
                    }
            }

            NodeList allBooks = root.getChildNodes();

            for (int i = 0; i < allBooks.getLength(); i++) {
                if (allBooks.item(i).getNodeName().equals("autor")){
                    Element paisAutor = null;
                    paisAutor.setTextContent("España");
                    allBooks.item(i).appendChild(paisAutor);
                }
            }

            root.appendChild(libroClonado);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File ejercicioExamen = new File("src/Ejercicio2.xml");
            StreamResult destino = new StreamResult(ejercicioExamen);

            transformer.transform(origenDOM,destino);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
