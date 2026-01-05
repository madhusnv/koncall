package pg;

import kotlin.jvm.internal.AbstractC4154l;
import og.qe;
import x2.C8281e;
import x2.InterfaceC8290n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c7 {
    /* renamed from: a */
    public static final C8281e m11565a(String str) {
        return new C8281e(qe.m10862h(str));
    }

    /* renamed from: b */
    public static int m11566b(String str, int i10, int i11, boolean z6) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z6)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: c */
    public static final String[] m11567c(InterfaceC8290n interfaceC8290n) {
        AbstractC4154l.m8921d(interfaceC8290n, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C8281e) interfaceC8290n).f39812b.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m11568d(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.c7.m11568d(int, java.lang.String):long");
    }
}
