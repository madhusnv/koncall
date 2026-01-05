package p001o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class hkb {

    /* renamed from: a */
    public final AtomicReference f27084a = new AtomicReference();

    /* renamed from: b */
    public final vo0 f27085b = new vo0();

    /* renamed from: a */
    public List m30704a(Class cls, Class cls2, Class cls3) {
        List list;
        snb snbVar = (snb) this.f27084a.getAndSet(null);
        if (snbVar == null) {
            snbVar = new snb(cls, cls2, cls3);
        } else {
            snbVar.m48582a(cls, cls2, cls3);
        }
        synchronized (this.f27085b) {
            list = (List) this.f27085b.get(snbVar);
        }
        this.f27084a.set(snbVar);
        return list;
    }

    /* renamed from: b */
    public void m30705b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f27085b) {
            this.f27085b.put(new snb(cls, cls2, cls3), list);
        }
    }
}
