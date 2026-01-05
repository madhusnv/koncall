package bu;

import al.C0182j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import c9.C0922q;
import cj.C0979e;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import cu.C1504b;
import dr.C1770t;
import dt.C1795a;
import dt.C1804j;
import du.C1822d;
import du.C1824f;
import en.C2073f;
import ep.C2084b;
import ep.C2088f;
import eq.C2100l;
import ex.InterfaceC2141e;
import f9.AbstractC2224g;
import fs.C2371b;
import fu.C2375c;
import gs.C2724j;
import hu.C3035a;
import i0.m0;
import ik.C3284h;
import ix.AbstractC3363d;
import j$.time.LocalDateTime;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import ku.C4243a;
import ku.C4246d;
import lu.C4525k;
import mm.C4802m;
import nt.C5137a;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import os.C5731i;
import pg.y8;
import pt.C6032f;
import qr.C6293q;
import qr.C6295s;
import qr.C6296t;
import qu.C6324e;
import qw.a0;
import rn.q0;
import rt.C6618b;
import rv.v0;
import sp.C6879b;
import sp.C6883f;
import sv.C6953a;
import t8.C7077w;
import tt.C7224g;
import tv.C7230d;
import tx.InterfaceC7266z;
import tx.c0;
import u7.C7351a;
import up.C7489b;
import up.C7494g;
import ur.C7530w;
import ur.C7531x;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wc.AbstractC7984r;
import wc.e0;
import wo.C8134s;
import wp.C8136b;
import wp.C8141g;
import ww.AbstractC8199i;
import wx.m1;
import wx.w0;
import xm.q4;
import y8.AbstractC8594c;
import yv.C8801p;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bu.a */
/* loaded from: classes3.dex */
public final class C0782a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4957a;

    /* renamed from: b */
    public final /* synthetic */ Object f4958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0782a(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4957a = i10;
        this.f4958b = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4957a) {
            case 0:
                return new C0782a((C1504b) this.f4958b, interfaceC7559c, 0);
            case 1:
                return new C0782a((C1804j) this.f4958b, interfaceC7559c, 1);
            case 2:
                return new C0782a((C2088f) this.f4958b, interfaceC7559c, 2);
            case 3:
                return new C0782a((C2100l) this.f4958b, interfaceC7559c, 3);
            case 4:
                return new C0782a((C2375c) this.f4958b, interfaceC7559c, 4);
            case 5:
                return new C0782a((C0922q) this.f4958b, interfaceC7559c, 5);
            case 6:
                return new C0782a((C2724j) this.f4958b, interfaceC7559c, 6);
            case 7:
                return new C0782a((C3035a) this.f4958b, interfaceC7559c, 7);
            case 8:
                return new C0782a((PhoneStateReceiver) this.f4958b, interfaceC7559c, 8);
            case 9:
                return new C0782a((Process) this.f4958b, interfaceC7559c, 9);
            case 10:
                return new C0782a((C3284h) this.f4958b, interfaceC7559c, 10);
            case 11:
                return new C0782a((C4246d) this.f4958b, interfaceC7559c, 11);
            case 12:
                return new C0782a((C4802m) this.f4958b, interfaceC7559c, 12);
            case 13:
                return new C0782a((C5731i) this.f4958b, interfaceC7559c, 13);
            case 14:
                return new C0782a((C6032f) this.f4958b, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C0782a((C6293q) this.f4958b, interfaceC7559c, 15);
            case 16:
                return new C0782a((C6295s) this.f4958b, interfaceC7559c, 16);
            case 17:
                return new C0782a((C6296t) this.f4958b, interfaceC7559c, 17);
            case 18:
                return new C0782a((C6324e) this.f4958b, interfaceC7559c, 18);
            case 19:
                return new C0782a((q0) this.f4958b, interfaceC7559c, 19);
            case 20:
                return new C0782a((C0182j) this.f4958b, interfaceC7559c, 20);
            case 21:
                return new C0782a((v0) this.f4958b, interfaceC7559c, 21);
            case 22:
                return new C0782a((C6883f) this.f4958b, interfaceC7559c, 22);
            case 23:
                return new C0782a((C7224g) this.f4958b, interfaceC7559c, 23);
            case 24:
                return new C0782a((C7230d) this.f4958b, interfaceC7559c, 24);
            case 25:
                return new C0782a((C7494g) this.f4958b, interfaceC7559c, 25);
            case 26:
                return new C0782a((e0) this.f4958b, interfaceC7559c, 26);
            case 27:
                return new C0782a((C8134s) this.f4958b, interfaceC7559c, 27);
            case 28:
                return new C0782a((C8141g) this.f4958b, interfaceC7559c, 28);
            default:
                return new C0782a((q4) this.f4958b, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException, IOException {
        switch (this.f4957a) {
            case 0:
                C0782a c0782a = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c0782a.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C0782a c0782a2 = (C0782a) create((String) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c0782a2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                C0782a c0782a3 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c0782a3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                C0782a c0782a4 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c0782a4.invokeSuspend(a0Var4);
                return a0Var4;
            case 4:
                C0782a c0782a5 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var5 = a0.f30746a;
                c0782a5.invokeSuspend(a0Var5);
                return a0Var5;
            case 5:
                C0782a c0782a6 = (C0782a) create((AbstractC8594c) obj, (InterfaceC7559c) obj2);
                a0 a0Var6 = a0.f30746a;
                c0782a6.invokeSuspend(a0Var6);
                return a0Var6;
            case 6:
                C0782a c0782a7 = (C0782a) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var7 = a0.f30746a;
                c0782a7.invokeSuspend(a0Var7);
                return a0Var7;
            case 7:
                C0782a c0782a8 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var8 = a0.f30746a;
                c0782a8.invokeSuspend(a0Var8);
                return a0Var8;
            case 8:
                C0782a c0782a9 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var9 = a0.f30746a;
                c0782a9.invokeSuspend(a0Var9);
                return a0Var9;
            case 9:
                return ((C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 10:
                return ((C0782a) create((C3284h) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 11:
                C0782a c0782a10 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var10 = a0.f30746a;
                c0782a10.invokeSuspend(a0Var10);
                return a0Var10;
            case 12:
                return ((C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 13:
                C0782a c0782a11 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var11 = a0.f30746a;
                c0782a11.invokeSuspend(a0Var11);
                return a0Var11;
            case 14:
                C0782a c0782a12 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var12 = a0.f30746a;
                c0782a12.invokeSuspend(a0Var12);
                return a0Var12;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0782a c0782a13 = (C0782a) create((C7531x) obj, (InterfaceC7559c) obj2);
                a0 a0Var13 = a0.f30746a;
                c0782a13.invokeSuspend(a0Var13);
                return a0Var13;
            case 16:
                C0782a c0782a14 = (C0782a) create((C7530w) obj, (InterfaceC7559c) obj2);
                a0 a0Var14 = a0.f30746a;
                c0782a14.invokeSuspend(a0Var14);
                return a0Var14;
            case 17:
                C0782a c0782a15 = (C0782a) create((C7530w) obj, (InterfaceC7559c) obj2);
                a0 a0Var15 = a0.f30746a;
                c0782a15.invokeSuspend(a0Var15);
                return a0Var15;
            case 18:
                C0782a c0782a16 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var16 = a0.f30746a;
                c0782a16.invokeSuspend(a0Var16);
                return a0Var16;
            case 19:
                C0782a c0782a17 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var17 = a0.f30746a;
                c0782a17.invokeSuspend(a0Var17);
                return a0Var17;
            case 20:
                C0782a c0782a18 = (C0782a) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var18 = a0.f30746a;
                c0782a18.invokeSuspend(a0Var18);
                return a0Var18;
            case 21:
                C0782a c0782a19 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var19 = a0.f30746a;
                c0782a19.invokeSuspend(a0Var19);
                return a0Var19;
            case 22:
                C0782a c0782a20 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var20 = a0.f30746a;
                c0782a20.invokeSuspend(a0Var20);
                return a0Var20;
            case 23:
                C0782a c0782a21 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var21 = a0.f30746a;
                c0782a21.invokeSuspend(a0Var21);
                return a0Var21;
            case 24:
                C0782a c0782a22 = (C0782a) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var22 = a0.f30746a;
                c0782a22.invokeSuspend(a0Var22);
                return a0Var22;
            case 25:
                C0782a c0782a23 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var23 = a0.f30746a;
                c0782a23.invokeSuspend(a0Var23);
                return a0Var23;
            case 26:
                return ((C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 27:
                C0782a c0782a24 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var24 = a0.f30746a;
                c0782a24.invokeSuspend(a0Var24);
                return a0Var24;
            case 28:
                C0782a c0782a25 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var25 = a0.f30746a;
                c0782a25.invokeSuspend(a0Var25);
                return a0Var25;
            default:
                C0782a c0782a26 = (C0782a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var26 = a0.f30746a;
                c0782a26.invokeSuspend(a0Var26);
                return a0Var26;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException, IOException {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        int i10 = this.f4957a;
        int i11 = 14;
        int i12 = 2;
        InterfaceC7559c interfaceC7559c = null;
        int i13 = 3;
        a0 a0Var = a0.f30746a;
        Object obj2 = this.f4958b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((C1504b) obj2).m5060e(C1822d.f8799a);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C1804j c1804j = (C1804j) obj2;
                c0.m13502y(c1804j.f8731e, null, null, new C1795a(c1804j, interfaceC7559c, i13), 3);
                return a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2088f c2088f = (C2088f) obj2;
                c0.m13502y(c2088f.f9767j, null, null, new C2084b(c2088f, interfaceC7559c, i12), 3);
                return a0Var;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2100l.m5802i((C2100l) obj2);
                return a0Var;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2375c c2375c = (C2375c) obj2;
                c0.m13502y(c2375c.f10810d, null, null, new C1770t(c2375c, interfaceC7559c, 15), 3);
                return a0Var;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int i14 = AbstractC2224g.f10210a;
                C7077w c7077wM13371a = C7077w.m13371a();
                Objects.toString((C0922q) obj2);
                c7077wM13371a.getClass();
                return a0Var;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2724j c2724j = (C2724j) obj2;
                m1 m1Var = c2724j.f15198g;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C2371b.m6058a((C2371b) value, false, null, null, null, null, null, ((C8801p) c2724j.f15194c.f39340a.getValue()).f42464a, false, null, null, 3967)));
                return a0Var;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((C3035a) obj2).m7275e(C1824f.f8801a);
                return a0Var;
            case 8:
                PhoneStateReceiver phoneStateReceiver = (PhoneStateReceiver) obj2;
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                try {
                    PhoneStateReceiver.m4593c(phoneStateReceiver, phoneStateReceiver.f7285e);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    phoneStateReceiver.m4606p().m16235j(e2);
                }
                return a0Var;
            case 9:
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((Process) obj2).waitFor());
            case 10:
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return (C3284h) obj2;
            case 11:
                EnumC7794a enumC7794a12 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((C4246d) obj2).m8979e(C4243a.f21564a);
                return a0Var;
            case 12:
                EnumC7794a enumC7794a13 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                LocalDateTime localDateTimeNow = LocalDateTime.now();
                AbstractC4154l.m8922e(localDateTimeNow, "now(...)");
                return Boolean.valueOf(((C4802m) obj2).m9756d(localDateTimeNow));
            case 13:
                EnumC7794a enumC7794a14 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = ((C5731i) obj2).f28250h;
                AbstractC5601a.m11254y(context, R.string.subscription_expired, "getString(...)", context);
                return a0Var;
            case 14:
                EnumC7794a enumC7794a15 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6032f c6032f = (C6032f) obj2;
                w0 w0Var = c6032f.f29479j;
                if (((C5137a) w0Var.f39340a.getValue()).f25153c.isEmpty()) {
                    C0979e c0979e = c6032f.f29472c;
                    String phoneNumber = m0.m7379l(((C5137a) w0Var.f39340a.getValue()).f25162l, " ", ((C5137a) w0Var.f39340a.getValue()).f25161k);
                    String str = ((C5137a) w0Var.f39340a.getValue()).f25159i;
                    Context context2 = (Context) c0979e.f5807f;
                    AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + PhoneNumberUtils.stripSeparators(phoneNumber) + "&text=" + Uri.encode(str)));
                        intent.addFlags(268435456);
                        if (intent.resolveActivity(context2.getPackageManager()) != null) {
                            context2.startActivity(intent);
                        } else {
                            y8.m11949d(context2, R.string.something_went_wrong_Please_try_again);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        ((C8805t) c0979e.f5808g).m16234i("WhatsApp Redirection Exception", e10);
                    }
                    m1 m1Var2 = c6032f.f29478i;
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C5137a.m10057a((C5137a) value2, null, null, null, false, false, null, null, null, false, null, null, false, false, null, false, null, 1046527)));
                }
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                EnumC7794a enumC7794a16 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6293q c6293q = (C6293q) obj2;
                m1 m1Var3 = c6293q.f30588i;
                do {
                    value3 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value3, (C7531x) c6293q.f30587h.f39340a.getValue()));
                return a0Var;
            case 16:
                EnumC7794a enumC7794a17 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6295s c6295s = (C6295s) obj2;
                m1 m1Var4 = c6295s.f30605j;
                do {
                    value4 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value4, (C7530w) c6295s.f30604i.f39340a.getValue()));
                return a0Var;
            case 17:
                EnumC7794a enumC7794a18 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6296t c6296t = (C6296t) obj2;
                m1 m1Var5 = c6296t.f30612i;
                do {
                    value5 = m1Var5.getValue();
                } while (!m1Var5.m15397i(value5, (C7530w) c6296t.f30611h.f39340a.getValue()));
                return a0Var;
            case 18:
                C6324e c6324e = (C6324e) obj2;
                EnumC7794a enumC7794a19 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                try {
                    Context context3 = c6324e.f30663c;
                    Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + c6324e.f30663c.getPackageName()));
                    intent2.setFlags(268435456);
                    context3.startActivity(intent2);
                } catch (Exception e11) {
                    c6324e.f30664d.m16233h("TroubleshootingRunViewModel", "openOverlaySetting failed: " + e11.getMessage(), e11);
                }
                return a0Var;
            case 19:
                EnumC7794a enumC7794a20 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context4 = ((q0) obj2).f31631a;
                AbstractC5601a.m11254y(context4, R.string.find_recording_already_running, "getString(...)", context4);
                return a0Var;
            case 20:
                EnumC7794a enumC7794a21 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C0182j c0182j = (C0182j) obj2;
                if (!c0182j.f554a) {
                    c0.m13502y((C8810d) c0182j.f555b, null, null, new ps.c0(c0182j, interfaceC7559c, i11), 3);
                }
                return a0Var;
            case 21:
                EnumC7794a enumC7794a22 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                v0 v0Var = (v0) obj2;
                Context context5 = v0Var.f31915b;
                AbstractC4154l.m8923f(context5, "context");
                String[] stringArray = context5.getResources().getStringArray(R.array.fact_message_array);
                AbstractC4154l.m8922e(stringArray, "getStringArray(...)");
                c0.m13502y(d7.q0.m5340g(v0Var), null, null, new C4525k(v0Var, stringArray[AbstractC3363d.f17771a.m7677d(stringArray.length)], interfaceC7559c, 16), 3);
                return a0Var;
            case 22:
                EnumC7794a enumC7794a23 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6883f c6883f = (C6883f) obj2;
                c0.m13502y(c6883f.f32715j, null, null, new C6879b(c6883f, interfaceC7559c, i12), 3);
                return a0Var;
            case 23:
                EnumC7794a enumC7794a24 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C7224g c7224g = (C7224g) obj2;
                m1 m1Var6 = c7224g.f34547g;
                do {
                    value6 = m1Var6.getValue();
                } while (!m1Var6.m15397i(value6, C6618b.m12669a((C6618b) value6, null, null, "", null, null, null, null, false, false, null, 0, 0, null, null, null, null, false, 262139)));
                m1 m1Var7 = c7224g.f34549i;
                do {
                    value7 = m1Var7.getValue();
                } while (!m1Var7.m15397i(value7, ""));
                return a0Var;
            case 24:
                EnumC7794a enumC7794a25 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C7230d c7230d = (C7230d) obj2;
                m1 m1Var8 = c7230d.f34577i;
                do {
                    value8 = m1Var8.getValue();
                } while (!m1Var8.m15397i(value8, C6953a.m13205a((C6953a) value8, null, false, null, null, false, ((C8801p) c7230d.f34574f.f39340a.getValue()).f42464a, false, null, 223)));
                return a0Var;
            case 25:
                EnumC7794a enumC7794a26 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C7494g c7494g = (C7494g) obj2;
                c0.m13502y(c7494g.f36177j, null, null, new C7489b(c7494g, interfaceC7559c, i12), 3);
                return a0Var;
            case 26:
                EnumC7794a enumC7794a27 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                e0 e0Var = (e0) obj2;
                try {
                    byte[] bArrMo15148v = AbstractC7984r.m15159c(e0Var).mo15148v();
                    e0Var.close();
                    return bArrMo15148v;
                } finally {
                }
            case 27:
                EnumC7794a enumC7794a28 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C8134s c8134s = (C8134s) obj2;
                List<C4802m> list = c8134s.f38961m;
                if (list == null) {
                    AbstractC4154l.m8928k("mConnectedSim");
                    throw null;
                }
                for (C4802m c4802m : list) {
                    if (c4802m.f23903o) {
                        c0.m13502y(c8134s.f38955g, null, null, new C7351a(c8134s, c4802m, interfaceC7559c, i11), 3);
                    }
                }
                return a0Var;
            case 28:
                EnumC7794a enumC7794a29 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C8141g c8141g = (C8141g) obj2;
                c0.m13502y(c8141g.f38986k, null, null, new C8136b(c8141g, interfaceC7559c, i12), 3);
                return a0Var;
            default:
                EnumC7794a enumC7794a30 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var9 = ((q4) obj2).f40744d;
                do {
                    value9 = m1Var9.getValue();
                } while (!m1Var9.m15397i(value9, C2073f.m5790a((C2073f) value9, false, 0, null, null, null, false, null, 247)));
                return a0Var;
        }
    }
}
