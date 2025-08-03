import React, { useState } from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
    const [flag, setFlag] = useState(true);

    const toggleFlag = () => {
        setFlag(!flag);
    };

    return (
        <div className="App">
            <h1>Cricket App</h1>
            <button onClick={toggleFlag}>Toggle Component</button>

            {flag ? <ListofPlayers /> : <IndianPlayers />}
        </div>
    );
}

export default App;
