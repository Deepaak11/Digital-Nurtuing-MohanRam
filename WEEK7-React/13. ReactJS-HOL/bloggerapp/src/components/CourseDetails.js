import React from 'react';

const CourseDetails = ({ courses }) => {
    return (
        <div>
            <h2>Courses List</h2>
            <ul>
                {courses.map((course) => (
                    <li key={course.id}>
                        {course.name} - Duration: {course.duration}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default CourseDetails;
