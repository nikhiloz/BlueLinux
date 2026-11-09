package android.os;

public final class CancellationSignal {
    public void cancel() {}
    public boolean isCanceled() { return false; }
    public void throwIfCanceled() {}

    public interface OnCancelListener {
        void onCancel();
    }
    public void setOnCancelListener(OnCancelListener listener) {}

}
