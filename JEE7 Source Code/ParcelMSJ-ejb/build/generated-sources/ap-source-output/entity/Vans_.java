package entity;

import entity.Drivers;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-24T01:44:46")
@StaticMetamodel(Vans.class)
public class Vans_ { 

    public static volatile SingularAttribute<Vans, String> vanColor;
    public static volatile SingularAttribute<Vans, Integer> vanId;
    public static volatile SingularAttribute<Vans, Drivers> driverId;
    public static volatile SingularAttribute<Vans, String> vanModel;

}