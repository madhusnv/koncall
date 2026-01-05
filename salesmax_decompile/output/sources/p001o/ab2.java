package p001o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;
import p001o.oa2;

/* loaded from: classes2.dex */
public abstract class ab2 {

    /* renamed from: a */
    public static final oa2 f14434a = new oa2.C15741a().m41868b(2).m41867a();

    /* renamed from: o.ab2$a */
    public static class C12129a {
        /* renamed from: a */
        public static int m16804a(Context context) {
            return context.getDeviceId();
        }
    }

    /* renamed from: o.ab2$b */
    public static class C12130b extends Exception {

        /* renamed from: a */
        public int f14435a;

        public C12130b(String str, int i, Throwable th) {
            super(str, th);
            this.f14435a = i;
        }

        /* renamed from: a */
        public int m16805a() {
            return this.f14435a;
        }
    }

    /* renamed from: a */
    public static void m16803a(Context context, la2 la2Var, oa2 oa2Var) throws C12130b {
        Integer numM41865d;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && C12129a.m16804a(context) != 0) {
            LinkedHashSet linkedHashSetM36829a = la2Var.m36829a();
            if (linkedHashSetM36829a.isEmpty()) {
                throw new C12130b("No cameras available", 0, null);
            }
            wja.m54627a("CameraValidator", "Virtual device with ID: " + C12129a.m16804a(context) + " has " + linkedHashSetM36829a.size() + " cameras. Skipping validation.");
            return;
        }
        if (oa2Var != null) {
            try {
                numM41865d = oa2Var.m41865d();
                if (numM41865d == null) {
                    wja.m54638l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                wja.m54630d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            numM41865d = null;
        }
        wja.m54627a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numM41865d);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (oa2Var == null || numM41865d.intValue() == 1)) {
                oa2.f37990d.m41866e(la2Var.m36829a());
                i = 1;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            wja.m54639m("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (oa2Var == null || numM41865d.intValue() == 0)) {
                oa2.f37989c.m41866e(la2Var.m36829a());
                i++;
            }
        } catch (IllegalArgumentException e3) {
            illegalArgumentException = e3;
            wja.m54639m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f14434a.m41866e(la2Var.m36829a());
            wja.m54627a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        wja.m54629c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + la2Var.m36829a());
        throw new C12130b("Expected camera missing from device.", i, illegalArgumentException);
    }
}
