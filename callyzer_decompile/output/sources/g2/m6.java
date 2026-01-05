package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m6 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f12087a;

    /* renamed from: b */
    public final /* synthetic */ t3.w0 f12088b;

    /* renamed from: c */
    public final /* synthetic */ int f12089c;

    /* renamed from: d */
    public final /* synthetic */ boolean f12090d;

    /* renamed from: e */
    public final /* synthetic */ int f12091e;

    /* renamed from: f */
    public final /* synthetic */ t3.w0 f12092f;

    /* renamed from: g */
    public final /* synthetic */ t3.w0 f12093g;

    /* renamed from: h */
    public final /* synthetic */ t3.w0 f12094h;

    /* renamed from: j */
    public final /* synthetic */ int f12095j;

    /* renamed from: k */
    public final /* synthetic */ int f12096k;

    /* renamed from: l */
    public final /* synthetic */ int f12097l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(t3.w0 w0Var, t3.w0 w0Var2, int i10, boolean z6, int i11, t3.w0 w0Var3, t3.w0 w0Var4, t3.w0 w0Var5, int i12, int i13, int i14) {
        super(1);
        this.f12087a = w0Var;
        this.f12088b = w0Var2;
        this.f12089c = i10;
        this.f12090d = z6;
        this.f12091e = i11;
        this.f12092f = w0Var3;
        this.f12093g = w0Var4;
        this.f12094h = w0Var5;
        this.f12095j = i12;
        this.f12096k = i13;
        this.f12097l = i14;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.v0 v0Var = (t3.v0) obj;
        int i10 = this.f12089c;
        int i11 = this.f12095j;
        int iM4554a = this.f12091e;
        boolean z6 = this.f12090d;
        t3.w0 w0Var = this.f12087a;
        if (w0Var != null) {
            t3.v0.m13319g(v0Var, w0Var, i10, z6 ? iM4554a : AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i11 - w0Var.f34031b) / 2.0f));
        }
        t3.w0 w0Var2 = this.f12088b;
        if (w0Var2 != null) {
            t3.v0.m13319g(v0Var, w0Var2, (this.f12096k - this.f12097l) - w0Var2.f34030a, z6 ? iM4554a : AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i11 - w0Var2.f34031b) / 2.0f));
        }
        float f6 = h2.s0.f15774b;
        int i12 = i10 + (w0Var != null ? w0Var.f34030a : 0);
        t3.w0 w0Var3 = this.f12094h;
        t3.w0 w0Var4 = this.f12093g;
        t3.w0 w0Var5 = this.f12092f;
        if (!z6) {
            iM4554a = AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i11 - (((w0Var5 != null ? w0Var5.f34031b : 0) + (w0Var4 != null ? w0Var4.f34031b : 0)) + (w0Var3 != null ? w0Var3.f34031b : 0))) / 2.0f);
        }
        if (w0Var4 != null) {
            t3.v0.m13319g(v0Var, w0Var4, i12, iM4554a);
        }
        int i13 = iM4554a + (w0Var4 != null ? w0Var4.f34031b : 0);
        if (w0Var5 != null) {
            t3.v0.m13319g(v0Var, w0Var5, i12, i13);
        }
        int i14 = i13 + (w0Var5 != null ? w0Var5.f34031b : 0);
        if (w0Var3 != null) {
            t3.v0.m13319g(v0Var, w0Var3, i12, i14);
        }
        return qw.a0.f30746a;
    }
}
