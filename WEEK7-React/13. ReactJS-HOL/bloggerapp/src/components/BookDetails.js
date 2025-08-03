import React from 'react';

const BookDetails = ({ books }) => {
    return (
        <div>
            <h2>Books List</h2>
            <ul>
                {books.map((book) => (
                    <li key={book.id}>
                        {book.title} - {book.author}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default BookDetails;
