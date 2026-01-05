package sq;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33199a;

    /* renamed from: b */
    public final /* synthetic */ String f33200b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f33201c;

    public /* synthetic */ s0(int i10, int i11, String str, InterfaceC7879r interfaceC7879r) {
        this.f33199a = i11;
        this.f33200b = str;
        this.f33201c = interfaceC7879r;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f33199a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                g2.m13125C(C3953b.m8496A(49), this.f33200b, interfaceC3962k, this.f33201c);
                break;
            default:
                b1.m13073C(C3953b.m8496A(1), this.f33200b, interfaceC3962k, this.f33201c);
                break;
        }
        return qw.a0.f30746a;
    }
}
