package p001o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class pf1 implements ena {

    /* renamed from: a */
    public final skh f39980a = new skh();

    /* renamed from: b */
    public final InheritableThreadLocal f39981b = new C16096a();

    /* renamed from: o.pf1$a */
    public class C16096a extends InheritableThreadLocal {
        public C16096a() {
        }

        @Override // java.lang.InheritableThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }

    @Override // p001o.ena
    /* renamed from: a */
    public Map mo25350a() {
        Map map = (Map) this.f39981b.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @Override // p001o.ena
    /* renamed from: b */
    public void mo25351b(Map map) {
        this.f39981b.set(map != null ? new HashMap(map) : null);
    }

    @Override // p001o.ena
    public void clear() {
        Map map = (Map) this.f39981b.get();
        if (map != null) {
            map.clear();
            this.f39981b.remove();
        }
    }

    @Override // p001o.ena
    public void put(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map map = (Map) this.f39981b.get();
        if (map == null) {
            map = new HashMap();
            this.f39981b.set(map);
        }
        map.put(str, str2);
    }
}
