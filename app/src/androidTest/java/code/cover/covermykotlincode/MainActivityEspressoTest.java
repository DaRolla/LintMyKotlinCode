package code.cover.covermykotlincode;

import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

// https://developer.android.com/training/testing/espresso/recipes
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testFabInitiallyIsShown() {
        onView(withId(R.id.fab))
                .check(matches(isDisplayed()));
    }

    @Test
    public void testFabIsGoneAfterClick() {
        onView(withId(R.id.fab))
                .perform(ViewActions.click())
                .check(matches(not(isDisplayed())));
    }

}
