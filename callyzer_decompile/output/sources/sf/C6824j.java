package sf;

import eb.C1979c;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.j */
/* loaded from: classes.dex */
public final class C6824j {

    /* renamed from: b */
    public static final C1979c f32443b = new C1979c("LibraryVersion", "");

    /* renamed from: c */
    public static final C6824j f32444c = new C6824j();

    /* renamed from: a */
    public final ConcurrentHashMap f32445a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m13016a(java.lang.String r10) throws java.lang.Throwable {
        /*
            r9 = this;
            eb.c r0 = sf.C6824j.f32443b
            java.lang.String r1 = "Failed to get app version for libraryName: "
            java.lang.String r2 = "/"
            java.lang.String r3 = "Please provide a valid libraryName"
            sf.AbstractC6840z.m13034e(r10, r3)
            java.util.concurrent.ConcurrentHashMap r3 = r9.f32445a
            boolean r4 = r3.containsKey(r10)
            if (r4 == 0) goto L1a
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1a:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r6.append(r10)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r2 = ".properties"
            r6.append(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.Class<sf.j> r6 = sf.C6824j.class
            java.io.InputStream r2 = r6.getResourceAsStream(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            if (r2 == 0) goto L69
            r4.load(r2)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r6 = "version"
            java.lang.String r5 = r4.getProperty(r6, r5)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.append(r10)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r6 = " version is "
            r4.append(r6)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.append(r5)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r6 = r0.f9280a     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r7 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            if (r6 == 0) goto La2
            r0.m5714a(r4)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            goto La2
        L63:
            r10 = move-exception
            goto L82
        L65:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L87
        L69:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.append(r10)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r6 = r0.f9280a     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r7 = 5
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            if (r6 == 0) goto La2
            r0.m5714a(r4)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            goto La2
        L82:
            r5 = r2
            goto Lbd
        L84:
            r10 = move-exception
            goto Lbd
        L86:
            r2 = r5
        L87:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L84
            r4.append(r10)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = r0.f9280a     // Catch: java.lang.Throwable -> L84
            r6 = 6
            boolean r4 = android.util.Log.isLoggable(r4, r6)     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L9f
            r0.m5714a(r1)     // Catch: java.lang.Throwable -> L84
        L9f:
            r8 = r5
            r5 = r2
            r2 = r8
        La2:
            if (r2 == 0) goto La7
            r2.close()     // Catch: java.io.IOException -> La7
        La7:
            if (r5 != 0) goto Lb9
            r1 = 3
            java.lang.String r2 = r0.f9280a
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto Lb7
            java.lang.String r1 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.m5714a(r1)
        Lb7:
            java.lang.String r5 = "UNKNOWN"
        Lb9:
            r3.put(r10, r5)
            return r5
        Lbd:
            if (r5 == 0) goto Lc2
            r5.close()     // Catch: java.io.IOException -> Lc2
        Lc2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.C6824j.m13016a(java.lang.String):java.lang.String");
    }
}
