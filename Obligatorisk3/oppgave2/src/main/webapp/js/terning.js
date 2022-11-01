'use strict'

class dice{
    #value = 0;
    constructor(){

    }
    getValue(){
        this.roll();
        return this.#value;
    }
    roll(){
        this.#value = Math.ceil(Math.random() * 6);
    }
}
class diceController{
    #dice;
    #rootElement;
    constructor(rootElement){
        this.#rootElement = rootElement;
        this.#dice = new dice();
        const dicebutton = rootElement.querySelector("*[data-dicebutton]");
        
        dicebutton.addEventListener("click", this.#rollDice.bind(this));

        
    }

    #rollDice(){
        const diceOutputElement = this.#rootElement.querySelector("*[data-diceoutput]");
        
        diceOutputElement.innerText = this.#dice.getValue();
    }
    
}

const rootElement = new diceController(document.querySelector("#root"));



