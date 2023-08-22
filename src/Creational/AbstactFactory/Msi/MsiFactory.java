package Creational.AbstactFactory.Msi;

import Creational.AbstactFactory.asus.ASUS;
import Creational.AbstactFactory.company;

public class MsiFactory extends company
{
    @Override
    protected ASUS createAsus(String ASUS) {
        System.out.println("Asus Created");
        return null;
    }

    @Override
    public MSİ createMsi(String MSİ) {
        System.out.println();
        return null;
    }
}
