package com.example.demo.Model;




public class AdminModel {
    
      
        private String  Email;
     	private String Password;
     	public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getMobileNumber() {
			return MobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			MobileNumber = mobileNumber;
		}
		public String getUserRole() {
			return UserRole;
		}
		public void setUserRole(String userRole) {
			UserRole = userRole;
		}
		private String MobileNumber;
     	private String UserRole;

}