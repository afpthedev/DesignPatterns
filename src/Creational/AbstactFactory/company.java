package Creational.AbstactFactory;

import Creational.AbstactFactory.Msi.MSİ;
import Creational.AbstactFactory.asus.ASUS;

public abstract class company {
    protected abstract ASUS createAsus(String ASUS);
    public abstract MSİ createMsi(String MSİ);
}
