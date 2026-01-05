package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes2.dex */
public class C2414t {

    /* renamed from: a */
    public final b f10196a;

    /* renamed from: b */
    public a f10197b = new a();

    /* renamed from: androidx.recyclerview.widget.t$a */
    public static class a {

        /* renamed from: a */
        public int f10198a = 0;

        /* renamed from: b */
        public int f10199b;

        /* renamed from: c */
        public int f10200c;

        /* renamed from: d */
        public int f10201d;

        /* renamed from: e */
        public int f10202e;

        /* renamed from: a */
        public void m9688a(int i) {
            this.f10198a = i | this.f10198a;
        }

        /* renamed from: b */
        public boolean m9689b() {
            int i = this.f10198a;
            if ((i & 7) != 0 && (i & (m9690c(this.f10201d, this.f10199b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f10198a;
            if ((i2 & 112) != 0 && (i2 & (m9690c(this.f10201d, this.f10200c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f10198a;
            if ((i3 & 1792) != 0 && (i3 & (m9690c(this.f10202e, this.f10199b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f10198a;
            return (i4 & 28672) == 0 || (i4 & (m9690c(this.f10202e, this.f10200c) << 12)) != 0;
        }

        /* renamed from: c */
        public int m9690c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void m9691d() {
            this.f10198a = 0;
        }

        /* renamed from: e */
        public void m9692e(int i, int i2, int i3, int i4) {
            this.f10199b = i;
            this.f10200c = i2;
            this.f10201d = i3;
            this.f10202e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$b */
    public interface b {
        /* renamed from: a */
        View mo9251a(int i);

        /* renamed from: b */
        int mo9252b(View view);

        /* renamed from: c */
        int mo9253c();

        /* renamed from: d */
        int mo9254d();

        /* renamed from: e */
        int mo9255e(View view);
    }

    public C2414t(b bVar) {
        this.f10196a = bVar;
    }

    /* renamed from: a */
    public View m9686a(int i, int i2, int i3, int i4) {
        int iMo9253c = this.f10196a.mo9253c();
        int iMo9254d = this.f10196a.mo9254d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo9251a = this.f10196a.mo9251a(i);
            this.f10197b.m9692e(iMo9253c, iMo9254d, this.f10196a.mo9252b(viewMo9251a), this.f10196a.mo9255e(viewMo9251a));
            if (i3 != 0) {
                this.f10197b.m9691d();
                this.f10197b.m9688a(i3);
                if (this.f10197b.m9689b()) {
                    return viewMo9251a;
                }
            }
            if (i4 != 0) {
                this.f10197b.m9691d();
                this.f10197b.m9688a(i4);
                if (this.f10197b.m9689b()) {
                    view = viewMo9251a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m9687b(View view, int i) {
        this.f10197b.m9692e(this.f10196a.mo9253c(), this.f10196a.mo9254d(), this.f10196a.mo9252b(view), this.f10196a.mo9255e(view));
        if (i == 0) {
            return false;
        }
        this.f10197b.m9691d();
        this.f10197b.m9688a(i);
        return this.f10197b.m9689b();
    }
}
