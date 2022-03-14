#Get Player Names
Player1= input("Enter Player 1's name? ")
Player2 = input("Enter Player 2's name? ")

#Get player responses
Player1_response = input(Player1 + " choose rock, paper or scissors: ")
Player2_response = input(Player2 + "  choose rock, paper or scissors: ")
 
if Player1_response == Player2_response:
    print("It's a tie!")
elif Player1_response == 'rock':
    if Player2_response == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif Player1_response == 'scissors':
    if Player2_response == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif Player1_response == 'paper':
    if Player2_response == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
