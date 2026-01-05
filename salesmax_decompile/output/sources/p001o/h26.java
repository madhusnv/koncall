package p001o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import p001o.f26;

/* loaded from: classes2.dex */
public class h26 implements f26.InterfaceC13313a {

    /* renamed from: a */
    public static final f26 f26116a = new f26(new h26());

    /* renamed from: b */
    public static final Set f26117b = Collections.singleton(y16.f54703d);

    @Override // p001o.f26.InterfaceC13313a
    /* renamed from: a */
    public DynamicRangeProfiles mo25956a() {
        return null;
    }

    @Override // p001o.f26.InterfaceC13313a
    /* renamed from: b */
    public Set mo25957b(y16 y16Var) {
        fgd.m26658b(y16.f54703d.equals(y16Var), "DynamicRange is not supported: " + y16Var);
        return f26117b;
    }

    @Override // p001o.f26.InterfaceC13313a
    /* renamed from: c */
    public Set mo25958c() {
        return f26117b;
    }
}
