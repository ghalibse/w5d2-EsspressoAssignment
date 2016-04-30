package com.example.simplemockito;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by evin on 4/29/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class SimpleMockitoUnitTest {

    private static final String FAKE_STRING = "Hello World";

    @Mock
    Context mMockContext;

    @Test
    public void simpleClass_returnsString() {
        when(mMockContext.getString(R.string.hello_word)).thenReturn(FAKE_STRING + " a ");

        SimpleClass myObjectUnderTest = new SimpleClass(mMockContext);
        String result = myObjectUnderTest.getHelloWorldString();

        assertThat(result, is(FAKE_STRING));
    }
}