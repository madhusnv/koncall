package p001o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class cmb {

    /* renamed from: o.cmb$b */
    public static final class C12710b {

        /* renamed from: a */
        public final String f18336a;

        /* renamed from: b */
        public final b f18337b;

        /* renamed from: c */
        public b f18338c;

        /* renamed from: d */
        public boolean f18339d;

        /* renamed from: e */
        public boolean f18340e;

        /* renamed from: o.cmb$b$a */
        public static final class a extends b {
            public a() {
            }
        }

        /* renamed from: o.cmb$b$b */
        public static class b {

            /* renamed from: a */
            public String f18341a;

            /* renamed from: b */
            public Object f18342b;

            /* renamed from: c */
            public b f18343c;
        }

        /* renamed from: j */
        public static boolean m21422j(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* renamed from: a */
        public C12710b m21423a(String str, int i) {
            return m21430h(str, String.valueOf(i));
        }

        /* renamed from: b */
        public C12710b m21424b(String str, long j) {
            return m21430h(str, String.valueOf(j));
        }

        /* renamed from: c */
        public C12710b m21425c(String str, Object obj) {
            return m21428f(str, obj);
        }

        /* renamed from: d */
        public final b m21426d() {
            b bVar = new b();
            this.f18338c.f18343c = bVar;
            this.f18338c = bVar;
            return bVar;
        }

        /* renamed from: e */
        public final C12710b m21427e(Object obj) {
            m21426d().f18342b = obj;
            return this;
        }

        /* renamed from: f */
        public final C12710b m21428f(String str, Object obj) {
            b bVarM21426d = m21426d();
            bVarM21426d.f18342b = obj;
            bVarM21426d.f18341a = (String) dgd.m23062o(str);
            return this;
        }

        /* renamed from: g */
        public final a m21429g() {
            a aVar = new a();
            this.f18338c.f18343c = aVar;
            this.f18338c = aVar;
            return aVar;
        }

        /* renamed from: h */
        public final C12710b m21430h(String str, Object obj) {
            a aVarM21429g = m21429g();
            aVarM21429g.f18342b = obj;
            aVarM21429g.f18341a = (String) dgd.m23062o(str);
            return this;
        }

        /* renamed from: i */
        public C12710b m21431i(Object obj) {
            return m21427e(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            boolean z = this.f18339d;
            boolean z2 = this.f18340e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f18336a);
            sb.append('{');
            String str = "";
            for (b bVar = this.f18337b.f18343c; bVar != null; bVar = bVar.f18343c) {
                Object obj = bVar.f18342b;
                if (bVar instanceof a) {
                    sb.append(str);
                    String str2 = bVar.f18341a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                } else if (obj == null) {
                    if (!z) {
                    }
                } else if (!z2 || !m21422j(obj)) {
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public C12710b(String str) {
            b bVar = new b();
            this.f18337b = bVar;
            this.f18338c = bVar;
            this.f18339d = false;
            this.f18340e = false;
            this.f18336a = (String) dgd.m23062o(str);
        }
    }

    /* renamed from: a */
    public static Object m21420a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static C12710b m21421b(Object obj) {
        return new C12710b(obj.getClass().getSimpleName());
    }
}
