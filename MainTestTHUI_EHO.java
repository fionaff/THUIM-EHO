package ca.pfv.spmf.test.mytest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

public class MainTestTHUI_EHO {
	public static void main(String[] args) throws IOException {

		String input = fileToPath("Had_Diabetes.txt");
		String output = "output-HadDiabetes.txt";
		int k = 500;
		AlgoTHUI_EHO algorithm = new AlgoTHUI_EHO();
		algorithm.run();
		algorithm.printStats();
	}
	public static String fileToPath(String filename) throws UnsupportedEncodingException {
		URL url = MainTestTKOBasic.class.getResource(filename);
		return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}