import React, { useState } from 'react';

const ComplaintRegister = () => {
    const [employeeName, setEmployeeName] = useState('');
    const [complaint, setComplaint] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();

        // Generate random reference number
        const referenceNumber = 'REF' + Math.floor(Math.random() * 1000000);

        alert(`Complaint Registered Successfully!\nReference No: ${referenceNumber}`);

        // Clear form fields after submission
        setEmployeeName('');
        setComplaint('');
    };

    return (
        <div>
            <h1>Complaint Registration Form</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Employee Name: </label>
                    <input 
                        type="text" 
                        value={employeeName} 
                        onChange={(e) => setEmployeeName(e.target.value)} 
                        required
                    />
                </div>
                <div>
                    <label>Complaint: </label><br />
                    <textarea 
                        value={complaint} 
                        onChange={(e) => setComplaint(e.target.value)} 
                        rows="4" 
                        cols="50" 
                        required
                    />
                </div>
                <button type="submit">Submit Complaint</button>
            </form>
        </div>
    );
};

export default ComplaintRegister;