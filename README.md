## Organizations Exercise

Please download the following CSV dataset:
https://github.com/datablist/sample-csv-files/raw/main/files/organizations/organizations-100000.zip

Unzip the archive and use the enclosed CSV file. The document has the following "columns":

Index
Organization Id
Name
Website
Country
Description
Founded
Industry
Number of employees

**Create a Java program which defines a class model corresponding to the CSV document structure. Parse the CSV document and create a collection which will hold the data.
Perform the following tasks on this collection using the Stream<T> API:**

    1.List the names and countries of the companies founded between 2010 and 2020
    2. Count the companies whose number of employees are greater than 9000
    3. Create a new list containing the name and founding year for companies from the "Information Technology / IT" industry
    4. Create a new list containing the name, country and website for companies with less than 100 employees; the list must be sorted by name ascendingly