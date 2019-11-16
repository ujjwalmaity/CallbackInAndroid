package dev.ujjwal.callbackinandroid;

public class WorkingClass {
    private CallBackInterface callBackInterface;

    public WorkingClass(CallBackInterface callBackInterface) {
        this.callBackInterface = callBackInterface;
    }

    public void passData() {
        callBackInterface.data("Hello! Callback done.");
    }
}
