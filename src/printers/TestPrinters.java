package printers;

public class TestPrinters {

	public static void main(String[] args) {
		ThreeDPrinter tDPr = new ThreeDPrinter();
		InkPrinter iPr = new InkPrinter();
		Drivers dr = new Drivers();
		
		dr.runPrint(tDPr);
		dr.runPrint(iPr);
		
	}

}
