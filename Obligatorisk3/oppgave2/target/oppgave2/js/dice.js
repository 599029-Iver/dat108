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
    getValue(){
        return this.#value;
    }
    
}