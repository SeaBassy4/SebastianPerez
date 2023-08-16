public class ComprobarSuma {
    public static void main(String[] args) {
        int temp1 = 0;
        int temp2 = 0;
        boolean match = false;
        int x = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (a[i] + a[j] == x) {
                    match = true;
                    temp1 = a[i];
                    temp2 = a[j];
                    break;
                }
            }
            if (match){break;}
        }
        if(match){
            System.out.println("La suma de: "+temp1+" y "+temp2+" equivale al valor de: "+x);
        }
        if(!match){
            System.out.println("No hay una suma de dos numeros que da el valor de: "+ x);
        }
    }
}
