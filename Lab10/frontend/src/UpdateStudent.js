import React, { useState } from "react";
import axios from "axios";

const UpdateStudent = () => {
    const [formData, setFormData] = useState({
        studentId: "",
        studentNumber: "",
        firstName: "",
        middleName: "",
        lastName: "",
        cgpa: "",
        dateOfEnrollment: "",
        transcript: {
            degreeTitle: ""
        }
    });

    // Handle input changes for general fields
    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({
            ...formData,
            [name]: value
        });
    };

    // Handle changes specifically for transcript fields
    const handleTranscriptChange = (e) => {
        const { name, value } = e.target;
        setFormData({
            ...formData,
            transcript: {
                ...formData.transcript,
                [name]: value
            }
        });
    };

    // Handle form submission to update student data
    const handleSubmit = async (e) => {
        e.preventDefault();
        const { studentId, ...submissionData } = formData; // Extract studentId and rest of the data

        try {
            // Make PUT request to update student data
            const response = await axios.put(`http://localhost:8080/students`, submissionData);
            alert("Student data updated successfully!");
        } catch (error) {
            alert("Failed to update student data!");
            console.error("There was an error updating the student data!", error);
        }

        console.log(submissionData);
    };

    return (
        <div>
            <h2>Update Student Form</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Student ID</label>
                    <input
                        type="text"
                        name="studentId"
                        value={formData.studentId}
                        onChange={handleChange}
                        required
                    />
                </div>
                <div>
                    <label>Student Number</label>
                    <input
                        type="text"
                        name="studentNumber"
                        value={formData.studentNumber}
                        onChange={handleChange}
                    />
                </div>
                <div>
                    <label>First Name</label>
                    <input
                        type="text"
                        name="firstName"
                        value={formData.firstName}
                        onChange={handleChange}
                    />
                </div>
                <div>
                    <label>Middle Name</label>
                    <input
                        type="text"
                        name="middleName"
                        value={formData.middleName}
                        onChange={handleChange}
                    />
                </div>
                <div>
                    <label>Last Name</label>
                    <input
                        type="text"
                        name="lastName"
                        value={formData.lastName}
                        onChange={handleChange}
                    />
                </div>
                <div>
                    <label>CGPA</label>
                    <input
                        type="number"
                        name="cgpa"
                        value={formData.cgpa}
                        onChange={handleChange}
                    />
                </div>
                <div>
                    <label>Date of Enrollment</label>
                    <input
                        type="date"
                        name="dateOfEnrollment"
                        value={formData.dateOfEnrollment}
                        onChange={handleChange}
                    />
                </div>
                <div>
                    <label>Transcript Degree Title</label>
                    <input
                        type="text"
                        name="degreeTitle"
                        value={formData.transcript.degreeTitle}
                        onChange={handleTranscriptChange}
                    />
                </div>
                <button type="submit">Update</button>
            </form>
        </div>
    );
}

export default UpdateStudent;
