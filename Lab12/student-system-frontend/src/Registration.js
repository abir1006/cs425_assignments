import React, { useState } from "react";
import axios from "axios";

const Registration = () => {
    const [formData, setFormData] = useState({
        studentId: "",
        studentNumber: "",
        firstName: "",
        middleName: "",
        lastName: "",
        cgpa: "",
        dateOfEnrollment: "",
        isInternational: false, // Initialize as a boolean
        transcript: {
            degreeTitle: ""
        }
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({
            ...formData,
            [name]: value
        });
    };

    

    const handleIsInternationalChange = (e) => {
        const { value } = e.target;
        setFormData({
            ...formData,
            isInternational: value === "true" // Convert string to boolean
        });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        const { studentId, ...submissionData } = formData; // Remove studentId

        try {
            const response = await axios.post("http://localhost:8080/eregistrar/api/student/register", submissionData);
            alert("Successfully saved!");
        } catch (error) {
            alert("Failed to save!");
            console.error("There was an error saving the data!", error);
        }

        console.log(submissionData);
    };

    return (
        <div>
            <h2>Registration Form</h2>
            <form onSubmit={handleSubmit}>
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
                    <label>Is International</label>
                    <div>
                        <label>
                            <input
                                type="radio"
                                name="isInternational"
                                value="true"
                                checked={formData.isInternational === true}
                                onChange={handleIsInternationalChange}
                            />
                            Yes
                        </label>
                        <label>
                            <input
                                type="radio"
                                name="isInternational"
                                value="false"
                                checked={formData.isInternational === false}
                                onChange={handleIsInternationalChange}
                            />
                            No
                        </label>
                    </div>
                </div>
                
                <button type="submit">Register</button>
            </form>
        </div>
    );
};

export default Registration;
