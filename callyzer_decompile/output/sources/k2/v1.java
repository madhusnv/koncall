package k2;

import e1.C1922x;
import fx.InterfaceC2395a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v1 implements Iterable, InterfaceC2395a {

    /* renamed from: b */
    public int f20594b;

    /* renamed from: d */
    public int f20596d;

    /* renamed from: e */
    public int f20597e;

    /* renamed from: g */
    public boolean f20599g;

    /* renamed from: h */
    public int f20600h;

    /* renamed from: k */
    public HashMap f20602k;

    /* renamed from: l */
    public C1922x f20603l;

    /* renamed from: a */
    public int[] f20593a = new int[0];

    /* renamed from: c */
    public Object[] f20595c = new Object[0];

    /* renamed from: f */
    public final Object f20598f = new Object();

    /* renamed from: j */
    public ArrayList f20601j = new ArrayList();

    /* renamed from: b */
    public final int m8700b(C3952a c3952a) {
        if (this.f20599g) {
            AbstractC3967p.m8636c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c3952a.m8486a()) {
            j1.m8542a("Anchor refers to a group that was removed");
        }
        return c3952a.f20343a;
    }

    /* renamed from: h */
    public final void m8701h() {
        this.f20602k = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j0(this, 0, this.f20594b);
    }

    /* renamed from: j */
    public final u1 m8702j() {
        if (this.f20599g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f20597e++;
        return new u1(this);
    }

    /* renamed from: q */
    public final y1 m8703q() {
        if (this.f20599g) {
            AbstractC3967p.m8636c("Cannot start a writer when another writer is pending");
        }
        if (this.f20597e > 0) {
            AbstractC3967p.m8636c("Cannot start a writer when a reader is pending");
        }
        this.f20599g = true;
        this.f20600h++;
        return new y1(this);
    }

    /* renamed from: r */
    public final boolean m8704r(C3952a c3952a) {
        int iM8709e;
        return c3952a.m8486a() && (iM8709e = x1.m8709e(this.f20601j, c3952a.f20343a, this.f20594b)) >= 0 && AbstractC4154l.m8918a(this.f20601j.get(iM8709e), c3952a);
    }
}
