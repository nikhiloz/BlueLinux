package android.os;

public class AttributionSource implements Parcelable {
    public AttributionSource() {}
    public AttributionSource(int uid, String packageName, String featureTag) {}
    public static AttributionSource myAttributionSource() { return new AttributionSource(); }

    public String getPackageName() { return "com.android.bluetooth"; }
    public int getUid() { return 1000; }
    public int getPid() { return 0; }

    @Override
    public int describeContents() { return 0; }
    @Override
    public void writeToParcel(Parcel dest, int flags) {}

    public static class Builder {
        public Builder(AttributionSource source) {}
        public Builder setNext(AttributionSource next) { return this; }
        public AttributionSource build() { return new AttributionSource(); }
    }
}
