
import  {useState} from 'react';

export function Counter(){


    // count is the state variable, setCount is the updater function or setter func
         const[count,setCount]  =       useState(0);    

         


       return (


            <div>

            <h1>Count: {count}</h1>
            <button  onClick={ ()=>{  setCount(count + 1)   }}  >Increment</button>
            <button  onClick={ ()=>{  setCount(count - 1)   }}  >Decrement</button>
            <button  onClick={ ()=>{  setCount(0)   }}  >Reset</button>


            </div>



       );  


}