package ik;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C4143a;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8210k;
import xd.AbstractC8337h;
import xd.C8339j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C3288l implements InterfaceC8210k, InterfaceC4149g {

    /* renamed from: a */
    public final /* synthetic */ int f17506a;

    /* renamed from: b */
    public final /* synthetic */ Object f17507b;

    public /* synthetic */ C3288l(int i10, Object obj) {
        this.f17506a = i10;
        this.f17507b = obj;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        int i10 = this.f17506a;
        a0 a0Var = a0.f30746a;
        Object obj2 = this.f17507b;
        switch (i10) {
            case 0:
                ((AtomicReference) obj2).set((C3284h) obj);
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                break;
            default:
                ((C8339j) obj2).m15521k((AbstractC8337h) obj);
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                break;
        }
        return a0Var;
    }

    public final boolean equals(Object obj) {
        switch (this.f17506a) {
            case 0:
                if ((obj instanceof InterfaceC8210k) && (obj instanceof InterfaceC4149g)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof InterfaceC8210k) && (obj instanceof InterfaceC4149g)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((InterfaceC4149g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.InterfaceC4149g
    public final InterfaceC6355e getFunctionDelegate() {
        switch (this.f17506a) {
            case 0:
                return new C4143a(2, 4, AtomicReference.class, (AtomicReference) this.f17507b, "set", "set(Ljava/lang/Object;)V");
            default:
                return new C4143a(2, 4, C8339j.class, (C8339j) this.f17507b, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
        }
    }

    public final int hashCode() {
        switch (this.f17506a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
