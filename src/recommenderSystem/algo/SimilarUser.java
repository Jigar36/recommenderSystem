package recommenderSystem.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author erjig_000
 *
 */
public class SimilarUser implements SimilarUserInterface {

	private int iUser = 943;

	/**
	 * 
	 */
	@Override
	public void FindSimilarUser(NearestData dataIn, int[][] arrMatrix,
			Map<Integer, HashMap<Integer, Double>> mapCoeffient) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= iUser; i++) {
			List<Integer> lstSimilarNearestNeighbor = new ArrayList<Integer>();
			HashMap<Integer, Double> mapUser = new HashMap<Integer, Double>();
			for (int j = 1; j <= iUser; j++) {
				if (i == j)
					continue;
				double dUserSimilarCoefficient = 0.0;
				ComputePearson correlation = new ComputePearson();
				dUserSimilarCoefficient = correlation.GetCorrelation(arrMatrix[i], arrMatrix[j]);
			//	if (dUserSimilarCoefficient > 0.2) {
					lstSimilarNearestNeighbor.add(j);
			//	}
				mapUser.put(j, dUserSimilarCoefficient);
			}
			mapCoeffient.put(i, mapUser);
			dataIn.arrNearestUser.put(i, lstSimilarNearestNeighbor);
		}
	}

}
