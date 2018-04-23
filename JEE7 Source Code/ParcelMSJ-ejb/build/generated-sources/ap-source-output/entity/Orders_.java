package entity;

import entity.Customers;
import entity.Drivers;
import entity.OrderChanges;
import entity.Parcels;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T16:41:05")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Drivers> driverId;
    public static volatile SingularAttribute<Orders, Integer> orderId;
    public static volatile SingularAttribute<Orders, Customers> customerId;
    public static volatile SingularAttribute<Orders, String> orderStatus;
    public static volatile CollectionAttribute<Orders, OrderChanges> orderChangesCollection;
    public static volatile SingularAttribute<Orders, Date> collectionDate;
    public static volatile CollectionAttribute<Orders, Parcels> parcelsCollection;

}