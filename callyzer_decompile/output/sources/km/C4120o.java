package km;

import an.j2;
import android.content.Context;
import aq.C0405h;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest;
import go.C2689f;
import gs.C2715a;
import in.C3325a;
import j$.time.LocalDate;
import kk.C4089i;
import kotlin.jvm.internal.C4162t;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4574m;
import o6.InterfaceC5304f;
import og.cf;
import og.df;
import og.yd;
import r6.C6472a;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: km.o */
/* loaded from: classes3.dex */
public final class C4120o implements InterfaceC4106a {

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC4574m[] f21051c;

    /* renamed from: a */
    public final Context f21052a;

    /* renamed from: b */
    public final C6472a f21053b = yd.m11068b(new j2(27, this), "callyzer_biz_preference");

    static {
        C4162t c4162t = new C4162t(C4120o.class);
        a0.f21154a.getClass();
        f21051c = new InterfaceC4574m[]{c4162t};
    }

    public C4120o(Context context, C8805t c8805t) {
        this.f21052a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8879a(java.lang.String r6, uw.InterfaceC7559c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof km.C4107b
            if (r0 == 0) goto L13
            r0 = r7
            km.b r0 = (km.C4107b) r0
            int r1 = r0.f21005d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21005d = r1
            goto L18
        L13:
            km.b r0 = new km.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f21003b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21005d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            s6.d r6 = r0.f21002a
            og.od.m10798c(r7)     // Catch: java.lang.Exception -> L2a
            goto L50
        L2a:
            r6 = move-exception
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            og.od.m10798c(r7)
            s6.d r6 = og.cf.m10580a(r6)     // Catch: java.lang.Exception -> L2a
            android.content.Context r7 = r5.f21052a     // Catch: java.lang.Exception -> L2a
            o6.f r7 = r5.m8881c(r7)     // Catch: java.lang.Exception -> L2a
            wx.j r7 = r7.getData()     // Catch: java.lang.Exception -> L2a
            r0.f21002a = r6     // Catch: java.lang.Exception -> L2a
            r0.f21005d = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = wx.c1.m15385p(r7, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r1) goto L50
            return r1
        L50:
            s6.b r7 = (s6.C6763b) r7     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r7.m12966c(r6)     // Catch: java.lang.Exception -> L2a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L62
            boolean r3 = r6.booleanValue()     // Catch: java.lang.Exception -> L2a
            goto L62
        L5f:
            r6.printStackTrace()
        L62:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C4120o.m8879a(java.lang.String, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8880b(java.lang.String r5, boolean r6, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof km.C4108c
            if (r0 == 0) goto L13
            r0 = r7
            km.c r0 = (km.C4108c) r0
            int r1 = r0.f21010e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21010e = r1
            goto L18
        L13:
            km.c r0 = new km.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f21008c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21010e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r6 = r0.f21007b
            s6.d r5 = r0.f21006a
            og.od.m10798c(r7)     // Catch: java.lang.Exception -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L62
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r7)
            s6.d r5 = og.cf.m10580a(r5)     // Catch: java.lang.Exception -> L2b
            android.content.Context r7 = r4.f21052a     // Catch: java.lang.Exception -> L2b
            o6.f r7 = r4.m8881c(r7)     // Catch: java.lang.Exception -> L2b
            wx.j r7 = r7.getData()     // Catch: java.lang.Exception -> L2b
            r0.f21006a = r5     // Catch: java.lang.Exception -> L2b
            r0.f21007b = r6     // Catch: java.lang.Exception -> L2b
            r0.f21010e = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = wx.c1.m15385p(r7, r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L53
            return r1
        L53:
            s6.b r7 = (s6.C6763b) r7     // Catch: java.lang.Exception -> L2b
            java.lang.Object r5 = r7.m12966c(r5)     // Catch: java.lang.Exception -> L2b
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L2b
            if (r5 == 0) goto L65
            boolean r6 = r5.booleanValue()     // Catch: java.lang.Exception -> L2b
            goto L65
        L62:
            r5.printStackTrace()
        L65:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C4120o.m8880b(java.lang.String, boolean, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public final InterfaceC5304f m8881c(Context context) {
        return (InterfaceC5304f) this.f21053b.m12455a(context, f21051c[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8882d(java.lang.String r5, uw.InterfaceC7559c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof km.C4112g
            if (r0 == 0) goto L13
            r0 = r6
            km.g r0 = (km.C4112g) r0
            int r1 = r0.f21023d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21023d = r1
            goto L18
        L13:
            km.g r0 = new km.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f21021b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21023d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            s6.d r5 = r0.f21020a
            og.od.m10798c(r6)     // Catch: java.lang.Exception -> L29
            goto L4f
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r6)
            s6.d r5 = og.cf.m10580a(r5)     // Catch: java.lang.Exception -> L29
            android.content.Context r6 = r4.f21052a     // Catch: java.lang.Exception -> L29
            o6.f r6 = r4.m8881c(r6)     // Catch: java.lang.Exception -> L29
            wx.j r6 = r6.getData()     // Catch: java.lang.Exception -> L29
            r0.f21020a = r5     // Catch: java.lang.Exception -> L29
            r0.f21023d = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = wx.c1.m15385p(r6, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L4f
            return r1
        L4f:
            s6.b r6 = (s6.C6763b) r6     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r6.m12966c(r5)     // Catch: java.lang.Exception -> L29
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L29
            return r5
        L58:
            r5.printStackTrace()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C4120o.m8882d(java.lang.String, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8883e(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof km.C4113h
            if (r0 == 0) goto L13
            r0 = r6
            km.h r0 = (km.C4113h) r0
            int r1 = r0.f21027d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21027d = r1
            goto L18
        L13:
            km.h r0 = new km.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f21025b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21027d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            s6.d r5 = r0.f21024a
            og.od.m10798c(r6)     // Catch: java.lang.Exception -> L29
            goto L4f
        L29:
            r5 = move-exception
            goto L60
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r6)
            s6.d r5 = og.cf.m10582c(r5)     // Catch: java.lang.Exception -> L29
            android.content.Context r6 = r4.f21052a     // Catch: java.lang.Exception -> L29
            o6.f r6 = r4.m8881c(r6)     // Catch: java.lang.Exception -> L29
            wx.j r6 = r6.getData()     // Catch: java.lang.Exception -> L29
            r0.f21024a = r5     // Catch: java.lang.Exception -> L29
            r0.f21027d = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = wx.c1.m15385p(r6, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L4f
            return r1
        L4f:
            s6.b r6 = (s6.C6763b) r6     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r6.m12966c(r5)     // Catch: java.lang.Exception -> L29
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L29
            if (r5 == 0) goto L5e
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L29
            goto L64
        L5e:
            r5 = -1
            goto L64
        L60:
            r5.printStackTrace()
            r5 = 0
        L64:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C4120o.m8883e(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8884f(java.lang.String r7, uw.InterfaceC7559c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof km.C4115j
            if (r0 == 0) goto L13
            r0 = r8
            km.j r0 = (km.C4115j) r0
            int r1 = r0.f21034d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21034d = r1
            goto L18
        L13:
            km.j r0 = new km.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f21032b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21034d
            r3 = -1
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            s6.d r7 = r0.f21031a
            og.od.m10798c(r8)     // Catch: java.lang.Exception -> L2b
            goto L51
        L2b:
            r7 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            og.od.m10798c(r8)
            s6.d r7 = og.cf.m10583d(r7)     // Catch: java.lang.Exception -> L2b
            android.content.Context r8 = r6.f21052a     // Catch: java.lang.Exception -> L2b
            o6.f r8 = r6.m8881c(r8)     // Catch: java.lang.Exception -> L2b
            wx.j r8 = r8.getData()     // Catch: java.lang.Exception -> L2b
            r0.f21031a = r7     // Catch: java.lang.Exception -> L2b
            r0.f21034d = r5     // Catch: java.lang.Exception -> L2b
            java.lang.Object r8 = wx.c1.m15385p(r8, r0)     // Catch: java.lang.Exception -> L2b
            if (r8 != r1) goto L51
            return r1
        L51:
            s6.b r8 = (s6.C6763b) r8     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r8.m12966c(r7)     // Catch: java.lang.Exception -> L2b
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Exception -> L2b
            if (r7 == 0) goto L63
            long r3 = r7.longValue()     // Catch: java.lang.Exception -> L2b
            goto L63
        L60:
            r7.printStackTrace()
        L63:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C4120o.m8884f(java.lang.String, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8885g(java.lang.String r5, java.lang.Class r6, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof km.C4116k
            if (r0 == 0) goto L13
            r0 = r7
            km.k r0 = (km.C4116k) r0
            int r1 = r0.f21039e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21039e = r1
            goto L18
        L13:
            km.k r0 = new km.k
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f21037c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21039e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            s6.d r5 = r0.f21036b
            java.lang.Class r6 = r0.f21035a
            og.od.m10798c(r7)
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r7)
            s6.d r5 = og.cf.m10584e(r5)
            android.content.Context r7 = r4.f21052a
            o6.f r7 = r4.m8881c(r7)
            wx.j r7 = r7.getData()
            r0.f21035a = r6
            r0.f21036b = r5
            r0.f21039e = r3
            java.lang.Object r7 = wx.c1.m15385p(r7, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            s6.b r7 = (s6.C6763b) r7
            kk.i r0 = new kk.i
            r0.<init>()
            java.lang.Class<j$.time.LocalDate> r1 = j$.time.LocalDate.class
            in.a r2 = in.C3325a.f17598a
            r0.m8865b(r1, r2)
            kk.h r0 = r0.m8864a()
            java.lang.Object r5 = r7.m12966c(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L6d
            java.lang.String r5 = ""
        L6d:
            java.lang.Object r5 = r0.m8855b(r6, r5)     // Catch: java.lang.Exception -> L72
            return r5
        L72:
            r5 = move-exception
            r5.printStackTrace()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C4120o.m8885g(java.lang.String, java.lang.Class, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8886h(java.lang.String r6, uw.InterfaceC7559c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof km.C4117l
            if (r0 == 0) goto L13
            r0 = r7
            km.l r0 = (km.C4117l) r0
            int r1 = r0.f21043d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21043d = r1
            goto L18
        L13:
            km.l r0 = new km.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f21041b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21043d
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            s6.d r6 = r0.f21040a
            og.od.m10798c(r7)     // Catch: java.lang.Exception -> L2b
            goto L51
        L2b:
            r6 = move-exception
            goto L5d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            og.od.m10798c(r7)
            s6.d r6 = og.cf.m10584e(r6)     // Catch: java.lang.Exception -> L2b
            android.content.Context r7 = r5.f21052a     // Catch: java.lang.Exception -> L2b
            o6.f r7 = r5.m8881c(r7)     // Catch: java.lang.Exception -> L2b
            wx.j r7 = r7.getData()     // Catch: java.lang.Exception -> L2b
            r0.f21040a = r6     // Catch: java.lang.Exception -> L2b
            r0.f21043d = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = wx.c1.m15385p(r7, r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L51
            return r1
        L51:
            s6.b r7 = (s6.C6763b) r7     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r7.m12966c(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto L5c
            return r3
        L5c:
            return r6
        L5d:
            r6.printStackTrace()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C4120o.m8886h(java.lang.String, uw.c):java.lang.Object");
    }

    /* renamed from: i */
    public final Object m8887i(String str, boolean z6, InterfaceC7559c interfaceC7559c) {
        Object objM10613c = df.m10613c(m8881c(this.f21052a), new C4118m(cf.m10580a(str), z6, null, 0), interfaceC7559c);
        return objM10613c == EnumC7794a.COROUTINE_SUSPENDED ? objM10613c : qw.a0.f30746a;
    }

    /* renamed from: j */
    public final Object m8888j(int i10, String str, AbstractC8193c abstractC8193c) {
        Object objM10613c = df.m10613c(m8881c(this.f21052a), new C2715a(cf.m10582c(str), i10, (InterfaceC7559c) null), abstractC8193c);
        return objM10613c == EnumC7794a.COROUTINE_SUSPENDED ? objM10613c : qw.a0.f30746a;
    }

    /* renamed from: k */
    public final Object m8889k(String str, long j6, InterfaceC7559c interfaceC7559c) {
        Object objM10613c = df.m10613c(m8881c(this.f21052a), new C4119n(cf.m10583d(str), j6, null), interfaceC7559c);
        return objM10613c == EnumC7794a.COROUTINE_SUSPENDED ? objM10613c : qw.a0.f30746a;
    }

    /* renamed from: l */
    public final Object m8890l(String str, LeadFilterRequest leadFilterRequest, C2689f c2689f) {
        C4089i c4089i = new C4089i();
        c4089i.m8865b(LocalDate.class, C3325a.f17598a);
        Object objM10613c = df.m10613c(m8881c(this.f21052a), new C0405h(str, c4089i.m8864a().m8861h(leadFilterRequest), null, 9), c2689f);
        return objM10613c == EnumC7794a.COROUTINE_SUSPENDED ? objM10613c : qw.a0.f30746a;
    }

    /* renamed from: m */
    public final Object m8891m(String str, String str2, InterfaceC7559c interfaceC7559c) {
        Object objM10613c = df.m10613c(m8881c(this.f21052a), new C0405h(cf.m10584e(str), str2, null, 10), interfaceC7559c);
        return objM10613c == EnumC7794a.COROUTINE_SUSPENDED ? objM10613c : qw.a0.f30746a;
    }
}
