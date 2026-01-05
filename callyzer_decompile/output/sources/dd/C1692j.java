package dd;

import cd.C0956k;
import ix.AbstractC3363d;
import ix.C3362c;
import ng.C5070u;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import ox.C5770a;
import ox.EnumC5772c;
import qw.a0;
import tx.c0;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.j */
/* loaded from: classes.dex */
public final class C1692j {

    /* renamed from: c */
    public static final C5070u f8279c = new C5070u(6);

    /* renamed from: a */
    public final C1691i f8280a;

    /* renamed from: b */
    public final C3362c f8281b = AbstractC3363d.f17771a;

    public C1692j(C1691i c1691i) {
        this.f8280a = c1691i;
    }

    /* renamed from: a */
    public final Object m5389a(int i10, C0956k c0956k) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "attempt was ", " but must be greater than 0").toString());
        }
        C1691i c1691i = this.f8280a;
        double dMin = Math.min(Math.pow(c1691i.f8276b, i10 - 1) * C5770a.m11293d(c1691i.f8275a), C5770a.m11301l(c1691i.f8278d, EnumC5772c.MILLISECONDS));
        double d2 = c1691i.f8277c;
        double dMo7675b = 0.0d;
        if (d2 > 0.0d) {
            this.f8281b.getClass();
            dMo7675b = AbstractC3363d.f17772b.mo7675b(d2);
        }
        Object objM13489l = c0.m13489l((long) ((1.0d - dMo7675b) * dMin), c0956k);
        return objM13489l == EnumC7794a.COROUTINE_SUSPENDED ? objM13489l : a0.f30746a;
    }
}
