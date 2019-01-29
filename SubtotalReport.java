import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SubtotalReport {
	public File subtotalReport;
	
	public static DecimalFormat df;
	public static String iStudentID;
	public static String iGender;
	public static String oGender, oMajor;
	public static int iMajCode, hMajCode;
	public static int cStudentCtr = 0, cSubStudentCtr = 0;
	public static double iDonationAmt;
	public static double cTotal = 0;
	public static boolean eof = false;
	public static PrintWriter pw;
	public static LocalDate today = LocalDate.now();
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	public static Scanner scanner;
	public static double softDevSub = 0, dieselPowerSub = 0, autoTechSub = 0, laserTechSub = 0, roboticsSub = 0, forensicsSub = 0, machineTechSub = 0, geospatialSub = 0, administrativeSub = 0, accountinSub = 0, weldingTech = 0, autoCollisionTech = 0, aviationSub = 0; 
	
	private static SummaryReport sumReport = new SummaryReport();
	public static void main(String[] args) {
		init();
		
		mainline();
		
		totals();
		
		sumReport.sumMain();
		
		closing();
		
	}
	
	public static void mainline() {
		if (hMajCode != iMajCode) {
			subtotals();
		}
		input();
	}
	
	public static void init() {
		try {
			scanner = new Scanner(new File("ihccfund.dat"));
			scanner.useDelimiter(System.getProperty("line.separator"));
		} catch(FileNotFoundException e) {
			System.out.println("input file error");
		}
		
		try {
			pw = new PrintWriter(new File("C:\\Java\\subtotal.prt"));
		} catch (FileNotFoundException e1) {
			System.out.println("output file error");
		}
		
		df = new DecimalFormat("$#,###,###.00");
		
		pw.format("%-30s%12s%8s%15s%10s%n", "Indian Hills Community College", " ", "Student Fundraiser", " ", dtf.format(today));
		pw.format("%n%10s%9s%-6s%20s%5s%23s%10s%n", "Student ID", " ", "Gender", " ", "Major", " ", "Contribution");
		
		hMajCode = iMajCode;
		
		input();
	}
	
	public static void input() {
		String record;
		String s;
		while (!eof) {
			if (scanner.hasNext()) {
				record = scanner.next();
				iStudentID = record.substring(0, 7);
				iGender = record.substring(7, 8);
				s = record.substring(8, 10);
				iMajCode = Integer.parseInt(s);
				s = record.substring(10, 17);
				if (hMajCode != iMajCode) {
					subtotals();
				}
				iDonationAmt = Double.parseDouble(s);
				output();
				
				calcs();
				if (iGender.equals("M")) {
					SummaryReport.maleCalcs();
				} else if (iGender.equals("F")) {
					SummaryReport.femaleCalcs();
				}
			} else {
				eof = true;
			}
			
			hMajCode = iMajCode;
		}

	}
	
	public static void output() {
		if (iGender.equals("M")) {
			oGender = "Male";
		} else if (iGender.equals("F")) {
			oGender = "Female";
		}
		
		switch (hMajCode) {
		case 1 :
			oMajor = "Computer Software Development";
			break;
		case 2 :
			oMajor = "Diesel Power Systems Technology";
			break;
		case 3:
			oMajor = "Automotive Technology";
			break;
		case 4 :
			oMajor = "Laser/Electro-optics Technology";
			break;
		case 5 :
			oMajor = "Robotics/Automation Technology";
			break;
		case 6:
			oMajor = "Digital Forensics";
			break;
		case 7 :
			oMajor = "Machine Technology";
			break;
		case 8 :
			oMajor = "Geospatial Technology";
			break;
		case 9:
			oMajor = "Administrative Assistant";
			break;
		case 10 :
			oMajor = "Accounting Assistant";
			break;
		case 11 :
			oMajor = "Welding Technology";
			break;
		case 12 :
			oMajor = "Automotive Collision Technology";
			break;
		case 13 :
			oMajor = "Aviation Pilot Training";
			break;
		}
		
		pw.format("%9s%10s%-15s%-40s%10s%n", iStudentID, " ", oGender, oMajor, df.format(iDonationAmt));
	}
	
	public static void calcs() {
		
		switch (iMajCode) {
		case 1 :
			softDevSub = softDevSub + iDonationAmt;
			break;
		case 2 :
			dieselPowerSub = dieselPowerSub + iDonationAmt;
			break;
		case 3 :
			autoTechSub = autoTechSub + iDonationAmt;
			break;
		case 4 :
			laserTechSub = laserTechSub + iDonationAmt;
			break;
		case 5 :
			roboticsSub = roboticsSub + iDonationAmt;
			break;
		case 6 :
			forensicsSub = forensicsSub + iDonationAmt;
			break;
		case 7 :
			machineTechSub = machineTechSub + iDonationAmt;
			break;
		case 8 :
			geospatialSub = geospatialSub + iDonationAmt;
			break;
		case 9 :
			administrativeSub = administrativeSub + iDonationAmt;
			break;
		case 10 :
			accountinSub = accountinSub + iDonationAmt;
			break;
		case 11 :
			weldingTech = weldingTech + iDonationAmt;
			break;
		case 12 :
			autoCollisionTech = autoCollisionTech + iDonationAmt;
			break;
		case 13 :
			aviationSub = aviationSub + iDonationAmt;
			break;
		}
		cStudentCtr++;
		cSubStudentCtr++;
	}
	
	public static void subtotals() {
		switch (hMajCode) {
		case 1 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(softDevSub));
			break;
		case 2 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(dieselPowerSub));
			break;
		case 3:
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(autoTechSub));
			break;
		case 4 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(laserTechSub));
			break;
		case 5 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(roboticsSub));
			break;
		case 6:
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(forensicsSub));
			break;
		case 7 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(machineTechSub));
			break;
		case 8 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(geospatialSub));
			break;
		case 9:
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(administrativeSub));
			break;
		case 10 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(accountinSub));
			break;
		case 11 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(weldingTech));
			break;
		case 12 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(autoCollisionTech));
			break;
		case 13 :
			pw.format("%n%40s%10s%-12s%-2s%10s%10s%n%n", oMajor, " ", "Students: ", cSubStudentCtr, " ", df.format(aviationSub));
			break;
		}
		cSubStudentCtr = 0;
		hMajCode = iMajCode;
	}
	
	public static void totalOut() {
		cTotal = aviationSub + autoCollisionTech + weldingTech + accountinSub + administrativeSub + geospatialSub + machineTechSub + forensicsSub + roboticsSub + laserTechSub + autoTechSub + dieselPowerSub + softDevSub;
		pw.format("%n%18s%-16s%3s%10s%15s%-15s", " ", "Total Students: ", cStudentCtr, " ", "Total Amount: ", df.format(cTotal));
	}
	
	public static void totals() {
		subtotals();
		
		totalOut();
	}
	
	public static void closing() {
		pw.close();
		
		System.exit(1);
	}
}
