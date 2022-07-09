class ForEach {  
    public static void main(String args[]) { 
      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      for(int[] row:arr){
        for(int ele:row){
          System.out.print(ele+" ");
        }
        System.out.println("");
      }
    } 
  }