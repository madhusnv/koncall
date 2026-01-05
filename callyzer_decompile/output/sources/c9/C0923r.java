package c9;

import ex.InterfaceC2139c;
import java.util.HashMap;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.r */
/* loaded from: classes.dex */
public final /* synthetic */ class C0923r implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5646a;

    /* renamed from: b */
    public final /* synthetic */ C0925t f5647b;

    public /* synthetic */ C0923r(C0925t c0925t, int i10) {
        this.f5646a = i10;
        this.f5647b = c0925t;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5646a) {
            case 0:
                this.f5647b.m2673b((HashMap) obj);
                break;
            default:
                this.f5647b.m2672a((HashMap) obj);
                break;
        }
        return a0.f30746a;
    }
}
