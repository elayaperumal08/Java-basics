class ArrayFirstProgram{
     public static void main(String args[]){
        int elaya[] = new int[7];
        for (int count=0;count<7;count++){
           elaya[count]=count+1;
       }
       for (int count=0;count<7;count++){
           System.out.println("array["+count+"] = "+elaya[count]);
       }
      System.out.println("Length of Array  =  "+elaya.length);
      
      }
}
