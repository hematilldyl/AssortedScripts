public class bubblesort {
	
	public static void main(String[] args){
		int[] matrix = {42, 5 , 3, 1223, 3, 5};
		sort(matrix);
		for(int i = 0; i< matrix.length; i++){
			System.out.println(matrix[i]);
		}
		
	}
	public static int[] sort(int[] matrix){
		boolean sorting = true;
		while(sorting){
			for(int i = 0; i< matrix.length-1; i++){
				if(matrix[i] > matrix[i+1]){
					int t = matrix[i];
					matrix[i] = matrix[i+1];
					matrix[i+1] = t;
					return sort(matrix);
					
				}else if(!(matrix[i] > matrix[i+1])){
					sorting = false;
				}
			}
		}
		return matrix;
	}

}
