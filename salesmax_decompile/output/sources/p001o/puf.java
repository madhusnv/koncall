package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C10725b;
import com.bumptech.glide.C10726c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.yf6;

/* loaded from: classes5.dex */
public final class puf implements wle, kvf, doe {

    /* renamed from: D */
    public static final boolean f40608D = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f40609A;

    /* renamed from: B */
    public boolean f40610B;

    /* renamed from: C */
    public RuntimeException f40611C;

    /* renamed from: a */
    public int f40612a;

    /* renamed from: b */
    public final String f40613b;

    /* renamed from: c */
    public final h5g f40614c;

    /* renamed from: d */
    public final Object f40615d;

    /* renamed from: e */
    public final bme f40616e;

    /* renamed from: f */
    public final Context f40617f;

    /* renamed from: g */
    public final C10726c f40618g;

    /* renamed from: h */
    public final Object f40619h;

    /* renamed from: i */
    public final Class f40620i;

    /* renamed from: j */
    public final le1 f40621j;

    /* renamed from: k */
    public final int f40622k;

    /* renamed from: l */
    public final int f40623l;

    /* renamed from: m */
    public final gid f40624m;

    /* renamed from: n */
    public final pjg f40625n;

    /* renamed from: o */
    public final List f40626o;

    /* renamed from: p */
    public final nvh f40627p;

    /* renamed from: q */
    public final Executor f40628q;

    /* renamed from: r */
    public zne f40629r;

    /* renamed from: s */
    public yf6.C18398d f40630s;

    /* renamed from: t */
    public long f40631t;

    /* renamed from: u */
    public volatile yf6 f40632u;

    /* renamed from: v */
    public EnumC16196a f40633v;

    /* renamed from: w */
    public Drawable f40634w;

    /* renamed from: x */
    public Drawable f40635x;

    /* renamed from: y */
    public Drawable f40636y;

    /* renamed from: z */
    public int f40637z;

    /* renamed from: o.puf$a */
    public enum EnumC16196a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public puf(Context context, C10726c c10726c, Object obj, Object obj2, Class cls, le1 le1Var, int i, int i2, gid gidVar, pjg pjgVar, gme gmeVar, List list, bme bmeVar, yf6 yf6Var, nvh nvhVar, Executor executor) {
        this.f40613b = f40608D ? String.valueOf(super.hashCode()) : null;
        this.f40614c = h5g.m29827a();
        this.f40615d = obj;
        this.f40617f = context;
        this.f40618g = c10726c;
        this.f40619h = obj2;
        this.f40620i = cls;
        this.f40621j = le1Var;
        this.f40622k = i;
        this.f40623l = i2;
        this.f40624m = gidVar;
        this.f40625n = pjgVar;
        this.f40626o = list;
        this.f40616e = bmeVar;
        this.f40632u = yf6Var;
        this.f40627p = nvhVar;
        this.f40628q = executor;
        this.f40633v = EnumC16196a.PENDING;
        if (this.f40611C == null && c10726c.m12674g().m12677a(C10725b.c.class)) {
            this.f40611C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m44215u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    /* renamed from: x */
    public static puf m44216x(Context context, C10726c c10726c, Object obj, Object obj2, Class cls, le1 le1Var, int i, int i2, gid gidVar, pjg pjgVar, gme gmeVar, List list, bme bmeVar, yf6 yf6Var, nvh nvhVar, Executor executor) {
        return new puf(context, c10726c, obj, obj2, cls, le1Var, i, i2, gidVar, pjgVar, gmeVar, list, bmeVar, yf6Var, nvhVar, executor);
    }

    /* renamed from: A */
    public final void m44217A() {
        if (m44220k()) {
            Drawable drawableM44225p = this.f40619h == null ? m44225p() : null;
            if (drawableM44225p == null) {
                drawableM44225p = m44224o();
            }
            if (drawableM44225p == null) {
                drawableM44225p = m44226q();
            }
            this.f40625n.mo37266j(drawableM44225p);
        }
    }

    @Override // p001o.wle
    /* renamed from: a */
    public boolean mo19377a() {
        boolean z;
        synchronized (this.f40615d) {
            z = this.f40633v == EnumC16196a.COMPLETE;
        }
        return z;
    }

    @Override // p001o.doe
    /* renamed from: b */
    public void mo23650b(zne zneVar, ez4 ez4Var, boolean z) {
        this.f40614c.mo29829c();
        zne zneVar2 = null;
        try {
            synchronized (this.f40615d) {
                try {
                    this.f40630s = null;
                    if (zneVar == null) {
                        mo23651c(new xs7("Expected to receive a Resource<R> with an object of " + this.f40620i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = zneVar.get();
                    try {
                        if (obj != null && this.f40620i.isAssignableFrom(obj.getClass())) {
                            if (m44221l()) {
                                m44233z(zneVar, obj, ez4Var, z);
                                return;
                            }
                            this.f40629r = null;
                            this.f40633v = EnumC16196a.COMPLETE;
                            et7.m25576f("GlideRequest", this.f40612a);
                            this.f40632u.m57748k(zneVar);
                            return;
                        }
                        this.f40629r = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f40620i);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(zneVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        mo23651c(new xs7(sb.toString()));
                        this.f40632u.m57748k(zneVar);
                    } catch (Throwable th) {
                        zneVar2 = zneVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (zneVar2 != null) {
                this.f40632u.m57748k(zneVar2);
            }
            throw th3;
        }
    }

    @Override // p001o.doe
    /* renamed from: c */
    public void mo23651c(xs7 xs7Var) {
        m44232y(xs7Var, 5);
    }

    @Override // p001o.wle
    public void clear() {
        synchronized (this.f40615d) {
            m44218h();
            this.f40614c.mo29829c();
            EnumC16196a enumC16196a = this.f40633v;
            EnumC16196a enumC16196a2 = EnumC16196a.CLEARED;
            if (enumC16196a == enumC16196a2) {
                return;
            }
            m44222m();
            zne zneVar = this.f40629r;
            if (zneVar != null) {
                this.f40629r = null;
            } else {
                zneVar = null;
            }
            if (m44219i()) {
                this.f40625n.mo36385h(m44226q());
            }
            et7.m25576f("GlideRequest", this.f40612a);
            this.f40633v = enumC16196a2;
            if (zneVar != null) {
                this.f40632u.m57748k(zneVar);
            }
        }
    }

    @Override // p001o.wle
    /* renamed from: d */
    public boolean mo43854d(wle wleVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        le1 le1Var;
        gid gidVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        le1 le1Var2;
        gid gidVar2;
        int size2;
        if (!(wleVar instanceof puf)) {
            return false;
        }
        synchronized (this.f40615d) {
            i = this.f40622k;
            i2 = this.f40623l;
            obj = this.f40619h;
            cls = this.f40620i;
            le1Var = this.f40621j;
            gidVar = this.f40624m;
            List list = this.f40626o;
            size = list != null ? list.size() : 0;
        }
        puf pufVar = (puf) wleVar;
        synchronized (pufVar.f40615d) {
            i3 = pufVar.f40622k;
            i4 = pufVar.f40623l;
            obj2 = pufVar.f40619h;
            cls2 = pufVar.f40620i;
            le1Var2 = pufVar.f40621j;
            gidVar2 = pufVar.f40624m;
            List list2 = pufVar.f40626o;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && uqi.m51921b(obj, obj2) && cls.equals(cls2) && le1Var.equals(le1Var2) && gidVar == gidVar2 && size == size2;
    }

    @Override // p001o.kvf
    /* renamed from: e */
    public void mo36260e(int i, int i2) throws Throwable {
        Object obj;
        this.f40614c.mo29829c();
        Object obj2 = this.f40615d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f40608D;
                    if (z) {
                        m44229t("Got onSizeReady in " + lja.m37349a(this.f40631t));
                    }
                    if (this.f40633v == EnumC16196a.WAITING_FOR_SIZE) {
                        EnumC16196a enumC16196a = EnumC16196a.RUNNING;
                        this.f40633v = enumC16196a;
                        float fM36992A = this.f40621j.m36992A();
                        this.f40637z = m44215u(i, fM36992A);
                        this.f40609A = m44215u(i2, fM36992A);
                        if (z) {
                            m44229t("finished setup for calling load in " + lja.m37349a(this.f40631t));
                        }
                        obj = obj2;
                        try {
                            this.f40630s = this.f40632u.m57744f(this.f40618g, this.f40619h, this.f40621j.m37025z(), this.f40637z, this.f40609A, this.f40621j.m37024y(), this.f40620i, this.f40624m, this.f40621j.m37012k(), this.f40621j.m36994C(), this.f40621j.m37003M(), this.f40621j.m37000I(), this.f40621j.m37018s(), this.f40621j.m36998G(), this.f40621j.m36996E(), this.f40621j.m36995D(), this.f40621j.m37017q(), this, this.f40628q);
                            if (this.f40633v != enumC16196a) {
                                this.f40630s = null;
                            }
                            if (z) {
                                m44229t("finished onSizeReady in " + lja.m37349a(this.f40631t));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // p001o.wle
    /* renamed from: f */
    public boolean mo43855f() {
        boolean z;
        synchronized (this.f40615d) {
            z = this.f40633v == EnumC16196a.CLEARED;
        }
        return z;
    }

    @Override // p001o.doe
    /* renamed from: g */
    public Object mo23652g() {
        this.f40614c.mo29829c();
        return this.f40615d;
    }

    /* renamed from: h */
    public final void m44218h() {
        if (this.f40610B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: i */
    public final boolean m44219i() {
        bme bmeVar = this.f40616e;
        return bmeVar == null || bmeVar.mo19383i(this);
    }

    @Override // p001o.wle
    public boolean isComplete() {
        boolean z;
        synchronized (this.f40615d) {
            z = this.f40633v == EnumC16196a.COMPLETE;
        }
        return z;
    }

    @Override // p001o.wle
    public boolean isRunning() {
        boolean z;
        synchronized (this.f40615d) {
            EnumC16196a enumC16196a = this.f40633v;
            z = enumC16196a == EnumC16196a.RUNNING || enumC16196a == EnumC16196a.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // p001o.wle
    /* renamed from: j */
    public void mo43856j() {
        synchronized (this.f40615d) {
            m44218h();
            this.f40614c.mo29829c();
            this.f40631t = lja.m37350b();
            Object obj = this.f40619h;
            if (obj == null) {
                if (uqi.m51938s(this.f40622k, this.f40623l)) {
                    this.f40637z = this.f40622k;
                    this.f40609A = this.f40623l;
                }
                m44232y(new xs7("Received null model"), m44225p() == null ? 5 : 3);
                return;
            }
            EnumC16196a enumC16196a = this.f40633v;
            EnumC16196a enumC16196a2 = EnumC16196a.RUNNING;
            if (enumC16196a == enumC16196a2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (enumC16196a == EnumC16196a.COMPLETE) {
                mo23650b(this.f40629r, ez4.MEMORY_CACHE, false);
                return;
            }
            m44223n(obj);
            this.f40612a = et7.m25572b("GlideRequest");
            EnumC16196a enumC16196a3 = EnumC16196a.WAITING_FOR_SIZE;
            this.f40633v = enumC16196a3;
            if (uqi.m51938s(this.f40622k, this.f40623l)) {
                mo36260e(this.f40622k, this.f40623l);
            } else {
                this.f40625n.mo36383e(this);
            }
            EnumC16196a enumC16196a4 = this.f40633v;
            if ((enumC16196a4 == enumC16196a2 || enumC16196a4 == enumC16196a3) && m44220k()) {
                this.f40625n.mo36384g(m44226q());
            }
            if (f40608D) {
                m44229t("finished run method in " + lja.m37349a(this.f40631t));
            }
        }
    }

    /* renamed from: k */
    public final boolean m44220k() {
        bme bmeVar = this.f40616e;
        return bmeVar == null || bmeVar.mo19382h(this);
    }

    /* renamed from: l */
    public final boolean m44221l() {
        bme bmeVar = this.f40616e;
        return bmeVar == null || bmeVar.mo19381g(this);
    }

    /* renamed from: m */
    public final void m44222m() {
        m44218h();
        this.f40614c.mo29829c();
        this.f40625n.mo36381b(this);
        yf6.C18398d c18398d = this.f40630s;
        if (c18398d != null) {
            c18398d.m57754a();
            this.f40630s = null;
        }
    }

    /* renamed from: n */
    public final void m44223n(Object obj) {
        List list = this.f40626o;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tq.m50332a(it.next());
        }
    }

    /* renamed from: o */
    public final Drawable m44224o() {
        if (this.f40634w == null) {
            Drawable drawableM37014m = this.f40621j.m37014m();
            this.f40634w = drawableM37014m;
            if (drawableM37014m == null && this.f40621j.m37013l() > 0) {
                this.f40634w = m44228s(this.f40621j.m37013l());
            }
        }
        return this.f40634w;
    }

    /* renamed from: p */
    public final Drawable m44225p() {
        if (this.f40636y == null) {
            Drawable drawableM37015n = this.f40621j.m37015n();
            this.f40636y = drawableM37015n;
            if (drawableM37015n == null && this.f40621j.m37016p() > 0) {
                this.f40636y = m44228s(this.f40621j.m37016p());
            }
        }
        return this.f40636y;
    }

    @Override // p001o.wle
    public void pause() {
        synchronized (this.f40615d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: q */
    public final Drawable m44226q() {
        if (this.f40635x == null) {
            Drawable drawableM37021v = this.f40621j.m37021v();
            this.f40635x = drawableM37021v;
            if (drawableM37021v == null && this.f40621j.m37022w() > 0) {
                this.f40635x = m44228s(this.f40621j.m37022w());
            }
        }
        return this.f40635x;
    }

    /* renamed from: r */
    public final boolean m44227r() {
        bme bmeVar = this.f40616e;
        return bmeVar == null || !bmeVar.mo19378b().mo19377a();
    }

    /* renamed from: s */
    public final Drawable m44228s(int i) {
        return iy5.m32904a(this.f40618g, i, this.f40621j.m36993B() != null ? this.f40621j.m36993B() : this.f40617f.getTheme());
    }

    /* renamed from: t */
    public final void m44229t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f40613b);
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f40615d) {
            obj = this.f40619h;
            cls = this.f40620i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: v */
    public final void m44230v() {
        bme bmeVar = this.f40616e;
        if (bmeVar != null) {
            bmeVar.mo19380e(this);
        }
    }

    /* renamed from: w */
    public final void m44231w() {
        bme bmeVar = this.f40616e;
        if (bmeVar != null) {
            bmeVar.mo19379c(this);
        }
    }

    /* renamed from: y */
    public final void m44232y(xs7 xs7Var, int i) {
        this.f40614c.mo29829c();
        synchronized (this.f40615d) {
            xs7Var.m56771k(this.f40611C);
            int iM12675h = this.f40618g.m12675h();
            if (iM12675h <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for [");
                sb.append(this.f40619h);
                sb.append("] with dimensions [");
                sb.append(this.f40637z);
                sb.append("x");
                sb.append(this.f40609A);
                sb.append("]");
                if (iM12675h <= 4) {
                    xs7Var.m56767g("Glide");
                }
            }
            this.f40630s = null;
            this.f40633v = EnumC16196a.FAILED;
            m44230v();
            this.f40610B = true;
            try {
                List list = this.f40626o;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        tq.m50332a(it.next());
                        m44227r();
                        throw null;
                    }
                }
                if (!(false | false)) {
                    m44217A();
                }
                this.f40610B = false;
                et7.m25576f("GlideRequest", this.f40612a);
            } catch (Throwable th) {
                this.f40610B = false;
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final void m44233z(zne zneVar, Object obj, ez4 ez4Var, boolean z) {
        boolean zM44227r = m44227r();
        this.f40633v = EnumC16196a.COMPLETE;
        this.f40629r = zneVar;
        if (this.f40618g.m12675h() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(ez4Var);
            sb.append(" for ");
            sb.append(this.f40619h);
            sb.append(" with size [");
            sb.append(this.f40637z);
            sb.append("x");
            sb.append(this.f40609A);
            sb.append("] in ");
            sb.append(lja.m37349a(this.f40631t));
            sb.append(" ms");
        }
        m44231w();
        this.f40610B = true;
        try {
            List list = this.f40626o;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    tq.m50332a(it.next());
                    throw null;
                }
            }
            if (!(false | false)) {
                this.f40625n.mo40415i(obj, this.f40627p.mo29638a(ez4Var, zM44227r));
            }
            this.f40610B = false;
            et7.m25576f("GlideRequest", this.f40612a);
        } catch (Throwable th) {
            this.f40610B = false;
            throw th;
        }
    }
}
