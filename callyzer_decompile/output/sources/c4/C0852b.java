package c4;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.b */
/* loaded from: classes.dex */
public final class C0852b extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C0852b f5375b;

    /* renamed from: c */
    public static final C0852b f5376c;

    /* renamed from: d */
    public static final C0852b f5377d;

    /* renamed from: a */
    public final /* synthetic */ int f5378a;

    static {
        int i10 = 1;
        f5375b = new C0852b(i10, 0);
        f5376c = new C0852b(i10, 1);
        f5377d = new C0852b(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0852b(int i10, int i11) {
        super(i10);
        this.f5378a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5378a) {
            case 0:
                ((Number) obj).longValue();
                return a0.f30746a;
            case 1:
                return Integer.valueOf(((C0862l) obj).f5405b);
            default:
                return Integer.valueOf(((C0862l) obj).f5406c.m12945b());
        }
    }
}
