import java.sql.*;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
	private static final int min = 100;
	private static final int max = 999;

	public static class user {
		private String username;
		private String password;
		Scanner sc = new Scanner(System.in);

		public String username() {
			System.out.println(" Enter user name :-");
			username = sc.nextLine();
			return username;
		}

		public String password() {
			System.out.println("Enter password :");
			password = sc.nextLine();
			return password;
		}
	}

	public static class pnr {
		private int pnrnum;
		private String name;
		private String trainNumber;
		private String classtype;
		private String date;
		private String from;
		private String to;
		Scanner sc = new Scanner(System.in);

		public int pnrn() {
			Random ra = new Random();
			pnrnum = ra.nextInt(max) + min;
			return pnrnum;
		}

		public String name() {
			System.out.println("Enter passenger name :");
			name = sc.nextLine();
			return name;
		}

		public String traindetails() {
			System.out.println("Enter train number :");
			trainNumber = sc.nextLine();
			return trainNumber;
		}

		public String classoftrain() {
			System.out.println("Enter class type :");
			classtype = sc.nextLine();
			return classtype;
		}

		public String date() {
			System.out.println("Enter date of journey :");
			date = sc.nextLine();
			return date;
		}

		public String from() {
			System.out.println("Enter starting point to the journey :");
			from = sc.nextLine();
			return from;
		}

		public String to() {
			System.out.println("Enter destination of the journey :");
			to = sc.nextLine();
			return to;
		}
	}

	// private static String className;

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		user u = new user();
		String username = u.username();
		String password = u.password();

		String url = "jdbc:mysql://localhost:3306/root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (
					Connection conn = DriverManager.getConnection(url, username, password)) {
				System.out.println("user connection granted");
				while (true) {
					String Insert = "insert into reservation values(?,?,?,?,?,?,?)";
					String delete = "Delete from reservation where pnr=?";
					String show = "select * from reservation";
					System.out.println("Enter the choice :");
					System.out.println("1. Insert Record");
					System.out.println("2. Delete Record ");
					System.out.println("3.  Show record");
					System.out.println("4. Exit");
					int option = sc.nextInt();
					if (option == 1) {
						pnr p = new pnr();
						int pn = p.pnrn();
						String passengerName = p.name();
						String TrainNumber = p.traindetails();
						String clstyp = p.classoftrain();
						String jdate = p.date();
						String from = p.from();
						String to = p.to();
						try (PreparedStatement pre = conn.prepareStatement(Insert)) {
							pre.setInt(1, pn);
							pre.setString(2, passengerName);
							pre.setString(3, TrainNumber);
							pre.setString(4, clstyp);
							pre.setString(5, jdate);
							pre.setString(6, from);
							pre.setString(7, to);
							int rowchange = pre.executeUpdate();
							if (rowchange > 0) {
								System.out.println("Record added");
							} else {
								System.out.println("Records are not added");
							}

						} catch (SQLException e) {
							System.out.println(" SQL Exception :" + e);
						}
					} else if (option == 2) {
						System.out.println("Enter the pnr number for delete the record");
						int pnr = sc.nextInt();
						try (PreparedStatement pre = conn.prepareStatement(delete)) {
							pre.setInt(1, pnr);
							int rowchange = pre.executeUpdate();
							if (rowchange > 0) {
								System.out.println("Record deleted");
							} else {
								System.out.println("Records are not deleted");
							}

						} catch (SQLException e) {
							System.out.println(" SQL Exception :" + e);
						}
					} else if (option == 3) {
						try (PreparedStatement pre = conn.prepareStatement(show);
								ResultSet re = pre.executeQuery()) {
							System.out.println(" \t\t\t\t|-*-*-*-*-*-*-*-*-*-*-*-*-All Records-*-*-*-*-*-*-*-*-*-|");
							System.out.println(
									"_____________________________________________________________________________________________________________________________________");
							System.out
									.println("PNR number\t PassengerName\t Train_num\t\tClassType\tJourney_date\tFrom\t\t To");
							System.out.println(
									"_____________________________________________________________________________________________________________________________________");

							while (re.next()) {
								String pnr = re.getString("pnr");
								String pName = re.getString("pName");
								String trainnum = re.getString("Trainnum");
								String classtyp = re.getString("Classtype");
								String Date = re.getString("jDate");
								String Start = re.getString("start");
								String Ending = re.getString("end");

								System.out.println("   " + pnr + "\t\t" + pName + "\t\t\t" + trainnum + "\t\t" + classtyp + "\t\t"
										+ Date + "\t\t" + Start + "\t\t" + Ending);
								System.out.println(
										"______________________________________________________________________________________________________________________________________");
							}
						} catch (SQLException e) {
							System.out.println(" SQL Exception :" + e);
						}
					} else if (option == 4) {
						System.out.println("exiting");
						break;
					} else {
						System.out.println("Invalid option");
					}
				}
			} catch (SQLException e) {
				System.out.println(" SQL Exception :" + e);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(" SQL Exception :" + e);
		}
		sc.close();
	}
}
