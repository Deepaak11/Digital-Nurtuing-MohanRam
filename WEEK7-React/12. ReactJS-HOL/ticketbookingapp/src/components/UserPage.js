import React from 'react';
import FlightDetails from './FlightDetails';

const UserPage = () => {
    return (
        <div>
            <h2>Welcome User!</h2>
            <p>You are logged in. You can now book tickets.</p>
            <FlightDetails />
            <button>Book Ticket</button>
        </div>
    );
};

export default UserPage;
