package bt;

import at.C0432c;
import aws.smithy.kotlin.runtime.time.ParseException;
import cv.C1515k;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.e6;
import g2.v1;
import g2.y1;
import java.util.List;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import lu.AbstractC4527m;
import ps.AbstractC6009i;
import pu.EnumC6039g;
import sq.i2;
import td.AbstractC7136m;
import td.C7129f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4819a;

    /* renamed from: b */
    public final /* synthetic */ int f4820b;

    /* renamed from: c */
    public final /* synthetic */ Object f4821c;

    public /* synthetic */ f0(int i10, C4266h c4266h) {
        this.f4819a = 4;
        this.f4820b = i10;
        this.f4821c = c4266h;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4819a) {
            case 0:
                List list = (List) this.f4821c;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e6.m6133b(og.u0.m10941c(((C0432c) list.get(this.f4820b)).f3190a, 6, c3966o), null, null, ((v1) c3966o.m8618k(y1.f13286a)).f12968o, c3966o, 48, 4);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 1:
                ((Integer) obj2).getClass();
                b0.m2072k((l7.a0) this.f4821c, this.f4820b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return qw.a0.f30746a;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4527m.m9371b(this.f4820b, (EnumC6039g) this.f4821c, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return qw.a0.f30746a;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC6009i.m12044n((InterfaceC2139c) this.f4821c, (InterfaceC3962k) obj, C3953b.m8496A(this.f4820b | 1));
                return qw.a0.f30746a;
            default:
                C4266h c4266h = (C4266h) this.f4821c;
                String str = (String) obj;
                Integer num = (Integer) obj2;
                int iIntValue2 = num.intValue();
                AbstractC4154l.m8923f(str, "str");
                AbstractC7136m.m13412b(iIntValue2, 0, str);
                C7129f c7129f = (C7129f) new C1515k(this.f4820b, 2, new i2(10)).invoke(str, num);
                int i10 = c7129f.f34349a;
                int iIntValue3 = ((Number) c7129f.f34350b).intValue();
                if (c4266h.m8986h(iIntValue3)) {
                    return new C7129f(i10, Integer.valueOf(iIntValue3));
                }
                throw new ParseException(str, iIntValue3 + " not in range " + c4266h, iIntValue2);
        }
    }

    public /* synthetic */ f0(int i10, EnumC6039g enumC6039g, int i11) {
        this.f4819a = 2;
        this.f4820b = i10;
        this.f4821c = enumC6039g;
    }

    public /* synthetic */ f0(Object obj, int i10, int i11) {
        this.f4819a = i11;
        this.f4821c = obj;
        this.f4820b = i10;
    }

    public /* synthetic */ f0(l7.a0 a0Var, int i10, int i11) {
        this.f4819a = 1;
        this.f4821c = a0Var;
        this.f4820b = i10;
    }
}
