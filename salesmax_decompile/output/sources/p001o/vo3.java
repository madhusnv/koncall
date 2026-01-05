package p001o;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.C2181a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p001o.iui;
import p001o.mhd;
import p001o.mui;
import p001o.uj7;
import p001o.vo3;
import p001o.zui;

/* loaded from: classes2.dex */
public final class vo3 implements avi, nui {

    /* renamed from: n */
    public static final Executor f50623n = new Executor() { // from class: o.uo3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            vo3.m53079D(runnable);
        }
    };

    /* renamed from: a */
    public final Context f50624a;

    /* renamed from: b */
    public final C17640h f50625b;

    /* renamed from: c */
    public final jui f50626c;

    /* renamed from: d */
    public final mui f50627d;

    /* renamed from: e */
    public final mhd.InterfaceC15325a f50628e;

    /* renamed from: f */
    public final jb3 f50629f;

    /* renamed from: g */
    public final CopyOnWriteArraySet f50630g;

    /* renamed from: h */
    public C2181a f50631h;

    /* renamed from: i */
    public gui f50632i;

    /* renamed from: j */
    public uw7 f50633j;

    /* renamed from: k */
    public Pair f50634k;

    /* renamed from: l */
    public int f50635l;

    /* renamed from: m */
    public int f50636m;

    /* renamed from: o.vo3$b */
    public static final class C17634b {

        /* renamed from: a */
        public final Context f50637a;

        /* renamed from: b */
        public final jui f50638b;

        /* renamed from: c */
        public iui.InterfaceC14377a f50639c;

        /* renamed from: d */
        public mhd.InterfaceC15325a f50640d;

        /* renamed from: e */
        public jb3 f50641e = jb3.f30077a;

        /* renamed from: f */
        public boolean f50642f;

        public C17634b(Context context, jui juiVar) {
            this.f50637a = context.getApplicationContext();
            this.f50638b = juiVar;
        }

        /* renamed from: e */
        public vo3 m53117e() {
            op0.m42517g(!this.f50642f);
            if (this.f50640d == null) {
                if (this.f50639c == null) {
                    this.f50639c = new C17637e();
                }
                this.f50640d = new C17638f(this.f50639c);
            }
            vo3 vo3Var = new vo3(this);
            this.f50642f = true;
            return vo3Var;
        }

        /* renamed from: f */
        public C17634b m53118f(jb3 jb3Var) {
            this.f50641e = jb3Var;
            return this;
        }
    }

    /* renamed from: o.vo3$c */
    public final class C17635c implements mui.InterfaceC15435a {
        public C17635c() {
        }

        @Override // p001o.mui.InterfaceC15435a
        /* renamed from: a */
        public void mo39711a() {
            Iterator it = vo3.this.f50630g.iterator();
            while (it.hasNext()) {
                ((InterfaceC17636d) it.next()).mo53119a(vo3.this);
            }
            vo3.m53094q(vo3.this);
            tq.m50332a(op0.m42519i(null));
            throw null;
        }

        @Override // p001o.mui.InterfaceC15435a
        /* renamed from: b */
        public void mo39712b(long j, long j2, long j3, boolean z) {
            if (z && vo3.this.f50634k != null) {
                Iterator it = vo3.this.f50630g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC17636d) it.next()).mo53121w(vo3.this);
                }
            }
            if (vo3.this.f50632i != null) {
                vo3.this.f50632i.mo7199e(j2, vo3.this.f50629f.nanoTime(), vo3.this.f50631h == null ? new C2181a.b().m6748K() : vo3.this.f50631h, null);
            }
            vo3.m53094q(vo3.this);
            tq.m50332a(op0.m42519i(null));
            throw null;
        }

        @Override // p001o.mui.InterfaceC15435a
        /* renamed from: c */
        public void mo39713c(bvi bviVar) {
            vo3.this.f50631h = new C2181a.b().v0(bviVar.f16883a).m6762Y(bviVar.f16884b).o0("video/raw").m6748K();
            Iterator it = vo3.this.f50630g.iterator();
            while (it.hasNext()) {
                ((InterfaceC17636d) it.next()).mo53120l(vo3.this, bviVar);
            }
        }
    }

    /* renamed from: o.vo3$d */
    public interface InterfaceC17636d {
        /* renamed from: a */
        void mo53119a(vo3 vo3Var);

        /* renamed from: l */
        void mo53120l(vo3 vo3Var, bvi bviVar);

        /* renamed from: w */
        void mo53121w(vo3 vo3Var);
    }

    /* renamed from: o.vo3$e */
    public static final class C17637e implements iui.InterfaceC14377a {

        /* renamed from: a */
        public static final hdg f50644a = ldg.m36986a(new hdg() { // from class: o.wo3
            @Override // p001o.hdg
            public final Object get() {
                return vo3.C17637e.m53123b();
            }
        });

        public C17637e() {
        }

        /* renamed from: b */
        public static /* synthetic */ iui.InterfaceC14377a m53123b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (iui.InterfaceC14377a) op0.m42515e(cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: o.vo3$f */
    public static final class C17638f implements mhd.InterfaceC15325a {

        /* renamed from: a */
        public final iui.InterfaceC14377a f50645a;

        public C17638f(iui.InterfaceC14377a interfaceC14377a) {
            this.f50645a = interfaceC14377a;
        }

        @Override // p001o.mhd.InterfaceC15325a
        /* renamed from: a */
        public mhd mo39070a(Context context, ph3 ph3Var, r75 r75Var, nui nuiVar, Executor executor, List list, long j) throws NoSuchMethodException, SecurityException, hui {
            try {
                Constructor<?> constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(iui.InterfaceC14377a.class);
                Object[] objArr = new Object[1];
                try {
                    objArr[0] = this.f50645a;
                    ((mhd.InterfaceC15325a) constructor.newInstance(objArr)).mo39070a(context, ph3Var, r75Var, nuiVar, executor, list, j);
                    return null;
                } catch (Exception e) {
                    e = e;
                    throw hui.m31158a(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    /* renamed from: o.vo3$g */
    public static final class C17639g {

        /* renamed from: a */
        public static Constructor f50646a;

        /* renamed from: b */
        public static Method f50647b;

        /* renamed from: c */
        public static Method f50648c;

        /* renamed from: a */
        public static j46 m53124a(float f) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            try {
                m53125b();
                Object objNewInstance = f50646a.newInstance(new Object[0]);
                f50647b.invoke(objNewInstance, Float.valueOf(f));
                tq.m50332a(op0.m42515e(f50648c.invoke(objNewInstance, new Object[0])));
                return null;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        /* renamed from: b */
        public static void m53125b() throws ClassNotFoundException {
            if (f50646a == null || f50647b == null || f50648c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f50646a = cls.getConstructor(new Class[0]);
                f50647b = cls.getMethod("setRotationDegrees", Float.TYPE);
                f50648c = cls.getMethod("build", new Class[0]);
            }
        }
    }

    /* renamed from: o.vo3$h */
    public final class C17640h implements zui, InterfaceC17636d {

        /* renamed from: a */
        public final Context f50649a;

        /* renamed from: b */
        public final int f50650b;

        /* renamed from: d */
        public C2181a f50652d;

        /* renamed from: e */
        public int f50653e;

        /* renamed from: f */
        public long f50654f;

        /* renamed from: g */
        public long f50655g;

        /* renamed from: h */
        public boolean f50656h;

        /* renamed from: k */
        public boolean f50659k;

        /* renamed from: l */
        public long f50660l;

        /* renamed from: c */
        public final ArrayList f50651c = new ArrayList();

        /* renamed from: i */
        public long f50657i = -9223372036854775807L;

        /* renamed from: j */
        public long f50658j = -9223372036854775807L;

        /* renamed from: m */
        public zui.InterfaceC18713a f50661m = zui.InterfaceC18713a.f57733a;

        /* renamed from: n */
        public Executor f50662n = vo3.f50623n;

        public C17640h(Context context) {
            this.f50649a = context;
            this.f50650b = sqi.d0(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m53126A(zui.InterfaceC18713a interfaceC18713a) {
            interfaceC18713a.mo36455c(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public /* synthetic */ void m53127B(zui.InterfaceC18713a interfaceC18713a) {
            interfaceC18713a.mo36454b((zui) op0.m42519i(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public /* synthetic */ void m53128C(zui.InterfaceC18713a interfaceC18713a, bvi bviVar) {
            interfaceC18713a.mo36453a(this, bviVar);
        }

        /* renamed from: D */
        public final void m53132D() {
            if (this.f50652d == null) {
                return;
            }
            new ArrayList().addAll(this.f50651c);
            C2181a c2181a = (C2181a) op0.m42515e(this.f50652d);
            tq.m50332a(op0.m42519i(null));
            new uj7.C17385b(vo3.m53098y(c2181a.f7918A), c2181a.f7949t, c2181a.f7950u).m51649b(c2181a.f7953x).m51648a();
            throw null;
        }

        /* renamed from: E */
        public void m53133E(List list) {
            this.f50651c.clear();
            this.f50651c.addAll(list);
        }

        @Override // p001o.vo3.InterfaceC17636d
        /* renamed from: a */
        public void mo53119a(vo3 vo3Var) {
            final zui.InterfaceC18713a interfaceC18713a = this.f50661m;
            this.f50662n.execute(new Runnable() { // from class: o.xo3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53991a.m53127B(interfaceC18713a);
                }
            });
        }

        @Override // p001o.zui
        /* renamed from: b */
        public boolean mo53134b() {
            if (isInitialized()) {
                long j = this.f50657i;
                if (j != -9223372036854775807L && vo3.this.m53112z(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p001o.zui
        /* renamed from: c */
        public void mo53135c() {
            vo3.this.f50626c.m34540a();
        }

        @Override // p001o.zui
        /* renamed from: d */
        public void mo53136d(gui guiVar) {
            vo3.this.m53107J(guiVar);
        }

        @Override // p001o.zui
        /* renamed from: e */
        public long mo53137e(long j, boolean z) {
            op0.m42517g(isInitialized());
            op0.m42517g(this.f50650b != -1);
            long j2 = this.f50660l;
            if (j2 != -9223372036854775807L) {
                if (!vo3.this.m53112z(j2)) {
                    return -9223372036854775807L;
                }
                m53132D();
                this.f50660l = -9223372036854775807L;
            }
            tq.m50332a(op0.m42519i(null));
            throw null;
        }

        @Override // p001o.zui
        /* renamed from: f */
        public void mo53138f() {
            vo3.this.f50626c.m34551l();
        }

        @Override // p001o.zui
        /* renamed from: g */
        public void mo53139g(long j, long j2) throws zui.C18714b {
            try {
                vo3.this.m53104G(j, j2);
            } catch (qm6 e) {
                C2181a c2181aM6748K = this.f50652d;
                if (c2181aM6748K == null) {
                    c2181aM6748K = new C2181a.b().m6748K();
                }
                throw new zui.C18714b(e, c2181aM6748K);
            }
        }

        @Override // p001o.zui
        /* renamed from: h */
        public void mo53140h(List list) {
            if (this.f50651c.equals(list)) {
                return;
            }
            m53133E(list);
            m53132D();
        }

        @Override // p001o.zui
        /* renamed from: i */
        public void mo53141i(float f) {
            vo3.this.m53106I(f);
        }

        @Override // p001o.zui
        public boolean isInitialized() {
            return false;
        }

        @Override // p001o.zui
        public boolean isReady() {
            return isInitialized() && vo3.this.m53101C();
        }

        @Override // p001o.zui
        /* renamed from: j */
        public void mo53142j(int i, C2181a c2181a) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            int i2;
            op0.m42517g(isInitialized());
            if (i != 1 && i != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i);
            }
            vo3.this.f50626c.m34555p(c2181a.f7951v);
            if (i == 1 && sqi.f45790a < 21 && (i2 = c2181a.f7952w) != -1 && i2 != 0) {
                C17639g.m53124a(i2);
            }
            this.f50653e = i;
            this.f50652d = c2181a;
            if (this.f50659k) {
                op0.m42517g(this.f50658j != -9223372036854775807L);
                this.f50660l = this.f50658j;
            } else {
                m53132D();
                this.f50659k = true;
                this.f50660l = -9223372036854775807L;
            }
        }

        @Override // p001o.zui
        /* renamed from: k */
        public void mo53143k(long j, long j2) {
            this.f50656h |= (this.f50654f == j && this.f50655g == j2) ? false : true;
            this.f50654f = j;
            this.f50655g = j2;
        }

        @Override // p001o.vo3.InterfaceC17636d
        /* renamed from: l */
        public void mo53120l(vo3 vo3Var, final bvi bviVar) {
            final zui.InterfaceC18713a interfaceC18713a = this.f50661m;
            this.f50662n.execute(new Runnable() { // from class: o.yo3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55753a.m53128C(interfaceC18713a, bviVar);
                }
            });
        }

        @Override // p001o.zui
        /* renamed from: m */
        public boolean mo53144m() {
            return sqi.G0(this.f50649a);
        }

        @Override // p001o.zui
        /* renamed from: n */
        public void mo53145n(C2181a c2181a) throws zui.C18714b {
            op0.m42517g(!isInitialized());
            vo3.m53097t(vo3.this, c2181a);
        }

        @Override // p001o.zui
        /* renamed from: o */
        public void mo53146o(boolean z) {
            vo3.this.f50626c.m34547h(z);
        }

        @Override // p001o.zui
        /* renamed from: p */
        public Surface mo53147p() {
            op0.m42517g(isInitialized());
            tq.m50332a(op0.m42519i(null));
            throw null;
        }

        @Override // p001o.zui
        /* renamed from: q */
        public void mo53148q() {
            vo3.this.f50626c.m34550k();
        }

        @Override // p001o.zui
        /* renamed from: r */
        public void mo53149r() {
            vo3.this.f50626c.m34546g();
        }

        @Override // p001o.zui
        public void release() {
            vo3.this.m53103F();
        }

        @Override // p001o.zui
        /* renamed from: s */
        public void mo53150s() {
            vo3.this.m53109v();
        }

        @Override // p001o.zui
        /* renamed from: t */
        public void mo53151t(zui.InterfaceC18713a interfaceC18713a, Executor executor) {
            this.f50661m = interfaceC18713a;
            this.f50662n = executor;
        }

        @Override // p001o.zui
        /* renamed from: u */
        public void mo53152u(Surface surface, fvf fvfVar) {
            vo3.this.m53105H(surface, fvfVar);
        }

        @Override // p001o.zui
        /* renamed from: v */
        public void mo53153v(boolean z) {
            if (isInitialized()) {
                throw null;
            }
            this.f50659k = false;
            this.f50657i = -9223372036854775807L;
            this.f50658j = -9223372036854775807L;
            vo3.this.m53110w();
            if (z) {
                vo3.this.f50626c.m34552m();
            }
        }

        @Override // p001o.vo3.InterfaceC17636d
        /* renamed from: w */
        public void mo53121w(vo3 vo3Var) {
            final zui.InterfaceC18713a interfaceC18713a = this.f50661m;
            this.f50662n.execute(new Runnable() { // from class: o.zo3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57445a.m53126A(interfaceC18713a);
                }
            });
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m53079D(Runnable runnable) {
    }

    /* renamed from: q */
    public static /* synthetic */ mhd m53094q(vo3 vo3Var) {
        vo3Var.getClass();
        return null;
    }

    /* renamed from: t */
    public static /* synthetic */ iui m53097t(vo3 vo3Var, C2181a c2181a) throws zui.C18714b {
        vo3Var.m53099A(c2181a);
        return null;
    }

    /* renamed from: y */
    public static ph3 m53098y(ph3 ph3Var) {
        return (ph3Var == null || !ph3Var.m43666g()) ? ph3.f40064h : ph3Var;
    }

    /* renamed from: A */
    public final iui m53099A(C2181a c2181a) throws zui.C18714b {
        op0.m42517g(this.f50636m == 0);
        ph3 ph3VarM53098y = m53098y(c2181a.f7918A);
        if (ph3VarM53098y.f40074c == 7 && sqi.f45790a < 34) {
            ph3VarM53098y = ph3VarM53098y.m43664a().m43673e(6).m43669a();
        }
        ph3 ph3Var = ph3VarM53098y;
        final uw7 uw7VarMo21305b = this.f50629f.mo21305b((Looper) op0.m42519i(Looper.myLooper()), null);
        this.f50633j = uw7VarMo21305b;
        try {
            mhd.InterfaceC15325a interfaceC15325a = this.f50628e;
            Context context = this.f50624a;
            r75 r75Var = r75.f43107a;
            Objects.requireNonNull(uw7VarMo21305b);
            interfaceC15325a.mo39070a(context, ph3Var, r75Var, this, new Executor() { // from class: o.so3
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    uw7VarMo21305b.mo28839h(runnable);
                }
            }, nf8.m40499E(), 0L);
            Pair pair = this.f50634k;
            if (pair == null) {
                throw null;
            }
            Surface surface = (Surface) pair.first;
            fvf fvfVar = (fvf) pair.second;
            m53102E(surface, fvfVar.m27575b(), fvfVar.m27574a());
            throw null;
        } catch (hui e) {
            throw new zui.C18714b(e, c2181a);
        }
    }

    /* renamed from: B */
    public final boolean m53100B() {
        return this.f50636m == 1;
    }

    /* renamed from: C */
    public final boolean m53101C() {
        return this.f50635l == 0 && this.f50627d.m39705e();
    }

    /* renamed from: E */
    public final void m53102E(Surface surface, int i, int i2) {
    }

    /* renamed from: F */
    public void m53103F() {
        if (this.f50636m == 2) {
            return;
        }
        uw7 uw7Var = this.f50633j;
        if (uw7Var != null) {
            uw7Var.mo28835d(null);
        }
        this.f50634k = null;
        this.f50636m = 2;
    }

    /* renamed from: G */
    public void m53104G(long j, long j2) {
        if (this.f50635l == 0) {
            this.f50627d.m39708h(j, j2);
        }
    }

    /* renamed from: H */
    public void m53105H(Surface surface, fvf fvfVar) {
        Pair pair = this.f50634k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((fvf) this.f50634k.second).equals(fvfVar)) {
            return;
        }
        this.f50634k = Pair.create(surface, fvfVar);
        m53102E(surface, fvfVar.m27575b(), fvfVar.m27574a());
    }

    /* renamed from: I */
    public final void m53106I(float f) {
        this.f50627d.m39710j(f);
    }

    /* renamed from: J */
    public final void m53107J(gui guiVar) {
        this.f50632i = guiVar;
    }

    @Override // p001o.avi
    /* renamed from: a */
    public jui mo17884a() {
        return this.f50626c;
    }

    @Override // p001o.avi
    /* renamed from: b */
    public zui mo17885b() {
        return this.f50625b;
    }

    /* renamed from: u */
    public void m53108u(InterfaceC17636d interfaceC17636d) {
        this.f50630g.add(interfaceC17636d);
    }

    /* renamed from: v */
    public void m53109v() {
        fvf fvfVar = fvf.f24165c;
        m53102E(null, fvfVar.m27575b(), fvfVar.m27574a());
        this.f50634k = null;
    }

    /* renamed from: w */
    public final void m53110w() {
        if (m53100B()) {
            this.f50635l++;
            this.f50627d.m39703b();
            ((uw7) op0.m42519i(this.f50633j)).mo28839h(new Runnable() { // from class: o.to3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47482a.m53111x();
                }
            });
        }
    }

    /* renamed from: x */
    public final void m53111x() {
        int i = this.f50635l - 1;
        this.f50635l = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(this.f50635l));
        }
        this.f50627d.m39703b();
    }

    /* renamed from: z */
    public final boolean m53112z(long j) {
        return this.f50635l == 0 && this.f50627d.m39704d(j);
    }

    public vo3(C17634b c17634b) {
        Context context = c17634b.f50637a;
        this.f50624a = context;
        C17640h c17640h = new C17640h(context);
        this.f50625b = c17640h;
        jb3 jb3Var = c17634b.f50641e;
        this.f50629f = jb3Var;
        jui juiVar = c17634b.f50638b;
        this.f50626c = juiVar;
        juiVar.m34554o(jb3Var);
        this.f50627d = new mui(new C17635c(), juiVar);
        this.f50628e = (mhd.InterfaceC15325a) op0.m42519i(c17634b.f50640d);
        this.f50630g = new CopyOnWriteArraySet();
        this.f50636m = 0;
        m53108u(c17640h);
    }
}
