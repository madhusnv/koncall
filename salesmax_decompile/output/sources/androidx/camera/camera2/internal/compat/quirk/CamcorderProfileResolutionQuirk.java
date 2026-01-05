package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;
import p001o.j5e;
import p001o.q6g;
import p001o.s82;

/* loaded from: classes2.dex */
public class CamcorderProfileResolutionQuirk implements j5e {

    /* renamed from: a */
    public final q6g f6058a;

    /* renamed from: b */
    public List f6059b = null;

    public CamcorderProfileResolutionQuirk(s82 s82Var) {
        this.f6058a = s82Var.m47966b();
    }

    /* renamed from: c */
    public static boolean m4528c(s82 s82Var) {
        Integer num = (Integer) s82Var.m47965a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
