public class CopyArray {
        
        //precondition: assume length <= a.length
        public static double[] copyDoubleArray(double[] a, int length)
	{
		double[] temp;
		temp = new double[length];
		for(int index = 0; index < length; index++)
		{
			temp[index] = a[index];
		}
		return temp;
        }
}
