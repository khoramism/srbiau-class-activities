
#include <iostream>
#include <stack>
#include <string>
using namespace std;

string PrefixToPostfix(string Prefix) 
{ 
    stack<string> S; 
  
    // length of expression 
    int length = Prefix.size(); 
  
    // reading from right to left 
    for (int i = length - 1; i >= 0; i--) { 
  
        // check if symbol is operator 
        if (Prefix[i] == '+' || Prefix[i] == '-' || 
            Prefix[i] == '*' || Prefix[i] == '/') { 
  
            // pop two operands from stack 
            string op1 = S.top(); S.pop(); 
            string op2 = S.top(); S.pop(); 
  
            // concat the operands and operator 
            string temp = op1 + op2 + Prefix[i]; 
  
            // Push string temp back to stack 
            S.push(temp); 
        } 
  
        // if symbol is an operand 
        else { 
  
            // push the operand to the stack 
            S.push(string(1, Prefix[i])); 
        } 
    } 
  
    // stack[0] contains the Postfix expression 
    return S.top(); 
} 
  
// Driver Code 
int main() 
{ 
    string Prefix = "*-A/BC-/AKL"; 
    cout << "Postfix : " << PrefixToPostfix(Prefix); 
    return 0; 
}