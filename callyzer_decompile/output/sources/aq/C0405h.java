package aq;

import android.content.Context;
import android.widget.Toast;
import ap.C0388a;
import b3.C0585q;
import b3.InterfaceC0579k;
import bq.C0737q;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.db.SyncCallLog;
import com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest;
import com.websoptimization.callyzerbiz.data.model.response.CallLogResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import com.websoptimization.callyzerbiz.domain.model.FCMData;
import com.websoptimization.callyzerbiz.ui.more.contact_us_form.model.ContactUsForm;
import cs.C1494m;
import cv.C1528x;
import d7.EnumC1645q;
import dq.C1750l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.ja;
import g2.ta;
import gp.C2703n;
import gs.C2715a;
import gt.C2729a;
import hp.C2995b;
import hq.C3009n;
import i0.m0;
import ip.C3342l;
import iq.EnumC3343a;
import is.C3348b;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import jt.C3854c;
import jt.C3856e;
import k2.w0;
import k4.C3991l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ks.C4223l;
import ks.c0;
import ks.q0;
import l4.C4381z;
import l7.C4409i;
import l7.a0;
import lu.C4525k;
import mq.h0;
import mt.C4874c;
import n7.C4970o;
import nm.C5107b;
import og.cf;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import p3.InterfaceC5822t;
import pp.C5995k;
import ps.AbstractC6025y;
import ps.AbstractC6026z;
import pt.C6032f;
import q1.C6091s;
import q1.C6097y;
import qw.C6366p;
import qw.C6367q;
import rw.AbstractC6663m;
import s6.C6763b;
import s6.C6765d;
import ss.C6929r;
import ss.z0;
import ts.C7216c;
import tx.InterfaceC7266z;
import tx.b0;
import u2.C7320q;
import um.C7474a;
import uw.InterfaceC7559c;
import vs.AbstractC7766h;
import vt.AbstractC7777h;
import vt.C7773d;
import vt.C7774e;
import vt.C7775f;
import vt.C7776g;
import vt.C7780k;
import vw.EnumC7794a;
import ws.C8162c;
import ws.C8181v;
import ww.AbstractC8199i;
import wx.m1;
import x1.d1;
import xm.x1;
import xs.C8449k;
import yn.C8712j;
import yn.C8716n;
import yt.C8774f;
import yv.C8805t;
import zr.C9032b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aq.h */
/* loaded from: classes3.dex */
public final class C0405h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3110a;

    /* renamed from: b */
    public /* synthetic */ Object f3111b;

    /* renamed from: c */
    public final /* synthetic */ Object f3112c;

    /* renamed from: d */
    public final /* synthetic */ Object f3113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0405h(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3110a = i10;
        this.f3111b = obj;
        this.f3112c = obj2;
        this.f3113d = obj3;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3110a) {
            case 0:
                C0405h c0405h = new C0405h((InterfaceC7266z) this.f3112c, (C0737q) this.f3113d, interfaceC7559c, 0);
                c0405h.f3111b = obj;
                return c0405h;
            case 1:
                C0405h c0405h2 = new C0405h((InterfaceC7266z) this.f3112c, (C1750l) this.f3113d, interfaceC7559c, 1);
                c0405h2.f3111b = obj;
                return c0405h2;
            case 2:
                C0405h c0405h3 = new C0405h((InterfaceC7266z) this.f3112c, (C2703n) this.f3113d, interfaceC7559c, 2);
                c0405h3.f3111b = obj;
                return c0405h3;
            case 3:
                C0405h c0405h4 = new C0405h((C6765d) this.f3112c, (Long) this.f3113d, interfaceC7559c, 3);
                c0405h4.f3111b = obj;
                return c0405h4;
            case 4:
                return new C0405h((C4381z) this.f3111b, (String) this.f3112c, (InterfaceC0579k) this.f3113d, interfaceC7559c, 4);
            case 5:
                C0405h c0405h5 = new C0405h((InterfaceC7266z) this.f3112c, (C3342l) this.f3113d, interfaceC7559c, 5);
                c0405h5.f3111b = obj;
                return c0405h5;
            case 6:
                C0405h c0405h6 = new C0405h((InterfaceC7266z) this.f3112c, (h0) this.f3113d, interfaceC7559c, 6);
                c0405h6.f3111b = obj;
                return c0405h6;
            case 7:
                return new C0405h((InterfaceC7266z) this.f3112c, this.f3111b, this.f3113d, interfaceC7559c, 7);
            case 8:
                C0405h c0405h7 = new C0405h((C3856e) this.f3112c, (Context) this.f3113d, interfaceC7559c, 8);
                c0405h7.f3111b = obj;
                return c0405h7;
            case 9:
                C0405h c0405h8 = new C0405h((String) this.f3112c, (String) this.f3113d, interfaceC7559c, 9);
                c0405h8.f3111b = obj;
                return c0405h8;
            case 10:
                C0405h c0405h9 = new C0405h((C6765d) this.f3112c, (String) this.f3113d, interfaceC7559c, 10);
                c0405h9.f3111b = obj;
                return c0405h9;
            case 11:
                return new C0405h((q0) this.f3111b, (LastCallDetails) this.f3112c, (String) this.f3113d, interfaceC7559c, 11);
            case 12:
                return new C0405h((w0) this.f3111b, (C4970o) this.f3112c, (C7320q) this.f3113d, interfaceC7559c, 12);
            case 13:
                C0405h c0405h10 = new C0405h((InterfaceC7266z) this.f3112c, (C5995k) this.f3113d, interfaceC7559c, 13);
                c0405h10.f3111b = obj;
                return c0405h10;
            case 14:
                return new C0405h((w0) this.f3111b, (w0) this.f3112c, (C6032f) this.f3113d, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0405h c0405h11 = new C0405h((a0) this.f3112c, (Context) this.f3113d, interfaceC7559c, 15);
                c0405h11.f3111b = obj;
                return c0405h11;
            case 16:
                return new C0405h((z0) this.f3111b, (w0) this.f3112c, (w0) this.f3113d, interfaceC7559c, 16);
            case 17:
                return new C0405h((InterfaceC7266z) this.f3112c, this.f3111b, this.f3113d, interfaceC7559c, 17);
            case 18:
                return new C0405h((C3348b) this.f3111b, (C6097y) this.f3112c, (C4223l) this.f3113d, interfaceC7559c, 18);
            case 19:
                return new C0405h((C6097y) this.f3111b, (c0) this.f3112c, (w0) this.f3113d, interfaceC7559c, 19);
            case 20:
                return new C0405h((C3348b) this.f3111b, (C6097y) this.f3112c, (q0) this.f3113d, interfaceC7559c, 20);
            case 21:
                return new C0405h((C8449k) this.f3111b, (Integer) this.f3112c, (w0) this.f3113d, interfaceC7559c, 21);
            case 22:
                return new C0405h((Context) this.f3111b, (C9032b) this.f3112c, (w0) this.f3113d, interfaceC7559c, 22);
            case 23:
                C0405h c0405h12 = new C0405h((InterfaceC5822t) this.f3112c, (d1) this.f3113d, interfaceC7559c, 23);
                c0405h12.f3111b = obj;
                return c0405h12;
            case 24:
                return new C0405h((CallLogResponse) this.f3111b, (SyncCallLogRequest) this.f3112c, (x1) this.f3113d, interfaceC7559c, 24);
            case 25:
                C0405h c0405h13 = new C0405h((Context) this.f3112c, (InterfaceC2137a) this.f3113d, interfaceC7559c, 25);
                c0405h13.f3111b = obj;
                return c0405h13;
            case 26:
                C0405h c0405h14 = new C0405h((C8774f) this.f3112c, (Context) this.f3113d, interfaceC7559c, 26);
                c0405h14.f3111b = obj;
                return c0405h14;
            case 27:
                C0405h c0405h15 = new C0405h((FCMData) this.f3112c, (C8716n) this.f3113d, interfaceC7559c, 27);
                c0405h15.f3111b = obj;
                return c0405h15;
            case 28:
                return new C0405h((String) this.f3111b, (C8805t) this.f3112c, (String) this.f3113d, interfaceC7559c, 28);
            default:
                return new C0405h((C8805t) this.f3111b, (String) this.f3112c, (Throwable) this.f3113d, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3110a) {
            case 0:
                C0405h c0405h = (C0405h) create((Integer) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c0405h.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C0405h c0405h2 = (C0405h) create((Integer) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c0405h2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                C0405h c0405h3 = (C0405h) create((Integer) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c0405h3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                C0405h c0405h4 = (C0405h) create((C6763b) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                c0405h4.invokeSuspend(a0Var4);
                return a0Var4;
            case 4:
                C0405h c0405h5 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var5 = qw.a0.f30746a;
                c0405h5.invokeSuspend(a0Var5);
                return a0Var5;
            case 5:
                C0405h c0405h6 = (C0405h) create((Integer) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var6 = qw.a0.f30746a;
                c0405h6.invokeSuspend(a0Var6);
                return a0Var6;
            case 6:
                C0405h c0405h7 = (C0405h) create((Integer) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var7 = qw.a0.f30746a;
                c0405h7.invokeSuspend(a0Var7);
                return a0Var7;
            case 7:
                C0405h c0405h8 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var8 = qw.a0.f30746a;
                c0405h8.invokeSuspend(a0Var8);
                return a0Var8;
            case 8:
                C0405h c0405h9 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var9 = qw.a0.f30746a;
                c0405h9.invokeSuspend(a0Var9);
                return a0Var9;
            case 9:
                C0405h c0405h10 = (C0405h) create((C6763b) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var10 = qw.a0.f30746a;
                c0405h10.invokeSuspend(a0Var10);
                return a0Var10;
            case 10:
                C0405h c0405h11 = (C0405h) create((C6763b) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var11 = qw.a0.f30746a;
                c0405h11.invokeSuspend(a0Var11);
                return a0Var11;
            case 11:
                C0405h c0405h12 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var12 = qw.a0.f30746a;
                c0405h12.invokeSuspend(a0Var12);
                return a0Var12;
            case 12:
                C0405h c0405h13 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var13 = qw.a0.f30746a;
                c0405h13.invokeSuspend(a0Var13);
                return a0Var13;
            case 13:
                C0405h c0405h14 = (C0405h) create((Integer) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var14 = qw.a0.f30746a;
                c0405h14.invokeSuspend(a0Var14);
                return a0Var14;
            case 14:
                C0405h c0405h15 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var15 = qw.a0.f30746a;
                c0405h15.invokeSuspend(a0Var15);
                return a0Var15;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0405h c0405h16 = (C0405h) create((EnumC3343a) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var16 = qw.a0.f30746a;
                c0405h16.invokeSuspend(a0Var16);
                return a0Var16;
            case 16:
                C0405h c0405h17 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var17 = qw.a0.f30746a;
                c0405h17.invokeSuspend(a0Var17);
                return a0Var17;
            case 17:
                C0405h c0405h18 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var18 = qw.a0.f30746a;
                c0405h18.invokeSuspend(a0Var18);
                return a0Var18;
            case 18:
                C0405h c0405h19 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var19 = qw.a0.f30746a;
                c0405h19.invokeSuspend(a0Var19);
                return a0Var19;
            case 19:
                C0405h c0405h20 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var20 = qw.a0.f30746a;
                c0405h20.invokeSuspend(a0Var20);
                return a0Var20;
            case 20:
                C0405h c0405h21 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var21 = qw.a0.f30746a;
                c0405h21.invokeSuspend(a0Var21);
                return a0Var21;
            case 21:
                C0405h c0405h22 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var22 = qw.a0.f30746a;
                c0405h22.invokeSuspend(a0Var22);
                return a0Var22;
            case 22:
                C0405h c0405h23 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var23 = qw.a0.f30746a;
                c0405h23.invokeSuspend(a0Var23);
                return a0Var23;
            case 23:
                return ((C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 24:
                C0405h c0405h24 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var24 = qw.a0.f30746a;
                c0405h24.invokeSuspend(a0Var24);
                return a0Var24;
            case 25:
                C0405h c0405h25 = (C0405h) create((AbstractC7777h) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var25 = qw.a0.f30746a;
                c0405h25.invokeSuspend(a0Var25);
                return a0Var25;
            case 26:
                C0405h c0405h26 = (C0405h) create((AbstractC7777h) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var26 = qw.a0.f30746a;
                c0405h26.invokeSuspend(a0Var26);
                return a0Var26;
            case 27:
                C0405h c0405h27 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var27 = qw.a0.f30746a;
                c0405h27.invokeSuspend(a0Var27);
                return a0Var27;
            case 28:
                C0405h c0405h28 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var28 = qw.a0.f30746a;
                c0405h28.invokeSuspend(a0Var28);
                return a0Var28;
            default:
                C0405h c0405h29 = (C0405h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var29 = qw.a0.f30746a;
                c0405h29.invokeSuspend(a0Var29);
                return a0Var29;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.List] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        String str;
        String string;
        String string2;
        int i10 = this.f3110a;
        int i11 = 7;
        int i12 = 2;
        C1494m c1494m = C1494m.f7575a;
        int i13 = 1;
        int i14 = 3;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj3 = this.f3113d;
        Object obj4 = this.f3112c;
        switch (i10) {
            case 0:
                Integer num = (Integer) this.f3111b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num != null) {
                    tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C0388a((C0737q) obj3, num, objArr == true ? 1 : 0, i13), 3);
                }
                return a0Var;
            case 1:
                Integer num2 = (Integer) this.f3111b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num2 != null) {
                    tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C0388a((C1750l) obj3, num2, objArr2 == true ? 1 : 0, i11), 3);
                }
                return a0Var;
            case 2:
                Integer num3 = (Integer) this.f3111b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num3 != null) {
                    tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C0388a((C2703n) obj3, num3, objArr3 == true ? 1 : 0, 14), 3);
                }
                return a0Var;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((C6763b) this.f3111b).m12968e((C6765d) obj4, (Long) obj3);
                return a0Var;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (((C4381z) this.f3111b).f21945a.f13620b.length() == 1 && ((String) obj4).length() != 4) {
                    ((C0585q) ((InterfaceC0579k) obj3)).m1747f(1);
                }
                return a0Var;
            case 5:
                Integer num4 = (Integer) this.f3111b;
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num4 != null) {
                    tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C0388a((C3342l) obj3, num4, objArr4 == true ? 1 : 0, 19), 3);
                }
                return a0Var;
            case 6:
                Integer num5 = (Integer) this.f3111b;
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num5 != null) {
                    tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C0388a((h0) obj3, num5, objArr5 == true ? 1 : 0, 20), 3);
                }
                return a0Var;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C2715a((ta) this.f3111b, (String) obj3, objArr6 == true ? 1 : 0, 8), 3);
                return a0Var;
            case 8:
                Context context = (Context) obj3;
                C3856e c3856e = (C3856e) obj4;
                m1 m1Var = c3856e.f19853i;
                wx.w0 w0Var = c3856e.f19854j;
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f3111b;
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                try {
                    if (c3856e.m8403h()) {
                        if (c3856e.f19849e.m16219a()) {
                            do {
                                value3 = m1Var.getValue();
                            } while (!m1Var.m15397i(value3, C2729a.m6728a((C2729a) value3, null, null, false, null, null, false, null, null, false, 0, null, null, false, null, false, null, null, null, null, true, 2097151)));
                            ContactUsForm contactUsForm = new ContactUsForm(((C2729a) w0Var.f39340a.getValue()).f15229a, ((C2729a) w0Var.f39340a.getValue()).f15232d, ((C2729a) w0Var.f39340a.getValue()).f15235g, ((C2729a) w0Var.f39340a.getValue()).f15238j, ((C2729a) w0Var.f39340a.getValue()).f15239k, C3856e.m8400e(c3856e, context, c3856e.f19855k));
                            InterfaceC7559c interfaceC7559c = null;
                            tx.c0.m13502y(interfaceC7266z, null, null, new C3854c(c3856e, context, interfaceC7559c, i13), 3);
                            tx.c0.m13502y(interfaceC7266z, null, null, new C2995b(tx.c0.m13502y(interfaceC7266z, null, null, new C0388a(c3856e, contactUsForm, interfaceC7559c, 23), 3), c3856e, context, interfaceC7559c, 7), 3);
                        } else {
                            do {
                                value2 = m1Var.getValue();
                            } while (!m1Var.m15397i(value2, C2729a.m6728a((C2729a) value2, null, null, false, null, null, false, null, null, false, 0, null, null, false, null, false, null, new Integer(R.string.no_internet_connection), null, null, false, 3407871)));
                        }
                    }
                } catch (Exception e2) {
                    c3856e.f19852h.m16233h("submitFeedback", "Unexpected error", e2);
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C2729a.m6728a((C2729a) value, null, null, false, null, null, false, null, null, false, 0, null, null, false, null, false, null, new Integer(R.string.submit_contact_form_fail), null, null, false, 3407871)));
                }
                return a0Var;
            case 9:
                C6763b c6763b = (C6763b) this.f3111b;
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c6763b.getClass();
                c6763b.m12969f(cf.m10584e((String) obj4), (String) obj3);
                return a0Var;
            case 10:
                C6763b c6763b2 = (C6763b) this.f3111b;
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c6763b2.m12968e((C6765d) obj4, (String) obj3);
                return a0Var;
            case 11:
                EnumC7794a enumC7794a12 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                q0 q0Var = (q0) this.f3111b;
                tx.c0.m13502y(q0Var.f21498i, null, null, new C2995b(q0Var, (LastCallDetails) obj4, (String) obj3, null, 22), 3);
                return a0Var;
            case 12:
                EnumC7794a enumC7794a13 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C4970o c4970o = (C4970o) obj4;
                C7320q c7320q = (C7320q) obj3;
                for (C4409i c4409i : (Set) ((w0) this.f3111b).getValue()) {
                    if (!((List) c4970o.m9225b().f22080e.f39340a.getValue()).contains(c4409i) && !c7320q.contains(c4409i)) {
                        c4970o.m9225b().m9217c(c4409i);
                    }
                }
                return a0Var;
            case 13:
                Integer num6 = (Integer) this.f3111b;
                EnumC7794a enumC7794a14 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num6 != null) {
                    tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C4525k((C5995k) obj3, num6, objArr7 == true ? 1 : 0, i14), 3);
                }
                return a0Var;
            case 14:
                w0 w0Var2 = (w0) obj4;
                EnumC7794a enumC7794a15 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0 w0Var3 = (w0) this.f3111b;
                if (((Boolean) w0Var3.getValue()).booleanValue()) {
                    C6367q c6367q = (C6367q) w0Var2.getValue();
                    if (c6367q != null) {
                        ((C6032f) obj3).m12048h(new C4874c((String) c6367q.f30765a, (String) c6367q.f30766b, ((Number) c6367q.f30767c).intValue()));
                    }
                    w0Var3.setValue(Boolean.FALSE);
                    w0Var2.setValue(null);
                }
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                EnumC3343a enumC3343a = (EnumC3343a) this.f3111b;
                EnumC7794a enumC7794a16 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int i15 = AbstractC6025y.f29440a[enumC3343a.ordinal()];
                if (i15 == 1) {
                    a0.m9181f((a0) obj4, "message_templates");
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText((Context) obj3, R.string.subscription_expired_dot, 0).show();
                }
                return a0Var;
            case 16:
                EnumC7794a enumC7794a17 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC6026z.f29441a[((EnumC1645q) ((w0) obj4).getValue()).ordinal()] == 1 && ((C7216c) ((w0) obj3).getValue()).f34516d == null) {
                    ((z0) this.f3111b).m13196s(C6929r.f33479a);
                }
                return a0Var;
            case 17:
                EnumC7794a enumC7794a18 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ja jaVar = (ja) this.f3111b;
                tx.c0.m13502y((InterfaceC7266z) obj4, null, null, new C1528x(jaVar, objArr8 == true ? 1 : 0, i11), 3).v0(new C3009n(29, jaVar, (InterfaceC2139c) obj3));
                return a0Var;
            case 18:
                EnumC7794a enumC7794a19 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C3348b c3348b = (C3348b) this.f3111b;
                if (!c3348b.f17714b) {
                    int size = c3348b.f17713a.size() - 5;
                    C6091s c6091s = (C6091s) AbstractC6663m.m12751O(((C6097y) obj4).m12134h().f29726k);
                    if (size <= (c6091s != null ? c6091s.f29733a : 0)) {
                        ((C4223l) obj3).m8961h(c1494m);
                    }
                }
                return a0Var;
            case 19:
                EnumC7794a enumC7794a20 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0 w0Var4 = (w0) obj3;
                if (!((C3348b) w0Var4.getValue()).f17714b) {
                    int size2 = ((C3348b) w0Var4.getValue()).f17713a.size() - 5;
                    C6091s c6091s2 = (C6091s) AbstractC6663m.m12751O(((C6097y) this.f3111b).m12134h().f29726k);
                    if (size2 <= (c6091s2 != null ? c6091s2.f29733a : 0)) {
                        ((c0) obj4).m8957r(c1494m);
                    }
                }
                return a0Var;
            case 20:
                EnumC7794a enumC7794a21 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C3348b c3348b2 = (C3348b) this.f3111b;
                if (!c3348b2.f17714b) {
                    int size3 = c3348b2.f17713a.size() - 5;
                    C6091s c6091s3 = (C6091s) AbstractC6663m.m12751O(((C6097y) obj4).m12134h().f29726k);
                    if (size3 <= (c6091s3 != null ? c6091s3.f29733a : 0)) {
                        ((q0) obj3).m8972o(c1494m);
                    }
                }
                return a0Var;
            case 21:
                EnumC7794a enumC7794a22 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C8449k c8449k = (C8449k) this.f3111b;
                C8181v c8181v = (C8181v) c8449k.f41224n.f39340a.getValue();
                Integer num7 = (Integer) obj4;
                w0 w0Var5 = (w0) obj3;
                if (!c8181v.f39124j && !c8181v.f39126l && num7.intValue() >= c8181v.f39119e.size() - 5) {
                    C3991l c3991l = AbstractC7766h.f37417a;
                    if (!((C8181v) w0Var5.getValue()).f39128n) {
                        c8449k.m15752h(C8162c.f39085a);
                    }
                }
                return a0Var;
            case 22:
                EnumC7794a enumC7794a23 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (((Boolean) ((w0) obj3).getValue()).booleanValue()) {
                    Context context2 = (Context) this.f3111b;
                    String str2 = ((C9032b) obj4).f43498G;
                    Toast.makeText(context2, str2 != null ? str2 : "", 0).show();
                }
                return a0Var;
            case 23:
                EnumC7794a enumC7794a24 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f3111b;
                b0 b0Var = b0.UNDISPATCHED;
                InterfaceC5822t interfaceC5822t = (InterfaceC5822t) obj4;
                d1 d1Var = (d1) obj3;
                tx.c0.m13502y(interfaceC7266z2, null, b0Var, new x1.h0(interfaceC5822t, d1Var, objArr10 == true ? 1 : 0, i13), 1);
                return tx.c0.m13502y(interfaceC7266z2, null, b0Var, new x1.h0(interfaceC5822t, d1Var, objArr9 == true ? 1 : 0, i12), 1);
            case 24:
                EnumC7794a enumC7794a25 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C5107b c5107bM4756l = ((CallLogResponse) this.f3111b).m4756l();
                Iterator it = ((SyncCallLogRequest) obj4).m4689N().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        SyncCallLog syncCallLog = (SyncCallLog) next;
                        if (AbstractC4154l.m8918a(syncCallLog.f7333c, "CallLog") && syncCallLog.m4622d(c5107bM4756l)) {
                            obj2 = next;
                        }
                    }
                }
                SyncCallLog syncCallLog2 = (SyncCallLog) obj2;
                if (syncCallLog2 != null && (str = syncCallLog2.f7332b) != null) {
                    x1 x1Var = (x1) obj3;
                    C6366p c6366p = x1.f40986k;
                    if (str.length() > 0) {
                        File file = new File(str);
                        if (!file.isFile() || !file.exists()) {
                            Objects.toString(syncCallLog2);
                        } else if (!file.delete()) {
                            x1Var.f41000j.m16232g("processSyncApiResponse", "compress file doesn't delete for this callLog , syncCallLog := " + syncCallLog2);
                        }
                    } else {
                        Objects.toString(syncCallLog2);
                    }
                }
                return a0Var;
            case 25:
                Context context3 = (Context) obj4;
                AbstractC7777h abstractC7777h = (AbstractC7777h) this.f3111b;
                EnumC7794a enumC7794a26 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC7777h instanceof C7773d) {
                    C7474a c7474a = ((C7773d) abstractC7777h).f37436a;
                    if (c7474a.f36078a) {
                        string = m0.m7379l(c7474a.f36079b, " ", context3.getString(R.string.is_connected));
                    } else {
                        string = context3.getString(R.string.something_went_wrong_Please_try_again);
                        AbstractC4154l.m8920c(string);
                    }
                } else if (abstractC7777h instanceof C7774e) {
                    string = "";
                } else if (abstractC7777h instanceof C7776g) {
                    string = ((C7776g) abstractC7777h).f37440a;
                } else {
                    if (!(abstractC7777h instanceof C7775f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = "";
                }
                if (!AbstractC4154l.m8918a(string, "")) {
                    Toast.makeText(context3, string, 0).show();
                    ((InterfaceC2137a) obj3).invoke();
                }
                return a0Var;
            case 26:
                C8774f c8774f = (C8774f) obj4;
                Context context4 = (Context) obj3;
                AbstractC7777h abstractC7777h2 = (AbstractC7777h) this.f3111b;
                EnumC7794a enumC7794a27 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                boolean z6 = abstractC7777h2 instanceof C7773d;
                C7780k c7780k = C7780k.f37443a;
                if (z6) {
                    c8774f.m16129f(c7780k);
                } else if (abstractC7777h2 instanceof C7774e) {
                    C7774e c7774e = (C7774e) abstractC7777h2;
                    if (c7774e.f37437a) {
                        c8774f.m16129f(c7780k);
                        string2 = m0.m7379l(c7774e.f37438b, " ", context4.getString(R.string.is_disconnected));
                    } else {
                        c8774f.m16129f(c7780k);
                        string2 = context4.getString(R.string.something_went_wrong_Please_try_again);
                        AbstractC4154l.m8920c(string2);
                    }
                    if (!AbstractC4154l.m8918a(string2, "")) {
                        Toast.makeText(context4, string2, 0).show();
                    }
                } else if (!(abstractC7777h2 instanceof C7776g)) {
                    if (!(abstractC7777h2 instanceof C7775f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str3 = ((C7775f) abstractC7777h2).f37439a;
                    if (!AbstractC4154l.m8918a(str3, "")) {
                        Toast.makeText(context4, str3, 0).show();
                    }
                }
                return a0Var;
            case 27:
                C8716n c8716n = (C8716n) obj3;
                FCMData fCMData = (FCMData) obj4;
                InterfaceC7266z interfaceC7266z3 = (InterfaceC7266z) this.f3111b;
                EnumC7794a enumC7794a28 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                try {
                    String extensionCode = fCMData.getExtensionCode();
                    AbstractC4154l.m8920c(extensionCode);
                    tx.c0.m13502y(interfaceC7266z3, null, null, new C8712j(fCMData, extensionCode, null, c8716n), 3);
                } catch (Exception e10) {
                    c8716n.f42156n.m16231f(" FCMMessage >>> Error Quick call extension delete failed qrCode = " + fCMData.getExtensionCode() + ": " + e10);
                }
                return a0Var;
            case 28:
                String str4 = (String) obj3;
                C8805t c8805t = (C8805t) obj4;
                EnumC7794a enumC7794a29 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                String str5 = (String) this.f3111b;
                if (str5.length() > 0) {
                    try {
                        C8805t.m16227b(str4, str5, c8805t);
                    } catch (IOException e11) {
                        C8805t.m16226a(c8805t, str4 + " >>> " + str5, e11);
                    } catch (NullPointerException e12) {
                        C8805t.m16226a(c8805t, str4 + " >>> " + str5, e12);
                    }
                }
                return a0Var;
            default:
                C8805t c8805t2 = (C8805t) this.f3111b;
                EnumC7794a enumC7794a30 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                try {
                    C8805t.m16228c(c8805t2, (String) obj4);
                    c8805t2.m16235j((Throwable) obj3);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0405h(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3110a = i10;
        this.f3112c = obj;
        this.f3113d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0405h(InterfaceC7266z interfaceC7266z, Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3110a = i10;
        this.f3112c = interfaceC7266z;
        this.f3111b = obj;
        this.f3113d = obj2;
    }
}
