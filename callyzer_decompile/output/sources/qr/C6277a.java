package qr;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import ur.k0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6277a implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30497a;

    /* renamed from: b */
    public final /* synthetic */ k0 f30498b;

    /* renamed from: c */
    public final /* synthetic */ boolean f30499c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f30500d;

    public /* synthetic */ C6277a(k0 k0Var, boolean z6, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f30497a = i11;
        this.f30498b = k0Var;
        this.f30499c = z6;
        this.f30500d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f30497a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC6287k.m12294k(this.f30498b, this.f30499c, this.f30500d, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC6287k.m12295l(this.f30498b, this.f30499c, this.f30500d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }
}
