package com.android.bluetooth.metrics;
public class Histogram {
    public static class UniformOptions {
        public UniformOptions(int count, int min, int max) {}
    }
    public void logSample(float sample) {}
    public void logSample(long sample) {}
    public void logSample(double sample) {}
}
