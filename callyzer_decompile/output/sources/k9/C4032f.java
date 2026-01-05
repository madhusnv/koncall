package k9;

import a2.AbstractC0030c;
import ak.C0165d;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import aw.C0462b;
import bk.C0684o;
import bt.C0778w;
import bu.C0782a;
import c9.C0908c;
import c9.C0914i;
import dr.C1772v;
import e1.e0;
import e1.x0;
import en.C2074g;
import ex.InterfaceC2141e;
import f9.C2222e;
import fn.C2336i;
import ik.C3288l;
import im.EnumC3308j;
import im.InterfaceC3307i;
import im.t1;
import im.z1;
import io.C3328c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import jc.C3730f;
import k2.C3953b;
import k2.b1;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import ku.C4245c;
import ku.C4246d;
import lu.C4525k;
import mq.i0;
import nn.C5113e;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import org.slf4j.helpers.AbstractC5722k;
import p3.h0;
import pg.h6;
import pr.C5999b;
import pr.C6000c;
import q9.C6147e;
import qc.C6158d;
import qr.C6293q;
import qr.C6294r;
import qr.C6295s;
import qr.C6296t;
import qu.C6324e;
import qw.a0;
import ru.C6624b;
import rw.AbstractC6654d;
import tb.C7105p;
import tx.InterfaceC7266z;
import tx.c0;
import u7.C7351a;
import u7.C7352b;
import u8.C7368p;
import ua.C7381a;
import ub.C7392h;
import ug.C7439j;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import vx.EnumC7799a;
import w9.C7962e;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.InterfaceC8209j;
import wx.c1;
import wx.j0;
import wx.m1;
import wx.v0;
import x1.w0;
import xd.C8339j;
import xm.l2;
import xm.o4;
import xm.q4;
import xm.w2;
import xm.x1;
import xp.C8426g;
import xx.C8506l;
import yn.C8716n;
import yt.C8774f;
import yv.C8798m;
import yv.C8805t;
import yv.EnumC8799n;
import z1.C8847g;
import z7.n0;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k9.f */
/* loaded from: classes.dex */
public final class C4032f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20831a;

    /* renamed from: b */
    public int f20832b;

    /* renamed from: c */
    public final /* synthetic */ Object f20833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4032f(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20831a = i10;
        this.f20833c = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20831a) {
            case 0:
                return new C4032f((C4031e) this.f20833c, interfaceC7559c, 0);
            case 1:
                return new C4032f((C4246d) this.f20833c, interfaceC7559c, 1);
            case 2:
                return new C4032f((i0) this.f20833c, interfaceC7559c, 2);
            case 3:
                return new C4032f((h0) this.f20833c, interfaceC7559c, 3);
            case 4:
                return new C4032f((C6000c) this.f20833c, interfaceC7559c, 4);
            case 5:
                return new C4032f((b1) this.f20833c, interfaceC7559c, 5);
            case 6:
                return new C4032f((C6147e) this.f20833c, interfaceC7559c, 6);
            case 7:
                return new C4032f((C6293q) this.f20833c, interfaceC7559c, 7);
            case 8:
                return new C4032f((C6295s) this.f20833c, interfaceC7559c, 8);
            case 9:
                return new C4032f((C6296t) this.f20833c, interfaceC7559c, 9);
            case 10:
                return new C4032f((C6294r) this.f20833c, interfaceC7559c, 10);
            case 11:
                return new C4032f((C6324e) this.f20833c, interfaceC7559c, 11);
            case 12:
                return new C4032f((C3730f) this.f20833c, interfaceC7559c, 12);
            case 13:
                return new C4032f((C7352b) this.f20833c, interfaceC7559c, 13);
            case 14:
                return new C4032f((C7381a) this.f20833c, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C4032f((C7439j) this.f20833c, interfaceC7559c, 15);
            case 16:
                return new C4032f((C7962e) this.f20833c, interfaceC7559c, 16);
            case 17:
                return new C4032f((C8219t) this.f20833c, interfaceC7559c, 17);
            case 18:
                return new C4032f((C8847g) this.f20833c, interfaceC7559c, 18);
            case 19:
                return new C4032f((w0) this.f20833c, interfaceC7559c, 19);
            case 20:
                return new C4032f((C8339j) this.f20833c, interfaceC7559c, 20);
            case 21:
                return new C4032f((InterfaceC3307i) this.f20833c, interfaceC7559c, 21);
            case 22:
                return new C4032f((t1) this.f20833c, interfaceC7559c, 22);
            case 23:
                return new C4032f((z1) this.f20833c, interfaceC7559c, 23);
            case 24:
                return new C4032f((List) this.f20833c, interfaceC7559c, 24);
            case 25:
                return new C4032f((q4) this.f20833c, interfaceC7559c, 25);
            case 26:
                return new C4032f((k2.w0) this.f20833c, interfaceC7559c, 26);
            case 27:
                return new C4032f((C8716n) this.f20833c, this.f20832b, interfaceC7559c);
            case 28:
                return new C4032f((C8774f) this.f20833c, interfaceC7559c, 28);
            default:
                return new C4032f((n0) this.f20833c, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f20831a) {
            case 27:
                C4032f c4032f = (C4032f) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c4032f.invokeSuspend(a0Var);
                break;
        }
        return ((C4032f) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM11279c;
        EnumC8799n enumC8799n;
        Object value;
        List excludeNumbers;
        Object objM11279c2;
        Object objM11279c3;
        Object objM11279c4;
        Object objM6023c;
        Object value2;
        Object objM2628h;
        boolean z6 = false;
        int i10 = 16;
        int i11 = 8;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int i12 = 1;
        switch (this.f20831a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f20832b;
                if (i13 == 0) {
                    od.m10798c(obj);
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        objM11279c = obj;
                        return (String) objM11279c;
                    }
                    od.m10798c(obj);
                    String str = (String) obj;
                    if (str != null) {
                        return str;
                    }
                }
                this.f20832b = 2;
                objM11279c = AbstractC5722k.m11279c(null, null, this, 3);
                if (objM11279c == enumC7794a) {
                    return enumC7794a;
                }
                return (String) objM11279c;
            case 1:
                a0 a0Var = a0.f30746a;
                C4246d c4246d = (C4246d) this.f20833c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f20832b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    C5113e c5113e = c4246d.f21567b;
                    C8798m c8798m = EnumC8799n.Companion;
                    for (Object obj3 : ((C4245c) c4246d.f21572g.f39340a.getValue()).f21566a) {
                        if (((C6624b) obj3).f31816b) {
                            if (z6) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z6 = true;
                            obj2 = obj3;
                        }
                    }
                    if (!z6) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    int i15 = ((C6624b) obj2).f31815a;
                    c8798m.getClass();
                    AbstractC6654d abstractC6654d = (AbstractC6654d) EnumC8799n.getEntries();
                    abstractC6654d.getClass();
                    x0 x0Var = new x0(7, abstractC6654d);
                    while (true) {
                        if (x0Var.hasNext()) {
                            enumC8799n = (EnumC8799n) x0Var.next();
                            if (enumC8799n.getThemeMode() == i15) {
                            }
                        } else {
                            enumC8799n = EnumC8799n.SystemTheme;
                        }
                    }
                    this.f20832b = 1;
                    Object objM15723m = c5113e.f25030a.m15723m(enumC8799n, this);
                    if (objM15723m != EnumC7794a.COROUTINE_SUSPENDED) {
                        objM15723m = a0Var;
                    }
                    if (objM15723m == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                c4246d.f21569d.m14286c(c4246d.f21570e);
                return a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f20832b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    i0 i0Var = (i0) this.f20833c;
                    v0 v0Var = i0Var.f24288b.f22368b;
                    C1772v c1772v = new C1772v(6, i0Var);
                    this.f20832b = 1;
                    if (v0Var.f39335a.collect(c1772v, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                throw new KotlinNothingValueException();
            case 3:
                h0 h0Var = (h0) this.f20833c;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f20832b;
                if (i17 == 0) {
                    od.m10798c(obj);
                    ?? r32 = h0Var.f28458s;
                    if (r32 != 0) {
                        this.f20832b = 1;
                        if (r32.invoke(h0Var, this) == enumC7794a4) {
                            return enumC7794a4;
                        }
                    } else {
                        PointerInputEventHandler pointerInputEventHandler = h0Var.f28459t;
                        this.f20832b = 2;
                        if (pointerInputEventHandler.invoke(h0Var, this) == enumC7794a4) {
                            return enumC7794a4;
                        }
                    }
                } else {
                    if (i17 != 1 && i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 4:
                a0 a0Var2 = a0.f30746a;
                C6000c c6000c = (C6000c) this.f20833c;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f20832b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var2;
                }
                od.m10798c(obj);
                m1 m1Var = c6000c.f29326c;
                do {
                    value = m1Var.getValue();
                    excludeNumbers = ((C5999b) value).f29323a;
                    AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
                } while (!m1Var.m15397i(value, new C5999b(excludeNumbers, true)));
                v0 v0Var2 = ((q4) c6000c.f29325b.f5669c).f40745e;
                C1772v c1772v2 = new C1772v(i11, c6000c);
                this.f20832b = 1;
                Object objCollect = v0Var2.f39335a.collect(new C0778w(c1772v2, 7), this);
                if (objCollect != EnumC7794a.COROUTINE_SUSPENDED) {
                    objCollect = a0Var2;
                }
                return objCollect == enumC7794a5 ? enumC7794a5 : a0Var2;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f20832b;
                if (i19 == 0) {
                    od.m10798c(obj);
                    this.f20832b = 1;
                    if (c0.m13489l(5000L, this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                ((b1) this.f20833c).m8527g(0);
                return a0.f30746a;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f20832b;
                if (i20 == 0) {
                    od.m10798c(obj);
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        objM11279c2 = obj;
                        return (String) objM11279c2;
                    }
                    od.m10798c(obj);
                    String str2 = (String) obj;
                    if (str2 != null) {
                        return str2;
                    }
                }
                this.f20832b = 2;
                objM11279c2 = AbstractC5722k.m11279c(null, null, this, 3);
                if (objM11279c2 == enumC7794a7) {
                    return enumC7794a7;
                }
                return (String) objM11279c2;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i21 = this.f20832b;
                if (i21 == 0) {
                    od.m10798c(obj);
                    C6293q c6293q = (C6293q) this.f20833c;
                    wx.w0 w0Var = c6293q.f30587h;
                    C0782a c0782a = new C0782a(c6293q, objArr == true ? 1 : 0, 15);
                    this.f20832b = 1;
                    if (c1.m15379j(w0Var, c0782a, this) == enumC7794a8) {
                        return enumC7794a8;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 8:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                int i22 = this.f20832b;
                if (i22 == 0) {
                    od.m10798c(obj);
                    C6295s c6295s = (C6295s) this.f20833c;
                    wx.w0 w0Var2 = c6295s.f30604i;
                    C0782a c0782a2 = new C0782a(c6295s, objArr2 == true ? 1 : 0, i10);
                    this.f20832b = 1;
                    if (c1.m15379j(w0Var2, c0782a2, this) == enumC7794a9) {
                        return enumC7794a9;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 9:
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                int i23 = this.f20832b;
                if (i23 == 0) {
                    od.m10798c(obj);
                    C6296t c6296t = (C6296t) this.f20833c;
                    wx.w0 w0Var3 = c6296t.f30611h;
                    C0782a c0782a3 = new C0782a(c6296t, objArr3 == true ? 1 : 0, 17);
                    this.f20832b = 1;
                    if (c1.m15379j(w0Var3, c0782a3, this) == enumC7794a10) {
                        return enumC7794a10;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 10:
                C6294r c6294r = (C6294r) this.f20833c;
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                int i24 = this.f20832b;
                if (i24 == 0) {
                    od.m10798c(obj);
                    wx.w0 w0Var4 = c6294r.f30595h;
                    C4525k c4525k = new C4525k(c6294r, objArr4 == true ? 1 : 0, i11);
                    this.f20832b = 1;
                    if (c1.m15379j(w0Var4, c4525k, this) == enumC7794a11) {
                        return enumC7794a11;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 11:
                a0 a0Var3 = a0.f30746a;
                EnumC7794a enumC7794a12 = EnumC7794a.COROUTINE_SUSPENDED;
                int i25 = this.f20832b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var3;
                }
                od.m10798c(obj);
                C3328c c3328c = ((C6324e) this.f20833c).f30662b;
                this.f20832b = 1;
                Context context = ((C9000c) c3328c.f17610b).f43353a;
                C7368p.m13783g(context).m13784f("IDEAL_SYNC");
                C7368p.m13783g(context).m13784f("SCHEDULE_HOUR_SYNC");
                Object objM13379a = ((C7105p) c3328c.f17609a).m13379a(EnumC3308j.SIMChange, this);
                if (objM13379a != enumC7794a12) {
                    objM13379a = a0Var3;
                }
                return objM13379a == enumC7794a12 ? enumC7794a12 : a0Var3;
            case 12:
                EnumC7794a enumC7794a13 = EnumC7794a.COROUTINE_SUSPENDED;
                int i26 = this.f20832b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C7392h c7392h = (C7392h) ((C3730f) this.f20833c).f19563b;
                this.f20832b = 1;
                Object objM13797a = c7392h.m13797a(this);
                return objM13797a == enumC7794a13 ? enumC7794a13 : objM13797a;
            case 13:
                EnumC7794a enumC7794a14 = EnumC7794a.COROUTINE_SUSPENDED;
                int i27 = this.f20832b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                h6 h6Var = ((C7352b) this.f20833c).f34988a;
                this.f20832b = 1;
                Object objMo11673a = h6Var.mo11673a(this);
                return objMo11673a == enumC7794a14 ? enumC7794a14 : objMo11673a;
            case 14:
                EnumC7794a enumC7794a15 = EnumC7794a.COROUTINE_SUSPENDED;
                int i28 = this.f20832b;
                if (i28 == 0) {
                    od.m10798c(obj);
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        objM11279c3 = obj;
                        return (String) objM11279c3;
                    }
                    od.m10798c(obj);
                    String str3 = (String) obj;
                    if (str3 != null) {
                        return str3;
                    }
                }
                this.f20832b = 2;
                objM11279c3 = AbstractC5722k.m11279c(null, null, this, 3);
                if (objM11279c3 == enumC7794a15) {
                    return enumC7794a15;
                }
                return (String) objM11279c3;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                EnumC7794a enumC7794a16 = EnumC7794a.COROUTINE_SUSPENDED;
                int i29 = this.f20832b;
                try {
                    if (i29 == 0) {
                        od.m10798c(obj);
                        o4 o4Var = (o4) ((C7439j) this.f20833c).f35537b;
                        this.f20832b = 1;
                        if (o4Var.m15598a(this) == enumC7794a16) {
                            return enumC7794a16;
                        }
                    } else {
                        if (i29 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                    o4 o4Var2 = (o4) ((C7439j) this.f20833c).f35537b;
                    C0165d c0165d = o4Var2.f40674d;
                    C0684o c0684o = new C0684o(i12, o4Var2);
                    C0908c c0908c = c0165d.f513i;
                    synchronized (c0908c) {
                        ((LinkedHashSet) c0908c.f5574b).add(c0684o);
                        c0908c.m2560c();
                    }
                } catch (Exception e2) {
                    ((C8805t) ((C7439j) this.f20833c).f35538c).m16238m(AbstractC0030c.m120k("RemoteConfig not fetch: ", e2), new Exception("Remote config fetch issue"));
                }
                return a0.f30746a;
            case 16:
                EnumC7794a enumC7794a17 = EnumC7794a.COROUTINE_SUSPENDED;
                int i30 = this.f20832b;
                if (i30 == 0) {
                    od.m10798c(obj);
                } else {
                    if (i30 != 1) {
                        if (i30 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        objM11279c4 = obj;
                        return (String) objM11279c4;
                    }
                    od.m10798c(obj);
                    String str4 = (String) obj;
                    if (str4 != null) {
                        return str4;
                    }
                }
                this.f20832b = 2;
                objM11279c4 = AbstractC5722k.m11279c(null, null, this, 3);
                if (objM11279c4 == enumC7794a17) {
                    return enumC7794a17;
                }
                return (String) objM11279c4;
            case 17:
                EnumC7794a enumC7794a18 = EnumC7794a.COROUTINE_SUSPENDED;
                int i31 = this.f20832b;
                if (i31 == 0) {
                    od.m10798c(obj);
                    C8219t c8219t = (C8219t) this.f20833c;
                    this.f20832b = 1;
                    if (c1.m15378i(c8219t, this) == enumC7794a18) {
                        return enumC7794a18;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 18:
                a0 a0Var4 = a0.f30746a;
                EnumC7794a enumC7794a19 = EnumC7794a.COROUTINE_SUSPENDED;
                int i32 = this.f20832b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var4;
                }
                od.m10798c(obj);
                C8847g c8847g = (C8847g) this.f20833c;
                this.f20832b = 1;
                c8847g.getClass();
                Object objM13488k = c0.m13488k(new C8426g((Object) c8847g, (InterfaceC7559c) (objArr5 == true ? 1 : 0), 11), this);
                if (objM13488k != enumC7794a19) {
                    objM13488k = a0Var4;
                }
                return objM13488k == enumC7794a19 ? enumC7794a19 : a0Var4;
            case 19:
                a0 a0Var5 = a0.f30746a;
                EnumC7794a enumC7794a20 = EnumC7794a.COROUTINE_SUSPENDED;
                int i33 = this.f20832b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var5;
                }
                od.m10798c(obj);
                w0 w0Var5 = (w0) this.f20833c;
                this.f20832b = 1;
                w0Var5.getClass();
                Object objCollect2 = w0Var5.f39730a.mo6892c().collect(new C0462b(12, new e0(), w0Var5), this);
                if (objCollect2 != enumC7794a20) {
                    objCollect2 = a0Var5;
                }
                return objCollect2 == enumC7794a20 ? enumC7794a20 : a0Var5;
            case 20:
                C8339j c8339j = (C8339j) this.f20833c;
                EnumC7794a enumC7794a21 = EnumC7794a.COROUTINE_SUSPENDED;
                int i34 = this.f20832b;
                if (i34 == 0) {
                    od.m10798c(obj);
                    C2222e c2222eM8522y = C3953b.m8522y(new C6158d(i10, c8339j));
                    C7351a c7351a = new C7351a(c8339j, objArr6 == true ? 1 : 0, 19);
                    int i35 = j0.f39242a;
                    C8506l c8506l = new C8506l(new fk.b1(c7351a, null), c2222eM8522y, C7565i.f36440a, -2, EnumC7799a.SUSPEND);
                    C3288l c3288l = new C3288l(i12, c8339j);
                    this.f20832b = 1;
                    if (c8506l.collect(c3288l, this) == enumC7794a21) {
                        return enumC7794a21;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 21:
                EnumC7794a enumC7794a22 = EnumC7794a.COROUTINE_SUSPENDED;
                int i36 = this.f20832b;
                if (i36 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = x1.f40987l;
                    InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f20833c;
                    this.f20832b = 1;
                    if (c7806h.mo14775g(interfaceC3307i, this) == enumC7794a22) {
                        return enumC7794a22;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 22:
                EnumC7794a enumC7794a23 = EnumC7794a.COROUTINE_SUSPENDED;
                int i37 = this.f20832b;
                if (i37 == 0) {
                    od.m10798c(obj);
                    wx.b1 b1Var = x1.f40988m;
                    t1 t1Var = (t1) this.f20833c;
                    this.f20832b = 1;
                    if (b1Var.emit(t1Var, this) == enumC7794a23) {
                        return enumC7794a23;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 23:
                EnumC7794a enumC7794a24 = EnumC7794a.COROUTINE_SUSPENDED;
                int i38 = this.f20832b;
                if (i38 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h2 = l2.f40528f;
                    z1 z1Var = (z1) this.f20833c;
                    this.f20832b = 1;
                    if (c7806h2.mo14775g(z1Var, this) == enumC7794a24) {
                        return enumC7794a24;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 24:
                EnumC7794a enumC7794a25 = EnumC7794a.COROUTINE_SUSPENDED;
                int i39 = this.f20832b;
                if (i39 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h3 = w2.f40960b;
                    Integer num = new Integer(((List) this.f20833c).size());
                    this.f20832b = 1;
                    if (c7806h3.mo14775g(num, this) == enumC7794a25) {
                        return enumC7794a25;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 25:
                q4 q4Var = (q4) this.f20833c;
                EnumC7794a enumC7794a26 = EnumC7794a.COROUTINE_SUSPENDED;
                int i40 = this.f20832b;
                try {
                    if (i40 == 0) {
                        od.m10798c(obj);
                        C2336i c2336i = q4Var.f40742b;
                        this.f20832b = 1;
                        objM6023c = c2336i.m6023c(this);
                        if (objM6023c == enumC7794a26) {
                            return enumC7794a26;
                        }
                    } else {
                        if (i40 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        objM6023c = obj;
                    }
                    ArrayList arrayList = (ArrayList) objM6023c;
                    m1 m1Var2 = q4Var.f40751k;
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C2074g.m5791a((C2074g) value2, null, false, false, arrayList, 7)));
                } catch (Exception e10) {
                    q4Var.f40741a.m16234i("SessionConfigurationRepository", e10);
                }
                return a0.f30746a;
            case 26:
                EnumC7794a enumC7794a27 = EnumC7794a.COROUTINE_SUSPENDED;
                int i41 = this.f20832b;
                if (i41 == 0) {
                    od.m10798c(obj);
                    this.f20832b = 1;
                    if (c0.m13489l(1000L, this) == enumC7794a27) {
                        return enumC7794a27;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                ((k2.w0) this.f20833c).setValue(Boolean.FALSE);
                return a0.f30746a;
            case 27:
                EnumC7794a enumC7794a28 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((C8716n) this.f20833c).f42145c.m12019a(this.f20832b);
                return a0.f30746a;
            case 28:
                C8774f c8774f = (C8774f) this.f20833c;
                EnumC7794a enumC7794a29 = EnumC7794a.COROUTINE_SUSPENDED;
                int i42 = this.f20832b;
                if (i42 == 0) {
                    od.m10798c(obj);
                    C0914i c0914i = c8774f.f42410b;
                    this.f20832b = 1;
                    objM2628h = c0914i.m2628h(this);
                    if (objM2628h == enumC7794a29) {
                        return enumC7794a29;
                    }
                } else {
                    if (i42 != 1) {
                        if (i42 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                    objM2628h = obj;
                }
                C8426g c8426g = new C8426g((Object) c8774f, (InterfaceC7559c) (objArr7 == true ? 1 : 0), i11);
                this.f20832b = 2;
                if (c1.m15379j((InterfaceC8209j) objM2628h, c8426g, this) == enumC7794a29) {
                    return enumC7794a29;
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a30 = EnumC7794a.COROUTINE_SUSPENDED;
                int i43 = this.f20832b;
                if (i43 == 0) {
                    od.m10798c(obj);
                    n0 n0Var = (n0) this.f20833c;
                    this.f20832b = 1;
                    if (n0Var.m16382f(this) == enumC7794a30) {
                        return enumC7794a30;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4032f(C8716n c8716n, int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20831a = 27;
        this.f20833c = c8716n;
        this.f20832b = i10;
    }
}
