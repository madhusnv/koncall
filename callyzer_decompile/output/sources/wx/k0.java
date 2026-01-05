package wx;

import kotlin.jvm.internal.C4168z;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f39243a;

    /* renamed from: b */
    public final /* synthetic */ C4168z f39244b;

    public /* synthetic */ k0(C4168z c4168z, int i10) {
        this.f39243a = i10;
        this.f39244b = c4168z;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f39243a) {
            case 0:
                this.f39244b.f21164a = obj;
                throw new AbortFlowException(this);
            default:
                this.f39244b.f21164a = obj;
                throw new AbortFlowException(this);
        }
    }
}
