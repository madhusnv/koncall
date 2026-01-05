package b8;

import c8.C0902e;
import ex.InterfaceC2139c;
import k8.InterfaceC4024a;
import ww.AbstractC8193c;
import z7.InterfaceC8888q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.o */
/* loaded from: classes.dex */
public final class C0620o implements InterfaceC0628w, InterfaceC8888q {

    /* renamed from: a */
    public final /* synthetic */ int f4057a;

    /* renamed from: b */
    public final /* synthetic */ Object f4058b;

    public /* synthetic */ C0620o(int i10, Object obj) {
        this.f4057a = i10;
        this.f4058b = obj;
    }

    @Override // z7.InterfaceC8888q
    /* renamed from: a */
    public final Object mo1780a(String str, InterfaceC2139c interfaceC2139c, AbstractC8193c abstractC8193c) {
        switch (this.f4057a) {
            case 0:
                return ((C0627v) this.f4058b).mo1780a(str, interfaceC2139c, abstractC8193c);
            default:
                return ((C0902e) this.f4058b).mo1780a(str, interfaceC2139c, abstractC8193c);
        }
    }

    @Override // b8.InterfaceC0628w
    /* renamed from: b */
    public final InterfaceC4024a mo1781b() {
        switch (this.f4057a) {
            case 0:
                return ((C0627v) this.f4058b).f4086a;
            default:
                return ((C0902e) this.f4058b).f5559a;
        }
    }
}
