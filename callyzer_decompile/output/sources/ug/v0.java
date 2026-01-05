package ug;

import android.text.TextUtils;
import android.util.Log;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 extends t1 {

    /* renamed from: c */
    public char f35859c;

    /* renamed from: d */
    public long f35860d;

    /* renamed from: e */
    public String f35861e;

    /* renamed from: f */
    public final t0 f35862f;

    /* renamed from: g */
    public final t0 f35863g;

    /* renamed from: h */
    public final t0 f35864h;

    /* renamed from: j */
    public final t0 f35865j;

    /* renamed from: k */
    public final t0 f35866k;

    /* renamed from: l */
    public final t0 f35867l;

    /* renamed from: m */
    public final t0 f35868m;

    /* renamed from: n */
    public final t0 f35869n;

    /* renamed from: p */
    public final t0 f35870p;

    public v0(n1 n1Var) {
        super(n1Var);
        this.f35859c = (char) 0;
        this.f35860d = -1L;
        this.f35862f = new t0(this, 6, false, false);
        this.f35863g = new t0(this, 6, true, false);
        this.f35864h = new t0(this, 6, false, true);
        this.f35865j = new t0(this, 5, false, false);
        this.f35866k = new t0(this, 5, true, false);
        this.f35867l = new t0(this, 5, false, true);
        this.f35868m = new t0(this, 4, false, false);
        this.f35869n = new t0(this, 3, false, false);
        this.f35870p = new t0(this, 2, false, false);
    }

    /* renamed from: U */
    public static u0 m14157U(String str) {
        if (str == null) {
            return null;
        }
        return new u0(str);
    }

    /* renamed from: X */
    public static String m14158X(boolean z6, String str, Object obj, Object obj2, Object obj3) {
        String strM14159Y = m14159Y(obj, z6);
        String strM14159Y2 = m14159Y(obj2, z6);
        String strM14159Y3 = m14159Y(obj3, z6);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM14159Y)) {
            sb2.append(str2);
            sb2.append(strM14159Y);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM14159Y2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strM14159Y2);
        }
        if (!TextUtils.isEmpty(strM14159Y3)) {
            sb2.append(str3);
            sb2.append(strM14159Y3);
        }
        return sb2.toString();
    }

    /* renamed from: Y */
    public static String m14159Y(Object obj, boolean z6) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z6) {
                return obj.toString();
            }
            Long l9 = (Long) obj;
            if (Math.abs(l9.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l9.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof u0 ? ((u0) obj).f35837a : z6 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z6 ? th2.getClass().getName() : th2.toString());
        String canonicalName = n1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i10++;
        }
        return sb3.toString();
    }

    @Override // ug.t1
    /* renamed from: N */
    public final boolean mo13860N() {
        return false;
    }

    /* renamed from: Q */
    public final t0 m14160Q() {
        return this.f35862f;
    }

    /* renamed from: R */
    public final t0 m14161R() {
        return this.f35865j;
    }

    /* renamed from: S */
    public final t0 m14162S() {
        return this.f35869n;
    }

    /* renamed from: T */
    public final t0 m14163T() {
        return this.f35870p;
    }

    /* renamed from: V */
    public final void m14164V(int i10, boolean z6, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z6 && Log.isLoggable(m14165W(), i10)) {
            Log.println(i10, m14165W(), m14158X(false, str, obj, obj2, obj3));
        }
        if (z10 || i10 < 5) {
            return;
        }
        AbstractC6840z.m13036g(str);
        m1 m1Var = ((n1) this.f482a).f35670g;
        if (m1Var == null) {
            Log.println(6, m14165W(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!m1Var.f35835b) {
                Log.println(6, m14165W(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            m1Var.m14047V(new s0(this, i10, str, obj, obj2, obj3));
        }
    }

    /* renamed from: W */
    public final String m14165W() {
        String str;
        synchronized (this) {
            try {
                if (this.f35861e == null) {
                    ((n1) ((n1) this.f482a).f35667d.f482a).getClass();
                    this.f35861e = "FA";
                }
                AbstractC6840z.m13036g(this.f35861e);
                str = this.f35861e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
