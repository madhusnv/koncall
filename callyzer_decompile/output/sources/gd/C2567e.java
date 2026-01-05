package gd;

import c9.C0910e;
import ex.InterfaceC2137a;
import qw.a0;
import ut.C7539c;
import ut.C7546j;
import wc.C7985s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gd.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C2567e implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f13976a;

    /* renamed from: b */
    public final /* synthetic */ int f13977b;

    /* renamed from: c */
    public final /* synthetic */ Object f13978c;

    public /* synthetic */ C2567e(int i10, String str) {
        this.f13976a = 1;
        this.f13977b = i10;
        this.f13978c = str;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f13976a) {
            case 0:
                C7985s c7985s = ((C2566d) ((C0910e) this.f13978c).f5579b).f13974a;
                String string = Integer.valueOf(this.f13977b).toString();
                c7985s.mo15145m(string.length(), string);
                return a0.f30746a;
            case 1:
                return "Command completed with nonzero exit code " + this.f13977b + ": " + ((String) this.f13978c);
            default:
                ((C7546j) this.f13978c).m14299e(new C7539c(this.f13977b));
                return a0.f30746a;
        }
    }

    public /* synthetic */ C2567e(Object obj, int i10, int i11) {
        this.f13976a = i11;
        this.f13978c = obj;
        this.f13977b = i10;
    }
}
