import React from 'react';

const ListofPlayers = () => {
    const players = [
        { name: 'Virat Kohli', score: 85 },
        { name: 'Rohit Sharma', score: 90 },
        { name: 'Rishabh Pant', score: 65 },
        { name: 'Shubman Gill', score: 75 },
        { name: 'Jasprit Bumrah', score: 60 },
        { name: 'Hardik Pandya', score: 80 },
        { name: 'KL Rahul', score: 50 },
        { name: 'Ravindra Jadeja', score: 95 },
        { name: 'Mohammed Siraj', score: 40 },
        { name: 'Yuzvendra Chahal', score: 70 },
        { name: 'Shreyas Iyer', score: 78 }
    ];

    const below70Players = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>All Players</h2>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>{player.name} - {player.score}</li>
                ))}
            </ul>

            <h2>Players with Score Below 70</h2>
            <ul>
                {below70Players.map((player, index) => (
                    <li key={index}>{player.name} - {player.score}</li>
                ))}
            </ul>
        </div>
    );
};

export default ListofPlayers;
