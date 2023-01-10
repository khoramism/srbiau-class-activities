#include <iostream>
using namespace std;

int main() 
{
    string postfix;
    cout << "Enter postfix expression: ";
    cin >> postfix;
    
    stack<string> Infix;
    for (int i = 0; i < postfix.length(); i++) 
    {
        if (postfix[i] == '+' || postfix[i] == '-' || postfix[i] == '*' || postfix[i] == '/') 
        {
            string op1 = Infix.top();
            Infix.pop();
            string op2 = Infix.top();
            Infix.pop();
            string temp = "(" + op2 + postfix[i] + op1 + ")";
            Infix.push(temp);
        } 
        else 
        {
            Infix.push(string(1, postfix[i]));
        }
    }
    cout << "Infix expression: " << Infix.top() << endl;
    return 0;
}