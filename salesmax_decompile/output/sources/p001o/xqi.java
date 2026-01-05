package p001o;

/* loaded from: classes6.dex */
public abstract class xqi {

    /* renamed from: a */
    public static C18226b f54152a = null;

    /* renamed from: b */
    public static boolean f54153b = false;

    /* renamed from: o.xqi$b */
    public static final class C18226b extends SecurityManager {
        public C18226b() {
        }

        @Override // java.lang.SecurityManager
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    /* renamed from: a */
    public static Class m56676a() {
        int i;
        C18226b c18226bM56677b = m56677b();
        if (c18226bM56677b == null) {
            return null;
        }
        Class[] classContext = c18226bM56677b.getClassContext();
        String name = xqi.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    /* renamed from: b */
    public static C18226b m56677b() {
        C18226b c18226b = f54152a;
        if (c18226b != null) {
            return c18226b;
        }
        if (f54153b) {
            return null;
        }
        C18226b c18226bM56678c = m56678c();
        f54152a = c18226bM56678c;
        f54153b = true;
        return c18226bM56678c;
    }

    /* renamed from: c */
    public static C18226b m56678c() {
        try {
            return new C18226b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m56679d(String str) {
        String strM56680e = m56680e(str);
        if (strM56680e == null) {
            return false;
        }
        return strM56680e.equalsIgnoreCase("true");
    }

    /* renamed from: e */
    public static String m56680e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
