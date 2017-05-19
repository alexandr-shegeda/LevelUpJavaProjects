package hiber;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> lastName;
	public static volatile SingularAttribute<Employee, String> zipCode;
	public static volatile SingularAttribute<Employee, String> city;
	public static volatile SingularAttribute<Employee, Sex> sex;
	public static volatile SingularAttribute<Employee, Double> salary;
	public static volatile SingularAttribute<Employee, Date> creationDate;
	public static volatile SingularAttribute<Employee, String> firstName;
	public static volatile SingularAttribute<Employee, String> streetName;
	public static volatile SingularAttribute<Employee, PhoneNumber> phoneNumber;
	public static volatile SingularAttribute<Employee, Post> post;
	public static volatile SingularAttribute<Employee, Car> car;
	public static volatile SingularAttribute<Employee, Long> id;
	public static volatile SingularAttribute<Employee, Department> department;
	public static volatile SingularAttribute<Employee, String> secondName;

}

