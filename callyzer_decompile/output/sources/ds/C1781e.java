package ds;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import sq.b1;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1781e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8659a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f8660b;

    /* renamed from: c */
    public final /* synthetic */ String f8661c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC7879r f8662d;

    public /* synthetic */ C1781e(int i10, int i11, String str, InterfaceC7879r interfaceC7879r) {
        this.f8660b = i10;
        this.f8661c = str;
        this.f8662d = interfaceC7879r;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f8659a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC1777a.m5472l(C3953b.m8496A(this.f8660b | 1), this.f8661c, interfaceC3962k, this.f8662d);
                break;
            default:
                b1.m13108l(this.f8660b, C3953b.m8496A(1), this.f8661c, interfaceC3962k, this.f8662d);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C1781e(InterfaceC7879r interfaceC7879r, String str, int i10) {
        this.f8662d = interfaceC7879r;
        this.f8661c = str;
        this.f8660b = i10;
    }
}
