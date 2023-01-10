
#include <iostream>

int main() 
{
    int A[3][3] = {{1, 0, 0}, 
                   {0, 2, 0}, 
                   {0, 0, 3}}; 
  
    int B[3][3] = {{1, 0, 0}, 
                   {0, 2, 0}, 
                   {0, 0, 3}}; 
  
    int Result[3][3]; 
  
    for (int i = 0; i < 3; i++) 
    { 
        for (int j = 0; j < 3; j++) 
        { 
            Result[i][j] = 0; 
            for (int k = 0; k < 3; k++) 
            { 
                Result[i][j] += A[i][k] * B[k][j]; 
            } 
        } 
    } 
  
    for (int i = 0; i < 3; i++) 
    { 
        for (int j = 0; j < 3; j++) 
        { 
            std::cout << Result[i][j] << " "; 
        } 
        std::cout << std::endl; 
    } 
  
    return 0; 
}