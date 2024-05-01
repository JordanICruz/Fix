print ("Welcome to the Fortune Teller")
from random import randint 

def loadFortunes():
    global fortunes
    fortunes[0] = "Bide your time, for success is near."
    fortunes[1] = "Change is happening in your life, so go with the flow!"
    fortunes[2] = "Do not let ambitions overshadow small success.!"
    fortunes[3] = "A golden egg of opportunity falls into your lap this month."
    fortunes[4] = "A lifetime friend shall soon be made."
    fortunes[5] = "A lifetime of happiness lies ahead of you."
    fortunes[6] = "A pleasant surprise is waiting for you."
    fortunes[7] = "All the effort you are making will ultimately pay off."
    fortunes[8] = "An important person will offer you support."
    fortunes[9] = "Instant Death"
    
def init():
    global fortunes, done
    fortunes = [None]*10
    done = False
    loadFortunes()
    print("Enter \"0\" to Exit, or anything else for a fortune.")

def printFortunes():
    print(fortunes[randint(0,9)])

def mainLoop():
    global done
    inputLine = input()
    if inputLine == "0":
        done = True
    else:
        printFortunes()
        print("Another?")

def finish():
    print("Thanks for plyaing.")

init()
while not done:
    mainLoop()
finish()
