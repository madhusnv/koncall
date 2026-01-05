package p001o;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class f0j extends c0j {

    /* renamed from: d */
    public static boolean f22509d = true;

    /* renamed from: e */
    public static boolean f22510e = true;

    /* renamed from: f */
    public static boolean f22511f = true;

    /* renamed from: o.f0j$a */
    public static class C13308a {
        /* renamed from: a */
        public static void m25923a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        /* renamed from: b */
        public static void m25924b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        /* renamed from: c */
        public static void m25925c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // p001o.c0j
    /* renamed from: d */
    public void mo20030d(View view, Matrix matrix) {
        if (f22509d) {
            try {
                C13308a.m25923a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22509d = false;
            }
        }
    }

    @Override // p001o.c0j
    /* renamed from: h */
    public void mo20034h(View view, Matrix matrix) {
        if (f22510e) {
            try {
                C13308a.m25924b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22510e = false;
            }
        }
    }

    @Override // p001o.c0j
    /* renamed from: i */
    public void mo20035i(View view, Matrix matrix) {
        if (f22511f) {
            try {
                C13308a.m25925c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22511f = false;
            }
        }
    }
}
