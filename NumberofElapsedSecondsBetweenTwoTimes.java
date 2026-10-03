class NumberofElapsedSecondsBetweenTwoTimes{
    public int secondsBetweenTimes(String s1, String s2) {
      // String s2= "01:00:25";
		String[] s3=s1.split(":");
		String[] s4=s2.split(":");
		//System.out.println(Arrays.toString(s3));
		//System.out.println(Arrays.toString(s4));
		int time1=60*60;
		int time2=60;
	 int totalSec1 =
            Integer.parseInt(s3[0]) * time1 +
            Integer.parseInt(s3[1]) * time2 +
            Integer.parseInt(s3[2]);

        int totalSec2 =
            Integer.parseInt(s4[0]) * time1 +
            Integer.parseInt(s4[1]) * time2 +
            Integer.parseInt(s4[2]);

        int result = Math.abs(totalSec1 - totalSec2);

        return result;
	}
}
	