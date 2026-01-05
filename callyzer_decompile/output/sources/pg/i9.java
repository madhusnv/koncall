package pg;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import b00.AbstractC0532q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import p021w.C7843i;
import p023y.AbstractC8523a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i9 {
    /* renamed from: a */
    public static final void m11699a(AbstractC0532q abstractC0532q, b00.a0 a0Var) throws IOException {
        try {
            IOException iOException = null;
            for (b00.a0 a0Var2 : abstractC0532q.mo1600A(a0Var)) {
                try {
                    if (abstractC0532q.m1621H(a0Var2).f3656c) {
                        m11699a(abstractC0532q, a0Var2);
                    }
                    abstractC0532q.mo1608u(a0Var2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public static boolean m11700b(a1.c0 c0Var) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            c0Var.getClass();
            bool = (Boolean) ((C7843i) c0Var.f22b).m14823a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (AbstractC8523a.f41447a.m5729g(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                og.u1.m10942a("FlashAvailability");
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                og.u1.m10944c("FlashAvailability");
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            og.u1.m10951j("FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
