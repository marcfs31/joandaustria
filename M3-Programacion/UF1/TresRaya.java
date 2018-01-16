import java.util.*;
public class TresRaya{
char asterisco;
char cero;
char [][] matriz;
String juego=" ";
boolean bandera=false;

public TresRaya(){
asterisco='*';
cero='o';
matriz= new char [3][3];
}

public char [][] llenar(){
for(int i=0;    i<=2;  i++){
for(int j=0;    j<=2;  j++){
    
        matriz[i][j]='t'; 
        //llenamos con t por tres en raya
}
}
return matriz;
}
public String poner1(int fila, int columna, char caracter){
if(bandera==false){
for(int i=0;    i<=2;  i++){
for(int j=0;    j<=2;  j++){
    if (i==fila && j==columna){
        if(caracter=='*' && matriz[i][j]=='t'){
        matriz[i][j]=caracter; }
}
}
}
if(matriz[0][0]=='*' && matriz[0][1]=='*' && matriz[0][2]=='*'){ juego="gano jugador 1"; }
if(matriz[1][0]=='*' && matriz[1][1]=='*' && matriz[1][2]=='*'){ juego="gano jugador 1"; }
if(matriz[2][0]=='*' && matriz[2][1]=='*' && matriz[2][2]=='*'){ juego="gano jugador 1"; }
if(matriz[0][0]=='*' && matriz[1][1]=='*' && matriz[2][2]=='*'){ juego="gano jugador 1"; }
if(matriz[0][0]=='*' && matriz[1][0]=='*' && matriz[2][0]=='*'){ juego="gano jugador 1"; }
if(matriz[0][1]=='*' && matriz[1][1]=='*' && matriz[2][1]=='*'){ juego="gano jugador 1"; }
if(matriz[0][2]=='*' && matriz[1][2]=='*' && matriz[2][2]=='*'){ juego="gano jugador 1"; }
if(matriz[0][2]=='*' && matriz[1][1]=='*' && matriz[0][0]=='*'){ juego="gano jugador 1"; }
bandera=true;
}
else{ juego="no es su turno";}
return juego;
}

public String poner2(int fila, int columna, char caracter){
if(bandera==true){
for(int i=0;    i<=2;  i++){
for(int j=0;    j<=2;  j++){
    if (i==fila && j==columna){
        if(caracter=='o'  && matriz[i][j]=='t' ){
        matriz[i][j]=caracter; }
    }
}
}
if(matriz[0][0]=='o' && matriz[0][1]=='o' && matriz[0][2]=='o'){ juego="gano jugador 2"; }
if(matriz[1][0]=='o' && matriz[1][1]=='o' && matriz[1][2]=='o'){ juego="gano jugador 2"; }
if(matriz[2][0]=='o' && matriz[2][1]=='o' && matriz[2][2]=='o'){ juego="gano jugador 2"; }
if(matriz[0][0]=='o' && matriz[1][1]=='o' && matriz[2][2]=='o'){ juego="gano jugador 2"; }
if(matriz[0][0]=='o' && matriz[1][0]=='o' && matriz[2][0]=='o'){ juego="gano jugador 2"; }
if(matriz[0][1]=='o' && matriz[1][1]=='o' && matriz[2][1]=='o'){ juego="gano jugador 2"; }
if(matriz[0][2]=='o' && matriz[1][2]=='o' && matriz[2][2]=='o'){ juego="gano jugador 2"; }
if(matriz[0][2]=='o' && matriz[1][1]=='o' && matriz[0][0]=='o'){ juego="gano jugador 2"; }
bandera=false;
}
else{ juego="no es su turno";}
return juego;
}


public void mostrar(){
for(int i=0;    i<=2;  i++){
for(int j=0;    j<=2;  j++){
    System.out.println(matriz[i][j]);
}
}

}
}
