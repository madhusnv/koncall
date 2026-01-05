package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kq.C4185o;
import yu.AbstractC8775a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3000e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16171a = 1;

    /* renamed from: b */
    public final /* synthetic */ String f16172b;

    /* renamed from: c */
    public final /* synthetic */ boolean f16173c;

    /* renamed from: d */
    public final /* synthetic */ boolean f16174d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2137a f16175e;

    /* renamed from: f */
    public final /* synthetic */ Object f16176f;

    public /* synthetic */ C3000e(String str, boolean z6, boolean z10, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, int i10) {
        this.f16172b = str;
        this.f16173c = z6;
        this.f16174d = z10;
        this.f16175e = interfaceC2137a;
        this.f16176f = interfaceC2137a2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16171a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                a0.m7256b(this.f16172b, this.f16173c, this.f16174d, (C4185o) this.f16176f, this.f16175e, (InterfaceC3962k) obj, iM8496A);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A2 = C3953b.m8496A(1);
                AbstractC8775a.m16145p(this.f16172b, this.f16173c, this.f16174d, this.f16175e, (InterfaceC2137a) this.f16176f, (InterfaceC3962k) obj, iM8496A2);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C3000e(String str, boolean z6, boolean z10, C4185o c4185o, InterfaceC2137a interfaceC2137a, int i10) {
        this.f16172b = str;
        this.f16173c = z6;
        this.f16174d = z10;
        this.f16176f = c4185o;
        this.f16175e = interfaceC2137a;
    }
}
