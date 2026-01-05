package p001o;

import androidx.lifecycle.AbstractC2145n;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class z9b extends hpb {
    private c0f mSources;

    /* renamed from: o.z9b$a */
    public static class C18586a implements n9c {

        /* renamed from: a */
        public final AbstractC2145n f56742a;

        /* renamed from: b */
        public final n9c f56743b;

        /* renamed from: c */
        public int f56744c = -1;

        public C18586a(AbstractC2145n abstractC2145n, n9c n9cVar) {
            this.f56742a = abstractC2145n;
            this.f56743b = n9cVar;
        }

        /* renamed from: a */
        public void m58984a() {
            this.f56742a.observeForever(this);
        }

        /* renamed from: b */
        public void m58985b() {
            this.f56742a.removeObserver(this);
        }

        @Override // p001o.n9c
        public void onChanged(Object obj) {
            if (this.f56744c != this.f56742a.getVersion()) {
                this.f56744c = this.f56742a.getVersion();
                this.f56743b.onChanged(obj);
            }
        }
    }

    public z9b() {
        this.mSources = new c0f();
    }

    public <S> void addSource(AbstractC2145n abstractC2145n, n9c n9cVar) {
        if (abstractC2145n == null) {
            throw new NullPointerException("source cannot be null");
        }
        C18586a c18586a = new C18586a(abstractC2145n, n9cVar);
        C18586a c18586a2 = (C18586a) this.mSources.mo19712l(abstractC2145n, c18586a);
        if (c18586a2 != null && c18586a2.f56743b != n9cVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c18586a2 == null && hasActiveObservers()) {
            c18586a.m58984a();
        }
    }

    @Override // androidx.lifecycle.AbstractC2145n
    public void onActive() {
        Iterator it = this.mSources.iterator();
        while (it.hasNext()) {
            ((C18586a) ((Map.Entry) it.next()).getValue()).m58984a();
        }
    }

    @Override // androidx.lifecycle.AbstractC2145n
    public void onInactive() {
        Iterator it = this.mSources.iterator();
        while (it.hasNext()) {
            ((C18586a) ((Map.Entry) it.next()).getValue()).m58985b();
        }
    }

    public <S> void removeSource(AbstractC2145n abstractC2145n) {
        C18586a c18586a = (C18586a) this.mSources.mo19713m(abstractC2145n);
        if (c18586a != null) {
            c18586a.m58985b();
        }
    }

    public z9b(Object obj) {
        super(obj);
        this.mSources = new c0f();
    }
}
