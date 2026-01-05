package jakarta.mail;

import com.sun.mail.util.DefaultProvider;
import com.sun.mail.util.MailLogger;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import zj.C8986c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: k */
    public static c0 f19285k;

    /* renamed from: l */
    public static final String f19286l;

    /* renamed from: a */
    public final Properties f19287a;

    /* renamed from: b */
    public final AbstractC3634b f19288b;

    /* renamed from: d */
    public final boolean f19290d;

    /* renamed from: e */
    public final MailLogger f19291e;

    /* renamed from: j */
    public final RunnableC3648f f19296j;

    /* renamed from: c */
    public final Hashtable f19289c = new Hashtable();

    /* renamed from: f */
    public final ArrayList f19292f = new ArrayList();

    /* renamed from: g */
    public final HashMap f19293g = new HashMap();

    /* renamed from: h */
    public final HashMap f19294h = new HashMap();

    /* renamed from: i */
    public final Properties f19295i = new Properties();

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C3696x(0));
        } catch (Exception unused) {
            str = null;
        }
        f19286l = str;
    }

    public c0(Properties properties, AbstractC3634b abstractC3634b) throws Throwable {
        MailLogger mailLogger;
        this.f19290d = false;
        this.f19287a = properties;
        this.f19288b = abstractC3634b;
        if (Boolean.valueOf(properties.getProperty("mail.debug")).booleanValue()) {
            this.f19290d = true;
        }
        synchronized (this) {
            mailLogger = new MailLogger((Class<?>) c0.class, "DEBUG", this.f19290d, m8182c());
            this.f19291e = mailLogger;
        }
        mailLogger.log(Level.CONFIG, "Jakarta Mail version {0}", "2.0.1");
        Class cls = abstractC3634b != null ? abstractC3634b.getClass() : c0.class;
        C8986c c8986c = new C8986c(26, this);
        try {
            String str = f19286l;
            if (str != null) {
                m8188k(str.concat("javamail.providers"), c8986c);
            }
        } catch (SecurityException unused) {
        }
        Iterator it = ServiceLoader.load(C3688t.class).iterator();
        while (it.hasNext()) {
            C3688t c3688t = (C3688t) it.next();
            if (!c3688t.getClass().isAnnotationPresent(DefaultProvider.class)) {
                m8180a(c3688t);
            }
        }
        m8187j("META-INF/javamail.providers", cls, c8986c);
        m8189l("/META-INF/javamail.default.providers", cls, c8986c, false);
        Iterator it2 = ServiceLoader.load(C3688t.class).iterator();
        while (it2.hasNext()) {
            C3688t c3688t2 = (C3688t) it2.next();
            if (c3688t2.getClass().isAnnotationPresent(DefaultProvider.class)) {
                m8180a(c3688t2);
            }
        }
        if (this.f19292f.size() == 0) {
            this.f19291e.config("failed to load any providers, using defaults");
            C3687s c3687s = C3687s.f19417b;
            m8180a(new C3688t(c3687s, "imap", "com.sun.mail.imap.IMAPStore", "Oracle", "2.0.1"));
            m8180a(new C3688t(c3687s, "imaps", "com.sun.mail.imap.IMAPSSLStore", "Oracle", "2.0.1"));
            m8180a(new C3688t(c3687s, "pop3", "com.sun.mail.pop3.POP3Store", "Oracle", "2.0.1"));
            m8180a(new C3688t(c3687s, "pop3s", "com.sun.mail.pop3.POP3SSLStore", "Oracle", "2.0.1"));
            C3687s c3687s2 = C3687s.f19418c;
            m8180a(new C3688t(c3687s2, "smtp", "com.sun.mail.smtp.SMTPTransport", "Oracle", "2.0.1"));
            m8180a(new C3688t(c3687s2, "smtps", "com.sun.mail.smtp.SMTPSSLTransport", "Oracle", "2.0.1"));
        }
        if (this.f19291e.isLoggable(Level.CONFIG)) {
            this.f19291e.config("Tables of loaded providers");
            this.f19291e.config("Providers Listed By Class Name: " + this.f19294h.toString());
            this.f19291e.config("Providers Listed By Protocol: " + this.f19293g.toString());
        }
        Properties properties2 = this.f19295i;
        C8989c c8989c = new C8989c(25, this);
        m8189l("/META-INF/javamail.default.address.map", cls, c8989c, true);
        m8187j("META-INF/javamail.address.map", cls, c8989c);
        try {
            String str2 = f19286l;
            if (str2 != null) {
                m8188k(str2 + "javamail.address.map", c8989c);
            }
        } catch (SecurityException unused2) {
        }
        if (properties2.isEmpty()) {
            this.f19291e.config("failed to load address map, using defaults");
            properties2.put("rfc822", "smtp");
        }
        this.f19296j = new RunnableC3648f((Executor) properties.get("mail.event.executor"));
    }

    /* renamed from: d */
    public static synchronized c0 m8177d(Properties properties) {
        try {
            c0 c0Var = f19285k;
            if (c0Var == null) {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    securityManager.checkSetFactory();
                }
                f19285k = new c0(properties, null);
            } else if (c0Var.f19288b != null) {
                throw new SecurityException("Access to default session denied");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f19285k;
    }

    /* renamed from: f */
    public static InputStream m8178f(Class cls, String str) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new C3697y(cls, str, 0));
        } catch (PrivilegedActionException e2) {
            throw ((IOException) e2.getException());
        }
    }

    /* renamed from: m */
    public static InputStream m8179m(URL url) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new b0(url, 0));
        } catch (PrivilegedActionException e2) {
            throw ((IOException) e2.getException());
        }
    }

    /* renamed from: a */
    public final synchronized void m8180a(C3688t c3688t) {
        this.f19292f.add(c3688t);
        this.f19294h.put(c3688t.getClassName(), c3688t);
        if (!this.f19293g.containsKey(c3688t.getProtocol())) {
            this.f19293g.put(c3688t.getProtocol(), c3688t);
        }
    }

    /* renamed from: b */
    public final synchronized boolean m8181b() {
        return this.f19290d;
    }

    /* renamed from: c */
    public final synchronized PrintStream m8182c() {
        return System.out;
    }

    /* renamed from: e */
    public final void m8183e(String str) {
        this.f19287a.getProperty(str);
    }

    /* renamed from: g */
    public final f0 m8184g() {
        String property = this.f19287a.getProperty("mail.transport.protocol");
        if (property != null) {
            return m8186i(property);
        }
        String str = (String) this.f19295i.get("rfc822");
        return str != null ? m8186i(str) : m8186i("smtp");
    }

    /* renamed from: h */
    public final f0 m8185h(AbstractC3633a abstractC3633a) throws NoSuchProviderException {
        String property = this.f19287a.getProperty("mail.transport.protocol." + abstractC3633a.getType());
        if (property != null) {
            return m8186i(property);
        }
        String str = (String) this.f19295i.get(abstractC3633a.getType());
        if (str != null) {
            return m8186i(str);
        }
        throw new NoSuchProviderException("No provider for Address type: " + abstractC3633a.getType());
    }

    /* renamed from: i */
    public final f0 m8186i(String str) throws NoSuchProviderException, ClassNotFoundException {
        Class<?> cls;
        C3688t c3688t;
        h0 h0Var = new h0(-1, str, null, null, null, null);
        synchronized (this) {
            try {
                if (str.length() <= 0) {
                    throw new NoSuchProviderException("Invalid protocol: null");
                }
                String property = this.f19287a.getProperty("mail." + str + ".class");
                cls = null;
                if (property != null) {
                    if (this.f19291e.isLoggable(Level.FINE)) {
                        this.f19291e.fine("mail." + str + ".class property exists and points to " + property);
                    }
                    c3688t = (C3688t) this.f19294h.get(property);
                } else {
                    c3688t = null;
                }
                if (c3688t == null) {
                    c3688t = (C3688t) this.f19293g.get(str);
                    if (c3688t == null) {
                        throw new NoSuchProviderException("No provider for ".concat(str));
                    }
                    if (this.f19291e.isLoggable(Level.FINE)) {
                        this.f19291e.fine("getProvider() returning " + c3688t.toString());
                    }
                }
            } finally {
            }
        }
        if (c3688t.getType() != C3687s.f19418c) {
            throw new NoSuchProviderException("invalid provider");
        }
        AbstractC3634b abstractC3634b = this.f19288b;
        ClassLoader classLoader = abstractC3634b != null ? abstractC3634b.getClass().getClassLoader() : c0.class.getClassLoader();
        try {
            try {
                ClassLoader classLoader2 = (ClassLoader) AccessController.doPrivileged(new C3696x(1));
                if (classLoader2 != null) {
                    try {
                        cls = Class.forName(c3688t.getClassName(), false, classLoader2);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                if (cls == null || !f0.class.isAssignableFrom(cls)) {
                    cls = Class.forName(c3688t.getClassName(), false, classLoader);
                }
            } catch (Exception e2) {
                this.f19291e.log(Level.FINE, "Exception loading provider", (Throwable) e2);
                throw new NoSuchProviderException(c3688t.getProtocol());
            }
        } catch (Exception unused2) {
            cls = Class.forName(c3688t.getClassName());
            if (!f0.class.isAssignableFrom(cls)) {
                throw new ClassCastException(f0.class.getName() + " " + cls.getName());
            }
        }
        if (f0.class.isAssignableFrom(cls)) {
            try {
                return (f0) ((AbstractC3695w) f0.class.cast(cls.getConstructor(c0.class, h0.class).newInstance(this, h0Var)));
            } catch (Exception e10) {
                this.f19291e.log(Level.FINE, "Exception loading provider", (Throwable) e10);
                throw new NoSuchProviderException(c3688t.getProtocol());
            }
        }
        throw new ClassCastException(f0.class.getName() + " " + cls.getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8187j(java.lang.String r11, java.lang.Class r12, jakarta.mail.e0 r13) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "Exception loading resource"
            r1 = 0
            jakarta.mail.x r2 = new jakarta.mail.x     // Catch: java.lang.Exception -> L16
            r3 = 1
            r2.<init>(r3)     // Catch: java.lang.Exception -> L16
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.Exception -> L16
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch: java.lang.Exception -> L16
            if (r2 != 0) goto L1a
            java.lang.ClassLoader r2 = r12.getClassLoader()     // Catch: java.lang.Exception -> L16
            goto L1a
        L16:
            r2 = move-exception
            r4 = r1
            goto L91
        L1a:
            if (r2 == 0) goto L29
            jakarta.mail.z r3 = new jakarta.mail.z     // Catch: java.lang.Exception -> L16
            r4 = 0
            r3.<init>(r2, r11, r4)     // Catch: java.lang.Exception -> L16
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r3)     // Catch: java.lang.Exception -> L16
            java.net.URL[] r2 = (java.net.URL[]) r2     // Catch: java.lang.Exception -> L16
            goto L35
        L29:
            jakarta.mail.a0 r2 = new jakarta.mail.a0     // Catch: java.lang.Exception -> L16
            r3 = 0
            r2.<init>(r11, r3)     // Catch: java.lang.Exception -> L16
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.Exception -> L16
            java.net.URL[] r2 = (java.net.URL[]) r2     // Catch: java.lang.Exception -> L16
        L35:
            if (r2 == 0) goto L8f
            r3 = r1
            r4 = r3
        L39:
            int r5 = r2.length     // Catch: java.lang.Exception -> L6d
            if (r3 >= r5) goto L98
            r5 = r2[r3]     // Catch: java.lang.Exception -> L6d
            com.sun.mail.util.MailLogger r6 = r10.f19291e     // Catch: java.lang.Exception -> L6d
            java.util.logging.Level r7 = java.util.logging.Level.CONFIG     // Catch: java.lang.Exception -> L6d
            java.lang.String r8 = "URL {0}"
            r6.log(r7, r8, r5)     // Catch: java.lang.Exception -> L6d
            r6 = 0
            java.io.InputStream r6 = m8179m(r5)     // Catch: java.lang.Throwable -> L5a java.lang.SecurityException -> L5c java.io.IOException -> L5e java.io.FileNotFoundException -> L89
            if (r6 == 0) goto L60
            r13.mo8190T(r6)     // Catch: java.lang.Throwable -> L5a java.lang.SecurityException -> L5c java.io.IOException -> L5e java.io.FileNotFoundException -> L89
            r4 = 1
            com.sun.mail.util.MailLogger r8 = r10.f19291e     // Catch: java.lang.Throwable -> L5a java.lang.SecurityException -> L5c java.io.IOException -> L5e java.io.FileNotFoundException -> L89
            java.lang.String r9 = "successfully loaded resource: {0}"
            r8.log(r7, r9, r5)     // Catch: java.lang.Throwable -> L5a java.lang.SecurityException -> L5c java.io.IOException -> L5e java.io.FileNotFoundException -> L89
            goto L67
        L5a:
            r2 = move-exception
            goto L83
        L5c:
            r5 = move-exception
            goto L6f
        L5e:
            r5 = move-exception
            goto L79
        L60:
            com.sun.mail.util.MailLogger r8 = r10.f19291e     // Catch: java.lang.Throwable -> L5a java.lang.SecurityException -> L5c java.io.IOException -> L5e java.io.FileNotFoundException -> L89
            java.lang.String r9 = "not loading resource: {0}"
            r8.log(r7, r9, r5)     // Catch: java.lang.Throwable -> L5a java.lang.SecurityException -> L5c java.io.IOException -> L5e java.io.FileNotFoundException -> L89
        L67:
            if (r6 == 0) goto L8c
        L69:
            r6.close()     // Catch: java.lang.Exception -> L6d java.io.IOException -> L8c
            goto L8c
        L6d:
            r2 = move-exception
            goto L91
        L6f:
            com.sun.mail.util.MailLogger r7 = r10.f19291e     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG     // Catch: java.lang.Throwable -> L5a
            r7.log(r8, r0, r5)     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L8c
            goto L69
        L79:
            com.sun.mail.util.MailLogger r7 = r10.f19291e     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG     // Catch: java.lang.Throwable -> L5a
            r7.log(r8, r0, r5)     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L8c
            goto L69
        L83:
            if (r6 == 0) goto L88
            r6.close()     // Catch: java.lang.Exception -> L6d java.io.IOException -> L88
        L88:
            throw r2     // Catch: java.lang.Exception -> L6d
        L89:
            if (r6 == 0) goto L8c
            goto L69
        L8c:
            int r3 = r3 + 1
            goto L39
        L8f:
            r4 = r1
            goto L98
        L91:
            com.sun.mail.util.MailLogger r3 = r10.f19291e
            java.util.logging.Level r5 = java.util.logging.Level.CONFIG
            r3.log(r5, r0, r2)
        L98:
            if (r4 != 0) goto La3
            java.lang.String r0 = "/"
            java.lang.String r11 = r0.concat(r11)
            r10.m8189l(r11, r12, r13, r1)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.c0.m8187j(java.lang.String, java.lang.Class, jakarta.mail.e0):void");
    }

    /* renamed from: k */
    public final void m8188k(String str, e0 e0Var) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
                } catch (IOException unused) {
                    return;
                }
            } catch (FileNotFoundException unused2) {
            } catch (IOException e2) {
                e = e2;
            } catch (SecurityException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            e0Var.mo8190T(bufferedInputStream);
            this.f19291e.log(Level.CONFIG, "successfully loaded file: {0}", str);
            bufferedInputStream.close();
        } catch (FileNotFoundException unused3) {
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 == null) {
                return;
            }
            bufferedInputStream2.close();
        } catch (IOException e11) {
            e = e11;
            bufferedInputStream2 = bufferedInputStream;
            MailLogger mailLogger = this.f19291e;
            Level level = Level.CONFIG;
            if (mailLogger.isLoggable(level)) {
                this.f19291e.log(level, "not loading file: " + str, (Throwable) e);
            }
            if (bufferedInputStream2 == null) {
                return;
            }
            bufferedInputStream2.close();
        } catch (SecurityException e12) {
            e = e12;
            bufferedInputStream2 = bufferedInputStream;
            MailLogger mailLogger2 = this.f19291e;
            Level level2 = Level.CONFIG;
            if (mailLogger2.isLoggable(level2)) {
                this.f19291e.log(level2, "not loading file: " + str, (Throwable) e);
            }
            if (bufferedInputStream2 == null) {
                return;
            }
            bufferedInputStream2.close();
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* renamed from: l */
    public final void m8189l(String str, Class cls, e0 e0Var, boolean z6) throws IOException {
        InputStream inputStream = null;
        try {
            try {
                try {
                    InputStream inputStreamM8178f = m8178f(cls, str);
                    if (inputStreamM8178f != null) {
                        e0Var.mo8190T(inputStreamM8178f);
                        this.f19291e.log(Level.CONFIG, "successfully loaded resource: {0}", str);
                    } else if (z6) {
                        this.f19291e.log(Level.WARNING, "expected resource not found: {0}", str);
                    }
                    if (inputStreamM8178f != null) {
                        inputStreamM8178f.close();
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException e2) {
                this.f19291e.log(Level.CONFIG, "Exception loading resource", (Throwable) e2);
                if (0 == 0) {
                    return;
                }
                inputStream.close();
            } catch (SecurityException e10) {
                this.f19291e.log(Level.CONFIG, "Exception loading resource", (Throwable) e10);
                if (0 == 0) {
                    return;
                }
                inputStream.close();
            }
        } catch (IOException unused2) {
        }
    }
}
