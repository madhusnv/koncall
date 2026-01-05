package o6;

import a2.AbstractC0030c;
import a3.C0043b;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b00.InterfaceC0527l;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.request.FCMUpdateRequest;
import com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest;
import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import d9.C1673r;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import hn.C2987d;
import im.f1;
import im.g1;
import im.h1;
import im.i1;
import im.j1;
import im.p1;
import j$.time.LocalDateTime;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jp.C3834o;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import mm.C4802m;
import og.od;
import om.C5415q;
import org.bouncycastle.iana.AEADAlgorithm;
import pc.C5894v;
import pp.C5995k;
import q1.C6097y;
import qp.C6273j;
import qw.C6361k;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import t8.AbstractC7076v;
import tt.C7224g;
import tx.InterfaceC7266z;
import u1.C7303e;
import u7.C7352b;
import u8.C7378z;
import ut.C7546j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ws.AbstractC8175p;
import ws.C8169j;
import ws.C8176q;
import ws.C8181v;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.m1;
import x4.C8299i;
import xm.q4;
import xm.x1;
import xm.y5;
import xs.C8449k;
import ym.InterfaceC8690a;
import yt.C8770b;
import yv.C8791f;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f26148a;

    /* renamed from: b */
    public int f26149b;

    /* renamed from: c */
    public Object f26150c;

    /* renamed from: d */
    public Object f26151d;

    /* renamed from: e */
    public final /* synthetic */ Object f26152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i10, Object obj, Object obj2, InterfaceC7559c interfaceC7559c, boolean z6) {
        super(2, interfaceC7559c);
        this.f26148a = i10;
        this.f26150c = obj;
        this.f26152e = obj2;
    }

    /* renamed from: d */
    private final Object m10453d(Object obj) {
        List list;
        NotesSyncRequest notesSyncRequest = (NotesSyncRequest) this.f26152e;
        x1 x1Var = (x1) this.f26151d;
        C8805t c8805t = x1Var.f41000j;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f26149b;
        if (i10 == 0) {
            od.m10798c(obj);
            C2987d c2987d = x1Var.f40993c;
            this.f26149b = 1;
            obj = c2987d.f16127a.m16055I(notesSyncRequest.m321I(), notesSyncRequest, this);
            if (obj != enumC7794a) {
            }
            return enumC7794a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.f26150c;
            od.m10798c(obj);
            return new i1(list);
        }
        od.m10798c(obj);
        f1 f1Var = (f1) obj;
        if (f1Var instanceof im.o0) {
            im.o0 o0Var = (im.o0) f1Var;
            c8805t.m16232g("CallLogNote", "Unknown API exception := " + o0Var.m7642b() + " >>> " + o0Var.f17571a);
            return new g1(f1Var);
        }
        if (f1Var instanceof im.p0) {
            c8805t.m16232g("CallLogNote", "Authentication error caught " + ((im.p0) f1Var).f17574a);
            return new h1("API Failed with auth error");
        }
        if (f1Var instanceof im.t0) {
            c8805t.m16232g("CallLogNote", "Device Delete caught in API := " + ((im.t0) f1Var).f17582a);
            return new g1(f1Var);
        }
        if (f1Var instanceof im.y0) {
            c8805t.m16232g("CallLogNote", "Network error caught");
            return new g1(f1Var);
        }
        if (f1Var instanceof im.z0) {
            c8805t.m16232g("CallLogNote", "Request body is wrong >>> requestBody:= " + notesSyncRequest);
            return new g1(f1Var);
        }
        if (f1Var instanceof im.b1) {
            return new g1(f1Var);
        }
        if (f1Var instanceof im.c1) {
            c8805t.m16232g("CallLogNote", "Subscription expired >>> response := " + ((im.c1) f1Var).f17542a + " >>> userSim:- " + notesSyncRequest.f7359b);
            return new g1(f1Var);
        }
        if (!(f1Var instanceof im.d1)) {
            c8805t.m16232g("CallLogNote", "something wrong happen >>> restExceptionTpe := " + f1Var.m7640a());
            return new g1(f1Var);
        }
        Object obj2 = ((im.d1) f1Var).f17545a;
        List list2 = (List) ((BaseResponse) obj2).m4732a();
        if (list2 == null) {
            return new h1(AbstractC0030c.m118i(obj2, "API success but response is null >>> "));
        }
        if (list2.isEmpty()) {
            return j1.f17563a;
        }
        this.f26150c = list2;
        this.f26149b = 2;
        if (x1.m15645e(x1Var, list2, notesSyncRequest, this) != enumC7794a) {
            list = list2;
            return new i1(list);
        }
        return enumC7794a;
    }

    /* renamed from: e */
    private final Object m10454e(Object obj) {
        C4802m c4802m = (C4802m) this.f26152e;
        String str = (String) this.f26151d;
        xm.b0 b0Var = (xm.b0) this.f26150c;
        C8805t c8805t = (C8805t) b0Var.f40149c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f26149b;
        if (i10 == 0) {
            od.m10798c(obj);
            C2987d c2987d = (C2987d) b0Var.f40150d;
            int length = str.length() - 1;
            int i11 = 0;
            boolean z6 = false;
            while (i11 <= length) {
                boolean z10 = AbstractC4154l.m8924g(str.charAt(!z6 ? i11 : length), 32) <= 0;
                if (z6) {
                    if (!z10) {
                        break;
                    }
                    length--;
                } else if (z10) {
                    i11++;
                } else {
                    z6 = true;
                }
            }
            String string = str.subSequence(i11, length + 1).toString();
            String str2 = c4802m.f23894f;
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            FCMUpdateRequest fCMUpdateRequest = new FCMUpdateRequest(string, str2, c4802m);
            this.f26149b = 1;
            InterfaceC8690a interfaceC8690a = c2987d.f16127a;
            LinkedHashMap linkedHashMapM321I = fCMUpdateRequest.m321I();
            LinkedHashMap linkedHashMapM12779g = AbstractC6674x.m12779g(new C6361k("fcmId", fCMUpdateRequest.m4657N()));
            C8791f c8791f = C8791f.f42457a;
            if (C8791f.m16171d(fCMUpdateRequest.m4658O())) {
                String strM4658O = fCMUpdateRequest.m4658O();
                AbstractC4154l.m8920c(strM4658O);
                linkedHashMapM12779g.putIfAbsent("uniqueSimId", strM4658O);
            }
            obj = interfaceC8690a.m16063Q(linkedHashMapM321I, linkedHashMapM12779g, this);
            if (obj == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        f1 f1Var = (f1) obj;
        if (f1Var instanceof im.d1) {
            AbstractC1452a.m4579z("updateFCMTokenOnRemote: Success - ", str, c8805t);
            return Boolean.valueOf(((BaseResponse) ((im.d1) f1Var).f17545a).m4733b() == -1);
        }
        c8805t.m16231f("updateFCMTokenOnRemote: >>> Error >>> " + f1Var);
        return Boolean.FALSE;
    }

    /* renamed from: g */
    private final Object m10455g(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f26149b;
        if (i10 == 0) {
            od.m10798c(obj);
            if (((C6273j) this.f26150c).f30465v) {
                C6097y c6097y = (C6097y) this.f26151d;
                this.f26149b = 1;
                if (C6097y.m12132j(c6097y, 0, this) == enumC7794a) {
                    return enumC7794a;
                }
            }
            return qw.a0.f30746a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        ((InterfaceC2139c) this.f26152e).invoke(C3834o.f19788a);
        return qw.a0.f30746a;
    }

    /* renamed from: h */
    private final Object m10456h(Object obj) {
        List listD0;
        Object objM9141u;
        List list;
        int iIntValue;
        m1 m1Var;
        Object value;
        C8449k c8449k = (C8449k) this.f26151d;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f26149b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8176q c8176q = ((C8181v) c8449k.f41224n.f39340a.getValue()).f39116b;
            Integer num = c8176q != null ? new Integer(c8176q.f39099a) : null;
            List list2 = ((C8181v) c8449k.f41224n.f39340a.getValue()).f39119e;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                int i11 = ((C8176q) obj2).f39099a;
                if (num == null || i11 != num.intValue()) {
                    arrayList.add(obj2);
                }
            }
            listD0 = AbstractC6663m.d0(arrayList);
            C4367l c4367l = c8449k.f41212b;
            int i12 = ((C8169j) ((AbstractC8175p) this.f26152e)).f39092a;
            this.f26150c = listD0;
            this.f26149b = 1;
            if (c4367l.m9132k(i12, this) != enumC7794a) {
            }
            return enumC7794a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = (List) this.f26150c;
            od.m10798c(obj);
            objM9141u = obj;
            list = list3;
            iIntValue = ((Number) objM9141u).intValue();
            m1Var = c8449k.f41223m;
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C8181v.m15340a((C8181v) value, null, null, null, false, list, iIntValue, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194111)));
            return qw.a0.f30746a;
        }
        listD0 = (List) this.f26150c;
        od.m10798c(obj);
        C4367l c4367l2 = c8449k.f41212b;
        this.f26150c = listD0;
        this.f26149b = 2;
        objM9141u = c4367l2.m9141u(this);
        if (objM9141u != enumC7794a) {
            list = listD0;
            iIntValue = ((Number) objM9141u).intValue();
            m1Var = c8449k.f41223m;
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C8181v.m15340a((C8181v) value, null, null, null, false, list, iIntValue, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194111)));
            return qw.a0.f30746a;
        }
        return enumC7794a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ex.f, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f26148a) {
            case 0:
                s0 s0Var = new s0((File) this.f26152e, interfaceC7559c, 0);
                s0Var.f26151d = obj;
                return s0Var;
            case 1:
                return new s0((InterfaceC2139c) this.f26150c, (InterfaceC8209j) this.f26151d, (l7.a0) this.f26152e, interfaceC7559c, 1);
            case 2:
                return new s0((C6097y) this.f26150c, (InterfaceC7266z) this.f26151d, (C5995k) this.f26152e, interfaceC7559c, 2);
            case 3:
                return new s0((InterfaceC0527l) this.f26151d, (C5894v) this.f26152e, interfaceC7559c, 3);
            case 4:
                return new s0((ss.z0) this.f26150c, (l7.a0) this.f26151d, (Context) this.f26152e, interfaceC7559c, 4);
            case 5:
                s0 s0Var2 = new s0(5, this.f26150c, this.f26152e, interfaceC7559c, false);
                s0Var2.f26151d = obj;
                return s0Var2;
            case 6:
                s0 s0Var3 = new s0(6, this.f26150c, this.f26152e, interfaceC7559c, false);
                s0Var3.f26151d = obj;
                return s0Var3;
            case 7:
                s0 s0Var4 = new s0(7, this.f26150c, this.f26152e, interfaceC7559c, false);
                s0Var4.f26151d = obj;
                return s0Var4;
            case 8:
                s0 s0Var5 = new s0((InterfaceC2141e) this.f26150c, (C8299i) this.f26152e, interfaceC7559c);
                s0Var5.f26151d = obj;
                return s0Var5;
            case 9:
                return new s0((C7224g) this.f26150c, (String) this.f26151d, (String) this.f26152e, interfaceC7559c, 9);
            case 10:
                return new s0((C7303e) this.f26150c, (v3.h1) this.f26151d, (C0043b) this.f26152e, interfaceC7559c, 10);
            case 11:
                return new s0((C7352b) this.f26150c, (Uri) this.f26151d, (InputEvent) this.f26152e, interfaceC7559c, 11);
            case 12:
                return new s0((C7378z) this.f26150c, (AbstractC7076v) this.f26151d, (C1673r) this.f26152e, interfaceC7559c, 12);
            case 13:
                s0 s0Var6 = new s0((C7546j) this.f26152e, interfaceC7559c, 13);
                s0Var6.f26151d = obj;
                return s0Var6;
            case 14:
                s0 s0Var7 = new s0(14, this.f26150c, this.f26152e, interfaceC7559c, false);
                s0Var7.f26151d = obj;
                return s0Var7;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new s0((C6097y) this.f26150c, (C8449k) this.f26151d, (k2.w0) this.f26152e, interfaceC7559c, 15);
            case 16:
                s0 s0Var8 = new s0(16, this.f26150c, this.f26152e, interfaceC7559c, false);
                s0Var8.f26151d = obj;
                return s0Var8;
            case 17:
                return new s0((C7806h) this.f26152e, interfaceC7559c, 17);
            case 18:
                s0 s0Var9 = new s0((InterfaceC8209j) this.f26150c, (InterfaceC2142f) this.f26152e, interfaceC7559c);
                s0Var9.f26151d = obj;
                return s0Var9;
            case 19:
                return new s0((k2.w0) this.f26151d, (b2.y0) this.f26152e, interfaceC7559c, 19);
            case 20:
                return new s0((x1) this.f26150c, (String) this.f26151d, (LocalDateTime) this.f26152e, interfaceC7559c, 20);
            case 21:
                return new s0((x1) this.f26150c, (String) this.f26151d, (String) this.f26152e, interfaceC7559c, 21);
            case 22:
                return new s0((List) this.f26151d, (x1) this.f26152e, interfaceC7559c, 22);
            case 23:
                return new s0((x1) this.f26151d, (NotesSyncRequest) this.f26152e, interfaceC7559c, 23);
            case 24:
                return new s0((xm.b0) this.f26150c, (String) this.f26151d, (C4802m) this.f26152e, interfaceC7559c, 24);
            case 25:
                return new s0((C5415q) this.f26150c, (q4) this.f26151d, (p1) this.f26152e, interfaceC7559c, 25);
            case 26:
                return new s0((y5) this.f26152e, interfaceC7559c, 26);
            case 27:
                return new s0((C6273j) this.f26150c, (C6097y) this.f26151d, (InterfaceC2139c) this.f26152e, interfaceC7559c, 27);
            case 28:
                return new s0((C8449k) this.f26151d, (AbstractC8175p) this.f26152e, interfaceC7559c, 28);
            default:
                return new s0((C8770b) this.f26150c, (Context) this.f26151d, (InterfaceC2137a) this.f26152e, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26148a) {
        }
        return ((s0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d5 A[Catch: all -> 0x02a8, TryCatch #7 {all -> 0x02a8, blocks: (B:148:0x02a2, B:159:0x02cd, B:161:0x02d5, B:162:0x02e2, B:169:0x02f2, B:156:0x02c0, B:171:0x02f5, B:173:0x02fa, B:174:0x02fb, B:155:0x02bb, B:163:0x02e3, B:165:0x02e9), top: B:554:0x0296, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:586:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:591:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:619:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v189 */
    /* JADX WARN: Type inference failed for: r2v190 */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v66, types: [vx.w] */
    /* JADX WARN: Type inference failed for: r3v68, types: [vx.h] */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v70, types: [vx.w] */
    /* JADX WARN: Type inference failed for: r4v35, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r4v67, types: [ex.f, ww.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x02ca -> B:159:0x02cd). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r62) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(InterfaceC2141e interfaceC2141e, C8299i c8299i, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f26148a = 8;
        this.f26150c = (AbstractC8199i) interfaceC2141e;
        this.f26152e = c8299i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f26148a = i10;
        this.f26150c = obj;
        this.f26151d = obj2;
        this.f26152e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f26148a = i10;
        this.f26151d = obj;
        this.f26152e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f26148a = i10;
        this.f26152e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(InterfaceC8209j interfaceC8209j, InterfaceC2142f interfaceC2142f, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f26148a = 18;
        this.f26150c = interfaceC8209j;
        this.f26152e = (AbstractC8199i) interfaceC2142f;
    }
}
