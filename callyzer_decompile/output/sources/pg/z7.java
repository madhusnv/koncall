package pg;

import ja.AbstractC3607a;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import ud.C7416t;
import ud.InterfaceC7411o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z7 {

    /* renamed from: a */
    public static final /* synthetic */ int f29129a = 0;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:47:0x00c5, B:49:0x00c9, B:51:0x00d9, B:50:0x00d1), top: B:54:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:47:0x00c5, B:49:0x00c9, B:51:0x00d9, B:50:0x00d1), top: B:54:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11964a(ud.InterfaceC7411o r8, ww.AbstractC8193c r9) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.z7.m11964a(ud.o, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final String m11965b(String path, InterfaceC7411o platform) {
        String strConcat;
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(platform, "platform");
        if (!AbstractC5178p.m10113X(AbstractC5178p.g0(path).toString(), '~')) {
            return path;
        }
        C7416t c7416t = (C7416t) platform;
        int i10 = AbstractC3607a.f19236a[c7416t.m13807b().f35195a.ordinal()];
        if (i10 == 1 || i10 == 2) {
            String strM13806a = c7416t.m13806a("HOME");
            if (strM13806a == null && (strM13806a = c7416t.m13806a("USERPROFILE")) == null) {
                String strM13806a2 = c7416t.m13806a("HOMEDRIVE");
                String strM13806a3 = c7416t.m13806a("HOMEPATH");
                strConcat = (strM13806a2 == null || strM13806a3 == null) ? null : strM13806a2.concat(strM13806a3);
                if (strConcat == null) {
                    strConcat = System.getProperty("user.home");
                }
            } else {
                strConcat = strM13806a;
            }
        } else {
            strConcat = c7416t.m13806a("HOME");
            if (strConcat == null) {
                strConcat = System.getProperty("user.home");
            }
        }
        if (strConcat == null) {
            throw new IllegalStateException("Unable to determine user home directory");
        }
        String strSubstring = path.substring(1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strConcat.concat(strSubstring);
    }
}
