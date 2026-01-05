package p001o;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.InterfaceC1893c;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001o.bhf;
import p001o.c9i;
import p001o.d9i;
import p001o.mne;
import p001o.mq3;
import p001o.zd8;

/* loaded from: classes2.dex */
public final class sc8 extends w8i {

    /* renamed from: B */
    public static final C16799c f45175B = new C16799c();

    /* renamed from: C */
    public static final nm6 f45176C = new nm6();

    /* renamed from: A */
    public final uc8 f45177A;

    /* renamed from: p */
    public final zd8.InterfaceC18614a f45178p;

    /* renamed from: q */
    public final int f45179q;

    /* renamed from: r */
    public final AtomicReference f45180r;

    /* renamed from: s */
    public final int f45181s;

    /* renamed from: t */
    public int f45182t;

    /* renamed from: u */
    public Rational f45183u;

    /* renamed from: v */
    public l6f f45184v;

    /* renamed from: w */
    public bhf.C12402b f45185w;

    /* renamed from: x */
    public rd8 f45186x;

    /* renamed from: y */
    public gjg f45187y;

    /* renamed from: z */
    public bhf.C12403c f45188z;

    /* renamed from: o.sc8$a */
    public class C16797a implements uc8 {
        public C16797a() {
        }

        @Override // p001o.uc8
        /* renamed from: a */
        public zfa mo48156a(List list) {
            return sc8.this.z0(list);
        }

        @Override // p001o.uc8
        /* renamed from: b */
        public void mo48157b() {
            sc8.this.u0();
        }

        @Override // p001o.uc8
        /* renamed from: c */
        public void mo48158c() {
            sc8.this.D0();
        }
    }

    /* renamed from: o.sc8$b */
    public static final class C16798b implements c9i.InterfaceC12595a {

        /* renamed from: a */
        public final qpb f45190a;

        public C16798b() {
            this(qpb.a0());
        }

        /* renamed from: d */
        public static C16798b m48159d(mq3 mq3Var) {
            return new C16798b(qpb.b0(mq3Var));
        }

        @Override // p001o.hp6
        /* renamed from: a */
        public vob mo17073a() {
            return this.f45190a;
        }

        /* renamed from: c */
        public sc8 m48160c() {
            Integer num = (Integer) mo17073a().mo36958d(tc8.f46812L, null);
            if (num != null) {
                mo17073a().mo45760N(kd8.f31942h, num);
            } else if (sc8.o0(mo17073a())) {
                mo17073a().mo45760N(kd8.f31942h, 4101);
                mo17073a().mo45760N(kd8.f31943i, y16.f54702c);
            } else {
                mo17073a().mo45760N(kd8.f31942h, 256);
            }
            tc8 tc8VarMo17074b = mo17074b();
            qd8.m45153U(tc8VarMo17074b);
            sc8 sc8Var = new sc8(tc8VarMo17074b);
            Size size = (Size) mo17073a().mo36958d(qd8.f41688n, null);
            if (size != null) {
                sc8Var.w0(new Rational(size.getWidth(), size.getHeight()));
            }
            fgd.m26664h((Executor) mo17073a().mo36958d(sv8.f46000t, gb2.m28294b()), "The IO executor can't be null");
            vob vobVarMo17073a = mo17073a();
            mq3.AbstractC15402a abstractC15402a = tc8.f46810J;
            if (vobVarMo17073a.mo36957c(abstractC15402a)) {
                Integer num2 = (Integer) mo17073a().mo36960f(abstractC15402a);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && mo17073a().mo36958d(tc8.f46819S, null) == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
            return sc8Var;
        }

        @Override // p001o.c9i.InterfaceC12595a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public tc8 mo17074b() {
            return new tc8(tec.m49792Y(this.f45190a));
        }

        /* renamed from: f */
        public C16798b m48162f(d9i.EnumC12848b enumC12848b) {
            mo17073a().mo45760N(c9i.f17561E, enumC12848b);
            return this;
        }

        /* renamed from: g */
        public C16798b m48163g(y16 y16Var) {
            mo17073a().mo45760N(kd8.f31943i, y16Var);
            return this;
        }

        /* renamed from: h */
        public C16798b m48164h(int i) {
            mo17073a().mo45760N(tc8.f46813M, Integer.valueOf(i));
            return this;
        }

        /* renamed from: i */
        public C16798b m48165i(mne mneVar) {
            mo17073a().mo45760N(qd8.f41692r, mneVar);
            return this;
        }

        /* renamed from: j */
        public C16798b m48166j(int i) {
            mo17073a().mo45760N(c9i.f17557A, Integer.valueOf(i));
            return this;
        }

        /* renamed from: k */
        public C16798b m48167k(int i) {
            if (i == -1) {
                i = 0;
            }
            mo17073a().mo45760N(qd8.f41684j, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C16798b m48168l(Class cls) {
            mo17073a().mo45760N(sjg.f45490v, cls);
            if (mo17073a().mo36958d(sjg.f45489u, null) == null) {
                m48169m(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: m */
        public C16798b m48169m(String str) {
            mo17073a().mo45760N(sjg.f45489u, str);
            return this;
        }

        public C16798b(qpb qpbVar) {
            this.f45190a = qpbVar;
            Class cls = (Class) qpbVar.mo36958d(sjg.f45490v, null);
            if (cls == null || cls.equals(sc8.class)) {
                m48162f(d9i.EnumC12848b.IMAGE_CAPTURE);
                m48168l(sc8.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: o.sc8$c */
    public static final class C16799c {

        /* renamed from: a */
        public static final mne f45191a;

        /* renamed from: b */
        public static final tc8 f45192b;

        /* renamed from: c */
        public static final y16 f45193c;

        static {
            mne mneVarM39401a = new mne.C15369a().m39403d(mp0.f35798c).m39404e(one.f38634c).m39401a();
            f45191a = mneVarM39401a;
            y16 y16Var = y16.f54703d;
            f45193c = y16Var;
            f45192b = new C16798b().m48166j(4).m48167k(0).m48165i(mneVarM39401a).m48164h(0).m48163g(y16Var).mo17074b();
        }

        /* renamed from: a */
        public tc8 m48170a() {
            return f45192b;
        }
    }

    /* renamed from: o.sc8$d */
    public static final class C16800d {

        /* renamed from: a */
        public boolean f45194a;

        /* renamed from: b */
        public boolean f45195b = false;

        /* renamed from: c */
        public boolean f45196c;

        /* renamed from: d */
        public Location f45197d;

        /* renamed from: a */
        public Location m48171a() {
            return this.f45197d;
        }

        /* renamed from: b */
        public boolean m48172b() {
            return this.f45194a;
        }

        /* renamed from: c */
        public boolean m48173c() {
            return this.f45196c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f45194a + ", mIsReversedVertical=" + this.f45196c + ", mLocation=" + this.f45197d + "}";
        }
    }

    /* renamed from: o.sc8$e */
    public static abstract class AbstractC16801e {
    }

    /* renamed from: o.sc8$f */
    public interface InterfaceC16802f {
        /* renamed from: a */
        default void m48174a(int i) {
        }

        /* renamed from: b */
        default void m48175b(Bitmap bitmap) {
        }

        /* renamed from: c */
        default void m48176c() {
        }

        /* renamed from: d */
        void mo863d(C16804h c16804h);

        /* renamed from: e */
        void mo864e(vc8 vc8Var);
    }

    /* renamed from: o.sc8$g */
    public static final class C16803g {

        /* renamed from: a */
        public final File f45198a;

        /* renamed from: b */
        public final ContentResolver f45199b;

        /* renamed from: c */
        public final Uri f45200c;

        /* renamed from: d */
        public final ContentValues f45201d;

        /* renamed from: e */
        public final OutputStream f45202e;

        /* renamed from: f */
        public final C16800d f45203f;

        /* renamed from: o.sc8$g$a */
        public static final class a {

            /* renamed from: a */
            public File f45204a;

            /* renamed from: b */
            public ContentResolver f45205b;

            /* renamed from: c */
            public Uri f45206c;

            /* renamed from: d */
            public ContentValues f45207d;

            /* renamed from: e */
            public OutputStream f45208e;

            /* renamed from: f */
            public C16800d f45209f;

            public a(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.f45205b = contentResolver;
                this.f45206c = uri;
                this.f45207d = contentValues;
            }

            /* renamed from: a */
            public C16803g m48183a() {
                return new C16803g(this.f45204a, this.f45205b, this.f45206c, this.f45207d, this.f45208e, this.f45209f);
            }
        }

        public C16803g(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, C16800d c16800d) {
            this.f45198a = file;
            this.f45199b = contentResolver;
            this.f45200c = uri;
            this.f45201d = contentValues;
            this.f45202e = outputStream;
            this.f45203f = c16800d == null ? new C16800d() : c16800d;
        }

        /* renamed from: a */
        public ContentResolver m48177a() {
            return this.f45199b;
        }

        /* renamed from: b */
        public ContentValues m48178b() {
            return this.f45201d;
        }

        /* renamed from: c */
        public File m48179c() {
            return this.f45198a;
        }

        /* renamed from: d */
        public C16800d m48180d() {
            return this.f45203f;
        }

        /* renamed from: e */
        public OutputStream m48181e() {
            return this.f45202e;
        }

        /* renamed from: f */
        public Uri m48182f() {
            return this.f45200c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f45198a + ", mContentResolver=" + this.f45199b + ", mSaveCollection=" + this.f45200c + ", mContentValues=" + this.f45201d + ", mOutputStream=" + this.f45202e + ", mMetadata=" + this.f45203f + "}";
        }
    }

    /* renamed from: o.sc8$h */
    public static class C16804h {

        /* renamed from: a */
        public final Uri f45210a;

        public C16804h(Uri uri) {
            this.f45210a = uri;
        }

        /* renamed from: a */
        public Uri m48184a() {
            return this.f45210a;
        }
    }

    /* renamed from: o.sc8$i */
    public interface InterfaceC16805i {
        /* renamed from: a */
        void mo4747a(long j, InterfaceC16806j interfaceC16806j);

        void clear();
    }

    /* renamed from: o.sc8$j */
    public interface InterfaceC16806j {
        void onCompleted();
    }

    public sc8(tc8 tc8Var) {
        super(tc8Var);
        this.f45178p = new zd8.InterfaceC18614a() { // from class: o.oc8
            @Override // p001o.zd8.InterfaceC18614a
            /* renamed from: a */
            public final void mo27818a(zd8 zd8Var) {
                sc8.r0(zd8Var);
            }
        };
        this.f45180r = new AtomicReference(null);
        this.f45182t = -1;
        this.f45183u = null;
        this.f45177A = new C16797a();
        tc8 tc8Var2 = (tc8) m54090i();
        if (tc8Var2.mo36957c(tc8.f46809I)) {
            this.f45179q = tc8Var2.m49703X();
        } else {
            this.f45179q = 1;
        }
        this.f45181s = tc8Var2.m49705Z(0);
        this.f45184v = l6f.m36628g(tc8Var2.d0());
    }

    public static boolean n0(List list, int i) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean o0(vob vobVar) {
        return Objects.equals(vobVar.mo36958d(tc8.f46813M, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
        if (m54087f() == null) {
            return;
        }
        this.f45187y.m28893k();
        e0(true);
        bhf.C12402b c12402bF0 = f0(m54089h(), (tc8) m54090i(), (k7g) fgd.m26663g(m54085d()));
        this.f45185w = c12402bF0;
        m54079U(t3c.m49220a(new Object[]{c12402bF0.m19052o()}));
        m54073F();
        this.f45187y.m28894l();
    }

    public static /* synthetic */ void r0(zd8 zd8Var) {
        try {
            InterfaceC1893c interfaceC1893cMo4669c = zd8Var.mo4669c();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Discarding ImageProxy which was inadvertently acquired: ");
                sb.append(interfaceC1893cMo4669c);
                if (interfaceC1893cMo4669c != null) {
                    interfaceC1893cMo4669c.close();
                }
            } finally {
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static /* synthetic */ Void s0(List list) {
        return null;
    }

    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void t0(final C16803g c16803g, final Executor executor, final InterfaceC16802f interfaceC16802f) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            gb2.m28295c().execute(new Runnable() { // from class: o.pc8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39802a.t0(c16803g, executor, interfaceC16802f);
                }
            });
        } else {
            B0(executor, null, interfaceC16802f, c16803g);
        }
    }

    public final void B0(Executor executor, AbstractC16801e abstractC16801e, InterfaceC16802f interfaceC16802f, C16803g c16803g) {
        elh.m25220a();
        if (j0() == 3 && this.f45184v.m36632h() == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        v92 v92VarM54087f = m54087f();
        if (v92VarM54087f == null) {
            v0(executor, abstractC16801e, interfaceC16802f);
            return;
        }
        gjg gjgVar = this.f45187y;
        Objects.requireNonNull(gjgVar);
        gjgVar.m28892j(mjg.m39234v(executor, abstractC16801e, interfaceC16802f, c16803g, m0(), m54101u(), m54096p(v92VarM54087f), k0(), i0(), this.f45185w.m19053q()));
    }

    public final void C0() {
        synchronized (this.f45180r) {
            if (this.f45180r.get() != null) {
                return;
            }
            m54088g().mo37113e(j0());
        }
    }

    public void D0() {
        synchronized (this.f45180r) {
            Integer num = (Integer) this.f45180r.getAndSet(null);
            if (num == null) {
                return;
            }
            if (num.intValue() != j0()) {
                C0();
            }
        }
    }

    @Override // p001o.w8i
    /* renamed from: H */
    public void mo29952H() {
        fgd.m26664h(m54087f(), "Attached camera cannot be null");
        if (j0() == 3 && h0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // p001o.w8i
    /* renamed from: I */
    public void mo48155I() {
        wja.m54627a("ImageCapture", "onCameraControlReady");
        C0();
        x0();
    }

    @Override // p001o.w8i
    /* renamed from: J */
    public c9i mo17063J(u92 u92Var, c9i.InterfaceC12595a interfaceC12595a) {
        if (u92Var.mo38384f().m36593a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            vob vobVarMo17073a = interfaceC12595a.mo17073a();
            mq3.AbstractC15402a abstractC15402a = tc8.f46816P;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(vobVarMo17073a.mo36958d(abstractC15402a, bool2))) {
                wja.m54638l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                wja.m54631e("ImageCapture", "Requesting software JPEG due to device quirk.");
                interfaceC12595a.mo17073a().mo45760N(abstractC15402a, bool2);
            }
        }
        boolean zG0 = g0(interfaceC12595a.mo17073a());
        Integer num = (Integer) interfaceC12595a.mo17073a().mo36958d(tc8.f46812L, null);
        if (num != null) {
            fgd.m26658b(!p0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            interfaceC12595a.mo17073a().mo45760N(kd8.f31942h, Integer.valueOf(zG0 ? 35 : num.intValue()));
        } else if (o0(interfaceC12595a.mo17073a())) {
            interfaceC12595a.mo17073a().mo45760N(kd8.f31942h, 4101);
            interfaceC12595a.mo17073a().mo45760N(kd8.f31943i, y16.f54702c);
        } else if (zG0) {
            interfaceC12595a.mo17073a().mo45760N(kd8.f31942h, 35);
        } else {
            List list = (List) interfaceC12595a.mo17073a().mo36958d(qd8.f41691q, null);
            if (list == null || n0(list, 256)) {
                interfaceC12595a.mo17073a().mo45760N(kd8.f31942h, 256);
            } else if (n0(list, 35)) {
                interfaceC12595a.mo17073a().mo45760N(kd8.f31942h, 35);
            }
        }
        return interfaceC12595a.mo17074b();
    }

    @Override // p001o.w8i
    /* renamed from: L */
    public void mo29954L() {
        b0();
    }

    @Override // p001o.w8i
    /* renamed from: M */
    public k7g mo17064M(mq3 mq3Var) {
        this.f45185w.m19044g(mq3Var);
        m54079U(t3c.m49220a(new Object[]{this.f45185w.m19052o()}));
        return m54085d().mo35131g().mo35135d(mq3Var).mo35132a();
    }

    @Override // p001o.w8i
    /* renamed from: N */
    public k7g mo17065N(k7g k7gVar, k7g k7gVar2) {
        bhf.C12402b c12402bF0 = f0(m54089h(), (tc8) m54090i(), k7gVar);
        this.f45185w = c12402bF0;
        m54079U(t3c.m49220a(new Object[]{c12402bF0.m19052o()}));
        m54071D();
        return k7gVar;
    }

    @Override // p001o.w8i
    /* renamed from: O */
    public void mo17066O() {
        b0();
        d0();
        y0(null);
    }

    public final void b0() {
        this.f45184v.m36631f();
        gjg gjgVar = this.f45187y;
        if (gjgVar != null) {
            gjgVar.m28889e();
        }
    }

    public final void d0() {
        e0(false);
    }

    public final void e0(boolean z) {
        gjg gjgVar;
        elh.m25220a();
        bhf.C12403c c12403c = this.f45188z;
        if (c12403c != null) {
            c12403c.m19063b();
            this.f45188z = null;
        }
        rd8 rd8Var = this.f45186x;
        if (rd8Var != null) {
            rd8Var.m46544a();
            this.f45186x = null;
        }
        if (z || (gjgVar = this.f45187y) == null) {
            return;
        }
        gjgVar.m28889e();
        this.f45187y = null;
    }

    public final bhf.C12402b f0(String str, tc8 tc8Var, k7g k7gVar) {
        elh.m25220a();
        String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, k7gVar);
        Size sizeMo35129e = k7gVar.mo35129e();
        v92 v92VarM54087f = m54087f();
        Objects.requireNonNull(v92VarM54087f);
        boolean z = !v92VarM54087f.mo42848p();
        if (this.f45186x != null) {
            fgd.m26665i(z);
            this.f45186x.m46544a();
        }
        if (((Boolean) m54090i().mo36958d(tc8.f46821U, Boolean.FALSE)).booleanValue()) {
            l0();
        }
        m54091k();
        this.f45186x = new rd8(tc8Var, sizeMo35129e, null, z, null, 35);
        if (this.f45187y == null) {
            this.f45187y = new gjg(this.f45177A);
        }
        this.f45187y.m28895m(this.f45186x);
        bhf.C12402b c12402bM46549f = this.f45186x.m46549f(k7gVar.mo35129e());
        if (i0() == 2 && !k7gVar.mo35130f()) {
            m54088g().mo37109a(c12402bM46549f);
        }
        if (k7gVar.mo35128d() != null) {
            c12402bM46549f.m19044g(k7gVar.mo35128d());
        }
        bhf.C12403c c12403c = this.f45188z;
        if (c12403c != null) {
            c12403c.m19063b();
        }
        bhf.C12403c c12403c2 = new bhf.C12403c(new bhf.InterfaceC12404d() { // from class: o.qc8
            @Override // p001o.bhf.InterfaceC12404d
            /* renamed from: a */
            public final void mo19062a(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
                this.f41619a.q0(bhfVar, enumC12407g);
            }
        });
        this.f45188z = c12403c2;
        c12402bM46549f.m19054r(c12403c2);
        return c12402bM46549f;
    }

    public boolean g0(vob vobVar) {
        boolean z;
        Boolean bool = Boolean.TRUE;
        mq3.AbstractC15402a abstractC15402a = tc8.f46816P;
        Boolean bool2 = Boolean.FALSE;
        boolean z2 = false;
        if (bool.equals(vobVar.mo36958d(abstractC15402a, bool2))) {
            if (p0()) {
                wja.m54638l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) vobVar.mo36958d(tc8.f46812L, null);
            if (num == null || num.intValue() == 256) {
                z2 = z;
            } else {
                wja.m54638l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z2) {
                wja.m54638l("ImageCapture", "Unable to support software JPEG. Disabling.");
                vobVar.mo45760N(abstractC15402a, bool2);
            }
        }
        return z2;
    }

    public final int h0() {
        v92 v92VarM54087f = m54087f();
        if (v92VarM54087f != null) {
            return v92VarM54087f.mo28113a().mo38382d();
        }
        return -1;
    }

    public int i0() {
        return this.f45179q;
    }

    @Override // p001o.w8i
    /* renamed from: j */
    public c9i mo17069j(boolean z, d9i d9iVar) {
        C16799c c16799c = f45175B;
        mq3 mq3VarMo22642a = d9iVar.mo22642a(c16799c.m48170a().mo20533M(), i0());
        if (z) {
            mq3VarMo22642a = mq3.m39506z(mq3VarMo22642a, c16799c.m48170a());
        }
        if (mq3VarMo22642a == null) {
            return null;
        }
        return mo17071y(mq3VarMo22642a).mo17074b();
    }

    public int j0() {
        int iM49704Y;
        synchronized (this.f45180r) {
            iM49704Y = this.f45182t;
            if (iM49704Y == -1) {
                iM49704Y = ((tc8) m54090i()).m49704Y(2);
            }
        }
        return iM49704Y;
    }

    public final int k0() {
        tc8 tc8Var = (tc8) m54090i();
        if (tc8Var.mo36957c(tc8.f46818R)) {
            return tc8Var.c0();
        }
        int i = this.f45179q;
        if (i == 0) {
            return 100;
        }
        if (i == 1 || i == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f45179q + " is invalid");
    }

    public final lhf l0() {
        m54087f().mo26116d().m51202u(null);
        return null;
    }

    public final Rect m0() {
        Rect rectM54104z = m54104z();
        Size sizeM54086e = m54086e();
        Objects.requireNonNull(sizeM54086e);
        if (rectM54104z != null) {
            return rectM54104z;
        }
        if (!ke8.m35535h(this.f45183u)) {
            return new Rect(0, 0, sizeM54086e.getWidth(), sizeM54086e.getHeight());
        }
        v92 v92VarM54087f = m54087f();
        Objects.requireNonNull(v92VarM54087f);
        int iM54096p = m54096p(v92VarM54087f);
        Rational rational = new Rational(this.f45183u.getDenominator(), this.f45183u.getNumerator());
        if (!wuh.m55040i(iM54096p)) {
            rational = this.f45183u;
        }
        Rect rectM35528a = ke8.m35528a(sizeM54086e, rational);
        Objects.requireNonNull(rectM35528a);
        return rectM35528a;
    }

    public final boolean p0() {
        if (m54087f() == null) {
            return false;
        }
        m54087f().mo26116d().m51202u(null);
        return false;
    }

    public String toString() {
        return "ImageCapture:" + m54094n();
    }

    public void u0() {
        synchronized (this.f45180r) {
            if (this.f45180r.get() != null) {
                return;
            }
            this.f45180r.set(Integer.valueOf(j0()));
        }
    }

    public final void v0(Executor executor, AbstractC16801e abstractC16801e, InterfaceC16802f interfaceC16802f) {
        vc8 vc8Var = new vc8(4, "Not bound to a valid Camera [" + this + "]", null);
        if (interfaceC16802f == null) {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
        interfaceC16802f.mo864e(vc8Var);
    }

    @Override // p001o.w8i
    /* renamed from: w */
    public Set mo17070w() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public void w0(Rational rational) {
        this.f45183u = rational;
    }

    public final void x0() {
        y0(this.f45184v);
    }

    @Override // p001o.w8i
    /* renamed from: y */
    public c9i.InterfaceC12595a mo17071y(mq3 mq3Var) {
        return C16798b.m48159d(mq3Var);
    }

    public final void y0(InterfaceC16805i interfaceC16805i) {
        m54088g().mo37110b(interfaceC16805i);
    }

    public zfa z0(List list) {
        elh.m25220a();
        return bn7.m19412G(m54088g().mo37111c(list, this.f45179q, this.f45181s), new zl7() { // from class: o.rc8
            @Override // p001o.zl7
            public final Object apply(Object obj) {
                return sc8.s0((List) obj);
            }
        }, gb2.m28293a());
    }
}
