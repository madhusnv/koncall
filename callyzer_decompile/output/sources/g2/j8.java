package g2;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j8 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f11855a;

    /* renamed from: b */
    public final /* synthetic */ t3.w0 f11856b;

    /* renamed from: c */
    public final /* synthetic */ int f11857c;

    /* renamed from: d */
    public final /* synthetic */ int f11858d;

    /* renamed from: e */
    public final /* synthetic */ t3.w0 f11859e;

    /* renamed from: f */
    public final /* synthetic */ int f11860f;

    /* renamed from: g */
    public final /* synthetic */ int f11861g;

    /* renamed from: h */
    public final /* synthetic */ int f11862h;

    /* renamed from: j */
    public final /* synthetic */ int f11863j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(t3.w0 w0Var, t3.w0 w0Var2, int i10, int i11, t3.w0 w0Var3, int i12, int i13, int i14, int i15) {
        super(1);
        this.f11855a = w0Var;
        this.f11856b = w0Var2;
        this.f11857c = i10;
        this.f11858d = i11;
        this.f11859e = w0Var3;
        this.f11860f = i12;
        this.f11861g = i13;
        this.f11862h = i14;
        this.f11863j = i15;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.v0 v0Var = (t3.v0) obj;
        t3.w0 w0Var = this.f11855a;
        if (w0Var != null) {
            t3.v0.m13319g(v0Var, w0Var, (this.f11862h - w0Var.f34030a) / 2, (this.f11863j - w0Var.f34031b) / 2);
        }
        t3.v0.m13319g(v0Var, this.f11856b, this.f11857c, this.f11858d);
        t3.v0.m13319g(v0Var, this.f11859e, this.f11860f, this.f11861g);
        return qw.a0.f30746a;
    }
}
