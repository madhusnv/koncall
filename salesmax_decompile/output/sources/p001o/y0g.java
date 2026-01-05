package p001o;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.t16;

/* loaded from: classes2.dex */
public final class y0g extends t16 {

    /* renamed from: A */
    public z0g f54680A;

    /* renamed from: B */
    public float f54681B;

    /* renamed from: C */
    public boolean f54682C;

    public y0g(p37 p37Var) {
        super(p37Var);
        this.f54680A = null;
        this.f54681B = Float.MAX_VALUE;
        this.f54682C = false;
    }

    @Override // p001o.t16
    /* renamed from: o */
    public void mo49141o(float f) {
    }

    @Override // p001o.t16
    /* renamed from: p */
    public void mo49142p() {
        m57092v();
        this.f54680A.m58633i(m49133f());
        super.mo49142p();
    }

    @Override // p001o.t16
    /* renamed from: r */
    public boolean mo49144r(long j) {
        if (this.f54682C) {
            float f = this.f54681B;
            if (f != Float.MAX_VALUE) {
                this.f54680A.m58631g(f);
                this.f54681B = Float.MAX_VALUE;
            }
            this.f46216b = this.f54680A.m58626b();
            this.f46215a = 0.0f;
            this.f54682C = false;
            return true;
        }
        if (this.f54681B != Float.MAX_VALUE) {
            this.f54680A.m58626b();
            long j2 = j / 2;
            t16.C16974p c16974pM58634j = this.f54680A.m58634j(this.f46216b, this.f46215a, j2);
            this.f54680A.m58631g(this.f54681B);
            this.f54681B = Float.MAX_VALUE;
            t16.C16974p c16974pM58634j2 = this.f54680A.m58634j(c16974pM58634j.f46229a, c16974pM58634j.f46230b, j2);
            this.f46216b = c16974pM58634j2.f46229a;
            this.f46215a = c16974pM58634j2.f46230b;
        } else {
            t16.C16974p c16974pM58634j3 = this.f54680A.m58634j(this.f46216b, this.f46215a, j);
            this.f46216b = c16974pM58634j3.f46229a;
            this.f46215a = c16974pM58634j3.f46230b;
        }
        float fMax = Math.max(this.f46216b, this.f46222h);
        this.f46216b = fMax;
        float fMin = Math.min(fMax, this.f46221g);
        this.f46216b = fMin;
        if (!m57091u(fMin, this.f46215a)) {
            return false;
        }
        this.f46216b = this.f54680A.m58626b();
        this.f46215a = 0.0f;
        return true;
    }

    /* renamed from: s */
    public void m57089s(float f) {
        if (m49134g()) {
            this.f54681B = f;
            return;
        }
        if (this.f54680A == null) {
            this.f54680A = new z0g(f);
        }
        this.f54680A.m58631g(f);
        mo49142p();
    }

    /* renamed from: t */
    public boolean m57090t() {
        return this.f54680A.f56376b > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* renamed from: u */
    public boolean m57091u(float f, float f2) {
        return this.f54680A.m58629e(f, f2);
    }

    /* renamed from: v */
    public final void m57092v() {
        z0g z0gVar = this.f54680A;
        if (z0gVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM58626b = z0gVar.m58626b();
        if (dM58626b > this.f46221g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dM58626b < this.f46222h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    /* renamed from: w */
    public y0g m57093w(z0g z0gVar) {
        this.f54680A = z0gVar;
        return this;
    }

    /* renamed from: x */
    public void m57094x() {
        if (!m57090t()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f46220f) {
            this.f54682C = true;
        }
    }

    public y0g(Object obj, l37 l37Var) {
        super(obj, l37Var);
        this.f54680A = null;
        this.f54681B = Float.MAX_VALUE;
        this.f54682C = false;
    }
}
