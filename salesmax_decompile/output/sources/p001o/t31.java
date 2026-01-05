package p001o;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* loaded from: classes2.dex */
public final class t31 extends os0 {

    /* renamed from: a */
    public final weg f46281a;

    /* renamed from: b */
    public final int f46282b;

    /* renamed from: c */
    public final Size f46283c;

    /* renamed from: d */
    public final y16 f46284d;

    /* renamed from: e */
    public final List f46285e;

    /* renamed from: f */
    public final mq3 f46286f;

    /* renamed from: g */
    public final Range f46287g;

    public t31(weg wegVar, int i, Size size, y16 y16Var, List list, mq3 mq3Var, Range range) {
        if (wegVar == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f46281a = wegVar;
        this.f46282b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f46283c = size;
        if (y16Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f46284d = y16Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f46285e = list;
        this.f46286f = mq3Var;
        this.f46287g = range;
    }

    @Override // p001o.os0
    /* renamed from: b */
    public List mo42613b() {
        return this.f46285e;
    }

    @Override // p001o.os0
    /* renamed from: c */
    public y16 mo42614c() {
        return this.f46284d;
    }

    @Override // p001o.os0
    /* renamed from: d */
    public int mo42615d() {
        return this.f46282b;
    }

    @Override // p001o.os0
    /* renamed from: e */
    public mq3 mo42616e() {
        return this.f46286f;
    }

    public boolean equals(Object obj) {
        mq3 mq3Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof os0)) {
            return false;
        }
        os0 os0Var = (os0) obj;
        if (this.f46281a.equals(os0Var.mo42618g()) && this.f46282b == os0Var.mo42615d() && this.f46283c.equals(os0Var.mo42617f()) && this.f46284d.equals(os0Var.mo42614c()) && this.f46285e.equals(os0Var.mo42613b()) && ((mq3Var = this.f46286f) != null ? mq3Var.equals(os0Var.mo42616e()) : os0Var.mo42616e() == null)) {
            Range range = this.f46287g;
            if (range == null) {
                if (os0Var.mo42619h() == null) {
                    return true;
                }
            } else if (range.equals(os0Var.mo42619h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.os0
    /* renamed from: f */
    public Size mo42617f() {
        return this.f46283c;
    }

    @Override // p001o.os0
    /* renamed from: g */
    public weg mo42618g() {
        return this.f46281a;
    }

    @Override // p001o.os0
    /* renamed from: h */
    public Range mo42619h() {
        return this.f46287g;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f46281a.hashCode() ^ 1000003) * 1000003) ^ this.f46282b) * 1000003) ^ this.f46283c.hashCode()) * 1000003) ^ this.f46284d.hashCode()) * 1000003) ^ this.f46285e.hashCode()) * 1000003;
        mq3 mq3Var = this.f46286f;
        int iHashCode2 = (iHashCode ^ (mq3Var == null ? 0 : mq3Var.hashCode())) * 1000003;
        Range range = this.f46287g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f46281a + ", imageFormat=" + this.f46282b + ", size=" + this.f46283c + ", dynamicRange=" + this.f46284d + ", captureTypes=" + this.f46285e + ", implementationOptions=" + this.f46286f + ", targetFrameRate=" + this.f46287g + "}";
    }
}
