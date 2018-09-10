package ilgulee.com.androidtestprojectforcircleci;

interface MainActivityContract {
    interface View {
        void changeTextViewText(String text);

        void changeBackgroundColor(int color);

        void launchOtherActivity(Class activity);
    }

    interface Presenter {
        void editTextUpdated(String text);

        void colorSelected(int index);

        void launchOtherActivityButtonClicked(Class activity);
    }
}