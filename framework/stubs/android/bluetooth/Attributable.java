package android.bluetooth;

import android.content.AttributionSource;

public interface Attributable {
    default void setAttributionSource(AttributionSource attributionSource) {}
    
    public static void setAttributionSource(Object obj, AttributionSource attributionSource) {}
}
