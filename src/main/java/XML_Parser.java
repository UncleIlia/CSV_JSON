import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XML_Parser {
    public List<Employee> parseXML(String fileName) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File(fileName));

        Node root = doc.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                long id = Integer.parseInt(element.getAttribute("id"));
                Employee employee = new Employee(Integer.parseInt(element.getAttribute("id")),
                        element.getAttribute("firstName"),
                        element.getAttribute("lastName"),
                        element.getAttribute("country"),
                        Integer.parseInt(element.getAttribute("age")));
                list.add(employee);
            }
        }
        return list;
    }
}
