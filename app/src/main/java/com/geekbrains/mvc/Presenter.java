package com.geekbrains.mvc;

public class Presenter {

    public static final int BUTTON_ID1 = 1;
    public static final int BUTTON_ID2 = 2;
    public static final int BUTTON_ID3 = 3;
    private final Model mModel;
    private final MainView mView;

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(int id) {
        int newModelValue;
        switch (id) {
            case BUTTON_ID1:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                mView.setButtonText(BUTTON_ID1, newModelValue);
                break;

            case BUTTON_ID2:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                mView.setButtonText(BUTTON_ID2, newModelValue);
                break;

            case BUTTON_ID3:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                mView.setButtonText(BUTTON_ID3, newModelValue);
                break;
        }
    }
}
