package u5;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import e1.C1917s;
import og.oa;
import pg.AbstractC5942w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u5.c */
/* loaded from: classes.dex */
public abstract class AbstractC7341c {

    /* renamed from: a */
    public static final AbstractC5942w f34961a;

    /* renamed from: b */
    public static final C1917s f34962b;

    static {
        Trace.beginSection(oa.m10795e("TypefaceCompat static init"));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f34961a = new C7346h(2);
        } else if (i10 >= 28) {
            f34961a = new C7345g();
        } else if (i10 >= 26) {
            f34961a = new C7344f();
        } else if (C7343e.f34970d != null) {
            f34961a = new C7343e(2);
        } else {
            f34961a = new C7342d(2);
        }
        f34962b = new C1917s(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m13739a(android.content.Context r16, t5.InterfaceC7046d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, t5.AbstractC7044b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.AbstractC7341c.m13739a(android.content.Context, t5.d, android.content.res.Resources, int, java.lang.String, int, int, t5.b, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m13740b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
