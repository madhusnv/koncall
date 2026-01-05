package qr;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import og.he;
import sq.b1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6278b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30503a;

    /* renamed from: b */
    public final /* synthetic */ String f30504b;

    /* renamed from: c */
    public final /* synthetic */ boolean f30505c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f30506d;

    public /* synthetic */ C6278b(int i10, int i11, InterfaceC2137a interfaceC2137a, String str, boolean z6) {
        this.f30503a = i11;
        this.f30504b = str;
        this.f30505c = z6;
        this.f30506d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f30503a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC6287k.m12293j(C3953b.m8496A(1), this.f30506d, this.f30504b, interfaceC3962k, this.f30505c);
                break;
            case 1:
                he.m10685b(C3953b.m8496A(1), this.f30506d, this.f30504b, interfaceC3962k, this.f30505c);
                break;
            default:
                b1.m13089S(C3953b.m8496A(1), this.f30506d, this.f30504b, interfaceC3962k, this.f30505c);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6278b(int i10, InterfaceC2137a interfaceC2137a, String str, boolean z6) {
        this.f30503a = 2;
        this.f30505c = z6;
        this.f30504b = str;
        this.f30506d = interfaceC2137a;
    }
}
