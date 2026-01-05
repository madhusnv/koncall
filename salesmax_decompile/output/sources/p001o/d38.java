package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p001o.e38;

/* loaded from: classes6.dex */
public class d38 implements Iterator {

    /* renamed from: a */
    public int f19065a = 0;

    /* renamed from: b */
    public e38.C13091a f19066b = null;

    /* renamed from: c */
    public final /* synthetic */ int f19067c;

    /* renamed from: d */
    public final /* synthetic */ e38 f19068d;

    public d38(e38 e38Var, int i) {
        this.f19068d = e38Var;
        this.f19067c = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f19066b != null) {
            return true;
        }
        while (this.f19065a < this.f19068d.f20870a.size()) {
            ArrayList arrayList = this.f19068d.f20870a;
            int i = this.f19065a;
            this.f19065a = i + 1;
            e38.C13091a c13091a = (e38.C13091a) arrayList.get(i);
            if (c13091a != null && c13091a.f20882g == this.f19067c) {
                this.f19066b = c13091a;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f19066b == null && !hasNext()) {
            throw new NoSuchElementException();
        }
        e38.C13091a c13091a = this.f19066b;
        this.f19066b = null;
        return c13091a;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
