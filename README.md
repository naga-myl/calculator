# calculator
JFrame container is used for adding components 
Launch the application.
Create the application.
Initialize the contents of the frame.
Components and Container are created in Swing using Application Window
Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property(buttons 0-9 , .(dotbutton))
Register the button with ActionListener
Handle the event with ActionEvent handling code
After the buttons are designed code is written in the ActionPerfomed method when particular button is clicked
For arithmetic buttons (+,_,/,*) one input is taken and stored in the corresponding num1 variable.
For == button length of the textfield is checked to see if there is data and any errors while entered will be deleted by using deleteCharAt(index) method of StringBuilder
Based on the operator selected particular operation is performed.
Buttons(0-9),Dot button,TextField are disabled so as to not to take any further data after display
IN CE button all the disabled buttons are enabled
