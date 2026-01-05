package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.bhf;
import p001o.cd2;
import p001o.l51;

/* loaded from: classes2.dex */
public final class bhf {

    /* renamed from: j */
    public static final List f16259j = Arrays.asList(1, 5, 3);

    /* renamed from: a */
    public final List f16260a;

    /* renamed from: b */
    public final AbstractC12406f f16261b;

    /* renamed from: c */
    public final List f16262c;

    /* renamed from: d */
    public final List f16263d;

    /* renamed from: e */
    public final List f16264e;

    /* renamed from: f */
    public final InterfaceC12404d f16265f;

    /* renamed from: g */
    public final cd2 f16266g;

    /* renamed from: h */
    public final int f16267h;

    /* renamed from: i */
    public InputConfiguration f16268i;

    /* renamed from: o.bhf$a */
    public static class C12401a {

        /* renamed from: f */
        public InterfaceC12404d f16274f;

        /* renamed from: g */
        public InputConfiguration f16275g;

        /* renamed from: i */
        public AbstractC12406f f16277i;

        /* renamed from: a */
        public final Set f16269a = new LinkedHashSet();

        /* renamed from: b */
        public final cd2.C12638a f16270b = new cd2.C12638a();

        /* renamed from: c */
        public final List f16271c = new ArrayList();

        /* renamed from: d */
        public final List f16272d = new ArrayList();

        /* renamed from: e */
        public final List f16273e = new ArrayList();

        /* renamed from: h */
        public int f16276h = 0;
    }

    /* renamed from: o.bhf$b */
    public static class C12402b extends C12401a {
        /* renamed from: p */
        public static C12402b m19037p(c9i c9iVar, Size size) {
            InterfaceC12405e interfaceC12405eM20536r = c9iVar.m20536r(null);
            if (interfaceC12405eM20536r != null) {
                C12402b c12402b = new C12402b();
                interfaceC12405eM20536r.mo19064a(size, c9iVar, c12402b);
                return c12402b;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + c9iVar.m48394p(c9iVar.toString()));
        }

        /* renamed from: a */
        public C12402b m19038a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j72 j72Var = (j72) it.next();
                this.f16270b.m20896c(j72Var);
                if (!this.f16273e.contains(j72Var)) {
                    this.f16273e.add(j72Var);
                }
            }
            return this;
        }

        /* renamed from: b */
        public C12402b m19039b(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                m19043f((CameraDevice.StateCallback) it.next());
            }
            return this;
        }

        /* renamed from: c */
        public C12402b m19040c(Collection collection) {
            this.f16270b.m20894a(collection);
            return this;
        }

        /* renamed from: d */
        public C12402b m19041d(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m19048k((CameraCaptureSession.StateCallback) it.next());
            }
            return this;
        }

        /* renamed from: e */
        public C12402b m19042e(j72 j72Var) {
            this.f16270b.m20896c(j72Var);
            if (!this.f16273e.contains(j72Var)) {
                this.f16273e.add(j72Var);
            }
            return this;
        }

        /* renamed from: f */
        public C12402b m19043f(CameraDevice.StateCallback stateCallback) {
            if (this.f16271c.contains(stateCallback)) {
                return this;
            }
            this.f16271c.add(stateCallback);
            return this;
        }

        /* renamed from: g */
        public C12402b m19044g(mq3 mq3Var) {
            this.f16270b.m20898e(mq3Var);
            return this;
        }

        /* renamed from: h */
        public C12402b m19045h(yj5 yj5Var) {
            return m19046i(yj5Var, y16.f54703d);
        }

        /* renamed from: i */
        public C12402b m19046i(yj5 yj5Var, y16 y16Var) {
            this.f16269a.add(AbstractC12406f.m19065a(yj5Var).mo19073b(y16Var).mo19072a());
            return this;
        }

        /* renamed from: j */
        public C12402b m19047j(j72 j72Var) {
            this.f16270b.m20896c(j72Var);
            return this;
        }

        /* renamed from: k */
        public C12402b m19048k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f16272d.contains(stateCallback)) {
                return this;
            }
            this.f16272d.add(stateCallback);
            return this;
        }

        /* renamed from: l */
        public C12402b m19049l(yj5 yj5Var) {
            return m19050m(yj5Var, y16.f54703d, null, -1);
        }

        /* renamed from: m */
        public C12402b m19050m(yj5 yj5Var, y16 y16Var, String str, int i) {
            this.f16269a.add(AbstractC12406f.m19065a(yj5Var).mo19075d(str).mo19073b(y16Var).mo19074c(i).mo19072a());
            this.f16270b.m20899f(yj5Var);
            return this;
        }

        /* renamed from: n */
        public C12402b m19051n(String str, Object obj) {
            this.f16270b.m20900g(str, obj);
            return this;
        }

        /* renamed from: o */
        public bhf m19052o() {
            return new bhf(new ArrayList(this.f16269a), new ArrayList(this.f16271c), new ArrayList(this.f16272d), new ArrayList(this.f16273e), this.f16270b.m20901h(), this.f16274f, this.f16275g, this.f16276h, this.f16277i);
        }

        /* renamed from: q */
        public List m19053q() {
            return Collections.unmodifiableList(this.f16273e);
        }

        /* renamed from: r */
        public C12402b m19054r(InterfaceC12404d interfaceC12404d) {
            this.f16274f = interfaceC12404d;
            return this;
        }

        /* renamed from: s */
        public C12402b m19055s(Range range) {
            this.f16270b.m20906o(range);
            return this;
        }

        /* renamed from: t */
        public C12402b m19056t(mq3 mq3Var) {
            this.f16270b.m20908q(mq3Var);
            return this;
        }

        /* renamed from: u */
        public C12402b m19057u(InputConfiguration inputConfiguration) {
            this.f16275g = inputConfiguration;
            return this;
        }

        /* renamed from: v */
        public C12402b m19058v(yj5 yj5Var) {
            this.f16277i = AbstractC12406f.m19065a(yj5Var).mo19072a();
            return this;
        }

        /* renamed from: w */
        public C12402b m19059w(int i) {
            if (i != 0) {
                this.f16270b.m20910s(i);
            }
            return this;
        }

        /* renamed from: x */
        public C12402b m19060x(int i) {
            this.f16270b.m20911t(i);
            return this;
        }

        /* renamed from: y */
        public C12402b m19061y(int i) {
            if (i != 0) {
                this.f16270b.m20913v(i);
            }
            return this;
        }
    }

    /* renamed from: o.bhf$c */
    public static final class C12403c implements InterfaceC12404d {

        /* renamed from: a */
        public final AtomicBoolean f16278a = new AtomicBoolean(false);

        /* renamed from: b */
        public final InterfaceC12404d f16279b;

        public C12403c(InterfaceC12404d interfaceC12404d) {
            this.f16279b = interfaceC12404d;
        }

        @Override // p001o.bhf.InterfaceC12404d
        /* renamed from: a */
        public void mo19062a(bhf bhfVar, EnumC12407g enumC12407g) {
            if (this.f16278a.get()) {
                return;
            }
            this.f16279b.mo19062a(bhfVar, enumC12407g);
        }

        /* renamed from: b */
        public void m19063b() {
            this.f16278a.set(true);
        }
    }

    /* renamed from: o.bhf$d */
    public interface InterfaceC12404d {
        /* renamed from: a */
        void mo19062a(bhf bhfVar, EnumC12407g enumC12407g);
    }

    /* renamed from: o.bhf$e */
    public interface InterfaceC12405e {
        /* renamed from: a */
        void mo19064a(Size size, c9i c9iVar, C12402b c12402b);
    }

    /* renamed from: o.bhf$f */
    public static abstract class AbstractC12406f {

        /* renamed from: o.bhf$f$a */
        public static abstract class a {
            /* renamed from: a */
            public abstract AbstractC12406f mo19072a();

            /* renamed from: b */
            public abstract a mo19073b(y16 y16Var);

            /* renamed from: c */
            public abstract a mo19074c(int i);

            /* renamed from: d */
            public abstract a mo19075d(String str);

            /* renamed from: e */
            public abstract a mo19076e(List list);

            /* renamed from: f */
            public abstract a mo19077f(int i);
        }

        /* renamed from: a */
        public static a m19065a(yj5 yj5Var) {
            return new l51.C15000b().m36584g(yj5Var).mo19076e(Collections.emptyList()).mo19075d(null).mo19074c(-1).mo19077f(-1).mo19073b(y16.f54703d);
        }

        /* renamed from: b */
        public abstract y16 mo19066b();

        /* renamed from: c */
        public abstract int mo19067c();

        /* renamed from: d */
        public abstract String mo19068d();

        /* renamed from: e */
        public abstract List mo19069e();

        /* renamed from: f */
        public abstract yj5 mo19070f();

        /* renamed from: g */
        public abstract int mo19071g();
    }

    /* renamed from: o.bhf$g */
    public enum EnumC12407g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: o.bhf$h */
    public static final class C12408h extends C12401a {

        /* renamed from: j */
        public final egg f16280j = new egg();

        /* renamed from: k */
        public boolean f16281k = true;

        /* renamed from: l */
        public boolean f16282l = false;

        /* renamed from: m */
        public List f16283m = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m19079f(bhf bhfVar, EnumC12407g enumC12407g) {
            Iterator it = this.f16283m.iterator();
            while (it.hasNext()) {
                ((InterfaceC12404d) it.next()).mo19062a(bhfVar, enumC12407g);
            }
        }

        /* renamed from: b */
        public void m19080b(bhf bhfVar) {
            cd2 cd2VarM19031j = bhfVar.m19031j();
            if (cd2VarM19031j.m20889k() != -1) {
                this.f16282l = true;
                this.f16270b.m20911t(bhf.m19024e(cd2VarM19031j.m20889k(), this.f16270b.m20904m()));
            }
            m19084g(cd2VarM19031j.m20883e());
            m19085h(cd2VarM19031j.m20886h());
            m19086i(cd2VarM19031j.m20890l());
            this.f16270b.m20895b(bhfVar.m19031j().m20888j());
            this.f16271c.addAll(bhfVar.m19025c());
            this.f16272d.addAll(bhfVar.m19032k());
            this.f16270b.m20894a(bhfVar.m19030i());
            this.f16273e.addAll(bhfVar.m19034m());
            if (bhfVar.m19026d() != null) {
                this.f16283m.add(bhfVar.m19026d());
            }
            if (bhfVar.m19028g() != null) {
                this.f16275g = bhfVar.m19028g();
            }
            this.f16269a.addAll(bhfVar.m19029h());
            this.f16270b.m20903l().addAll(cd2VarM19031j.m20887i());
            if (!m19082d().containsAll(this.f16270b.m20903l())) {
                wja.m54627a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f16281k = false;
            }
            if (bhfVar.m19033l() != this.f16276h && bhfVar.m19033l() != 0 && this.f16276h != 0) {
                wja.m54627a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f16281k = false;
            } else if (bhfVar.m19033l() != 0) {
                this.f16276h = bhfVar.m19033l();
            }
            if (bhfVar.f16261b != null) {
                if (this.f16277i == bhfVar.f16261b || this.f16277i == null) {
                    this.f16277i = bhfVar.f16261b;
                } else {
                    wja.m54627a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f16281k = false;
                }
            }
            this.f16270b.m20898e(cd2VarM19031j.m20885g());
        }

        /* renamed from: c */
        public bhf m19081c() {
            if (!this.f16281k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f16269a);
            this.f16280j.m24981d(arrayList);
            return new bhf(arrayList, new ArrayList(this.f16271c), new ArrayList(this.f16272d), new ArrayList(this.f16273e), this.f16270b.m20901h(), !this.f16283m.isEmpty() ? new InterfaceC12404d() { // from class: o.chf
                @Override // p001o.bhf.InterfaceC12404d
                /* renamed from: a */
                public final void mo19062a(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
                    this.f18197a.m19079f(bhfVar, enumC12407g);
                }
            } : null, this.f16275g, this.f16276h, this.f16277i);
        }

        /* renamed from: d */
        public final List m19082d() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC12406f abstractC12406f : this.f16269a) {
                arrayList.add(abstractC12406f.mo19070f());
                Iterator it = abstractC12406f.mo19069e().iterator();
                while (it.hasNext()) {
                    arrayList.add((yj5) it.next());
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        public boolean m19083e() {
            return this.f16282l && this.f16281k;
        }

        /* renamed from: g */
        public final void m19084g(Range range) {
            Range range2 = k7g.f31605a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f16270b.m20902k().equals(range2)) {
                this.f16270b.m20906o(range);
            } else {
                if (this.f16270b.m20902k().equals(range)) {
                    return;
                }
                this.f16281k = false;
                wja.m54627a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        /* renamed from: h */
        public final void m19085h(int i) {
            if (i != 0) {
                this.f16270b.m20910s(i);
            }
        }

        /* renamed from: i */
        public final void m19086i(int i) {
            if (i != 0) {
                this.f16270b.m20913v(i);
            }
        }
    }

    public bhf(List list, List list2, List list3, List list4, cd2 cd2Var, InterfaceC12404d interfaceC12404d, InputConfiguration inputConfiguration, int i, AbstractC12406f abstractC12406f) {
        this.f16260a = list;
        this.f16262c = Collections.unmodifiableList(list2);
        this.f16263d = Collections.unmodifiableList(list3);
        this.f16264e = Collections.unmodifiableList(list4);
        this.f16265f = interfaceC12404d;
        this.f16266g = cd2Var;
        this.f16268i = inputConfiguration;
        this.f16267h = i;
        this.f16261b = abstractC12406f;
    }

    /* renamed from: b */
    public static bhf m19023b() {
        return new bhf(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new cd2.C12638a().m20901h(), null, null, 0, null);
    }

    /* renamed from: e */
    public static int m19024e(int i, int i2) {
        List list = f16259j;
        return list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2)) ? i : i2;
    }

    /* renamed from: c */
    public List m19025c() {
        return this.f16262c;
    }

    /* renamed from: d */
    public InterfaceC12404d m19026d() {
        return this.f16265f;
    }

    /* renamed from: f */
    public mq3 m19027f() {
        return this.f16266g.m20885g();
    }

    /* renamed from: g */
    public InputConfiguration m19028g() {
        return this.f16268i;
    }

    /* renamed from: h */
    public List m19029h() {
        return this.f16260a;
    }

    /* renamed from: i */
    public List m19030i() {
        return this.f16266g.m20881c();
    }

    /* renamed from: j */
    public cd2 m19031j() {
        return this.f16266g;
    }

    /* renamed from: k */
    public List m19032k() {
        return this.f16263d;
    }

    /* renamed from: l */
    public int m19033l() {
        return this.f16267h;
    }

    /* renamed from: m */
    public List m19034m() {
        return this.f16264e;
    }

    /* renamed from: n */
    public List m19035n() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC12406f abstractC12406f : this.f16260a) {
            arrayList.add(abstractC12406f.mo19070f());
            Iterator it = abstractC12406f.mo19069e().iterator();
            while (it.hasNext()) {
                arrayList.add((yj5) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: o */
    public int m19036o() {
        return this.f16266g.m20889k();
    }
}
