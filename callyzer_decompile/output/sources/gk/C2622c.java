package gk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gk.c */
/* loaded from: classes.dex */
public final class C2622c {

    /* renamed from: a */
    public static final C2622c f14197a = new C2622c();

    /* renamed from: b */
    public static final Map f14198b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: a */
    public static C2620a m6595a(EnumC2623d enumC2623d) {
        Map dependencies = f14198b;
        AbstractC4154l.m8922e(dependencies, "dependencies");
        Object obj = dependencies.get(enumC2623d);
        if (obj != null) {
            return (C2620a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC2623d + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x009b, B:25:0x00b0, B:26:0x00c8), top: B:31:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009a). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6596b(ww.AbstractC8193c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof gk.C2621b
            if (r0 == 0) goto L13
            r0 = r11
            gk.b r0 = (gk.C2621b) r0
            int r1 = r0.f14196j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14196j = r1
            goto L18
        L13:
            gk.b r0 = new gk.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f14194g
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f14196j
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f14193f
            java.util.Map r4 = r0.f14192e
            java.util.Map r4 = (java.util.Map) r4
            dy.c r5 = r0.f14191d
            gk.d r6 = r0.f14190c
            java.util.Iterator r7 = r0.f14189b
            java.util.Map r8 = r0.f14188a
            java.util.Map r8 = (java.util.Map) r8
            og.od.m10798c(r11)
            goto L9a
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            og.od.m10798c(r11)
            java.lang.String r11 = "dependencies"
            java.util.Map r2 = gk.C2622c.f14198b
            kotlin.jvm.internal.AbstractC4154l.m8922e(r2, r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r4 = r2.size()
            int r4 = rw.AbstractC6674x.m12776d(r4)
            r11.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = r11
            r7 = r2
        L62:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lce
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            gk.d r6 = (gk.EnumC2623d) r6
            java.lang.Object r11 = r11.getValue()
            gk.a r11 = (gk.C2620a) r11
            dy.c r5 = r11.f14186a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.f14188a = r11
            r0.f14189b = r7
            r0.f14190c = r6
            r0.f14191d = r5
            r0.f14192e = r11
            r0.f14193f = r2
            r0.f14196j = r3
            java.lang.Object r11 = r5.mo1768h(r0)
            if (r11 != r1) goto L99
            return r1
        L99:
            r8 = r4
        L9a:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r9)     // Catch: java.lang.Throwable -> Lc9
            gk.a r9 = m6595a(r6)     // Catch: java.lang.Throwable -> Lc9
            wi.i r9 = r9.f14187b     // Catch: java.lang.Throwable -> Lc9
            if (r9 == 0) goto Lb0
            r5.mo1769j(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L62
        Lb0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            r5.mo1769j(r11)
            throw r0
        Lce:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.C2622c.m6596b(ww.c):java.lang.Object");
    }
}
