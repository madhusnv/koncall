package p001o;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC1892b;
import androidx.camera.core.C1894d;
import androidx.camera.core.C1895e;
import androidx.camera.core.InterfaceC1893c;
import java.util.Objects;
import p001o.fjd;
import p001o.gjg;
import p001o.zd8;

/* loaded from: classes2.dex */
public class pd2 {

    /* renamed from: b */
    public C1895e f39842b;

    /* renamed from: c */
    public C1895e f39843c;

    /* renamed from: d */
    public fjd.AbstractC13463a f39844d;

    /* renamed from: e */
    public AbstractC16063c f39845e;

    /* renamed from: a */
    public gjd f39841a = null;

    /* renamed from: f */
    public gzb f39846f = null;

    /* renamed from: o.pd2$a */
    public class C16061a extends j72 {
        public C16061a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m43404f() {
            gjd gjdVar = pd2.this.f39841a;
            if (gjdVar != null) {
                gjdVar.m28877n();
            }
        }

        @Override // p001o.j72
        /* renamed from: d */
        public void mo33322d(int i) {
            gb2.m28295c().execute(new Runnable() { // from class: o.od2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38135a.m43404f();
                }
            });
        }
    }

    /* renamed from: o.pd2$b */
    public class C16062b implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ gjd f39848a;

        public C16062b(gjd gjdVar) {
            this.f39848a = gjdVar;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            elh.m25220a();
            if (this.f39848a == pd2.this.f39841a) {
                wja.m54638l("CaptureNode", "request aborted, id=" + pd2.this.f39841a.m28868e());
                if (pd2.this.f39846f != null) {
                    pd2.this.f39846f.m29685j();
                }
                pd2.this.f39841a = null;
            }
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }
    }

    /* renamed from: o.pd2$c */
    public static abstract class AbstractC16063c {

        /* renamed from: b */
        public yj5 f39851b;

        /* renamed from: a */
        public j72 f39850a = new a();

        /* renamed from: c */
        public yj5 f39852c = null;

        /* renamed from: o.pd2$c$a */
        public class a extends j72 {
            public a() {
            }
        }

        /* renamed from: m */
        public static AbstractC16063c m43406m(Size size, int i, int i2, boolean z, ae8 ae8Var, Size size2, int i3) {
            return new e41(size, i, i2, z, ae8Var, size2, i3, new b36(), new b36());
        }

        /* renamed from: a */
        public j72 m43407a() {
            return this.f39850a;
        }

        /* renamed from: b */
        public abstract b36 mo24258b();

        /* renamed from: c */
        public abstract ae8 mo24259c();

        /* renamed from: d */
        public abstract int mo24260d();

        /* renamed from: e */
        public abstract int mo24261e();

        /* renamed from: f */
        public abstract int mo24262f();

        /* renamed from: g */
        public abstract Size mo24263g();

        /* renamed from: h */
        public yj5 m43408h() {
            return this.f39852c;
        }

        /* renamed from: i */
        public abstract b36 mo24264i();

        /* renamed from: j */
        public abstract Size mo24265j();

        /* renamed from: k */
        public yj5 m43409k() {
            yj5 yj5Var = this.f39851b;
            Objects.requireNonNull(yj5Var);
            return yj5Var;
        }

        /* renamed from: l */
        public abstract boolean mo24266l();

        /* renamed from: n */
        public void m43410n(j72 j72Var) {
            this.f39850a = j72Var;
        }

        /* renamed from: o */
        public void m43411o(Surface surface, Size size, int i) {
            this.f39852c = new hf8(surface, size, i);
        }

        /* renamed from: p */
        public void m43412p(Surface surface) {
            fgd.m26666j(this.f39851b == null, "The surface is already set.");
            this.f39851b = new hf8(surface, mo24265j(), mo24260d());
        }
    }

    /* renamed from: g */
    public static zd8 m43387g(ae8 ae8Var, int i, int i2, int i3) {
        return ae8Var != null ? ae8Var.m16943a(i, i2, i3, 4, 0L) : be8.m18789a(i, i2, i3, 4);
    }

    /* renamed from: j */
    public static /* synthetic */ void m43389j(C1895e c1895e) {
        if (c1895e != null) {
            c1895e.m4688m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m43390k(gjd gjdVar) {
        m43396p(gjdVar);
        this.f39846f.m29684i(gjdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m43391l(zd8 zd8Var) {
        try {
            InterfaceC1893c interfaceC1893cMo4669c = zd8Var.mo4669c();
            if (interfaceC1893cMo4669c != null) {
                m43395o(interfaceC1893cMo4669c);
            } else {
                gjd gjdVar = this.f39841a;
                if (gjdVar != null) {
                    m43400t(gjg.AbstractC13760b.m28899c(gjdVar.m28868e(), new vc8(2, "Failed to acquire latest image", null)));
                }
            }
        } catch (IllegalStateException e) {
            gjd gjdVar2 = this.f39841a;
            if (gjdVar2 != null) {
                m43400t(gjg.AbstractC13760b.m28899c(gjdVar2.m28868e(), new vc8(2, "Failed to acquire latest image", e)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m43392m(zd8 zd8Var) {
        try {
            InterfaceC1893c interfaceC1893cMo4669c = zd8Var.mo4669c();
            if (interfaceC1893cMo4669c != null) {
                m43397q(interfaceC1893cMo4669c);
            }
        } catch (IllegalStateException e) {
            wja.m54630d("CaptureNode", "Failed to acquire latest image of postview", e);
        }
    }

    /* renamed from: h */
    public int m43393h() {
        elh.m25220a();
        fgd.m26666j(this.f39842b != null, "The ImageReader is not initialized.");
        return this.f39842b.m4687j();
    }

    /* renamed from: n */
    public final void m43394n(InterfaceC1893c interfaceC1893c) {
        elh.m25220a();
        fjd.AbstractC13463a abstractC13463a = this.f39844d;
        Objects.requireNonNull(abstractC13463a);
        abstractC13463a.mo26074a().accept(fjd.AbstractC13464b.m26932c(this.f39841a, interfaceC1893c));
        gjd gjdVar = this.f39841a;
        this.f39841a = null;
        gjdVar.m28880q();
    }

    /* renamed from: o */
    public void m43395o(InterfaceC1893c interfaceC1893c) {
        elh.m25220a();
        if (this.f39841a == null) {
            wja.m54638l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + interfaceC1893c);
            interfaceC1893c.close();
            return;
        }
        if (((Integer) interfaceC1893c.y2().mo17845a().m54617d(this.f39841a.m28872i())) != null) {
            m43394n(interfaceC1893c);
        } else {
            wja.m54638l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            interfaceC1893c.close();
        }
    }

    /* renamed from: p */
    public void m43396p(gjd gjdVar) {
        elh.m25220a();
        fgd.m26666j(gjdVar.m28871h().size() == 1, "only one capture stage is supported.");
        fgd.m26666j(m43393h() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f39841a = gjdVar;
        bn7.m19424j(gjdVar.m28864a(), new C16062b(gjdVar), gb2.m28293a());
    }

    /* renamed from: q */
    public final void m43397q(InterfaceC1893c interfaceC1893c) {
        if (this.f39841a == null) {
            wja.m54638l("CaptureNode", "Postview image is closed due to request completed or aborted");
            interfaceC1893c.close();
        } else {
            fjd.AbstractC13463a abstractC13463a = this.f39844d;
            Objects.requireNonNull(abstractC13463a);
            abstractC13463a.mo26077d().accept(fjd.AbstractC13464b.m26932c(this.f39841a, interfaceC1893c));
        }
    }

    /* renamed from: r */
    public void m43398r() {
        elh.m25220a();
        AbstractC16063c abstractC16063c = this.f39845e;
        Objects.requireNonNull(abstractC16063c);
        C1895e c1895e = this.f39842b;
        Objects.requireNonNull(c1895e);
        m43399s(abstractC16063c, c1895e, this.f39843c);
    }

    /* renamed from: s */
    public final void m43399s(AbstractC16063c abstractC16063c, final C1895e c1895e, final C1895e c1895e2) {
        abstractC16063c.m43409k().mo30396d();
        abstractC16063c.m43409k().m57873k().addListener(new Runnable() { // from class: o.md2
            @Override // java.lang.Runnable
            public final void run() {
                c1895e.m4688m();
            }
        }, gb2.m28295c());
        if (abstractC16063c.m43408h() != null) {
            abstractC16063c.m43408h().mo30396d();
            abstractC16063c.m43408h().m57873k().addListener(new Runnable() { // from class: o.nd2
                @Override // java.lang.Runnable
                public final void run() {
                    pd2.m43389j(c1895e2);
                }
            }, gb2.m28295c());
        }
    }

    /* renamed from: t */
    public void m43400t(gjg.AbstractC13760b abstractC13760b) {
        elh.m25220a();
        gjd gjdVar = this.f39841a;
        if (gjdVar == null || gjdVar.m28868e() != abstractC13760b.mo28901b()) {
            return;
        }
        this.f39841a.m28875l(abstractC13760b.mo28900a());
    }

    /* renamed from: u */
    public void m43401u(AbstractC1892b.a aVar) {
        elh.m25220a();
        fgd.m26666j(this.f39842b != null, "The ImageReader is not initialized.");
        this.f39842b.m4689n(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public fjd.AbstractC13463a m43402v(AbstractC16063c abstractC16063c) {
        hu3 hu3Var;
        gzb gzbVar;
        fgd.m26666j(this.f39845e == null && this.f39842b == null, "CaptureNode does not support recreation yet.");
        this.f39845e = abstractC16063c;
        Size sizeMo24265j = abstractC16063c.mo24265j();
        int iMo24260d = abstractC16063c.mo24260d();
        boolean z = !abstractC16063c.mo24266l();
        j72 c16061a = new C16061a();
        if (z) {
            abstractC16063c.mo24259c();
            C1894d c1894d = new C1894d(sizeMo24265j.getWidth(), sizeMo24265j.getHeight(), iMo24260d, 4);
            c16061a = k72.m35091b(c16061a, c1894d.m4677n());
            hu3Var = new hu3() { // from class: o.hd2
                @Override // p001o.hu3
                public final void accept(Object obj) {
                    this.f26670a.m43396p((gjd) obj);
                }
            };
            gzbVar = c1894d;
        } else {
            abstractC16063c.mo24259c();
            gzb gzbVar2 = new gzb(m43387g(null, sizeMo24265j.getWidth(), sizeMo24265j.getHeight(), iMo24260d));
            this.f39846f = gzbVar2;
            hu3Var = new hu3() { // from class: o.id2
                @Override // p001o.hu3
                public final void accept(Object obj) {
                    this.f28475a.m43390k((gjd) obj);
                }
            };
            gzbVar = gzbVar2;
        }
        abstractC16063c.m43410n(c16061a);
        Surface surfaceMo4668a = gzbVar.mo4668a();
        Objects.requireNonNull(surfaceMo4668a);
        abstractC16063c.m43412p(surfaceMo4668a);
        this.f39842b = new C1895e(gzbVar);
        gzbVar.mo4673g(new zd8.InterfaceC18614a() { // from class: o.jd2
            @Override // p001o.zd8.InterfaceC18614a
            /* renamed from: a */
            public final void mo27818a(zd8 zd8Var) {
                this.f30184a.m43391l(zd8Var);
            }
        }, gb2.m28295c());
        if (abstractC16063c.mo24263g() != null) {
            abstractC16063c.mo24259c();
            zd8 zd8VarM43387g = m43387g(null, abstractC16063c.mo24263g().getWidth(), abstractC16063c.mo24263g().getHeight(), abstractC16063c.mo24262f());
            zd8VarM43387g.mo4673g(new zd8.InterfaceC18614a() { // from class: o.kd2
                @Override // p001o.zd8.InterfaceC18614a
                /* renamed from: a */
                public final void mo27818a(zd8 zd8Var) {
                    this.f31938a.m43392m(zd8Var);
                }
            }, gb2.m28295c());
            this.f39843c = new C1895e(zd8VarM43387g);
            abstractC16063c.m43411o(zd8VarM43387g.mo4668a(), abstractC16063c.mo24263g(), abstractC16063c.mo24262f());
        }
        abstractC16063c.mo24264i().m18126a(hu3Var);
        abstractC16063c.mo24258b().m18126a(new hu3() { // from class: o.ld2
            @Override // p001o.hu3
            public final void accept(Object obj) {
                this.f33638a.m43400t((gjg.AbstractC13760b) obj);
            }
        });
        fjd.AbstractC13463a abstractC13463aM26931e = fjd.AbstractC13463a.m26931e(abstractC16063c.mo24260d(), abstractC16063c.mo24261e());
        this.f39844d = abstractC13463aM26931e;
        return abstractC13463aM26931e;
    }
}
