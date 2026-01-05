package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class qb extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ long f12516a;

    /* renamed from: b */
    public final /* synthetic */ long f12517b;

    /* renamed from: c */
    public final /* synthetic */ boolean f12518c;

    /* renamed from: d */
    public final /* synthetic */ C6734c f12519d;

    /* renamed from: e */
    public final /* synthetic */ int f12520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(long j6, long j10, boolean z6, C6734c c6734c, int i10) {
        super(2);
        this.f12516a = j6;
        this.f12517b = j10;
        this.f12518c = z6;
        this.f12519d = c6734c;
        this.f12520e = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rb.m6296c(this.f12516a, this.f12517b, this.f12518c, this.f12519d, (InterfaceC3962k) obj, C3953b.m8496A(this.f12520e | 1));
        return qw.a0.f30746a;
    }
}
