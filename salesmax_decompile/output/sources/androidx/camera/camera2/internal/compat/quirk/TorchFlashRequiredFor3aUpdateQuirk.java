package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001o.j5e;
import p001o.m42;
import p001o.s82;

/* loaded from: classes2.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements j5e {

    /* renamed from: b */
    public static final List f6085b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* renamed from: a */
    public final s82 f6086a;

    public TorchFlashRequiredFor3aUpdateQuirk(s82 s82Var) {
        this.f6086a = s82Var;
    }

    /* renamed from: c */
    public static boolean m4628c(s82 s82Var) {
        return m4629d() && m4631g(s82Var);
    }

    /* renamed from: d */
    public static boolean m4629d() {
        Iterator it = f6085b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m4630e(s82 s82Var) {
        return Build.VERSION.SDK_INT >= 28 && m42.m38284D(s82Var, 5) == 5;
    }

    /* renamed from: g */
    public static boolean m4631g(s82 s82Var) {
        return ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    /* renamed from: h */
    public static boolean m4632h(s82 s82Var) {
        return m4628c(s82Var);
    }

    /* renamed from: f */
    public boolean m4633f() {
        return !m4630e(this.f6086a);
    }
}
