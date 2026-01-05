package p005f;

import a1.c0;
import ap.C0395h;
import b2.C0566x;
import c0.d1;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1561o;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import g2.f4;
import g4.n0;
import h2.C2810o;
import k1.r0;
import k1.s0;
import k1.x1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4165w;
import kotlin.jvm.internal.C4168z;
import kx.C4266h;
import l4.C4366k;
import l4.C4381z;
import l4.InterfaceC4374s;
import p007h.AbstractC2757i;
import p008i.AbstractC3064a;
import q1.C6097y;
import qw.a0;
import s4.EnumC6757m;
import tx.InterfaceC7266z;
import v3.AbstractC7634f;
import v3.i0;
import vx.C7806h;
import w3.k1;
import w3.t2;
import w4.C7927s;
import w4.C7931w;
import x1.e1;
import x1.r1;
import x1.v0;
import z1.C8843c;
import z1.C8847g;
import z1.C8850j;
import z1.C8854n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.c */
/* loaded from: classes.dex */
public final class C2154c extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f9998a;

    /* renamed from: b */
    public final /* synthetic */ Object f9999b;

    /* renamed from: c */
    public final /* synthetic */ Object f10000c;

    /* renamed from: d */
    public final /* synthetic */ Object f10001d;

    /* renamed from: e */
    public final /* synthetic */ Object f10002e;

    /* renamed from: f */
    public final /* synthetic */ Object f10003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2154c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f9998a = i10;
        this.f10000c = obj;
        this.f10001d = obj2;
        this.f10002e = obj3;
        this.f10003f = obj4;
        this.f9999b = obj5;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f9998a;
        int i11 = 11;
        a0 a0Var = a0.f30746a;
        Object obj2 = this.f9999b;
        Object obj3 = this.f10003f;
        Object obj4 = this.f10002e;
        Object obj5 = this.f10001d;
        Object obj6 = this.f10000c;
        switch (i10) {
            case 0:
                C2152a c2152a = (C2152a) obj6;
                c2152a.f9995a = ((AbstractC2757i) obj5).m6752d((String) obj4, (AbstractC3064a) obj3, new c0(i11, (w0) obj2));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                float f6 = f4.f11555a;
                ((w0) obj2).setValue(Boolean.valueOf(!((Boolean) r7.getValue()).booleanValue()));
                tx.c0.m13502y((InterfaceC7266z) obj6, null, null, new C0395h((C6097y) obj5, iIntValue, (C4266h) obj4, (C2810o) obj3, null, 2), 3);
                break;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                C4165w c4165w = (C4165w) obj4;
                C4168z c4168z = (C4168z) obj5;
                d1 d1Var = (d1) obj6;
                s0 s0VarM2183h = d1.m2183h((C7806h) d1Var.f5071f);
                if (s0VarM2183h != null) {
                    d1Var.m2188i(s0VarM2183h);
                    s0 s0VarM8473a = ((s0) c4168z.f21164a).m8473a(s0VarM2183h);
                    c4168z.f21164a = s0VarM8473a;
                    x1 x1Var = (x1) obj3;
                    c4165w.f21161a = x1Var.m8480f(x1Var.m8478d(s0VarM8473a.f20222a));
                    ((C4164v) obj2).f21160a = !r0.m8469a(r6 - fFloatValue);
                }
                break;
            case 3:
                C7927s c7927s = (C7927s) obj6;
                c7927s.f38131f.addView(c7927s, c7927s.f38132g);
                c7927s.m15054g((InterfaceC2137a) obj5, (C7931w) obj3, (String) obj4, (EnumC6757m) obj2);
                break;
            case 4:
                i0 i0Var = (i0) obj;
                i0Var.m14622b();
                float fM8490f = ((C8847g) obj6).f42580c.m8490f();
                if (fM8490f != DefinitionKt.NO_Float_VALUE) {
                    long j6 = ((C4381z) obj4).f21946b;
                    int i12 = n0.f13685c;
                    int iMo2733Y = ((InterfaceC4374s) obj5).mo2733Y((int) (j6 >> 32));
                    r1 r1VarM15480d = ((v0) obj3).m15480d();
                    C0848c c0848cM6445c = r1VarM15480d != null ? r1VarM15480d.f39668a.m6445c(iMo2733Y) : new C0848c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
                    float fFloor = (float) Math.floor(i0Var.mo8435T(e1.f39486a));
                    float f10 = fFloor < 1.0f ? 1.0f : fFloor;
                    float f11 = f10 / 2;
                    float f12 = c0848cM6445c.f5354a + f11;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (i0Var.f36917a.mo5913e() >> 32)) - f11;
                    if (f12 > fIntBitsToFloat) {
                        f12 = fIntBitsToFloat;
                    }
                    if (f12 >= f11) {
                        f11 = f12;
                    }
                    float fFloor2 = ((int) f10) % 2 == 1 ? ((float) Math.floor(f11)) + 0.5f : (float) Math.rint(f11);
                    InterfaceC2198d.m5912w(i0Var, (AbstractC1561o) obj2, (Float.floatToRawIntBits(c0848cM6445c.f5355b) & 4294967295L) | (Float.floatToRawIntBits(fFloor2) << 32), (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(c0848cM6445c.f5357d) & 4294967295L), f10, fM8490f, 432);
                    break;
                }
                break;
            default:
                C8854n c8854n = (C8854n) obj;
                C8850j c8850j = ((C8843c) obj5).f42561a;
                c8854n.f42615h = (C4381z) obj6;
                c8854n.f42616i = (C4366k) obj4;
                c8854n.f42610c = (C0566x) obj3;
                c8854n.f42611d = (InterfaceC2139c) obj2;
                c8854n.f42612e = c8850j != null ? c8850j.f42586r : null;
                c8854n.f42613f = c8850j != null ? c8850j.f42587s : null;
                c8854n.f42614g = c8850j != null ? (t2) AbstractC7634f.m14548i(c8850j, k1.f37847s) : null;
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154c(InterfaceC7266z interfaceC7266z, w0 w0Var, C6097y c6097y, C4266h c4266h, C2810o c2810o) {
        super(1);
        this.f9998a = 1;
        this.f10000c = interfaceC7266z;
        this.f9999b = w0Var;
        this.f10001d = c6097y;
        this.f10002e = c4266h;
        this.f10003f = c2810o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154c(C7927s c7927s, InterfaceC2137a interfaceC2137a, C7931w c7931w, String str, EnumC6757m enumC6757m) {
        super(1);
        this.f9998a = 3;
        this.f10000c = c7927s;
        this.f10001d = interfaceC2137a;
        this.f10003f = c7931w;
        this.f10002e = str;
        this.f9999b = enumC6757m;
    }
}
