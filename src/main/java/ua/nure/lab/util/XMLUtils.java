package ua.nure.lab.util;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ua.nure.lab.cache.CallsList;

import java.io.*;

public class XMLUtils {
    private static final String FILE_NAME = "calls.xml";

    public static void serializeToXML(CallsList callsList) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File(FILE_NAME), callsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CallsList deserializeFromXML() {
        File file = new File(FILE_NAME);
        XmlMapper xmlMapper = new XmlMapper();
        String xml;
        try {
            xml = inputStreamToString(new FileInputStream(file));
            return xmlMapper.readValue(xml, CallsList.class);
        } catch (IOException e) {
            System.err.println(FILE_NAME + " not found, will be created");
        }
        return new CallsList();
    }

    private static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
