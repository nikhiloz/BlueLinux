package android.net;

public class LocalSocketAddress {
    public enum Namespace {
        ABSTRACT,
        FILESYSTEM,
        RESERVED
    }

    public LocalSocketAddress(String name) {}
    public LocalSocketAddress(String name, Namespace namespace) {}
    public String getName() { return ""; }
}
