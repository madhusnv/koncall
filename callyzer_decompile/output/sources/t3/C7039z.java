package t3;

import ex.InterfaceC2139c;
import java.util.Map;
import v3.C7648t;
import v3.C7649u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.z */
/* loaded from: classes.dex */
public final class C7039z implements k0 {

    /* renamed from: a */
    public final /* synthetic */ int f34048a;

    /* renamed from: b */
    public final /* synthetic */ int f34049b;

    /* renamed from: c */
    public final /* synthetic */ Map f34050c;

    /* renamed from: d */
    public final /* synthetic */ a0 f34051d;

    /* renamed from: e */
    public final /* synthetic */ f0 f34052e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f34053f;

    public C7039z(int i10, int i11, Map map, a0 a0Var, f0 f0Var, InterfaceC2139c interfaceC2139c) {
        this.f34048a = i10;
        this.f34049b = i11;
        this.f34050c = map;
        this.f34051d = a0Var;
        this.f34052e = f0Var;
        this.f34053f = interfaceC2139c;
    }

    @Override // t3.k0
    /* renamed from: b */
    public final int mo12108b() {
        return this.f34048a;
    }

    @Override // t3.k0
    /* renamed from: c */
    public final Map mo12109c() {
        return this.f34050c;
    }

    @Override // t3.k0
    /* renamed from: d */
    public final void mo12110d() {
        C7648t c7648t;
        v3.g0 g0Var = this.f34052e.f33979a;
        boolean zMo12874R = this.f34051d.mo12874R();
        InterfaceC2139c interfaceC2139c = this.f34053f;
        if (!zMo12874R || (c7648t = ((C7649u) g0Var.f36832K.f22539c).f37017X) == null) {
            interfaceC2139c.invoke(((C7649u) g0Var.f36832K.f22539c).f36957j);
        } else {
            interfaceC2139c.invoke(c7648t.f36957j);
        }
    }

    @Override // t3.k0
    /* renamed from: e */
    public final InterfaceC2139c mo12111e() {
        return null;
    }

    @Override // t3.k0
    public final int getHeight() {
        return this.f34049b;
    }
}
