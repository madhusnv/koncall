package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* loaded from: classes2.dex */
public final class rcd {

    /* renamed from: a */
    public final PointerIcon f43378a;

    /* renamed from: o.rcd$a */
    public static class C16589a {
        /* renamed from: a */
        public static PointerIcon m46527a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        /* renamed from: b */
        public static PointerIcon m46528b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        /* renamed from: c */
        public static PointerIcon m46529c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public rcd(PointerIcon pointerIcon) {
        this.f43378a = pointerIcon;
    }

    /* renamed from: b */
    public static rcd m46525b(Context context, int i) {
        return new rcd(C16589a.m46528b(context, i));
    }

    /* renamed from: a */
    public Object m46526a() {
        return this.f43378a;
    }
}
