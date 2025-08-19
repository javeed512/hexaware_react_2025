
import Student from "./Student.jsx"

export function  App(props){


    return <>
            <Student  />
            <Student  name={props.name}  rollno={props.rno}></Student>
    
    
            </>


}