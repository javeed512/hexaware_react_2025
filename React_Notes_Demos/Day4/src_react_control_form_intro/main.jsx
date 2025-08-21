import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App';

import Login from './FormDemo'

import "../node_modules/bootstrap/dist/css/bootstrap.css";
import TextArea from './TextArea';
import FormDemo from './FormDemo';

import LoginForm from './LoginForm';

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      

    {/* <App></App> */}
{/* <FormDemo></FormDemo>

      <TextArea></TextArea> */}

        <LoginForm></LoginForm>
      
  </StrictMode>
);




