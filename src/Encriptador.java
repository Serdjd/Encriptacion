import java.util.ArrayList;
public class Encriptador {
    public StringBuilder encripter(String text,String mecanismo){
        StringBuilder nuevotxt = new StringBuilder();
        ArrayList<Integer> mecanis = new ArrayList<>();
        int i;
        for(i=0;i<mecanismo.length();i++){
            mecanis.add((int)mecanismo.charAt(i)-'0');
        }
        for(i=0;i<text.length();i++){
            char temp =(char) (text.charAt(i));
            nuevotxt.append(temp);
        }
        i=0;
        while(i<nuevotxt.length()){
        for(int j=0;j<mecanis.size();j++){
            nuevotxt.setCharAt(i,(char) (nuevotxt.charAt(i)+mecanis.get(j)));
            i++;
            if(i>=nuevotxt.length()){
                break;
            }
        }      
        }
        return nuevotxt;
    }
}
