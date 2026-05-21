// YOUR NAME:Prashanna khadka
// COLLABORATORS:
// LAST MODIFIED DATE: 
/*
Yearly Global Atmospheric CO₂ Levels (parts per million)
2001: 371.32 ppm
2002: 373.45 ppm
2003: 375.98 ppm
2004: 377.70 ppm
2005: 379.98 ppm
2006: 382.09 ppm
2007: 384.03 ppm
2008: 385.83 ppm
2009: 387.64 ppm
2010: 390.10 ppm
2011: 391.85 ppm
2012: 394.06 ppm
2013: 396.74 ppm
2014: 398.87 ppm
2015: 401.01 ppm
2016: 404.41 ppm
2017: 406.76 ppm
2018: 408.72 ppm
2019: 411.66 ppm
2020: 414.24 ppm
(Data from: https://www.esrl.noaa.gov/gmd/webdata/ccgg/trends/co2/co2_annmean_mlo.txt)
*/

class Main 
{
	//CONSTANTS SECTION

  public static void main(String[] args) 
  {
		// DECLARATION SECTION
    double[] co2Levels = {
      371.32, 373.45, 375.98, 377.70, 379.98,
      382.09, 384.03, 385.83, 387.64, 390.10,
      391.85, 394.06, 396.74, 398.87, 401.01,
      404.41, 406.76, 408.72, 411.66, 414.24
    };
    int[] years = new int[20];
    double growth;

		// INITIALIZATION SECTION
    for(int i = 0; i < years.length; i++)
    {
      years[i] = 2001 + i;
    }

		// INPUT SECTION 

		// PROCESSING SECTION
    growth = co2Levels[co2Levels.length - 1] - co2Levels[0];

		// OUTPUT SECTION
  
    //Column titles of graph
    System.out.println("Year                CO₂ in Atmosphere (ppm)");

    printGraph(co2Levels, years);
    System.out.printf("%nFrom 2001 to 2020, the average atmospheric CO₂ levels across the globe has grown %.2f ppm.%n", growth);

  }

  public static void printBar(double value)
  {
    int drums = (int)(value - 360);

    for(int i = 0; i < drums; i++)
    {
      System.out.print("🛢");
    }

    System.out.printf(" %.2f%n", value);
  }

  public static void printGraph(double[] co2Levels, int[] years)
  {
    for(int i = 0; i < co2Levels.length; i++)
    {
      System.out.print(years[i] + " ");
      printBar(co2Levels[i]);
    }
  }

}