package android.content.pm;

public class PackageInfo {
    public String packageName;
    public long longVersionCode;
    public ApplicationInfo applicationInfo;


    public android.content.pm.ActivityInfo[] activities;
    public android.content.pm.ServiceInfo[] services;
    public android.content.pm.ActivityInfo[] receivers;
    public android.content.pm.ProviderInfo[] providers;

}
