/*
 * Programa que saluda al món
 */
#include <stdio.h>
int main(){
	int varA;
	varA = 9;
	int varB;
	varB = 10;
  printf("%i\n",varA);
  printf("%i\n",varB);
  int varC;
  varC = varA;
  varA = varB;
  varB = varC;
  printf("%i\n",varA);
  printf("%i\n",varB);
  return 0;
}
