package tpLambda;

public class PersonneDTO {

		private Integer code;
		
		private String nom;
		
		private String genre;
		
		private Integer age;
		
		public PersonneDTO(Integer code, String nom, Integer age, String genre) {
			this.code = code;
			this.nom = nom;
			this.age = age;
			this.genre = genre;
		}

		/**
		 * @return the code
		 */
		public Integer getCode() {
			return code;
		}

		/**
		 * @param code the code to set
		 */
		public void setCode(Integer code) {
			this.code = code;
		}

		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/**
		 * @return the genre
		 */
		public String getGenre() {
			return genre;
		}

		/**
		 * @param genre the genre to set
		 */
		public void setGenre(String genre) {
			this.genre = genre;
		}

		/**
		 * @return the age
		 */
		public Integer getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "PersonneDTO [code=" + code + ", nom=" + nom + ", genre=" + genre + ", age=" + age + "]";
		}
}
