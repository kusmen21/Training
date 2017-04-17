package ru.epam.homework.hw04;

import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import ru.epam.homework.hw04.bean.Treasure;
import ru.epam.homework.hw04.sax.TreasureSaxHandler;

public class Aggregator 
{
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		XMLReader reader = XMLReaderFactory.createXMLReader();
			TreasureSaxHandler handler = new TreasureSaxHandler();
		reader.setContentHandler(handler);
		reader.parse(new InputSource("src/ru/epam/homework/hw04/xml/Treasures_test.xml"));

		// включение проверки действительности
		reader.setFeature("http://xml.org/sax/features/validation", true);
		// включение обработки пространств имен
		reader.setFeature("http://xml.org/sax/features/namespaces", true);

		// включение канонизации строк
		reader.setFeature("http://xml.org/sax/features/string-interning", true);

		// отключение обработки схем
		reader.setFeature("http://apache.org/xml/features/validation/schema", false);
		
		List<Treasure> treasures = handler.getTreasureList();
		for (Treasure treasure : treasures) {
			System.out.println(treasure);
		}
	}
}
