import React from 'react';

const IndianPlayers = () => {
    const oddPlayers = ['Virat Kohli', 'Rishabh Pant', 'Jasprit Bumrah', 'KL Rahul', 'Mohammed Siraj', 'Shreyas Iyer'];
    const evenPlayers = ['Rohit Sharma', 'Shubman Gill', 'Hardik Pandya', 'Ravindra Jadeja', 'Yuzvendra Chahal'];

    const [firstOdd, ...restOdd] = oddPlayers;
    const [firstEven, ...restEven] = evenPlayers;

    const T20players = ['SuryaKumar Yadav', 'Ishan Kishan', 'Deepak Chahar'];
    const RanjiTrophyPlayers = ['Cheteshwar Pujara', 'Ajinkya Rahane'];

    const allPlayers = [...T20players, ...RanjiTrophyPlayers];

    return (
        <div>
            <h2>Odd Team Players</h2>
            <p>Captain: {firstOdd}</p>
            <ul>
                {restOdd.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h2>Even Team Players</h2>
            <p>Captain: {firstEven}</p>
            <ul>
                {restEven.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h2>Merged T20 & Ranji Trophy Players</h2>
            <ul>
                {allPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>
        </div>
    );
};

export default IndianPlayers;
