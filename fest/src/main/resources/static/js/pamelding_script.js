'use strict'



class FORMController{
    #rootElement
    #passInput
    #passRepeat
    constructor(rootElement){
        this.#rootElement = rootElement;
        this.#passInput = rootElement.querySelector("*[data-passInput]");
        this.#passRepeat = rootElement.querySelector("*[data-passRepeat]");
        
        this.#passInput.addEventListener("input", this.#sjekkPass.bind(this));
        this.#passRepeat.addEventListener("input", this.#sjekkLikhetPass.bind(this));
    }
    #sjekkLikhetPass(){
        if(this.#passInput.value === this.#passRepeat.value){
            this.#passRepeat.valid = true;
            this.#passRepeat.style.borderColor = "green";
        }
        else{
            this.#passRepeat.valid = false;
            this.#passRepeat.style.borderColor = "red";

        }
    }
    #sjekkPass(){
 
        if(this.#passInput.validity.valid){
                if(this.#passInput.value.length < 14){
             
                    this.#passInput.style.borderColor = "yellow";
                }
                else{
                    this.#passInput.style.borderColor = "green";

                }
        }
        else{
            this.#passInput.style.borderColor = "red";

        }
        
    }
}

const rootElement = new FORMController(document.querySelector("#root"));