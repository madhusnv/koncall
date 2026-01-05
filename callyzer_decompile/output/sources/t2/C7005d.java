package t2;

import ex.InterfaceC2139c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t2.d */
/* loaded from: classes.dex */
public final class C7005d extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C7005d f33934b;

    /* renamed from: c */
    public static final C7005d f33935c;

    /* renamed from: a */
    public final /* synthetic */ int f33936a;

    static {
        int i10 = 1;
        f33934b = new C7005d(i10, 0);
        f33935c = new C7005d(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7005d(int i10, int i11) {
        super(i10);
        this.f33936a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f33936a) {
            case 0:
                return new C7006e((Map) obj);
            default:
                return obj;
        }
    }
}
