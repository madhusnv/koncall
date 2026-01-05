package nw;

import fm.C2326e;
import fm.C2327f;
import jakarta.mail.C3696x;
import java.security.AccessController;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.k */
/* loaded from: classes3.dex */
public final class C5161k extends AbstractC5158h {

    /* renamed from: c */
    public static final String f25240c;

    /* renamed from: b */
    public final C2327f[] f25241b;

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C3696x(3));
        } catch (Exception unused) {
            str = null;
        }
        f25240c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0188 A[EXC_TOP_SPLITTER, PHI: r5 r7
      0x0188: PHI (r5v7 int) = (r5v4 int), (r5v5 int), (r5v12 int) binds: [B:85:0x0186, B:92:0x01a5, B:68:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r7v10 java.io.InputStream) = (r7v8 java.io.InputStream), (r7v9 java.io.InputStream), (r7v13 java.io.InputStream) binds: [B:85:0x0186, B:92:0x01a5, B:68:0x0157] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5161k() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw.C5161k.<init>():void");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0033: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:52), block:B:11:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080 A[Catch: IOException -> 0x009e, PHI: r4
      0x0080: PHI (r4v5 java.io.InputStream) = (r4v4 java.io.InputStream), (r4v6 java.io.InputStream) binds: [B:36:0x007e, B:44:0x009b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x009e, blocks: (B:22:0x0055, B:37:0x0080), top: B:60:0x0007 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fm.C2327f m10074c(java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "MimetypesFileTypeMap: can't load "
            java.lang.String r1 = "MimetypesFileTypeMap: not loading mime types file: "
            java.lang.String r2 = "MimetypesFileTypeMap: successfully loaded mime types file: "
            r3 = 0
            java.lang.Class<nw.k> r4 = nw.C5161k.class
            jakarta.mail.y r5 = new jakarta.mail.y     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            r6 = 1
            r5.<init>(r4, r7, r6)     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r5)     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch: java.security.PrivilegedActionException -> L59 java.lang.Throwable -> L65 java.lang.SecurityException -> L67 java.io.IOException -> L84
            if (r4 == 0) goto L3e
            fm.f r1 = new fm.f     // Catch: java.lang.Throwable -> L32 java.lang.SecurityException -> L36 java.io.IOException -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: nw.C5161k.m10074c(java.lang.String):fm.f");
    }

    @Override // nw.AbstractC5158h
    /* renamed from: a */
    public final synchronized String mo10069a(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.length() == 0) {
            return "application/octet-stream";
        }
        int i10 = 0;
        while (true) {
            C2327f[] c2327fArr = this.f25241b;
            if (i10 >= c2327fArr.length) {
                return "application/octet-stream";
            }
            C2327f c2327f = c2327fArr[i10];
            if (c2327f != null) {
                C2326e c2326e = (C2326e) c2327f.f10557b.get(strSubstring);
                String str2 = c2326e != null ? c2326e.f10554a : null;
                if (str2 != null) {
                    return str2;
                }
            }
            i10++;
        }
    }
}
