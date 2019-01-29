import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SummaryReport extends SubtotalReport{
	
	static File summaryRpt;
	static PrintWriter pw2;
	static double maleSum = 0, femaleSum = 0, informationTechSum = 0, manufacturingTechSum = 0, transportationTechSum = 0, maleInfoTechSum = 0, 
			femaleInfoTechSum = 0, maleManufactureTechSum = 0, femaleManufactureTechSum = 0, maleTransportTechSum = 0, femaleTransportTechSum = 0, overallSum = 0;
	static double maleAvg = 0, femaleAvg = 0, infoTechAvg = 0, manuTechAvg = 0, transportTechAvg = 0, maleInfoTechAvg = 0, femaleInfoTechAvg = 0, maleManuTechAvg = 0, 
			femaleManuTechAvg = 0, maleTranTechAvg = 0, femaleTranTechAvg = 0, overallAvg = 0;
	static int maleCtr = 0, femaleCtr = 0, infoTechCtr = 0, manuTechCtr = 0, tranTechCtr = 0, maleInfoCtr = 0, femaleInfoCtr = 0, maleManuCtr = 0, femaleManuCtr = 0,
			maleTranCtr = 0, femaleTranCtr = 0, overallCtr = 0;;
	
	public void sumMain() {
		sumInit();

		sumOutput();
		
		sumClosing();
	}

	public static void sumInit() {
		try {
			pw2 = new PrintWriter(new File("C:\\Java\\summary.prt"));
		} catch (FileNotFoundException e1) {
			System.out.println("output file error");
		}
		pw2.format("%-30s%12s%8s%19s%10s%n", "Indian Hills Community College", " ", "Summary Report", " ", dtf.format(today));
		pw2.format("%8s%18s%7s%15s%15s%14s%15s%n%n", "Grouping", " ","Students", " ", "Amount Raised", " ", "Average Amount");

	}
	
	public static void sumClosing() {
		pw2.close();
	}
	
	public static void maleCalcs() {
		if (iDonationAmt > 500) {
			overallSum = overallSum + iDonationAmt;
			overallCtr++;
			maleCtr++;
		}
		switch (iMajCode) {
		case 1 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				maleInfoTechSum = maleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				maleInfoCtr++;
			}
			break;
		case 2 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				maleTransportTechSum = maleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				maleTranCtr++;
			}
			break;
		case 3 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				maleTransportTechSum = maleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				maleTranCtr++;
			}
			break;
		case 4 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				maleManufactureTechSum = maleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				maleManuCtr++;
			}
			break;
		case 5 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				maleManufactureTechSum = maleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				maleManuCtr++;
			}
			break;
		case 6 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				maleInfoTechSum = maleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				maleInfoCtr++;
			}
			break;
		case 7 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				maleManufactureTechSum = maleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				maleManuCtr++;
			}
			break;
		case 8 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				maleInfoTechSum = maleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				maleInfoCtr++;
			}
			break;
		case 9 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				maleInfoTechSum = maleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				maleInfoCtr++;
			}
			break;
		case 10 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				maleInfoTechSum = maleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				maleInfoCtr++;
			}
			break;
		case 11 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				maleManufactureTechSum = maleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				maleManuCtr++;
			}
			break;
		case 12 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				maleTransportTechSum = maleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				maleTranCtr++;
			}
			break;
		case 13 :
			if (iDonationAmt > 500) {
				maleSum = maleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				maleTransportTechSum = maleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				maleTranCtr++;
			}
			break;
		}
		
		return;
	}
	
	public static void femaleCalcs() {
		if (iDonationAmt > 500) {
			overallSum = overallSum + iDonationAmt;
			overallCtr++;
			femaleCtr++;
		}
		switch (iMajCode) {
		case 1 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				femaleInfoTechSum = femaleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				femaleInfoCtr++;
			}
			break;
		case 2 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				femaleTransportTechSum = femaleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				femaleTranCtr++;
			}
		case 3 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				femaleTransportTechSum = femaleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				femaleTranCtr++;
			}
			break;
		case 4 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				femaleManufactureTechSum = femaleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				femaleManuCtr++;
			}
			break;
		case 5 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				femaleManufactureTechSum = femaleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				femaleManuCtr++;
			}
			break;
		case 6 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				femaleInfoTechSum = femaleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				femaleInfoCtr++;
			}
			break;
		case 7 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				femaleManufactureTechSum = femaleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				femaleManuCtr++;
			}
			break;
		case 8 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				femaleInfoTechSum = femaleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				femaleInfoCtr++;
			}
			break;
		case 9 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				femaleInfoTechSum = femaleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				femaleInfoCtr++;
			}
			break;
		case 10 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				informationTechSum = informationTechSum + iDonationAmt;
				femaleInfoTechSum = femaleInfoTechSum + iDonationAmt;
				infoTechCtr++;
				femaleInfoCtr++;
			}
			break;
		case 11 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				manufacturingTechSum = manufacturingTechSum + iDonationAmt;
				femaleManufactureTechSum = femaleManufactureTechSum + iDonationAmt;
				manuTechCtr++;
				femaleManuCtr++;
			}
			break;
		case 12 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				femaleTransportTechSum = femaleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				femaleTranCtr++;
			}
		case 13 :
			if (iDonationAmt > 500) {
				femaleSum = femaleSum + iDonationAmt;
				transportationTechSum = transportationTechSum + iDonationAmt;
				femaleTransportTechSum = femaleTransportTechSum + iDonationAmt;
				tranTechCtr++;
				femaleTranCtr++;
			}
		}
		
		return;
	}
	
	public void sumOutput() {
		maleAvg = maleSum / maleCtr;
		femaleAvg = femaleSum / femaleCtr;
		infoTechAvg = informationTechSum / infoTechCtr;
		manuTechAvg = manufacturingTechSum / manuTechCtr;
		transportTechAvg = transportationTechSum / tranTechCtr;
		maleInfoTechAvg = maleInfoTechSum / maleInfoCtr;
		femaleInfoTechAvg = femaleInfoTechSum / femaleInfoCtr;
		maleManuTechAvg = maleManufactureTechSum / maleManuCtr;
		femaleManuTechAvg = femaleManufactureTechSum / femaleManuCtr;
		maleTranTechAvg = maleTransportTechSum / maleTranCtr;
		femaleTranTechAvg = femaleTransportTechSum / femaleTranCtr;
		overallAvg = overallSum / overallCtr;
		
		pw2.format("%-29s%2s%21s%-10s%18s%10s%n", "Males", maleCtr, " ", df.format(maleSum), " ", df.format(maleAvg));
		pw2.format("%-29s%2s%21s%-10s%18s%10s%n", "Females", femaleCtr, " ", df.format(femaleSum), " ", df.format(femaleAvg));
		pw2.format("%-29s%2s%21s%-10s%19s%10s%n", "Information Tech", infoTechCtr, " ", df.format(informationTechSum), " ", df.format(infoTechAvg));
		pw2.format("%-29s%2s%21s%-10s%18s%10s%n", "Manufacturing Tech", manuTechCtr, " ", df.format(manufacturingTechSum), " ", df.format(manuTechAvg));
		pw2.format("%-29s%2s%21s%-10s%18s%10s%n", "Transportation Tech", tranTechCtr, " ", df.format(transportationTechSum), " ", df.format(transportTechAvg));
		pw2.format("%-29s%2s%21s%-10s%19s%10s%n", "Male Information Tech", maleInfoCtr, " ", df.format(maleInfoTechSum), " ", df.format(maleInfoTechAvg));
		pw2.format("%-29s%2s%21s%-10s%19s%10s%n", "Female Information Tech", femaleInfoCtr, " ", df.format(femaleInfoTechSum), " ", df.format(femaleInfoTechAvg));
		pw2.format("%-29s%2s%21s%-10s%19s%10s%n", "Male Manufacturing Tech", maleManuCtr, " ", df.format(maleManufactureTechSum), " ", df.format(maleManuTechAvg));
		pw2.format("%-29s%2s%21s%-10s%19s%10s%n", "Female Manufacturing Tech", femaleManuCtr, " ", df.format(femaleManufactureTechSum), " ", df.format(femaleManuTechAvg));
		pw2.format("%-29s%2s%21s%-10s%18s%10s%n", "Male Transportation Tech", maleTranCtr, " ", df.format(maleTransportTechSum), " ", df.format(maleTranTechAvg));
		pw2.format("%-29s%2s%21s%-10s%18s%10s%n", "Female Transportation Tech", femaleTranCtr, " ", df.format(femaleTransportTechSum), " ", df.format(femaleTranTechAvg));
		pw2.format("%-29s%2s%21s%-10s%18s%10s%n", "Overall", overallCtr, " ", df.format(overallSum), " ", df.format(overallAvg));
		
		
	}

	
}
