package p001o;

import java.util.Queue;

/* loaded from: classes5.dex */
public abstract class fc1 {

    /* renamed from: a */
    public final Queue f23124a = uqi.m51924e(20);

    /* renamed from: a */
    public abstract ced mo26429a();

    /* renamed from: b */
    public ced m26430b() {
        ced cedVar = (ced) this.f23124a.poll();
        return cedVar == null ? mo26429a() : cedVar;
    }

    /* renamed from: c */
    public void m26431c(ced cedVar) {
        if (this.f23124a.size() < 20) {
            this.f23124a.offer(cedVar);
        }
    }
}
