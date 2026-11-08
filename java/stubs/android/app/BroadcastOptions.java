package android.app;
public class BroadcastOptions {
    public static BroadcastOptions makeBasic() { return new BroadcastOptions(); }
    public android.os.Bundle toBundle() { return new android.os.Bundle(); }
    public void setTemporaryAppAllowlist(long duration, int type, int reason, String reasonString) {}
}
