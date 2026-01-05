package ot;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ot.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5737e implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f28278a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f28279b;

    public /* synthetic */ C5737e(int i10, InterfaceC2137a interfaceC2137a) {
        this.f28278a = i10;
        this.f28279b = interfaceC2137a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f28278a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f28279b.invoke();
                return a0.f30746a;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    this.f28279b.invoke();
                }
                return a0.f30746a;
            case 2:
                ((Boolean) obj).booleanValue();
                this.f28279b.invoke();
                return a0.f30746a;
            case 3:
                this.f28279b.invoke();
                return a0.f30746a;
            case 4:
                ((Integer) obj).intValue();
                this.f28279b.invoke();
                return a0.f30746a;
            default:
                InterfaceC4024a it = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(it, "it");
                return this.f28279b.invoke();
        }
    }
}
