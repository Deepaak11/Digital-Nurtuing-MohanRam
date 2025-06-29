package org.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Optional: Stub method to avoid null return
        when(mockApi.getData()).thenReturn("Verified Response");

        // Step 2: Call method via service
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called once
        verify(mockApi).getData();
    }
}
