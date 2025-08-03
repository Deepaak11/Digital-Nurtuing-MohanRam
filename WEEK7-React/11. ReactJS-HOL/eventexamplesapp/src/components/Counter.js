import React, { Component } from 'react';

class Counter extends Component {
    constructor(props) {
        super(props);
        this.state = {
            count: 0
        };
        this.increment = this.increment.bind(this);
        this.sayHello = this.sayHello.bind(this);
        this.increaseValue = this.increaseValue.bind(this);
    }

    increment() {
        this.setState({ count: this.state.count + 1 });
    }

    sayHello() {
        console.log('Hello! You clicked Increase button');
        alert('Hello! This is a static message after incrementing.');
    }

    increaseValue() {
        this.increment();
        this.sayHello();
    }

    decrement = () => {
        this.setState({ count: this.state.count - 1 });
    }

    sayWelcome = (message) => {
        alert(`Welcome Message: ${message}`);
    }

    render() {
        return (
            <div>
                <h2>Counter: {this.state.count}</h2>
                <button onClick={this.increaseValue}>Increment</button>
                <button onClick={this.decrement}>Decrement</button>
                <br /><br />
                <button onClick={() => this.sayWelcome("Welcome to React Event Handling!")}>Say Welcome</button>
            </div>
        );
    }
}

export default Counter;
