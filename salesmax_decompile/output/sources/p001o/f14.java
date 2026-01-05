package p001o;

/* loaded from: classes6.dex */
public class f14 {

    /* renamed from: a */
    public Object f22520a;

    /* renamed from: o.f14$a */
    public static class C13309a {

        /* renamed from: a */
        public Object f22521a;

        /* renamed from: b */
        public Object f22522b;

        /* renamed from: c */
        public String f22523c;

        /* renamed from: d */
        public f14 f22524d;

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C13309a)) {
                return false;
            }
            C13309a c13309a = (C13309a) obj;
            return c13309a.f22521a == this.f22521a && c13309a.f22522b == this.f22522b && c13309a.f22523c.equals(this.f22523c);
        }

        public int hashCode() {
            return this.f22521a.hashCode() + this.f22522b.hashCode() + this.f22523c.hashCode();
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f22521a);
            stringBuffer.append("---");
            stringBuffer.append(this.f22523c);
            stringBuffer.append("-->");
            stringBuffer.append(this.f22522b);
            return stringBuffer.toString();
        }

        public C13309a(f14 f14Var, Object obj, Object obj2, String str) {
            this.f22524d = f14Var;
            this.f22521a = obj;
            this.f22522b = obj2;
            this.f22523c = str;
        }
    }

    /* renamed from: a */
    public final void m25926a(Object obj, Object obj2, String str) {
        if (tia.m49926h()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Container ");
            stringBuffer.append(obj);
            stringBuffer.append(" + ");
            stringBuffer.append(obj2);
            stringBuffer.append(" as ");
            stringBuffer.append(str);
            tia.m49920b(stringBuffer.toString());
        }
        if (this.f22520a != null) {
            new C13309a(obj, obj2, str);
            if (ti9.m49917k(this.f22520a) <= 0) {
                return;
            }
            tq.m50332a(ti9.m49913g(this.f22520a, 0));
            throw null;
        }
    }

    /* renamed from: b */
    public void m25927b(Object obj) {
        Object obj2 = this.f22520a;
        if (obj2 == null || ti9.m49917k(obj2) <= 0) {
            return;
        }
        tq.m50332a(ti9.m49913g(this.f22520a, 0));
        throw null;
    }

    /* renamed from: c */
    public final void m25928c(Object obj, Object obj2, String str) {
        if (tia.m49926h()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Container ");
            stringBuffer.append(obj);
            stringBuffer.append(" - ");
            stringBuffer.append(obj2);
            stringBuffer.append(" as ");
            stringBuffer.append(str);
            tia.m49920b(stringBuffer.toString());
        }
        if (this.f22520a != null) {
            new C13309a(obj, obj2, str);
            if (ti9.m49917k(this.f22520a) <= 0) {
                return;
            }
            tq.m50332a(ti9.m49913g(this.f22520a, 0));
            throw null;
        }
    }

    /* renamed from: d */
    public void m25929d(Object obj) {
        Object obj2 = this.f22520a;
        if (obj2 == null || ti9.m49917k(obj2) <= 0) {
            return;
        }
        tq.m50332a(ti9.m49913g(this.f22520a, 0));
        throw null;
    }

    /* renamed from: e */
    public synchronized void m25930e(Object obj, Object obj2, Object obj3, String str) {
        if (obj2 != null) {
            try {
                if (!obj2.equals(obj3)) {
                    m25928c(obj, obj2, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj3 != null && !obj3.equals(obj2)) {
            m25926a(obj, obj3, str);
        }
    }

    /* renamed from: f */
    public synchronized void m25931f(Object obj, Object obj2, Object obj3, String str, boolean z) {
        if (obj2 != null) {
            try {
                if (!obj2.equals(obj3)) {
                    m25928c(obj, obj2, str);
                    if (z) {
                        m25929d(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj3 != null && !obj3.equals(obj2)) {
            if (z) {
                m25927b(obj3);
            }
            m25926a(obj, obj3, str);
        }
    }

    /* renamed from: g */
    public synchronized void m25932g(Object obj, Object[] objArr, Object[] objArr2, String str) {
        m25933h(obj, objArr, objArr2, str, false);
    }

    /* renamed from: h */
    public synchronized void m25933h(Object obj, Object[] objArr, Object[] objArr2, String str, boolean z) {
        Object[] objArr3 = null;
        if (objArr2 != null) {
            try {
                Object[] objArr4 = new Object[objArr2.length];
                int length = objArr2.length;
                while (true) {
                    int i = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    boolean z2 = true;
                    if (objArr != null) {
                        int length2 = objArr.length;
                        while (true) {
                            int i2 = length2 - 1;
                            if (length2 <= 0) {
                                break;
                            }
                            Object obj2 = objArr2[i];
                            if (obj2 != null && obj2.equals(objArr[i2])) {
                                objArr[i2] = null;
                                z2 = false;
                            }
                            length2 = i2;
                        }
                    }
                    if (z2) {
                        objArr4[i] = objArr2[i];
                    }
                    length = i;
                }
                objArr3 = objArr4;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objArr != null) {
            int length3 = objArr.length;
            while (true) {
                int i3 = length3 - 1;
                if (length3 <= 0) {
                    break;
                }
                Object obj3 = objArr[i3];
                if (obj3 != null) {
                    m25928c(obj, obj3, str);
                    if (z) {
                        m25929d(objArr[i3]);
                    }
                }
                length3 = i3;
            }
        }
        if (objArr3 != null) {
            for (int i4 = 0; i4 < objArr3.length; i4++) {
                Object obj4 = objArr3[i4];
                if (obj4 != null) {
                    if (z) {
                        m25927b(obj4);
                    }
                    m25926a(obj, objArr3[i4], str);
                }
            }
        }
    }
}
