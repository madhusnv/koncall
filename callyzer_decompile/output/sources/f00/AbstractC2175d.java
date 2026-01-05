package f00;

import g00.C2420e;
import h00.InterfaceC2767c;
import h00.InterfaceC2769e;
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
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import og.me;
import org.slf4j.helpers.AbstractC5717f;
import org.slf4j.helpers.AbstractC5722k;
import org.slf4j.helpers.C5713b;
import org.slf4j.helpers.C5714c;
import org.slf4j.helpers.C5718g;
import org.slf4j.helpers.C5719h;
import org.slf4j.helpers.C5720i;
import org.slf4j.helpers.C5721j;
import org.slf4j.helpers.EnumC5715d;
import org.slf4j.helpers.EnumC5716e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f00.d */
/* loaded from: classes3.dex */
public abstract class AbstractC2175d {

    /* renamed from: a */
    public static volatile int f10042a;

    /* renamed from: b */
    public static final C5720i f10043b = new C5720i();

    /* renamed from: c */
    public static final C5714c f10044c = new C5714c();

    /* renamed from: d */
    public static final boolean f10045d;

    /* renamed from: e */
    public static volatile InterfaceC2769e f10046e;

    /* renamed from: f */
    public static final String[] f10047f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f10045d = property == null ? false : property.equalsIgnoreCase("true");
        f10047f = new String[]{"2.0"};
    }

    /* renamed from: a */
    public static ArrayList m5851a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC2175d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        InterfaceC2769e interfaceC2769e = null;
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC5717f.m11272d("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                interfaceC2769e = (InterfaceC2769e) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                AbstractC5717f.m11270b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e10) {
                e = e10;
                AbstractC5717f.m11270b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e11) {
                e = e11;
                AbstractC5717f.m11270b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e12) {
                e = e12;
                AbstractC5717f.m11270b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e13) {
                e = e13;
                AbstractC5717f.m11270b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e14) {
                e = e14;
                AbstractC5717f.m11270b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (interfaceC2769e != null) {
            arrayList.add(interfaceC2769e);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(InterfaceC2769e.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: f00.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(InterfaceC2769e.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((InterfaceC2769e) it.next());
            } catch (ServiceConfigurationError e15) {
                AbstractC5717f.m11269a("A service provider failed to instantiate:\n" + e15.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static InterfaceC2173b m5852b(Class cls) {
        int i10;
        InterfaceC2173b interfaceC2173bM5853c = m5853c(cls.getName());
        if (f10045d) {
            C5721j c5721j = AbstractC5722k.f28204a;
            Class cls2 = null;
            if (c5721j == null) {
                if (AbstractC5722k.f28205b) {
                    c5721j = null;
                } else {
                    try {
                        c5721j = new C5721j();
                    } catch (SecurityException unused) {
                        c5721j = null;
                    }
                    AbstractC5722k.f28204a = c5721j;
                    AbstractC5722k.f28205b = true;
                }
            }
            if (c5721j != null) {
                Class[] classContext = c5721j.getClassContext();
                String name = AbstractC5722k.class.getName();
                int i11 = 0;
                while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
                    i11++;
                }
                if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i10];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                AbstractC5717f.m11274f("Detected logger name mismatch. Given name: \"" + interfaceC2173bM5853c.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                AbstractC5717f.m11274f("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC2173bM5853c;
    }

    /* renamed from: c */
    public static InterfaceC2173b m5853c(String str) {
        return m5854d().mo6764b().mo5823c(str);
    }

    /* renamed from: d */
    public static InterfaceC2769e m5854d() {
        if (f10042a == 0) {
            synchronized (AbstractC2175d.class) {
                try {
                    if (f10042a == 0) {
                        f10042a = 1;
                        m5855e();
                    }
                } finally {
                }
            }
        }
        int i10 = f10042a;
        if (i10 == 1) {
            return f10043b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return f10046e;
        }
        if (i10 == 4) {
            return f10044c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: e */
    public static final void m5855e() {
        try {
            ArrayList arrayListM5851a = m5851a();
            m5859i(arrayListM5851a);
            if (arrayListM5851a.isEmpty()) {
                f10042a = 4;
                AbstractC5717f.m11274f("No SLF4J providers were found.");
                AbstractC5717f.m11274f("Defaulting to no-operation (NOP) logger implementation");
                AbstractC5717f.m11274f("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC2175d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e2) {
                    AbstractC5717f.m11270b("Error getting resources from path", e2);
                }
                m5858h(linkedHashSet);
            } else {
                f10046e = (InterfaceC2769e) arrayListM5851a.get(0);
                InterfaceC2767c interfaceC2767cMo6763a = f10046e.mo6763a();
                if (interfaceC2767cMo6763a != null) {
                    me.f26656a = interfaceC2767cMo6763a;
                }
                f10046e.getClass();
                f10042a = 3;
                m5857g(arrayListM5851a);
            }
            m5856f();
            if (f10042a == 3) {
                try {
                    String strMo6765c = f10046e.mo6765c();
                    boolean z6 = false;
                    for (String str : f10047f) {
                        if (strMo6765c.startsWith(str)) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        return;
                    }
                    AbstractC5717f.m11274f("The requested version " + strMo6765c + " by your slf4j provider is not compatible with " + Arrays.asList(f10047f).toString());
                    AbstractC5717f.m11274f("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                } catch (Throwable th2) {
                    AbstractC5717f.m11270b("Unexpected problem occurred during version sanity check", th2);
                }
            }
        } catch (Exception e10) {
            f10042a = 2;
            AbstractC5717f.m11270b("Failed to instantiate SLF4J LoggerFactory", e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    /* renamed from: f */
    public static void m5856f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C5720i c5720i = f10043b;
        synchronized (c5720i) {
            try {
                c5720i.f28202a.f28199a = true;
                C5719h c5719h = c5720i.f28202a;
                c5719h.getClass();
                ArrayList arrayList = new ArrayList(c5719h.f28200b.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    C5718g c5718g = (C5718g) obj;
                    c5718g.f28193b = m5853c(c5718g.f28192a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = f10043b.f28202a.f28201c;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i11 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                C2420e c2420e = (C2420e) obj2;
                if (c2420e != null) {
                    C5718g c5718g2 = c2420e.f10913b;
                    String str = c5718g2.f28192a;
                    if (c5718g2.f28193b == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c5718g2.f28193b instanceof C5713b)) {
                        if (!c5718g2.m11276C()) {
                            AbstractC5717f.m11274f(str);
                        } else if (c5718g2.mo5826b(c2420e.f10912a) && c5718g2.m11276C()) {
                            try {
                                c5718g2.f28195d.invoke(c5718g2.f28193b, c2420e);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i13 = i11 + 1;
                if (i11 == 0) {
                    if (c2420e.f10913b.m11276C()) {
                        AbstractC5717f.m11274f("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC5717f.m11274f("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC5717f.m11274f("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c2420e.f10913b.f28193b instanceof C5713b)) {
                        AbstractC5717f.m11274f("The following set of substitute loggers may have been accessed");
                        AbstractC5717f.m11274f("during the initialization phase. Logging calls during this");
                        AbstractC5717f.m11274f("phase were not honored. However, subsequent logging calls to these");
                        AbstractC5717f.m11274f("loggers will work as normally expected.");
                        AbstractC5717f.m11274f("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i11 = i13;
            }
            arrayList2.clear();
        }
        C5719h c5719h2 = f10043b.f28202a;
        c5719h2.f28200b.clear();
        c5719h2.f28201c.clear();
    }

    /* renamed from: g */
    public static void m5857g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            AbstractC5717f.m11272d("Actual provider is of type [" + arrayList.get(0) + "]");
            return;
        }
        String str = "Connected with provider of type [" + ((InterfaceC2769e) arrayList.get(0)).getClass().getName() + "]";
        EnumC5716e enumC5716e = AbstractC5717f.f28190a;
        if (AbstractC5717f.m11273e(EnumC5715d.DEBUG)) {
            AbstractC5717f.m11271c().println("SLF4J(D): " + str);
        }
    }

    /* renamed from: h */
    public static void m5858h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC5717f.m11274f("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC5717f.m11274f("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC5717f.m11274f("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* renamed from: i */
    public static void m5859i(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC5717f.m11274f("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AbstractC5717f.m11274f("Found provider [" + ((InterfaceC2769e) obj) + "]");
            }
            AbstractC5717f.m11274f("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
