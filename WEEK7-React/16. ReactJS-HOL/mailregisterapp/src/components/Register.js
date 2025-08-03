import React, { useState } from 'react';

const Register = () => {
    const [formData, setFormData] = useState({
        name: '',
        email: '',
        password: ''
    });

    const [errors, setErrors] = useState({});

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({
            ...formData,
            [name]: value
        });
    };

    const validate = () => {
        let formErrors = {};

        if (formData.name.length < 5) {
            formErrors.name = 'Name must be at least 5 characters long';
        }

        if (!formData.email.includes('@') || !formData.email.includes('.')) {
            formErrors.email = 'Email must be valid with @ and .';
        }

        if (formData.password.length < 8) {
            formErrors.password = 'Password must be at least 8 characters long';
        }

        return formErrors;
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        const formErrors = validate();

        if (Object.keys(formErrors).length === 0) {
            alert('Registration Successful!');
            setFormData({ name: '', email: '', password: '' });
            setErrors({});
        } else {
            setErrors(formErrors);
        }
    };

    return (
        <div>
            <h1>Mail Register Form</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Name:</label>
                    <input
                        type="text"
                        name="name"
                        value={formData.name}
                        onChange={handleChange}
                    />
                    {errors.name && <p style={{ color: 'red' }}>{errors.name}</p>}
                </div>

                <div>
                    <label>Email:</label>
                    <input
                        type="email"
                        name="email"
                        value={formData.email}
                        onChange={handleChange}
                    />
                    {errors.email && <p style={{ color: 'red' }}>{errors.email}</p>}
                </div>

                <div>
                    <label>Password:</label>
                    <input
                        type="password"
                        name="password"
                        value={formData.password}
                        onChange={handleChange}
                    />
                    {errors.password && <p style={{ color: 'red' }}>{errors.password}</p>}
                </div>

                <button type="submit">Register</button>
            </form>
        </div>
    );
};

export default Register;