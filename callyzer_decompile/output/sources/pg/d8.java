package pg;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d8 {
    /* renamed from: a */
    public static final String m11583a(String message, Integer num) {
        AbstractC4154l.m8923f(message, "message");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message);
        sb2.append(" on line " + num + '.');
        sb2.append(" See https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html for file format details.");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:303:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0518  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static eb.i3 m11584b(p021w.C7843i r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.d8.m11584b(w.i):eb.i3");
    }

    /* renamed from: c */
    public static final boolean m11585c(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (og.d2.m10603f(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final C6361k m11586d(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        List listM10111V = AbstractC5178p.m10111V(str, new char[]{'='}, 2, 2);
        return new C6361k(AbstractC5178p.g0((String) listM10111V.get(0)).toString(), AbstractC5178p.g0((String) listM10111V.get(1)).toString());
    }

    /* renamed from: e */
    public static final String m11587e(String str, String str2) {
        return (String) AbstractC5178p.m10112W(str, new String[]{str2}, 2).get(0);
    }
}
