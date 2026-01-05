package xm;

import ex.InterfaceC2141e;
import java.util.EnumSet;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.od;
import og.pe;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import zm.EnumC8991a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40723a;

    /* renamed from: b */
    public int f40724b;

    /* renamed from: c */
    public final /* synthetic */ String f40725c;

    /* renamed from: d */
    public final /* synthetic */ x1 f40726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, x1 x1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40723a = i10;
        this.f40725c = str;
        this.f40726d = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40723a) {
            case 0:
                return new q0(this.f40725c, this.f40726d, interfaceC7559c, 0);
            case 1:
                return new q0(this.f40725c, this.f40726d, interfaceC7559c, 1);
            case 2:
                return new q0(this.f40726d, this.f40725c, interfaceC7559c, 2);
            case 3:
                return new q0(this.f40726d, this.f40725c, interfaceC7559c, 3);
            default:
                return new q0(this.f40726d, this.f40725c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40723a) {
        }
        return ((q0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40723a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40724b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                String str = this.f40725c;
                if (AbstractC5178p.m10101L(str)) {
                    throw new IllegalStateException("SimNumber is required");
                }
                gn.x2 x2Var = this.f40726d.f40991a;
                this.f40724b = 1;
                an.h3 h3Var = x2Var.f14941a;
                EnumSet enumSetOf = EnumSet.of(EnumC8991a.SYNC_NOTE_UPDATE);
                AbstractC4154l.m8922e(enumSetOf, "of(...)");
                Object objM10839n = pe.m10839n(this, h3Var.f899a, true, false, new an.d2(enumSetOf, str, 2));
                return objM10839n == enumC7794a ? enumC7794a : objM10839n;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40724b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                String str2 = this.f40725c;
                if (AbstractC5178p.m10101L(str2)) {
                    throw new IllegalStateException("SimNumber must not be empty");
                }
                gn.x2 x2Var2 = this.f40726d.f40991a;
                this.f40724b = 1;
                an.h3 h3Var2 = x2Var2.f14941a;
                EnumSet enumSetOf2 = EnumSet.of(EnumC8991a.SYNC_CALL_RECORDING_UPDATE);
                AbstractC4154l.m8922e(enumSetOf2, "of(...)");
                EnumSet enumSetOf3 = EnumSet.of(EnumC8991a.SYNC_NEW);
                AbstractC4154l.m8922e(enumSetOf3, "of(...)");
                Object objM10839n2 = pe.m10839n(this, h3Var2.f899a, true, false, new an.z1(enumSetOf2, enumSetOf3, str2, h3Var2, 0));
                return objM10839n2 == enumC7794a2 ? enumC7794a2 : objM10839n2;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40724b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var3 = this.f40726d.f40991a;
                this.f40724b = 1;
                Object objM6658D = x2Var3.m6658D(this.f40725c, this);
                return objM6658D == enumC7794a3 ? enumC7794a3 : objM6658D;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40724b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var4 = this.f40726d.f40991a;
                this.f40724b = 1;
                Object objM10839n3 = pe.m10839n(this, x2Var4.f14948h.f862a, true, false, new an.v1(this.f40725c, 8));
                return objM10839n3 == enumC7794a4 ? enumC7794a4 : objM10839n3;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f40724b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var5 = this.f40726d.f40991a;
                this.f40724b = 1;
                Object objM10839n4 = pe.m10839n(this, x2Var5.f14941a.f899a, true, false, new an.v1(this.f40725c, 4));
                return objM10839n4 == enumC7794a5 ? enumC7794a5 : objM10839n4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(x1 x1Var, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40723a = i10;
        this.f40726d = x1Var;
        this.f40725c = str;
    }
}
