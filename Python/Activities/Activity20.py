import pandas
dataframe = pandas.read_excel('Emp_details.xlsx')

#Use pandas to read data in the Excel file
print(dataframe)

#Print the number of rows and columns
print("No. Of rows and columns:",dataframe.shape)

#Print the data in the emails column only
print("Email:", dataframe['Email'])

#Sort the data based on FirstName in ascending order and print the data

print(dataframe.sort_values('FirstName'))

