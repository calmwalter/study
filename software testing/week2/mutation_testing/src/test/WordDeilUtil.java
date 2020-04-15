package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDeilUtil {

	public static String wordFormat4DB(String name) {
		if (name == null)
			return null;
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(name);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			if (m.start() == 0)
				m.appendReplacement(sb, m.group());
			else
				m.appendReplacement(sb, "_" + m.group());
		}
		return m.appendTail(sb).toString().toLowerCase();
	}

}