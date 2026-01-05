package p001o;

import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public abstract class yo0 {

    /* renamed from: a */
    public final int f55747a;

    /* renamed from: b */
    public final ArrayDeque f55748b;

    /* renamed from: c */
    public final Object f55749c = new Object();

    /* renamed from: d */
    public final cue f55750d;

    public yo0(int i, cue cueVar) {
        this.f55747a = i;
        this.f55748b = new ArrayDeque(i);
        this.f55750d = cueVar;
    }

    /* renamed from: a */
    public Object m58031a() {
        Object objRemoveLast;
        synchronized (this.f55749c) {
            objRemoveLast = this.f55748b.removeLast();
        }
        return objRemoveLast;
    }

    /* renamed from: b */
    public void m58032b(Object obj) {
        Object objM58031a;
        synchronized (this.f55749c) {
            objM58031a = this.f55748b.size() >= this.f55747a ? m58031a() : null;
            this.f55748b.addFirst(obj);
        }
        cue cueVar = this.f55750d;
        if (cueVar == null || objM58031a == null) {
            return;
        }
        cueVar.mo21835a(objM58031a);
    }

    /* renamed from: c */
    public boolean m58033c() {
        boolean zIsEmpty;
        synchronized (this.f55749c) {
            zIsEmpty = this.f55748b.isEmpty();
        }
        return zIsEmpty;
    }
}
