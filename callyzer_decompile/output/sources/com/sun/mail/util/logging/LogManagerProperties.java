package com.sun.mail.util.logging;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
final class LogManagerProperties extends Properties {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object LOG_MANAGER;
    private static final Method LR_GET_INSTANT;
    private static volatile String[] REFLECT_NAMES = null;
    private static final Method ZDT_OF_INSTANT;
    private static final Method ZI_SYSTEM_DEFAULT;
    private static final long serialVersionUID = -2239983349056806252L;
    private final String prefix;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[PHI: r0 r2 r3
      0x0051: PHI (r0v13 java.lang.reflect.Method) = 
      (r0v7 java.lang.reflect.Method)
      (r0v8 java.lang.reflect.Method)
      (r0v9 java.lang.reflect.Method)
      (r0v26 java.lang.reflect.Method)
     binds: [B:46:0x00ae, B:50:0x00b5, B:42:0x00a7, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r2v7 java.lang.reflect.Method) = 
      (r2v4 java.lang.reflect.Method)
      (r2v5 java.lang.reflect.Method)
      (r2v6 java.lang.reflect.Method)
      (r2v9 java.lang.reflect.Method)
     binds: [B:46:0x00ae, B:50:0x00b5, B:42:0x00a7, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r3v10 java.lang.reflect.Method) = 
      (r3v5 java.lang.reflect.Method)
      (r3v6 java.lang.reflect.Method)
      (r3v7 java.lang.reflect.Method)
      (r3v17 java.lang.reflect.Method)
     binds: [B:46:0x00ae, B:50:0x00b5, B:42:0x00a7, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    static {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.LogManagerProperties.<clinit>():void");
    }

    public LogManagerProperties(Properties properties, String str) {
        super(properties);
        if (properties == null || str == null) {
            throw null;
        }
        this.prefix = str;
    }

    public static void checkLogManagerAccess() throws SecurityException {
        Object obj = LOG_MANAGER;
        boolean z6 = false;
        if (obj != null) {
            try {
                if (obj instanceof LogManager) {
                    z6 = true;
                    ((LogManager) obj).checkAccess();
                }
            } catch (LinkageError | RuntimeException unused) {
            } catch (SecurityException e2) {
                if (z6) {
                    throw e2;
                }
            }
        }
        if (z6) {
            return;
        }
        checkLoggingAccess();
    }

    private static void checkLoggingAccess() throws SecurityException {
        Logger logger = Logger.getLogger("global");
        try {
            if (Logger.class == logger.getClass()) {
                logger.removeHandler(null);
                return;
            }
        } catch (NullPointerException unused) {
        }
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new LoggingPermission("control", null));
        }
    }

    private Properties exportCopy(Properties properties) {
        Thread.holdsLock(this);
        Properties properties2 = new Properties(properties);
        properties2.putAll(this);
        return properties2;
    }

    private static Class<?> findClass(String str) {
        ClassLoader[] classLoaders = getClassLoaders();
        ClassLoader classLoader = classLoaders[0];
        if (classLoader == null) {
            return tryLoad(str, classLoaders[1]);
        }
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return tryLoad(str, classLoaders[1]);
        }
    }

    public static String fromLogManager(String str) {
        str.getClass();
        Object obj = LOG_MANAGER;
        try {
            if (obj instanceof Properties) {
                return ((Properties) obj).getProperty(str);
            }
        } catch (RuntimeException unused) {
        }
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof LogManager) {
                return ((LogManager) obj).getProperty(str);
            }
            return null;
        } catch (LinkageError | RuntimeException unused2) {
            return null;
        }
    }

    private static ClassLoader[] getClassLoaders() {
        return (ClassLoader[]) AccessController.doPrivileged(new PrivilegedAction<ClassLoader[]>() { // from class: com.sun.mail.util.logging.LogManagerProperties.1
            @Override // java.security.PrivilegedAction
            public ClassLoader[] run() {
                ClassLoader[] classLoaderArr = new ClassLoader[2];
                try {
                    classLoaderArr[0] = ClassLoader.getSystemClassLoader();
                } catch (SecurityException unused) {
                    classLoaderArr[0] = null;
                }
                try {
                    classLoaderArr[1] = Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused2) {
                    classLoaderArr[1] = null;
                }
                return classLoaderArr;
            }
        });
    }

    public static String getLocalHost(Object obj) throws Exception {
        try {
            Method method = obj.getClass().getMethod("getLocalHost", null);
            if (Modifier.isStatic(method.getModifiers()) || method.getReturnType() != String.class) {
                throw new NoSuchMethodException(method.toString());
            }
            return (String) method.invoke(obj, null);
        } catch (ExceptionInInitializerError e2) {
            throw wrapOrThrow(e2);
        } catch (InvocationTargetException e10) {
            throw paramOrError(e10);
        }
    }

    public static Comparable<?> getZonedDateTime(LogRecord logRecord) {
        logRecord.getClass();
        Method method = ZDT_OF_INSTANT;
        if (method != null) {
            try {
                return (Comparable) method.invoke(null, LR_GET_INSTANT.invoke(logRecord, null), ZI_SYSTEM_DEFAULT.invoke(null, null));
            } catch (RuntimeException | Exception unused) {
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new UndeclaredThrowableException(e2);
            }
        }
        return null;
    }

    public static boolean hasLogManager() {
        Object obj = LOG_MANAGER;
        return (obj == null || (obj instanceof Properties)) ? false : true;
    }

    public static boolean isReflectionClass(String str) throws Exception {
        String[] strArrReflectionClassNames = REFLECT_NAMES;
        if (strArrReflectionClassNames == null) {
            strArrReflectionClassNames = reflectionClassNames();
            REFLECT_NAMES = strArrReflectionClassNames;
        }
        for (String str2 : strArrReflectionClassNames) {
            if (str.equals(str2)) {
                return true;
            }
        }
        findClass(str);
        return false;
    }

    public static boolean isStaticUtilityClass(String str) throws SecurityException {
        Class<?> clsFindClass = findClass(str);
        if (clsFindClass != Object.class) {
            Method[] methods = clsFindClass.getMethods();
            if (methods.length != 0) {
                for (Method method : methods) {
                    if (method.getDeclaringClass() != Object.class && !Modifier.isStatic(method.getModifiers())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static Object loadLogManager() {
        try {
            return LogManager.getLogManager();
        } catch (LinkageError unused) {
            return readConfiguration();
        } catch (RuntimeException unused2) {
            return readConfiguration();
        }
    }

    public static Comparator<? super LogRecord> newComparator(String str) {
        return (Comparator) newObjectFrom(str, Comparator.class);
    }

    public static ErrorManager newErrorManager(String str) {
        return (ErrorManager) newObjectFrom(str, ErrorManager.class);
    }

    public static Filter newFilter(String str) {
        return (Filter) newObjectFrom(str, Filter.class);
    }

    public static Formatter newFormatter(String str) {
        return (Formatter) newObjectFrom(str, Formatter.class);
    }

    public static <T> T newObjectFrom(String str, Class<T> cls) throws Exception {
        try {
            Class<?> clsFindClass = findClass(str);
            if (cls.isAssignableFrom(clsFindClass)) {
                try {
                    return cls.cast(clsFindClass.getConstructor(null).newInstance(null));
                } catch (InvocationTargetException e2) {
                    throw paramOrError(e2);
                }
            }
            throw new ClassCastException(clsFindClass.getName() + " cannot be cast to " + cls.getName());
        } catch (ExceptionInInitializerError e10) {
            throw wrapOrThrow(e10);
        } catch (NoClassDefFoundError e11) {
            throw new ClassNotFoundException(e11.toString(), e11);
        }
    }

    private static Exception paramOrError(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause == null || (!(cause instanceof VirtualMachineError) && !(cause instanceof ThreadDeath))) {
            return invocationTargetException;
        }
        throw ((Error) cause);
    }

    public static long parseDurationToMillis(CharSequence charSequence) throws Exception {
        try {
            Class<?> clsFindClass = findClass("java.time.Duration");
            Method method = clsFindClass.getMethod("parse", CharSequence.class);
            if (!clsFindClass.isAssignableFrom(method.getReturnType()) || !Modifier.isStatic(method.getModifiers())) {
                throw new NoSuchMethodException(method.toString());
            }
            Method method2 = clsFindClass.getMethod("toMillis", null);
            if (!Long.TYPE.isAssignableFrom(method2.getReturnType()) || Modifier.isStatic(method2.getModifiers())) {
                throw new NoSuchMethodException(method2.toString());
            }
            return ((Long) method2.invoke(method.invoke(null, charSequence), null)).longValue();
        } catch (ExceptionInInitializerError e2) {
            throw wrapOrThrow(e2);
        } catch (InvocationTargetException e10) {
            throw paramOrError(e10);
        }
    }

    private Object preWrite(Object obj) {
        return get(obj);
    }

    private static Properties readConfiguration() throws IOException {
        Properties properties = new Properties();
        try {
            String property = System.getProperty("java.util.logging.config.file");
            if (property != null) {
                FileInputStream fileInputStream = new FileInputStream(new File(property).getCanonicalFile());
                try {
                    properties.load(fileInputStream);
                    return properties;
                } finally {
                    fileInputStream.close();
                }
            }
        } catch (RuntimeException | Exception | LinkageError unused) {
        }
        return properties;
    }

    private static String[] reflectionClassNames() throws Exception {
        try {
            HashSet hashSet = new HashSet();
            Throwable th2 = (Throwable) Throwable.class.getConstructor(null).newInstance(null);
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                if (LogManagerProperties.class.getName().equals(stackTraceElement.getClassName())) {
                    break;
                }
                hashSet.add(stackTraceElement.getClassName());
            }
            Throwable.class.getMethod("fillInStackTrace", null).invoke(th2, null);
            for (StackTraceElement stackTraceElement2 : th2.getStackTrace()) {
                if (LogManagerProperties.class.getName().equals(stackTraceElement2.getClassName())) {
                    break;
                }
                hashSet.add(stackTraceElement2.getClassName());
            }
            return (String[]) hashSet.toArray(new String[hashSet.size()]);
        } catch (InvocationTargetException e2) {
            throw paramOrError(e2);
        }
    }

    public static <T> Comparator<T> reverseOrder(Comparator<T> comparator) throws NoSuchMethodException, SecurityException, InvocationTargetException {
        comparator.getClass();
        Comparator<T> comparator2 = null;
        try {
            try {
                Method method = comparator.getClass().getMethod("reversed", null);
                if (!Modifier.isStatic(method.getModifiers()) && Comparator.class.isAssignableFrom(method.getReturnType())) {
                    try {
                        comparator2 = (Comparator) method.invoke(comparator, null);
                    } catch (ExceptionInInitializerError e2) {
                        throw wrapOrThrow(e2);
                    }
                }
            } catch (IllegalAccessException | NoSuchMethodException | RuntimeException unused) {
            }
        } catch (InvocationTargetException e10) {
            paramOrError(e10);
        }
        return comparator2 == null ? Collections.reverseOrder(comparator) : comparator2;
    }

    public static String toLanguageTag(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        char[] cArr = new char[variant.length() + country.length() + language.length() + 2];
        int length = language.length();
        language.getChars(0, length, cArr, 0);
        if (country.length() != 0 || (language.length() != 0 && variant.length() != 0)) {
            cArr[length] = '-';
            int i10 = length + 1;
            country.getChars(0, country.length(), cArr, i10);
            length = i10 + country.length();
        }
        if (variant.length() != 0 && (language.length() != 0 || country.length() != 0)) {
            cArr[length] = '-';
            int i11 = length + 1;
            variant.getChars(0, variant.length(), cArr, i11);
            length = i11 + variant.length();
        }
        return String.valueOf(cArr, 0, length);
    }

    private static Class<?> tryLoad(String str, ClassLoader classLoader) {
        return classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
    }

    private static InvocationTargetException wrapOrThrow(ExceptionInInitializerError exceptionInInitializerError) {
        if (exceptionInInitializerError.getCause() instanceof Error) {
            throw exceptionInInitializerError;
        }
        return new InvocationTargetException(exceptionInInitializerError);
    }

    private synchronized Object writeReplace() {
        return exportCopy((Properties) ((Properties) this).defaults.clone());
    }

    @Override // java.util.Hashtable
    public synchronized Object clone() {
        return exportCopy(((Properties) this).defaults);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    @Override // java.util.Hashtable, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean containsKey(java.lang.Object r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r3.getProperty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            r0 = r2
            goto L15
        L12:
            r4 = move-exception
            goto L29
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L27
            java.util.Properties r0 = r3.defaults     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L25
            boolean r4 = super.containsKey(r4)     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L26
        L25:
            r1 = r2
        L26:
            r0 = r1
        L27:
            monitor-exit(r3)
            return r0
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.LogManagerProperties.containsKey(java.lang.Object):boolean");
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Properties) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object get(Object obj) {
        Object property;
        try {
            property = obj instanceof String ? getProperty((String) obj) : null;
            if (property == null && (property = ((Properties) this).defaults.get(obj)) == null && !((Properties) this).defaults.containsKey(obj)) {
                property = super.get(obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return property;
    }

    @Override // java.util.Properties
    public synchronized String getProperty(String str) {
        String property;
        try {
            property = ((Properties) this).defaults.getProperty(str);
            if (property == null) {
                if (str.length() > 0) {
                    property = fromLogManager(this.prefix + '.' + str);
                }
                if (property == null) {
                    property = fromLogManager(str);
                }
                if (property != null) {
                    super.put(str, property);
                } else {
                    Object obj = super.get(str);
                    property = obj instanceof String ? (String) obj : null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return property;
    }

    @Override // java.util.Hashtable, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Properties
    public Enumeration<?> propertyNames() {
        return super.propertyNames();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object put(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return super.put(obj, obj2);
        }
        Object objPreWrite = preWrite(obj);
        Object objPut = super.put(obj, obj2);
        if (objPut != null) {
            objPreWrite = objPut;
        }
        return objPreWrite;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object remove(Object obj) {
        Object objPreWrite;
        objPreWrite = preWrite(obj);
        Object objRemove = super.remove(obj);
        if (objRemove != null) {
            objPreWrite = objRemove;
        }
        return objPreWrite;
    }

    @Override // java.util.Properties
    public Object setProperty(String str, String str2) {
        return put(str, str2);
    }

    @Override // java.util.Properties
    public String getProperty(String str, String str2) {
        String property = getProperty(str);
        return property == null ? str2 : property;
    }
}
