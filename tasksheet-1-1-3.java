class TaskSheet {
    public static void main(String[] args) {
        int check_number = 10;
        String message; 
        for (int i = 0; i <= check_number; i++) {
   
            message = (i % 2 == 0) ? (i + " is an even number") : (i + " is an odd number");
      
            System.out.println(message);
        }
    }
}