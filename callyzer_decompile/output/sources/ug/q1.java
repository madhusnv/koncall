package ug;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f35765a;

    /* renamed from: b */
    public final /* synthetic */ String f35766b;

    /* renamed from: c */
    public final /* synthetic */ String f35767c;

    /* renamed from: d */
    public final /* synthetic */ String f35768d;

    /* renamed from: e */
    public final /* synthetic */ s1 f35769e;

    public /* synthetic */ q1(s1 s1Var, String str, String str2, String str3, int i10) {
        this.f35765a = i10;
        this.f35766b = str;
        this.f35767c = str2;
        this.f35768d = str3;
        this.f35769e = s1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f35765a) {
            case 0:
                s1 s1Var = this.f35769e;
                s1Var.f35819e.m13947B();
                C7443n c7443n = s1Var.f35819e.f35488c;
                h4.m13944U(c7443n);
                return c7443n.I0(this.f35766b, this.f35767c, this.f35768d);
            case 1:
                s1 s1Var2 = this.f35769e;
                s1Var2.f35819e.m13947B();
                C7443n c7443n2 = s1Var2.f35819e.f35488c;
                h4.m13944U(c7443n2);
                return c7443n2.I0(this.f35766b, this.f35767c, this.f35768d);
            case 2:
                s1 s1Var3 = this.f35769e;
                s1Var3.f35819e.m13947B();
                C7443n c7443n3 = s1Var3.f35819e.f35488c;
                h4.m13944U(c7443n3);
                return c7443n3.M0(this.f35766b, this.f35767c, this.f35768d);
            default:
                s1 s1Var4 = this.f35769e;
                s1Var4.f35819e.m13947B();
                C7443n c7443n4 = s1Var4.f35819e.f35488c;
                h4.m13944U(c7443n4);
                return c7443n4.M0(this.f35766b, this.f35767c, this.f35768d);
        }
    }
}
