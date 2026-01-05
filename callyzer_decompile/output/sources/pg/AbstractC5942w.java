package pg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import ng.C5070u;
import t5.C7047e;
import y5.C8561g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.w */
/* loaded from: classes.dex */
public abstract class AbstractC5942w {

    /* renamed from: a */
    public final /* synthetic */ int f29095a;

    public AbstractC5942w(int i10) {
        this.f29095a = i10;
        switch (i10) {
            case 2:
                new ConcurrentHashMap();
                break;
        }
    }

    /* renamed from: a */
    public abstract Typeface mo11899a(Context context, C7047e c7047e, Resources resources, int i10);

    /* renamed from: b */
    public abstract Typeface mo11900b(Context context, C8561g[] c8561gArr, int i10);

    /* renamed from: c */
    public Typeface mo11901c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* renamed from: d */
    public Typeface mo11902d(Context context, InputStream inputStream) {
        File fileM11924e = AbstractC5943x.m11924e(context);
        if (fileM11924e == null) {
            return null;
        }
        try {
            if (AbstractC5943x.m11922c(fileM11924e, inputStream)) {
                return Typeface.createFromFile(fileM11924e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM11924e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo11903e(Context context, Resources resources, int i10, String str, int i11) {
        File fileM11924e = AbstractC5943x.m11924e(context);
        if (fileM11924e == null) {
            return null;
        }
        try {
            if (AbstractC5943x.m11921b(fileM11924e, resources, i10)) {
                return Typeface.createFromFile(fileM11924e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM11924e.delete();
        }
    }

    /* renamed from: f */
    public C8561g mo11904f(C8561g[] c8561gArr, int i10) {
        new C5070u(28);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z6 = (i10 & 2) != 0;
        C8561g c8561g = null;
        int i12 = Integer.MAX_VALUE;
        for (C8561g c8561g2 : c8561gArr) {
            int iAbs = (Math.abs(c8561g2.f41556c - i11) * 2) + (c8561g2.f41557d == z6 ? 0 : 1);
            if (c8561g == null || i12 > iAbs) {
                c8561g = c8561g2;
                i12 = iAbs;
            }
        }
        return c8561g;
    }

    public int hashCode() {
        switch (this.f29095a) {
            case 1:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f29095a) {
            case 1:
                String strM8914c = kotlin.jvm.internal.a0.m8901a(getClass()).m8914c();
                AbstractC4154l.m8920c(strM8914c);
                return strM8914c;
            default:
                return super.toString();
        }
    }
}
