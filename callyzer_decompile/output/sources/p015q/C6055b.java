package p015q;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q.b */
/* loaded from: classes.dex */
public final class C6055b extends AbstractC6058e implements Iterator {

    /* renamed from: a */
    public C6056c f29546a;

    /* renamed from: b */
    public C6056c f29547b;

    /* renamed from: c */
    public final /* synthetic */ int f29548c;

    public C6055b(C6056c c6056c, C6056c c6056c2, int i10) {
        this.f29548c = i10;
        this.f29546a = c6056c2;
        this.f29547b = c6056c;
    }

    @Override // p015q.AbstractC6058e
    /* renamed from: a */
    public final void mo12063a(C6056c c6056c) {
        C6056c c6056c2;
        C6056c c6056cM12064b = null;
        if (this.f29546a == c6056c && c6056c == this.f29547b) {
            this.f29547b = null;
            this.f29546a = null;
        }
        C6056c c6056c3 = this.f29546a;
        if (c6056c3 == c6056c) {
            switch (this.f29548c) {
                case 0:
                    c6056c2 = c6056c3.f29552d;
                    break;
                default:
                    c6056c2 = c6056c3.f29551c;
                    break;
            }
            this.f29546a = c6056c2;
        }
        C6056c c6056c4 = this.f29547b;
        if (c6056c4 == c6056c) {
            C6056c c6056c5 = this.f29546a;
            if (c6056c4 != c6056c5 && c6056c5 != null) {
                c6056cM12064b = m12064b(c6056c4);
            }
            this.f29547b = c6056cM12064b;
        }
    }

    /* renamed from: b */
    public final C6056c m12064b(C6056c c6056c) {
        switch (this.f29548c) {
            case 0:
                return c6056c.f29551c;
            default:
                return c6056c.f29552d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29547b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C6056c c6056c = this.f29547b;
        C6056c c6056c2 = this.f29546a;
        this.f29547b = (c6056c == c6056c2 || c6056c2 == null) ? null : m12064b(c6056c);
        return c6056c;
    }
}
