package v3;

import ex.InterfaceC2139c;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 implements t3.k0 {

    /* renamed from: a */
    public final /* synthetic */ int f36945a;

    /* renamed from: b */
    public final /* synthetic */ int f36946b;

    /* renamed from: c */
    public final /* synthetic */ Map f36947c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f36948d;

    /* renamed from: e */
    public final /* synthetic */ n0 f36949e;

    public l0(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c, n0 n0Var) {
        this.f36945a = i10;
        this.f36946b = i11;
        this.f36947c = map;
        this.f36948d = interfaceC2139c;
        this.f36949e = n0Var;
    }

    @Override // t3.k0
    /* renamed from: b */
    public final int mo12108b() {
        return this.f36945a;
    }

    @Override // t3.k0
    /* renamed from: c */
    public final Map mo12109c() {
        return this.f36947c;
    }

    @Override // t3.k0
    /* renamed from: d */
    public final void mo12110d() {
        this.f36948d.invoke(this.f36949e.f36957j);
    }

    @Override // t3.k0
    /* renamed from: e */
    public final InterfaceC2139c mo12111e() {
        return null;
    }

    @Override // t3.k0
    public final int getHeight() {
        return this.f36946b;
    }
}
