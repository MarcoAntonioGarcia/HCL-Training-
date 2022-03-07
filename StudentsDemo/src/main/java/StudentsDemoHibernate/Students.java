package StudentsDemoHibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "TYPE")
//@Table(name="EmpleadosTable")
	public class Students {
	
	    @Id
	    //@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer studentId;
		private String name; 
		private int age;
		
	    //@ManyToMany(fetch=FetchType.EAGER)

		public Integer getStudentId() {
			return studentId;
		}
		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	
		public Students(Integer studentId, String name, int age, List<Course> course) {
			super();
			this.studentId = studentId;
			this.name = name;
			this.age = age;
			//this.course = course;
		}
		public Students() {
		}
		@Override
		public String toString() {
			return "Students [studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
		}
		
		

}

