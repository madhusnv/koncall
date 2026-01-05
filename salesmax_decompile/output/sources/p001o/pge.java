package p001o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class pge {

    /* renamed from: a */
    public C16109a f40038a;

    /* renamed from: o.pge$a */
    public static class C16109a {

        /* renamed from: a */
        public LinkedHashMap f40039a;

        /* renamed from: b */
        public int f40040b;

        /* renamed from: o.pge$a$a */
        public class a extends LinkedHashMap {
            public a(int i, float f, boolean z) {
                super(i, f, z);
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry entry) {
                return size() > C16109a.this.f40040b;
            }
        }

        public C16109a(int i) {
            this.f40040b = i;
            this.f40039a = new a(((i * 4) / 3) + 1, 0.75f, true);
        }

        /* renamed from: b */
        public synchronized Object m43609b(Object obj) {
            return this.f40039a.get(obj);
        }

        /* renamed from: c */
        public synchronized void m43610c(Object obj, Object obj2) {
            this.f40039a.put(obj, obj2);
        }
    }

    public pge(int i) {
        this.f40038a = new C16109a(i);
    }

    /* renamed from: a */
    public Pattern m43607a(String str) {
        Pattern pattern = (Pattern) this.f40038a.m43609b(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.f40038a.m43610c(str, patternCompile);
        return patternCompile;
    }
}
