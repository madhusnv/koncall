package og;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ze {
    /* renamed from: a */
    public static final long m11095a(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    /* renamed from: b */
    public static final long m11096b(long j6) {
        return (((j6 << 32) >> 33) & 4294967295L) | ((j6 >> 33) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11097c(ud.InterfaceC7411o r5, l4.C4367l r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof fa.C2226a
            if (r0 == 0) goto L13
            r0 = r7
            fa.a r0 = (fa.C2226a) r0
            int r1 = r0.f10213b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10213b = r1
            goto L18
        L13:
            fa.a r0 = new fa.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10212a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10213b
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
            gc.b r7 = ea.AbstractC1976f.f9241D
            java.lang.Object r5 = gc.AbstractC2562f.m6572a(r7, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L53
            r0.f10213b = r3
            java.lang.Object r7 = r6.m9139s(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            ja.k r7 = (ja.C3617k) r7
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r5)
            java.lang.String r5 = "auth_scheme_preference"
            r6 = 0
            java.lang.String r5 = r7.m8168a(r5, r6)
        L53:
            if (r5 == 0) goto Ld1
            java.lang.String r6 = ","
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r7 = 6
            java.util.List r5 = nx.AbstractC5178p.m10112W(r5, r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r0 = rw.AbstractC6664n.m12768r(r5, r7)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = nx.AbstractC5178p.g0(r0)
            java.lang.String r0 = r0.toString()
            r6.add(r0)
            goto L6f
        L87:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L92:
            if (r2 >= r0) goto La7
            java.lang.Object r3 = r6.get(r2)
            int r2 = r2 + 1
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L92
            r5.add(r3)
            goto L92
        La7:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = rw.AbstractC6664n.m12768r(r5, r7)
            r6.<init>(r7)
            int r7 = r5.size()
        Lb4:
            if (r1 >= r7) goto Lcc
            java.lang.Object r0 = r5.get(r1)
            int r1 = r1 + 1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "id"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r0, r2)
            rb.b r2 = new rb.b
            r2.<init>(r0)
            r6.add(r2)
            goto Lb4
        Lcc:
            java.util.List r5 = rw.AbstractC6663m.c0(r6)
            return r5
        Ld1:
            rw.r r5 = rw.C6668r.f31943a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: og.ze.m11097c(ud.o, l4.l, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public static final long m11098d(long j6) {
        return (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32);
    }
}
