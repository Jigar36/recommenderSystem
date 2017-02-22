package recommenderSystem.algo;

/**
 * 
 * @author erjig_000
 *
 */
public class ComputePearson {

	/**
	 * 
	 * @param arrXUser
	 * @param arrYUser
	 * @return
	 */
	public double GetCorrelation(int[] arrXUser, int[] arrYUser) {
		double dMeanX = 0.0, dMeanY = 0.0;
		for (int i = 1; i < arrXUser.length; i++) {
			dMeanX += arrXUser[i];
			dMeanY += arrYUser[i];
		}

		dMeanX /= (arrXUser.length - 1);
		dMeanY /= (arrYUser.length - 1);

		double dSumXY = 0.0, dSumX2 = 0.0, dSumY2 = 0.0;
		for (int i = 1; i < arrXUser.length; i++) {
			dSumXY += ((arrXUser[i] - dMeanX) * (arrYUser[i] - dMeanY));
			dSumX2 += Math.pow(arrXUser[i] - dMeanX, 2.0);
			dSumY2 += Math.pow(arrYUser[i] - dMeanY, 2.0);
		}
		// System.out.println(dSumXY / (Math.sqrt(dSumX2 * dSumY2)));
		return (dSumXY / (Math.sqrt(dSumX2 * dSumY2)));
	}
}
