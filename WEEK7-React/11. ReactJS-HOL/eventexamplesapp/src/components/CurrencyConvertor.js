import React, { Component } from 'react';

class CurrencyConvertor extends Component {
    constructor(props) {
        super(props);
        this.state = {
            rupees: '',
            euro: 0
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({ rupees: event.target.value });
    }

    handleSubmit(event) {
        event.preventDefault();  // Prevent default form submission
        const conversionRate = 0.011; // Example: 1 INR = 0.011 EUR
        const euroValue = this.state.rupees * conversionRate;
        this.setState({ euro: euroValue.toFixed(2) });
    }

    render() {
        return (
            <div>
                <h2>Currency Converter</h2>
                <form onSubmit={this.handleSubmit}>
                    <input 
                        type="number" 
                        value={this.state.rupees} 
                        onChange={this.handleChange} 
                        placeholder="Enter amount in INR"
                    />
                    <button type="submit">Convert</button>
                </form>
                <h3>Amount in Euro: €{this.state.euro}</h3>
            </div>
        );
    }
}

export default CurrencyConvertor;

