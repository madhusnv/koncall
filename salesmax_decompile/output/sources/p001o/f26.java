package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f26 {

    /* renamed from: a */
    public final InterfaceC13313a f22561a;

    /* renamed from: o.f26$a */
    public interface InterfaceC13313a {
        /* renamed from: a */
        DynamicRangeProfiles mo25956a();

        /* renamed from: b */
        Set mo25957b(y16 y16Var);

        /* renamed from: c */
        Set mo25958c();
    }

    public f26(InterfaceC13313a interfaceC13313a) {
        this.f22561a = interfaceC13313a;
    }

    /* renamed from: a */
    public static f26 m25951a(s82 s82Var) {
        f26 f26VarM25952e = Build.VERSION.SDK_INT >= 33 ? m25952e(e26.m24147a(s82Var.m47965a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return f26VarM25952e == null ? h26.f26116a : f26VarM25952e;
    }

    /* renamed from: e */
    public static f26 m25952e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        fgd.m26666j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new f26(new g26(dynamicRangeProfiles));
    }

    /* renamed from: b */
    public Set m25953b(y16 y16Var) {
        return this.f22561a.mo25957b(y16Var);
    }

    /* renamed from: c */
    public Set m25954c() {
        return this.f22561a.mo25958c();
    }

    /* renamed from: d */
    public DynamicRangeProfiles m25955d() {
        fgd.m26666j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f22561a.mo25956a();
    }
}
