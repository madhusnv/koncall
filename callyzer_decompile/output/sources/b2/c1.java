package b2;

import ex.InterfaceC2137a;
import j1.C3518j;
import kotlin.jvm.internal.AbstractC4155m;
import pg.s7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3708a;

    /* renamed from: b */
    public final /* synthetic */ C3518j f3709b;

    /* renamed from: c */
    public final /* synthetic */ y0 f3710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(C3518j c3518j, y0 y0Var, int i10) {
        super(0);
        this.f3708a = i10;
        this.f3709b = c3518j;
        this.f3710c = y0Var;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [ex.a, kotlin.jvm.internal.m] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f3708a) {
            case 0:
                this.f3710c.m1694d();
                s7.m11862e(this.f3709b);
                break;
            case 1:
                this.f3710c.m1693b(false);
                s7.m11862e(this.f3709b);
                break;
            case 2:
                this.f3710c.m1703m();
                s7.m11862e(this.f3709b);
                break;
            case 3:
                this.f3710c.m1704n();
                s7.m11862e(this.f3709b);
                break;
            default:
                ?? r02 = this.f3710c.f3872g;
                if (r02 != 0) {
                    r02.invoke();
                }
                s7.m11862e(this.f3709b);
                break;
        }
        return qw.a0.f30746a;
    }
}
