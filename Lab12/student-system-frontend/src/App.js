// import React from 'react';
// import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
// import './App.css';
// import Home from './Home';
// import StudentList from './StudentList';
// import UpdateStudent from './UpdateStudent';
// import Registration from "./Registration";
// import RemoveStudent from "./RemoveStudent";
// import 'bootstrap/dist/css/bootstrap.min.css';
//
// function App() {
//     return (
//         <Router>
//             <div className="App">
//                 <header className="App-header">
//                     <ul>
//                         <li><Link to="/eregistrar/home">Home</Link></li>
//                         <li><Link to="/eregistrar/register">Register</Link></li>
//                         <li><Link to="/eregistrar/studentlist">Student List</Link></li>
//                         <li><Link to="/eregistrar/delete">Remove Student</Link></li>
//                         <li><Link to="/eregistrar/update">Update Student Info</Link></li>
//                     </ul>
//                 </header>
//                 <main>
//                     <Routes>
//                         <Route path="/eregistrar/home" element={<Home />} />
//                         <Route path="/eregistrar/register" element={<Registration />} />
//                         <Route path="/eregistrar/studentlist" element={<StudentList />} />
//                         <Route path="/eregistrar/delete" element={<RemoveStudent />} />
//                         <Route path="/eregistrar/update" element={<UpdateStudent />} />
//                     </Routes>
//                 </main>
//             </div>
//         </Router>
//     );
// }
//
// export default App;

import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import './App.css';
import Home from './Home';
import StudentList from './StudentList';
import UpdateStudent from './UpdateStudent';
import 'bootstrap/dist/css/bootstrap.min.css';
import Registration from "./Registration";
import RemoveStudent from "./RemoveStudent";

function App() {
    return (
        <Router>
            <div className="App">
                <header className="App-header">
                    <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                        <div className="container-fluid">
                            <Link className="navbar-brand" to="/eregistrar/home">Student Management System</Link>
                            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                                <span className="navbar-toggler-icon"></span>
                            </button>
                            <div className="collapse navbar-collapse" id="navbarNav">
                                <ul className="navbar-nav">
                                    <li className="nav-item">
                                        <Link className="nav-link" to="/eregistrar/home">Home</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to="/eregistrar/register">Register</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to="/eregistrar/studentlist">Student List</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to="/eregistrar/delete">Remove Student</Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to="/eregistrar/update">Update Student Info</Link>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>
                </header>
                <main className="container mt-4">
                    <Routes>
                        <Route path="/eregistrar/home" element={<Home />} />
                        <Route path="/eregistrar/register" element={<Registration />} />
                        <Route path="/eregistrar/studentlist" element={<StudentList />} />
                        <Route path="/eregistrar/delete" element={<RemoveStudent />} />
                        <Route path="/eregistrar/update" element={<UpdateStudent />} />
                    </Routes>
                </main>
            </div>
        </Router>
    );
}

export default App;

