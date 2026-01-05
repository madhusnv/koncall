package fn;

import ap.C0388a;
import java.util.List;
import kk.C4088h;
import km.C4120o;
import km.InterfaceC4106a;
import kotlin.jvm.internal.AbstractC4154l;
import og.cf;
import og.df;
import qw.a0;
import rw.AbstractC6663m;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fn.i */
/* loaded from: classes3.dex */
public final class C2336i {

    /* renamed from: a */
    public final InterfaceC4106a f10585a;

    public C2336i(InterfaceC4106a dataStore) {
        AbstractC4154l.m8923f(dataStore, "dataStore");
        this.f10585a = dataStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (((km.C4120o) r10.f10585a).m8891m("call_recording_downloading_ids", r14, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6021a(int r11, long r12, ww.AbstractC8193c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof fn.C2328a
            if (r0 == 0) goto L13
            r0 = r14
            fn.a r0 = (fn.C2328a) r0
            int r1 = r0.f10562e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10562e = r1
            goto L18
        L13:
            fn.a r0 = new fn.a
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f10560c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10562e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r14)
            goto L87
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            long r12 = r0.f10559b
            int r11 = r0.f10558a
            og.od.m10798c(r14)
            goto L4a
        L3a:
            og.od.m10798c(r14)
            r0.f10558a = r11
            r0.f10559b = r12
            r0.f10562e = r4
            java.lang.Object r14 = r10.m6026f(r0)
            if (r14 != r1) goto L4a
            goto L86
        L4a:
            java.util.Map r14 = (java.util.Map) r14
            java.util.LinkedHashMap r14 = rw.AbstractC6674x.m12786n(r14)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r11)
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r12)
            r14.put(r2, r4)
            java.util.Set r14 = r14.entrySet()
            r4 = r14
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            cv.m r8 = new cv.m
            r14 = 7
            r8.<init>(r14)
            r9 = 30
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            java.lang.String r14 = rw.AbstractC6663m.m12748L(r4, r5, r6, r7, r8, r9)
            r0.f10558a = r11
            r0.f10559b = r12
            r0.f10562e = r3
            km.a r11 = r10.f10585a
            km.o r11 = (km.C4120o) r11
            java.lang.String r12 = "call_recording_downloading_ids"
            java.lang.Object r11 = r11.m8891m(r12, r14, r0)
            if (r11 != r1) goto L87
        L86:
            return r1
        L87:
            qw.a0 r11 = qw.a0.f30746a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6021a(int, long, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public final Object m6022b(String str, InterfaceC7559c interfaceC7559c) {
        return ((C4120o) this.f10585a).m8879a(str, interfaceC7559c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m6023c(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.C2329b
            if (r0 == 0) goto L13
            r0 = r5
            fn.b r0 = (fn.C2329b) r0
            int r1 = r0.f10565c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10565c = r1
            goto L18
        L13:
            fn.b r0 = new fn.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10563a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10565c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f10565c = r3
            km.a r5 = r4.f10585a
            km.o r5 = (km.C4120o) r5
            java.lang.String r2 = "lead_list"
            java.lang.Object r5 = r5.m8886h(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = (java.lang.String) r5
            com.websoptimization.callyzerbiz.data.source.dataStore.DataStoreSourceImpl$getLeadCallList$itemType$1 r0 = new com.websoptimization.callyzerbiz.data.source.dataStore.DataStoreSourceImpl$getLeadCallList$itemType$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            kk.h r1 = new kk.h     // Catch: java.lang.Exception -> L5b
            r1.<init>()     // Catch: java.lang.Exception -> L5b
            java.lang.Object r5 = r1.m8857d(r5, r0)     // Catch: java.lang.Exception -> L5b
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)     // Catch: java.lang.Exception -> L5b
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Exception -> L5b
            return r5
        L5b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6023c(ww.c):java.io.Serializable");
    }

    /* renamed from: d */
    public final Object m6024d(String str, AbstractC8193c abstractC8193c) {
        return ((C4120o) this.f10585a).m8884f(str, abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6025e(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.C2330c
            if (r0 == 0) goto L13
            r0 = r5
            fn.c r0 = (fn.C2330c) r0
            int r1 = r0.f10568c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10568c = r1
            goto L18
        L13:
            fn.c r0 = new fn.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10566a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10568c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f10568c = r3
            km.a r5 = r4.f10585a
            km.o r5 = (km.C4120o) r5
            java.lang.String r2 = "recording_available_sim"
            java.lang.Object r5 = r5.m8886h(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.length()
            if (r0 != 0) goto L4c
            rw.r r5 = rw.C6668r.f31943a
            return r5
        L4c:
            r0 = 0
            java.lang.String r1 = ","
            boolean r0 = nx.AbstractC5178p.m10116x(r5, r1, r0)
            if (r0 == 0) goto L5f
            java.lang.String[] r0 = new java.lang.String[]{r1}
            r1 = 6
            java.util.List r5 = nx.AbstractC5178p.m10112W(r5, r0, r1)
            return r5
        L5f:
            java.util.List r5 = og.pe.m10833h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6025e(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6026f(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fn.C2331d
            if (r0 == 0) goto L13
            r0 = r8
            fn.d r0 = (fn.C2331d) r0
            int r1 = r0.f10571c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10571c = r1
            goto L18
        L13:
            fn.d r0 = new fn.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f10569a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10571c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            og.od.m10798c(r8)
            r0.f10571c = r3
            km.a r8 = r7.f10585a
            km.o r8 = (km.C4120o) r8
            java.lang.String r2 = "call_recording_downloading_ids"
            java.lang.Object r8 = r8.m8886h(r2, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.length()
            if (r0 != 0) goto L4c
            rw.s r8 = rw.C6669s.f31944a
            return r8
        L4c:
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            java.util.List r8 = nx.AbstractC5178p.m10112W(r8, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L60:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = ":"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r2 = nx.AbstractC5178p.m10112W(r2, r4, r1)
            int r4 = r2.size()
            r5 = 2
            r6 = 0
            if (r4 != r5) goto L9c
            r4 = 0
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = nx.AbstractC5185w.m10140v(r4)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Long r2 = nx.AbstractC5185w.m10141w(r2)
            if (r4 == 0) goto L9c
            if (r2 == 0) goto L9c
            qw.k r6 = new qw.k
            r6.<init>(r4, r2)
        L9c:
            if (r6 == 0) goto L60
            r0.add(r6)
            goto L60
        La2:
            java.util.Map r8 = rw.AbstractC6674x.m12784l(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6026f(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6027g(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.C2332e
            if (r0 == 0) goto L13
            r0 = r5
            fn.e r0 = (fn.C2332e) r0
            int r1 = r0.f10574c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10574c = r1
            goto L18
        L13:
            fn.e r0 = new fn.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10572a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10574c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f10574c = r3
            km.a r5 = r4.f10585a
            km.o r5 = (km.C4120o) r5
            java.lang.String r2 = "date_time_recording_variant"
            java.lang.Object r5 = r5.m8886h(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = (java.lang.String) r5
            xw.a r0 = yv.EnumC8786a.getEntries()
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r0.next()
            r2 = r1
            yv.a r2 = (yv.EnumC8786a) r2
            java.lang.String r2 = r2.name()
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r5)
            if (r2 == 0) goto L4b
            return r1
        L63:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6027g(ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public final Object m6028h(String str, AbstractC8193c abstractC8193c) {
        return ((C4120o) this.f10585a).m8886h(str, abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6029i(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.C2333f
            if (r0 == 0) goto L13
            r0 = r5
            fn.f r0 = (fn.C2333f) r0
            int r1 = r0.f10577c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10577c = r1
            goto L18
        L13:
            fn.f r0 = new fn.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10575a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10577c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f10577c = r3
            km.a r5 = r4.f10585a
            km.o r5 = (km.C4120o) r5
            java.lang.String r2 = "addOnTime"
            java.lang.Object r5 = r5.m8886h(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r0 = r5.length()
            if (r0 != 0) goto L4b
            java.lang.String r5 = "00:00:00"
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6029i(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6030j(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.C2334g
            if (r0 == 0) goto L13
            r0 = r5
            fn.g r0 = (fn.C2334g) r0
            int r1 = r0.f10580c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10580c = r1
            goto L18
        L13:
            fn.g r0 = new fn.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10578a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10580c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f10580c = r3
            km.a r5 = r4.f10585a
            km.o r5 = (km.C4120o) r5
            java.lang.String r2 = "processTime"
            java.lang.Object r5 = r5.m8886h(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r0 = r5.length()
            if (r0 != 0) goto L4b
            java.lang.String r5 = "00:00:00"
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6030j(ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public final Object m6031k(String str, boolean z6, InterfaceC7559c interfaceC7559c) {
        Object objM8887i = ((C4120o) this.f10585a).m8887i(str, z6, interfaceC7559c);
        return objM8887i == EnumC7794a.COROUTINE_SUSPENDED ? objM8887i : a0.f30746a;
    }

    /* renamed from: l */
    public final Object m6032l(int i10, String str, AbstractC8193c abstractC8193c) {
        Object objM8888j = ((C4120o) this.f10585a).m8888j(i10, str, abstractC8193c);
        return objM8888j == EnumC7794a.COROUTINE_SUSPENDED ? objM8888j : a0.f30746a;
    }

    /* renamed from: m */
    public final Object m6033m(String str, long j6, AbstractC8193c abstractC8193c) {
        Object objM8889k = ((C4120o) this.f10585a).m8889k(str, j6, abstractC8193c);
        return objM8889k == EnumC7794a.COROUTINE_SUSPENDED ? objM8889k : a0.f30746a;
    }

    /* renamed from: n */
    public final Object m6034n(String str, String str2, AbstractC8193c abstractC8193c) {
        Object objM8891m = ((C4120o) this.f10585a).m8891m(str, str2, abstractC8193c);
        return objM8891m == EnumC7794a.COROUTINE_SUSPENDED ? objM8891m : a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6035o(int r12, ww.AbstractC8193c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof fn.C2335h
            if (r0 == 0) goto L13
            r0 = r13
            fn.h r0 = (fn.C2335h) r0
            int r1 = r0.f10584d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10584d = r1
            goto L18
        L13:
            fn.h r0 = new fn.h
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f10582b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10584d
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r13)
            return r3
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            int r12 = r0.f10581a
            og.od.m10798c(r13)
            goto L48
        L3a:
            og.od.m10798c(r13)
            r0.f10581a = r12
            r0.f10584d = r5
            java.lang.Object r13 = r11.m6026f(r0)
            if (r13 != r1) goto L48
            goto L81
        L48:
            java.util.Map r13 = (java.util.Map) r13
            java.util.LinkedHashMap r13 = rw.AbstractC6674x.m12786n(r13)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r12)
            java.lang.Object r2 = r13.remove(r2)
            if (r2 == 0) goto L82
            java.util.Set r13 = r13.entrySet()
            r5 = r13
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            cv.m r9 = new cv.m
            r13 = 8
            r9.<init>(r13)
            r10 = 30
            java.lang.String r6 = ","
            r7 = 0
            r8 = 0
            java.lang.String r13 = rw.AbstractC6663m.m12748L(r5, r6, r7, r8, r9, r10)
            r0.f10581a = r12
            r0.f10584d = r4
            km.a r12 = r11.f10585a
            km.o r12 = (km.C4120o) r12
            java.lang.String r2 = "call_recording_downloading_ids"
            java.lang.Object r12 = r12.m8891m(r2, r13, r0)
            if (r12 != r1) goto L82
        L81:
            return r1
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C2336i.m6035o(int, ww.c):java.lang.Object");
    }

    /* renamed from: p */
    public final Object m6036p(String str, AbstractC8193c abstractC8193c) {
        C4120o c4120o = (C4120o) this.f10585a;
        c4120o.getClass();
        Object objM10613c = df.m10613c(c4120o.m8881c(c4120o.f21052a), new C0388a(cf.m10584e(str), null, 24), abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        a0 a0Var = a0.f30746a;
        if (objM10613c != enumC7794a) {
            objM10613c = a0Var;
        }
        return objM10613c == enumC7794a ? objM10613c : a0Var;
    }

    /* renamed from: q */
    public final Object m6037q(long j6, AbstractC8193c abstractC8193c) {
        Object objM8889k = ((C4120o) this.f10585a).m8889k("call_note_api_call_time", j6, abstractC8193c);
        return objM8889k == EnumC7794a.COROUTINE_SUSPENDED ? objM8889k : a0.f30746a;
    }

    /* renamed from: r */
    public final Object m6038r(List list, AbstractC8199i abstractC8199i) {
        String strM8861h = new C4088h().m8861h(AbstractC6663m.c0(list));
        AbstractC4154l.m8920c(strM8861h);
        Object objM8891m = ((C4120o) this.f10585a).m8891m("lead_list", strM8861h, abstractC8199i);
        return objM8891m == EnumC7794a.COROUTINE_SUSPENDED ? objM8891m : a0.f30746a;
    }

    /* renamed from: s */
    public final Object m6039s(EnumC7204p enumC7204p, AbstractC8193c abstractC8193c) {
        Object objM8888j = ((C4120o) this.f10585a).m8888j(enumC7204p.ordinal(), "filter_lead_sim_selection", abstractC8193c);
        return objM8888j == EnumC7794a.COROUTINE_SUSPENDED ? objM8888j : a0.f30746a;
    }

    /* renamed from: t */
    public final Object m6040t(long j6, AbstractC8193c abstractC8193c) {
        Object objM8889k = ((C4120o) this.f10585a).m8889k("message_template_api_call_time", j6, abstractC8193c);
        return objM8889k == EnumC7794a.COROUTINE_SUSPENDED ? objM8889k : a0.f30746a;
    }
}
