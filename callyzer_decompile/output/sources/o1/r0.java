package o1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int[] f25826a;

    /* renamed from: b */
    public final /* synthetic */ int f25827b;

    /* renamed from: c */
    public final /* synthetic */ int f25828c;

    /* renamed from: d */
    public final /* synthetic */ int f25829d;

    /* renamed from: e */
    public final /* synthetic */ t3.w0[] f25830e;

    /* renamed from: f */
    public final /* synthetic */ s0 f25831f;

    /* renamed from: g */
    public final /* synthetic */ int f25832g;

    /* renamed from: h */
    public final /* synthetic */ EnumC6757m f25833h;

    /* renamed from: j */
    public final /* synthetic */ int[] f25834j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int[] iArr, int i10, int i11, int i12, t3.w0[] w0VarArr, s0 s0Var, int i13, EnumC6757m enumC6757m, int[] iArr2) {
        super(1);
        this.f25826a = iArr;
        this.f25827b = i10;
        this.f25828c = i11;
        this.f25829d = i12;
        this.f25830e = w0VarArr;
        this.f25831f = s0Var;
        this.f25832g = i13;
        this.f25833h = enumC6757m;
        this.f25834j = iArr2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        AbstractC5244c abstractC5244c;
        t3.v0 v0Var = (t3.v0) obj;
        int[] iArr = this.f25826a;
        int i10 = iArr != null ? iArr[this.f25827b] : 0;
        int i11 = this.f25828c;
        for (int i12 = i11; i12 < this.f25829d; i12++) {
            t3.w0 w0Var = this.f25830e[i12];
            AbstractC4154l.m8920c(w0Var);
            Object objMo13310C = w0Var.mo13310C();
            l1 l1Var = objMo13310C instanceof l1 ? (l1) objMo13310C : null;
            s0 s0Var = this.f25831f;
            if (l1Var == null || (abstractC5244c = l1Var.f25784c) == null) {
                abstractC5244c = s0Var.f25842e;
            }
            int iMo10334g = abstractC5244c.mo10334g(this.f25832g - s0Var.mo10352a(w0Var), this.f25833h) + i10;
            boolean z6 = s0Var.f25838a;
            int[] iArr2 = this.f25834j;
            if (z6) {
                v0Var.m13324d(w0Var, iArr2[i12 - i11], iMo10334g, DefinitionKt.NO_Float_VALUE);
            } else {
                v0Var.m13324d(w0Var, iMo10334g, iArr2[i12 - i11], DefinitionKt.NO_Float_VALUE);
            }
        }
        return qw.a0.f30746a;
    }
}
