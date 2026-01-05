package com.amplifyframework.devmenu;

import a2.AbstractC0030c;
import android.os.Build;
import com.sun.mail.util.AbstractC1452a;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeviceInfo {
    public boolean isEmulator() {
        return Build.DEVICE.toLowerCase(Locale.getDefault()).contains("generic") && Build.MODEL.toLowerCase(Locale.getDefault()).contains("sdk");
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        int i10 = Build.VERSION.SDK_INT;
        String str4 = isEmulator() ? "Yes" : "No";
        StringBuilder sbM127r = AbstractC0030c.m127r("Device Manufacturer: ", str, "\nDevice Model: ", str2, "\nAndroid System Version: ");
        AbstractC1452a.m4551B(sbM127r, str3, "\nSDK Version: ", i10, "\nDevice is an Emulator: ");
        sbM127r.append(str4);
        return sbM127r.toString();
    }
}
