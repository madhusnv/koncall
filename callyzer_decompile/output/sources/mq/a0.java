package mq;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.C6361k;
import qw.C6364n;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24131a;

    /* renamed from: b */
    public int f24132b;

    /* renamed from: c */
    public /* synthetic */ Object f24133c;

    /* renamed from: d */
    public final /* synthetic */ h0 f24134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(h0 h0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24131a = i10;
        this.f24134d = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24131a) {
            case 0:
                a0 a0Var = new a0(this.f24134d, interfaceC7559c, 0);
                a0Var.f24133c = obj;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f24134d, interfaceC7559c, 1);
                a0Var2.f24133c = obj;
                return a0Var2;
            default:
                a0 a0Var3 = new a0(this.f24134d, interfaceC7559c, 2);
                a0Var3.f24133c = obj;
                return a0Var3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24131a) {
            case 0:
                return ((a0) create((EnumC7204p) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((a0) create((C6361k) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((a0) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM9793e;
        switch (this.f24131a) {
            case 0:
                qw.a0 a0Var = qw.a0.f30746a;
                EnumC7204p enumC7204p = (EnumC7204p) this.f24133c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f24132b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                EnumC7204p enumC7204p2 = this.f24134d.f24257E;
                if (enumC7204p2 == null) {
                    AbstractC4154l.m8928k("simSelectionMode");
                    throw null;
                }
                if (enumC7204p2 == enumC7204p) {
                    return a0Var;
                }
                this.f24134d.f24257E = enumC7204p;
                h0 h0Var = this.f24134d;
                this.f24133c = null;
                this.f24132b = 1;
                return h0.m9795g(h0Var, this) == enumC7794a ? enumC7794a : a0Var;
            case 1:
                h0 h0Var2 = this.f24134d;
                C6361k c6361k = (C6361k) this.f24133c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f24132b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    LocalDateTime localDateTime = (LocalDateTime) c6361k.f30755a;
                    int iIntValue = ((Number) c6361k.f30756b).intValue();
                    AbstractC4154l.m8920c(localDateTime);
                    int i12 = h0Var2.f24256D;
                    this.f24133c = null;
                    this.f24132b = 1;
                    objM9793e = h0.m9793e(h0Var2, localDateTime, iIntValue, i12, this);
                    if (objM9793e == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9793e = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM9793e);
            default:
                List list = (List) this.f24133c;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f24132b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    h0 h0Var3 = this.f24134d;
                    this.f24133c = null;
                    this.f24132b = 1;
                    if (h0.m9794f(h0Var3, list, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
