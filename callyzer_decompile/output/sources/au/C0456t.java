package au;

import ex.InterfaceC2141e;
import gx.AbstractC2747a;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.t */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0456t implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3256a;

    /* renamed from: b */
    public final /* synthetic */ C0454r f3257b;

    public /* synthetic */ C0456t(C0454r c0454r, int i10, int i11) {
        this.f3256a = i11;
        this.f3257b = c0454r;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f3256a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC2747a.m6739c(this.f3257b, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 1:
                AbstractC2747a.m6738b(this.f3257b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC2747a.m6740d(this.f3257b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
