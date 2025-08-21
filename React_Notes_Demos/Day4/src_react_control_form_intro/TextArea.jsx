import { Component } from "react";


export default  class  TextArea   extends Component{

    state = {data:"Hello friends , This is text in text area"}


     handler = (e)=>{

            this.setState({data:e.target.value.toUpperCase()})




    }


    render(){



        return(



                    <>  

                            <h1>State: {this.state.data}</h1>
                    
                        <textarea defaultValue={this.state.data}  onChange={this.handler}></textarea>
                    
                    
                    </>





        )







    }







}