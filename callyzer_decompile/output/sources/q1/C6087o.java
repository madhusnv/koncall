package q1;

import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.o */
/* loaded from: classes.dex */
public final class C6087o extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C6087o f29704b;

    /* renamed from: c */
    public static final C6087o f29705c;

    /* renamed from: d */
    public static final C6087o f29706d;

    /* renamed from: a */
    public final /* synthetic */ int f29707a;

    static {
        int i10 = 1;
        f29704b = new C6087o(i10, 0);
        f29705c = new C6087o(i10, 1);
        f29706d = new C6087o(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6087o(int i10, int i11) {
        super(i10);
        this.f29707a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f29707a) {
            case 0:
                return qw.a0.f30746a;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                List list = (List) obj;
                return new C6097y(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
