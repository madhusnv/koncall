package tp;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import vp.AbstractC7728a;
import zp.C9014n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7183d implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f34464a;

    /* renamed from: b */
    public final /* synthetic */ C9014n f34465b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f34466c;

    public /* synthetic */ C7183d(C9014n c9014n, InterfaceC2141e interfaceC2141e, int i10, int i11) {
        this.f34464a = i11;
        this.f34465b = c9014n;
        this.f34466c = interfaceC2141e;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f34464a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC7185f.m13443b(this.f34465b, this.f34466c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 1:
                AbstractC7728a.m14716b(this.f34465b, this.f34466c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 2:
                AbstractC7728a.m14717c(this.f34465b, this.f34466c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC7728a.m14718d(this.f34465b, this.f34466c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
