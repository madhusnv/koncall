package og;

import ex.InterfaceC2137a;
import java.util.Arrays;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import t2.AbstractC7011j;
import t2.AbstractC7013l;
import t2.C7002a;
import t2.InterfaceC7009h;
import t2.InterfaceC7012k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class hg {
    /* renamed from: a */
    public static final String m10690a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* renamed from: b */
    public static final Object m10691b(Object[] objArr, InterfaceC7012k interfaceC7012k, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        Object[] objArr2;
        Object obj;
        Object objMo12858d;
        if ((i11 & 2) != 0) {
            interfaceC7012k = AbstractC7013l.f33949a;
        }
        InterfaceC7012k interfaceC7012k2 = interfaceC7012k;
        C3966o c3966o = (C3966o) interfaceC3962k;
        int i12 = c3966o.f20462P;
        d2.m10599b(36);
        String string = Integer.toString(i12, 36);
        AbstractC4154l.m8922e(string, "toString(...)");
        AbstractC4154l.m8921d(interfaceC7012k2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        InterfaceC7009h interfaceC7009h = (InterfaceC7009h) c3966o.m8618k(AbstractC7011j.f33948a);
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (objM8596M == s0Var) {
            Object objMo2637a = (interfaceC7009h == null || (objMo12858d = interfaceC7009h.mo12858d(string)) == null) ? null : interfaceC7012k2.mo2637a(objMo12858d);
            if (objMo2637a == null) {
                objMo2637a = interfaceC2137a.invoke();
            }
            objArr2 = objArr;
            C7002a c7002a = new C7002a(interfaceC7012k2, interfaceC7009h, string, objMo2637a, objArr2);
            c3966o.j0(c7002a);
            objM8596M = c7002a;
        } else {
            objArr2 = objArr;
        }
        C7002a c7002a2 = (C7002a) objM8596M;
        Object objInvoke = Arrays.equals(objArr2, c7002a2.f33928e) ? c7002a2.f33927d : null;
        if (objInvoke == null) {
            objInvoke = interfaceC2137a.invoke();
        }
        boolean zM8616i = c3966o.m8616i(c7002a2) | c3966o.m8616i(interfaceC7012k2) | c3966o.m8616i(interfaceC7009h) | c3966o.m8614g(string) | c3966o.m8616i(objInvoke) | c3966o.m8616i(objArr2);
        Object objM8596M2 = c3966o.m8596M();
        if (zM8616i || objM8596M2 == s0Var) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            g2.t4 t4Var = new g2.t4(c7002a2, interfaceC7012k2, interfaceC7009h, string, obj, objArr3, 1);
            c3966o.j0(t4Var);
            objM8596M2 = t4Var;
        } else {
            obj = objInvoke;
        }
        C3953b.m8505h((InterfaceC2137a) objM8596M2, c3966o);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum m10692c(ud.InterfaceC7411o r5, l4.C4367l r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof ga.C2549a
            if (r0 == 0) goto L13
            r0 = r7
            ga.a r0 = (ga.C2549a) r0
            int r1 = r0.f13879b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13879b = r1
            goto L18
        L13:
            ga.a r0 = new ga.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13878a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f13879b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r7)
            gc.b r7 = ea.AbstractC1976f.f9239B
            java.lang.Object r5 = gc.AbstractC2562f.m6572a(r7, r5)
            ac.d r5 = (ac.EnumC0091d) r5
            if (r5 != 0) goto L9c
            r0.f13879b = r3
            java.lang.Object r7 = r6.m9139s(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            ja.k r7 = (ja.C3617k) r7
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r5)
            java.lang.String r5 = "request_checksum_calculation"
            r6 = 0
            java.lang.String r5 = r7.m8168a(r5, r6)
            if (r5 == 0) goto L96
            ac.d[] r7 = ac.EnumC0091d.values()
            int r0 = r7.length
            r1 = 0
        L5b:
            if (r1 >= r0) goto L6e
            r2 = r7[r1]
            java.lang.String r4 = r2.name()
            boolean r4 = nx.AbstractC5185w.m10130l(r4, r5, r3)
            if (r4 == 0) goto L6b
            r6 = r2
            goto L6e
        L6b:
            int r1 = r1 + 1
            goto L5b
        L6e:
            if (r6 == 0) goto L71
            goto L96
        L71:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "request_checksum_calculation '"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = "' is not supported, should be one of: "
            r6.append(r5)
            ac.d[] r5 = ac.EnumC0091d.values()
            ja.i r7 = ja.C3615i.f19252c
            rw.AbstractC6662l.m12700C(r5, r6, r7)
            java.lang.String r5 = r6.toString()
            aws.sdk.kotlin.runtime.ConfigurationException r6 = new aws.sdk.kotlin.runtime.ConfigurationException
            r6.<init>(r5)
            throw r6
        L96:
            if (r6 != 0) goto L9b
            ac.d r5 = ac.EnumC0091d.WHEN_SUPPORTED
            return r5
        L9b:
            return r6
        L9c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: og.hg.m10692c(ud.o, l4.l, ww.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum m10693d(ud.InterfaceC7411o r5, l4.C4367l r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof ga.C2550b
            if (r0 == 0) goto L13
            r0 = r7
            ga.b r0 = (ga.C2550b) r0
            int r1 = r0.f13881b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13881b = r1
            goto L18
        L13:
            ga.b r0 = new ga.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13880a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f13881b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r7)
            gc.b r7 = ea.AbstractC1976f.f9240C
            java.lang.Object r5 = gc.AbstractC2562f.m6572a(r7, r5)
            ac.e r5 = (ac.EnumC0092e) r5
            if (r5 != 0) goto L9c
            r0.f13881b = r3
            java.lang.Object r7 = r6.m9139s(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            ja.k r7 = (ja.C3617k) r7
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r5)
            java.lang.String r5 = "response_checksum_validation"
            r6 = 0
            java.lang.String r5 = r7.m8168a(r5, r6)
            if (r5 == 0) goto L96
            ac.e[] r7 = ac.EnumC0092e.values()
            int r0 = r7.length
            r1 = 0
        L5b:
            if (r1 >= r0) goto L6e
            r2 = r7[r1]
            java.lang.String r4 = r2.name()
            boolean r4 = nx.AbstractC5185w.m10130l(r4, r5, r3)
            if (r4 == 0) goto L6b
            r6 = r2
            goto L6e
        L6b:
            int r1 = r1 + 1
            goto L5b
        L6e:
            if (r6 == 0) goto L71
            goto L96
        L71:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "response_checksum_validation '"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = "' is not supported, should be one of: "
            r6.append(r5)
            ac.e[] r5 = ac.EnumC0092e.values()
            ja.i r7 = ja.C3615i.f19253d
            rw.AbstractC6662l.m12700C(r5, r6, r7)
            java.lang.String r5 = r6.toString()
            aws.sdk.kotlin.runtime.ConfigurationException r6 = new aws.sdk.kotlin.runtime.ConfigurationException
            r6.<init>(r5)
            throw r6
        L96:
            if (r6 != 0) goto L9b
            ac.e r5 = ac.EnumC0092e.WHEN_SUPPORTED
            return r5
        L9b:
            return r6
        L9c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: og.hg.m10693d(ud.o, l4.l, ww.c):java.lang.Enum");
    }
}
