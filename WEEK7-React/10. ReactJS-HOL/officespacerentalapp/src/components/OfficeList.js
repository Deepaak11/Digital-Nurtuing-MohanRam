import React from 'react';

const OfficeList = () => {
    // Single office object
    const office = {
        name: "WeWork Tower",
        rent: 55000,
        address: "MG Road, Bengaluru",
        imageUrl: "https://images.squarespace-cdn.com/content/v1/51eee706e4b053d3fee6b4eb/1588194208017-H3OSUF9SLQPG26W8WIYI/WW-SFT-Pano_7.jpg"
    };

    // List of office spaces
    const officeSpaces = [
        { 
            name: "Regus Space", 
            rent: 65000, 
            address: "Whitefield, Bengaluru", 
            imageUrl: "https://tse1.mm.bing.net/th/id/OIP.CF0FYyx_gykJVxegN9iy2QHaEI?w=1552&h=866&rs=1&pid=ImgDetMain&o=7&rm=3" 
        },
        { 
            name: "Cowork Hub", 
            rent: 45000, 
            address: "HSR Layout, Bengaluru", 
            imageUrl: "https://images.unsplash.com/photo-1612639907789-30efdfd641ec?ixlib=rb-4.0.3&auto=format&fit=crop&w=800&q=60" 
        },
        { 
            name: "Innov8 Workspace", 
            rent: 70000, 
            address: "Koramangala, Bengaluru", 
            imageUrl: "https://images.unsplash.com/photo-1573164713347-df1e1e8a9a84?ixlib=rb-4.0.3&auto=format&fit=crop&w=800&q=60" 
        }
    ];

    // Inline CSS conditionally for rent color
    const rentStyle = (rent) => {
        return {
            color: rent < 60000 ? 'red' : 'green',
            fontWeight: 'bold'
        };
    };

    return (
        <div>
            {/* Heading using JSX */}
            <h1>Office Space Rental App</h1>

            {/* Single Office Display */}
            <div style={{ border: '1px solid gray', padding: '10px', margin: '10px' }}>
                <img src={office.imageUrl} alt={office.name} width="300" />
                <h2>{office.name}</h2>
                <p>Address: {office.address}</p>
                <p style={rentStyle(office.rent)}>Rent: ₹{office.rent}</p>
            </div>

            {/* List of Office Spaces */}
            <h2>Available Office Spaces</h2>
            {officeSpaces.map((item, index) => (
                <div key={index} style={{ border: '1px solid gray', padding: '10px', margin: '10px' }}>
                    <img src={item.imageUrl} alt={item.name} width="300" />
                    <h3>{item.name}</h3>
                    <p>Address: {item.address}</p>
                    <p style={rentStyle(item.rent)}>Rent: ₹{item.rent}</p>
                </div>
            ))}
        </div>
    );
};

export default OfficeList;
