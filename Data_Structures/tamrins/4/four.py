
def PrefixToPostfix(prefixExp): 
    stack = [] 
  
    # Traverse through every character of 
    # input expression 
    for char in prefixExp: 
  
        # If character is an operand, 
        # push it to stack 
        if not IsOperator(char): 
            stack.append(char) 
  
        # If character is an operator, 
        # pop two elements from stack 
        else: 
            op1 = stack.pop() 
            op2 = stack.pop() 
            stack.append(op1 + op2 + char) 
  
    # stack[0] contains the Postfix expression 
    return stack[0] 
  
# Utility function to check if the given character 
# is operator symbol or not. 
def IsOperator(char): 
    if char == '+' or char == '-' or char == '*' or char == '/': 
        return True
    else: 
        return False
  
# Driver program to test above function 
prefixExp = "*-A/BC-/AKL"
print(PrefixToPostfix(prefixExp))