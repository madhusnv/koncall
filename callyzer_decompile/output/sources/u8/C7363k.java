package u8;

import ex.InterfaceC2143g;
import og.od;
import t8.C7077w;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.k */
/* loaded from: classes.dex */
public final class C7363k extends AbstractC8199i implements InterfaceC2143g {

    /* renamed from: a */
    public int f35025a;

    /* renamed from: b */
    public /* synthetic */ long f35026b;

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        C7363k c7363k = new C7363k(4, (InterfaceC7559c) obj4);
        c7363k.f35026b = jLongValue;
        return c7363k.invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f35025a;
        if (i10 == 0) {
            od.m10798c(obj);
            long j6 = this.f35026b;
            C7077w c7077wM13371a = C7077w.m13371a();
            int i11 = AbstractC7364l.f35028b;
            c7077wM13371a.getClass();
            long jMin = Math.min(j6 * 30000, AbstractC7364l.f35027a);
            this.f35025a = 1;
            if (c0.m13489l(jMin, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return Boolean.TRUE;
    }
}
