package com.android.modules.expresslog;

public class Histogram {
    public static class UniformOptions {
        public UniformOptions(int count, int min, int max) {}
    }
    public Histogram(String name, int buckets) {}
    public Histogram(String name, UniformOptions options) {}
    public void log(long value) {}
    public void logSample(float sample) {}
    public void logSample(long sample) {}
    public void logSample(double sample) {}
}
