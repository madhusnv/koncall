package k5;

import j5.C3592i;
import j5.EnumC3591h;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k5.e */
/* loaded from: classes.dex */
public final class C4010e {

    /* renamed from: b */
    public final C4013h f20725b;

    /* renamed from: c */
    public final EnumC4009d f20726c;

    /* renamed from: d */
    public C4010e f20727d;

    /* renamed from: g */
    public C3592i f20730g;

    /* renamed from: a */
    public HashSet f20724a = null;

    /* renamed from: e */
    public int f20728e = 0;

    /* renamed from: f */
    public int f20729f = -1;

    public C4010e(C4013h c4013h, EnumC4009d enumC4009d) {
        this.f20725b = c4013h;
        this.f20726c = enumC4009d;
    }

    /* renamed from: a */
    public final void m8787a(C4010e c4010e, int i10, int i11) {
        if (c4010e == null) {
            m8791e();
            return;
        }
        this.f20727d = c4010e;
        if (c4010e.f20724a == null) {
            c4010e.f20724a = new HashSet();
        }
        this.f20727d.f20724a.add(this);
        if (i10 > 0) {
            this.f20728e = i10;
        } else {
            this.f20728e = 0;
        }
        this.f20729f = i11;
    }

    /* renamed from: b */
    public final int m8788b() {
        C4010e c4010e;
        if (this.f20725b.f20755W == 8) {
            return 0;
        }
        int i10 = this.f20729f;
        return (i10 <= -1 || (c4010e = this.f20727d) == null || c4010e.f20725b.f20755W != 8) ? this.f20728e : i10;
    }

    /* renamed from: c */
    public final boolean m8789c() {
        C4010e c4010e;
        HashSet hashSet = this.f20724a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C4010e c4010e2 = (C4010e) it.next();
            C4013h c4013h = c4010e2.f20725b;
            int[] iArr = AbstractC4008c.f20723a;
            EnumC4009d enumC4009d = c4010e2.f20726c;
            switch (iArr[enumC4009d.ordinal()]) {
                case 1:
                case 6:
                case 7:
                case 8:
                case 9:
                    c4010e = null;
                    break;
                case 2:
                    c4010e = c4013h.f20784z;
                    break;
                case 3:
                    c4010e = c4013h.f20782x;
                    break;
                case 4:
                    c4010e = c4013h.f20733A;
                    break;
                case 5:
                    c4010e = c4013h.f20783y;
                    break;
                default:
                    throw new AssertionError(enumC4009d.name());
            }
            if (c4010e.m8790d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m8790d() {
        return this.f20727d != null;
    }

    /* renamed from: e */
    public final void m8791e() {
        HashSet hashSet;
        C4010e c4010e = this.f20727d;
        if (c4010e != null && (hashSet = c4010e.f20724a) != null) {
            hashSet.remove(this);
        }
        this.f20727d = null;
        this.f20728e = 0;
        this.f20729f = -1;
    }

    /* renamed from: f */
    public final void m8792f() {
        C3592i c3592i = this.f20730g;
        if (c3592i == null) {
            this.f20730g = new C3592i(EnumC3591h.UNRESTRICTED);
        } else {
            c3592i.m8153c();
        }
    }

    public final String toString() {
        return this.f20725b.f20756X + ":" + this.f20726c.toString();
    }
}
