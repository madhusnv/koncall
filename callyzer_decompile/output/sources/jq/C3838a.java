package jq;

import ex.InterfaceC2139c;
import kn.C4121a;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5401c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jq.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3838a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f19791a;

    /* renamed from: b */
    public final /* synthetic */ C5401c f19792b;

    public /* synthetic */ C3838a(C5401c c5401c, int i10) {
        this.f19791a = i10;
        this.f19792b = c5401c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C4121a it = (C4121a) obj;
        switch (this.f19791a) {
            case 0:
                AbstractC4154l.m8923f(it, "it");
                return Boolean.valueOf(it.f21054a.f23832a == this.f19792b.f27095a);
            default:
                AbstractC4154l.m8923f(it, "it");
                return Boolean.valueOf(it.f21054a.f23832a == this.f19792b.f27095a);
        }
    }
}
