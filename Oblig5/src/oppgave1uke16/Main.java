package oppgave1uke16;

public class Main {

	public static void main(String[] args) {
		int[] tab = {15, 8, 1, 9, 11, 5, 10, 12};
		
		for(int i : tab) {
			System.out.print(i + " ");
		}
		
		selection(tab, 3);
		System.out.println("\nSorting...");
		
		for(int i : tab) {
			System.out.print(i + " ");
		}
	}
	
	//InsertionSort må gå gjennom alle elementene i tabellen uansett
	//og da er det ingen vei å forbedre kjøretiden her.
	public static void insertion(int[] arr, int k) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
	
	
	public static void selection(int[] tab, int k) {
        int n = tab.length;
        
        // Her vil jeg ikke at løkken skal gå gjennom hele tabelen
        // Derfor har jeg i < k istedenfor i < n-1
        for (int i = 0; i < k; i++) 
        {
   
            int min = i;
            for (int j = i+1; j < n; j++)
                if (tab[j] < tab[min])
                    min = j;

            int temp = tab[min];
            tab[min] = tab[i];
            tab[i] = temp;
        }
    }
}

