package chrome_options;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class Read_pdf {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
		// TODO Auto-generated method stub
		BodyContentHandler contentHandler=new BodyContentHandler();
		FileInputStream fis=new FileInputStream("./TestData/prathi.pdf");
		Metadata metaData=new Metadata();
		ParseContext parseContext=new ParseContext();
		PDFParser parser=new PDFParser();
		parser.parse(fis, contentHandler, metaData,parseContext);
		System.out.println(contentHandler.toString());
	}

}
