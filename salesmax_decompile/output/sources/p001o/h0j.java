package p001o;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class h0j extends f0j {

    /* renamed from: g */
    public static boolean f26070g = true;

    /* renamed from: o.h0j$a */
    public static class C13840a {
        /* renamed from: a */
        public static void m29726a(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    @Override // p001o.c0j
    /* renamed from: e */
    public void mo20031e(View view, int i, int i2, int i3, int i4) {
        if (f26070g) {
            try {
                C13840a.m29726a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f26070g = false;
            }
        }
    }
}
