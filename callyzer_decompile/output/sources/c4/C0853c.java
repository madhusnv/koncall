package c4;

import androidx.compose.material3.internal.AbstractC0257a;
import c3.C0847b;
import c9.C0925t;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.C1582j;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.ja;
import k2.e1;
import og.od;
import p020v.a1;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.c */
/* loaded from: classes.dex */
public final class C0853c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f5379a = 0;

    /* renamed from: b */
    public int f5380b;

    /* renamed from: c */
    public /* synthetic */ float f5381c;

    /* renamed from: d */
    public final /* synthetic */ Object f5382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0853c(ScrollCaptureCallbackC0854d scrollCaptureCallbackC0854d, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f5382d = scrollCaptureCallbackC0854d;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f5379a) {
            case 0:
                C0853c c0853c = new C0853c((ScrollCaptureCallbackC0854d) this.f5382d, interfaceC7559c);
                c0853c.f5381c = ((Number) obj).floatValue();
                return c0853c;
            default:
                return new C0853c((ja) this.f5382d, this.f5381c, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5379a) {
            case 0:
                return ((C0853c) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C0853c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM705b;
        switch (this.f5379a) {
            case 0:
                ScrollCaptureCallbackC0854d scrollCaptureCallbackC0854d = (ScrollCaptureCallbackC0854d) this.f5382d;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f5380b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    float f6 = this.f5381c;
                    Object objM5574g = scrollCaptureCallbackC0854d.f5383a.f7879d.f7868a.m5574g(C1582j.f7846e);
                    if (objM5574g == null) {
                        objM5574g = null;
                    }
                    InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM5574g;
                    if (interfaceC2141e == null) {
                        throw a1.m14342v("Required value was null.");
                    }
                    C0847b c0847b = new C0847b((Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
                    this.f5380b = 1;
                    obj = interfaceC2141e.invoke(c0847b, this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((C0847b) obj).f5352a & 4294967295L)));
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f5380b;
                a0 a0Var = a0.f30746a;
                if (i11 == 0) {
                    od.m10798c(obj);
                    ja jaVar = (ja) this.f5382d;
                    float f10 = this.f5381c;
                    this.f5380b = 1;
                    C0925t c0925t = jaVar.f11872b;
                    Object value = ((e1) c0925t.f5657g).getValue();
                    Object objM2676e = c0925t.m2676e(c0925t.m2689r(), f10, value);
                    if (!((Boolean) ((InterfaceC2139c) c0925t.f5654d).invoke(objM2676e)).booleanValue() ? (objM705b = AbstractC0257a.m705b(c0925t, value, f10, this)) != enumC7794a2 : (objM705b = AbstractC0257a.m705b(c0925t, objM2676e, f10, this)) != enumC7794a2) {
                        objM705b = a0Var;
                    }
                    if (objM705b != enumC7794a2) {
                        objM705b = a0Var;
                    }
                    if (objM705b == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0853c(ja jaVar, float f6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f5382d = jaVar;
        this.f5381c = f6;
    }
}
