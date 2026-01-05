package com.onesignal.core.internal.device;

/* loaded from: classes6.dex */
public interface IDeviceService {

    public enum DeviceType {
        Fire(2),
        Android(1),
        Huawei(13);

        private final int value;

        DeviceType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum JetpackLibraryStatus {
        MISSING,
        OUTDATED,
        OK
    }

    DeviceType getDeviceType();

    boolean getHasAllHMSLibrariesForPushKit();

    boolean getHasFCMLibrary();

    JetpackLibraryStatus getJetpackLibraryStatus();

    boolean getSupportsHMS();

    boolean isAndroidDeviceType();

    boolean isFireOSDeviceType();

    boolean isGMSInstalledAndEnabled();

    boolean isHuaweiDeviceType();

    boolean supportsGooglePush();
}
