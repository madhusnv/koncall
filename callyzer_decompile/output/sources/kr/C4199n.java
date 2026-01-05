package kr;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import sq.b1;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.n */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4199n implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21278a;

    /* renamed from: b */
    public final /* synthetic */ String f21279b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f21280c;

    /* renamed from: d */
    public final /* synthetic */ int f21281d;

    /* renamed from: e */
    public final /* synthetic */ int f21282e;

    public /* synthetic */ C4199n(String str, InterfaceC7879r interfaceC7879r, int i10, int i11, int i12) {
        this.f21278a = i12;
        this.f21279b = str;
        this.f21280c = interfaceC7879r;
        this.f21281d = i10;
        this.f21282e = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21278a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC4189d.m8939g(C3953b.m8496A(this.f21281d | 1), this.f21282e, this.f21279b, interfaceC3962k, this.f21280c);
                break;
            default:
                b1.m13072B(C3953b.m8496A(this.f21281d | 1), this.f21282e, this.f21279b, interfaceC3962k, this.f21280c);
                break;
        }
        return qw.a0.f30746a;
    }
}
