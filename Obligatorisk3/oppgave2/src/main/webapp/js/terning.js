'use strict'

class dice{
    constructor(){

    }
    getValue(){

    }
    roll(){
        Math.ceil(Math.random() * 6);
    }
}
class diceController{
    constructor(){

    }

    #rollDice(){

    }
    
}

const rootElement = new diceController("root");
new diceController(rootElement);

const dicebutton = rootElement.querySelector("*[data-dicebutton]");
dicebutton.addEventListener("click", this.#rollDice.bind(this));


diceoutputElement.innerText = dice.getValue();