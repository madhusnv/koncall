package p001o;

import android.graphics.Bitmap;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import p001o.cd4;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class m6d implements qbg {

    /* renamed from: a */
    public final zwc f34861a = new zwc();

    /* renamed from: b */
    public final zwc f34862b = new zwc();

    /* renamed from: c */
    public final C15235a f34863c = new C15235a();

    /* renamed from: d */
    public Inflater f34864d;

    /* renamed from: o.m6d$a */
    public static final class C15235a {

        /* renamed from: a */
        public final zwc f34865a = new zwc();

        /* renamed from: b */
        public final int[] f34866b = new int[256];

        /* renamed from: c */
        public boolean f34867c;

        /* renamed from: d */
        public int f34868d;

        /* renamed from: e */
        public int f34869e;

        /* renamed from: f */
        public int f34870f;

        /* renamed from: g */
        public int f34871g;

        /* renamed from: h */
        public int f34872h;

        /* renamed from: i */
        public int f34873i;

        /* renamed from: d */
        public cd4 m38418d() {
            int iM60004H;
            if (this.f34868d == 0 || this.f34869e == 0 || this.f34872h == 0 || this.f34873i == 0 || this.f34865a.m60026g() == 0 || this.f34865a.m60025f() != this.f34865a.m60026g() || !this.f34867c) {
                return null;
            }
            this.f34865a.m60017U(0);
            int i = this.f34872h * this.f34873i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iM60004H2 = this.f34865a.m60004H();
                if (iM60004H2 != 0) {
                    iM60004H = i2 + 1;
                    iArr[i2] = this.f34866b[iM60004H2];
                } else {
                    int iM60004H3 = this.f34865a.m60004H();
                    if (iM60004H3 != 0) {
                        iM60004H = ((iM60004H3 & 64) == 0 ? iM60004H3 & 63 : ((iM60004H3 & 63) << 8) | this.f34865a.m60004H()) + i2;
                        Arrays.fill(iArr, i2, iM60004H, (iM60004H3 & 128) == 0 ? this.f34866b[0] : this.f34866b[this.f34865a.m60004H()]);
                    }
                }
                i2 = iM60004H;
            }
            return new cd4.C12641b().m20924f(Bitmap.createBitmap(iArr, this.f34872h, this.f34873i, Bitmap.Config.ARGB_8888)).m20929k(this.f34870f / this.f34868d).m20930l(0).m20926h(this.f34871g / this.f34869e, 0).m20927i(0).m20932n(this.f34872h / this.f34868d).m20925g(this.f34873i / this.f34869e).m20919a();
        }

        /* renamed from: e */
        public final void m38419e(zwc zwcVar, int i) {
            int iM60007K;
            if (i < 4) {
                return;
            }
            zwcVar.m60018V(3);
            int i2 = i - 4;
            if ((zwcVar.m60004H() & 128) != 0) {
                if (i2 < 7 || (iM60007K = zwcVar.m60007K()) < 4) {
                    return;
                }
                this.f34872h = zwcVar.m60010N();
                this.f34873i = zwcVar.m60010N();
                this.f34865a.m60013Q(iM60007K - 4);
                i2 -= 7;
            }
            int iM60025f = this.f34865a.m60025f();
            int iM60026g = this.f34865a.m60026g();
            if (iM60025f >= iM60026g || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iM60026g - iM60025f);
            zwcVar.m60031l(this.f34865a.m60024e(), iM60025f, iMin);
            this.f34865a.m60017U(iM60025f + iMin);
        }

        /* renamed from: f */
        public final void m38420f(zwc zwcVar, int i) {
            if (i < 19) {
                return;
            }
            this.f34868d = zwcVar.m60010N();
            this.f34869e = zwcVar.m60010N();
            zwcVar.m60018V(11);
            this.f34870f = zwcVar.m60010N();
            this.f34871g = zwcVar.m60010N();
        }

        /* renamed from: g */
        public final void m38421g(zwc zwcVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            zwcVar.m60018V(2);
            Arrays.fill(this.f34866b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iM60004H = zwcVar.m60004H();
                int iM60004H2 = zwcVar.m60004H();
                int iM60004H3 = zwcVar.m60004H();
                int iM60004H4 = zwcVar.m60004H();
                double d = iM60004H2;
                double d2 = iM60004H3 - 128;
                double d3 = iM60004H4 - 128;
                this.f34866b[iM60004H] = (sqi.m48736o((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, Constants.MAX_HOST_LENGTH) << 8) | (zwcVar.m60004H() << 24) | (sqi.m48736o((int) ((1.402d * d2) + d), 0, Constants.MAX_HOST_LENGTH) << 16) | sqi.m48736o((int) (d + (d3 * 1.772d)), 0, Constants.MAX_HOST_LENGTH);
            }
            this.f34867c = true;
        }

        /* renamed from: h */
        public void m38422h() {
            this.f34868d = 0;
            this.f34869e = 0;
            this.f34870f = 0;
            this.f34871g = 0;
            this.f34872h = 0;
            this.f34873i = 0;
            this.f34865a.m60013Q(0);
            this.f34867c = false;
        }
    }

    /* renamed from: e */
    public static cd4 m38413e(zwc zwcVar, C15235a c15235a) {
        int iM60026g = zwcVar.m60026g();
        int iM60004H = zwcVar.m60004H();
        int iM60010N = zwcVar.m60010N();
        int iM60025f = zwcVar.m60025f() + iM60010N;
        cd4 cd4VarM38418d = null;
        if (iM60025f > iM60026g) {
            zwcVar.m60017U(iM60026g);
            return null;
        }
        if (iM60004H != 128) {
            switch (iM60004H) {
                case 20:
                    c15235a.m38421g(zwcVar, iM60010N);
                    break;
                case 21:
                    c15235a.m38419e(zwcVar, iM60010N);
                    break;
                case 22:
                    c15235a.m38420f(zwcVar, iM60010N);
                    break;
            }
        } else {
            cd4VarM38418d = c15235a.m38418d();
            c15235a.m38422h();
        }
        zwcVar.m60017U(iM60025f);
        return cd4VarM38418d;
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) {
        this.f34861a.m60015S(bArr, i2 + i);
        this.f34861a.m60017U(i);
        m38414d(this.f34861a);
        this.f34863c.m38422h();
        ArrayList arrayList = new ArrayList();
        while (this.f34861a.m60020a() >= 3) {
            cd4 cd4VarM38413e = m38413e(this.f34861a, this.f34863c);
            if (cd4VarM38413e != null) {
                arrayList.add(cd4VarM38413e);
            }
        }
        fu3Var.accept(new jd4(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 2;
    }

    /* renamed from: d */
    public final void m38414d(zwc zwcVar) {
        if (zwcVar.m60020a() <= 0 || zwcVar.m60029j() != 120) {
            return;
        }
        if (this.f34864d == null) {
            this.f34864d = new Inflater();
        }
        if (sqi.A0(zwcVar, this.f34862b, this.f34864d)) {
            zwcVar.m60015S(this.f34862b.m60024e(), this.f34862b.m60026g());
        }
    }
}
