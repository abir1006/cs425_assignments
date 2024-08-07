import React, {useEffect, useState} from 'react';
import axios from 'axios';

const StudentList = () => {
    const [students, setStudents] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        setLoading(true); // Set loading to true at the start of the fetch
        axios.get('http://localhost:8080/students')
            .then(response => {
                setStudents(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
    }, []);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>Error: {error.message}</div>;

    return (
        <div>
            <h1>Student List</h1>
            <ul>
                {students.map((student) => (
                    <li key={student.studentId}>
                        {student.firstName} {student.middleName} {student.lastName} - CGPA: {student.cgpa}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default StudentList;
