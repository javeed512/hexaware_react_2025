import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import '../node_modules/bootstrap/dist/css/bootstrap.css'
import { App } from './App';

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      

    <App></App>


      
  </StrictMode>
);




