'use strict';



class dice {
    // Tegnet ’#’ forteller at felt eller metode er Private
    #value;

    constructor() {
        this.#value = 6;

    }
 
    rollDice() {
        this.#value = Math.ceil(Math.random() * 6);
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


    constructor() {
        //this.tern = new dice(6);
        this.tall = new dice().getVerdi();
    }
    /**
     * 
     * @Public 
     */
     getValue(){
        //let tall = this.tern.getVerdi();
        document.getElementById("output").innerHTML=(this.tall);
    }

}
//let dicebutton = document.getElementById("knapp");
//const dicebutton = rootElement.querySelector("*[data-dicebutton]");

//let rootElement = new DiceController();

function giTall(){
    let kont = new DiceController();
    kont.getValue();
}


//dicebutton.addEventListener("click", rootElement.getValue());
//dicebutton.addEventListener("click", giTall());




