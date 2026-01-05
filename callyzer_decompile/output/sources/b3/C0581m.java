package b3;

import k2.h2;
import kotlin.jvm.internal.AbstractC4160r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C0581m extends AbstractC4160r {

    /* renamed from: a */
    public final /* synthetic */ int f3929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0581m(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f3929a = i11;
    }

    @Override // lx.InterfaceC4571j
    public final Object get() {
        switch (this.f3929a) {
            case 0:
                return ((C0585q) this.receiver).f3941f.N0();
            case 1:
                return ((h2) this.receiver).getValue();
            case 2:
                return ((h2) this.receiver).getValue();
            case 3:
                return ((h2) this.receiver).getValue();
            case 4:
                return ((h2) this.receiver).getValue();
            case 5:
                return ((h2) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }
}
