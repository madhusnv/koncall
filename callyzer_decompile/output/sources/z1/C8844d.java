package z1;

import b3.C0592x;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4365j;
import qw.a0;
import v3.AbstractC7634f;
import w3.l1;
import w3.p2;
import x1.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.d */
/* loaded from: classes.dex */
public final class C8844d extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f42565a;

    /* renamed from: b */
    public final /* synthetic */ C8846f f42566b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8844d(C8846f c8846f, int i10) {
        super(0);
        this.f42565a = i10;
        this.f42566b = c8846f;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        p2 p2Var;
        switch (this.f42565a) {
            case 0:
                AbstractC7634f.m14560u(this.f42566b);
                return a0.f30746a;
            case 1:
                this.f42566b.f42577z.m1694d();
                return Boolean.TRUE;
            case 2:
                this.f42566b.f42577z.m1703m();
                return Boolean.TRUE;
            case 3:
                C8846f c8846f = this.f42566b;
                c8846f.f42573v.f39725w.invoke(new C4365j(c8846f.f42569B.f21918e));
                return Boolean.TRUE;
            case 4:
                C8846f c8846f2 = this.f42566b;
                v0 v0Var = c8846f2.f42573v;
                C0592x c0592x = c8846f2.f42570C;
                boolean z6 = c8846f2.f42574w;
                if (!v0Var.m15478b()) {
                    C0592x.m1757b(c0592x);
                } else if (!z6 && (p2Var = v0Var.f39705c) != null) {
                    ((l1) p2Var).m14976b();
                }
                return Boolean.TRUE;
            case 5:
                this.f42566b.f42577z.m1696f(true);
                return Boolean.TRUE;
            case 6:
                this.f42566b.f42577z.m1693b(true);
                return Boolean.TRUE;
            default:
                AbstractC7634f.m14560u(this.f42566b);
                return a0.f30746a;
        }
    }
}
