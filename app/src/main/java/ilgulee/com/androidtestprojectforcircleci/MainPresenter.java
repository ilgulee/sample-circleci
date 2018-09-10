package ilgulee.com.androidtestprojectforcircleci;

import android.graphics.Color;

class MainPresenter implements MainActivityContract.Presenter {
    MainActivityContract.View view;

    public MainPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    public void editTextUpdated(String text) {
        view.changeTextViewText(text);
    }

    public void colorSelected(int index) {
        switch (index) {
            case 0:
                view.changeBackgroundColor(Color.WHITE);
                break;
            case 1:
                view.changeBackgroundColor(Color.MAGENTA);
                break;
            case 2:
                view.changeBackgroundColor(Color.GREEN);
                break;
            case 3:
                view.changeBackgroundColor(Color.CYAN);
                break;
        }
    }

    public void launchOtherActivityButtonClicked(Class activity) {
        view.launchOtherActivity(activity);
    }
}
