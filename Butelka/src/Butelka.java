public class Butelka {

    private double pojemnosc;
    private double ileWlane;

    public double getPojemnosc()
    {
        return pojemnosc;
    }

   private void setIleWlane(double ileWlane) {

        this.ileWlane = ileWlane;
    }

    public double getIleWlane() {
        return ileWlane;
    }

    void wlej(double ile) {
        double moznaWlac = pojemnosc - ileWlane;
        System.out.println("Do butelki można wlać " + moznaWlac);
        if (moznaWlac >= ile) {
            setIleWlane(ileWlane += ile);
            System.out.print("wlano " + ile + "L ");
            System.out.println("W butelce jest nalane " + getIleWlane() + "L.");
        }else {
            setIleWlane(ileWlane + moznaWlac);
            System.out.println("Do wlania było " + ile + "L");
            System.out.println("Twoja butelka jest za mała więc wlano tylko " + moznaWlac + "L");
        }

    }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[3];
        for (int i=0; i<butelka.length; i++)
        {
            butelka[i] = new Butelka();
        }

        butelka[0].pojemnosc = 1.4;
        butelka[1].pojemnosc = 3.2;
        butelka[2].pojemnosc = 5.2;

        for (int i=0; i<butelka.length; i++)
        {
            System.out.println("Butelka " + i + " ma pojemność " + butelka[i].getPojemnosc() + "L");
        }
        System.out.println();
        butelka[0].wlej(1.5);
        System.out.println("wlane " + butelka[0].getIleWlane() + " pojemność " + butelka[0].getPojemnosc());
        butelka[1].wlej(3);
        System.out.println("wlane " + butelka[1].getIleWlane() + " pojemność " + butelka[1].getPojemnosc());
        butelka[2].wlej(4);
        System.out.println("wlane " + butelka[2].getIleWlane() + " pojemność " + butelka[2].getPojemnosc());

        System.out.println();
        butelka[0].wlej(0.6);
        System.out.println("wlane " + butelka[0].getIleWlane() + " pojemność " + butelka[0].getPojemnosc());
        butelka[1].wlej(0.1);
        System.out.println("wlane " + butelka[1].getIleWlane() + " pojemność " + butelka[1].getPojemnosc());
        butelka[2].wlej(1.2);
        System.out.println("wlane " + butelka[2].getIleWlane() + " pojemność " + butelka[2].getPojemnosc());

    }
}
