package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C10727d;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p001o.bna;
import p001o.bo8;
import p001o.dab;
import p001o.hab;
import p001o.hd5;
import p001o.jm0;
import p001o.jme;
import p001o.jt3;
import p001o.mi1;
import p001o.ni1;
import p001o.ot5;
import p001o.qme;
import p001o.rma;
import p001o.tma;
import p001o.vo0;
import p001o.wo0;
import p001o.yf6;
import p001o.ys7;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes5.dex */
public final class C10725b {

    /* renamed from: c */
    public yf6 f11166c;

    /* renamed from: d */
    public mi1 f11167d;

    /* renamed from: e */
    public wo0 f11168e;

    /* renamed from: f */
    public dab f11169f;

    /* renamed from: g */
    public ys7 f11170g;

    /* renamed from: h */
    public ys7 f11171h;

    /* renamed from: i */
    public ot5.InterfaceC15889a f11172i;

    /* renamed from: j */
    public hab f11173j;

    /* renamed from: k */
    public jt3 f11174k;

    /* renamed from: n */
    public jme.InterfaceC14614b f11177n;

    /* renamed from: o */
    public ys7 f11178o;

    /* renamed from: p */
    public boolean f11179p;

    /* renamed from: q */
    public List f11180q;

    /* renamed from: a */
    public final Map f11164a = new vo0();

    /* renamed from: b */
    public final C10727d.a f11165b = new C10727d.a();

    /* renamed from: l */
    public int f11175l = 4;

    /* renamed from: m */
    public ComponentCallbacks2C10724a.a f11176m = new a();

    /* renamed from: com.bumptech.glide.b$a */
    public class a implements ComponentCallbacks2C10724a.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C10724a.a
        public qme build() {
            return new qme();
        }
    }

    /* renamed from: com.bumptech.glide.b$b */
    public static final class b {
    }

    /* renamed from: com.bumptech.glide.b$c */
    public static final class c {
    }

    /* renamed from: com.bumptech.glide.b$d */
    public static final class d {
    }

    /* renamed from: com.bumptech.glide.b$e */
    public static final class e {
    }

    /* renamed from: a */
    public ComponentCallbacks2C10724a m12666a(Context context, List list, jm0 jm0Var) {
        if (this.f11170g == null) {
            this.f11170g = ys7.m58176h();
        }
        if (this.f11171h == null) {
            this.f11171h = ys7.m58174e();
        }
        if (this.f11178o == null) {
            this.f11178o = ys7.m58172c();
        }
        if (this.f11173j == null) {
            this.f11173j = new hab.C13899a(context).m30045a();
        }
        if (this.f11174k == null) {
            this.f11174k = new hd5();
        }
        if (this.f11167d == null) {
            int iM30042b = this.f11173j.m30042b();
            if (iM30042b > 0) {
                this.f11167d = new tma(iM30042b);
            } else {
                this.f11167d = new ni1();
            }
        }
        if (this.f11168e == null) {
            this.f11168e = new rma(this.f11173j.m30041a());
        }
        if (this.f11169f == null) {
            this.f11169f = new bna(this.f11173j.m30043d());
        }
        if (this.f11172i == null) {
            this.f11172i = new bo8(context);
        }
        if (this.f11166c == null) {
            this.f11166c = new yf6(this.f11169f, this.f11172i, this.f11171h, this.f11170g, ys7.m58177i(), this.f11178o, this.f11179p);
        }
        List list2 = this.f11180q;
        if (list2 == null) {
            this.f11180q = Collections.emptyList();
        } else {
            this.f11180q = Collections.unmodifiableList(list2);
        }
        C10727d c10727dM12679b = this.f11165b.m12679b();
        return new ComponentCallbacks2C10724a(context, this.f11166c, this.f11169f, this.f11167d, this.f11168e, new jme(this.f11177n, c10727dM12679b), this.f11174k, this.f11175l, this.f11176m, this.f11164a, this.f11180q, list, jm0Var, c10727dM12679b);
    }

    /* renamed from: b */
    public void m12667b(jme.InterfaceC14614b interfaceC14614b) {
        this.f11177n = interfaceC14614b;
    }
}
