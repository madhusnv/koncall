package p001o;

import android.graphics.Bitmap;
import androidx.camera.core.InterfaceC1893c;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001o.fjd;
import p001o.hc8;
import p001o.j79;
import p001o.sc8;
import p001o.zh1;

/* loaded from: classes2.dex */
public class fjd {

    /* renamed from: a */
    public final Executor f23522a;

    /* renamed from: b */
    public final tp8 f23523b;

    /* renamed from: c */
    public AbstractC13463a f23524c;

    /* renamed from: d */
    public pdc f23525d;

    /* renamed from: e */
    public pdc f23526e;

    /* renamed from: f */
    public pdc f23527f;

    /* renamed from: g */
    public pdc f23528g;

    /* renamed from: h */
    public pdc f23529h;

    /* renamed from: i */
    public pdc f23530i;

    /* renamed from: j */
    public pdc f23531j;

    /* renamed from: k */
    public pdc f23532k;

    /* renamed from: l */
    public pdc f23533l;

    /* renamed from: m */
    public final l5e f23534m;

    /* renamed from: n */
    public final boolean f23535n;

    /* renamed from: o.fjd$a */
    public static abstract class AbstractC13463a {
        /* renamed from: e */
        public static AbstractC13463a m26931e(int i, int i2) {
            return new f51(new b36(), new b36(), i, i2);
        }

        /* renamed from: a */
        public abstract b36 mo26074a();

        /* renamed from: b */
        public abstract int mo26075b();

        /* renamed from: c */
        public abstract int mo26076c();

        /* renamed from: d */
        public abstract b36 mo26077d();
    }

    /* renamed from: o.fjd$b */
    public static abstract class AbstractC13464b {
        /* renamed from: c */
        public static AbstractC13464b m26932c(gjd gjdVar, InterfaceC1893c interfaceC1893c) {
            return new g51(gjdVar, interfaceC1893c);
        }

        /* renamed from: a */
        public abstract InterfaceC1893c mo26933a();

        /* renamed from: b */
        public abstract gjd mo26934b();
    }

    public fjd(Executor executor, tp8 tp8Var) {
        this(executor, tp8Var, xq5.m56606c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m26920o(final AbstractC13464b abstractC13464b) {
        if (abstractC13464b.mo26934b().m28873j()) {
            abstractC13464b.mo26933a().close();
        } else {
            this.f23522a.execute(new Runnable() { // from class: o.ajd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14849a.m26919n(abstractC13464b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m26922q(final AbstractC13464b abstractC13464b) {
        if (!abstractC13464b.mo26934b().m28873j()) {
            this.f23522a.execute(new Runnable() { // from class: o.zid
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57258a.m26921p(abstractC13464b);
                }
            });
        } else {
            wja.m54638l("ProcessingNode", "The postview image is closed due to request aborted");
            abstractC13464b.mo26933a().close();
        }
    }

    /* renamed from: w */
    public static void m26923w(final gjd gjdVar, final vc8 vc8Var) {
        gb2.m28295c().execute(new Runnable() { // from class: o.ejd
            @Override // java.lang.Runnable
            public final void run() {
                gjdVar.m28882s(vc8Var);
            }
        });
    }

    /* renamed from: i */
    public final lic m26924i(lic licVar, int i) {
        fgd.m26665i(ke8.m35536i(licVar.mo22325e()));
        lic licVar2 = (lic) this.f23529h.apply(licVar);
        pdc pdcVar = this.f23533l;
        if (pdcVar != null) {
            licVar2 = (lic) pdcVar.apply(licVar2);
        }
        return (lic) this.f23527f.apply(zh1.AbstractC18634b.m59399c(licVar2, i));
    }

    /* renamed from: r */
    public InterfaceC1893c m26925r(AbstractC13464b abstractC13464b) {
        gjd gjdVarMo26934b = abstractC13464b.mo26934b();
        lic licVar = (lic) this.f23525d.apply(abstractC13464b);
        if ((licVar.mo22325e() == 35 || this.f23533l != null || this.f23535n) && this.f23524c.mo26076c() == 256) {
            lic licVarM26924i = (lic) this.f23526e.apply(hc8.AbstractC13915a.m30220c(licVar, gjdVarMo26934b.m28866c()));
            if (this.f23533l != null) {
                licVarM26924i = m26924i(licVarM26924i, gjdVarMo26934b.m28866c());
            }
            licVar = (lic) this.f23531j.apply(licVarM26924i);
        }
        return (InterfaceC1893c) this.f23530i.apply(licVar);
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m26919n(AbstractC13464b abstractC13464b) {
        final gjd gjdVarMo26934b = abstractC13464b.mo26934b();
        try {
            if (abstractC13464b.mo26934b().m28874k()) {
                final InterfaceC1893c interfaceC1893cM26925r = m26925r(abstractC13464b);
                gb2.m28295c().execute(new Runnable() { // from class: o.cjd
                    @Override // java.lang.Runnable
                    public final void run() {
                        gjdVarMo26934b.m28878o(interfaceC1893cM26925r);
                    }
                });
            } else {
                final sc8.C16804h c16804hM26927t = m26927t(abstractC13464b);
                gb2.m28295c().execute(new Runnable() { // from class: o.djd
                    @Override // java.lang.Runnable
                    public final void run() {
                        gjdVarMo26934b.m28879p(c16804hM26927t);
                    }
                });
            }
        } catch (OutOfMemoryError e) {
            m26923w(gjdVarMo26934b, new vc8(0, "Processing failed due to low memory.", e));
        } catch (RuntimeException e2) {
            m26923w(gjdVarMo26934b, new vc8(0, "Processing failed.", e2));
        } catch (vc8 e3) {
            m26923w(gjdVarMo26934b, e3);
        }
    }

    /* renamed from: t */
    public sc8.C16804h m26927t(AbstractC13464b abstractC13464b) {
        int iMo26076c = this.f23524c.mo26076c();
        fgd.m26658b(ke8.m35536i(iMo26076c), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(iMo26076c)));
        gjd gjdVarMo26934b = abstractC13464b.mo26934b();
        lic licVarM26924i = (lic) this.f23526e.apply(hc8.AbstractC13915a.m30220c((lic) this.f23525d.apply(abstractC13464b), gjdVarMo26934b.m28866c()));
        if (licVarM26924i.m37320i() || this.f23533l != null) {
            licVarM26924i = m26924i(licVarM26924i, gjdVarMo26934b.m28866c());
        }
        pdc pdcVar = this.f23528g;
        sc8.C16803g c16803gM28867d = gjdVarMo26934b.m28867d();
        Objects.requireNonNull(c16803gM28867d);
        return (sc8.C16804h) pdcVar.apply(j79.AbstractC14469a.m33376c(licVarM26924i, c16803gM28867d));
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m26921p(AbstractC13464b abstractC13464b) {
        int iMo26076c = this.f23524c.mo26076c();
        fgd.m26658b(iMo26076c == 35 || iMo26076c == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(iMo26076c)));
        final gjd gjdVarMo26934b = abstractC13464b.mo26934b();
        try {
            final Bitmap bitmap = (Bitmap) this.f23532k.apply((lic) this.f23525d.apply(abstractC13464b));
            gb2.m28295c().execute(new Runnable() { // from class: o.bjd
                @Override // java.lang.Runnable
                public final void run() {
                    gjdVarMo26934b.m28881r(bitmap);
                }
            });
        } catch (Exception e) {
            abstractC13464b.mo26933a().close();
            wja.m54630d("ProcessingNode", "process postview input packet failed.", e);
        }
    }

    /* renamed from: v */
    public void m26929v() {
    }

    /* renamed from: x */
    public Void m26930x(AbstractC13463a abstractC13463a) {
        this.f23524c = abstractC13463a;
        abstractC13463a.mo26074a().m18126a(new hu3() { // from class: o.xid
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f53829a.m26920o((fjd.AbstractC13464b) obj);
            }
        });
        abstractC13463a.mo26077d().m18126a(new hu3() { // from class: o.yid
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f55557a.m26922q((fjd.AbstractC13464b) obj);
            }
        });
        this.f23525d = new wid();
        this.f23526e = new hc8(this.f23534m);
        this.f23529h = new i79();
        this.f23527f = new zh1();
        this.f23528g = new j79();
        this.f23530i = new m79();
        this.f23532k = new gc8();
        if (abstractC13463a.mo26075b() == 35 || this.f23523b != null || this.f23535n) {
            this.f23531j = new k79();
        }
        tp8 tp8Var = this.f23523b;
        if (tp8Var == null) {
            return null;
        }
        this.f23533l = new ei1(tp8Var);
        return null;
    }

    public fjd(Executor executor, tp8 tp8Var, l5e l5eVar) {
        if (xq5.m56605b(LowMemoryQuirk.class) != null) {
            this.f23522a = gb2.m28297e(executor);
        } else {
            this.f23522a = executor;
        }
        this.f23523b = tp8Var;
        this.f23534m = l5eVar;
        this.f23535n = l5eVar.m36593a(IncorrectJpegMetadataQuirk.class);
    }
}
