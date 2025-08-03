import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
    const [selected, setSelected] = useState('books');

    const books = [
        { id: 1, title: 'Learn React', author: 'Dan Abramov' },
        { id: 2, title: 'JavaScript Mastery', author: 'Kyle Simpson' }
    ];

    const blogs = [
        { id: 1, title: 'React Hooks Explained', writer: 'Kent C. Dodds' },
        { id: 2, title: 'Frontend Roadmap 2025', writer: 'Fireship' }
    ];

    const courses = [
        { id: 1, name: 'React Basics', duration: '6 weeks' },
        { id: 2, name: 'Advanced React', duration: '8 weeks' }
    ];

    // Element Variable Conditional Rendering
    let content;
    if (selected === 'books') {
        content = <BookDetails books={books} />;
    } else if (selected === 'blogs') {
        content = <BlogDetails blogs={blogs} />;
    } else {
        content = <CourseDetails courses={courses} />;
    }

    return (
        <div className="App">
            <h1>Blogger App</h1>

            {/* Buttons to toggle views */}
            <button onClick={() => setSelected('books')}>Books</button>
            <button onClick={() => setSelected('blogs')}>Blogs</button>
            <button onClick={() => setSelected('courses')}>Courses</button>

            <hr />

            {/* Rendering Using Element Variable */}
            {content}

            {/* Rendering Using Ternary Operator */}
            <hr />
            <h2>Conditional Rendering - Ternary Operator</h2>
            {selected === 'books' ? (
                <BookDetails books={books} />
            ) : selected === 'blogs' ? (
                <BlogDetails blogs={blogs} />
            ) : (
                <CourseDetails courses={courses} />
            )}

            {/* Rendering Using Short Circuit (&&) */}
            <hr />
            <h2>Conditional Rendering - && Operator</h2>
            {selected === 'books' && <BookDetails books={books} />}
            {selected === 'blogs' && <BlogDetails blogs={blogs} />}
            {selected === 'courses' && <CourseDetails courses={courses} />}
        </div>
    );
}

export default App;
