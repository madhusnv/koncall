package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k8 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f11927a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11928b;

    /* renamed from: c */
    public final /* synthetic */ float f11929c;

    /* renamed from: d */
    public final /* synthetic */ t3.w0 f11930d;

    /* renamed from: e */
    public final /* synthetic */ int f11931e;

    /* renamed from: f */
    public final /* synthetic */ float f11932f;

    /* renamed from: g */
    public final /* synthetic */ float f11933g;

    /* renamed from: h */
    public final /* synthetic */ t3.w0 f11934h;

    /* renamed from: j */
    public final /* synthetic */ int f11935j;

    /* renamed from: k */
    public final /* synthetic */ float f11936k;

    /* renamed from: l */
    public final /* synthetic */ t3.w0 f11937l;

    /* renamed from: m */
    public final /* synthetic */ int f11938m;

    /* renamed from: n */
    public final /* synthetic */ float f11939n;

    /* renamed from: p */
    public final /* synthetic */ int f11940p;

    /* renamed from: q */
    public final /* synthetic */ t3.l0 f11941q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(t3.w0 w0Var, boolean z6, float f6, t3.w0 w0Var2, int i10, float f10, float f11, t3.w0 w0Var3, int i11, float f12, t3.w0 w0Var4, int i12, float f13, int i13, t3.l0 l0Var) {
        super(1);
        this.f11927a = w0Var;
        this.f11928b = z6;
        this.f11929c = f6;
        this.f11930d = w0Var2;
        this.f11931e = i10;
        this.f11932f = f10;
        this.f11933g = f11;
        this.f11934h = w0Var3;
        this.f11935j = i11;
        this.f11936k = f12;
        this.f11937l = w0Var4;
        this.f11938m = i12;
        this.f11939n = f13;
        this.f11940p = i13;
        this.f11941q = l0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.v0 v0Var = (t3.v0) obj;
        float f6 = this.f11936k;
        float f10 = this.f11933g;
        t3.w0 w0Var = this.f11927a;
        if (w0Var != null) {
            t3.v0.m13319g(v0Var, w0Var, (this.f11940p - w0Var.f34030a) / 2, AbstractC2747a.m6747k((f6 - this.f11941q.e0(l8.f12010e)) + f10));
        }
        if (this.f11928b || this.f11929c != DefinitionKt.NO_Float_VALUE) {
            t3.v0.m13319g(v0Var, this.f11930d, this.f11931e, AbstractC2747a.m6747k(this.f11932f + f10));
        }
        t3.v0.m13319g(v0Var, this.f11934h, this.f11935j, AbstractC2747a.m6747k(f6 + f10));
        t3.v0.m13319g(v0Var, this.f11937l, this.f11938m, AbstractC2747a.m6747k(this.f11939n + f10));
        return qw.a0.f30746a;
    }
}
