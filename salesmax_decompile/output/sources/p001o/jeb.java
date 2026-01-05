package p001o;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p001o.bhf;
import p001o.d9i;

/* loaded from: classes2.dex */
public class jeb {

    /* renamed from: a */
    public yj5 f30280a;

    /* renamed from: b */
    public bhf f30281b;

    /* renamed from: d */
    public final Size f30283d;

    /* renamed from: f */
    public final InterfaceC14514c f30285f;

    /* renamed from: e */
    public final seg f30284e = new seg();

    /* renamed from: g */
    public bhf.C12403c f30286g = null;

    /* renamed from: c */
    public final C14513b f30282c = new C14513b();

    /* renamed from: o.jeb$a */
    public class C14512a implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ Surface f30287a;

        /* renamed from: b */
        public final /* synthetic */ SurfaceTexture f30288b;

        public C14512a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f30287a = surface;
            this.f30288b = surfaceTexture;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            this.f30287a.release();
            this.f30288b.release();
        }
    }

    /* renamed from: o.jeb$b */
    public static class C14513b implements c9i {

        /* renamed from: H */
        public final mq3 f30290H;

        public C14513b() {
            qpb qpbVarA0 = qpb.a0();
            qpbVarA0.mo45760N(c9i.f17566y, new e72());
            qpbVarA0.mo45760N(kd8.f31942h, 34);
            m33659W(qpbVarA0);
            this.f30290H = qpbVarA0;
        }

        @Override // p001o.c9i
        /* renamed from: M */
        public d9i.EnumC12848b mo20533M() {
            return d9i.EnumC12848b.METERING_REPEATING;
        }

        /* renamed from: W */
        public final void m33659W(qpb qpbVar) {
            qpbVar.mo45760N(sjg.f45490v, jeb.class);
            qpbVar.mo45760N(sjg.f45489u, jeb.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // p001o.lce
        public mq3 getConfig() {
            return this.f30290H;
        }
    }

    /* renamed from: o.jeb$c */
    public interface InterfaceC14514c {
        /* renamed from: a */
        void mo33660a();
    }

    public jeb(s82 s82Var, qu5 qu5Var, InterfaceC14514c interfaceC14514c) {
        this.f30285f = interfaceC14514c;
        Size sizeM33655g = m33655g(s82Var, qu5Var);
        this.f30283d = sizeM33655g;
        wja.m54627a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeM33655g);
        this.f30281b = m33652d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m33649j(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
        this.f30281b = m33652d();
        InterfaceC14514c interfaceC14514c = this.f30285f;
        if (interfaceC14514c != null) {
            interfaceC14514c.mo33660a();
        }
    }

    /* renamed from: k */
    public static /* synthetic */ int m33650k(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* renamed from: c */
    public void m33651c() {
        wja.m54627a("MeteringRepeating", "MeteringRepeating clear!");
        yj5 yj5Var = this.f30280a;
        if (yj5Var != null) {
            yj5Var.mo30396d();
        }
        this.f30280a = null;
    }

    /* renamed from: d */
    public bhf m33652d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f30283d.getWidth(), this.f30283d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        bhf.C12402b c12402bM19037p = bhf.C12402b.m19037p(this.f30282c, this.f30283d);
        c12402bM19037p.m19060x(1);
        hf8 hf8Var = new hf8(surface);
        this.f30280a = hf8Var;
        bn7.m19424j(hf8Var.m57873k(), new C14512a(surface, surfaceTexture), gb2.m28293a());
        c12402bM19037p.m19049l(this.f30280a);
        bhf.C12403c c12403c = this.f30286g;
        if (c12403c != null) {
            c12403c.m19063b();
        }
        bhf.C12403c c12403c2 = new bhf.C12403c(new bhf.InterfaceC12404d() { // from class: o.heb
            @Override // p001o.bhf.InterfaceC12404d
            /* renamed from: a */
            public final void mo19062a(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
                this.f26744a.m33649j(bhfVar, enumC12407g);
            }
        });
        this.f30286g = c12403c2;
        c12402bM19037p.m19054r(c12403c2);
        return c12402bM19037p.m19052o();
    }

    /* renamed from: e */
    public Size m33653e() {
        return this.f30283d;
    }

    /* renamed from: f */
    public String m33654f() {
        return "MeteringRepeating";
    }

    /* renamed from: g */
    public final Size m33655g(s82 s82Var, qu5 qu5Var) {
        Size[] sizeArrM44877c = s82Var.m47966b().m44877c(34);
        if (sizeArrM44877c == null) {
            wja.m54629c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrM48285a = this.f30284e.m48285a(sizeArrM44877c);
        List listAsList = Arrays.asList(sizeArrM48285a);
        Collections.sort(listAsList, new Comparator() { // from class: o.ieb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jeb.m33650k((Size) obj, (Size) obj2);
            }
        });
        Size sizeM45847f = qu5Var.m45847f();
        long jMin = Math.min(sizeM45847f.getWidth() * sizeM45847f.getHeight(), 307200L);
        int length = sizeArrM48285a.length;
        Size size = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Size size2 = sizeArrM48285a[i];
            long width = size2.getWidth() * size2.getHeight();
            if (width == jMin) {
                return size2;
            }
            if (width <= jMin) {
                i++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) listAsList.get(0);
    }

    /* renamed from: h */
    public bhf m33656h() {
        return this.f30281b;
    }

    /* renamed from: i */
    public c9i m33657i() {
        return this.f30282c;
    }
}
