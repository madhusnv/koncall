package pg;

import ub.C7393i;
import vx.C7806h;
import vx.C7809k;
import vx.C7815q;
import vx.EnumC7799a;
import vx.InterfaceC7810l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o6 {
    /* renamed from: a */
    public static C7806h m11805a(int i10, EnumC7799a enumC7799a, C7393i c7393i, int i11) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            enumC7799a = EnumC7799a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            c7393i = null;
        }
        if (i10 == -2) {
            if (enumC7799a != EnumC7799a.SUSPEND) {
                return new C7815q(1, enumC7799a, c7393i);
            }
            InterfaceC7810l.W0.getClass();
            return new C7806h(C7809k.f37517b, c7393i);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? enumC7799a == EnumC7799a.SUSPEND ? new C7806h(i10, c7393i) : new C7815q(i10, enumC7799a, c7393i) : new C7806h(Integer.MAX_VALUE, c7393i) : enumC7799a == EnumC7799a.SUSPEND ? new C7806h(0, c7393i) : new C7815q(1, enumC7799a, c7393i);
        }
        if (enumC7799a == EnumC7799a.SUSPEND) {
            return new C7815q(1, EnumC7799a.DROP_OLDEST, c7393i);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
