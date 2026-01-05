package w4;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4167y;
import qw.a0;
import s4.C6755k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.r */
/* loaded from: classes.dex */
public final class C7926r extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ C4167y f38121a;

    /* renamed from: b */
    public final /* synthetic */ C7927s f38122b;

    /* renamed from: c */
    public final /* synthetic */ C6755k f38123c;

    /* renamed from: d */
    public final /* synthetic */ long f38124d;

    /* renamed from: e */
    public final /* synthetic */ long f38125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7926r(C4167y c4167y, C7927s c7927s, C6755k c6755k, long j6, long j10) {
        super(0);
        this.f38121a = c4167y;
        this.f38122b = c7927s;
        this.f38123c = c6755k;
        this.f38124d = j6;
        this.f38125e = j10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        C7927s c7927s = this.f38122b;
        this.f38121a.f21163a = c7927s.getPositionProvider().mo1651a(this.f38123c, this.f38124d, c7927s.getParentLayoutDirection(), this.f38125e);
        return a0.f30746a;
    }
}
