package g5;

import java.util.HashSet;
import java.util.Iterator;
import z4.C8867e;
import z4.EnumC8866d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.d */
/* loaded from: classes.dex */
public final class C2514d {

    /* renamed from: b */
    public int f13752b;

    /* renamed from: c */
    public boolean f13753c;

    /* renamed from: d */
    public final C2517g f13754d;

    /* renamed from: e */
    public final EnumC2513c f13755e;

    /* renamed from: f */
    public C2514d f13756f;

    /* renamed from: i */
    public C8867e f13759i;

    /* renamed from: a */
    public HashSet f13751a = null;

    /* renamed from: g */
    public int f13757g = 0;

    /* renamed from: h */
    public int f13758h = Integer.MIN_VALUE;

    public C2514d(C2517g c2517g, EnumC2513c enumC2513c) {
        this.f13754d = c2517g;
        this.f13755e = enumC2513c;
    }

    /* renamed from: a */
    public final void m6490a(C2514d c2514d, int i10) {
        m6491b(c2514d, i10, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean m6491b(C2514d c2514d, int i10, int i11, boolean z6) {
        if (c2514d == null) {
            m6498i();
            return true;
        }
        if (!z6 && !m6497h(c2514d)) {
            return false;
        }
        this.f13756f = c2514d;
        if (c2514d.f13751a == null) {
            c2514d.f13751a = new HashSet();
        }
        HashSet hashSet = this.f13756f.f13751a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f13757g = i10;
        this.f13758h = i11;
        return true;
    }

    /* renamed from: c */
    public final int m6492c() {
        if (this.f13753c) {
            return this.f13752b;
        }
        return 0;
    }

    /* renamed from: d */
    public final int m6493d() {
        C2514d c2514d;
        if (this.f13754d.f13786Z == 8) {
            return 0;
        }
        int i10 = this.f13758h;
        return (i10 == Integer.MIN_VALUE || (c2514d = this.f13756f) == null || c2514d.f13754d.f13786Z != 8) ? this.f13757g : i10;
    }

    /* renamed from: e */
    public final C2514d m6494e() {
        EnumC2513c enumC2513c = this.f13755e;
        int iOrdinal = enumC2513c.ordinal();
        C2517g c2517g = this.f13754d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c2517g.f13763C;
            case 2:
                return c2517g.f13764D;
            case 3:
                return c2517g.f13761A;
            case 4:
                return c2517g.f13762B;
            default:
                throw new AssertionError(enumC2513c.name());
        }
    }

    /* renamed from: f */
    public final boolean m6495f() {
        HashSet hashSet = this.f13751a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C2514d) it.next()).m6494e().m6496g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m6496g() {
        return this.f13756f != null;
    }

    /* renamed from: h */
    public final boolean m6497h(C2514d c2514d) {
        if (c2514d == null) {
            return false;
        }
        C2517g c2517g = c2514d.f13754d;
        EnumC2513c enumC2513c = c2514d.f13755e;
        EnumC2513c enumC2513c2 = this.f13755e;
        if (enumC2513c == enumC2513c2) {
            return enumC2513c2 != EnumC2513c.BASELINE || (c2517g.f13812z && this.f13754d.f13812z);
        }
        switch (enumC2513c2) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z6 = enumC2513c == EnumC2513c.LEFT || enumC2513c == EnumC2513c.RIGHT;
                return c2517g instanceof C2522l ? z6 || enumC2513c == EnumC2513c.CENTER_X : z6;
            case TOP:
            case BOTTOM:
                boolean z10 = enumC2513c == EnumC2513c.TOP || enumC2513c == EnumC2513c.BOTTOM;
                return c2517g instanceof C2522l ? z10 || enumC2513c == EnumC2513c.CENTER_Y : z10;
            case BASELINE:
                return (enumC2513c == EnumC2513c.LEFT || enumC2513c == EnumC2513c.RIGHT) ? false : true;
            case CENTER:
                return (enumC2513c == EnumC2513c.BASELINE || enumC2513c == EnumC2513c.CENTER_X || enumC2513c == EnumC2513c.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(enumC2513c2.name());
        }
    }

    /* renamed from: i */
    public final void m6498i() {
        HashSet hashSet;
        C2514d c2514d = this.f13756f;
        if (c2514d != null && (hashSet = c2514d.f13751a) != null) {
            hashSet.remove(this);
            if (this.f13756f.f13751a.size() == 0) {
                this.f13756f.f13751a = null;
            }
        }
        this.f13751a = null;
        this.f13756f = null;
        this.f13757g = 0;
        this.f13758h = Integer.MIN_VALUE;
        this.f13753c = false;
        this.f13752b = 0;
    }

    /* renamed from: j */
    public final void m6499j() {
        C8867e c8867e = this.f13759i;
        if (c8867e == null) {
            this.f13759i = new C8867e(EnumC8866d.UNRESTRICTED);
        } else {
            c8867e.m16371c();
        }
    }

    /* renamed from: k */
    public final void m6500k(int i10) {
        this.f13752b = i10;
        this.f13753c = true;
    }

    public final String toString() {
        return this.f13754d.f44238a0 + ":" + this.f13755e.toString();
    }
}
