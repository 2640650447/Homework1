public class Homework {
    public static void main(String[] args) {
        double[] housePrices = new double[10];

        housePrices[0]=50000;
        housePrices[1]=50000;
        housePrices[2]=50000;
        housePrices[3]=50000;

        for (int i = 0; i < housePrices.length; i++)
        {
            if (housePrices[i]<500000)
            {
                System.out.print("Input House price " + (i + 1) + ": ");
            }
        }


    }
}

