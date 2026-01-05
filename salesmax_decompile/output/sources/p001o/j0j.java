package p001o;

import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public class j0j extends h0j {

    /* renamed from: h */
    public static boolean f29526h = true;

    /* renamed from: o.j0j$a */
    public static class C14423a {
        /* renamed from: a */
        public static void m33023a(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // p001o.c0j
    /* renamed from: g */
    public void mo20033g(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo20033g(view, i);
        } else if (f29526h) {
            try {
                C14423a.m33023a(view, i);
            } catch (NoSuchMethodError unused) {
                f29526h = false;
            }
        }
    }
}
