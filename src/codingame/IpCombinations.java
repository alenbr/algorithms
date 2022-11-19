package codingame;
/*
 * print all the possible combination of ip address in a string
 */

public class IpCombinations {

	public static void main(String[] args) {
		
		ipcombine("255661111");
		ipcombine("2556611111");
		ipcombine("11111111111");
		ipcombine("111111111111");
		ipcombine("1111");
		ipcombine("111");
		ipcombine("1111111111111");

	}

	public static void ipcombine(String ip) {
		
		for (int a =0; a < 3; a++ ) {
			long p1 = Long.valueOf(ip.substring(0, a+1));
			
			for (int b=a+1; b < ip.length() && p1 < 256 && b < a + 4; b++) {
				long p2 = Long.valueOf(ip.substring(a, b));
				
				for (int c=b+1;c < ip.length() && p2 < 256 && c < b + 4; c++) {
					long p3 = Long.valueOf(ip.substring(b, c));
					
					for (int d=c+1;d < ip.length() && p3 < 256 && d < c + 4; d++) {
						long p4 = Long.valueOf(ip.substring(d));
						if (p4 < 256) {
							String newIp = p1 + "." + p2 + "." + p3 + "." + p4;
							if (newIp.length() == ip.length()+3)
								System.out.println(newIp);
						} else
								break;
					}
				}
			}
		}
	}
	
}

