package y5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import e1.C1917s;
import e1.u0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.ThreadFactoryC3895e;
import og.oa;
import pg.AbstractC5942w;
import r1.C6438w;
import u5.AbstractC7341c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y5.f */
/* loaded from: classes.dex */
public abstract class AbstractC8560f {

    /* renamed from: a */
    public static final C1917s f41550a = new C1917s(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f41551b;

    /* renamed from: c */
    public static final Object f41552c;

    /* renamed from: d */
    public static final u0 f41553d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC3895e(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f41551b = threadPoolExecutor;
        f41552c = new Object();
        f41553d = new u0(0);
    }

    /* renamed from: a */
    public static String m15829a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((C8557c) list.get(i11)).f41542e);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static C8559e m15830b(String str, Context context, List list, int i10) {
        int i11;
        Typeface typefaceMo11900b;
        C1917s c1917s = f41550a;
        Trace.beginSection(oa.m10795e("getFontSync"));
        try {
            Typeface typeface = (Typeface) c1917s.m5620h(str);
            if (typeface != null) {
                return new C8559e(typeface);
            }
            C6438w c6438wM15826a = AbstractC8556b.m15826a(context, list);
            List list2 = c6438wM15826a.f31066b;
            int i12 = c6438wM15826a.f31065a;
            if (i12 != 0) {
                i11 = i12 != 1 ? -3 : -2;
            } else {
                C8561g[] c8561gArr = (C8561g[]) list2.get(0);
                if (c8561gArr == null || c8561gArr.length == 0) {
                    i11 = 1;
                } else {
                    int length = c8561gArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i11 = 0;
                            break;
                        }
                        int i14 = c8561gArr[i13].f41558e;
                        if (i14 == 0) {
                            i13++;
                        } else if (i14 >= 0) {
                            i11 = i14;
                        }
                    }
                }
            }
            if (i11 != 0) {
                return new C8559e(i11);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                C8561g[] c8561gArr2 = (C8561g[]) list2.get(0);
                AbstractC5942w abstractC5942w = AbstractC7341c.f34961a;
                Trace.beginSection(oa.m10795e("TypefaceCompat.createFromFontInfo"));
                typefaceMo11900b = AbstractC7341c.f34961a.mo11900b(context, c8561gArr2, i10);
                Trace.endSection();
            } else {
                AbstractC5942w abstractC5942w2 = AbstractC7341c.f34961a;
                Trace.beginSection(oa.m10795e("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceMo11900b = AbstractC7341c.f34961a.mo11901c(context, list2, i10);
                Trace.endSection();
            }
            if (typefaceMo11900b == null) {
                return new C8559e(-3);
            }
            c1917s.m5624l(str, typefaceMo11900b);
            return new C8559e(typefaceMo11900b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C8559e(-1);
        } catch (Throwable th2) {
            throw th2;
        } finally {
            Trace.endSection();
        }
    }
}
