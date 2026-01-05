package o1;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.i */
/* loaded from: classes.dex */
public final class C5250i extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C5250i f25745b = new C5250i(2, 0);

    /* renamed from: a */
    public final /* synthetic */ int f25746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5250i(int i10, int i11) {
        super(i10);
        this.f25746a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25746a) {
            case 0:
                return Integer.valueOf(Math.round((1 + (((EnumC6757m) obj2) != EnumC6757m.Ltr ? (-1.0f) * (-1) : -1.0f)) * (((Number) obj).intValue() / 2.0f)));
            default:
                return Integer.valueOf(Math.round((1 + (((EnumC6757m) obj2) != EnumC6757m.Ltr ? 1.0f * (-1) : 1.0f)) * ((((Number) obj).intValue() + 0) / 2.0f)));
        }
    }
}
