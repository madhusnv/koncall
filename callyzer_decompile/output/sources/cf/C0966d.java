package cf;

import df.C1703b;
import df.C1704c;
import df.EnumC1705d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import k0.ExecutorC3897g;
import ue.EnumC7422d;
import yk.C8687a;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cf.d */
/* loaded from: classes.dex */
public final class C0966d implements InterfaceC8945b {

    /* renamed from: a */
    public final /* synthetic */ int f5775a;

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f5775a) {
            case 0:
                C8687a c8687a = new C8687a(14);
                HashMap map = new HashMap();
                EnumC7422d enumC7422d = EnumC7422d.DEFAULT;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC7422d, new C1704c(30000L, 86400000L, set));
                EnumC7422d enumC7422d2 = EnumC7422d.HIGHEST;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC7422d2, new C1704c(1000L, 86400000L, set));
                EnumC7422d enumC7422d3 = EnumC7422d.VERY_LOW;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC1705d.DEVICE_IDLE)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC7422d3, new C1704c(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < EnumC7422d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C1703b(c8687a, map);
            default:
                return new ExecutorC3897g(3, Executors.newSingleThreadExecutor());
        }
    }
}
