fun main(args: Array<String>) {
    val player1 = Player("XRP Astronaut", 4, 1, 0)

    player1.show()

    val AK47 = Weapon("Desert Eagle", 45)
    val M4A1 = Weapon("M1911", 45)


    println("Choose your gamertag")
    var username = readLine()


    while (username!!.isEmpty()) {
        println("Please enter a name that is not empty")
        username = readLine()
    }

    println("Your name is now $username you are trained for the space mission RP589. Expedition to mars.")
    var counter: Int = 1
    counter + 1
    val weaponArray = ArrayList<Weapon>()

    weaponArray.add(AK47)
    weaponArray.add(M4A1)
    var level: Int = 0
    var lives = 3

    for (weapon in weaponArray) {
        println("WHOOP")
    }

    var choice: Int = 0
    println("Press (1) to continue (or any other number tbh)")
    readLine()!!.toInt().also { choice = it }
    level =+ 1
    println("Level UP! You are now level " + level + ": Waking up")
    println("You awaken in a spaceship. You scout the room for more people but you only ")
    println("see people sleeping. You must've waken up by mistake")
    println("Do you keep looking for supplies (1) OR do you keep moving? (2)")
    choice = readLine()!!.toInt()


    when (choice) {
        1 -> println("You look around the room and you find some crackers. Noice")
        1-> println("You keep looking but it's just boxes of gear and tools. Boring.")
        2 -> println("You continue to the hallway, no signs of life so far..")
        2 -> println("At least there's a robot in the cafeteria.. This spaceship is huge.")
        else -> {
            println("You've gotta' pick something dude")
            choice = readLine()!!.toInt()
        }
    }
    println("You continue looking around and find your way into the next room and you see it's some kind of control center. Lots of screens. Even a steering wheel of sorts")
    println("You're getting kind of tired from all this walking around. Is this the time to take a nap?")
// makechoicecmd   readLine()!!.toInt().also { choice = it }

    println("Press (1) to take a nap. Press (2) to keep looking.")
    choice = readLine()!!.toInt()


    when (choice) {
        1 -> println("You lay down comfortably and decide to take a nap. No rush in space :)    ...   You wake up from potentially one of the best naps of your life. On with the adventure.")
        2 -> println("You walk towards the window and gaze upon the sky. The stars shine so brightly...     You do not recognize any of the planets though. They have weird shapes and such. We must be really far away..")

        else -> {
            println("I don't think that's a valid choice")
            choice = readLine()!!.toInt()
        }
    }
    println("Press (1) to continue")
    readLine()!!.toInt().also { choice = it }
    level =+ 2
    println("Level UP! You are now level $level: Where we going?")
    println("Alright that was fun but let's get shit moving. Do you (1) sit in the captain's chair to control the spaceship?")
    println("Orr.. do you (2) sit down on the chaise lounge and have autopilot take care of it?")
    readLine()!!.toInt().also { choice = it }



    when (choice) {
        1 -> println("You get in the captain's chair. Joystick in your hand, you take off into the sky")
        1 -> println("You watch the galaxies go by, you're in hyperdrift and there's nothing that can kill your mood. Life's good.")
        2 -> println("Of course, why bother? You boot up a quick game of FIFA39 while the pilot navigates to the nearest starsystem")
        2 -> println("You win every match that you play. This bot is boring... Maybe you should wake up another astronaut?")
        else -> {
            println("You're a sticky bastard aren't you?")
            readLine()!!.toInt().also { choice = it }
        }
    }
