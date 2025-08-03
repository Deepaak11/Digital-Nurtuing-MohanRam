import React from 'react';

const FlightDetails = () => {
    const flights = [
        { flightNo: 'AI101', destination: 'New York', time: '10:00 AM' },
        { flightNo: 'AI202', destination: 'London', time: '2:00 PM' },
        { flightNo: 'AI303', destination: 'Dubai', time: '6:00 PM' },
    ];

    return (
        <div>
            <h3>Available Flights</h3>
            <ul>
                {flights.map((flight, index) => (
                    <li key={index}>
                        {flight.flightNo} - {flight.destination} at {flight.time}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default FlightDetails;
