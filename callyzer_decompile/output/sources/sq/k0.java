package sq;

import ex.InterfaceC2137a;
import ox.C5770a;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f32989a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f32990b;

    /* renamed from: c */
    public final /* synthetic */ Object f32991c;

    /* renamed from: d */
    public final /* synthetic */ Object f32992d;

    public /* synthetic */ k0(long j6, InterfaceC2137a interfaceC2137a, k2.c1 c1Var) {
        this.f32990b = j6;
        this.f32991c = interfaceC2137a;
        this.f32992d = c1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f32989a) {
            case 0:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f32991c;
                k2.c1 c1Var = (k2.c1) this.f32992d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - c1Var.m8531f() > this.f32990b) {
                    interfaceC2137a.invoke();
                    c1Var.m8532g(jCurrentTimeMillis);
                }
                return qw.a0.f30746a;
            default:
                return "client clock (" + ((C7126c) this.f32991c) + ") is skewed " + ((Object) C5770a.m11303n(this.f32990b)) + " from the server (" + ((C7126c) this.f32992d) + "), applying correction";
        }
    }

    public /* synthetic */ k0(C7126c c7126c, long j6, C7126c c7126c2) {
        this.f32991c = c7126c;
        this.f32990b = j6;
        this.f32992d = c7126c2;
    }
}
