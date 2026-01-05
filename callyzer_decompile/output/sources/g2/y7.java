package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y7 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ long f13312a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f13313b;

    /* renamed from: c */
    public final /* synthetic */ boolean f13314c;

    /* renamed from: d */
    public final /* synthetic */ int f13315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(long j6, InterfaceC2137a interfaceC2137a, boolean z6, int i10) {
        super(2);
        this.f13312a = j6;
        this.f13313b = interfaceC2137a;
        this.f13314c = z6;
        this.f13315d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        z7.m6352c(this.f13312a, this.f13313b, this.f13314c, (InterfaceC3962k) obj, C3953b.m8496A(this.f13315d | 1));
        return qw.a0.f30746a;
    }
}
