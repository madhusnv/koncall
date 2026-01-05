package p001o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class qi9 implements vx7 {

    /* renamed from: c */
    public final Map f42031c;

    /* renamed from: d */
    public volatile Map f42032d;

    /* renamed from: o.qi9$a */
    public static final class C16411a {

        /* renamed from: d */
        public static final String f42033d;

        /* renamed from: e */
        public static final Map f42034e;

        /* renamed from: a */
        public boolean f42035a = true;

        /* renamed from: b */
        public Map f42036b = f42034e;

        /* renamed from: c */
        public boolean f42037c = true;

        static {
            String strM45518b = m45518b();
            f42033d = strM45518b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM45518b)) {
                map.put("User-Agent", Collections.singletonList(new C16412b(strM45518b)));
            }
            f42034e = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public static String m45518b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public qi9 m45519a() {
            this.f42035a = true;
            return new qi9(this.f42036b);
        }
    }

    /* renamed from: o.qi9$b */
    public static final class C16412b implements pi9 {

        /* renamed from: a */
        public final String f42038a;

        public C16412b(String str) {
            this.f42038a = str;
        }

        @Override // p001o.pi9
        /* renamed from: a */
        public String mo43728a() {
            return this.f42038a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C16412b) {
                return this.f42038a.equals(((C16412b) obj).f42038a);
            }
            return false;
        }

        public int hashCode() {
            return this.f42038a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f42038a + "'}";
        }
    }

    public qi9(Map map) {
        this.f42031c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final String m45516a(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strMo43728a = ((pi9) list.get(i)).mo43728a();
            if (!TextUtils.isEmpty(strMo43728a)) {
                sb.append(strMo43728a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map m45517b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f42031c.entrySet()) {
            String strM45516a = m45516a((List) entry.getValue());
            if (!TextUtils.isEmpty(strM45516a)) {
                map.put(entry.getKey(), strM45516a);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof qi9) {
            return this.f42031c.equals(((qi9) obj).f42031c);
        }
        return false;
    }

    @Override // p001o.vx7
    public Map getHeaders() {
        if (this.f42032d == null) {
            synchronized (this) {
                if (this.f42032d == null) {
                    this.f42032d = Collections.unmodifiableMap(m45517b());
                }
            }
        }
        return this.f42032d;
    }

    public int hashCode() {
        return this.f42031c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f42031c + '}';
    }
}
