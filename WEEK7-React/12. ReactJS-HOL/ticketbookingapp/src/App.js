import React, { Component } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            isLoggedIn: false
        };
    }

    handleLogin = () => {
        this.setState({ isLoggedIn: true });
    }

    handleLogout = () => {
        this.setState({ isLoggedIn: false });
    }

    render() {
        // Element Variables for conditional rendering
        let page;
        if (this.state.isLoggedIn) {
            page = <UserPage />;
        } else {
            page = <GuestPage />;
        }

        return (
            <div className="App">
                <h1>Ticket Booking App</h1>
                {this.state.isLoggedIn ? (
                    <button onClick={this.handleLogout}>Logout</button>
                ) : (
                    <button onClick={this.handleLogin}>Login</button>
                )}

                {/* Conditional Rendering of Pages */}
                {page}
            </div>
        );
    }
}

export default App;
