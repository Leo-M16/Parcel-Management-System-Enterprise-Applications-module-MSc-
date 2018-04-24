package entity;

import entity.Orders;
import entity.Vans;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-24T01:44:46")
@StaticMetamodel(Drivers.class)
public class Drivers_ { 

    public static volatile SingularAttribute<Drivers, String> firstname;
    public static volatile SingularAttribute<Drivers, Integer> driverId;
    public static volatile SingularAttribute<Drivers, String> surname;
    public static volatile CollectionAttribute<Drivers, Vans> vansCollection;
    public static volatile CollectionAttribute<Drivers, Orders> ordersCollection;
    public static volatile SingularAttribute<Drivers, String> status;

}