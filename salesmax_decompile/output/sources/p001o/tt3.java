package p001o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p001o.fzf;

/* loaded from: classes2.dex */
public class tt3 {

    /* renamed from: b */
    public int f47683b;

    /* renamed from: c */
    public boolean f47684c;

    /* renamed from: d */
    public final zt3 f47685d;

    /* renamed from: e */
    public final EnumC17197a f47686e;

    /* renamed from: f */
    public tt3 f47687f;

    /* renamed from: i */
    public fzf f47690i;

    /* renamed from: a */
    public HashSet f47682a = null;

    /* renamed from: g */
    public int f47688g = 0;

    /* renamed from: h */
    public int f47689h = Integer.MIN_VALUE;

    /* renamed from: o.tt3$a */
    public enum EnumC17197a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public tt3(zt3 zt3Var, EnumC17197a enumC17197a) {
        this.f47685d = zt3Var;
        this.f47686e = enumC17197a;
    }

    /* renamed from: a */
    public boolean m50468a(tt3 tt3Var, int i) {
        return m50469b(tt3Var, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean m50469b(tt3 tt3Var, int i, int i2, boolean z) {
        if (tt3Var == null) {
            m50484q();
            return true;
        }
        if (!z && !m50483p(tt3Var)) {
            return false;
        }
        this.f47687f = tt3Var;
        if (tt3Var.f47682a == null) {
            tt3Var.f47682a = new HashSet();
        }
        HashSet hashSet = this.f47687f.f47682a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f47688g = i;
        this.f47689h = i2;
        return true;
    }

    /* renamed from: c */
    public void m50470c(int i, ArrayList arrayList, q8j q8jVar) {
        HashSet hashSet = this.f47682a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ov7.m42714a(((tt3) it.next()).f47685d, i, arrayList, q8jVar);
            }
        }
    }

    /* renamed from: d */
    public HashSet m50471d() {
        return this.f47682a;
    }

    /* renamed from: e */
    public int m50472e() {
        if (this.f47684c) {
            return this.f47683b;
        }
        return 0;
    }

    /* renamed from: f */
    public int m50473f() {
        tt3 tt3Var;
        if (this.f47685d.m59845X() == 8) {
            return 0;
        }
        return (this.f47689h == Integer.MIN_VALUE || (tt3Var = this.f47687f) == null || tt3Var.f47685d.m59845X() != 8) ? this.f47688g : this.f47689h;
    }

    /* renamed from: g */
    public final tt3 m50474g() {
        switch (this.f47686e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f47685d.f57633S;
            case TOP:
                return this.f47685d.f57634T;
            case RIGHT:
                return this.f47685d.f57631Q;
            case BOTTOM:
                return this.f47685d.f57632R;
            default:
                throw new AssertionError(this.f47686e.name());
        }
    }

    /* renamed from: h */
    public zt3 m50475h() {
        return this.f47685d;
    }

    /* renamed from: i */
    public fzf m50476i() {
        return this.f47690i;
    }

    /* renamed from: j */
    public tt3 m50477j() {
        return this.f47687f;
    }

    /* renamed from: k */
    public EnumC17197a m50478k() {
        return this.f47686e;
    }

    /* renamed from: l */
    public boolean m50479l() {
        HashSet hashSet = this.f47682a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((tt3) it.next()).m50474g().m50482o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m50480m() {
        HashSet hashSet = this.f47682a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: n */
    public boolean m50481n() {
        return this.f47684c;
    }

    /* renamed from: o */
    public boolean m50482o() {
        return this.f47687f != null;
    }

    /* renamed from: p */
    public boolean m50483p(tt3 tt3Var) {
        if (tt3Var == null) {
            return false;
        }
        EnumC17197a enumC17197aM50478k = tt3Var.m50478k();
        EnumC17197a enumC17197a = this.f47686e;
        if (enumC17197aM50478k == enumC17197a) {
            return enumC17197a != EnumC17197a.BASELINE || (tt3Var.m50475h().b0() && m50475h().b0());
        }
        switch (enumC17197a) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z = enumC17197aM50478k == EnumC17197a.LEFT || enumC17197aM50478k == EnumC17197a.RIGHT;
                if (tt3Var.m50475h() instanceof rv7) {
                    return z || enumC17197aM50478k == EnumC17197a.CENTER_X;
                }
                return z;
            case TOP:
            case BOTTOM:
                boolean z2 = enumC17197aM50478k == EnumC17197a.TOP || enumC17197aM50478k == EnumC17197a.BOTTOM;
                if (tt3Var.m50475h() instanceof rv7) {
                    return z2 || enumC17197aM50478k == EnumC17197a.CENTER_Y;
                }
                return z2;
            case BASELINE:
                return (enumC17197aM50478k == EnumC17197a.LEFT || enumC17197aM50478k == EnumC17197a.RIGHT) ? false : true;
            case CENTER:
                return (enumC17197aM50478k == EnumC17197a.BASELINE || enumC17197aM50478k == EnumC17197a.CENTER_X || enumC17197aM50478k == EnumC17197a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f47686e.name());
        }
    }

    /* renamed from: q */
    public void m50484q() {
        HashSet hashSet;
        tt3 tt3Var = this.f47687f;
        if (tt3Var != null && (hashSet = tt3Var.f47682a) != null) {
            hashSet.remove(this);
            if (this.f47687f.f47682a.size() == 0) {
                this.f47687f.f47682a = null;
            }
        }
        this.f47682a = null;
        this.f47687f = null;
        this.f47688g = 0;
        this.f47689h = Integer.MIN_VALUE;
        this.f47684c = false;
        this.f47683b = 0;
    }

    /* renamed from: r */
    public void m50485r() {
        this.f47684c = false;
        this.f47683b = 0;
    }

    /* renamed from: s */
    public void m50486s(tr1 tr1Var) {
        fzf fzfVar = this.f47690i;
        if (fzfVar == null) {
            this.f47690i = new fzf(fzf.EnumC13593a.UNRESTRICTED, null);
        } else {
            fzfVar.m27824g();
        }
    }

    /* renamed from: t */
    public void m50487t(int i) {
        this.f47683b = i;
        this.f47684c = true;
    }

    public String toString() {
        return this.f47685d.m59862v() + ":" + this.f47686e.toString();
    }

    /* renamed from: u */
    public void m50488u(int i) {
        if (m50482o()) {
            this.f47689h = i;
        }
    }
}
