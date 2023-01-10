
#include <iostream>

int main() 
{
    std::string Prefix;
    std::cout << "Enter Prefix Expression : ";
    std::cin >> Prefix;
    
    std::string Infix = "";
    for (int i = Prefix.length() - 1; i >= 0; i--) 
    {
        if (Prefix[i] == '+' || Prefix[i] == '-' || Prefix[i] == '*' || Prefix[i] == '/') 
        {
            Infix = "(" + Infix + Prefix[i] + ")";
        } 
        else 
        {
            Infix = Prefix[i] + Infix;
        }
    }
    std::cout << "Infix Expression : " << Infix << std::endl;
    return 0;
}