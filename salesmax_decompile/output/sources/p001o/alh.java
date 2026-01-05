package p001o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public class alh {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14932b = AtomicIntegerFieldUpdater.newUpdater(alh.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public blh[] f14933a;

    /* renamed from: a */
    public final void m17389a(blh blhVar) {
        blhVar.mo19337d(this);
        blh[] blhVarArrM17394g = m17394g();
        int iM17391c = m17391c();
        m17398k(iM17391c + 1);
        blhVarArrM17394g[iM17391c] = blhVar;
        blhVar.mo19338e(iM17391c);
        m17400m(iM17391c);
    }

    /* renamed from: b */
    public final blh m17390b() {
        blh[] blhVarArr = this.f14933a;
        if (blhVarArr != null) {
            return blhVarArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m17391c() {
        return f14932b.get(this);
    }

    /* renamed from: e */
    public final boolean m17392e() {
        return m17391c() == 0;
    }

    /* renamed from: f */
    public final blh m17393f() {
        blh blhVarM17390b;
        synchronized (this) {
            blhVarM17390b = m17390b();
        }
        return blhVarM17390b;
    }

    /* renamed from: g */
    public final blh[] m17394g() {
        blh[] blhVarArr = this.f14933a;
        if (blhVarArr == null) {
            blh[] blhVarArr2 = new blh[4];
            this.f14933a = blhVarArr2;
            return blhVarArr2;
        }
        if (m17391c() < blhVarArr.length) {
            return blhVarArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(blhVarArr, m17391c() * 2);
        sq8.m48648g(objArrCopyOf, "copyOf(...)");
        blh[] blhVarArr3 = (blh[]) objArrCopyOf;
        this.f14933a = blhVarArr3;
        return blhVarArr3;
    }

    /* renamed from: h */
    public final boolean m17395h(blh blhVar) {
        boolean z;
        synchronized (this) {
            if (blhVar.mo19336a() == null) {
                z = false;
            } else {
                m17396i(blhVar.mo19339r());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final blh m17396i(int i) {
        blh[] blhVarArr = this.f14933a;
        sq8.m48646e(blhVarArr);
        m17398k(m17391c() - 1);
        if (i < m17391c()) {
            m17401n(i, m17391c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                blh blhVar = blhVarArr[i];
                sq8.m48646e(blhVar);
                blh blhVar2 = blhVarArr[i2];
                sq8.m48646e(blhVar2);
                if (((Comparable) blhVar).compareTo(blhVar2) < 0) {
                    m17401n(i, i2);
                    m17400m(i2);
                } else {
                    m17399l(i);
                }
            }
        }
        blh blhVar3 = blhVarArr[m17391c()];
        sq8.m48646e(blhVar3);
        blhVar3.mo19337d(null);
        blhVar3.mo19338e(-1);
        blhVarArr[m17391c()] = null;
        return blhVar3;
    }

    /* renamed from: j */
    public final blh m17397j() {
        blh blhVarM17396i;
        synchronized (this) {
            blhVarM17396i = m17391c() > 0 ? m17396i(0) : null;
        }
        return blhVarM17396i;
    }

    /* renamed from: k */
    public final void m17398k(int i) {
        f14932b.set(this, i);
    }

    /* renamed from: l */
    public final void m17399l(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= m17391c()) {
                return;
            }
            blh[] blhVarArr = this.f14933a;
            sq8.m48646e(blhVarArr);
            int i3 = i2 + 1;
            if (i3 < m17391c()) {
                blh blhVar = blhVarArr[i3];
                sq8.m48646e(blhVar);
                blh blhVar2 = blhVarArr[i2];
                sq8.m48646e(blhVar2);
                if (((Comparable) blhVar).compareTo(blhVar2) < 0) {
                    i2 = i3;
                }
            }
            blh blhVar3 = blhVarArr[i];
            sq8.m48646e(blhVar3);
            blh blhVar4 = blhVarArr[i2];
            sq8.m48646e(blhVar4);
            if (((Comparable) blhVar3).compareTo(blhVar4) <= 0) {
                return;
            }
            m17401n(i, i2);
            i = i2;
        }
    }

    /* renamed from: m */
    public final void m17400m(int i) {
        while (i > 0) {
            blh[] blhVarArr = this.f14933a;
            sq8.m48646e(blhVarArr);
            int i2 = (i - 1) / 2;
            blh blhVar = blhVarArr[i2];
            sq8.m48646e(blhVar);
            blh blhVar2 = blhVarArr[i];
            sq8.m48646e(blhVar2);
            if (((Comparable) blhVar).compareTo(blhVar2) <= 0) {
                return;
            }
            m17401n(i, i2);
            i = i2;
        }
    }

    /* renamed from: n */
    public final void m17401n(int i, int i2) {
        blh[] blhVarArr = this.f14933a;
        sq8.m48646e(blhVarArr);
        blh blhVar = blhVarArr[i2];
        sq8.m48646e(blhVar);
        blh blhVar2 = blhVarArr[i];
        sq8.m48646e(blhVar2);
        blhVarArr[i] = blhVar;
        blhVarArr[i2] = blhVar2;
        blhVar.mo19338e(i);
        blhVar2.mo19338e(i2);
    }
}
