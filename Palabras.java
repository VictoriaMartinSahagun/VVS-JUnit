public class Palabras {
    public String concat( String pal1, String pal2){
        String pal3 = pal1.concat(pal2);
        return pal3;
    }

    public int count(String pal1){
        int cant = (int) pal1.chars().count();
        return cant;
    }

    public String[] split(String pal1){
        return pal1.split(" ");
    }

    public boolean containsLetter(String pal1, char letter){
        boolean contains = false;
        char[] charsInPal = pal1.toCharArray();
        for(int i = 0; i< charsInPal.length && !contains; i++){
            if(charsInPal[i] == letter){
                contains = true;
            }
        }
        return contains;
    }
}
