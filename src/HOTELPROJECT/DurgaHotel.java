package HOTELPROJECT;

import java.util.Scanner;

public class DurgaHotel {
	static Scanner sc = new Scanner(System.in);
	static WelcomePage wc = new WelcomePage();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("*****************DHURGA HOTEL********************");
		boolean flag = true;
		while (flag) {
			System.out.println("=============================================================="+
					"\n1.Signup\n2.Login\n3.Logout\n===============================================\nSelect the option");
			switch (sc.nextInt()) {
			case 1:{
				System.out.println(
						"=======================WELCOME TO SIGNUP PAGE=======================\nEnter your name");
				String name = sc.next();
				System.out.println("Enter your Email");
				String email = sc.next();
				System.out.println("Enter your Mobile number");
				long mobilenumber = sc.nextLong();
				System.out.println("Enter your Username");
				String username = sc.next();
				System.out.println("Enter your Password");
				String password = sc.next();
				wc.signup(name, email, mobilenumber, username, password);
				Thread.sleep(2000);
			}break;
			case 2:
				{System.out
						.println("===================WELCOME TO LOGIN PAGE=====================\nenter your Username ");
				String username1 = sc.next();
				System.out.println("enter your Password ");
				String password1 = sc.next();
				wc.login(username1, password1);
				Thread.sleep(2000);
				
				}break;
			case 3:{
				flag = false;
				System.out.println("***********Thank You ViSit Again******************");

			}break;
			default:System.err.println("select valid option");
			}
		}
	}
}

class WelcomePage {
	String name;
	String email;
	long mobilenumber;
	String username;
	String password;
	double billamount;
	int dosa;
	int idlly;
	int vada;
	int cbiriyani;
	int mbiriyani;
	int clollipup;

	static Scanner sc = new Scanner(System.in);

	void signup(String name, String email, long mobilenumber, String username, String password) {
		this.name = name;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.username = username;
		this.password = password;
		System.out.println("Signup Successfully done");
	}

	void login(String username, String password) {
		boolean flag = true;
		while (flag) {
			if ((password.equals(this.password)) && (username.equals(this.username))) {
				System.out.println("**********WELCOME TO DHURGA HOTEL HOME PAGE************ ");
				System.out.println(
						"1.Order Food\n2.Check BillAmount\n3.Cancel items\n4.cancel order\n5.profile\n6.back\n=================================================\n select the option");
				switch (sc.nextInt()) {
				case 1: {
					orderfood();
				}
					break;
				case 2: {
					chackAmount();
				}
					break;
				case 3: {
					cancelOrder();
				}
					break;
				case 4:{
					   dosa=0;
					   idlly=0;
					   vada=0;
					   cbiriyani=0;
					   mbiriyani=0;
					   clollipup=0;
					   billamount=0;
					   System.out.println("===========================================================================\nYour order cancelled  successfullly..........");
				}break;
					
	case 5: {
					profile();
				}
					break;
				case 6: {
					flag = false;
				}break;
				default: {
					System.err.println("=====================================================\nselect valid option");
				}

				}
			} else {
				System.err.println("incorrect Username and password");
				break;
			}
		}
	}

	void profile() {
		System.out.println("==============   Profile   ================" + "\nName                :" + name
				+ "\nEmail               :" + email + "\nMobile no           :" + mobilenumber + "\nUsername            :"
				+ username + "\nPassword            :" + password
				+ "\n=====================================================");

	}

	void orderfood() {
		boolean flag = true;
		while (flag) {
			System.out.println(
					"======================  Order food  ==================\n1.veg\n2.non-veg\n3.back\n==========================================\nselect the option");
			switch (sc.nextInt()) {
			case 1: {
				veg();
			}
				break;
			case 2: {
				non_veg();
			}
				break;
			case 3: {
				flag = false;
			}
				break;
			default: {
				System.err.println("select valid option");
			}
			}

		}

	}

	void non_veg() {
		boolean flag = true;
		while (flag) {
			System.out.println("=======================  NON-VEG  =============================="
					+ "\n1.chikan biriyani                =180/plate" + "\n2.mutton biriyani                 =250/plate"
					+ "\n3.chikan lollipup                =200/plate" + "\n4.back\n=====================================================\nselect the option");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter the number of plates of chikan biriyani");
				int qty = sc.nextInt();
				cbiriyani = cbiriyani + qty;
				billamount = billamount + (cbiriyani * 180);
				System.out.println("=======================================================\n"+qty + " plate chikan biriyani added");

			}
				break;

			case 2: {
				System.out.println("enter the number of plates of mutton biriyani");
				int qty = sc.nextInt();
				mbiriyani = mbiriyani + qty;
				billamount = billamount + (mbiriyani * 250);
				System.out.println("=========================================================\n"+qty
						+ " plate mutton biriyani added");
			}
				break;

			case 3: {
				System.out.println("enter the number of plates of chikan lollipup");
				int qty = sc.nextInt();
				clollipup = clollipup + qty;
				billamount = billamount + (clollipup * 200);
				System.out.println("=============================================================\n"+qty
						+ " plate chikan lollipup added");

			}
				;
				break;
			case 4: {
				flag = false;
			}
				break;
			default: {
				System.err.println("select valid option");
			}
			}

		}

	}

	void veg() {
		boolean flag = true;
		while (flag) {
			System.out
					.println("======================  VEG  ===============================" + "\n1.dosa              =30/plate"
							+ "\n2.idlly             =40/plate" + "\n3.vada              =50/plate" + "\n4.back\n==========================================================\nselect the option");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter the number of plates of ");
				int qty = sc.nextInt();
				dosa = dosa + qty;
				billamount = billamount + (dosa * 30);
				System.out
						.println("==========================================================\n"+qty + " plate dosa added");

			}
				break;

			case 2: {
				System.out.println("enter the number of plates");
				int qty = sc.nextInt();
				idlly = idlly + qty;
				billamount = billamount + (idlly * 40);
				System.out.println("=============================================================\n"+	qty + " plate idlly added");
			}
				break;

			case 3: {
				System.out.println("enter the number of plates");
				int qty = sc.nextInt();
				vada = vada + qty;
				billamount = billamount + (vada * 50);
				System.out.println("================================================================\n"+qty + " plate vada added");

			}
				;
				break;
			case 4: {
				flag = false;
			}
				break;
			default: {
				System.err.println("select valid option");
			}
			}

		}

	}

	void chackAmount() {
		System.out.println("=====================  Bill Amount  =========================");
		    System.out.println("    Item                  QTY                Amount"
				+ "\n=================================================================");
		if (dosa >= 1)
			System.out.println("    Dosa                   " + dosa + "                  " + dosa * 30);
		if (idlly >= 1)
			System.out.println("    idlly                  " + idlly + "                  " + idlly * 40);
		if (vada >= 1)
			System.out.println("    vada                   " + vada + "                  " + vada * 50);
		if (cbiriyani >= 1)
			System.out.println("    Chikan Biriyani        " + cbiriyani + "                  " + cbiriyani * 180);
		if (mbiriyani >= 1)
			System.out.println("    Mutton Biriyani        " + mbiriyani + "                  " + mbiriyani * 250);
		if (clollipup >= 1)
			System.out.println("    Chikan  Lollipup       " + clollipup + "                  " + clollipup * 200);
		System.out.println("======================================================================="
			                 + "\n    Total Bill Amount                       :" + billamount
				+ "\n=================================================================");
	}

	void cancelOrder() {
		boolean flag = true;
		while (flag) {
			System.out.println("========================  Cancel items  ================================"
		                                               +"\n  item                         QTY" 
					          +"\n========================================================================" );
					if(dosa>=1){System.out.println(     "1.dosa                          "+dosa);}
					if(idlly>=1){System.out.println(    "2.idlly                         "+idlly);}
					if(vada>=1){System.out.println(     "3.vada                          "+vada);}
					if(cbiriyani>=1){System.out.println("4.chikan biriyani               "+cbiriyani);}
					if(mbiriyani>=1){System.out.println("5.mutton biriyani               "+mbiriyani);}
					if(clollipup>=1){System.out.println("6.chikan lollipup               "+clollipup);}
					System.out.println("7.back\n================================================================\nselect the option");
			switch (sc.nextInt()) {
			case 1: {
				if (dosa >= 1) {
					System.out.println("enter the no of Dasa you want to cancel  :" + dosa);
					int qty = sc.nextInt();
					if (qty <= dosa) {
						billamount = billamount - (qty * 30);
						dosa = dosa - qty;
					} else
						System.err.println("Please enter valid input");
				} else
					System.err.println("you not ordered this item");
			}break;

			case 2: {
				if (idlly >= 1) {
					System.out.println("enter the no of idlly you want to cancel  :" + idlly);
					int qty = sc.nextInt();
					if (qty <= idlly) {
						billamount = billamount - (qty * 40);
						idlly = idlly - qty;
					} else
						System.err.println("Please enter valid input");
				} else
					System.err.println("you not ordered this item");
			}break;
			case 3: {
				if (vada >= 1) {
					System.out.println("enter the no of vada you want to cancel  :" + vada);
					int qty = sc.nextInt();
					if (qty <= vada) {
						billamount = billamount - (qty * 50);
						vada = vada - qty;
					} else
						System.err.println("Please enter valid input");
				} else
					System.err.println("you not ordered this item");
			}break;
			case 4: {
				if (cbiriyani >= 1) {
					System.out.println("enter the no of chikan biriyani you want to cancel  :" + cbiriyani);
					int qty = sc.nextInt();
					if (qty <= cbiriyani) {
						billamount = billamount - (qty * 180);
						cbiriyani = cbiriyani - qty;
					} else
						System.err.println("Please enter valid input");
				} else
					System.err.println("you not ordered this item");
			}break;

			case 5: {
				if (mbiriyani >= 1) {
					System.out.println("enter the no of mutton biriyani you want to cancel  :" + mbiriyani);
					int qty = sc.nextInt();
					if (qty <= mbiriyani) {
						billamount = billamount - (qty * 250);
						mbiriyani = mbiriyani - qty;
					} else
						System.err.println("Please enter valid input");
				} else
					System.err.println("you not ordered this item");
			}break;

			case 6: {
				if (clollipup >= 1) {
					System.out.println("enter the no of chikan lollipup you want to cancel  :" + clollipup);
					int qty = sc.nextInt();
					if (qty <= clollipup) {
						billamount = billamount - (qty * 180);
						clollipup = clollipup - qty;
					} else
						System.err.println("Please enter valid input");
				} else
					System.err.println("you not ordered this item");
			}break;

			case 7: {
				flag = false;
				System.out.println("=====================  Bill Amount  =========================");
			    System.out.println("    Item                  QTY                Amount"
					+ "\n=================================================================");
			if (dosa >= 1)
				System.out.println("    Dosa                   " + dosa + "                  " + dosa * 30);
			if (idlly >= 1)
				System.out.println("    idlly                  " + idlly + "                  " + idlly * 40);
			if (vada >= 1)
				System.out.println("    vada                   " + vada + "                  " + vada * 50);
			if (cbiriyani >= 1)
				System.out.println("    Chikan Biriyani        " + cbiriyani + "                  " + cbiriyani * 180);
			if (mbiriyani >= 1)
				System.out.println("    Mutton Biriyani        " + mbiriyani + "                  " + mbiriyani * 250);
			if (clollipup >= 1)
				System.out.println("    Chikan  Lollipup       " + clollipup + "                  " + clollipup * 200);
			System.out.println("======================================================================="
				                 + "\n    Total Bill Amount                       :" + billamount
					+ "\n=================================================================");

			}break;
			default:
				System.err.println("select valid option");

			}
		}

	}
}
