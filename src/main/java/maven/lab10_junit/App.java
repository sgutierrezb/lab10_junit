package maven.lab10_junit;

public class App 
{
	 public static void main(String[] args) {
	        App app = new App();
	        int sum = app.sumar(4,5);
	        int res = app.restar(4,5);
	        int mult = app.multiplicar(4,5);
	        int div = app.dividir(4,5);
	    }

	    public  int restar(int i, int j) {
	        return i-j;
	    }

	    public  int sumar(int i, int j) {
	        return i+j;
	    }
	    public  int multiplicar(int i, int j) {
	        return i*j;
	    }
	    public  int dividir(int i, int j) {
	        return i/j;
	    }
	}

