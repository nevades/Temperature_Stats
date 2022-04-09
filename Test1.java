class MainClass
{
	public static void main(String args[])
	{	
		float tot , max , min , avg;
		tot = 0;
		max = 0;
		min = 0;
		avg = 0;

		for(int c=0 ; c<3 ; c++)
		{
			System.out.println("Please enter the temperature value");
			
			float[] temps = new float[3];

			temps[c] = Float.parseFloat(System.console().readLine());
			
			tot = tot + temps[c];

			if(temps[c] > max)
			{
				max = temps[c];
			}

			if(temps[c] < min)
			{
				min = temps[c];
			}

		}

		avg = tot / 3 ;

		System.out.println("Total value : " +tot);
		System.out.println("Min value : " +min);
		System.out.println("Max value : " +max);
		System.out.println("Average value : " +avg);


		
	} 
}