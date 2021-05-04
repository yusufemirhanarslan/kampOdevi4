package odevCamp4;

public class Gamer {
		
		private String nationalIdentity;
		private String firstName;
		private String lastName;
		private String birthDay;
		
		public Gamer() {
			
		}

		public Gamer(String nationalIdentity, String firstName, String lastName, String birthDay) {
			this.nationalIdentity = nationalIdentity;
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthDay = birthDay;
		}

		public String getNationalIdentity() {
			return nationalIdentity;
		}

		public void setNationalIdentity(String nationalIdentity) {
			this.nationalIdentity = nationalIdentity;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getBirthDay() {
			return birthDay;
		}

		public void setBirthDay(String birthDay) {
			this.birthDay = birthDay;
		}
	
}
