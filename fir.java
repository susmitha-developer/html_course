class fir2 {

    public static void main(String[] args) {

        try {

            int a[] = new int[3];
            a[0] = 50;
            a[1]=30;
            a[2]=90;
            a[3]=30;
            System.out.println(10/0);

        }



        catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");

        }
        
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Error");

        }

        catch (Exception e) {

            System.out.println("General Exception");

        }

        finally {

            System.out.println("Program finished");

        }

    }
}