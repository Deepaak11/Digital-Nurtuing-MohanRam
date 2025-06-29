package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data from API");

        // Step 3: Inject mock into service and call method
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Step 4: Assert result
        assertEquals("Mock Data from API", result);
    }
}
