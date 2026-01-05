package k2;

import fx.InterfaceC2395a;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 implements Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final v1 f20394a;

    /* renamed from: b */
    public final int f20395b;

    /* renamed from: c */
    public final C3953b f20396c;

    public g2(v1 v1Var, int i10, k0 k0Var, C3953b c3953b) {
        this.f20394a = v1Var;
        this.f20395b = i10;
        this.f20396c = c3953b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j0(this.f20394a, this.f20395b, null, this.f20396c);
    }
}
