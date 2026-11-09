package kotlin.time;

public interface TimeSource {
    interface TimeMark {}
    class Monotonic implements TimeSource {
        public static final Monotonic INSTANCE = new Monotonic();
        public TimeMark markNow() { return null; }
    }
}
