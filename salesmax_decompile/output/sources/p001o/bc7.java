package p001o;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* loaded from: classes2.dex */
public abstract class bc7 {

    /* renamed from: o.bc7$a */
    public static class C12351a {

        /* renamed from: a */
        public final int f15920a;

        /* renamed from: b */
        public final C12352b[] f15921b;

        public C12351a(int i, C12352b[] c12352bArr) {
            this.f15920a = i;
            this.f15921b = c12352bArr;
        }

        /* renamed from: a */
        public static C12351a m18586a(int i, C12352b[] c12352bArr) {
            return new C12351a(i, c12352bArr);
        }

        /* renamed from: b */
        public C12352b[] m18587b() {
            return this.f15921b;
        }

        /* renamed from: c */
        public int m18588c() {
            return this.f15920a;
        }
    }

    /* renamed from: o.bc7$b */
    public static class C12352b {

        /* renamed from: a */
        public final Uri f15922a;

        /* renamed from: b */
        public final int f15923b;

        /* renamed from: c */
        public final int f15924c;

        /* renamed from: d */
        public final boolean f15925d;

        /* renamed from: e */
        public final int f15926e;

        public C12352b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f15922a = (Uri) fgd.m26663g(uri);
            this.f15923b = i;
            this.f15924c = i2;
            this.f15925d = z;
            this.f15926e = i3;
        }

        /* renamed from: a */
        public static C12352b m18589a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C12352b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m18590b() {
            return this.f15926e;
        }

        /* renamed from: c */
        public int m18591c() {
            return this.f15923b;
        }

        /* renamed from: d */
        public Uri m18592d() {
            return this.f15922a;
        }

        /* renamed from: e */
        public int m18593e() {
            return this.f15924c;
        }

        /* renamed from: f */
        public boolean m18594f() {
            return this.f15925d;
        }
    }

    /* renamed from: o.bc7$c */
    public static class C12353c {
        /* renamed from: a */
        public abstract void mo18595a(int i);

        /* renamed from: b */
        public abstract void mo18596b(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m18583a(Context context, CancellationSignal cancellationSignal, C12352b[] c12352bArr) {
        return fzh.m27829b(context, cancellationSignal, c12352bArr, 0);
    }

    /* renamed from: b */
    public static C12351a m18584b(Context context, CancellationSignal cancellationSignal, ub7 ub7Var) {
        return tb7.m49683e(context, ub7Var, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m18585c(Context context, ub7 ub7Var, int i, boolean z, int i2, Handler handler, C12353c c12353c) {
        h32 h32Var = new h32(c12353c, handler);
        return z ? wb7.m54161e(context, ub7Var, h32Var, i, i2) : wb7.m54160d(context, ub7Var, i, null, h32Var);
    }
}
