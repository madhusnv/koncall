package p001o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class yyi {

    /* renamed from: c */
    public Interpolator f56305c;

    /* renamed from: d */
    public zyi f56306d;

    /* renamed from: e */
    public boolean f56307e;

    /* renamed from: b */
    public long f56304b = -1;

    /* renamed from: f */
    public final azi f56308f = new C18532a();

    /* renamed from: a */
    public final ArrayList f56303a = new ArrayList();

    /* renamed from: o.yyi$a */
    public class C18532a extends azi {

        /* renamed from: a */
        public boolean f56309a = false;

        /* renamed from: b */
        public int f56310b = 0;

        public C18532a() {
        }

        @Override // p001o.zyi
        /* renamed from: b */
        public void mo3832b(View view) {
            int i = this.f56310b + 1;
            this.f56310b = i;
            if (i == yyi.this.f56303a.size()) {
                zyi zyiVar = yyi.this.f56306d;
                if (zyiVar != null) {
                    zyiVar.mo3832b(null);
                }
                m58550d();
            }
        }

        @Override // p001o.azi, p001o.zyi
        /* renamed from: c */
        public void mo3833c(View view) {
            if (this.f56309a) {
                return;
            }
            this.f56309a = true;
            zyi zyiVar = yyi.this.f56306d;
            if (zyiVar != null) {
                zyiVar.mo3833c(null);
            }
        }

        /* renamed from: d */
        public void m58550d() {
            this.f56310b = 0;
            this.f56309a = false;
            yyi.this.m58543b();
        }
    }

    /* renamed from: a */
    public void m58542a() {
        if (this.f56307e) {
            Iterator it = this.f56303a.iterator();
            while (it.hasNext()) {
                ((xyi) it.next()).m56974c();
            }
            this.f56307e = false;
        }
    }

    /* renamed from: b */
    public void m58543b() {
        this.f56307e = false;
    }

    /* renamed from: c */
    public yyi m58544c(xyi xyiVar) {
        if (!this.f56307e) {
            this.f56303a.add(xyiVar);
        }
        return this;
    }

    /* renamed from: d */
    public yyi m58545d(xyi xyiVar, xyi xyiVar2) {
        this.f56303a.add(xyiVar);
        xyiVar2.m56980j(xyiVar.m56975d());
        this.f56303a.add(xyiVar2);
        return this;
    }

    /* renamed from: e */
    public yyi m58546e(long j) {
        if (!this.f56307e) {
            this.f56304b = j;
        }
        return this;
    }

    /* renamed from: f */
    public yyi m58547f(Interpolator interpolator) {
        if (!this.f56307e) {
            this.f56305c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public yyi m58548g(zyi zyiVar) {
        if (!this.f56307e) {
            this.f56306d = zyiVar;
        }
        return this;
    }

    /* renamed from: h */
    public void m58549h() {
        if (this.f56307e) {
            return;
        }
        Iterator it = this.f56303a.iterator();
        while (it.hasNext()) {
            xyi xyiVar = (xyi) it.next();
            long j = this.f56304b;
            if (j >= 0) {
                xyiVar.m56976f(j);
            }
            Interpolator interpolator = this.f56305c;
            if (interpolator != null) {
                xyiVar.m56977g(interpolator);
            }
            if (this.f56306d != null) {
                xyiVar.m56978h(this.f56308f);
            }
            xyiVar.m56982l();
        }
        this.f56307e = true;
    }
}
