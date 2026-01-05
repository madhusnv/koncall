package p001o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ps7 {

    /* renamed from: a */
    public final is7 f40476a;

    /* renamed from: b */
    public final Handler f40477b;

    /* renamed from: c */
    public final List f40478c;

    /* renamed from: d */
    public final hme f40479d;

    /* renamed from: e */
    public final mi1 f40480e;

    /* renamed from: f */
    public boolean f40481f;

    /* renamed from: g */
    public boolean f40482g;

    /* renamed from: h */
    public boolean f40483h;

    /* renamed from: i */
    public yle f40484i;

    /* renamed from: j */
    public C16173a f40485j;

    /* renamed from: k */
    public boolean f40486k;

    /* renamed from: l */
    public C16173a f40487l;

    /* renamed from: m */
    public Bitmap f40488m;

    /* renamed from: n */
    public xuh f40489n;

    /* renamed from: o */
    public C16173a f40490o;

    /* renamed from: p */
    public int f40491p;

    /* renamed from: q */
    public int f40492q;

    /* renamed from: r */
    public int f40493r;

    /* renamed from: o.ps7$a */
    public static class C16173a extends li4 {

        /* renamed from: d */
        public final Handler f40494d;

        /* renamed from: e */
        public final int f40495e;

        /* renamed from: f */
        public final long f40496f;

        /* renamed from: g */
        public Bitmap f40497g;

        public C16173a(Handler handler, int i, long j) {
            this.f40494d = handler;
            this.f40495e = i;
            this.f40496f = j;
        }

        /* renamed from: c */
        public Bitmap m44124c() {
            return this.f40497g;
        }

        @Override // p001o.pjg
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo40415i(Bitmap bitmap, mvh mvhVar) {
            this.f40497g = bitmap;
            this.f40494d.sendMessageAtTime(this.f40494d.obtainMessage(1, this), this.f40496f);
        }

        @Override // p001o.pjg
        /* renamed from: h */
        public void mo36385h(Drawable drawable) {
            this.f40497g = null;
        }
    }

    /* renamed from: o.ps7$b */
    public interface InterfaceC16174b {
        /* renamed from: a */
        void mo34455a();
    }

    /* renamed from: o.ps7$c */
    public class C16175c implements Handler.Callback {
        public C16175c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ps7.this.m44117m((C16173a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            ps7.this.f40479d.m30820l((C16173a) message.obj);
            return false;
        }
    }

    public ps7(ComponentCallbacks2C10724a componentCallbacks2C10724a, is7 is7Var, int i, int i2, xuh xuhVar, Bitmap bitmap) {
        this(componentCallbacks2C10724a.m12656f(), ComponentCallbacks2C10724a.m12653t(componentCallbacks2C10724a.m12658h()), is7Var, null, m44106i(ComponentCallbacks2C10724a.m12653t(componentCallbacks2C10724a.m12658h()), i, i2), xuhVar, bitmap);
    }

    /* renamed from: g */
    public static ic9 m44105g() {
        return new l6c(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static yle m44106i(hme hmeVar, int i, int i2) {
        return hmeVar.mo21761f().n0(((qme) ((qme) qme.n0(qt5.f42383b).l0(true)).e0(true)).mo17813V(i, i2));
    }

    /* renamed from: a */
    public void m44107a() {
        this.f40478c.clear();
        m44118n();
        m44121q();
        C16173a c16173a = this.f40485j;
        if (c16173a != null) {
            this.f40479d.m30820l(c16173a);
            this.f40485j = null;
        }
        C16173a c16173a2 = this.f40487l;
        if (c16173a2 != null) {
            this.f40479d.m30820l(c16173a2);
            this.f40487l = null;
        }
        C16173a c16173a3 = this.f40490o;
        if (c16173a3 != null) {
            this.f40479d.m30820l(c16173a3);
            this.f40490o = null;
        }
        this.f40476a.clear();
        this.f40486k = true;
    }

    /* renamed from: b */
    public ByteBuffer m44108b() {
        return this.f40476a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m44109c() {
        C16173a c16173a = this.f40485j;
        return c16173a != null ? c16173a.m44124c() : this.f40488m;
    }

    /* renamed from: d */
    public int m44110d() {
        C16173a c16173a = this.f40485j;
        if (c16173a != null) {
            return c16173a.f40495e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m44111e() {
        return this.f40488m;
    }

    /* renamed from: f */
    public int m44112f() {
        return this.f40476a.mo32675c();
    }

    /* renamed from: h */
    public int m44113h() {
        return this.f40493r;
    }

    /* renamed from: j */
    public int m44114j() {
        return this.f40476a.mo32680h() + this.f40491p;
    }

    /* renamed from: k */
    public int m44115k() {
        return this.f40492q;
    }

    /* renamed from: l */
    public final void m44116l() {
        if (!this.f40481f || this.f40482g) {
            return;
        }
        if (this.f40483h) {
            bgd.m18883a(this.f40490o == null, "Pending target must be null when starting from the first frame");
            this.f40476a.mo32678f();
            this.f40483h = false;
        }
        C16173a c16173a = this.f40490o;
        if (c16173a != null) {
            this.f40490o = null;
            m44117m(c16173a);
            return;
        }
        this.f40482g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f40476a.mo32677e();
        this.f40476a.mo32674b();
        this.f40487l = new C16173a(this.f40477b, this.f40476a.mo32679g(), jUptimeMillis);
        this.f40484i.n0(qme.o0(m44105g())).F0(this.f40476a).w0(this.f40487l);
    }

    /* renamed from: m */
    public void m44117m(C16173a c16173a) {
        this.f40482g = false;
        if (this.f40486k) {
            this.f40477b.obtainMessage(2, c16173a).sendToTarget();
            return;
        }
        if (!this.f40481f) {
            if (this.f40483h) {
                this.f40477b.obtainMessage(2, c16173a).sendToTarget();
                return;
            } else {
                this.f40490o = c16173a;
                return;
            }
        }
        if (c16173a.m44124c() != null) {
            m44118n();
            C16173a c16173a2 = this.f40485j;
            this.f40485j = c16173a;
            for (int size = this.f40478c.size() - 1; size >= 0; size--) {
                ((InterfaceC16174b) this.f40478c.get(size)).mo34455a();
            }
            if (c16173a2 != null) {
                this.f40477b.obtainMessage(2, c16173a2).sendToTarget();
            }
        }
        m44116l();
    }

    /* renamed from: n */
    public final void m44118n() {
        Bitmap bitmap = this.f40488m;
        if (bitmap != null) {
            this.f40480e.mo38104c(bitmap);
            this.f40488m = null;
        }
    }

    /* renamed from: o */
    public void m44119o(xuh xuhVar, Bitmap bitmap) {
        this.f40489n = (xuh) bgd.m18886d(xuhVar);
        this.f40488m = (Bitmap) bgd.m18886d(bitmap);
        this.f40484i = this.f40484i.n0(new qme().h0(xuhVar));
        this.f40491p = uqi.m51926g(bitmap);
        this.f40492q = bitmap.getWidth();
        this.f40493r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m44120p() {
        if (this.f40481f) {
            return;
        }
        this.f40481f = true;
        this.f40486k = false;
        m44116l();
    }

    /* renamed from: q */
    public final void m44121q() {
        this.f40481f = false;
    }

    /* renamed from: r */
    public void m44122r(InterfaceC16174b interfaceC16174b) {
        if (this.f40486k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f40478c.contains(interfaceC16174b)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f40478c.isEmpty();
        this.f40478c.add(interfaceC16174b);
        if (zIsEmpty) {
            m44120p();
        }
    }

    /* renamed from: s */
    public void m44123s(InterfaceC16174b interfaceC16174b) {
        this.f40478c.remove(interfaceC16174b);
        if (this.f40478c.isEmpty()) {
            m44121q();
        }
    }

    public ps7(mi1 mi1Var, hme hmeVar, is7 is7Var, Handler handler, yle yleVar, xuh xuhVar, Bitmap bitmap) {
        this.f40478c = new ArrayList();
        this.f40479d = hmeVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C16175c()) : handler;
        this.f40480e = mi1Var;
        this.f40477b = handler;
        this.f40484i = yleVar;
        this.f40476a = is7Var;
        m44119o(xuhVar, bitmap);
    }
}
