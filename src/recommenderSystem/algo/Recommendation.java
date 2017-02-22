package recommenderSystem.algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author erjig_000
 *
 */
public class Recommendation {
	private int iItem = 1682;

	/**
	 * 
	 * @param iUserId
	 * @param lst
	 * @param arrMatrix
	 * @param mapCoeffient
	 * @param arrOutputMatrix
	 */
	public void recommend(int iUserId, List<Integer> lst, int[][] arrMatrix,
			Map<Integer, HashMap<Integer, Double>> mapCoeffient, int[][] arrOutputMatrix) {

		for (int i = 1; i <= iItem; i++) {
			if (arrMatrix[iUserId][i] == 0) {
				double dblValue = 0.0;
				double dblDemo = 0.0;
				for (int j : lst) {
					if (arrMatrix[j][i] == 0)
						continue;
					dblValue += arrMatrix[j][i] * mapCoeffient.get(iUserId).get(j);
					dblDemo += Math.abs(mapCoeffient.get(iUserId).get(j));
				}
				double dblSimilar = dblValue / dblDemo;
				dblSimilar = Math.round(dblSimilar);
				if (dblSimilar < 1)
					dblSimilar = 1;
				else if (dblSimilar > 5)
					dblSimilar = 5;
				arrOutputMatrix[iUserId][i] = (int) dblSimilar;
			} else {
				arrOutputMatrix[iUserId][i] = arrMatrix[iUserId][i];
			}
		}
	}
}
