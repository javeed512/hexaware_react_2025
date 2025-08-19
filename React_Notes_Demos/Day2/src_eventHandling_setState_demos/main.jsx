import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App.jsx'
import { Student } from './Student.jsx'

import { Employee } from './Employee.jsx'

import PreventEventDemo from './PreventEventDemo.jsx'
import { ParamEventHandler } from './ParamEventHandler.jsx'

import { Customer } from './Customer.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
      
    <App/>

    <Student></Student> 

    <Employee name="javeed"></Employee>

    <PreventEventDemo></PreventEventDemo>

    <ParamEventHandler></ParamEventHandler>

    <Customer></Customer>
  
      
  </StrictMode>
)
