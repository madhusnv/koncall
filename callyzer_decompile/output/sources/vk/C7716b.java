package vk;

import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vk.b */
/* loaded from: classes.dex */
public final class C7716b {

    /* renamed from: a */
    public static final Logger f37244a = Logger.getLogger(C7716b.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m14709a(java.io.InputStream r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error closing input stream (ignored)"
            java.util.logging.Logger r1 = vk.C7716b.f37244a
            if (r8 != 0) goto L9
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L9:
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            int r4 = r3.readInt()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r5 = 0
        L19:
            if (r5 >= r4) goto L29
            sk.h r6 = new sk.h     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r6.<init>()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r6.readExternal(r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r2.add(r6)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            int r5 = r5 + 1
            goto L19
        L29:
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            if (r4 != 0) goto L3a
            r3.close()     // Catch: java.io.IOException -> L33
            return r2
        L33:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r8)
            return r2
        L3a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            java.lang.String r4 = "Empty metadata"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            throw r2     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
        L42:
            r2 = move-exception
            goto L57
        L44:
            r2 = move-exception
            goto L4f
        L46:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L57
        L4b:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L4f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "Unable to parse metadata file"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L57:
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.io.IOException -> L5d
            goto L6e
        L5d:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r8)
            goto L6e
        L64:
            r8.close()     // Catch: java.io.IOException -> L68
            goto L6e
        L68:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r8)
        L6e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C7716b.m14709a(java.io.InputStream):java.util.List");
    }
}
