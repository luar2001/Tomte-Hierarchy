/**
Created by Lukas Aronsson
Date: 14/01/2021
Time: 16:52
Project: IndividuelUppgift2
Copyright: MIT
 **/

/**
 * Object that asks for user input and sends a message that tells the user to write an input
 * @param thing a String that tells the user what the program wants inputted
 */
class UserInput(thing: String) {
    var input: String? = null

    /**
     * constructor that starts with a message() then a input()
     */
    init {
        message(thing)
        input = input()
    }

    /**
     * prints a message that tells the user what the program wants it to input
     */
    private fun message(thing: String) {
        print("Input $thing here: ") //returns a string
    }

    /**
     * Reads user input and returns it in lowercase along as its not null
     */
    private fun input(): String {
        return readLine()!!.toLowerCase() //Reads user input that is not null and forces it to be in lowercase
    }


}