package p001o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes6.dex */
public abstract class yja {

    /* renamed from: a */
    public static volatile int f55603a;

    /* renamed from: e */
    public static volatile vxe f55607e;

    /* renamed from: b */
    public static final fbg f55604b = new fbg();

    /* renamed from: c */
    public static final grb f55605c = new grb();

    /* renamed from: d */
    public static boolean f55606d = xqi.m56679d("slf4j.detectLoggerNameMismatch");

    /* renamed from: f */
    public static final String[] f55608f = {"2.0"};

    /* renamed from: A */
    public static final void m57885A() {
        try {
            String strMo26391c = f55607e.mo26391c();
            boolean z = false;
            for (String str : f55608f) {
                if (strMo26391c.startsWith(str)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            sle.m48488i("The requested version " + strMo26391c + " by your slf4j provider is not compatible with " + Arrays.asList(f55608f).toString());
            sle.m48488i("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (Throwable th) {
            sle.m48482c("Unexpected problem occurred during version sanity check", th);
        }
    }

    /* renamed from: b */
    public static final void m57887b() {
        try {
            List listM57893h = m57893h();
            m57910y(listM57893h);
            if (listM57893h == null || listM57893h.isEmpty()) {
                f55603a = 4;
                sle.m48488i("No SLF4J providers were found.");
                sle.m48488i("Defaulting to no-operation (NOP) logger implementation");
                sle.m48488i("See https://www.slf4j.org/codes.html#noProviders for further details.");
                m57909x(m57892g());
            } else {
                f55607e = (vxe) listM57893h.get(0);
                f55607e.mo26389a();
                f55603a = 3;
                m57908w(listM57893h);
            }
            m57905t();
        } catch (Exception e) {
            m57891f(e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        }
    }

    /* renamed from: c */
    public static void m57888c(ebg ebgVar, int i) {
        if (ebgVar.m24732h().m20744q()) {
            m57889d(i);
        } else {
            if (ebgVar.m24732h().m20745r()) {
                return;
            }
            m57890e();
        }
    }

    /* renamed from: d */
    public static void m57889d(int i) {
        sle.m48488i("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        sle.m48488i("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        sle.m48488i("See also https://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: e */
    public static void m57890e() {
        sle.m48488i("The following set of substitute loggers may have been accessed");
        sle.m48488i("during the initialization phase. Logging calls during this");
        sle.m48488i("phase were not honored. However, subsequent logging calls to these");
        sle.m48488i("loggers will work as normally expected.");
        sle.m48488i("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: f */
    public static void m57891f(Throwable th) {
        f55603a = 2;
        sle.m48482c("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: g */
    public static Set m57892g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = yja.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            sle.m48482c("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: h */
    public static List m57893h() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = yja.class.getClassLoader();
        vxe vxeVarM57902q = m57902q(classLoader);
        if (vxeVarM57902q != null) {
            arrayList.add(vxeVarM57902q);
            return arrayList;
        }
        Iterator it = m57899n(classLoader).iterator();
        while (it.hasNext()) {
            m57911z(arrayList, it);
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m57894i() {
        fbg fbgVar = f55604b;
        synchronized (fbgVar) {
            fbgVar.m26393e().m22762e();
            for (cbg cbgVar : fbgVar.m26393e().m22761d()) {
                cbgVar.m20748u(m57897l(cbgVar.getName()));
            }
        }
    }

    /* renamed from: j */
    public static l68 m57895j() {
        return m57898m().mo26390b();
    }

    /* renamed from: k */
    public static vja m57896k(Class cls) {
        Class clsM56676a;
        vja vjaVarM57897l = m57897l(cls.getName());
        if (f55606d && (clsM56676a = xqi.m56676a()) != null && m57903r(cls, clsM56676a)) {
            sle.m48488i(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", vjaVarM57897l.getName(), clsM56676a.getName()));
            sle.m48488i("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return vjaVarM57897l;
    }

    /* renamed from: l */
    public static vja m57897l(String str) {
        return m57895j().mo22758a(str);
    }

    /* renamed from: m */
    public static vxe m57898m() {
        if (f55603a == 0) {
            synchronized (yja.class) {
                if (f55603a == 0) {
                    f55603a = 1;
                    m57904s();
                }
            }
        }
        int i = f55603a;
        if (i == 1) {
            return f55604b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return f55607e;
        }
        if (i == 4) {
            return f55605c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: n */
    public static ServiceLoader m57899n(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(vxe.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: o.xja
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return yja.m57901p(classLoader);
            }
        });
    }

    /* renamed from: o */
    public static boolean m57900o(List list) {
        return list.size() > 1;
    }

    /* renamed from: p */
    public static /* synthetic */ ServiceLoader m57901p(ClassLoader classLoader) {
        return ServiceLoader.load(vxe.class, classLoader);
    }

    /* renamed from: q */
    public static vxe m57902q(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                sle.m48485f(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (vxe) classLoader.loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e) {
                sle.m48482c(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e);
                return null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                sle.m48482c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e3) {
                e = e3;
                sle.m48482c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e4) {
                e = e4;
                sle.m48482c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e5) {
                e = e5;
                sle.m48482c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e6) {
                e = e6;
                sle.m48482c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m57903r(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: s */
    public static final void m57904s() {
        m57887b();
        if (f55603a == 3) {
            m57885A();
        }
    }

    /* renamed from: t */
    public static void m57905t() {
        m57894i();
        m57906u();
        f55604b.m26393e().m22759b();
    }

    /* renamed from: u */
    public static void m57906u() {
        LinkedBlockingQueue linkedBlockingQueueM22760c = f55604b.m26393e().m22760c();
        int size = linkedBlockingQueueM22760c.size();
        ArrayList<ebg> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM22760c.drainTo(arrayList, 128) != 0) {
            for (ebg ebgVar : arrayList) {
                m57907v(ebgVar);
                int i2 = i + 1;
                if (i == 0) {
                    m57888c(ebgVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: v */
    public static void m57907v(ebg ebgVar) {
        if (ebgVar == null) {
            return;
        }
        cbg cbgVarM24732h = ebgVar.m24732h();
        String name = cbgVarM24732h.getName();
        if (cbgVarM24732h.m20746s()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (cbgVarM24732h.m20745r()) {
            return;
        }
        if (!cbgVarM24732h.m20744q()) {
            sle.m48488i(name);
        } else if (cbgVarM24732h.mo20733f(ebgVar.mo23366e())) {
            cbgVarM24732h.m20747t(ebgVar);
        }
    }

    /* renamed from: w */
    public static void m57908w(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (m57900o(list)) {
            sle.m48485f("Actual provider is of type [" + list.get(0) + "]");
            return;
        }
        sle.m48480a("Connected with provider of type [" + ((vxe) list.get(0)).getClass().getName() + "]");
    }

    /* renamed from: x */
    public static void m57909x(Set set) {
        if (set.isEmpty()) {
            return;
        }
        sle.m48488i("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sle.m48488i("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        sle.m48488i("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* renamed from: y */
    public static void m57910y(List list) {
        if (m57900o(list)) {
            sle.m48488i("Class path contains multiple SLF4J providers.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sle.m48488i("Found provider [" + ((vxe) it.next()) + "]");
            }
            sle.m48488i("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: z */
    public static void m57911z(List list, Iterator it) {
        try {
            list.add((vxe) it.next());
        } catch (ServiceConfigurationError e) {
            sle.m48481b("A service provider failed to instantiate:\n" + e.getMessage());
        }
    }
}
