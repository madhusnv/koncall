package p001o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class st3 implements ief {

    /* renamed from: a */
    public final AtomicReference f45900a;

    public st3(ief iefVar) {
        sq8.m48649h(iefVar, "sequence");
        this.f45900a = new AtomicReference(iefVar);
    }

    @Override // p001o.ief
    public Iterator iterator() {
        ief iefVar = (ief) this.f45900a.getAndSet(null);
        if (iefVar != null) {
            return iefVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
