package nn;

import f9.C2222e;
import km.C4111f;
import km.C4120o;
import kotlin.jvm.internal.AbstractC4154l;
import og.cf;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import wx.C8203d;
import xm.C8418z;
import xm.y5;
import yv.EnumC8793h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nn.e */
/* loaded from: classes3.dex */
public final class C5113e {

    /* renamed from: a */
    public final C8418z f25030a;

    /* renamed from: b */
    public final y5 f25031b;

    /* renamed from: c */
    public final C8203d f25032c;

    public C5113e(C8418z appPreferencesRepository, y5 userSIMRepository) {
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f25030a = appPreferencesRepository;
        this.f25031b = userSIMRepository;
        this.f25032c = appPreferencesRepository.f41080l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10038a(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nn.C5110b
            if (r0 == 0) goto L13
            r0 = r6
            nn.b r0 = (nn.C5110b) r0
            int r1 = r0.f25021d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25021d = r1
            goto L18
        L13:
            nn.b r0 = new nn.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25019b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f25021d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f25018a
            og.od.m10798c(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f25018a = r5
            r0.f25021d = r3
            xm.y5 r6 = r4.f25031b
            java.lang.Object r6 = r6.m15696l(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r6.next()
            r1 = r0
            mm.m r1 = (mm.C4802m) r1
            java.lang.String r1 = r1.f23891c
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r5)
            if (r1 == 0) goto L47
            return r0
        L5d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C5113e.m10038a(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10039b(int r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nn.C5111c
            if (r0 == 0) goto L13
            r0 = r6
            nn.c r0 = (nn.C5111c) r0
            int r1 = r0.f25025d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25025d = r1
            goto L18
        L13:
            nn.c r0 = new nn.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25023b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f25025d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.f25022a
            og.od.m10798c(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f25022a = r5
            r0.f25025d = r3
            xm.y5 r6 = r4.f25031b
            java.lang.Object r6 = r6.m15699o(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L4d
            if (r5 != 0) goto L4a
            java.lang.String r5 = "SIM 1"
            return r5
        L4a:
            java.lang.String r5 = "SIM 2"
            return r5
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C5113e.m10039b(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10040c(tq.EnumC7204p r5, ww.AbstractC8193c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nn.C5112d
            if (r0 == 0) goto L13
            r0 = r6
            nn.d r0 = (nn.C5112d) r0
            int r1 = r0.f25029d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25029d = r1
            goto L18
        L13:
            nn.d r0 = new nn.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25027b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f25029d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tq.p r5 = r0.f25026a
            og.od.m10798c(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            tq.p r6 = tq.EnumC7204p.DEFAULT
            if (r5 == r6) goto L8e
            tq.p r6 = tq.EnumC7204p.ALL
            if (r5 != r6) goto L3d
            goto L8e
        L3d:
            r0.f25026a = r5
            r0.f25029d = r3
            xm.y5 r6 = r4.f25031b
            java.lang.Object r6 = r6.m15696l(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.util.List r6 = (java.util.List) r6
            tq.p r0 = tq.EnumC7204p.SIM2
            r1 = 2
            if (r5 != r0) goto L68
            int r0 = r6.size()
            if (r0 != r1) goto L58
            goto L68
        L58:
            java.lang.Exception r5 = new java.lang.Exception
            int r6 = r6.size()
            java.lang.String r0 = "invalid size:=$"
            java.lang.String r6 = mm.AbstractC4801l.m9730d(r6, r0)
            r5.<init>(r6)
            throw r5
        L68:
            int[] r0 = nn.AbstractC5109a.f25017a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r3) goto L81
            if (r5 == r1) goto L75
            goto L8e
        L75:
            java.lang.Object r5 = r6.get(r3)
            mm.m r5 = (mm.C4802m) r5
            java.lang.String r5 = r5.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            return r5
        L81:
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            mm.m r5 = (mm.C4802m) r5
            java.lang.String r5 = r5.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            return r5
        L8e:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C5113e.m10040c(tq.p, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public final C2222e m10041d() {
        C4120o c4120o = (C4120o) this.f25030a.f41069a.f10585a;
        c4120o.getClass();
        return new C2222e(6, new C4111f(c4120o.m8881c(c4120o.f21052a).getData(), cf.m10582c("filter_sim_selection"), 1));
    }

    /* renamed from: e */
    public final Object m10042e(InterfaceC7559c interfaceC7559c) {
        return ((C4120o) this.f25030a.f41069a.f10585a).m8882d("isExclude", interfaceC7559c);
    }

    /* renamed from: f */
    public final Object m10043f(EnumC8793h enumC8793h, AbstractC8193c abstractC8193c) {
        Object objM6032l = this.f25030a.f41069a.m6032l(enumC8793h.getOptionValue(), "default_screen", abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        a0 a0Var = a0.f30746a;
        if (objM6032l != enumC7794a) {
            objM6032l = a0Var;
        }
        return objM6032l == enumC7794a ? objM6032l : a0Var;
    }
}
