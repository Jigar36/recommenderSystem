package recommenderSystem.driver;

import java.util.HashMap;
import java.util.Map;

import recommenderSystem.algo.NearestData;
import recommenderSystem.algo.Recommendation;
import recommenderSystem.algo.SimilarUser;
import recommenderSystem.algo.SimilarUserInterface;
import recommenderSystem.store.DataStore;
import recommenderSystem.store.StorePrintData;
import recommenderSystem.util.FileProcessor;

/**
 * 
 * @author erjig_000
 *
 */
public class Driver {

	private final static int iUser = 943;
	private final static int iItem = 1682;
	private static int[][] arrMatrix = new int[iUser + 1][iItem + 1];
	private static int[][] arrOutputMatrix = new int[iUser + 1][iItem + 1];
	private static Map<Integer, HashMap<Integer, Double>> mapCoeffient = new HashMap<Integer, HashMap<Integer, Double>>();

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		String INPUT_FILE = "mining_input.txt";
		String OUTPUT_FILE = "output.txt";
		FileProcessor file = new FileProcessor(INPUT_FILE);
		StorePrintData inStore = new DataStore(file);

		System.out.println("Copying input data into matrix[][]");
		inStore.inputData(arrMatrix);

		System.out.println("Finding Similar Users...");

		NearestData near = new NearestData();
		SimilarUserInterface user = new SimilarUser();
		user.FindSimilarUser(near, arrMatrix, mapCoeffient);

		System.out.println("Computing Recommendation..");
		Recommendation recommend = new Recommendation();
		for (int i = 1; i <= iUser; i++) {
			recommend.recommend(i, near.arrNearestUser.get(i), arrMatrix, mapCoeffient, arrOutputMatrix);
		}
		inStore.outputData(OUTPUT_FILE, arrOutputMatrix);

		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) / 1000 + " seconds");
	}
}
