package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* loaded from: classes2.dex */
public abstract class l27 {
    /* renamed from: a */
    public static boolean m36450a(t82 t82Var) {
        return m36451b(false, t82Var);
    }

    /* renamed from: b */
    public static boolean m36451b(boolean z, t82 t82Var) {
        Boolean bool;
        try {
            bool = (Boolean) t82Var.mo44818a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (zq5.m59712b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                wja.m54627a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                wja.m54630d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
            }
            if (z) {
                throw e;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            wja.m54638l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
