import { Component } from "react";




export default class  LoginForm  extends Component{


        state = {

                uname:"",
                pwd:""

        }


        userHandler = (e)=>{

                  this.setState({uname:e.target.value})

        }

        pwdHandler = (e)=>{

                    this.setState({pwd:e.target.value})

        }



    render(){




        return <>
        
        <h1>UserName: {this.state.uname}</h1>
        <h1>Password: {this.state.pwd}</h1>
        
        <form action="">

        <label htmlFor="uname">UserName:</label>
                    <input type="text" name="uname"   defaultValue={this.state.uname}  className="form-control" onChange={this.userHandler}  />
        
        
        <label htmlFor="pwd">Password:</label>
                    <input type="password" name="pwd"  defaultValue={this.state.pwd} className="form-control"  onChange={this.pwdHandler} />

        <button type="submit"  className="btn btn-success">Login</button>
        
        </form>
        
        
        
        </>





    }











}