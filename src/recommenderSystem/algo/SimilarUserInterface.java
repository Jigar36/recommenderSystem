package recommenderSystem.algo;

import java.util.HashMap;
import java.util.Map;

public interface SimilarUserInterface {
	public void FindSimilarUser(NearestData near, int[][] arrMatrix,
			Map<Integer, HashMap<Integer, Double>> mapCoeffient);
}
