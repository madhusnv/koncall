package fq;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import og.jd;
import og.jf;
import qw.a0;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fq.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2367b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10765a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f10766b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f10767c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f10768d;

    public /* synthetic */ C2367b(InterfaceC7879r interfaceC7879r, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, int i10, int i11) {
        this.f10765a = i11;
        this.f10766b = interfaceC7879r;
        this.f10767c = interfaceC2137a;
        this.f10768d = interfaceC2137a2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10765a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                jf.m10720a(this.f10766b, this.f10767c, this.f10768d, interfaceC3962k, C3953b.m8496A(49));
                break;
            default:
                jd.m10713a(this.f10766b, this.f10767c, this.f10768d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
