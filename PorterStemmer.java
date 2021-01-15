public class PorterStemmer {
    String stem(String token){
        String pre_tocken = token;
        if(token.endsWith("sses")){
            token = token.substring(0, token.length()-2);
        }
        else if(token.endsWith("ies")){
            token = token.substring(0, token.length()-2);
        }
        else if(token.endsWith("ss")){
            token = token;
        }
        if(token.endsWith("s")){
            token = token.substring(0, token.length()-1);
        }
        if(!pre_tocken.equals(token)){
            System.out.println("Porter stemmer convert '"+pre_tocken+ "' to '"+token+"'");
        }

        return token;
    }
}
