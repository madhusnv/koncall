package p001o;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class u0f {

    /* renamed from: o.u0f$b */
    public static final class C17280b extends u0f {

        /* renamed from: b */
        public static final AbstractC17281c f48145b = AbstractC17281c.m50834a(Collections.emptyMap(), Collections.emptyMap());

        /* renamed from: a */
        public final Set f48146a;

        public C17280b() {
            this.f48146a = new HashSet();
        }

        @Override // p001o.u0f
        /* renamed from: b */
        public void mo50833b(Collection collection) {
            kri.m36136b(collection, "spanNames");
            synchronized (this.f48146a) {
                this.f48146a.addAll(collection);
            }
        }
    }

    /* renamed from: o.u0f$c */
    public static abstract class AbstractC17281c {
        /* renamed from: a */
        public static AbstractC17281c m50834a(Map map, Map map2) {
            return new h51(Collections.unmodifiableMap(new HashMap((Map) kri.m36136b(map, "numbersOfLatencySampledSpans"))), Collections.unmodifiableMap(new HashMap((Map) kri.m36136b(map2, "numbersOfErrorSampledSpans"))));
        }

        /* renamed from: b */
        public abstract Map mo29818b();

        /* renamed from: c */
        public abstract Map mo29819c();
    }

    /* renamed from: a */
    public static u0f m50832a() {
        return new C17280b();
    }

    /* renamed from: b */
    public abstract void mo50833b(Collection collection);
}
