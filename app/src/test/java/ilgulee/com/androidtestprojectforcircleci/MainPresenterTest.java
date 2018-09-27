package ilgulee.com.androidtestprojectforcircleci;

import android.graphics.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    MainActivityContract.Presenter presenter;

    @Mock
    MainActivityContract.View view;

//    class MockedView implements MainActivityContract.View{
//        String textViewText;
//        @Override
//        public void changeTextViewText(String text) {
//            textViewText=text;
//    }
//
//        @Override
//        public void changeBackgroundColor(int color) {
//
//        }
//
//        @Override
//        public void launchOtherActivity(Class activity) {
//
//        }
//    }

    @Before
    public void setUp() throws Exception {
//        view=new MockedView();
        presenter=new MainPresenter(view);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void editTextUpdated() {
        String givenString="test123";

        presenter.editTextUpdated(givenString);
        Mockito.verify(view).changeTextViewText(givenString);
//        assertEquals(givenString,((MockedView)view).textViewText);
    }

    @Test
    public void colorSelected() {
        int index = 1;
        int givenColor= Color.WHITE;
        presenter.colorSelected(index);
        Mockito.verify(view).changeBackgroundColor(givenColor);
    }

    @Test
    public void launchOtherActivityButtonClicked() throws Exception{
        Class clazz=OtherActivity.class;
        presenter.launchOtherActivityButtonClicked(clazz);
        Mockito.verify(view).launchOtherActivity(clazz);
    }
}
