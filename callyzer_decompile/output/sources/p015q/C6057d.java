package p015q;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q.d */
/* loaded from: classes.dex */
public final class C6057d extends AbstractC6058e implements Iterator {

    /* renamed from: a */
    public C6056c f29553a;

    /* renamed from: b */
    public boolean f29554b = true;

    /* renamed from: c */
    public final /* synthetic */ C6059f f29555c;

    public C6057d(C6059f c6059f) {
        this.f29555c = c6059f;
    }

    @Override // p015q.AbstractC6058e
    /* renamed from: a */
    public final void mo12063a(C6056c c6056c) {
        C6056c c6056c2 = this.f29553a;
        if (c6056c == c6056c2) {
            C6056c c6056c3 = c6056c2.f29552d;
            this.f29553a = c6056c3;
            this.f29554b = c6056c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29554b) {
            return this.f29555c.f29556a != null;
        }
        C6056c c6056c = this.f29553a;
        return (c6056c == null || c6056c.f29551c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f29554b) {
            this.f29554b = false;
            this.f29553a = this.f29555c.f29556a;
        } else {
            C6056c c6056c = this.f29553a;
            this.f29553a = c6056c != null ? c6056c.f29551c : null;
        }
        return this.f29553a;
    }
}
