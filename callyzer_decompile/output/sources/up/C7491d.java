package up;

import eo.C2082h;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.List;
import mn.C4812i;
import og.od;
import og.pe;
import qp.C6272i;
import qw.a0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.w0;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: up.d */
/* loaded from: classes3.dex */
public final class C7491d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f36162a;

    /* renamed from: b */
    public C4812i f36163b;

    /* renamed from: c */
    public LocalDateTime f36164c;

    /* renamed from: d */
    public LocalDateTime f36165d;

    /* renamed from: e */
    public int f36166e;

    /* renamed from: f */
    public final /* synthetic */ C7494g f36167f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7491d(C7494g c7494g, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f36162a = i10;
        this.f36167f = c7494g;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f36162a) {
            case 0:
                return new C7491d(this.f36167f, interfaceC7559c, 0);
            case 1:
                return new C7491d(this.f36167f, interfaceC7559c, 1);
            default:
                return new C7491d(this.f36167f, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f36162a) {
        }
        return ((C7491d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        LocalDateTime localDateTime;
        C4812i c4812i;
        int i10;
        LocalDateTime localDateTime2;
        LocalDateTime localDateTime3;
        C4812i c4812i2;
        int i11;
        LocalDateTime localDateTime4;
        C4812i c4812i3;
        LocalDateTime localDateTime5;
        LocalDateTime localDateTime6;
        switch (this.f36162a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f36166e;
                C7494g c7494g = this.f36167f;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C4812i c4812i4 = c7494g.f36173f;
                    w0 w0Var = c7494g.f36183p;
                    LocalDateTime localDateTime7 = ((C6272i) w0Var.f39340a.getValue()).f30438e;
                    LocalDateTime localDateTime8 = ((C6272i) w0Var.f39340a.getValue()).f30439f;
                    C2082h c2082h = c7494g.f36175h;
                    EnumC7204p enumC7204p = ((C6272i) w0Var.f39340a.getValue()).f30437d;
                    this.f36163b = c4812i4;
                    this.f36164c = localDateTime7;
                    this.f36165d = localDateTime8;
                    this.f36166e = 1;
                    obj = c2082h.m5797f(enumC7204p, this);
                    if (obj != enumC7794a) {
                        localDateTime = localDateTime7;
                        c4812i = c4812i4;
                        i10 = 2;
                        localDateTime2 = localDateTime8;
                    }
                    return enumC7794a;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                LocalDateTime localDateTime9 = this.f36165d;
                LocalDateTime localDateTime10 = this.f36164c;
                C4812i c4812i5 = this.f36163b;
                od.m10798c(obj);
                localDateTime2 = localDateTime9;
                c4812i = c4812i5;
                i10 = 2;
                localDateTime = localDateTime10;
                List list = ((C6272i) c7494g.f36183p.f39340a.getValue()).f30440g;
                boolean z6 = ((C6272i) c7494g.f36183p.f39340a.getValue()).f30443j;
                List listM10834i = pe.m10834i(EnumC8994d.INCOMING, EnumC8994d.OUTGOING);
                this.f36163b = null;
                this.f36164c = null;
                this.f36165d = null;
                this.f36166e = i10;
                Object objM9782e = c4812i.m9782e(localDateTime, localDateTime2, (String) obj, z6, listM10834i, list, this);
                if (objM9782e != enumC7794a) {
                    return objM9782e;
                }
                return enumC7794a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f36166e;
                C7494g c7494g2 = this.f36167f;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4812i c4812i6 = c7494g2.f36173f;
                    w0 w0Var2 = c7494g2.f36183p;
                    LocalDateTime localDateTime11 = ((C6272i) w0Var2.f39340a.getValue()).f30438e;
                    LocalDateTime localDateTime12 = ((C6272i) w0Var2.f39340a.getValue()).f30439f;
                    C2082h c2082h2 = c7494g2.f36175h;
                    EnumC7204p enumC7204p2 = ((C6272i) w0Var2.f39340a.getValue()).f30437d;
                    this.f36163b = c4812i6;
                    this.f36164c = localDateTime11;
                    this.f36165d = localDateTime12;
                    this.f36166e = 1;
                    obj = c2082h2.m5797f(enumC7204p2, this);
                    if (obj != enumC7794a2) {
                        localDateTime3 = localDateTime11;
                        c4812i2 = c4812i6;
                        i11 = 2;
                        localDateTime4 = localDateTime12;
                    }
                    return enumC7794a2;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                LocalDateTime localDateTime13 = this.f36165d;
                LocalDateTime localDateTime14 = this.f36164c;
                C4812i c4812i7 = this.f36163b;
                od.m10798c(obj);
                localDateTime4 = localDateTime13;
                c4812i2 = c4812i7;
                i11 = 2;
                localDateTime3 = localDateTime14;
                List list2 = ((C6272i) c7494g2.f36183p.f39340a.getValue()).f30440g;
                boolean z10 = ((C6272i) c7494g2.f36183p.f39340a.getValue()).f30443j;
                List listM10833h = pe.m10833h(EnumC8994d.INCOMING);
                this.f36163b = null;
                this.f36164c = null;
                this.f36165d = null;
                this.f36166e = i11;
                Object objM9782e2 = c4812i2.m9782e(localDateTime3, localDateTime4, (String) obj, z10, listM10833h, list2, this);
                if (objM9782e2 != enumC7794a2) {
                    return objM9782e2;
                }
                return enumC7794a2;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f36166e;
                C7494g c7494g3 = this.f36167f;
                if (i14 == 0) {
                    od.m10798c(obj);
                    c4812i3 = c7494g3.f36173f;
                    w0 w0Var3 = c7494g3.f36183p;
                    LocalDateTime localDateTime15 = ((C6272i) w0Var3.f39340a.getValue()).f30438e;
                    LocalDateTime localDateTime16 = ((C6272i) w0Var3.f39340a.getValue()).f30439f;
                    C2082h c2082h3 = c7494g3.f36175h;
                    EnumC7204p enumC7204p3 = ((C6272i) w0Var3.f39340a.getValue()).f30437d;
                    this.f36163b = c4812i3;
                    this.f36164c = localDateTime15;
                    this.f36165d = localDateTime16;
                    this.f36166e = 1;
                    obj = c2082h3.m5797f(enumC7204p3, this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                    localDateTime5 = localDateTime16;
                    localDateTime6 = localDateTime15;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return obj;
                    }
                    LocalDateTime localDateTime17 = this.f36165d;
                    LocalDateTime localDateTime18 = this.f36164c;
                    c4812i3 = this.f36163b;
                    od.m10798c(obj);
                    localDateTime5 = localDateTime17;
                    localDateTime6 = localDateTime18;
                }
                List list3 = ((C6272i) c7494g3.f36183p.f39340a.getValue()).f30440g;
                boolean z11 = ((C6272i) c7494g3.f36183p.f39340a.getValue()).f30443j;
                List listM10833h2 = pe.m10833h(EnumC8994d.OUTGOING);
                this.f36163b = null;
                this.f36164c = null;
                this.f36165d = null;
                this.f36166e = 2;
                Object objM9782e3 = c4812i3.m9782e(localDateTime6, localDateTime5, (String) obj, z11, listM10833h2, list3, this);
                if (objM9782e3 != enumC7794a3) {
                    return objM9782e3;
                }
                return enumC7794a3;
        }
    }
}
