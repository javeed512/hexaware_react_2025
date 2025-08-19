import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App.jsx'
import { Employee } from './Employee.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
      
    <App  name="javeed"  rno="102"/>
      
      <Employee  eid={121} ename="scott"></Employee>
      
  </StrictMode>
)
