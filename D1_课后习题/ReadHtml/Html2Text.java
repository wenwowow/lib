package ReadHtml;
import java.io.*;
import java.util.regex.Pattern;

public class Html2Text {
	public static String StripHT(String inputString) {
		String htmlStr = inputString; // 含html标签的字符串
		String textStr = "";
		java.util.regex.Pattern p_script;
		java.util.regex.Matcher m_script;
		java.util.regex.Pattern p_style;
		java.util.regex.Matcher m_style;
		java.util.regex.Pattern p_html;
		java.util.regex.Matcher m_html;
		try {
			String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"; // 定义script的正则表达式{或<script[^>]*?>[\\s\\S]*?<\\/script>
	        String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // 定义style的正则表达式{或<style[^>]*?>[\\s\\S]*?<\\/style>
	        String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式
	        p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
	        m_script = p_script.matcher(htmlStr);
	        htmlStr = m_script.replaceAll(""); // 过滤script标签
	        p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
	        m_style = p_style.matcher(htmlStr);
	        htmlStr = m_style.replaceAll(""); // 过滤style标签
	        p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
	        m_html = p_html.matcher(htmlStr);
	        htmlStr = m_html.replaceAll(""); // 过滤html标签
	        textStr = htmlStr;
	    } catch (Exception e) {System.err.println("Html2Text: " + e.getMessage()); }
		//剔除空格行
		//textStr=textStr.replaceAll("[ ]+", " ");
		textStr=textStr.replaceAll("(?m)^\\s*$(\\n|\\r\\n)", "");
		System.out.println(textStr);
		return textStr;// 返回文本字符串
	}

	private static String savefile = "test1.txt";
	private static void saveAsFileWriter(String content) { 
		 FileWriter fwriter = null;
		 try {
		  fwriter = new FileWriter(savefile);
		  fwriter.write(content);
		 } catch (IOException ex) {
		  ex.printStackTrace();
		 } finally {
		  try {
		   fwriter.flush();
		   fwriter.close();
		  } catch (IOException ex) {
		   ex.printStackTrace();
		  }
		 }
	}
	public static void main(String[] args) {
		String content = "";
	    try {
	        BufferedReader in = new BufferedReader(new FileReader("1.html"));
	        String str;
	        while ((str = in.readLine()) != null) {
	            content +=str;
	        }
	        in.close();
	    } catch (IOException e) {
	    }
		saveAsFileWriter(Html2Text.StripHT(content));
		
	}
}
