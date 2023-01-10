def PrefixToInfix(prefixExp): 
    stack = [] 
  
    # Traverse through every character of 
    # input expression 
    for char in prefixExp: 
  
        # If character is an operand, 
        # push it into stack 
        if not IsOperator(char): 
            stack.append(char) 
  
        # If character is an operator, 
        # pop two elements from stack 
        else: 
            op1 = stack.pop() 
            op2 = stack.pop() 
            stack.append("(" + op2 + char + 
                         op1 + ")") 
  
    # Stack contains only the Infix expression 
    return stack[0]