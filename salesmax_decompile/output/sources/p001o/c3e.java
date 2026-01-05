package p001o;

import android.util.SparseArray;
import com.google.android.gms.cast.MediaStatus;
import com.google.firebase.perf.util.Constants;
import p001o.hyh;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class c3e implements tq6 {

    /* renamed from: l */
    public static final yq6 f17233l = new yq6() { // from class: o.b3e
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return c3e.m20186e();
        }
    };

    /* renamed from: a */
    public final umh f17234a;

    /* renamed from: b */
    public final SparseArray f17235b;

    /* renamed from: c */
    public final zwc f17236c;

    /* renamed from: d */
    public final a3e f17237d;

    /* renamed from: e */
    public boolean f17238e;

    /* renamed from: f */
    public boolean f17239f;

    /* renamed from: g */
    public boolean f17240g;

    /* renamed from: h */
    public long f17241h;

    /* renamed from: i */
    public z2e f17242i;

    /* renamed from: j */
    public vq6 f17243j;

    /* renamed from: k */
    public boolean f17244k;

    /* renamed from: o.c3e$a */
    public static final class C12546a {

        /* renamed from: a */
        public final n46 f17245a;

        /* renamed from: b */
        public final umh f17246b;

        /* renamed from: c */
        public final ywc f17247c = new ywc(new byte[64]);

        /* renamed from: d */
        public boolean f17248d;

        /* renamed from: e */
        public boolean f17249e;

        /* renamed from: f */
        public boolean f17250f;

        /* renamed from: g */
        public int f17251g;

        /* renamed from: h */
        public long f17252h;

        public C12546a(n46 n46Var, umh umhVar) {
            this.f17245a = n46Var;
            this.f17246b = umhVar;
        }

        /* renamed from: a */
        public void m20188a(zwc zwcVar) {
            zwcVar.m60031l(this.f17247c.f56210a, 0, 3);
            this.f17247c.m58452p(0);
            m20189b();
            zwcVar.m60031l(this.f17247c.f56210a, 0, this.f17251g);
            this.f17247c.m58452p(0);
            m20190c();
            this.f17245a.mo24650e(this.f17252h, 4);
            this.f17245a.mo24646a(zwcVar);
            this.f17245a.mo24648c(false);
        }

        /* renamed from: b */
        public final void m20189b() {
            this.f17247c.m58454r(8);
            this.f17248d = this.f17247c.m58443g();
            this.f17249e = this.f17247c.m58443g();
            this.f17247c.m58454r(6);
            this.f17251g = this.f17247c.m58444h(8);
        }

        /* renamed from: c */
        public final void m20190c() {
            this.f17252h = 0L;
            if (this.f17248d) {
                this.f17247c.m58454r(4);
                this.f17247c.m58454r(1);
                this.f17247c.m58454r(1);
                long jM58444h = (this.f17247c.m58444h(3) << 30) | (this.f17247c.m58444h(15) << 15) | this.f17247c.m58444h(15);
                this.f17247c.m58454r(1);
                if (!this.f17250f && this.f17249e) {
                    this.f17247c.m58454r(4);
                    this.f17247c.m58454r(1);
                    this.f17247c.m58454r(1);
                    this.f17247c.m58454r(1);
                    this.f17246b.m51795b((this.f17247c.m58444h(3) << 30) | (this.f17247c.m58444h(15) << 15) | this.f17247c.m58444h(15));
                    this.f17250f = true;
                }
                this.f17252h = this.f17246b.m51795b(jM58444h);
            }
        }

        /* renamed from: d */
        public void m20191d() {
            this.f17250f = false;
            this.f17245a.mo24647b();
        }
    }

    public c3e() {
        this(new umh(0L));
    }

    /* renamed from: e */
    public static /* synthetic */ tq6[] m20186e() {
        return new tq6[]{new c3e()};
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        boolean z = this.f17234a.m51799f() == -9223372036854775807L;
        if (!z) {
            long jM51797d = this.f17234a.m51797d();
            z = (jM51797d == -9223372036854775807L || jM51797d == 0 || jM51797d == j2) ? false : true;
        }
        if (z) {
            this.f17234a.m51801i(j2);
        }
        z2e z2eVar = this.f17242i;
        if (z2eVar != null) {
            z2eVar.m45455h(j2);
        }
        for (int i = 0; i < this.f17235b.size(); i++) {
            ((C12546a) this.f17235b.valueAt(i)).m20191d();
        }
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        byte[] bArr = new byte[14];
        uq6Var.mo40498m(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        uq6Var.mo40494h(bArr[13] & 7);
        uq6Var.mo40498m(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f17243j = vq6Var;
    }

    /* renamed from: g */
    public final void m20187g(long j) {
        if (this.f17244k) {
            return;
        }
        this.f17244k = true;
        if (this.f17237d.m16390c() == -9223372036854775807L) {
            this.f17243j.mo32490r(new zaf.C18604b(this.f17237d.m16390c()));
            return;
        }
        z2e z2eVar = new z2e(this.f17237d.m16391d(), this.f17237d.m16390c(), j);
        this.f17242i = z2eVar;
        this.f17243j.mo32490r(z2eVar.m45449b());
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        n46 wv7Var;
        op0.m42519i(this.f17243j);
        long length = uq6Var.getLength();
        if ((length != -1) && !this.f17237d.m16392e()) {
            return this.f17237d.m16394g(uq6Var, uedVar);
        }
        m20187g(length);
        z2e z2eVar = this.f17242i;
        if (z2eVar != null && z2eVar.m45451d()) {
            return this.f17242i.m45450c(uq6Var, uedVar);
        }
        uq6Var.mo40490c();
        long jMo40493g = length != -1 ? length - uq6Var.mo40493g() : -1L;
        if ((jMo40493g != -1 && jMo40493g < 4) || !uq6Var.mo40489a(this.f17236c.m60024e(), 0, 4, true)) {
            return -1;
        }
        this.f17236c.m60017U(0);
        int iM60036q = this.f17236c.m60036q();
        if (iM60036q == 441) {
            return -1;
        }
        if (iM60036q == 442) {
            uq6Var.mo40498m(this.f17236c.m60024e(), 0, 10);
            this.f17236c.m60017U(9);
            uq6Var.mo40496k((this.f17236c.m60004H() & 7) + 14);
            return 0;
        }
        if (iM60036q == 443) {
            uq6Var.mo40498m(this.f17236c.m60024e(), 0, 2);
            this.f17236c.m60017U(0);
            uq6Var.mo40496k(this.f17236c.m60010N() + 6);
            return 0;
        }
        if (((iM60036q & (-256)) >> 8) != 1) {
            uq6Var.mo40496k(1);
            return 0;
        }
        int i = iM60036q & Constants.MAX_HOST_LENGTH;
        C12546a c12546a = (C12546a) this.f17235b.get(i);
        if (!this.f17238e) {
            if (c12546a == null) {
                if (i == 189) {
                    wv7Var = new ea();
                    this.f17239f = true;
                    this.f17241h = uq6Var.getPosition();
                } else if ((i & 224) == 192) {
                    wv7Var = new hnb();
                    this.f17239f = true;
                    this.f17241h = uq6Var.getPosition();
                } else if ((i & 240) == 224) {
                    wv7Var = new wv7();
                    this.f17240g = true;
                    this.f17241h = uq6Var.getPosition();
                } else {
                    wv7Var = null;
                }
                if (wv7Var != null) {
                    wv7Var.mo24649d(this.f17243j, new hyh.C14129d(i, 256));
                    c12546a = new C12546a(wv7Var, this.f17234a);
                    this.f17235b.put(i, c12546a);
                }
            }
            if (uq6Var.getPosition() > ((this.f17239f && this.f17240g) ? this.f17241h + MediaStatus.COMMAND_PLAYBACK_RATE : 1048576L)) {
                this.f17238e = true;
                this.f17243j.mo32489p();
            }
        }
        uq6Var.mo40498m(this.f17236c.m60024e(), 0, 2);
        this.f17236c.m60017U(0);
        int iM60010N = this.f17236c.m60010N() + 6;
        if (c12546a == null) {
            uq6Var.mo40496k(iM60010N);
        } else {
            this.f17236c.m60013Q(iM60010N);
            uq6Var.readFully(this.f17236c.m60024e(), 0, iM60010N);
            this.f17236c.m60017U(6);
            c12546a.m20188a(this.f17236c);
            zwc zwcVar = this.f17236c;
            zwcVar.m60016T(zwcVar.m60021b());
        }
        return 0;
    }

    @Override // p001o.tq6
    public void release() {
    }

    public c3e(umh umhVar) {
        this.f17234a = umhVar;
        this.f17236c = new zwc(4096);
        this.f17235b = new SparseArray();
        this.f17237d = new a3e();
    }
}
