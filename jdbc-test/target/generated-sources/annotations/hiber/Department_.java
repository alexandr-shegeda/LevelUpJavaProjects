package hiber;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Department.class)
public abstract class Department_ {

	public static volatile SingularAttribute<Department, Long> id;
	public static volatile SingularAttribute<Department, String> title;
	public static volatile SingularAttribute<Department, Date> creationDate;
	public static volatile ListAttribute<Department, Employee> employees;

}

