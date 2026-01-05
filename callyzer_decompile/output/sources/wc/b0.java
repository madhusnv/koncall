package wc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a */
    public final a0 f38338a = new a0();

    /* renamed from: h */
    public boolean mo15149h() {
        synchronized (this.f38338a) {
            a0 a0Var = this.f38338a;
            if (a0Var.f38336b) {
                return false;
            }
            int i10 = a0Var.f38335a - 1;
            a0Var.f38335a = i10;
            if (i10 > 0) {
                return false;
            }
            a0Var.f38336b = true;
            return true;
        }
    }
}
