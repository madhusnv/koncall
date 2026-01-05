package o1;

import e1.C1908j;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f25808a;

    /* renamed from: b */
    public final /* synthetic */ q0 f25809b;

    /* renamed from: c */
    public final /* synthetic */ s0 f25810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, s0 s0Var, int i10) {
        super(1);
        this.f25808a = i10;
        this.f25809b = q0Var;
        this.f25810c = s0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int iMo10356e;
        int iMo10352a;
        int iMo10356e2;
        int iMo10352a2;
        switch (this.f25808a) {
            case 0:
                t3.w0 w0Var = (t3.w0) obj;
                if (w0Var != null) {
                    s0 s0Var = this.f25810c;
                    iMo10356e = s0Var.mo10356e(w0Var);
                    iMo10352a = s0Var.mo10352a(w0Var);
                } else {
                    iMo10356e = 0;
                    iMo10352a = 0;
                }
                C1908j c1908j = new C1908j(C1908j.m5567a(iMo10356e, iMo10352a));
                q0 q0Var = this.f25809b;
                q0Var.f25819f = c1908j;
                q0Var.f25816c = w0Var;
                break;
            default:
                t3.w0 w0Var2 = (t3.w0) obj;
                if (w0Var2 != null) {
                    s0 s0Var2 = this.f25810c;
                    iMo10356e2 = s0Var2.mo10356e(w0Var2);
                    iMo10352a2 = s0Var2.mo10352a(w0Var2);
                } else {
                    iMo10356e2 = 0;
                    iMo10352a2 = 0;
                }
                C1908j c1908j2 = new C1908j(C1908j.m5567a(iMo10356e2, iMo10352a2));
                q0 q0Var2 = this.f25809b;
                q0Var2.f25820g = c1908j2;
                q0Var2.f25818e = w0Var2;
                break;
        }
        return qw.a0.f30746a;
    }
}
