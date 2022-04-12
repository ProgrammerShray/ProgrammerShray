#include <stdio.h> 
#include <stdlib.h> 
#include <time.h> 

int main() {
    int number;
    srand(time(0));
    number= rand()%100 + 1; //Genrates a number between 1 to 100
    int guess;
    int nguess=1;
    // printf("THe number is: %d\n" , number);
   
   do
   {
       printf("Guess the number between 1 and 100 \n");
       scanf("%d", &guess);
       if (guess>number)
       {
           printf("Lower Number Please!!\n");
       }
       else if (guess < number)
       {
           printf("Higher Number Please\n");
       }
       else if (guess==number)
       {
           printf("You guessed it right!!\n");
           printf("THe number is: %d\n" , number); 
           printf("You have guessed the number in %d attempts \n", nguess);
       }
       
       nguess++;
   } while (guess!=number);
   
    return 0;
}