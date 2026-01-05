package com.sun.mail.util;

import jakarta.mail.internet.InterfaceC3667p;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class MimeUtil {
    private static final Method cleanContentType;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0015, ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x002c, ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x002c, ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x002c, TRY_ENTER, TryCatch #1 {ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x002c, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0010, B:8:0x0010, B:14:0x001a, B:14:0x001a, B:14:0x001a, B:15:0x001e, B:15:0x001e, B:15:0x001e), top: B:24:0x0001 }] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "mail.mime.contenttypehandler"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            java.lang.ClassLoader r2 = getContextClassLoader()     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L2c
            if (r2 == 0) goto L17
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L15 java.lang.ClassNotFoundException -> L17 java.lang.Throwable -> L2c java.lang.Throwable -> L2c
            goto L18
        L15:
            r1 = move-exception
            goto L2f
        L17:
            r2 = r0
        L18:
            if (r2 != 0) goto L1e
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L2c java.lang.Throwable -> L2c java.lang.Throwable -> L2c
        L1e:
            java.lang.String r1 = "cleanContentType"
            java.lang.Class<jakarta.mail.internet.p> r3 = jakarta.mail.internet.InterfaceC3667p.class
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L2c java.lang.Throwable -> L2c java.lang.Throwable -> L2c
            java.lang.reflect.Method r0 = r2.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L2c java.lang.Throwable -> L2c java.lang.Throwable -> L2c
        L2c:
            com.sun.mail.util.MimeUtil.cleanContentType = r0
            goto L32
        L2f:
            com.sun.mail.util.MimeUtil.cleanContentType = r0
            throw r1
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.MimeUtil.<clinit>():void");
    }

    private MimeUtil() {
    }

    public static String cleanContentType(InterfaceC3667p interfaceC3667p, String str) {
        Method method = cleanContentType;
        if (method != null) {
            try {
                return (String) method.invoke(null, interfaceC3667p, str);
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: com.sun.mail.util.MimeUtil.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            }
        });
    }
}
