package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.AbstractC1892b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.fgd;
import p001o.j72;
import p001o.jd8;
import p001o.pe0;
import p001o.rif;
import p001o.u72;
import p001o.v72;
import p001o.wja;
import p001o.zd8;

/* renamed from: androidx.camera.core.d */
/* loaded from: classes2.dex */
public class C1894d implements zd8, AbstractC1892b.a {

    /* renamed from: a */
    public final Object f6098a;

    /* renamed from: b */
    public j72 f6099b;

    /* renamed from: c */
    public int f6100c;

    /* renamed from: d */
    public zd8.InterfaceC18614a f6101d;

    /* renamed from: e */
    public boolean f6102e;

    /* renamed from: f */
    public final zd8 f6103f;

    /* renamed from: g */
    public zd8.InterfaceC18614a f6104g;

    /* renamed from: h */
    public Executor f6105h;

    /* renamed from: i */
    public final LongSparseArray f6106i;

    /* renamed from: j */
    public final LongSparseArray f6107j;

    /* renamed from: k */
    public int f6108k;

    /* renamed from: l */
    public final List f6109l;

    /* renamed from: m */
    public final List f6110m;

    /* renamed from: androidx.camera.core.d$a */
    public class a extends j72 {
        public a() {
        }

        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(int i, u72 u72Var) {
            super.mo4682b(i, u72Var);
            C1894d.this.m4681t(u72Var);
        }
    }

    public C1894d(int i, int i2, int i3, int i4) {
        this(m4665k(i, i2, i3, i4));
    }

    /* renamed from: k */
    public static zd8 m4665k(int i, int i2, int i3, int i4) {
        return new pe0(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m4666p(zd8.InterfaceC18614a interfaceC18614a) {
        interfaceC18614a.mo27818a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m4667q(zd8 zd8Var) {
        synchronized (this.f6098a) {
            this.f6100c++;
        }
        m4678o(zd8Var);
    }

    @Override // p001o.zd8
    /* renamed from: a */
    public Surface mo4668a() {
        Surface surfaceMo4668a;
        synchronized (this.f6098a) {
            surfaceMo4668a = this.f6103f.mo4668a();
        }
        return surfaceMo4668a;
    }

    @Override // androidx.camera.core.AbstractC1892b.a
    /* renamed from: b */
    public void mo4662b(InterfaceC1893c interfaceC1893c) {
        synchronized (this.f6098a) {
            m4675l(interfaceC1893c);
        }
    }

    @Override // p001o.zd8
    /* renamed from: c */
    public InterfaceC1893c mo4669c() {
        synchronized (this.f6098a) {
            if (this.f6109l.isEmpty()) {
                return null;
            }
            if (this.f6108k >= this.f6109l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f6109l.size() - 1; i++) {
                if (!this.f6110m.contains(this.f6109l.get(i))) {
                    arrayList.add((InterfaceC1893c) this.f6109l.get(i));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1893c) it.next()).close();
            }
            int size = this.f6109l.size() - 1;
            List list = this.f6109l;
            this.f6108k = size + 1;
            InterfaceC1893c interfaceC1893c = (InterfaceC1893c) list.get(size);
            this.f6110m.add(interfaceC1893c);
            return interfaceC1893c;
        }
    }

    @Override // p001o.zd8
    public void close() {
        synchronized (this.f6098a) {
            if (this.f6102e) {
                return;
            }
            Iterator it = new ArrayList(this.f6109l).iterator();
            while (it.hasNext()) {
                ((InterfaceC1893c) it.next()).close();
            }
            this.f6109l.clear();
            this.f6103f.close();
            this.f6102e = true;
        }
    }

    @Override // p001o.zd8
    /* renamed from: d */
    public int mo4670d() {
        int iMo4670d;
        synchronized (this.f6098a) {
            iMo4670d = this.f6103f.mo4670d();
        }
        return iMo4670d;
    }

    @Override // p001o.zd8
    /* renamed from: e */
    public void mo4671e() {
        synchronized (this.f6098a) {
            this.f6103f.mo4671e();
            this.f6104g = null;
            this.f6105h = null;
            this.f6100c = 0;
        }
    }

    @Override // p001o.zd8
    /* renamed from: f */
    public int mo4672f() {
        int iMo4672f;
        synchronized (this.f6098a) {
            iMo4672f = this.f6103f.mo4672f();
        }
        return iMo4672f;
    }

    @Override // p001o.zd8
    /* renamed from: g */
    public void mo4673g(zd8.InterfaceC18614a interfaceC18614a, Executor executor) {
        synchronized (this.f6098a) {
            this.f6104g = (zd8.InterfaceC18614a) fgd.m26663g(interfaceC18614a);
            this.f6105h = (Executor) fgd.m26663g(executor);
            this.f6103f.mo4673g(this.f6101d, executor);
        }
    }

    @Override // p001o.zd8
    public int getHeight() {
        int height;
        synchronized (this.f6098a) {
            height = this.f6103f.getHeight();
        }
        return height;
    }

    @Override // p001o.zd8
    public int getWidth() {
        int width;
        synchronized (this.f6098a) {
            width = this.f6103f.getWidth();
        }
        return width;
    }

    @Override // p001o.zd8
    /* renamed from: h */
    public InterfaceC1893c mo4674h() {
        synchronized (this.f6098a) {
            if (this.f6109l.isEmpty()) {
                return null;
            }
            if (this.f6108k >= this.f6109l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            List list = this.f6109l;
            int i = this.f6108k;
            this.f6108k = i + 1;
            InterfaceC1893c interfaceC1893c = (InterfaceC1893c) list.get(i);
            this.f6110m.add(interfaceC1893c);
            return interfaceC1893c;
        }
    }

    /* renamed from: l */
    public final void m4675l(InterfaceC1893c interfaceC1893c) {
        synchronized (this.f6098a) {
            int iIndexOf = this.f6109l.indexOf(interfaceC1893c);
            if (iIndexOf >= 0) {
                this.f6109l.remove(iIndexOf);
                int i = this.f6108k;
                if (iIndexOf <= i) {
                    this.f6108k = i - 1;
                }
            }
            this.f6110m.remove(interfaceC1893c);
            if (this.f6100c > 0) {
                m4678o(this.f6103f);
            }
        }
    }

    /* renamed from: m */
    public final void m4676m(rif rifVar) {
        final zd8.InterfaceC18614a interfaceC18614a;
        Executor executor;
        synchronized (this.f6098a) {
            if (this.f6109l.size() < mo4672f()) {
                rifVar.m4660a(this);
                this.f6109l.add(rifVar);
                interfaceC18614a = this.f6104g;
                executor = this.f6105h;
            } else {
                wja.m54627a("TAG", "Maximum image number reached.");
                rifVar.close();
                interfaceC18614a = null;
                executor = null;
            }
        }
        if (interfaceC18614a != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: o.jdb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30225a.m4666p(interfaceC18614a);
                    }
                });
            } else {
                interfaceC18614a.mo27818a(this);
            }
        }
    }

    /* renamed from: n */
    public j72 m4677n() {
        return this.f6099b;
    }

    /* renamed from: o */
    public void m4678o(zd8 zd8Var) {
        InterfaceC1893c interfaceC1893cMo4674h;
        synchronized (this.f6098a) {
            if (this.f6102e) {
                return;
            }
            int size = this.f6107j.size() + this.f6109l.size();
            if (size >= zd8Var.mo4672f()) {
                wja.m54627a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    interfaceC1893cMo4674h = zd8Var.mo4674h();
                    if (interfaceC1893cMo4674h != null) {
                        this.f6100c--;
                        size++;
                        this.f6107j.put(interfaceC1893cMo4674h.y2().getTimestamp(), interfaceC1893cMo4674h);
                        m4679r();
                    }
                } catch (IllegalStateException e) {
                    wja.m54628b("MetadataImageReader", "Failed to acquire next image.", e);
                    interfaceC1893cMo4674h = null;
                }
                if (interfaceC1893cMo4674h == null || this.f6100c <= 0) {
                    break;
                }
            } while (size < zd8Var.mo4672f());
        }
    }

    /* renamed from: r */
    public final void m4679r() {
        synchronized (this.f6098a) {
            for (int size = this.f6106i.size() - 1; size >= 0; size--) {
                jd8 jd8Var = (jd8) this.f6106i.valueAt(size);
                long timestamp = jd8Var.getTimestamp();
                InterfaceC1893c interfaceC1893c = (InterfaceC1893c) this.f6107j.get(timestamp);
                if (interfaceC1893c != null) {
                    this.f6107j.remove(timestamp);
                    this.f6106i.removeAt(size);
                    m4676m(new rif(interfaceC1893c, jd8Var));
                }
            }
            m4680s();
        }
    }

    /* renamed from: s */
    public final void m4680s() {
        synchronized (this.f6098a) {
            if (this.f6107j.size() != 0 && this.f6106i.size() != 0) {
                Long lValueOf = Long.valueOf(this.f6107j.keyAt(0));
                Long lValueOf2 = Long.valueOf(this.f6106i.keyAt(0));
                fgd.m26657a(lValueOf2.equals(lValueOf) ? false : true);
                if (lValueOf2.longValue() > lValueOf.longValue()) {
                    for (int size = this.f6107j.size() - 1; size >= 0; size--) {
                        if (this.f6107j.keyAt(size) < lValueOf2.longValue()) {
                            ((InterfaceC1893c) this.f6107j.valueAt(size)).close();
                            this.f6107j.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f6106i.size() - 1; size2 >= 0; size2--) {
                        if (this.f6106i.keyAt(size2) < lValueOf.longValue()) {
                            this.f6106i.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public void m4681t(u72 u72Var) {
        synchronized (this.f6098a) {
            if (this.f6102e) {
                return;
            }
            this.f6106i.put(u72Var.getTimestamp(), new v72(u72Var));
            m4679r();
        }
    }

    public C1894d(zd8 zd8Var) {
        this.f6098a = new Object();
        this.f6099b = new a();
        this.f6100c = 0;
        this.f6101d = new zd8.InterfaceC18614a() { // from class: o.idb
            @Override // p001o.zd8.InterfaceC18614a
            /* renamed from: a */
            public final void mo27818a(zd8 zd8Var2) {
                this.f28493a.m4667q(zd8Var2);
            }
        };
        this.f6102e = false;
        this.f6106i = new LongSparseArray();
        this.f6107j = new LongSparseArray();
        this.f6110m = new ArrayList();
        this.f6103f = zd8Var;
        this.f6108k = 0;
        this.f6109l = new ArrayList(mo4672f());
    }
}
