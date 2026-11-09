package android.content;

import android.os.Bundle;
import android.os.Parcelable;

public class Intent implements Parcelable {
    private String mAction;
    private ComponentName mComponent;
    private Bundle mExtras = new Bundle();

    public static final int FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT = 0x40000000;
    public static final String ACTION_SETTING_RESTORED = "android.intent.action.SETTING_RESTORED";
    public static final String EXTRA_SETTING_NAME = "setting_name";
    public static final String EXTRA_SETTING_PREVIOUS_VALUE = "setting_previous_value";
    public static final String EXTRA_SETTING_NEW_VALUE = "setting_new_value";
    public static final String ACTION_SHUTDOWN = "android.intent.action.SHUTDOWN";
    public static final String ACTION_USER_SWITCHED = "android.intent.action.USER_SWITCHED";
    public static final String EXTRA_USER_HANDLE = "android.intent.extra.user_handle";

    public Intent() {}

    public Intent(String action) {
        mAction = action;
    }

    public Intent(Context packageContext, Class<?> cls) {
        mComponent = new ComponentName(packageContext, cls);
    }

    public Intent setAction(String action) {
        mAction = action;
        return this;
    }

    public String getAction() {
        return mAction;
    }

    public Intent setComponent(ComponentName component) {
        mComponent = component;
        return this;
    }

    public ComponentName getComponent() {
        return mComponent;
    }

    public Intent addFlags(int flags) { return this; }

    public Intent putExtra(String name, String value) {
        mExtras.putString(name, value);
        return this;
    }

    public Intent putExtra(String name, int value) {
        mExtras.putInt(name, value);
        return this;
    }

    public Intent putExtra(String name, boolean value) {
        mExtras.putBoolean(name, value);
        return this;
    }

    public Intent putExtra(String name, long value) {
        mExtras.putLong(name, value);
        return this;
    }

    public Intent putExtra(String name, Parcelable value) {
        mExtras.putParcelable(name, value);
        return this;
    }

    public String getStringExtra(String name) {
        return mExtras.getString(name);
    }

    public int getIntExtra(String name, int defaultValue) {
        return mExtras.getInt(name, defaultValue);
    }

    public boolean getBooleanExtra(String name, boolean defaultValue) {
        return mExtras.getBoolean(name, defaultValue);
    }

    public long getLongExtra(String name, long defaultValue) {
        return mExtras.getLong(name, defaultValue);
    }

    public <T extends Parcelable> T getParcelableExtra(String name) {
        return mExtras.getParcelable(name);
    }

    public Bundle getExtras() {
        return mExtras;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {}

    public static final Creator<Intent> CREATOR = new Creator<Intent>() {
        @Override
        public Intent createFromParcel(android.os.Parcel in) {
            return new Intent();
        }

        @Override
        public Intent[] newArray(int size) {
            return new Intent[size];
        }
    };
}
