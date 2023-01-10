#include <iostream>
#include <vector>

using namespace std;

struct Element 
{ 
    int row; 
    int col; 
    int val; 
}; 

vector<Element> MultiplySparseMatrix(vector<Element> A, vector<Element> B) 
{ 
    vector<Element> result; 
  
    int i = 0, j = 0; 
  
    while (i < A.size() && j < B.size()) 
    { 
        if (A[i].row == B[j].row) 
        { 
            if (A[i].col == B[j].col) 
            { 
                Element temp; 
                temp.row = A[i].row; 
                temp.col = A[i].col; 
                temp.val = A[i].val * B[j].val; 
                result.push_back(temp); 
                i++; 
                j++; 
            } 
            else if (A[i].col < B[j].col) 
            { 
                i++; 
            } 
            else
            { 
                j++; 
            } 
        } 
        else if (A[i].row < B[j].row) 
        { 
            i++; 
        } 
        else
        { 
            j++; 
        } 
    } 
  
    return result; 
} 

int main() 
{ 
    vector<Element> A = { {0, 0, 15}, {0, 1, 8}, {1, 0, 4}, {1, 1, 3} }; 
    vector<Element> B = { {0, 0, 1}, {0, 1, 2}, {1, 0, 3}, {1, 1, 4} }; 
  
    vector<Element> result = MultiplySparseMatrix(A, B); 
  
    for (int i = 0; i < result.size(); i++) 
    { 
        cout << result[i].row << " " << result[i].col << " "
             << result[i].val << endl; 
    } 
  
    return 0; 
}