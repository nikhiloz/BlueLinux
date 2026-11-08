package android.content;

import android.os.UserHandle;

public abstract class BroadcastReceiver {
    public abstract void onReceive(Context context, Intent intent);

    public final PendingResult goAsync() {
        return null;
    }

    public final UserHandle getSendingUser() {
        return UserHandle.SYSTEM;
    }

    public static class PendingResult {
        public void finish() {}
    }
}
