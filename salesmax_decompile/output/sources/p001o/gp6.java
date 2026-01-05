package p001o;

/* loaded from: classes2.dex */
public class gp6 {

    /* renamed from: a */
    public final Object f25636a = new Object();

    /* renamed from: b */
    public final s82 f25637b;

    /* renamed from: c */
    public int f25638c;

    public gp6(s82 s82Var, int i) {
        this.f25637b = s82Var;
        this.f25638c = i;
    }

    /* renamed from: a */
    public int m29269a() {
        int i;
        synchronized (this.f25636a) {
            i = this.f25638c;
        }
        return i;
    }

    /* renamed from: b */
    public void m29270b(int i) {
        synchronized (this.f25636a) {
            this.f25638c = i;
        }
    }
}
