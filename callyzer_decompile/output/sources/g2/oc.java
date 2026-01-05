package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class oc extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f12316a;

    /* renamed from: b */
    public final /* synthetic */ int f12317b;

    /* renamed from: c */
    public final /* synthetic */ int f12318c;

    /* renamed from: d */
    public final /* synthetic */ t3.w0 f12319d;

    /* renamed from: e */
    public final /* synthetic */ t3.w0 f12320e;

    /* renamed from: f */
    public final /* synthetic */ t3.w0 f12321f;

    /* renamed from: g */
    public final /* synthetic */ t3.w0 f12322g;

    /* renamed from: h */
    public final /* synthetic */ t3.w0 f12323h;

    /* renamed from: j */
    public final /* synthetic */ t3.w0 f12324j;

    /* renamed from: k */
    public final /* synthetic */ t3.w0 f12325k;

    /* renamed from: l */
    public final /* synthetic */ t3.w0 f12326l;

    /* renamed from: m */
    public final /* synthetic */ pc f12327m;

    /* renamed from: n */
    public final /* synthetic */ int f12328n;

    /* renamed from: p */
    public final /* synthetic */ t3.l0 f12329p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(t3.w0 w0Var, int i10, int i11, t3.w0 w0Var2, t3.w0 w0Var3, t3.w0 w0Var4, t3.w0 w0Var5, t3.w0 w0Var6, t3.w0 w0Var7, t3.w0 w0Var8, t3.w0 w0Var9, pc pcVar, int i12, t3.l0 l0Var) {
        super(1);
        this.f12316a = w0Var;
        this.f12317b = i10;
        this.f12318c = i11;
        this.f12319d = w0Var2;
        this.f12320e = w0Var3;
        this.f12321f = w0Var4;
        this.f12322g = w0Var5;
        this.f12323h = w0Var6;
        this.f12324j = w0Var7;
        this.f12325k = w0Var8;
        this.f12326l = w0Var9;
        this.f12327m = pcVar;
        this.f12328n = i12;
        this.f12329p = l0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        boolean z6;
        float f6;
        t3.v0 v0Var = (t3.v0) obj;
        pc pcVar = this.f12327m;
        boolean z10 = pcVar.f12439a;
        t3.w0 w0Var = this.f12325k;
        t3.w0 w0Var2 = this.f12319d;
        t3.l0 l0Var = this.f12329p;
        t3.w0 w0Var3 = this.f12326l;
        t3.w0 w0Var4 = this.f12324j;
        t3.w0 w0Var5 = this.f12323h;
        t3.w0 w0Var6 = this.f12322g;
        t3.w0 w0Var7 = this.f12321f;
        t3.w0 w0Var8 = this.f12320e;
        int i10 = this.f12318c;
        int i11 = this.f12317b;
        t3.w0 w0Var9 = this.f12316a;
        if (w0Var9 != null) {
            int i12 = w0Var9.f34031b;
            int i13 = this.f12328n + i12;
            float f10 = pcVar.f12440b;
            float fMo155a = l0Var.mo155a();
            int i14 = nc.f12219a;
            t3.v0.m13318f(v0Var, w0Var, 0L);
            float f11 = h2.s0.f15774b;
            int i15 = i10 - (w0Var3 != null ? w0Var3.f34031b : 0);
            if (w0Var7 != null) {
                f6 = DefinitionKt.NO_Float_VALUE;
                t3.v0.m13319g(v0Var, w0Var7, 0, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i15 - w0Var7.f34031b) / 2.0f));
            } else {
                f6 = DefinitionKt.NO_Float_VALUE;
            }
            t3.v0.m13319g(v0Var, w0Var9, w0Var7 != null ? w0Var7.f34030a : 0, (z10 ? AbstractC1452a.m4554a(1, f6, (i15 - w0Var9.f34031b) / 2.0f) : AbstractC2747a.m6747k(h2.s0.f15774b * fMo155a)) - AbstractC2747a.m6747k((r2 - r4) * f10));
            if (w0Var5 != null) {
                t3.v0.m13319g(v0Var, w0Var5, w0Var7 != null ? w0Var7.f34030a : 0, i13);
            }
            int i16 = (w0Var7 != null ? w0Var7.f34030a : 0) + (w0Var5 != null ? w0Var5.f34030a : 0);
            t3.v0.m13319g(v0Var, w0Var2, i16, i13);
            if (w0Var8 != null) {
                t3.v0.m13319g(v0Var, w0Var8, i16, i13);
            }
            if (w0Var4 != null) {
                t3.v0.m13319g(v0Var, w0Var4, (i11 - (w0Var6 != null ? w0Var6.f34030a : 0)) - w0Var4.f34030a, i13);
            }
            if (w0Var6 != null) {
                t3.v0.m13319g(v0Var, w0Var6, i11 - w0Var6.f34030a, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i15 - w0Var6.f34031b) / 2.0f));
            }
            if (w0Var3 != null) {
                t3.v0.m13319g(v0Var, w0Var3, 0, i15);
            }
        } else {
            float fMo155a2 = l0Var.mo155a();
            o1.h1 h1Var = pcVar.f12441c;
            int i17 = nc.f12219a;
            t3.v0.m13318f(v0Var, w0Var, 0L);
            float f12 = h2.s0.f15774b;
            int i18 = i10 - (w0Var3 != null ? w0Var3.f34031b : 0);
            int iM6747k = AbstractC2747a.m6747k(h1Var.mo10344d() * fMo155a2);
            if (w0Var7 != null) {
                t3.v0.m13319g(v0Var, w0Var7, 0, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i18 - w0Var7.f34031b) / 2.0f));
            }
            if (w0Var5 != null) {
                z6 = z10;
                t3.v0.m13319g(v0Var, w0Var5, w0Var7 != null ? w0Var7.f34030a : 0, nc.m6225d(z6, i18, iM6747k, w0Var5));
            } else {
                z6 = z10;
            }
            int i19 = (w0Var7 != null ? w0Var7.f34030a : 0) + (w0Var5 != null ? w0Var5.f34030a : 0);
            t3.v0.m13319g(v0Var, w0Var2, i19, nc.m6225d(z6, i18, iM6747k, w0Var2));
            if (w0Var8 != null) {
                t3.v0.m13319g(v0Var, w0Var8, i19, nc.m6225d(z6, i18, iM6747k, w0Var8));
            }
            if (w0Var4 != null) {
                t3.v0.m13319g(v0Var, w0Var4, (i11 - (w0Var6 != null ? w0Var6.f34030a : 0)) - w0Var4.f34030a, nc.m6225d(z6, i18, iM6747k, w0Var4));
            }
            if (w0Var6 != null) {
                t3.v0.m13319g(v0Var, w0Var6, i11 - w0Var6.f34030a, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i18 - w0Var6.f34031b) / 2.0f));
            }
            if (w0Var3 != null) {
                t3.v0.m13319g(v0Var, w0Var3, 0, i18);
            }
        }
        return qw.a0.f30746a;
    }
}
