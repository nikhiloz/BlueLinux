package android.content;

import android.os.Parcelable;

public final class ComponentName implements Parcelable {
    private final String mPackage;
    private final String mClass;

    public ComponentName(String pkg, String cls) {
        mPackage = pkg;
        mClass = cls;
    }

    public ComponentName(Context pkg, Class<?> cls) {
        mPackage = pkg.getPackageName();
        mClass = cls.getName();
    }

    public String getPackageName() {
        return mPackage;
    }

    public String getClassName() {
        return mClass;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {}

    public static final Creator<ComponentName> CREATOR = new Creator<ComponentName>() {
        @Override
        public ComponentName createFromParcel(android.os.Parcel in) {
            return new ComponentName("", "");
        }

        @Override
        public ComponentName[] newArray(int size) {
            return new ComponentName[size];
        }
    };


    public String flattenToString() { return ""; }

}
