package com.example.simplemockito;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
/**
 * Created by admin on 8/16/2016.
 */
public class editTextTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRecyclerClick() {
        onView(withId(R.id.a_main_edittext))
                .perform( typeText("niwdE") );

        onView(withId(R.id.a_main_btn))
                .perform(click());

        onView(withId(R.id.some_text))
                .check(matches(withText("Edwin")));
    }
}
