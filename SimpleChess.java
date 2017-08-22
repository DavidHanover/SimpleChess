/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechess;

/**
 *
 * @author David Hanover
 */
import java.util.Scanner;
import java.util.Arrays;
public class SimpleChess {
    //the following class translate's the user's chees notation input to 
    //coordinates that are useable for the chess board array and all of the 
    // piece methods later on.
static int[] chessNotationTranslate (String notation){
    int[]chessToBoard = new int [2];
    //as you can see, it takes an input of A1, or a1, or A 1, or a 1
    //an generates the values 7 and 0 in a two-value array
    //
    //A2 is translated to 6, 0,
    //A3 to 5, 0
    //and so on.
    //
    //B1 is translated to 7 ,1 and etc.
    //several blocks follow until the final "H" block
    if(notation.matches("A1|a1|A 1|a 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=0;}
    if(notation.matches("A2|a2|A 2|a 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=0;}
    if(notation.matches("A3|a3|A 3|a 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=0;}
    if(notation.matches("A4|a4|A 4|a 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=0;}
    if(notation.matches("A5|a5|A 5|a 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=0;}
    if(notation.matches("A6|a6|A 6|a 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=0;}
    if(notation.matches("A7|a7|A 7|a 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=0;}
    if(notation.matches("A8|a8|A 8|a 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=0;}
    
    
    if(notation.matches("B1|b1|B 1|b 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=1;}
    if(notation.matches("B2|b2|B 2|b 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=1;}
    if(notation.matches("B3|b3|B 3|b 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=1;}
    if(notation.matches("B4|b4|B 4|b 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=1;}
    if(notation.matches("B5|b5|B 5|b 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=1;}
    if(notation.matches("B6|b6|B 6|b 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=1;}
    if(notation.matches("B7|b7|B 7|b 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=1;}
    if(notation.matches("B8|b8|B 8|b 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=1;}
    
    
    if(notation.matches("C1|c1|C 1|c 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=2;}
    if(notation.matches("C2|c2|C 2|c 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=2;}
    if(notation.matches("C3|c3|C 3|c 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=2;}
    if(notation.matches("C4|c4|C 4|c 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=2;}
    if(notation.matches("C5|c5|C 5|c 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=2;}
    if(notation.matches("C6|c6|C 6|c 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=2;}
    if(notation.matches("C7|c7|C 7|c 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=2;}
    if(notation.matches("C8|c8|C 8|c 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=2;}
    
    
    if(notation.matches("D1|d1|D 1|d 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=3;}
    if(notation.matches("D2|d2|D 2|d 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=3;}
    if(notation.matches("D3|d3|D 3|d 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=3;}
    if(notation.matches("D4|d4|D 4|d 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=3;}
    if(notation.matches("D5|d5|D 5|d 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=3;}
    if(notation.matches("D6|d6|D 6|d 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=3;}
    if(notation.matches("D7|d7|D 7|d 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=3;}
    if(notation.matches("D8|d8|D 8|d 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=3;}
    
    
    if(notation.matches("E1|e1|E 1|e 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=4;}
    if(notation.matches("E2|e2|E 2|e 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=4;}
    if(notation.matches("E3|e3|E 3|e 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=4;}
    if(notation.matches("E4|e4|E 4|e 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=4;}
    if(notation.matches("E5|e5|E 5|e 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=4;}
    if(notation.matches("E6|e6|E 6|e 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=4;}
    if(notation.matches("E7|e7|E 7|e 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=4;}
    if(notation.matches("E8|e8|E 8|e 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=4;}
    
    
    if(notation.matches("F1|f1|F 1|f 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=5;}
    if(notation.matches("F2|f2|F 2|f 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=5;}
    if(notation.matches("F3|f3|F 3|f 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=5;}
    if(notation.matches("F4|f4|F 4|f 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=5;}
    if(notation.matches("F5|f5|F 5|f 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=5;}
    if(notation.matches("F6|f6|F 6|f 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=5;}
    if(notation.matches("F7|f7|F 7|f 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=5;}
    if(notation.matches("F8|f8|F 8|f 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=5;}
    
    
    if(notation.matches("G1|g1|G 1|g 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=6;}
    if(notation.matches("G2|g2|G 2|g 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=6;}
    if(notation.matches("G3|g3|G 3|g 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=6;}
    if(notation.matches("G4|g4|G 4|g 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=6;}
    if(notation.matches("G5|g5|G 5|g 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=6;}
    if(notation.matches("G6|g6|G 6|g 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=6;}
    if(notation.matches("G7|g7|G 7|g 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=6;}
    if(notation.matches("G8|g8|G 8|g 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=6;}
    
    
    if(notation.matches("H1|h1|H 1|h 1")){
        chessToBoard[0]=7;
        chessToBoard[1]=7;}
    if(notation.matches("H2|h2|H 2|h 2")){
        chessToBoard[0]=6;
        chessToBoard[1]=7;}
    if(notation.matches("H3|h3|H 3|h 3")){
        chessToBoard[0]=5;
        chessToBoard[1]=7;}
    if(notation.matches("H4|h4|H 4|h 4")){
        chessToBoard[0]=4;
        chessToBoard[1]=7;}
    if(notation.matches("H5|h5|H 5|h 5")){
        chessToBoard[0]=3;
        chessToBoard[1]=7;}
    if(notation.matches("H6|h6|H 6|h 6")){
        chessToBoard[0]=2;
        chessToBoard[1]=7;}
    if(notation.matches("H7|h7|H 7|h 7")){
        chessToBoard[0]=1;
        chessToBoard[1]=7;}
    if(notation.matches("H8|h8|H 8|h 8")){
        chessToBoard[0]=0;
        chessToBoard[1]=7;}
    
    
 //the method returns an array called chessToBoard that contains the two
 //values generated
return chessToBoard;    
}
//what follows here is a method that checks for several things
//A. it checks whether or not the user 
//has designated a valid destination for a rook.
//
//B. it uses "for" loops to check every square on the board
//up until the destination and make sure that they are all empty.
//If it finds that a square along the way is occupied, it generates an
//error message, sets the "move allowed?" value to "false", and breaks
//out of the loop
static boolean rookCheck (String[][] rookBoardCopy, int rookY, int rookX, int rookDestY, int rookDestX){
    boolean rookAllow = true;
    if (rookDestY != rookY && rookDestX == rookX||rookDestX != rookX && rookDestY == rookY){
        if(rookDestY > rookY){for(int i = (rookY + 1); i < rookDestY; i++)
        {if(! rookBoardCopy[i][rookX].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); rookAllow = false; break;}
        else{rookAllow = true;}}}
        
        if(rookDestY < rookY){for(int i = (rookY - 1); i > rookDestY; i--)
        {if(! rookBoardCopy[i][rookX].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); rookAllow = false; break;}
        else{rookAllow = true;}}}
        
        if(rookDestX > rookX){for(int i = (rookX + 1); i < rookDestX; i++)
        {if(! rookBoardCopy[rookY][i].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); rookAllow = false; break;}
        else{rookAllow = true;}}}
        
        if(rookDestX < rookX){for(int i = (rookX - 1); i > rookDestY; i--)
        {if(! rookBoardCopy[rookY][i].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); rookAllow = false; break;}
        else{rookAllow = true;}}}            
    }else{System.out.println("Sorry, the move is invalid for a rook"); rookAllow = false;}
    return rookAllow;
}
// this method checks whether or not the move specified is allowed for a knight
//it doesn't check if the squares are clear, because a knight can jump over pieces
static boolean knightCheck (String[][] knightBoardCopy, int knightY, int knightX, int knightDestY, int knightDestX){
boolean knightAllow;
if ((knightDestX==(knightX+2)&&knightDestY==(knightY+1))||
    (knightDestX==(knightX+2)&&knightDestY==(knightY-1))||
    (knightDestX==(knightX-2)&&knightDestY==(knightY+1))||
    (knightDestX==(knightX-2)&&knightDestY==(knightY-1))||
        
    (knightDestX==(knightX+1)&&knightDestY==(knightY+2))||
    (knightDestX==(knightX+1)&&knightDestY==(knightY-2))||
    (knightDestX==(knightX-1)&&knightDestY==(knightY+2))||
    (knightDestX==(knightX-1)&&knightDestY==(knightY-2))    
   ){knightAllow=true;}else{System.out.println("Sorry, the move is invalid for a knight");knightAllow=false;}
return knightAllow;
}
// the bishop check was very difficult for me.  it checks whether the 
//specified move is allowed for bishops, and then uses a for loop
//to check that all the squares until the destination are clear.
//if these conditions are both true, it sets a boolean value
//called "bishopAllow" to "true".  this tells the move method
//ahead that it may proceed with changing the chessboard
static boolean bishopCheck (String [][] bishopBoardCopy, int bishopY, int bishopX, int bishopDestY, int bishopDestX){
boolean bishopAllow=true;
if((bishopDestY-bishopY==bishopDestX-bishopX)||(bishopDestY-bishopY==bishopX-bishopDestX)||
   (bishopY-bishopDestY==bishopDestX-bishopX)||(bishopY-bishopDestY==bishopX-bishopDestX))
{
    if((bishopDestY>bishopY)&&(bishopDestX>bishopX)){
        for(int i =(bishopY+1),  k=(bishopX+1) ; i<=bishopDestY && k<+bishopDestX ; i++,k++){ 
                if (! bishopBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); bishopAllow=false; break;}
                else{bishopAllow=true;}
        }
    }
    if((bishopDestY>bishopY)&&(bishopDestX<bishopX)){
        for(int i=(bishopY+1),k=(bishopX-1);i<=bishopDestY;i++,k-- ){ 
                if (! bishopBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); bishopAllow=false; break;}
                else{bishopAllow=true;}
        }
    }
    if((bishopDestY<bishopY)&&(bishopDestX<bishopX)){
        for(int i=(bishopY-1), k = (bishopX-1);i>=bishopDestY;i--,k-- ){ 
                if (! bishopBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); bishopAllow=false; break;}
                else{bishopAllow=true;}
        }
    }
    if((bishopDestY<bishopY)&&(bishopDestX>bishopX)){
        for(int i=(bishopY-1),k=(bishopX+1);i>=bishopDestY;i--, k++ ){ 
                if (! bishopBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); bishopAllow=false; break;}
                else{bishopAllow=true;}
        }
       
    }
}else{System.out.println("Sorry, the move is invalid for a bishop");bishopAllow=false;}
 return bishopAllow;}



// Queen check does the same thing as the aformentioned "rook" and "bishop"
// check methods.  as a matter of fact, after i had polished both of those
//methods to my satisfaction, i simply copied and pasted their contents into
//the queenCheck method and made sure the syntax was correct.  
static boolean queenCheck(String [][] queenBoardCopy, int queenY, int queenX, int queenDestY, int queenDestX){
  boolean queenAllow = true;
    if((queenDestY != queenY && queenDestX == queenX)||(queenDestX != queenX && queenDestY == queenY)||
       (queenDestY-queenY==queenDestX-queenX)||(queenDestY-queenY==queenX-queenDestX)||
        (queenY-queenDestY==queenDestX-queenX)||(queenY-queenDestY==queenX-queenDestX)){
        if((queenDestY > queenY)&&(queenX==queenDestX)){for(int i = (queenY + 1); i < queenDestY; i++)
        {if(! queenBoardCopy[i][queenX].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); queenAllow = false; break;}
        else{queenAllow = true;}}}
        
        if((queenDestY < queenY)&&(queenX==queenDestX)){for(int i = (queenY - 1); i > queenDestY; i--)
        {if(! queenBoardCopy[i][queenX].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); queenAllow = false; break;}
        else{queenAllow = true;}}}
        
        if((queenDestX > queenX)&&(queenY==queenDestY)){for(int i = (queenX + 1); i < queenDestX; i++)
        {if(! queenBoardCopy[queenY][i].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); queenAllow = false; break;}
        else{queenAllow = true;}}}
        
        if((queenDestX < queenX)&&(queenY==queenDestY)){for(int i = (queenX - 1); i > queenDestX; i--)
        {if(! queenBoardCopy[queenY][i].equals("  "))
        {System.out.println("Sorry, there is a piece blocking the move"); queenAllow = false; break;}
        else{queenAllow = true;}}} 
        
    if((queenDestY>queenY)&&(queenDestX>queenX)){
        for(int i=(queenY+1),k=(queenX+1);i<=queenDestY;i++,k++ ){
                if (! queenBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); queenAllow=false; break;}
                else{queenAllow=true;}
        }
    }
    if((queenDestY>queenY)&&(queenDestX<queenX)){
        for(int i=(queenY+1),k=(queenX-1);i<=queenDestY;i++, k-- ){
                if (! queenBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); queenAllow=false; break;}
                else{queenAllow=true;}
        }
    }
    if((queenDestY<queenY)&&(queenDestX<queenX)){
        for(int i=(queenY-1), k = (queenX-1);i>=queenDestY;i--,k-- ){
                if (! queenBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); queenAllow=false; break;}
                else{queenAllow=true;}
                
        }
    }    
    if((queenDestY<queenY)&&(queenDestX>queenX)){
        for(int i=(queenY-1),k=(queenX+1);i>=queenDestY;i--, k++ ){ 
                if (! queenBoardCopy[i][k].equals("  "))
                    {System.out.println("Sorry, there is a piece blocking the move"); queenAllow=false; break;}
                else{queenAllow=true;}
        }            
    }
    
    }
    else{System.out.println("Sorry, the move is invalid for a queen");queenAllow = false;}
    return queenAllow;
}

//with kingCheck, i simply made sure that the user didn't input a destination
//more than one square away all the "Check" classes i wrote have a similar 
//"moveAllow" boolean value.  this one is "kingAllow"
static boolean kingCheck(String[][]kingBoardCopy, int kingY, int kingX, int kingDestY, int kingDestX){
    boolean kingAllow;
    if(     (kingDestY==(kingY+1)&&(kingDestX==kingX))||(kingDestY==(kingY-1)&&(kingDestX==kingX))
            ||
            (kingDestX==(kingX+1)&&(kingDestY==kingY))||(kingDestX==(kingX-1)&&(kingDestY==kingY))
            ||
            (kingDestY==(kingY+1)&&(kingDestX==(kingX+1)))||(kingDestY==(kingY-1)&&(kingDestX==(kingX-1)))
            ||
            (kingDestX==(kingX+1)&&(kingDestY==(kingY-1)))||(kingDestX==(kingX-1)&&(kingDestY==(kingY+1)))
            ){kingAllow=true;}else{System.out.println("Sorry, the move is invalid for a king");kingAllow=false;}
    return kingAllow;
}
//while writing "pawnCheck" i realized that pawns are the only piece in the game
//that are limited as far as which direction they can move
//so i simply wrote two, one that is used during the white side move method,
//and one that gets used during the black side method.  white pawns
//may only advance "up" on the board, and black pawns may only advance "down"
static boolean whitePawnCheck(String[][] whitePawnBoardCopy, int whitePawnY, int whitePawnX,
        int whitePawnDestY, int whitePawnDestX){
        boolean whitePawnAllow;
        if (whitePawnDestY==(whitePawnY-1)&&(whitePawnDestX==whitePawnX)){whitePawnAllow=true;}else{whitePawnAllow=false;}
return whitePawnAllow;}
//black pawn method i referred to earlier
static boolean blackPawnCheck(String[][] blackPawnBoardCopy, int blackPawnY, int blackPawnX,
        int blackPawnDestY, int blackPawnDestX){
        boolean blackPawnAllow;
        if (blackPawnDestY==(blackPawnY+1)&&(blackPawnDestX==blackPawnX)){blackPawnAllow=true;}else{blackPawnAllow=false;}
return blackPawnAllow;}

//both "Move" methods first check what piece is located at the square the 
//user specified.  if there is no piece at the location, it returns an error message
//and sets "moveOK" to false.  if there is a piece there it reads what method
//to call, and runs checks on all of the user's specified moves.  
//if they all return a "true" value, it proceeds to copy the user's destination
//input onto the chessboard, and then copy "  ", or a blank square, a la no piece
//back onto the old location of the user's specified piece.
static void whiteMove (String[][]boardCopy, int pieceY, int pieceX, int destY, int destX){
boolean moveOK=false;
if (boardCopy[destY][destX].matches ("  ")){    
    if(boardCopy[pieceY][pieceX].matches("WR")){moveOK = rookCheck(boardCopy, pieceY, pieceX, destY, destX);}
    if(boardCopy[pieceY][pieceX].matches("WN")){moveOK = knightCheck(boardCopy, pieceY, pieceX, destY, destX);}   
    if(boardCopy[pieceY][pieceX].matches("WB")){moveOK = bishopCheck(boardCopy, pieceY, pieceX, destY, destX);} 
    if(boardCopy[pieceY][pieceX].matches("WQ")){moveOK = queenCheck(boardCopy, pieceY, pieceX, destY, destX);}  
    if(boardCopy[pieceY][pieceX].matches("WK")){moveOK = kingCheck(boardCopy, pieceY, pieceX, destY, destX);}
    if(boardCopy[pieceY][pieceX].matches("WP")){moveOK = whitePawnCheck(boardCopy, pieceY, pieceX, destY, destX);}
    if(boardCopy[pieceY][pieceX].matches("  "))
    {System.out.println("Sorry, there is not a piece at the specified location");
    moveOK = false;}
    
  }else{System.out.println("Sorry, there is a piece at the location you wish to move");}
if (moveOK==true){
boardCopy[destY][destX]=boardCopy[pieceY][pieceX];
boardCopy[pieceY][pieceX]="  ";
}else{System.out.println("Try again");}
}

//does the same thing, only for black's turn
static void blackMove (String[][]boardCopy, int pieceY, int pieceX, int destY, int destX){
boolean moveOK=false;
if (boardCopy[destY][destX].matches ("  ")){    
    if(boardCopy[pieceY][pieceX].matches("BR")){moveOK = rookCheck(boardCopy, pieceY, pieceX, destY, destX);}
    if(boardCopy[pieceY][pieceX].matches("BN")){moveOK = knightCheck(boardCopy, pieceY, pieceX, destY, destX);}   
    if(boardCopy[pieceY][pieceX].matches("BB")){moveOK = bishopCheck(boardCopy, pieceY, pieceX, destY, destX);} 
    if(boardCopy[pieceY][pieceX].matches("BQ")){moveOK = queenCheck(boardCopy, pieceY, pieceX, destY, destX);}  
    if(boardCopy[pieceY][pieceX].matches("BK")){moveOK = kingCheck(boardCopy, pieceY, pieceX, destY, destX);}
    if(boardCopy[pieceY][pieceX].matches("BP")){moveOK = blackPawnCheck(boardCopy, pieceY, pieceX, destY, destX);}
    if(boardCopy[pieceY][pieceX].matches("  "))
    {System.out.println("Sorry, there is not a piece at the specified location");
    moveOK = false;}
    
  }else{System.out.println("Sorry, there is a piece at the location you wish to move");}
if (moveOK==true){
boardCopy[destY][destX]=boardCopy[pieceY][pieceX];
boardCopy[pieceY][pieceX]="  ";
}else{System.out.println("Try again");}
 }




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //the chessboard gets initialized 
        String [][] board = {
        {"BR", "BN", "BB", "BQ", "BK", "BB", "BN", "BR"},
        {"BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"},
        {"  "  ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   }, 
        {"  "  ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   }, 
        {"  "  ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   }, 
        {"  "  ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   ,"  "   }, 
        {"WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"}, 
        {"WR", "WN", "WB", "WQ", "WK", "WB", "WN", "WR"}
    };
       //white is set as the default starting color, but the user
       //is prompted to specify what color they prefer
        boolean BW=true;
        System.out.println("What color would you like to start as?");
        Scanner input = new Scanner (System.in);
        String blackOrWhite = input.nextLine();
        //translates several possible answers to a boolean value
        //"BW".  if white is chosen "BW" is set to true,
        //and vice versa
        if (blackOrWhite.matches("black|Black|b|B")){BW = false;}
        if (blackOrWhite.matches("White|white|W|w")){BW = true;}
        
        //infinite for loop used to prolong the game as long as the user wants
        for(;;){
            
        //at the beginning of each move, the chessboard is printed
        
            System.out.println();
            for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            
        }
           
            System.out.println();
            
            //next the system uses the BW value to determite
            //what to print
            
        if(BW==true){System.out.println("It is white's turn to move");}
        if(BW==false){System.out.println("It is black's turn to move");}
// next I create a copy of the current chessboard, in order to check if
//the user's previous move went through or not.  if the board didn't change,
//the color doesn't switch, and the user gets another chance to make
//an appropriate move for his or her color
        String[][] tempBoardCopy = new String[8][8];
        for(int a=0; a<board.length; a++){
        for(int b=0; b<board[a].length; b++){
        tempBoardCopy[a][b]=board[a][b];}}
//the system prompts the user for the algebraic chess notation
//I STRESS THE ALBGEBRAIC NOTATION!!!

//I intentionally wrote the translate program because i dislike the
//inelegance of thinking about chess moves through array notation.

//PLEASE format your moves in traditional chess notation, a la "A2" to "A3",
//because my program only understands what you mean in that form
        System.out.println("Enter the location of the piece you wish to move");
        String moveLocation = input.nextLine();
//next the program takes the user's chess coordinates, and translates them
//to appropriate values and to be read from the chess board array. (called 'board')
//chessNotationTranslate returns an array of 2 values, that is then read
//and assigned to their own "int" variables
        int[]pieceCoordinates = chessNotationTranslate(moveLocation);
        int selectedPieceY = pieceCoordinates[0];
        int selectedPieceX = pieceCoordinates[1];
        System.out.println("Enter your desired destination of the piece you have chosen");
        String moveDestination = input.nextLine();
//the same happens for the destination coordinates        
        int[]destCoordinates = chessNotationTranslate(moveDestination);
        int pieceDestY = destCoordinates [0];
        int pieceDestX = destCoordinates [1];
//using the BW boolean variable, the program chooses which color of move
//method to use. both methods take the chess board, the X/Y coordinates of the
//piece they chose, and the X/Y coordinates of the destination they chose
        if(BW==true){whiteMove (board, selectedPieceY, selectedPieceX, pieceDestY, pieceDestX);}
        if(BW==false){blackMove (board, selectedPieceY, selectedPieceX, pieceDestY, pieceDestX);}
//next, the program checks whether any move was actually made.  if the board is
//exactly the same as it was before the user was prompted for a move,
//the program continues back to the top of the loop, without changing the 
//BW color boolean variable.  
//I.E. if you messed up and didn't make a move as white,
//it's still white's turn to go.
        if (Arrays.deepEquals(tempBoardCopy, board)){continue;}
//next, assuming everything went correctly the BW variable switches to the 
//opposite color at the end of the turn.
        BW=!BW;
//the program asks the user if they would like to continue at the end of 
//every successful move. if they choose yes then the infinite "for"
//loop continues from the top, with the boolean color variable having changed.

//if they choose "NO", then the infinite loop is broken and the
//program terminates
        System.out.println("Would you like to continue playing? Y/N");
        String contMatch = input.nextLine();
        if (contMatch.matches("YES|Yes|yes|Y|y")){continue;}
        if (contMatch.matches("NO|No|no|N|n")){break;}

//thanks for reading!!  I wish good fortune upon you!        
      
        }
        
        
        // TODO code application logic hereBP, 
    }

 
    
}
