package g2;

import ex.InterfaceC2137a;
import java.io.Serializable;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4266h;
import s4.EnumC6757m;
import w4.C7927s;
import w4.C7931w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d4 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11366a;

    /* renamed from: b */
    public final /* synthetic */ Object f11367b;

    /* renamed from: c */
    public final /* synthetic */ Object f11368c;

    /* renamed from: d */
    public final /* synthetic */ Object f11369d;

    /* renamed from: e */
    public final /* synthetic */ Object f11370e;

    /* renamed from: f */
    public final /* synthetic */ Serializable f11371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, int i10) {
        super(0);
        this.f11366a = i10;
        this.f11367b = obj;
        this.f11368c = obj2;
        this.f11369d = obj3;
        this.f11370e = obj4;
        this.f11371f = serializable;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f11366a) {
            case 0:
                return new h4((Long) this.f11367b, (Long) this.f11368c, (C4266h) this.f11369d, 0, (z9) this.f11370e, (Locale) this.f11371f);
            default:
                ((C7927s) this.f11367b).m15054g((InterfaceC2137a) this.f11368c, (C7931w) this.f11369d, (String) this.f11370e, (EnumC6757m) this.f11371f);
                return qw.a0.f30746a;
        }
    }
}
