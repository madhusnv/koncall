package jt;

import ap.C0388a;
import b8.C0615j;
import dr.C1772v;
import ex.InterfaceC2141e;
import kotlin.KotlinNothingValueException;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.w0;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jt.a */
/* loaded from: classes3.dex */
public final class C3852a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f19837a;

    /* renamed from: b */
    public int f19838b;

    /* renamed from: c */
    public final /* synthetic */ C3856e f19839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3852a(C3856e c3856e, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f19837a = i10;
        this.f19839c = c3856e;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f19837a) {
            case 0:
                return new C3852a(this.f19839c, interfaceC7559c, 0);
            default:
                return new C3852a(this.f19839c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f19837a) {
        }
        return ((C3852a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19837a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f19838b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C3856e c3856e = this.f19839c;
                    C0615j c0615jM15690f = ((y5) c3856e.f19848d.f5574b).m15690f();
                    C0388a c0388a = new C0388a(c3856e, null, 22);
                    this.f19838b = 1;
                    if (c1.m15379j(c0615jM15690f, c0388a, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f19838b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C3856e c3856e2 = this.f19839c;
                    w0 w0Var = c3856e2.f19849e.f42471f;
                    C1772v c1772v = new C1772v(4, c3856e2);
                    this.f19838b = 1;
                    if (w0Var.f39340a.collect(c1772v, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
