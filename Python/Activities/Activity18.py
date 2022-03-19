import pandas
dataframe = pandas.read_csv('User.csv')

#Print the values only in the Usernames column
print("Usernames:\n",dataframe["Usernames"])

#Print the username and password of the second row
print("Username:", dataframe["Usernames"][1], "|" ,"Password: ", dataframe["Passwords"][1])

#Sort the Usernames column data in ascending order and print data

print(dataframe.sort_values('Usernames'))


#Sort the Passwords column in descending order and print data

print(dataframe.sort_values('Passwords',ascending=False))