package g2;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i4 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11792a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f11793b;

    /* renamed from: c */
    public final /* synthetic */ Long f11794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(InterfaceC2141e interfaceC2141e, Long l9, int i10) {
        super(1);
        this.f11792a = i10;
        this.f11793b = interfaceC2141e;
        this.f11794c = l9;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11792a) {
            case 0:
                this.f11793b.invoke((Long) obj, this.f11794c);
                break;
            default:
                this.f11793b.invoke(this.f11794c, (Long) obj);
                break;
        }
        return qw.a0.f30746a;
    }
}
