package Pattern;

public class Program1 {
	
	static void Squar(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	static void Triangle(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	static void DownTriangle(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	static void rightTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	static void leftTriangle(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	static void rightDounTriangle(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
	}
	
	
	static void leftDownTriangle(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	static void upPerimid(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	
	static void dounPerimid(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		}
	
	  static void Dimend(int n) {
		  for(int i=1;i<=n;i++) {
				
				for(int j=i;j<=n;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<i;j++) {
					System.out.print("* ");
				}
				
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
	  for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	  }

	
	public static void main(String[] args) {
		
		Squar(5);
		Triangle(5);
		DownTriangle(5);
		rightTriangle(5);
		leftTriangle(5);
		rightDounTriangle(5);
		leftDownTriangle(5);
		upPerimid(5);
		dounPerimid(5);
		Dimend(5);
	}

}
