package jt;

import an.w1;
import d7.h0;
import ex.InterfaceC2139c;
import ht.C3026a;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jt.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3855d implements h0, InterfaceC4149g {

    /* renamed from: a */
    public final /* synthetic */ int f19844a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f19845b;

    public /* synthetic */ C3855d(int i10, InterfaceC2139c interfaceC2139c) {
        this.f19844a = i10;
        this.f19845b = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        switch (this.f19844a) {
            case 0:
                if ((obj instanceof h0) && (obj instanceof InterfaceC4149g)) {
                    return ((C3026a) this.f19845b).equals(((InterfaceC4149g) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof h0) && (obj instanceof InterfaceC4149g)) {
                    return ((w1) this.f19845b).equals(((InterfaceC4149g) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.InterfaceC4149g
    public final InterfaceC6355e getFunctionDelegate() {
        switch (this.f19844a) {
            case 0:
                return (C3026a) this.f19845b;
            default:
                return (w1) this.f19845b;
        }
    }

    public final int hashCode() {
        switch (this.f19844a) {
            case 0:
                return ((C3026a) this.f19845b).hashCode();
            default:
                return ((w1) this.f19845b).hashCode();
        }
    }

    @Override // d7.h0
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.f19844a) {
            case 0:
                ((C3026a) this.f19845b).invoke(obj);
                break;
            default:
                ((w1) this.f19845b).invoke(obj);
                break;
        }
    }
}
