'use strict';



class dice {
    // Tegnet ’#’ forteller at felt eller metode er Private
    #value;

    constructor(value = 6) {
        this.#value = value;

    }
    /**
    * ruller terningen
    * @public
    */
    rollDice() {
        this.#value = Math.ceil(Math.random() * 6);
        return;
    }

    /**
     * 
     * @Public 
     */
    getVerdi(){
        this.rollDice();
        return this.#value;
    }
    
}

class DiceController {
    // Tegnet ’#’ forteller at felt eller metode er Private
    #rootElement;
    #tern;

    constructor(rootElement = rootElement, tern = new dice()) {
        this.#rootElement = rootElement;
        this.#tern = tern;
    
    }
    /**
     * 
     * @Public 
     */
     getValue(){
        let tall = tern.getVerdi();
        document.getElementById("output").innerHTML=(tall);

    }

}


let rootElement = new DiceController("output");

const dicebutton = document.getElementById("knapp");
dicebutton.addEventListener("click", rootElement.getValue);




