package k4;

import ex.InterfaceC2139c;
import i0.m0;
import kotlin.jvm.internal.AbstractC4155m;
import p3.AbstractC5806d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f20662a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i10, Object obj) {
        super(1);
        this.f20662a = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f20662a) {
            case 0:
                throw m0.m7376i(obj);
            default:
                ((AbstractC5806d) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
