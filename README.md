# SortManager
## This is my SortManager Project

###Here you will see the project, sorting methods included, and how to run the project.



Overall there are 5 sorting methods which are:
- Bubble sort
- Merge sort
- Insertion sort
- Binary tree creation
- Quick sort


Included are exceptions thrown, included in IOException.

The program, once run will initially ask for 5 different inputs, these can be replied to in the same way they are presented. For example, to open bubble sort, type in bubble. If no correct input is found, the program will ask you to
input a correct statement until it finds one. Once you have inputted 'bubble' the program will ask how many values to input for the array size. If the number is below 2 or above 1000, or a number is not entered, the program will ask 
repeatedly until one is. It will then show you the created array, sort the array, then show the sorted version of the array too. After this is done it will show you the time taken to sort the array in nanoseconds. The program will then
ask you if you want to test another sorting algorithm, to which you either respond with a y or n. This will then take you back to the sorting factory and allow you to test another sorting algorithm, again with the same steps as shown
above.

There are a few issues with the code which I will try and fix in time. For example, the program will create multiple log files, whilst also uploading everything into one log file. All extra files can be deleted once the program has run.
The program will cap out at 100 binary tree values as it will try and create 100 log files. With every other sorting algorithm, it is capped at 1000, which is what the program has intended to cap at. Each algorithm will create a max of 10 
extra files.
I was also unable to fully get the binary sort tree to fully work and search through to find a value. I could enter values in but not search for them, however they will print out to console.