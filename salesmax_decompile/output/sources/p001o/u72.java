package p001o;

import android.hardware.camera2.CaptureResult;
import p001o.hm6;

/* loaded from: classes2.dex */
public interface u72 {

    /* renamed from: o.u72$a */
    public static final class C17312a implements u72 {
        /* renamed from: k */
        public static u72 m51071k() {
            return new C17312a();
        }

        @Override // p001o.u72
        /* renamed from: a */
        public wig mo46018a() {
            return wig.m54615b();
        }

        @Override // p001o.u72
        /* renamed from: c */
        public s72 mo46019c() {
            return s72.UNKNOWN;
        }

        @Override // p001o.u72
        /* renamed from: d */
        public q72 mo46020d() {
            return q72.UNKNOWN;
        }

        @Override // p001o.u72
        /* renamed from: e */
        public CaptureResult mo46192e() {
            return null;
        }

        @Override // p001o.u72
        /* renamed from: f */
        public m72 mo46021f() {
            return m72.UNKNOWN;
        }

        @Override // p001o.u72
        /* renamed from: g */
        public p72 mo46022g() {
            return p72.UNKNOWN;
        }

        @Override // p001o.u72
        public long getTimestamp() {
            return -1L;
        }

        @Override // p001o.u72
        /* renamed from: h */
        public r72 mo46023h() {
            return r72.UNKNOWN;
        }

        @Override // p001o.u72
        /* renamed from: i */
        public o72 mo46024i() {
            return o72.UNKNOWN;
        }

        @Override // p001o.u72
        /* renamed from: j */
        public n72 mo46025j() {
            return n72.UNKNOWN;
        }
    }

    /* renamed from: a */
    wig mo46018a();

    /* renamed from: b */
    default void mo46191b(hm6.C13999b c13999b) throws NumberFormatException {
        c13999b.m30797g(mo46019c());
    }

    /* renamed from: c */
    s72 mo46019c();

    /* renamed from: d */
    q72 mo46020d();

    /* renamed from: e */
    default CaptureResult mo46192e() {
        return null;
    }

    /* renamed from: f */
    m72 mo46021f();

    /* renamed from: g */
    p72 mo46022g();

    long getTimestamp();

    /* renamed from: h */
    r72 mo46023h();

    /* renamed from: i */
    o72 mo46024i();

    /* renamed from: j */
    n72 mo46025j();
}
