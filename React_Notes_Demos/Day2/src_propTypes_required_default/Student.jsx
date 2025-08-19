

import PropTypes from "prop-types";

function Student(props){


   
    
  return  <>
    <h1>Name : {props.name}</h1>
    <h1>Roll No : {props.rollno}</h1>
    </>



}

Student.propTypes= {

        name: PropTypes.string.isRequired,
        rollno:PropTypes.number.isRequired

}

Student.defaultProps={
    name:"Ihub Talent",
    rollno: 404
}


export default Student;