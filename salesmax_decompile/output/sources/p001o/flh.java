package p001o;

/* loaded from: classes6.dex */
public abstract class flh {

    /* renamed from: o.flh$a */
    public static final class C13482a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ uk7 f23621a;

        public C13482a(uk7 uk7Var) {
            this.f23621a = uk7Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f23621a.invoke();
        }
    }

    /* renamed from: a */
    public static final Thread m27030a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "block");
        C13482a c13482a = new C13482a(uk7Var);
        if (z2) {
            c13482a.setDaemon(true);
        }
        if (i > 0) {
            c13482a.setPriority(i);
        }
        if (str != null) {
            c13482a.setName(str);
        }
        if (classLoader != null) {
            c13482a.setContextClassLoader(classLoader);
        }
        if (z) {
            c13482a.start();
        }
        return c13482a;
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m27031b(boolean z, boolean z2, ClassLoader classLoader, String str, int i, uk7 uk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return m27030a(z3, z4, classLoader2, str2, i, uk7Var);
    }
}
