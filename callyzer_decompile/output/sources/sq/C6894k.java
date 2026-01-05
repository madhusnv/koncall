package sq;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sq.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6894k implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f32986a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f32987b;

    /* renamed from: c */
    public final /* synthetic */ k2.c1 f32988c;

    public /* synthetic */ C6894k(InterfaceC2137a interfaceC2137a, k2.c1 c1Var, int i10) {
        this.f32986a = i10;
        this.f32987b = interfaceC2137a;
        this.f32988c = c1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f32986a) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                k2.c1 c1Var = this.f32988c;
                if (jCurrentTimeMillis - c1Var.m8531f() >= 500) {
                    c1Var.m8532g(jCurrentTimeMillis);
                    this.f32987b.invoke();
                }
                break;
            case 1:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                k2.c1 c1Var2 = this.f32988c;
                if (jCurrentTimeMillis2 - c1Var2.m8531f() >= 500) {
                    c1Var2.m8532g(jCurrentTimeMillis2);
                    this.f32987b.invoke();
                }
                break;
            case 2:
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                k2.c1 c1Var3 = this.f32988c;
                if (jCurrentTimeMillis3 - c1Var3.m8531f() >= 500) {
                    c1Var3.m8532g(jCurrentTimeMillis3);
                    this.f32987b.invoke();
                }
                break;
            case 3:
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                k2.c1 c1Var4 = this.f32988c;
                if (jCurrentTimeMillis4 - c1Var4.m8531f() >= 500) {
                    c1Var4.m8532g(jCurrentTimeMillis4);
                    this.f32987b.invoke();
                }
                break;
            case 4:
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                k2.c1 c1Var5 = this.f32988c;
                if (jCurrentTimeMillis5 - c1Var5.m8531f() >= 500) {
                    this.f32987b.invoke();
                    c1Var5.m8532g(jCurrentTimeMillis5);
                }
                break;
            case 5:
                long jCurrentTimeMillis6 = System.currentTimeMillis();
                k2.c1 c1Var6 = this.f32988c;
                if (jCurrentTimeMillis6 - c1Var6.m8531f() >= 500) {
                    this.f32987b.invoke();
                    c1Var6.m8532g(jCurrentTimeMillis6);
                }
                break;
            case 6:
                long jCurrentTimeMillis7 = System.currentTimeMillis();
                k2.c1 c1Var7 = this.f32988c;
                if (jCurrentTimeMillis7 - c1Var7.m8531f() >= 500) {
                    this.f32987b.invoke();
                    c1Var7.m8532g(jCurrentTimeMillis7);
                }
                break;
            default:
                long jCurrentTimeMillis8 = System.currentTimeMillis();
                k2.c1 c1Var8 = this.f32988c;
                if (jCurrentTimeMillis8 - c1Var8.m8531f() > 500) {
                    this.f32987b.invoke();
                    c1Var8.m8532g(jCurrentTimeMillis8);
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
