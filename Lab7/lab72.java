public class lab72{
    public static void main(String[] args) {
        String plate = "";
        int i = 0;
        while( i < 3){
            plate += (char)(Math.random()*26+65);
            i++;
        }
        for(int j = 0; j < 4; j++){
            plate += (char)(Math.random()*10+48);
        }
        System.out.println(plate);
    }
}