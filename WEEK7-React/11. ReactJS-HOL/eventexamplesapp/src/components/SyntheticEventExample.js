import React from 'react';

const SyntheticEventExample = () => {

    const handleClick = (event) => {
        alert('I was clicked');
        console.log(event);  // SyntheticEvent object
    };

    return (
        <div>
            <button onClick={handleClick}>Synthetic Event OnPress</button>
        </div>
    );
};

export default SyntheticEventExample;
