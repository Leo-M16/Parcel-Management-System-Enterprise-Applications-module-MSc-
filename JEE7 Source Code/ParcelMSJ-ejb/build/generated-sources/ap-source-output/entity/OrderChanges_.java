package entity;

import entity.Orders;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T16:14:52")
@StaticMetamodel(OrderChanges.class)
public class OrderChanges_ { 

    public static volatile SingularAttribute<OrderChanges, Integer> driverId;
    public static volatile SingularAttribute<OrderChanges, Orders> orderId;
    public static volatile SingularAttribute<OrderChanges, Integer> orderChangeId;
    public static volatile SingularAttribute<OrderChanges, Date> newCollectionDate;
    public static volatile SingularAttribute<OrderChanges, Date> collectionDate;

}