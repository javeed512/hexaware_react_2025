import { Component } from "react";



export default class   FormDemo extends Component{


        state = { data : "Hexaware"}


    handler  = (e) =>{

                console.log(e.target.value)

                this.setState({data:e.target.value})

    }



render(){

    return (

            <>

                    <h1>State : {this.state.data}</h1>
            
                <form >

                    <label htmlFor="username">UserName:</label>
                    <input type="text" name="username"  defaultValue={this.state.data} className="form-control" onChange={this.handler}   />

                



                </form>
            
            
            
            
            
            
            
            
            </>










    )




}




}