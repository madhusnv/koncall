package c0;

import a1.RunnableC0012k;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import com.google.android.gms.internal.measurement.j4;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 implements i0.d1, c0 {

    /* renamed from: a */
    public final Object f5085a;

    /* renamed from: b */
    public final e1 f5086b;

    /* renamed from: c */
    public int f5087c;

    /* renamed from: d */
    public final a1.c0 f5088d;

    /* renamed from: e */
    public boolean f5089e;

    /* renamed from: f */
    public final j4 f5090f;

    /* renamed from: g */
    public i0.c1 f5091g;

    /* renamed from: h */
    public Executor f5092h;

    /* renamed from: j */
    public final LongSparseArray f5093j;

    /* renamed from: k */
    public final LongSparseArray f5094k;

    /* renamed from: l */
    public int f5095l;

    /* renamed from: m */
    public final ArrayList f5096m;

    /* renamed from: n */
    public final ArrayList f5097n;

    public f1(int i10, int i11, int i12, int i13) {
        j4 j4Var = new j4(ImageReader.newInstance(i10, i11, i12, i13));
        this.f5085a = new Object();
        this.f5086b = new e1(0, this);
        this.f5087c = 0;
        this.f5088d = new a1.c0(4, this);
        this.f5089e = false;
        this.f5093j = new LongSparseArray();
        this.f5094k = new LongSparseArray();
        this.f5097n = new ArrayList();
        this.f5090f = j4Var;
        this.f5095l = 0;
        this.f5096m = new ArrayList(mo1884z());
    }

    @Override // i0.d1
    /* renamed from: D */
    public final b1 mo1870D() {
        synchronized (this.f5085a) {
            try {
                if (this.f5096m.isEmpty()) {
                    return null;
                }
                if (this.f5095l >= this.f5096m.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f5096m;
                int i10 = this.f5095l;
                this.f5095l = i10 + 1;
                b1 b1Var = (b1) arrayList.get(i10);
                this.f5097n.add(b1Var);
                return b1Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i0.d1
    /* renamed from: a */
    public final void mo1871a(i0.c1 c1Var, Executor executor) {
        synchronized (this.f5085a) {
            c1Var.getClass();
            this.f5091g = c1Var;
            executor.getClass();
            this.f5092h = executor;
            this.f5090f.mo1871a(this.f5088d, executor);
        }
    }

    @Override // i0.d1
    /* renamed from: b */
    public final int mo1872b() {
        int iMo1872b;
        synchronized (this.f5085a) {
            iMo1872b = this.f5090f.mo1872b();
        }
        return iMo1872b;
    }

    @Override // c0.c0
    /* renamed from: c */
    public final void mo2178c(d0 d0Var) {
        synchronized (this.f5085a) {
            m2197d(d0Var);
        }
    }

    @Override // i0.d1
    public final void close() {
        synchronized (this.f5085a) {
            try {
                if (this.f5089e) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f5096m);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((b1) obj).close();
                }
                this.f5096m.clear();
                this.f5090f.close();
                this.f5089e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m2197d(d0 d0Var) {
        synchronized (this.f5085a) {
            try {
                int iIndexOf = this.f5096m.indexOf(d0Var);
                if (iIndexOf >= 0) {
                    this.f5096m.remove(iIndexOf);
                    int i10 = this.f5095l;
                    if (iIndexOf <= i10) {
                        this.f5095l = i10 - 1;
                    }
                }
                this.f5097n.remove(d0Var);
                if (this.f5087c > 0) {
                    m2199f(this.f5090f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m2198e(p1 p1Var) {
        i0.c1 c1Var;
        Executor executor;
        synchronized (this.f5085a) {
            try {
                if (this.f5096m.size() < mo1884z()) {
                    p1Var.m2179h(this);
                    this.f5096m.add(p1Var);
                    c1Var = this.f5091g;
                    executor = this.f5092h;
                } else {
                    og.u1.m10942a("TAG");
                    p1Var.close();
                    c1Var = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c1Var != null) {
            if (executor != null) {
                executor.execute(new RunnableC0012k(6, this, c1Var));
            } else {
                c1Var.mo18d(this);
            }
        }
    }

    /* renamed from: f */
    public final void m2199f(i0.d1 d1Var) {
        b1 b1VarMo1870D;
        synchronized (this.f5085a) {
            try {
                if (this.f5089e) {
                    return;
                }
                int size = this.f5094k.size() + this.f5096m.size();
                if (size >= d1Var.mo1884z()) {
                    og.u1.m10942a("MetadataImageReader");
                    return;
                }
                do {
                    try {
                        b1VarMo1870D = d1Var.mo1870D();
                        if (b1VarMo1870D != null) {
                            this.f5087c--;
                            size++;
                            this.f5094k.put(b1VarMo1870D.mo2135X().mo2195c(), b1VarMo1870D);
                            m2200g();
                        }
                    } catch (IllegalStateException unused) {
                        og.u1.m10947f(3, og.u1.m10950i("MetadataImageReader"));
                        b1VarMo1870D = null;
                    }
                    if (b1VarMo1870D == null || this.f5087c <= 0) {
                        break;
                    }
                } while (size < d1Var.mo1884z());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m2200g() {
        synchronized (this.f5085a) {
            try {
                for (int size = this.f5093j.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) this.f5093j.valueAt(size);
                    long jMo2195c = w0Var.mo2195c();
                    b1 b1Var = (b1) this.f5094k.get(jMo2195c);
                    if (b1Var != null) {
                        this.f5094k.remove(jMo2195c);
                        this.f5093j.removeAt(size);
                        m2198e(new p1(b1Var, null, w0Var));
                    }
                }
                m2201i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i0.d1
    public final int getHeight() {
        int height;
        synchronized (this.f5085a) {
            height = this.f5090f.getHeight();
        }
        return height;
    }

    @Override // i0.d1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f5085a) {
            surface = this.f5090f.getSurface();
        }
        return surface;
    }

    @Override // i0.d1
    /* renamed from: h */
    public final b1 mo1878h() {
        synchronized (this.f5085a) {
            try {
                if (this.f5096m.isEmpty()) {
                    return null;
                }
                if (this.f5095l >= this.f5096m.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                for (int i11 = 0; i11 < this.f5096m.size() - 1; i11++) {
                    if (!this.f5097n.contains(this.f5096m.get(i11))) {
                        arrayList.add((b1) this.f5096m.get(i11));
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((b1) obj).close();
                }
                int size2 = this.f5096m.size();
                ArrayList arrayList2 = this.f5096m;
                this.f5095l = size2;
                b1 b1Var = (b1) arrayList2.get(size2 - 1);
                this.f5097n.add(b1Var);
                return b1Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final void m2201i() {
        synchronized (this.f5085a) {
            try {
                if (this.f5094k.size() != 0 && this.f5093j.size() != 0) {
                    long jKeyAt = this.f5094k.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f5093j.keyAt(0);
                    og.y0.m11052b(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f5094k.size() - 1; size >= 0; size--) {
                            if (this.f5094k.keyAt(size) < jKeyAt2) {
                                ((b1) this.f5094k.valueAt(size)).close();
                                this.f5094k.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f5093j.size() - 1; size2 >= 0; size2--) {
                            if (this.f5093j.keyAt(size2) < jKeyAt) {
                                this.f5093j.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // i0.d1
    /* renamed from: j */
    public final int mo1880j() {
        int iMo1880j;
        synchronized (this.f5085a) {
            iMo1880j = this.f5090f.mo1880j();
        }
        return iMo1880j;
    }

    @Override // i0.d1
    /* renamed from: k */
    public final void mo1881k() {
        synchronized (this.f5085a) {
            this.f5090f.mo1881k();
            this.f5091g = null;
            this.f5092h = null;
            this.f5087c = 0;
        }
    }

    @Override // i0.d1
    /* renamed from: z */
    public final int mo1884z() {
        int iMo1884z;
        synchronized (this.f5085a) {
            iMo1884z = this.f5090f.mo1884z();
        }
        return iMo1884z;
    }
}
