package h2;

import c9.C0925t;
import com.skydoves.balloon.internals.DefinitionKt;
import cp.C1476g;
import ex.InterfaceC2143g;
import h1.AbstractC2773d;
import h1.InterfaceC2779j;
import k2.a1;
import kotlin.jvm.internal.C4165w;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.d */
/* loaded from: classes.dex */
public final class C2799d extends AbstractC8199i implements InterfaceC2143g {

    /* renamed from: a */
    public int f15687a;

    /* renamed from: b */
    public /* synthetic */ C2805j f15688b;

    /* renamed from: c */
    public /* synthetic */ d0 f15689c;

    /* renamed from: d */
    public /* synthetic */ Object f15690d;

    /* renamed from: e */
    public final /* synthetic */ C0925t f15691e;

    /* renamed from: f */
    public final /* synthetic */ float f15692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2799d(C0925t c0925t, float f6, InterfaceC7559c interfaceC7559c) {
        super(4, interfaceC7559c);
        this.f15691e = c0925t;
        this.f15692f = f6;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        C2799d c2799d = new C2799d(this.f15691e, this.f15692f, (InterfaceC7559c) obj4);
        c2799d.f15688b = (C2805j) obj;
        c2799d.f15689c = (d0) obj2;
        c2799d.f15690d = obj3;
        return c2799d.invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15687a;
        if (i10 == 0) {
            od.m10798c(obj);
            C2805j c2805j = this.f15688b;
            float fM6891d = this.f15689c.m6891d(this.f15690d);
            if (!Float.isNaN(fM6891d)) {
                C4165w c4165w = new C4165w();
                C0925t c0925t = this.f15691e;
                float fM8490f = Float.isNaN(((a1) c0925t.f5660j).m8490f()) ? DefinitionKt.NO_Float_VALUE : ((a1) c0925t.f5660j).m8490f();
                c4165w.f21161a = fM8490f;
                InterfaceC2779j interfaceC2779j = (InterfaceC2779j) c0925t.f5653c;
                C1476g c1476g = new C1476g(10, c2805j, c4165w);
                this.f15688b = null;
                this.f15689c = null;
                this.f15687a = 1;
                if (AbstractC2773d.m6780c(fM8490f, fM6891d, this.f15692f, interfaceC2779j, c1476g, this) == enumC7794a) {
                    return enumC7794a;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }
}
