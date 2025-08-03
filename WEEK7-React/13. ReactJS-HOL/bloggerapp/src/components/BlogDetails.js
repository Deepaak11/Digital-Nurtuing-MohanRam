import React from 'react';

const BlogDetails = ({ blogs }) => {
    return (
        <div>
            <h2>Blogs List</h2>
            <ul>
                {blogs.map((blog) => (
                    <li key={blog.id}>
                        {blog.title} - {blog.writer}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default BlogDetails;
