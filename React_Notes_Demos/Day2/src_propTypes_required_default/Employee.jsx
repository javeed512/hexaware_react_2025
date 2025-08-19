import PropTypes from "prop-types";
import { Component } from "react";


export class  Employee extends Component{



        render(){

                    return  (

                            <div>
                                    <h1>Eid: {this.props.eid}</h1>
                                    <h1>EName: {this.props.ename}</h1>


                            </div>

                    )



        }



}


Employee.propTypes = {

        eid: PropTypes.number,
        ename:PropTypes.string


}

