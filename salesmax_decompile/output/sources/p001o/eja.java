package p001o;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public abstract class eja {

    /* renamed from: a */
    public static PrintStream f21759a;

    /* renamed from: b */
    public static final String f21760b;

    /* renamed from: c */
    public static final ClassLoader f21761c;

    /* renamed from: d */
    public static Hashtable f21762d;

    /* renamed from: e */
    public static /* synthetic */ Class f21763e;

    static {
        String strM25157y;
        Class clsM25134b = f21763e;
        if (clsM25134b == null) {
            clsM25134b = m25134b("org.apache.commons.logging.LogFactory");
            f21763e = clsM25134b;
        }
        ClassLoader classLoaderM25139g = m25139g(clsM25134b);
        f21761c = classLoaderM25139g;
        if (classLoaderM25139g == null) {
            strM25157y = "BOOTLOADER";
        } else {
            try {
                strM25157y = m25157y(classLoaderM25139g);
            } catch (SecurityException unused) {
                strM25157y = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(strM25157y);
        stringBuffer.append("] ");
        f21760b = stringBuffer.toString();
        f21759a = m25151s();
        Class clsM25134b2 = f21763e;
        if (clsM25134b2 == null) {
            clsM25134b2 = m25134b("org.apache.commons.logging.LogFactory");
            f21763e = clsM25134b2;
        }
        m25153u(clsM25134b2);
        f21762d = m25136d();
        if (m25152t()) {
            m25154v("BOOTSTRAP COMPLETED");
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Class m25134b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01b9: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:442), block:B:68:0x01b9 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b A[Catch: Exception -> 0x01b8, TryCatch #5 {Exception -> 0x01b8, blocks: (B:5:0x0009, B:7:0x000d, B:8:0x0013, B:10:0x0019, B:12:0x001f, B:19:0x0092, B:13:0x0044, B:15:0x004a, B:17:0x0074, B:18:0x007a, B:44:0x0122, B:46:0x0126, B:48:0x012c, B:49:0x0156, B:59:0x0185, B:61:0x018b, B:62:0x01a8, B:52:0x0159, B:54:0x015d, B:56:0x0163, B:57:0x0183, B:28:0x00a4, B:30:0x00a8, B:32:0x00c7, B:33:0x00cd, B:35:0x00db, B:37:0x0104, B:39:0x010f, B:40:0x0116, B:41:0x011f, B:36:0x00ff), top: B:83:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c7  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m25135c(String str, ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> cls;
        Class<?> clsLoadClass;
        Class<?> cls2;
        Class<?> cls3 = null;
        try {
            if (classLoader != null) {
                try {
                    clsLoadClass = classLoader.loadClass(str);
                    try {
                        Class clsM25134b = f21763e;
                        if (clsM25134b == null) {
                            clsM25134b = m25134b("org.apache.commons.logging.LogFactory");
                            f21763e = clsM25134b;
                        }
                        if (clsM25134b.isAssignableFrom(clsLoadClass)) {
                            if (m25152t()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Loaded class ");
                                stringBuffer.append(clsLoadClass.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(m25157y(classLoader));
                                m25154v(stringBuffer.toString());
                            }
                        } else if (m25152t()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Factory class ");
                            stringBuffer2.append(clsLoadClass.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(m25157y(clsLoadClass.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            Class clsM25134b2 = f21763e;
                            if (clsM25134b2 == null) {
                                clsM25134b2 = m25134b("org.apache.commons.logging.LogFactory");
                                f21763e = clsM25134b2;
                            }
                            stringBuffer2.append(clsM25134b2.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            m25154v(stringBuffer2.toString());
                            m25155w("[BAD CL TREE] ", classLoader);
                        }
                        tq.m50332a(clsLoadClass.newInstance());
                        return null;
                    } catch (ClassCastException unused) {
                        if (classLoader == f21761c) {
                            boolean zM25150r = m25150r(clsLoadClass);
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("The application has specified that a custom LogFactory implementation ");
                            stringBuffer3.append("should be used but Class '");
                            stringBuffer3.append(str);
                            stringBuffer3.append("' cannot be converted to '");
                            Class clsM25134b3 = f21763e;
                            if (clsM25134b3 == null) {
                                clsM25134b3 = m25134b("org.apache.commons.logging.LogFactory");
                                f21763e = clsM25134b3;
                            }
                            stringBuffer3.append(clsM25134b3.getName());
                            stringBuffer3.append("'. ");
                            if (zM25150r) {
                                stringBuffer3.append("The conflict is caused by the presence of multiple LogFactory classes ");
                                stringBuffer3.append("in incompatible classloaders. ");
                                stringBuffer3.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                                stringBuffer3.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                                stringBuffer3.append("that the container has set one without your knowledge. ");
                                stringBuffer3.append("In this case, consider using the commons-logging-adapters.jar file or ");
                                stringBuffer3.append("specifying the standard LogFactory from the command line. ");
                            } else {
                                stringBuffer3.append("Please check the custom implementation. ");
                            }
                            stringBuffer3.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                            if (m25152t()) {
                                m25154v(stringBuffer3.toString());
                            }
                            throw new ClassCastException(stringBuffer3.toString());
                        }
                        if (m25152t()) {
                        }
                        cls2 = Class.forName(str);
                        tq.m50332a(cls2.newInstance());
                        return null;
                    } catch (ClassNotFoundException e) {
                        e = e;
                        if (classLoader == f21761c) {
                            if (m25152t()) {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("Unable to locate any class called '");
                                stringBuffer4.append(str);
                                stringBuffer4.append("' via classloader ");
                                stringBuffer4.append(m25157y(classLoader));
                                m25154v(stringBuffer4.toString());
                            }
                            throw e;
                        }
                        if (m25152t()) {
                        }
                        cls2 = Class.forName(str);
                        tq.m50332a(cls2.newInstance());
                        return null;
                    } catch (NoClassDefFoundError e2) {
                        e = e2;
                        if (classLoader == f21761c) {
                            if (m25152t()) {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append("Class '");
                                stringBuffer5.append(str);
                                stringBuffer5.append("' cannot be loaded");
                                stringBuffer5.append(" via classloader ");
                                stringBuffer5.append(m25157y(classLoader));
                                stringBuffer5.append(" - it depends on some other class that cannot be found.");
                                m25154v(stringBuffer5.toString());
                            }
                            throw e;
                        }
                        if (m25152t()) {
                        }
                        cls2 = Class.forName(str);
                        tq.m50332a(cls2.newInstance());
                        return null;
                    }
                } catch (ClassCastException unused2) {
                    clsLoadClass = null;
                } catch (ClassNotFoundException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                    if (m25152t()) {
                    }
                    if (cls3 != null) {
                    }
                    return new via(e);
                } catch (NoClassDefFoundError e5) {
                    e = e5;
                }
            }
            if (m25152t()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Unable to load factory class via classloader ");
                stringBuffer6.append(m25157y(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                m25154v(stringBuffer6.toString());
            }
            cls2 = Class.forName(str);
        } catch (Exception e6) {
            e = e6;
            cls3 = cls;
        }
        try {
            tq.m50332a(cls2.newInstance());
            return null;
        } catch (Exception e7) {
            cls3 = cls2;
            e = e7;
            if (m25152t()) {
                m25154v("Unable to create LogFactory instance.");
            }
            if (cls3 != null) {
                Class clsM25134b4 = f21763e;
                if (clsM25134b4 == null) {
                    clsM25134b4 = m25134b("org.apache.commons.logging.LogFactory");
                    f21763e = clsM25134b4;
                }
                if (!clsM25134b4.isAssignableFrom(cls3)) {
                    return new via("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e);
                }
            }
            return new via(e);
        }
    }

    /* renamed from: d */
    public static final Hashtable m25136d() {
        String strM25148p;
        Hashtable hashtable = null;
        try {
            strM25148p = m25148p("org.apache.commons.logging.LogFactory.HashtableImpl", null);
        } catch (SecurityException unused) {
            strM25148p = null;
        }
        if (strM25148p == null) {
            strM25148p = "org.apache.commons.logging.impl.WeakHashtable";
        }
        try {
            hashtable = (Hashtable) Class.forName(strM25148p).newInstance();
        } catch (Throwable th) {
            m25149q(th);
            if (!"org.apache.commons.logging.impl.WeakHashtable".equals(strM25148p)) {
                if (m25152t()) {
                    m25154v("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    /* renamed from: e */
    public static ClassLoader m25137e() {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static eja m25138f(ClassLoader classLoader) {
        if (classLoader == null) {
            return null;
        }
        tq.m50332a(f21762d.get(classLoader));
        return null;
    }

    /* renamed from: g */
    public static ClassLoader m25139g(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (m25152t()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                m25154v(stringBuffer.toString());
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Properties m25140h(ClassLoader classLoader, String str) {
        URL url;
        Enumeration enumerationM25147o;
        Properties properties = null;
        try {
            enumerationM25147o = m25147o(classLoader, str);
        } catch (SecurityException unused) {
            url = null;
        }
        if (enumerationM25147o == null) {
            return null;
        }
        url = null;
        double d = 0.0d;
        while (enumerationM25147o.hasMoreElements()) {
            try {
                URL url2 = (URL) enumerationM25147o.nextElement();
                Properties propertiesM25145m = m25145m(url2);
                if (propertiesM25145m != null) {
                    if (properties == null) {
                        try {
                            String property = propertiesM25145m.getProperty("priority");
                            d = property != null ? Double.parseDouble(property) : 0.0d;
                            if (m25152t()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("[LOOKUP] Properties file found at '");
                                stringBuffer.append(url2);
                                stringBuffer.append("'");
                                stringBuffer.append(" with priority ");
                                stringBuffer.append(d);
                                m25154v(stringBuffer.toString());
                            }
                            url = url2;
                            properties = propertiesM25145m;
                        } catch (SecurityException unused2) {
                            url = url2;
                            properties = propertiesM25145m;
                            if (m25152t()) {
                                m25154v("SecurityException thrown while trying to find/read config files.");
                            }
                            if (m25152t()) {
                            }
                            return properties;
                        }
                    } else {
                        String property2 = propertiesM25145m.getProperty("priority");
                        double d2 = property2 != null ? Double.parseDouble(property2) : 0.0d;
                        if (d2 > d) {
                            if (m25152t()) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("[LOOKUP] Properties file at '");
                                stringBuffer2.append(url2);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d2);
                                stringBuffer2.append(" overrides file at '");
                                stringBuffer2.append(url);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d);
                                m25154v(stringBuffer2.toString());
                            }
                            url = url2;
                            properties = propertiesM25145m;
                            d = d2;
                        } else if (m25152t()) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("[LOOKUP] Properties file at '");
                            stringBuffer3.append(url2);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d2);
                            stringBuffer3.append(" does not override file at '");
                            stringBuffer3.append(url);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d);
                            m25154v(stringBuffer3.toString());
                        }
                    }
                }
            } catch (SecurityException unused3) {
            }
        }
        if (m25152t()) {
            if (properties == null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] No properties file of name '");
                stringBuffer4.append(str);
                stringBuffer4.append("' found.");
                m25154v(stringBuffer4.toString());
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[LOOKUP] Properties file of name '");
                stringBuffer5.append(str);
                stringBuffer5.append("' found at '");
                stringBuffer5.append(url);
                stringBuffer5.append(TokenParser.DQUOTE);
                m25154v(stringBuffer5.toString());
            }
        }
        return properties;
    }

    /* renamed from: i */
    public static ClassLoader m25141i() {
        return (ClassLoader) AccessController.doPrivileged(new yia());
    }

    /* renamed from: j */
    public static eja m25142j() throws IOException {
        BufferedReader bufferedReader;
        String property;
        ClassLoader classLoaderM25141i = m25141i();
        if (classLoaderM25141i == null && m25152t()) {
            m25154v("Context classloader is null.");
        }
        m25138f(classLoaderM25141i);
        if (m25152t()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(m25157y(classLoaderM25141i));
            m25154v(stringBuffer.toString());
            m25155w("[LOOKUP] ", classLoaderM25141i);
        }
        Properties propertiesM25140h = m25140h(classLoaderM25141i, "commons-logging.properties");
        ClassLoader classLoader = (propertiesM25140h == null || (property = propertiesM25140h.getProperty("use_tccl")) == null || Boolean.valueOf(property).booleanValue()) ? classLoaderM25141i : f21761c;
        if (m25152t()) {
            m25154v("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String strM25148p = m25148p("org.apache.commons.logging.LogFactory", null);
            if (strM25148p != null) {
                if (m25152t()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(strM25148p);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append("org.apache.commons.logging.LogFactory");
                    m25154v(stringBuffer2.toString());
                }
                m25156x(strM25148p, classLoader, classLoaderM25141i);
            } else if (m25152t()) {
                m25154v("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e) {
            if (m25152t()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(m25158z(e.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                m25154v(stringBuffer3.toString());
            }
        } catch (RuntimeException e2) {
            if (m25152t()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(m25158z(e2.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                m25154v(stringBuffer4.toString());
            }
            throw e2;
        }
        if (m25152t()) {
            m25154v("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            InputStream inputStreamM25146n = m25146n(classLoaderM25141i, "META-INF/services/org.apache.commons.logging.LogFactory");
            if (inputStreamM25146n != null) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM25146n, HTTP.UTF_8));
                } catch (UnsupportedEncodingException unused) {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM25146n));
                }
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && !"".equals(line)) {
                    if (m25152t()) {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                        stringBuffer5.append(line);
                        stringBuffer5.append(" as specified by file '");
                        stringBuffer5.append("META-INF/services/org.apache.commons.logging.LogFactory");
                        stringBuffer5.append("' which was present in the path of the context classloader.");
                        m25154v(stringBuffer5.toString());
                    }
                    m25156x(line, classLoader, classLoaderM25141i);
                }
            } else if (m25152t()) {
                m25154v("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
            }
        } catch (Exception e3) {
            if (m25152t()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer6.append(m25158z(e3.getMessage()));
                stringBuffer6.append("]. Trying alternative implementations...");
                m25154v(stringBuffer6.toString());
            }
        }
        if (propertiesM25140h != null) {
            if (m25152t()) {
                m25154v("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
            }
            String property2 = propertiesM25140h.getProperty("org.apache.commons.logging.LogFactory");
            if (property2 != null) {
                if (m25152t()) {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                    stringBuffer7.append(property2);
                    stringBuffer7.append("'");
                    m25154v(stringBuffer7.toString());
                }
                m25156x(property2, classLoader, classLoaderM25141i);
            } else if (m25152t()) {
                m25154v("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
            }
        } else if (m25152t()) {
            m25154v("[LOOKUP] No properties file available to determine LogFactory subclass from..");
        }
        if (m25152t()) {
            m25154v("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
        }
        m25156x("org.apache.commons.logging.impl.LogFactoryImpl", f21761c, classLoaderM25141i);
        return null;
    }

    /* renamed from: k */
    public static sia m25143k(Class cls) {
        m25142j();
        throw null;
    }

    /* renamed from: l */
    public static sia m25144l(String str) throws IOException {
        m25142j();
        throw null;
    }

    /* renamed from: m */
    public static Properties m25145m(URL url) {
        return (Properties) AccessController.doPrivileged(new cja(url));
    }

    /* renamed from: n */
    public static InputStream m25146n(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new aja(classLoader, str));
    }

    /* renamed from: o */
    public static Enumeration m25147o(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new bja(classLoader, str));
    }

    /* renamed from: p */
    public static String m25148p(String str, String str2) {
        return (String) AccessController.doPrivileged(new dja(str, str2));
    }

    /* renamed from: q */
    public static void m25149q(Throwable th) {
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
    }

    /* renamed from: r */
    public static boolean m25150r(Class cls) {
        boolean zIsAssignableFrom = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    m25154v("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    m25155w("[CUSTOM LOG FACTORY] ", classLoader);
                    zIsAssignableFrom = Class.forName("o.eja", false, classLoader).isAssignableFrom(cls);
                    if (zIsAssignableFrom) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        m25154v(stringBuffer.toString());
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        m25154v(stringBuffer2.toString());
                    }
                }
            } catch (ClassNotFoundException unused) {
                m25154v("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                m25154v(stringBuffer3.toString());
            } catch (SecurityException e2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                m25154v(stringBuffer4.toString());
            }
        }
        return zIsAssignableFrom;
    }

    /* renamed from: s */
    public static PrintStream m25151s() {
        try {
            String strM25148p = m25148p("org.apache.commons.logging.diagnostics.dest", null);
            if (strM25148p == null) {
                return null;
            }
            return strM25148p.equals("STDOUT") ? System.out : strM25148p.equals("STDERR") ? System.err : new PrintStream(new FileOutputStream(strM25148p, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static boolean m25152t() {
        return f21759a != null;
    }

    /* renamed from: u */
    public static void m25153u(Class cls) {
        if (m25152t()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                m25154v(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                m25154v(stringBuffer2.toString());
            } catch (SecurityException unused) {
                m25154v("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoaderM25139g = m25139g(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(m25157y(classLoaderM25139g));
                m25154v(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                m25155w(stringBuffer4.toString(), classLoaderM25139g);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                m25154v(stringBuffer5.toString());
            }
        }
    }

    /* renamed from: v */
    public static final void m25154v(String str) {
        PrintStream printStream = f21759a;
        if (printStream != null) {
            printStream.print(f21760b);
            f21759a.println(str);
            f21759a.flush();
        }
    }

    /* renamed from: w */
    public static void m25155w(String str, ClassLoader classLoader) {
        if (m25152t()) {
            if (classLoader != null) {
                String string = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(m25157y(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(string);
                stringBuffer.append("'");
                m25154v(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(m25157y(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    m25154v(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                m25154v(stringBuffer4.toString());
            }
        }
    }

    /* renamed from: x */
    public static eja m25156x(String str, ClassLoader classLoader, ClassLoader classLoader2) {
        Object objDoPrivileged = AccessController.doPrivileged(new zia(str, classLoader));
        if (objDoPrivileged instanceof via) {
            via viaVar = (via) objDoPrivileged;
            if (!m25152t()) {
                throw viaVar;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("An error occurred while loading the factory class:");
            stringBuffer.append(viaVar.getMessage());
            m25154v(stringBuffer.toString());
            throw viaVar;
        }
        if (m25152t()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(m25157y(objDoPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(m25157y(classLoader2));
            m25154v(stringBuffer2.toString());
        }
        tq.m50332a(objDoPrivileged);
        return null;
    }

    /* renamed from: y */
    public static String m25157y(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    /* renamed from: z */
    public static String m25158z(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }
}
