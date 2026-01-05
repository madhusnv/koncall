package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4155m;
import pg.AbstractC5941v;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a9 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11178a;

    /* renamed from: b */
    public final /* synthetic */ int f11179b;

    /* renamed from: c */
    public final /* synthetic */ t3.w0 f11180c;

    /* renamed from: d */
    public final /* synthetic */ t3.w0 f11181d;

    /* renamed from: e */
    public final /* synthetic */ t3.w0 f11182e;

    /* renamed from: f */
    public final /* synthetic */ t3.w0 f11183f;

    /* renamed from: g */
    public final /* synthetic */ t3.w0 f11184g;

    /* renamed from: h */
    public final /* synthetic */ t3.w0 f11185h;

    /* renamed from: j */
    public final /* synthetic */ t3.w0 f11186j;

    /* renamed from: k */
    public final /* synthetic */ t3.w0 f11187k;

    /* renamed from: l */
    public final /* synthetic */ t3.w0 f11188l;

    /* renamed from: m */
    public final /* synthetic */ b9 f11189m;

    /* renamed from: n */
    public final /* synthetic */ t3.l0 f11190n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(int i10, int i11, t3.w0 w0Var, t3.w0 w0Var2, t3.w0 w0Var3, t3.w0 w0Var4, t3.w0 w0Var5, t3.w0 w0Var6, t3.w0 w0Var7, t3.w0 w0Var8, t3.w0 w0Var9, b9 b9Var, t3.l0 l0Var) {
        super(1);
        this.f11178a = i10;
        this.f11179b = i11;
        this.f11180c = w0Var;
        this.f11181d = w0Var2;
        this.f11182e = w0Var3;
        this.f11183f = w0Var4;
        this.f11184g = w0Var5;
        this.f11185h = w0Var6;
        this.f11186j = w0Var7;
        this.f11187k = w0Var8;
        this.f11188l = w0Var9;
        this.f11189m = b9Var;
        this.f11190n = l0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        float f6;
        int iM4554a;
        t3.v0 v0Var = (t3.v0) obj;
        b9 b9Var = this.f11189m;
        float f10 = b9Var.f11261c;
        boolean z6 = b9Var.f11260b;
        t3.l0 l0Var = this.f11190n;
        float fMo155a = l0Var.mo155a();
        EnumC6757m layoutDirection = l0Var.getLayoutDirection();
        o1.h1 h1Var = b9Var.f11262d;
        float f11 = z8.f13390a;
        t3.v0.m13318f(v0Var, this.f11187k, 0L);
        float f12 = h2.s0.f15774b;
        t3.w0 w0Var = this.f11188l;
        int i10 = this.f11178a - (w0Var != null ? w0Var.f34031b : 0);
        int iM6747k = AbstractC2747a.m6747k(h1Var.mo10344d() * fMo155a);
        int iM6747k2 = AbstractC2747a.m6747k(AbstractC0242a.m652f(h1Var, layoutDirection) * fMo155a);
        float f13 = h2.s0.f15775c * fMo155a;
        t3.w0 w0Var2 = this.f11180c;
        if (w0Var2 != null) {
            t3.v0.m13319g(v0Var, w0Var2, 0, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i10 - w0Var2.f34031b) / 2.0f));
        }
        t3.w0 w0Var3 = this.f11185h;
        if (w0Var3 != null) {
            if (z6) {
                f6 = 2.0f;
                iM4554a = AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i10 - w0Var3.f34031b) / 2.0f);
            } else {
                f6 = 2.0f;
                iM4554a = iM6747k;
            }
            t3.v0.m13319g(v0Var, w0Var3, AbstractC2747a.m6747k(w0Var2 == null ? 0.0f : (1 - f10) * (w0Var2.f34030a - f13)) + iM6747k2, AbstractC5941v.m11892f(f10, iM4554a, -(w0Var3.f34031b / 2)));
        } else {
            f6 = 2.0f;
        }
        t3.w0 w0Var4 = this.f11182e;
        if (w0Var4 != null) {
            t3.v0.m13319g(v0Var, w0Var4, w0Var2 != null ? w0Var2.f34030a : 0, z8.m6361f(z6, i10, iM6747k, w0Var3, w0Var4));
        }
        int i11 = (w0Var2 != null ? w0Var2.f34030a : 0) + (w0Var4 != null ? w0Var4.f34030a : 0);
        t3.w0 w0Var5 = this.f11184g;
        t3.v0.m13319g(v0Var, w0Var5, i11, z8.m6361f(z6, i10, iM6747k, w0Var3, w0Var5));
        t3.w0 w0Var6 = this.f11186j;
        if (w0Var6 != null) {
            t3.v0.m13319g(v0Var, w0Var6, i11, z8.m6361f(z6, i10, iM6747k, w0Var3, w0Var6));
        }
        int i12 = this.f11179b;
        t3.w0 w0Var7 = this.f11181d;
        t3.w0 w0Var8 = this.f11183f;
        if (w0Var8 != null) {
            t3.v0.m13319g(v0Var, w0Var8, (i12 - (w0Var7 != null ? w0Var7.f34030a : 0)) - w0Var8.f34030a, z8.m6361f(z6, i10, iM6747k, w0Var3, w0Var8));
        }
        if (w0Var7 != null) {
            t3.v0.m13319g(v0Var, w0Var7, i12 - w0Var7.f34030a, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i10 - w0Var7.f34031b) / f6));
        }
        if (w0Var != null) {
            t3.v0.m13319g(v0Var, w0Var, 0, i10);
        }
        return qw.a0.f30746a;
    }
}
