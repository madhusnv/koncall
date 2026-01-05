package x1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4366k;
import l4.C4381z;
import l4.InterfaceC4374s;
import tx.InterfaceC7266z;
import u1.C7300b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ v0 f39467a;

    /* renamed from: b */
    public final /* synthetic */ boolean f39468b;

    /* renamed from: c */
    public final /* synthetic */ boolean f39469c;

    /* renamed from: d */
    public final /* synthetic */ l4.a0 f39470d;

    /* renamed from: e */
    public final /* synthetic */ C4381z f39471e;

    /* renamed from: f */
    public final /* synthetic */ C4366k f39472f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC4374s f39473g;

    /* renamed from: h */
    public final /* synthetic */ b2.y0 f39474h;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC7266z f39475j;

    /* renamed from: k */
    public final /* synthetic */ C7300b f39476k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v0 v0Var, boolean z6, boolean z10, l4.a0 a0Var, C4381z c4381z, C4366k c4366k, InterfaceC4374s interfaceC4374s, b2.y0 y0Var, InterfaceC7266z interfaceC7266z, C7300b c7300b) {
        super(1);
        this.f39467a = v0Var;
        this.f39468b = z6;
        this.f39469c = z10;
        this.f39470d = a0Var;
        this.f39471e = c4381z;
        this.f39472f = c4366k;
        this.f39473g = interfaceC4374s;
        this.f39474h = y0Var;
        this.f39475j = interfaceC7266z;
        this.f39476k = c7300b;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        r1 r1VarM15480d;
        b3.a0 a0Var = (b3.a0) obj;
        v0 v0Var = this.f39467a;
        if (v0Var.m15478b() != a0Var.isFocused()) {
            v0Var.f39708f.setValue(Boolean.valueOf(a0Var.isFocused()));
            if (v0Var.m15478b() && this.f39468b && !this.f39469c) {
                r0.m15456p(this.f39470d, v0Var, this.f39471e, this.f39472f, this.f39473g);
            } else {
                r0.m15452l(v0Var);
            }
            if (a0Var.isFocused() && (r1VarM15480d = v0Var.m15480d()) != null) {
                tx.c0.m13502y(this.f39475j, null, null, new aw.d0(this.f39476k, this.f39471e, v0Var, r1VarM15480d, this.f39473g, null, 16), 3);
            }
            if (!a0Var.isFocused()) {
                this.f39474h.m1695e(null);
            }
        }
        return qw.a0.f30746a;
    }
}
