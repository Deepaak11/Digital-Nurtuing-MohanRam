import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails
        name="React Training"
        status="Ongoing"
        startDate="2025-07-01"
        endDate="2025-07-31"
      />
      <CohortDetails
        name="Node Bootcamp"
        status="Completed"
        startDate="2025-06-01"
        endDate="2025-06-30"
      />
    </div>
  );
}

export default App;
