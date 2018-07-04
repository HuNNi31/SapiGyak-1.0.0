package com.example.demo;

public class studentPOJO {

		private int ID;
		private String kNev;
		private String vNev;
		private String profile;
		private int year;
		private String Registration;
		private String modification;
		private int status;
		
		
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getkNev() {
			return kNev;
		}
		public void setkNev(String kNev) {
			this.kNev = kNev;
		}
		public String getvNev() {
			return vNev;
		}
		public void setvNev(String vNev) {
			this.vNev = vNev;
		}
		public String getProfile() {
			return profile;
		}
		public void setProfile(String profile) {
			this.profile = profile;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getRegistration() {
			return Registration;
		}
		public void setRegistration(String registration) {
			Registration = registration;
		}
		public String getModification() {
			return modification;
		}
		public void setModification(String modification) {
			this.modification = modification;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "studentPOJO [ID=" + ID + ", kNev=" + kNev + ", vNev=" + vNev + ", profile=" + profile + ", year="
					+ year + ", Registration=" + Registration + ", modification=" + modification + ", status=" + status
					+ "]";
		}
		
		
		
		
}
