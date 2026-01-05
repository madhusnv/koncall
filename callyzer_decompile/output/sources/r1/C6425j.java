package r1;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.j */
/* loaded from: classes.dex */
public final class C6425j extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C6425j f30982b;

    /* renamed from: c */
    public static final C6425j f30983c;

    /* renamed from: a */
    public final /* synthetic */ int f30984a;

    static {
        int i10 = 2;
        f30982b = new C6425j(i10, 0);
        f30983c = new C6425j(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6425j(int i10, int i11) {
        super(i10);
        this.f30984a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30984a) {
            case 0:
                ((Number) obj2).intValue();
                return new C6419d(1);
            default:
                C6440y c6440y = (C6440y) obj2;
                return pe.m10834i(Integer.valueOf(c6440y.f31077d.f29752b.m8526f()), Integer.valueOf(c6440y.f31077d.f29753c.m8526f()));
        }
    }
}
