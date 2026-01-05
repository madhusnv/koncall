package p001o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w4d implements Iterator, sb9 {

    /* renamed from: a */
    public final u4d f51466a;

    public w4d(t4d t4dVar) {
        sq8.m48649h(t4dVar, "builder");
        nxh[] nxhVarArr = new nxh[8];
        for (int i = 0; i < 8; i++) {
            nxhVarArr[i] = new rxh(this);
        }
        this.f51466a = new u4d(t4dVar, nxhVarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f51466a.next();
    }

    /* renamed from: e */
    public final void m53930e(Object obj, Object obj2) {
        this.f51466a.m50935r(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f51466a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f51466a.remove();
    }
}
