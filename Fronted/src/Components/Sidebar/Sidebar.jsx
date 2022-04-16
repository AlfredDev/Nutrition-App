import React from 'react'
import "./sidebar.css"
function Sidebar() {
  return (
    <div className='sidebar'>
        <div className="sidebarWrapper">
            <div className="sidebarMenu">
            <ul className="sidebarList">
            <li className="sidebarListItem active">
             Home
            </li>
            <li className="sidebarListItem">
                Analityixs
            </li>
            <li className="sidebarListItem">
              Sales
            </li>
          </ul>
            </div>
        </div>
    </div>
  )
}

export default Sidebar