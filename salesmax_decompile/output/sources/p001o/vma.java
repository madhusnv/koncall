package p001o;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class vma {

    /* renamed from: a */
    public final ihg f50545a = tgg.m49847a();

    /* renamed from: b */
    public final HashMap f50546b;

    /* renamed from: c */
    public final LinkedHashSet f50547c;

    /* renamed from: d */
    public int f50548d;

    /* renamed from: e */
    public int f50549e;

    /* renamed from: f */
    public int f50550f;

    /* renamed from: g */
    public int f50551g;

    /* renamed from: h */
    public int f50552h;

    /* renamed from: i */
    public int f50553i;

    /* renamed from: j */
    public int f50554j;

    public vma(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f50549e = i;
        this.f50546b = new HashMap(0, 0.75f);
        this.f50547c = new LinkedHashSet();
    }

    /* renamed from: b */
    public Object m52966b(Object obj) {
        return null;
    }

    /* renamed from: c */
    public void m52967c(boolean z, Object obj, Object obj2, Object obj3) {
    }

    /* renamed from: d */
    public final Object m52968d(Object obj) {
        synchronized (this.f50545a) {
            Object obj2 = this.f50546b.get(obj);
            if (obj2 != null) {
                this.f50547c.remove(obj);
                this.f50547c.add(obj);
                this.f50553i++;
                return obj2;
            }
            this.f50554j++;
            Object objM52966b = m52966b(obj);
            if (objM52966b == null) {
                return null;
            }
            synchronized (this.f50545a) {
                this.f50551g++;
                Object objPut = this.f50546b.put(obj, objM52966b);
                this.f50547c.remove(obj);
                this.f50547c.add(obj);
                if (objPut != null) {
                    this.f50546b.put(obj, objPut);
                    obj2 = objPut;
                } else {
                    this.f50548d = m52972h() + m52971g(obj, objM52966b);
                }
                y3i y3iVar = y3i.f54824a;
            }
            if (obj2 != null) {
                m52967c(false, obj, objM52966b, obj2);
                return obj2;
            }
            m52974j(this.f50549e);
            return objM52966b;
        }
    }

    /* renamed from: e */
    public final Object m52969e(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f50545a) {
            this.f50550f++;
            this.f50548d = m52972h() + m52971g(obj, obj2);
            objPut = this.f50546b.put(obj, obj2);
            if (objPut != null) {
                this.f50548d = m52972h() - m52971g(obj, objPut);
            }
            if (this.f50547c.contains(obj)) {
                this.f50547c.remove(obj);
            }
            this.f50547c.add(obj);
        }
        if (objPut != null) {
            m52967c(false, obj, objPut, obj2);
        }
        m52974j(this.f50549e);
        return objPut;
    }

    /* renamed from: f */
    public final Object m52970f(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.f50545a) {
            objRemove = this.f50546b.remove(obj);
            this.f50547c.remove(obj);
            if (objRemove != null) {
                this.f50548d = m52972h() - m52971g(obj, objRemove);
            }
            y3i y3iVar = y3i.f54824a;
        }
        if (objRemove != null) {
            m52967c(false, obj, objRemove, null);
        }
        return objRemove;
    }

    /* renamed from: g */
    public final int m52971g(Object obj, Object obj2) {
        int iM52973i = m52973i(obj, obj2);
        if (iM52973i >= 0) {
            return iM52973i;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    /* renamed from: h */
    public final int m52972h() {
        int i;
        synchronized (this.f50545a) {
            i = this.f50548d;
        }
        return i;
    }

    /* renamed from: i */
    public int m52973i(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m52974j(int i) {
        Object objE0;
        Object obj;
        while (true) {
            synchronized (this.f50545a) {
                if (m52972h() < 0 || ((this.f50546b.isEmpty() && m52972h() != 0) || this.f50546b.isEmpty() != this.f50547c.isEmpty())) {
                    break;
                }
                if (m52972h() <= i || this.f50546b.isEmpty()) {
                    objE0 = null;
                    obj = null;
                } else {
                    objE0 = kh3.e0(this.f50547c);
                    obj = this.f50546b.get(objE0);
                    if (obj == null) {
                        throw new IllegalStateException("inconsistent state");
                    }
                    azh.m18051d(this.f50546b).remove(objE0);
                    azh.m18048a(this.f50547c).remove(objE0);
                    int iM52972h = m52972h();
                    sq8.m48646e(objE0);
                    sq8.m48646e(obj);
                    this.f50548d = iM52972h - m52971g(objE0, obj);
                    this.f50552h++;
                }
                y3i y3iVar = y3i.f54824a;
            }
            if (objE0 == null && obj == null) {
                return;
            }
            sq8.m48646e(objE0);
            sq8.m48646e(obj);
            m52967c(true, objE0, obj, null);
        }
    }

    public String toString() {
        String str;
        synchronized (this.f50545a) {
            int i = this.f50553i;
            int i2 = this.f50554j + i;
            str = "LruCache[maxSize=" + this.f50549e + ",hits=" + this.f50553i + ",misses=" + this.f50554j + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
