package g2;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ob extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f12309a;

    /* renamed from: b */
    public final /* synthetic */ t3.w0 f12310b;

    /* renamed from: c */
    public final /* synthetic */ t3.l0 f12311c;

    /* renamed from: d */
    public final /* synthetic */ int f12312d;

    /* renamed from: e */
    public final /* synthetic */ int f12313e;

    /* renamed from: f */
    public final /* synthetic */ Integer f12314f;

    /* renamed from: g */
    public final /* synthetic */ Integer f12315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(t3.w0 w0Var, t3.w0 w0Var2, t3.l0 l0Var, int i10, int i11, Integer num, Integer num2) {
        super(1);
        this.f12309a = w0Var;
        this.f12310b = w0Var2;
        this.f12311c = l0Var;
        this.f12312d = i10;
        this.f12313e = i11;
        this.f12314f = num;
        this.f12315g = num2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.v0 v0Var = (t3.v0) obj;
        t3.w0 w0Var = this.f12310b;
        int i10 = this.f12313e;
        t3.w0 w0Var2 = this.f12309a;
        if (w0Var2 != null && w0Var != null) {
            Integer num = this.f12314f;
            AbstractC4154l.m8920c(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f12315g;
            AbstractC4154l.m8920c(num2);
            int iIntValue2 = num2.intValue();
            float f6 = iIntValue == iIntValue2 ? rb.f12618d : rb.f12619e;
            t3.l0 l0Var = this.f12311c;
            int iE0 = l0Var.e0(j2.c0.f18497a) + l0Var.e0(f6);
            int iMo8436Z = (l0Var.mo8436Z(rb.f12620f) + w0Var.f34031b) - iIntValue;
            int i11 = w0Var2.f34030a;
            int i12 = this.f12312d;
            int i13 = (i10 - iIntValue2) - iE0;
            t3.v0.m13319g(v0Var, w0Var2, (i12 - i11) / 2, i13);
            t3.v0.m13319g(v0Var, w0Var, (i12 - w0Var.f34030a) / 2, i13 - iMo8436Z);
        } else if (w0Var2 != null) {
            float f10 = rb.f12615a;
            t3.v0.m13319g(v0Var, w0Var2, 0, (i10 - w0Var2.f34031b) / 2);
        } else if (w0Var != null) {
            float f11 = rb.f12615a;
            t3.v0.m13319g(v0Var, w0Var, 0, (i10 - w0Var.f34031b) / 2);
        }
        return qw.a0.f30746a;
    }
}
