package j3;

import a1.C0005d;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import i0.m0;
import kotlin.jvm.internal.AbstractC4155m;
import nf.C5047i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f18985a;

    /* renamed from: b */
    public final /* synthetic */ f0 f18986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i10) {
        super(1);
        this.f18985a = i10;
        this.f18986b = f0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [ex.a, kotlin.jvm.internal.m] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f18985a) {
            case 0:
                f0 f0Var = this.f18986b;
                f0Var.f19001d = true;
                f0Var.f19003f.invoke();
                return qw.a0.f30746a;
            default:
                InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
                f0 f0Var2 = this.f18986b;
                C3549c c3549c = f0Var2.f18999b;
                float f6 = f0Var2.f19008k;
                float f10 = f0Var2.f19009l;
                C0005d c0005dMo5899X = interfaceC2198d.mo5899X();
                long jM81z = c0005dMo5899X.m81z();
                c0005dMo5899X.m75t().mo5107i();
                try {
                    ((C5047i) c0005dMo5899X.f24b).m9984V(f6, f10, 0L);
                    c3549c.mo8083a(interfaceC2198d);
                    m0.m7392y(c0005dMo5899X, jM81z);
                    return qw.a0.f30746a;
                } catch (Throwable th2) {
                    m0.m7392y(c0005dMo5899X, jM81z);
                    throw th2;
                }
        }
    }
}
