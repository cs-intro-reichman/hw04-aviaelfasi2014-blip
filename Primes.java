public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] primes = new boolean[n+1];
        int counter =0;
        for (int i = 2; i < primes.length; i++){
            primes[i] = true;
        }
        for (int p=2; p*p <= n; p++){
            if(primes[p]){
                for(int multiple = p*p; multiple <= n; multiple += p){
                    primes[multiple] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " +n +":");
        for (int i=2; i <= n; i++){
            if (primes[i]){
                System.out.println(i);
                counter ++;
            }
        }
        int percent = (100* counter)/n;
        System.out.println("There are " + counter + " primes between 2 and " + n + " ( "+ percent +"% are primes)");
    }
}