import React, { Component } from 'react';

class GetUser extends Component {
    constructor(props) {
        super(props);
        this.state = {
            user: null,
            loading: true
        };
    }

    async componentDidMount() {
        try {
            const response = await fetch('https://api.randomuser.me/');
            const data = await response.json();
            this.setState({
                user: data.results[0],
                loading: false
            });
        } catch (error) {
            console.error('Error fetching user:', error);
        }
    }

    render() {
        const { user, loading } = this.state;

        if (loading) {
            return <p>Loading user data...</p>;
        }

        return (
            <div>
                <h2>User Details</h2>
                <p>Title: {user.name.title}</p>
                <p>First Name: {user.name.first}</p>
                <img src={user.picture.large} alt="User" />
            </div>
        );
    }
}

export default GetUser;