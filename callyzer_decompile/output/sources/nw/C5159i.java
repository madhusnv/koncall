package nw;

import fm.AbstractC2323b;
import fm.C2324c;
import jakarta.mail.C3696x;
import java.security.AccessController;
import og.c2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.i */
/* loaded from: classes3.dex */
public final class C5159i extends AbstractC5152b {

    /* renamed from: c */
    public static final String f25235c;

    /* renamed from: b */
    public final C2324c[] f25236b;

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C3696x(2));
        } catch (Exception unused) {
            str = null;
        }
        f25235c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0144 A[EXC_TOP_SPLITTER, PHI: r5 r7
      0x0144: PHI (r5v7 int) = (r5v4 int), (r5v5 int), (r5v12 int) binds: [B:75:0x0142, B:82:0x0161, B:58:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r7v10 java.io.InputStream) = (r7v8 java.io.InputStream), (r7v9 java.io.InputStream), (r7v13 java.io.InputStream) binds: [B:75:0x0142, B:82:0x0161, B:58:0x0113] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5159i() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw.C5159i.<init>():void");
    }

    /* renamed from: b */
    public static InterfaceC5153c m10070b(String str) throws ClassNotFoundException {
        Class<?> cls;
        if (AbstractC2323b.m6004a()) {
            AbstractC2323b.m6005b("    got content-handler");
        }
        if (AbstractC2323b.m6004a()) {
            AbstractC2323b.m6005b("      class " + str);
        }
        try {
            ClassLoader classLoaderM10571b = c2.m10571b();
            if (classLoaderM10571b == null) {
                classLoaderM10571b = C5159i.class.getClassLoader();
            }
            try {
                cls = classLoaderM10571b.loadClass(str);
            } catch (Exception unused) {
                cls = Class.forName(str);
            }
            if (cls != null) {
                return (InterfaceC5153c) cls.getDeclaredConstructor(null).newInstance(null);
            }
        } catch (ReflectiveOperationException e2) {
            if (AbstractC2323b.m6004a()) {
                AbstractC2323b.m6006c("Can't load DCH " + str, e2);
            }
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0033: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:52), block:B:11:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080 A[Catch: IOException -> 0x009e, PHI: r4
      0x0080: PHI (r4v5 java.io.InputStream) = (r4v4 java.io.InputStream), (r4v6 java.io.InputStream) binds: [B:36:0x007e, B:44:0x009b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x009e, blocks: (B:22:0x0055, B:37:0x0080), top: B:60:0x0007 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fm.C2324c m10071c(java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "MailcapCommandMap: can't load "
            java.lang.String r1 = "MailcapCommandMap: not loading mailcap file: "
            java.lang.String r2 = "MailcapCommandMap: successfully loaded mailcap file: "
            r3 = 0
            java.lang.Class<nw.i> r4 = nw.C5159i.class
            jakarta.mail.y r5 = new jakarta.mail.y     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            r6 = 1
            r5.<init>(r4, r7, r6)     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r5)     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            if (r4 == 0) goto L3e
            fm.c r1 = new fm.c     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            boolean r5 = fm.AbstractC2323b.m6004a()     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            if (r5 == 0) goto L3a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            r5.append(r7)     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            fm.AbstractC2323b.m6005b(r2)     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            goto L3a
        L32:
            r7 = move-exception
            r3 = r4
            goto L9f
        L36:
            r1 = move-exception
            goto L69
        L38:
            r1 = move-exception
            goto L86
        L3a:
            r4.close()     // Catch: java.io.IOException -> L3d
        L3d:
            return r1
        L3e:
            boolean r2 = fm.AbstractC2323b.m6004a()     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            if (r2 == 0) goto L53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            r2.append(r7)     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
            fm.AbstractC2323b.m6005b(r1)     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
        L53:
            if (r4 == 0) goto L9e
            r4.close()     // Catch: java.io.IOException -> L9e
            return r3
        L59:
            r1 = move-exception
            java.lang.Exception r1 = r1.getException()     // Catch: java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            java.io.IOException r1 = (java.io.IOException) r1     // Catch: java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            throw r1     // Catch: java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
        L61:
            r4 = r3
            goto L69
        L63:
            r4 = r3
            goto L86
        L65:
            r7 = move-exception
            goto L9f
        L67:
            r1 = move-exception
            goto L61
        L69:
            boolean r2 = fm.AbstractC2323b.m6004a()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L32
            r2.append(r7)     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L32
            fm.AbstractC2323b.m6006c(r7, r1)     // Catch: java.lang.Throwable -> L32
        L7e:
            if (r4 == 0) goto L9e
        L80:
            r4.close()     // Catch: java.io.IOException -> L9e
            goto L9e
        L84:
            r1 = move-exception
            goto L63
        L86:
            boolean r2 = fm.AbstractC2323b.m6004a()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L32
            r2.append(r7)     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L32
            fm.AbstractC2323b.m6006c(r7, r1)     // Catch: java.lang.Throwable -> L32
        L9b:
            if (r4 == 0) goto L9e
            goto L80
        L9e:
            return r3
        L9f:
            if (r3 == 0) goto La4
            r3.close()     // Catch: java.io.IOException -> La4
        La4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nw.C5159i.m10071c(java.lang.String):fm.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        r2 = r4.f25236b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r1 >= r2.length) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r2[r1] != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (fm.AbstractC2323b.m6004a() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        fm.AbstractC2323b.m6005b("  search fallback DB #" + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r2 = r4.f25236b[r1].m6010a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r2 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        r2 = (java.util.List) r2.get("content-handler");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r2 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        r2 = m10070b((java.lang.String) r2.get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r2 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        return null;
     */
    @Override // nw.AbstractC5152b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized nw.InterfaceC5153c mo10060a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "MailcapCommandMap: createDataContentHandler for "
            monitor-enter(r4)
            boolean r1 = fm.AbstractC2323b.m6004a()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L19
            r1.append(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L19
            fm.AbstractC2323b.m6005b(r0)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r5 = move-exception
            goto Lbc
        L1c:
            if (r5 == 0) goto L24
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.Throwable -> L19
        L24:
            r0 = 0
            r1 = r0
        L26:
            fm.c[] r2 = r4.f25236b     // Catch: java.lang.Throwable -> L19
            int r3 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r1 >= r3) goto L6f
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L30
            goto L6c
        L30:
            boolean r2 = fm.AbstractC2323b.m6004a()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L4a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r2.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "  search DB #"
            r2.append(r3)     // Catch: java.lang.Throwable -> L19
            r2.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19
            fm.AbstractC2323b.m6005b(r2)     // Catch: java.lang.Throwable -> L19
        L4a:
            fm.c[] r2 = r4.f25236b     // Catch: java.lang.Throwable -> L19
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            java.util.Map r2 = r2.m6011b(r5)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L6c
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L19
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L19
            nw.c r2 = m10070b(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L6c
            monitor-exit(r4)
            return r2
        L6c:
            int r1 = r1 + 1
            goto L26
        L6f:
            r1 = r0
        L70:
            fm.c[] r2 = r4.f25236b     // Catch: java.lang.Throwable -> L19
            int r3 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r1 >= r3) goto Lb9
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L7a
            goto Lb6
        L7a:
            boolean r2 = fm.AbstractC2323b.m6004a()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L94
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r2.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "  search fallback DB #"
            r2.append(r3)     // Catch: java.lang.Throwable -> L19
            r2.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19
            fm.AbstractC2323b.m6005b(r2)     // Catch: java.lang.Throwable -> L19
        L94:
            fm.c[] r2 = r4.f25236b     // Catch: java.lang.Throwable -> L19
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            java.util.Map r2 = r2.m6010a(r5)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lb6
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L19
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L19
            nw.c r2 = m10070b(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lb6
            monitor-exit(r4)
            return r2
        Lb6:
            int r1 = r1 + 1
            goto L70
        Lb9:
            monitor-exit(r4)
            r5 = 0
            return r5
        Lbc:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nw.C5159i.mo10060a(java.lang.String):nw.c");
    }
}
