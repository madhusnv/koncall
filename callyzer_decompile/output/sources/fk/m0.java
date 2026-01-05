package fk;

import hk.InterfaceC2962b;
import hk.InterfaceC2963c;
import pw.InterfaceC6043a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 implements InterfaceC2962b {

    /* renamed from: a */
    public final /* synthetic */ int f10458a;

    /* renamed from: b */
    public final Object f10459b;

    public /* synthetic */ m0(int i10, Object obj) {
        this.f10458a = i10;
        this.f10459b = obj;
    }

    /* renamed from: a */
    public static m0 m5980a(Object obj) {
        if (obj != null) {
            return new m0(2, obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f10458a) {
            case 0:
                return new l0((x0) ((InterfaceC6043a) this.f10459b).get());
            case 1:
                return new a1((h1) ((InterfaceC2963c) this.f10459b).get());
            default:
                return this.f10459b;
        }
    }
}
