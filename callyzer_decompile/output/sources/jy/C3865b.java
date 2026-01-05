package jy;

import hy.InterfaceC3055f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.b */
/* loaded from: classes3.dex */
public final class C3865b extends g0 {

    /* renamed from: b */
    public final /* synthetic */ int f19871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3865b(InterfaceC3055f interfaceC3055f, int i10) {
        super(interfaceC3055f);
        this.f19871b = i10;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        switch (this.f19871b) {
            case 0:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
