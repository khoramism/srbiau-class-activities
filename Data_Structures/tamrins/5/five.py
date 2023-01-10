
def PostfixToInfix(expression): 
    stack = [] 
  
    for char in expression: 
        if char.isalpha(): 
            stack.append(char) 
  
        else: 
            val1 = stack.pop() 
            val2 = stack.pop() 
            stack.append("(" + val2 + char + val1 + ")") 
  
    return stack.pop() 
  
# Driver Code 
if __name__ == "__main__": 
    expression = "ab+ef*g*-"
    print(PostfixToInfix(expression))