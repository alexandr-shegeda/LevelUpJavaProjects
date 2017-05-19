package hiber;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Post.class)
public abstract class Post_ {

	public static volatile SingularAttribute<Post, Long> id;
	public static volatile SingularAttribute<Post, String> title;
	public static volatile SingularAttribute<Post, Date> creationDate;
	public static volatile ListAttribute<Post, Employee> employees;

}

