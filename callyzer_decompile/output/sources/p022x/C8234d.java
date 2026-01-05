package p022x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.a0;
import java.util.Collections;
import java.util.Set;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C8234d implements InterfaceC8232b {

    /* renamed from: a */
    public static final C8233c f39373a = new C8233c((InterfaceC8232b) new C8234d());

    /* renamed from: b */
    public static final Set f39374b = Collections.singleton(a0.f5035d);

    @Override // p022x.InterfaceC8232b
    /* renamed from: a */
    public final DynamicRangeProfiles mo15405a() {
        return null;
    }

    @Override // p022x.InterfaceC8232b
    /* renamed from: b */
    public final Set mo15406b(a0 a0Var) {
        y0.m11051a("DynamicRange is not supported: " + a0Var, a0.f5035d.equals(a0Var));
        return f39374b;
    }

    @Override // p022x.InterfaceC8232b
    /* renamed from: c */
    public final Set mo15407c() {
        return f39374b;
    }
}
