package vs;

import b3.C0592x;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import w2.InterfaceC7879r;
import xt.AbstractC8450a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vs.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7768j implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37423a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f37424b;

    /* renamed from: c */
    public final /* synthetic */ String f37425c;

    /* renamed from: d */
    public final /* synthetic */ int f37426d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f37427e;

    /* renamed from: f */
    public final /* synthetic */ Object f37428f;

    /* renamed from: g */
    public final /* synthetic */ Object f37429g;

    /* renamed from: h */
    public final /* synthetic */ Object f37430h;

    public /* synthetic */ C7768j(Integer num, boolean z6, String str, int i10, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c2, int i11) {
        this.f37428f = num;
        this.f37424b = z6;
        this.f37425c = str;
        this.f37426d = i10;
        this.f37427e = interfaceC2139c;
        this.f37429g = interfaceC2137a;
        this.f37430h = interfaceC2139c2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37423a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC7760b.m14739f(this.f37425c, this.f37427e, (InterfaceC7879r) this.f37429g, (C0592x) this.f37430h, (String) this.f37428f, this.f37424b, (InterfaceC3962k) obj, C3953b.m8496A(this.f37426d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                AbstractC8450a.m15760g((Integer) this.f37428f, this.f37424b, this.f37425c, this.f37426d, this.f37427e, (InterfaceC2137a) this.f37429g, (InterfaceC2139c) this.f37430h, (InterfaceC3962k) obj, iM8496A);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C7768j(String str, InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, C0592x c0592x, String str2, boolean z6, int i10) {
        this.f37425c = str;
        this.f37427e = interfaceC2139c;
        this.f37429g = interfaceC7879r;
        this.f37430h = c0592x;
        this.f37428f = str2;
        this.f37424b = z6;
        this.f37426d = i10;
    }
}
