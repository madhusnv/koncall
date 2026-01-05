package ds;

import ex.InterfaceC2141e;
import fs.C2371b;
import k2.C3953b;
import k2.InterfaceC3962k;
import qv.AbstractC6327b;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1785i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8669a;

    /* renamed from: b */
    public final /* synthetic */ float f8670b;

    /* renamed from: c */
    public final /* synthetic */ Object f8671c;

    /* renamed from: d */
    public final /* synthetic */ int f8672d;

    public /* synthetic */ C1785i(float f6, Object obj, int i10, int i11) {
        this.f8669a = i11;
        this.f8670b = f6;
        this.f8671c = obj;
        this.f8672d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8669a) {
            case 0:
                ((Integer) obj2).intValue();
                int iM8496A = C3953b.m8496A(this.f8672d | 1);
                AbstractC1777a.m5470j(this.f8670b, (C2371b) this.f8671c, (InterfaceC3962k) obj, iM8496A);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iM8496A2 = C3953b.m8496A(this.f8672d | 1);
                AbstractC1777a.m5470j(this.f8670b, (C2371b) this.f8671c, (InterfaceC3962k) obj, iM8496A2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A3 = C3953b.m8496A(this.f8672d | 1);
                AbstractC6327b.m12347l(this.f8670b, (String) this.f8671c, (InterfaceC3962k) obj, iM8496A3);
                break;
        }
        return a0.f30746a;
    }
}
