fun main() {
    //Declare variables
    var choice = 0
    var pinball =""

    //Print menu
    do{
    println("=========== 5 Latest Pinball Machines ==============")
    println("1 - STERN:Stranger Things")
    println("2 - STERN:Elvira House of Horrors")
    println("3 - STERN:Jurrasic Park")
    println("4 - JERSEY JACK:Willy Wonka")
    println("5 - STERN:Black Knight Sword of Rage")
    println("9 - Quit")

    //Ask user for choice
    print("Enter Choice: ")
        choice = readLine()!!.toInt()

        //Assign pinball to users choice
        when(choice){
            1 -> pinball = "STERN:Stranger Things"
            2 -> pinball = "STERN:Elvira House of Horrors"
            3 -> pinball = "STERN:Jurrasic Park"
            4 -> pinball = "JERSEY JACK:Willy Wonka"
            5 -> pinball = "STERN:Black Knight Sword of Rage"
        }

        //only print choice and name of machine if in the menu
        if(choice >=1 && choice <=5)
            println("You have selected: $choice \nThat is: $pinball")
        else if (choice != 9)
            println("INVALID CHOICE")
   }while(choice !=9)

    println("============= End of Line ==================")
}