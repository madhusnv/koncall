package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import p001o.qbg;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class o79 implements tq6 {

    /* renamed from: b */
    public vq6 f37845b;

    /* renamed from: c */
    public int f37846c;

    /* renamed from: d */
    public int f37847d;

    /* renamed from: e */
    public int f37848e;

    /* renamed from: g */
    public MotionPhotoMetadata f37850g;

    /* renamed from: h */
    public uq6 f37851h;

    /* renamed from: i */
    public v3g f37852i;

    /* renamed from: j */
    public fnb f37853j;

    /* renamed from: a */
    public final zwc f37844a = new zwc(6);

    /* renamed from: f */
    public long f37849f = -1;

    /* renamed from: g */
    public static MotionPhotoMetadata m41678g(String str, long j) {
        rmb rmbVarM59360a;
        if (j == -1 || (rmbVarM59360a = zej.m59360a(str)) == null) {
            return null;
        }
        return rmbVarM59360a.m46981a(j);
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        if (j == 0) {
            this.f37846c = 0;
            this.f37853j = null;
        } else if (this.f37846c == 5) {
            ((fnb) op0.m42515e(this.f37853j)).mo17261a(j, j2);
        }
    }

    /* renamed from: b */
    public final void m41679b(uq6 uq6Var) {
        this.f37844a.m60013Q(2);
        uq6Var.mo40498m(this.f37844a.m60024e(), 0, 2);
        uq6Var.mo40494h(this.f37844a.m60010N() - 2);
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        if (m41682j(uq6Var) != 65496) {
            return false;
        }
        int iM41682j = m41682j(uq6Var);
        this.f37847d = iM41682j;
        if (iM41682j == 65504) {
            m41679b(uq6Var);
            this.f37847d = m41682j(uq6Var);
        }
        if (this.f37847d != 65505) {
            return false;
        }
        uq6Var.mo40494h(2);
        this.f37844a.m60013Q(6);
        uq6Var.mo40498m(this.f37844a.m60024e(), 0, 6);
        return this.f37844a.m60006J() == 1165519206 && this.f37844a.m60010N() == 0;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f37845b = vq6Var;
    }

    /* renamed from: e */
    public final void m41680e() {
        ((vq6) op0.m42515e(this.f37845b)).mo32489p();
        this.f37845b.mo32490r(new zaf.C18604b(-9223372036854775807L));
        this.f37846c = 6;
    }

    /* renamed from: h */
    public final void m41681h(MotionPhotoMetadata motionPhotoMetadata) {
        ((vq6) op0.m42515e(this.f37845b)).mo32487f(1024, 4).mo7072b(new C2181a.b().m6754Q("image/jpeg").h0(new Metadata(motionPhotoMetadata)).m6748K());
    }

    /* renamed from: j */
    public final int m41682j(uq6 uq6Var) {
        this.f37844a.m60013Q(2);
        uq6Var.mo40498m(this.f37844a.m60024e(), 0, 2);
        return this.f37844a.m60010N();
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        int i = this.f37846c;
        if (i == 0) {
            m41683l(uq6Var);
            return 0;
        }
        if (i == 1) {
            m41685n(uq6Var);
            return 0;
        }
        if (i == 2) {
            m41684m(uq6Var);
            return 0;
        }
        if (i == 4) {
            long position = uq6Var.getPosition();
            long j = this.f37849f;
            if (position != j) {
                uedVar.f48772a = j;
                return 1;
            }
            m41686o(uq6Var);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f37852i == null || uq6Var != this.f37851h) {
            this.f37851h = uq6Var;
            this.f37852i = new v3g(uq6Var, this.f37849f);
        }
        int iMo17264k = ((fnb) op0.m42515e(this.f37853j)).mo17264k(this.f37852i, uedVar);
        if (iMo17264k == 1) {
            uedVar.f48772a += this.f37849f;
        }
        return iMo17264k;
    }

    /* renamed from: l */
    public final void m41683l(uq6 uq6Var) {
        this.f37844a.m60013Q(2);
        uq6Var.readFully(this.f37844a.m60024e(), 0, 2);
        int iM60010N = this.f37844a.m60010N();
        this.f37847d = iM60010N;
        if (iM60010N == 65498) {
            if (this.f37849f != -1) {
                this.f37846c = 4;
                return;
            } else {
                m41680e();
                return;
            }
        }
        if ((iM60010N < 65488 || iM60010N > 65497) && iM60010N != 65281) {
            this.f37846c = 1;
        }
    }

    /* renamed from: m */
    public final void m41684m(uq6 uq6Var) {
        String strM59998B;
        if (this.f37847d == 65505) {
            zwc zwcVar = new zwc(this.f37848e);
            uq6Var.readFully(zwcVar.m60024e(), 0, this.f37848e);
            if (this.f37850g == null && "http://ns.adobe.com/xap/1.0/".equals(zwcVar.m59998B()) && (strM59998B = zwcVar.m59998B()) != null) {
                MotionPhotoMetadata motionPhotoMetadataM41678g = m41678g(strM59998B, uq6Var.getLength());
                this.f37850g = motionPhotoMetadataM41678g;
                if (motionPhotoMetadataM41678g != null) {
                    this.f37849f = motionPhotoMetadataM41678g.f8703d;
                }
            }
        } else {
            uq6Var.mo40496k(this.f37848e);
        }
        this.f37846c = 0;
    }

    /* renamed from: n */
    public final void m41685n(uq6 uq6Var) {
        this.f37844a.m60013Q(2);
        uq6Var.readFully(this.f37844a.m60024e(), 0, 2);
        this.f37848e = this.f37844a.m60010N() - 2;
        this.f37846c = 2;
    }

    /* renamed from: o */
    public final void m41686o(uq6 uq6Var) {
        if (!uq6Var.mo40489a(this.f37844a.m60024e(), 0, 1, true)) {
            m41680e();
            return;
        }
        uq6Var.mo40490c();
        if (this.f37853j == null) {
            this.f37853j = new fnb(qbg.InterfaceC16329a.f41600a, 8);
        }
        v3g v3gVar = new v3g(uq6Var, this.f37849f);
        this.f37852i = v3gVar;
        if (!this.f37853j.mo17262c(v3gVar)) {
            m41680e();
        } else {
            this.f37853j.mo17263d(new w3g(this.f37849f, (vq6) op0.m42515e(this.f37845b)));
            m41687p();
        }
    }

    /* renamed from: p */
    public final void m41687p() {
        m41681h((MotionPhotoMetadata) op0.m42515e(this.f37850g));
        this.f37846c = 5;
    }

    @Override // p001o.tq6
    public void release() {
        fnb fnbVar = this.f37853j;
        if (fnbVar != null) {
            fnbVar.release();
        }
    }
}
