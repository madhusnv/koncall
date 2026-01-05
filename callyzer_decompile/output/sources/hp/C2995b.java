package hp;

import android.content.Context;
import bd.C0645a;
import c9.C0908c;
import com.websoptimization.callyzerbiz.data.model.response.FetchUpdatedCallNoteResponse;
import com.websoptimization.callyzerbiz.data.model.response.Subscription;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import h1.x0;
import h2.C2806k;
import i1.y0;
import io.C3328c;
import ip.C3342l;
import jc.i0;
import jt.C3856e;
import k1.C3938m;
import k1.a1;
import k1.d1;
import k1.e0;
import k1.j0;
import k1.v1;
import k1.x1;
import k2.k1;
import k2.p1;
import k2.t0;
import k2.w0;
import ks.C4223l;
import ks.c0;
import ks.q0;
import m1.InterfaceC4628j;
import m1.InterfaceC4630l;
import mm.C4791b;
import mm.C4802m;
import mq.AbstractC4854v;
import mq.h0;
import no.C5122i;
import o6.C5321w;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import p3.C5819q;
import q1.C6097y;
import qd.InterfaceC6187g;
import qw.a0;
import tc.C7123h;
import tx.InterfaceC7266z;
import tx.e1;
import tx.o0;
import tx.s1;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;
import xm.y5;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hp.b */
/* loaded from: classes3.dex */
public final class C2995b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16140a;

    /* renamed from: b */
    public int f16141b;

    /* renamed from: c */
    public Object f16142c;

    /* renamed from: d */
    public Object f16143d;

    /* renamed from: e */
    public final /* synthetic */ Object f16144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2995b(InterfaceC2142f interfaceC2142f, a1 a1Var, C5819q c5819q, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16140a = 13;
        this.f16142c = (AbstractC8199i) interfaceC2142f;
        this.f16143d = a1Var;
        this.f16144e = c5819q;
    }

    /* renamed from: d */
    private final Object m7253d(Object obj) {
        C4802m c4802m = (C4802m) this.f16143d;
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f16142c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f16141b;
        if (i10 == 0) {
            od.m10798c(obj);
            if (c4802m.f23903o) {
                C0908c c0908c = (C0908c) ((C3328c) this.f16144e).f17611c;
                this.f16142c = interfaceC7266z;
                this.f16141b = 1;
                obj = ((y5) c0908c.f5574b).m15701q("Lead", c4802m, this);
                if (obj == enumC7794a) {
                    return enumC7794a;
                }
            }
            return null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        Subscription subscription = (Subscription) obj;
        if (subscription != null) {
            String str = !subscription.m4842c() ? c4802m.f23896h : null;
            if (str != null) {
                return str;
            }
        }
        if (!c4802m.f23902n) {
            return c4802m.f23896h;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m7254e(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.C2995b.m7254e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16140a) {
            case 0:
                return new C2995b((C6097y) this.f16142c, (InterfaceC7266z) this.f16143d, (C3342l) this.f16144e, interfaceC7559c, 0);
            case 1:
                return new C2995b((C6097y) this.f16142c, (InterfaceC7266z) this.f16143d, (h0) this.f16144e, interfaceC7559c, 1);
            case 2:
                return new C2995b((h0) this.f16142c, (InterfaceC2139c) this.f16143d, (Context) this.f16144e, interfaceC7559c, 2);
            case 3:
                return new C2995b((mq.a1) this.f16142c, (InterfaceC2139c) this.f16143d, (Context) this.f16144e, interfaceC7559c, 3);
            case 4:
                return new C2995b((InterfaceC4630l) this.f16142c, (InterfaceC4628j) this.f16143d, (o0) this.f16144e, interfaceC7559c, 4);
            case 5:
                C2995b c2995b = new C2995b((InterfaceC6187g) this.f16143d, interfaceC7559c, (InterfaceC7411o) this.f16144e);
                c2995b.f16142c = obj;
                return c2995b;
            case 6:
                return new C2995b((i0) this.f16142c, (C0645a) this.f16143d, (C7123h) this.f16144e, interfaceC7559c, 6);
            case 7:
                return new C2995b((s1) this.f16142c, (C3856e) this.f16143d, (Context) this.f16144e, interfaceC7559c, 7);
            case 8:
                C2995b c2995b2 = new C2995b((C3938m) this.f16143d, (InterfaceC2141e) this.f16144e, interfaceC7559c, 8);
                c2995b2.f16142c = obj;
                return c2995b2;
            case 9:
                return new C2995b((C3938m) this.f16142c, (y0) this.f16143d, (InterfaceC2141e) this.f16144e, interfaceC7559c, 9);
            case 10:
                C2995b c2995b3 = new C2995b((e0) this.f16143d, (j0) this.f16144e, interfaceC7559c, 10);
                c2995b3.f16142c = obj;
                return c2995b3;
            case 11:
                C2995b c2995b4 = new C2995b((e0) this.f16143d, (x1) this.f16144e, interfaceC7559c, 11);
                c2995b4.f16142c = obj;
                return c2995b4;
            case 12:
                C2995b c2995b5 = new C2995b((x1) this.f16143d, (InterfaceC2141e) this.f16144e, interfaceC7559c, 12);
                c2995b5.f16142c = obj;
                return c2995b5;
            case 13:
                return new C2995b((InterfaceC2142f) this.f16142c, (a1) this.f16143d, (C5819q) this.f16144e, interfaceC7559c);
            case 14:
                C2995b c2995b6 = new C2995b((e1) this.f16143d, (InterfaceC2141e) this.f16144e, interfaceC7559c);
                c2995b6.f16142c = obj;
                return c2995b6;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C2995b c2995b7 = new C2995b((p1) this.f16143d, (t0) this.f16144e, interfaceC7559c, 15);
                c2995b7.f16142c = obj;
                return c2995b7;
            case 16:
                C2995b c2995b8 = new C2995b((InterfaceC7564h) this.f16143d, (InterfaceC8209j) this.f16144e, interfaceC7559c, 16);
                c2995b8.f16142c = obj;
                return c2995b8;
            case 17:
                return new C2995b((C4223l) this.f16142c, (LastCallDetails) this.f16143d, (String) this.f16144e, interfaceC7559c, 17);
            case 18:
                return new C2995b((c0) this.f16144e, interfaceC7559c, 18);
            case 19:
                return new C2995b((c0) this.f16142c, (LastCallDetails) this.f16143d, (String) this.f16144e, interfaceC7559c, 19);
            case 20:
                C2995b c2995b9 = new C2995b((q0) this.f16144e, interfaceC7559c, 20);
                c2995b9.f16143d = obj;
                return c2995b9;
            case 21:
                return new C2995b((q0) this.f16144e, interfaceC7559c, 21);
            case 22:
                return new C2995b((q0) this.f16142c, (LastCallDetails) this.f16143d, (String) this.f16144e, interfaceC7559c, 22);
            case 23:
                return new C2995b((h0) this.f16143d, (AbstractC4854v) this.f16144e, interfaceC7559c, 23);
            case 24:
                C2995b c2995b10 = new C2995b((mq.a1) this.f16144e, interfaceC7559c, 24);
                c2995b10.f16143d = obj;
                return c2995b10;
            case 25:
                return new C2995b((x0) this.f16142c, (w0) this.f16143d, (k2.a1) this.f16144e, interfaceC7559c, 25);
            case 26:
                C2995b c2995b11 = new C2995b((C5122i) this.f16143d, (C4791b) this.f16144e, interfaceC7559c, 26);
                c2995b11.f16142c = obj;
                return c2995b11;
            case 27:
                C2995b c2995b12 = new C2995b((C4802m) this.f16143d, (C3328c) this.f16144e, interfaceC7559c, 27);
                c2995b12.f16142c = obj;
                return c2995b12;
            case 28:
                C2995b c2995b13 = new C2995b((C5321w) this.f16144e, interfaceC7559c, 28);
                c2995b13.f16143d = obj;
                return c2995b13;
            default:
                C2995b c2995b14 = new C2995b((C5321w) this.f16143d, (InterfaceC2141e) this.f16144e, interfaceC7559c);
                c2995b14.f16142c = obj;
                return c2995b14;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16140a) {
            case 0:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 1:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 2:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 3:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 4:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 5:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 6:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 7:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 8:
                return ((C2995b) create((d1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 9:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 10:
                return ((C2995b) create((C2806k) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 11:
                return ((C2995b) create((v1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 12:
                return ((C2995b) create((d1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 13:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 14:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 16:
                return ((C2995b) create((k1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 17:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 18:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 19:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 20:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 21:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 22:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 23:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 24:
                return ((C2995b) create((C8801p) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 25:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 26:
                return ((C2995b) create((FetchUpdatedCallNoteResponse) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 27:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 28:
                return ((C2995b) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C2995b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0313, code lost:
    
        if (r4 == r3) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:508:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r2v56, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r3v30, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r7v50, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.C2995b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2995b(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16140a = i10;
        this.f16142c = obj;
        this.f16143d = obj2;
        this.f16144e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2995b(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16140a = i10;
        this.f16143d = obj;
        this.f16144e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2995b(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16140a = i10;
        this.f16144e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2995b(C5321w c5321w, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16140a = 29;
        this.f16143d = c5321w;
        this.f16144e = (AbstractC8199i) interfaceC2141e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2995b(InterfaceC6187g interfaceC6187g, InterfaceC7559c interfaceC7559c, InterfaceC7411o interfaceC7411o) {
        super(2, interfaceC7559c);
        this.f16140a = 5;
        this.f16143d = interfaceC6187g;
        this.f16144e = interfaceC7411o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2995b(e1 e1Var, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16140a = 14;
        this.f16143d = e1Var;
        this.f16144e = (AbstractC8199i) interfaceC2141e;
    }
}
