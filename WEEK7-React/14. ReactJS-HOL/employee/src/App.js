import React, { useState } from 'react';
import EmployeeList from './components/EmployeeList';
import ThemeContext from './ThemeContext';

function App() {
    const [theme, setTheme] = useState('light');

    const toggleTheme = () => {
        setTheme(theme === 'light' ? 'dark' : 'light');
    };

    return (
        <ThemeContext.Provider value={theme}>
            <div className={`App ${theme}`}>
                <h1>Employee Management App</h1>
                <button onClick={toggleTheme}>
                    Switch to {theme === 'light' ? 'Dark' : 'Light'} Mode
                </button>
                {/* Remove theme prop from EmployeeList */}
                <EmployeeList />
            </div>
        </ThemeContext.Provider>
    );
}

export default App;
