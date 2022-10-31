public class Main{
    public static void main(String[] args){
       
/*
 Question :~ Write a java program
 to fill in a letter template 
 which looks like below :

 letter = "Dear <|name|> , Thanks a Lot "

 Replace <|name|> with a string {some name}

 */


String letter = "Dear <|name|> , Thanks a Lot ";

System.out.println(letter.replace("<|name|>", "Rocky"));




    }
}