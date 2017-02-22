package recommenderSystem.store;

import java.io.FileWriter;
import java.io.IOException;

import recommenderSystem.util.FileProcessor;

public class DataStore implements StorePrintData {

	FileProcessor file;
	private final int iUser = 943;
	private final int iItem = 1682;


	public DataStore(FileProcessor file) {
		this.file = file;
	}

	@Override
	public void inputData(int[][] arrMatrixIn) {
		// TODO Auto-generated method stub
		String readLine;

		try {
			while ((readLine = file.readLineFromFile()) != null) {
				String[] data = new String[3];
				data = readLine.split("\\s+");
				arrMatrixIn[Integer.parseInt(data[0])][Integer.parseInt(data[1])] = Integer.parseInt(data[2]);
				//System.out.println(data[0]);

			}
		} catch (IOException e) {
			System.err.println("Error while reading a file.");
			e.printStackTrace();
		}
	}


	@Override
	public void outputData(String outputFileNameIn, int[][] arrOutputMatrix) {
		// TODO Auto-generated method stub
		try (FileWriter locFile = new FileWriter(outputFileNameIn)) {
			System.out.println("Writting to File...");
			for(int i = 1; i <= iUser; i++) {
				for(int j = 1; j <= iItem; j++) {			    
					locFile.write(i + " " + j + " " + arrOutputMatrix[i][j] + "\n");
				}
			}
			
		} catch (IOException e) {
			System.err.println("Unable to write to File");
			System.exit(-1);
		} finally {
			System.out.println("\n File Write complete...");
		}
	}
}
