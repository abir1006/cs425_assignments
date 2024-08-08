import React, { useState } from "react";
import axios from "axios";

const RemoveStudent = () => {
    const [studentId, setStudentId] = useState("");

    // Handle input change
    const handleChange = (e) => {
        // Directly update the studentId state with the input value
        setStudentId(e.target.value);
    };

    // Handle form submission
    const handleSubmit = async (e) => {
        e.preventDefault(); // Prevent default form submission behavior

        try {
            // Make DELETE request to remove student by ID
            const response = await axios.delete(`http://localhost:8080/eregistrar/api/student/delete/${studentId}`);
            alert("Student Removed Successfully!"); // Display success message

        } catch (error) {
            alert("Failed to remove student!"); // Display error message
            console.error("There was an error deleting the student!", error); // Log error to console
        }
    };

    return (
        <div>
            <h2>Student Remove Form</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Enter Student ID</label>
                    <input
                        type="text"
                        name="studentId" // Ensure the input name matches the state name
                        value={studentId} // Bind the input value to studentId state
                        onChange={handleChange} // Handle input changes
                    />
                </div>
                <button type="submit">Remove</button> {/* Submit button to remove student */}
            </form>
        </div>
    );
}

export default RemoveStudent;
