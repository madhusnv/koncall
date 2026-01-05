package fo;

import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.DynamicFieldResponse;
import es.C2126c;
import es.EnumC2125b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kk.C4088h;
import kotlin.jvm.internal.AbstractC4154l;
import xm.r3;
import xm.y5;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.l */
/* loaded from: classes3.dex */
public final class C2348l {

    /* renamed from: a */
    public final y5 f10661a;

    /* renamed from: b */
    public final C8805t f10662b;

    /* renamed from: c */
    public final r3 f10663c;

    public C2348l(y5 userSIMRepository, C8805t c8805t, r3 r3Var) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f10661a = userSIMRepository;
        this.f10662b = c8805t;
        this.f10663c = r3Var;
    }

    /* renamed from: a */
    public static ArrayList m6041a(Map jsonMap) {
        String strM4859a;
        String strM4859a2;
        String strM4859a3;
        AbstractC4154l.m8923f(jsonMap, "jsonMap");
        ArrayList arrayList = new ArrayList();
        for (String str : jsonMap.keySet()) {
            DynamicFieldResponse dynamicFieldResponse = (DynamicFieldResponse) jsonMap.get(str);
            Object objM4860b = dynamicFieldResponse != null ? dynamicFieldResponse.m4860b() : null;
            String str2 = "";
            if (objM4860b instanceof String) {
                EnumC2125b enumC2125b = EnumC2125b.TypeSimple;
                DynamicFieldResponse dynamicFieldResponse2 = (DynamicFieldResponse) jsonMap.get(str);
                if (dynamicFieldResponse2 != null && (strM4859a = dynamicFieldResponse2.m4859a()) != null) {
                    str2 = strM4859a;
                }
                DynamicFieldResponse dynamicFieldResponse3 = (DynamicFieldResponse) jsonMap.get(str);
                arrayList.add(new C2126c(enumC2125b, new DynamicFieldResponse(str2, String.valueOf(dynamicFieldResponse3 != null ? dynamicFieldResponse3.m4860b() : null))));
            } else if (objM4860b instanceof List) {
                C4088h c4088h = new C4088h();
                ArrayList arrayList2 = new ArrayList();
                DynamicFieldResponse dynamicFieldResponse4 = (DynamicFieldResponse) jsonMap.get(str);
                Object objM4860b2 = dynamicFieldResponse4 != null ? dynamicFieldResponse4.m4860b() : null;
                AbstractC4154l.m8921d(objM4860b2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                Iterator it = ((List) objM4860b2).iterator();
                while (it.hasNext()) {
                    arrayList2.add(((DynamicFieldResponse) c4088h.m8855b(DynamicFieldResponse.class, c4088h.m8861h(it.next()))).m4859a());
                }
                EnumC2125b enumC2125b2 = EnumC2125b.TypeChipList;
                DynamicFieldResponse dynamicFieldResponse5 = (DynamicFieldResponse) jsonMap.get(str);
                if (dynamicFieldResponse5 != null && (strM4859a2 = dynamicFieldResponse5.m4859a()) != null) {
                    str2 = strM4859a2;
                }
                arrayList.add(new C2126c(enumC2125b2, new DynamicFieldResponse(str2, arrayList2)));
            } else {
                C4088h c4088h2 = new C4088h();
                DynamicFieldResponse dynamicFieldResponse6 = (DynamicFieldResponse) jsonMap.get(str);
                DynamicFieldResponse dynamicFieldResponse7 = (DynamicFieldResponse) new C4088h().m8855b(DynamicFieldResponse.class, c4088h2.m8861h(dynamicFieldResponse6 != null ? dynamicFieldResponse6.m4860b() : null));
                EnumC2125b enumC2125b3 = EnumC2125b.TypeSimple;
                DynamicFieldResponse dynamicFieldResponse8 = (DynamicFieldResponse) jsonMap.get(str);
                if (dynamicFieldResponse8 != null && (strM4859a3 = dynamicFieldResponse8.m4859a()) != null) {
                    str2 = strM4859a3;
                }
                arrayList.add(new C2126c(enumC2125b3, new DynamicFieldResponse(str2, dynamicFieldResponse7.m4859a())));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m6042c(Map map) {
        for (DynamicFieldResponse dynamicFieldResponse : map.values()) {
            String lowerCase = dynamicFieldResponse.m4859a().toLowerCase(Locale.ROOT);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("email")) {
                return dynamicFieldResponse.m4860b().toString();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6043b(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fo.C2342f
            if (r0 == 0) goto L13
            r0 = r6
            fo.f r0 = (fo.C2342f) r0
            int r1 = r0.f10606d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10606d = r1
            goto L18
        L13:
            fo.f r0 = new fo.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f10604b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10606d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f10603a
            og.od.m10798c(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f10603a = r5
            r0.f10606d = r3
            xm.y5 r6 = r4.f10661a
            java.io.Serializable r6 = r6.m15694j(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 0
            if (r0 <= r3) goto L4b
            goto L4c
        L4b:
            r3 = r1
        L4c:
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r6.next()
            r2 = r0
            mm.m r2 = (mm.C4802m) r2
            java.lang.String r2 = r2.f23891c
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r5)
            if (r2 == 0) goto L50
            goto L67
        L66:
            r0 = 0
        L67:
            mm.m r0 = (mm.C4802m) r0
            if (r0 == 0) goto L73
            es.a r5 = new es.a
            int r6 = r0.f23893e
            r5.<init>(r3, r6)
            return r5
        L73:
            es.a r5 = new es.a
            r6 = -1
            r5.<init>(r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.C2348l.m6043b(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6044d(java.lang.String r6, java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof fo.C2343g
            if (r0 == 0) goto L13
            r0 = r8
            fo.g r0 = (fo.C2343g) r0
            int r1 = r0.f10611e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10611e = r1
            goto L18
        L13:
            fo.g r0 = new fo.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f10609c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10611e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.f10608b
            java.lang.String r6 = r0.f10607a
            og.od.m10798c(r8)
            goto L4c
        L3a:
            og.od.m10798c(r8)
            r0.f10607a = r6
            r0.f10608b = r7
            r0.f10611e = r4
            xm.y5 r8 = r5.f10661a
            java.lang.Object r8 = r8.m15702r(r7, r0)
            if (r8 != r1) goto L4c
            goto L69
        L4c:
            mm.m r8 = (mm.C4802m) r8
            r2 = 0
            if (r8 == 0) goto L6b
            boolean r4 = r8.f23902n
            if (r4 != 0) goto L56
            goto L6b
        L56:
            com.websoptimization.callyzerbiz.data.model.request.GetLeadByNumberRequest r7 = new com.websoptimization.callyzerbiz.data.model.request.GetLeadByNumberRequest
            r7.<init>(r6, r8)
            r0.f10607a = r2
            r0.f10608b = r2
            r0.f10611e = r3
            xm.r3 r6 = r5.f10663c
            java.lang.Object r6 = r6.m15606e(r7, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r6
        L6b:
            java.lang.String r8 = "Lead User Sim Details not found for "
            java.lang.String r0 = ", lead number: "
            java.lang.String r6 = a2.AbstractC0030c.m121l(r8, r7, r0, r6)
            com.websoptimization.callyzerbiz.common.exception.SimStateException r7 = new com.websoptimization.callyzerbiz.common.exception.SimStateException
            com.websoptimization.callyzerbiz.common.exception.SimStateException$a r8 = com.websoptimization.callyzerbiz.common.exception.SimStateException.EnumC1456a.NO_LEAD_CONNECTED_SIM_FOUND
            r7.<init>(r8, r6)
            yv.t r8 = r5.f10662b
            r8.m16234i(r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.C2348l.m6044d(java.lang.String, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6045e(java.lang.String r6, java.lang.String r7, int r8, ww.AbstractC8193c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof fo.C2344h
            if (r0 == 0) goto L13
            r0 = r9
            fo.h r0 = (fo.C2344h) r0
            int r1 = r0.f10617f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10617f = r1
            goto L18
        L13:
            fo.h r0 = new fo.h
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f10615d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10617f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r8 = r0.f10614c
            java.lang.String r7 = r0.f10613b
            java.lang.String r6 = r0.f10612a
            og.od.m10798c(r9)
            goto L50
        L3c:
            og.od.m10798c(r9)
            r0.f10612a = r6
            r0.f10613b = r7
            r0.f10614c = r8
            r0.f10617f = r4
            xm.y5 r9 = r5.f10661a
            java.lang.Object r9 = r9.m15702r(r7, r0)
            if (r9 != r1) goto L50
            goto L71
        L50:
            mm.m r9 = (mm.C4802m) r9
            r2 = 0
            if (r9 == 0) goto L73
            boolean r4 = r9.f23902n
            if (r4 != 0) goto L5a
            goto L73
        L5a:
            com.websoptimization.callyzerbiz.data.model.request.LeadCallHistoryRequest r7 = new com.websoptimization.callyzerbiz.data.model.request.LeadCallHistoryRequest
            r4 = 50
            r7.<init>(r6, r8, r4, r9)
            r0.f10612a = r2
            r0.f10613b = r2
            r0.f10614c = r8
            r0.f10617f = r3
            xm.r3 r6 = r5.f10663c
            java.lang.Object r6 = r6.m15607f(r7, r0)
            if (r6 != r1) goto L72
        L71:
            return r1
        L72:
            return r6
        L73:
            java.lang.String r8 = "Lead User Sim Details not found for "
            java.lang.String r9 = ", lead number: "
            java.lang.String r6 = a2.AbstractC0030c.m121l(r8, r7, r9, r6)
            com.websoptimization.callyzerbiz.common.exception.SimStateException r7 = new com.websoptimization.callyzerbiz.common.exception.SimStateException
            com.websoptimization.callyzerbiz.common.exception.SimStateException$a r8 = com.websoptimization.callyzerbiz.common.exception.SimStateException.EnumC1456a.NO_LEAD_CONNECTED_SIM_FOUND
            r7.<init>(r8, r6)
            yv.t r8 = r5.f10662b
            r8.m16234i(r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.C2348l.m6045e(java.lang.String, java.lang.String, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6046f(java.lang.String r6, java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof fo.C2345i
            if (r0 == 0) goto L13
            r0 = r8
            fo.i r0 = (fo.C2345i) r0
            int r1 = r0.f10622e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10622e = r1
            goto L18
        L13:
            fo.i r0 = new fo.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f10620c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10622e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.f10619b
            java.lang.String r6 = r0.f10618a
            og.od.m10798c(r8)
            goto L4c
        L3a:
            og.od.m10798c(r8)
            r0.f10618a = r6
            r0.f10619b = r7
            r0.f10622e = r4
            xm.y5 r8 = r5.f10661a
            java.lang.Object r8 = r8.m15702r(r7, r0)
            if (r8 != r1) goto L4c
            goto L69
        L4c:
            mm.m r8 = (mm.C4802m) r8
            r2 = 0
            if (r8 == 0) goto L6b
            boolean r4 = r8.f23902n
            if (r4 != 0) goto L56
            goto L6b
        L56:
            com.websoptimization.callyzerbiz.data.model.request.LeadSummaryRequest r7 = new com.websoptimization.callyzerbiz.data.model.request.LeadSummaryRequest
            r7.<init>(r6, r8)
            r0.f10618a = r2
            r0.f10619b = r2
            r0.f10622e = r3
            xm.r3 r6 = r5.f10663c
            java.lang.Object r6 = r6.m15608g(r7, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r6
        L6b:
            java.lang.String r8 = "Lead User Sim Details not found for "
            java.lang.String r0 = ", lead number: "
            java.lang.String r6 = a2.AbstractC0030c.m121l(r8, r7, r0, r6)
            com.websoptimization.callyzerbiz.common.exception.SimStateException r7 = new com.websoptimization.callyzerbiz.common.exception.SimStateException
            com.websoptimization.callyzerbiz.common.exception.SimStateException$a r8 = com.websoptimization.callyzerbiz.common.exception.SimStateException.EnumC1456a.NO_LEAD_CONNECTED_SIM_FOUND
            r7.<init>(r8, r6)
            yv.t r8 = r5.f10662b
            r8.m16234i(r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.C2348l.m6046f(java.lang.String, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x037d A[LOOP:1: B:81:0x037b->B:82:0x037d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x036b A[EDGE_INSN: B:95:0x036b->B:80:0x036b BREAK  A[LOOP:0: B:72:0x0349->B:97:0x0349], SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6047g(com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.LeadByNumberResponse r39, ww.AbstractC8193c r40) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.C2348l.m6047g(com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.LeadByNumberResponse, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b1 A[LOOP:1: B:90:0x03af->B:91:0x03b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d5  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6048h(com.websoptimization.callyzerbiz.data.model.response.lead.Leads r39, ww.AbstractC8193c r40) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.C2348l.m6048h(com.websoptimization.callyzerbiz.data.model.response.lead.Leads, ww.c):java.lang.Object");
    }
}
