package com.android.modules.expresslog;

public class Counter {
    public static void logIncrement(long metricId) {}
    public static void logIncrement(long metricId, int value) {}
    public static void logIncrement(String metricId) {}
    public static void logIncrement(String metricId, long value) {}
    public static void logIncrement(String metricId, int value) {}
    public static void logIncrementWithUid(String metricId, int uid) {}
}
