package p001o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class qge {

    /* renamed from: a */
    public C16400a f41970a;

    /* renamed from: o.qge$a */
    public static class C16400a {

        /* renamed from: a */
        public LinkedHashMap f41971a;

        /* renamed from: b */
        public int f41972b;

        /* renamed from: o.qge$a$a */
        public class a extends LinkedHashMap {
            public a(int i, float f, boolean z) {
                super(i, f, z);
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry entry) {
                return size() > C16400a.this.f41972b;
            }
        }

        public C16400a(int i) {
            this.f41972b = i;
            this.f41971a = new a(((i * 4) / 3) + 1, 0.75f, true);
        }

        /* renamed from: b */
        public synchronized Object m45438b(Object obj) {
            return this.f41971a.get(obj);
        }

        /* renamed from: c */
        public synchronized void m45439c(Object obj, Object obj2) {
            this.f41971a.put(obj, obj2);
        }
    }

    public qge(int i) {
        this.f41970a = new C16400a(i);
    }

    /* renamed from: a */
    public Pattern m45436a(String str) {
        Pattern pattern = (Pattern) this.f41970a.m45438b(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.f41970a.m45439c(str, patternCompile);
        return patternCompile;
    }
}
