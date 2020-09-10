package com.server;

public class Homework3 {

    //declaraties
    static int i;
    static int j;
    static int k;

    public static void main(String[] args) {
	// write your code here

        showDifference();
        explainOutcome();
        calculateBinarySum();
    }

    static void showDifference(){
        /*
        * Het verschil tussen i++ en ++i
        * */

        i = 3; //initalisatie
        j = i++; //expression
        System.out.println("i: " + i); //i is 4 want er is in de expression hierboven bij i opgeteld
        System.out.println("j: " + j); //j is 3 want hij neemt de waarde van i voor het optellen over

        //vergeet niet i is nu 4
        k = ++i;
        System.out.println("i: " + i); //hier is het 5 want in de expression wordt er wederom opgeteld
        System.out.println("k: " + k); //hier is het ook 5 want in de expression wordt er eerst opgeteld
    }

    static void explainOutcome(){
        /*
        * De uitkomst van j uitleggen
        * */

        i = 3; //geven i opnieuw de waarde 3

        //j krijgt een waarde aangewezen door middel van een ternary operator
        j = i < 3 ? i++ + ++i : i++ >>> 1;
        System.out.println("j: " + j);

        //aangezien i 3 is zal de ternary operator altijd 'false' uitkomen.
        //Hierdoor zal het tweede deel van de operator uitgevoerd worden.

        //Bij dit deel is de expression i++ en dat wordt dus 4.
        //Daarna volgt er een shift. Een shift is een opschuiving van bits
        // Een shift met 3 'haakjes' zorgt ervoor dat het helemaal naar rechts wordt geschoven
        //de bitwise representatie voor 4 is 0100 en omdat die helemaal naar rechts wordt geschoven is het dus 0001
        //0001 zorgt ervoor dat j 1 wordt
    }

    static void calculateBinarySum(){
        /*
        Hier gaan we de binary berekening van 1010 + 100 uitvoeren
         */

        byte b1 = 0b1010; //door 0b eerst te noteren maken we er een 'binary literal' van
        byte b2 = 0b0100;
        byte b3 = (byte) (b1 + b2); //het resultaat is zonder een typecasting een int
        //dus we typecasten het eerst naar een byte

        //bij het printen converteren we b3 naar een binary literal in String vorm om de daadwerkelijke binaire som te krijgen
        System.out.println("b3: " + Integer.toBinaryString(b3));
    }
}
