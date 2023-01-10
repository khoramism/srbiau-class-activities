
#include <iostream>
#include <stack>
#include <string>

using namespace std;

string PostfixToInfix(string postfix) 
{ 
    stack<string> s; 
  
    for (int i = 0; i < postfix.length(); i++) 
    { 
        // If the scanned character is an operand, 
        // push it to the stack. 
        if (isdigit(postfix[i])) 
        { 
            string op(1, postfix[i]); 
            s.push(op); 
        } 
  
        // If the scanned character is an operator, 
        // pop two elements from stack apply the operator 
        else
        { 
            string op1 = s.top(); 
            s.pop(); 
            string op2 = s.top(); 
            s.pop(); 
            s.push("(" + op2 + postfix[i] + op1 + ")"); 
        } 
    } 
  
    // Stack now contains the Infix expression 
    return s.top(); 
} 
  
// Driver code 
int main() 
{ 
    string postfix = "ab+ef*g*-"; 
    cout << PostfixToInfix(postfix); 
    return 0; 
}