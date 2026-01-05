package i0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import c0.C0825r;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a */
    public static final C0825r f16553a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new f1(2));
        f16553a = new C0825r(linkedHashSet);
    }

    /* renamed from: a */
    public static void m7408a(Context context, l0 l0Var, C0825r c0825r) throws CameraValidator$CameraIdListIncorrectException {
        Integer numM2226b;
        if (Build.VERSION.SDK_INT >= 34 && c6.e0.m2363j(context) != 0) {
            LinkedHashSet linkedHashSetM7359c = l0Var.m7359c();
            c6.e0.m2363j(context);
            linkedHashSetM7359c.size();
            og.u1.m10942a("CameraValidator");
            return;
        }
        IllegalArgumentException e2 = null;
        if (c0825r != null) {
            try {
                numM2226b = c0825r.m2226b();
                if (numM2226b == null) {
                    og.u1.m10951j("CameraValidator");
                    return;
                }
            } catch (IllegalStateException unused) {
                og.u1.m10944c("CameraValidator");
                return;
            }
        } else {
            numM2226b = null;
        }
        String str = Build.DEVICE;
        og.u1.m10942a("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        int i10 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0825r == null || numM2226b.intValue() == 1)) {
                C0825r.f5203c.m2227c(l0Var.m7359c());
                i10 = 1;
            }
        } catch (IllegalArgumentException e10) {
            e2 = e10;
            og.u1.m10952k("CameraValidator");
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0825r == null || numM2226b.intValue() == 0)) {
                C0825r.f5202b.m2227c(l0Var.m7359c());
                i10++;
            }
        } catch (IllegalArgumentException e11) {
            e2 = e11;
            og.u1.m10952k("CameraValidator");
        }
        try {
            f16553a.m2227c(l0Var.m7359c());
            og.u1.m10942a("CameraValidator");
            i10++;
        } catch (IllegalArgumentException unused2) {
        }
        if (e2 == null) {
            return;
        }
        l0Var.m7359c().toString();
        og.u1.m10943b("CameraValidator");
        throw new CameraValidator$CameraIdListIncorrectException(i10, e2);
    }
}
