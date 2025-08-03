import React from 'react';
import Counter from './components/Counter';
import SyntheticEventExample from './components/SyntheticEventExample';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
    return (
        <div className="App">
            <h1>React Events Example App</h1>
            <Counter />
            <hr />
            <SyntheticEventExample />
            <hr />
            <CurrencyConvertor />
        </div>
    );
}

export default App;
