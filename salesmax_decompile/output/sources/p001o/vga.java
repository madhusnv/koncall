package p001o;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class vga {

    /* renamed from: c */
    public static final uga f50305c = new uga(Object.class, Object.class, Object.class, Collections.singletonList(new v75(Object.class, Object.class, Object.class, Collections.emptyList(), new e4i(), null)), null);

    /* renamed from: a */
    public final vo0 f50306a = new vo0();

    /* renamed from: b */
    public final AtomicReference f50307b = new AtomicReference();

    /* renamed from: a */
    public uga m52749a(Class cls, Class cls2, Class cls3) {
        uga ugaVar;
        snb snbVarM52750b = m52750b(cls, cls2, cls3);
        synchronized (this.f50306a) {
            ugaVar = (uga) this.f50306a.get(snbVarM52750b);
        }
        this.f50307b.set(snbVarM52750b);
        return ugaVar;
    }

    /* renamed from: b */
    public final snb m52750b(Class cls, Class cls2, Class cls3) {
        snb snbVar = (snb) this.f50307b.getAndSet(null);
        if (snbVar == null) {
            snbVar = new snb();
        }
        snbVar.m48582a(cls, cls2, cls3);
        return snbVar;
    }

    /* renamed from: c */
    public boolean m52751c(uga ugaVar) {
        return f50305c.equals(ugaVar);
    }

    /* renamed from: d */
    public void m52752d(Class cls, Class cls2, Class cls3, uga ugaVar) {
        synchronized (this.f50306a) {
            vo0 vo0Var = this.f50306a;
            snb snbVar = new snb(cls, cls2, cls3);
            if (ugaVar == null) {
                ugaVar = f50305c;
            }
            vo0Var.put(snbVar, ugaVar);
        }
    }
}
