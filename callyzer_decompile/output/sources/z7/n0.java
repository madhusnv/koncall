package z7;

import al.C0182j;
import ex.InterfaceC2137a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4154l;
import o6.C5322x;
import og.qe;
import qw.C6361k;
import rw.AbstractC6674x;
import sq.n2;
import sw.C6964h;
import tx.C7265y;
import yt.C8769a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: l */
    public static final String[] f42783l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a */
    public final AbstractC8894w f42784a;

    /* renamed from: b */
    public final HashMap f42785b;

    /* renamed from: c */
    public final HashMap f42786c;

    /* renamed from: d */
    public final boolean f42787d;

    /* renamed from: e */
    public final vr.b0 f42788e;

    /* renamed from: g */
    public final String[] f42790g;

    /* renamed from: h */
    public final C0182j f42791h;

    /* renamed from: i */
    public final C5322x f42792i;

    /* renamed from: j */
    public final AtomicBoolean f42793j = new AtomicBoolean(false);

    /* renamed from: k */
    public InterfaceC2137a f42794k = new n2(23);

    /* renamed from: f */
    public final LinkedHashMap f42789f = new LinkedHashMap();

    public n0(AbstractC8894w abstractC8894w, HashMap map, HashMap map2, String[] strArr, boolean z6, vr.b0 b0Var) {
        String lowerCase;
        this.f42784a = abstractC8894w;
        this.f42785b = map;
        this.f42786c = map2;
        this.f42787d = z6;
        this.f42788e = b0Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
            this.f42789f.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f42785b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f42790g = strArr2;
        for (Map.Entry entry : this.f42785b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            AbstractC4154l.m8922e(lowerCase3, "toLowerCase(...)");
            if (this.f42789f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC4154l.m8922e(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f42789f;
                linkedHashMap.put(lowerCase4, AbstractC6674x.m12774b(linkedHashMap, lowerCase3));
            }
        }
        int length2 = this.f42790g.length;
        C0182j c0182j = new C0182j();
        c0182j.f555b = new ReentrantLock();
        c0182j.f556c = new long[length2];
        c0182j.f557d = new boolean[length2];
        this.f42791h = c0182j;
        this.f42792i = new C5322x(this.f42790g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16377a(z7.n0 r4, z7.InterfaceC8888q r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof z7.f0
            if (r0 == 0) goto L13
            r0 = r6
            z7.f0 r0 = (z7.f0) r0
            int r1 = r0.f42726d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42726d = r1
            goto L18
        L13:
            z7.f0 r0 = new z7.f0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f42724b
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r0.f42726d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.f42723a
            java.util.Set r5 = (java.util.Set) r5
            og.od.m10798c(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.f42723a
            z7.q r5 = (z7.InterfaceC8888q) r5
            og.od.m10798c(r4)
            goto L55
        L3e:
            og.od.m10798c(r4)
            ub.i r4 = new ub.i
            r1 = 28
            r4.<init>(r1)
            r0.f42723a = r5
            r0.f42726d = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.mo1780a(r1, r4, r0)
            if (r4 != r6) goto L55
            goto L6c
        L55:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6d
            r0.f42723a = r4
            r0.f42726d = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = pg.u9.m11886a(r5, r1, r0)
            if (r5 != r6) goto L6d
        L6c:
            return r6
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.n0.m16377a(z7.n0, z7.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16378b(z7.n0 r9, ww.AbstractC8193c r10) throws java.lang.Throwable {
        /*
            z7.w r0 = r9.f42784a
            boolean r1 = r10 instanceof z7.h0
            if (r1 == 0) goto L15
            r1 = r10
            z7.h0 r1 = (z7.h0) r1
            int r2 = r1.f42739e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f42739e = r2
            goto L1a
        L15:
            z7.h0 r1 = new z7.h0
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.f42737c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f42739e
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            c9.e r9 = r1.f42736b
            z7.n0 r0 = r1.f42735a
            og.od.m10798c(r10)     // Catch: java.lang.Throwable -> L31
            r8 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            goto L7b
        L31:
            r10 = move-exception
            goto L9a
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            og.od.m10798c(r10)
            c9.e r10 = r0.f42837g
            boolean r3 = r10.m2608r()
            rw.t r5 = rw.C6670t.f31945a
            if (r3 == 0) goto L9e
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.f42793j     // Catch: java.lang.Throwable -> L91
            r6 = 0
            boolean r3 = r3.compareAndSet(r4, r6)     // Catch: java.lang.Throwable -> L91
            if (r3 != 0) goto L55
            r10.m2592K()
            return r5
        L55:
            ex.a r3 = r9.f42794k     // Catch: java.lang.Throwable -> L91
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L91
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L91
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L91
            if (r3 != 0) goto L67
            r10.m2592K()
            return r5
        L67:
            z7.i0 r3 = new z7.i0     // Catch: java.lang.Throwable -> L91
            r5 = 0
            r7 = 1
            r3.<init>(r9, r5, r7)     // Catch: java.lang.Throwable -> L91
            r1.f42735a = r9     // Catch: java.lang.Throwable -> L91
            r1.f42736b = r10     // Catch: java.lang.Throwable -> L91
            r1.f42739e = r4     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = r0.m16400w(r6, r3, r1)     // Catch: java.lang.Throwable -> L91
            if (r0 != r2) goto L7b
            return r2
        L7b:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L91
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L96
            o6.x r1 = r9.f42792i     // Catch: java.lang.Throwable -> L91
            r1.m10468c(r0)     // Catch: java.lang.Throwable -> L91
            vr.b0 r9 = r9.f42788e     // Catch: java.lang.Throwable -> L91
            r9.invoke(r0)     // Catch: java.lang.Throwable -> L91
            goto L96
        L91:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto L9a
        L96:
            r10.m2592K()
            return r0
        L9a:
            r9.m2592K()
            throw r10
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.n0.m16378b(z7.n0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (pg.u9.m11886a(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (pg.u9.m11886a(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:28:0x00e2). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16379c(z7.n0 r17, z7.e0 r18, int r19, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.n0.m16379c(z7.n0, z7.e0, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r4v4, types: [z7.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16380d(z7.n0 r8, z7.e0 r9, int r10, ww.AbstractC8193c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof z7.k0
            if (r0 == 0) goto L16
            r0 = r11
            z7.k0 r0 = (z7.k0) r0
            int r1 = r0.f42775h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f42775h = r1
            goto L1b
        L16:
            z7.k0 r0 = new z7.k0
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f42773f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f42775h
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f42772e
            int r9 = r0.f42771d
            java.lang.String[] r10 = r0.f42770c
            java.lang.String r2 = r0.f42769b
            z7.q r4 = r0.f42768a
            og.od.m10798c(r11)
            r11 = r10
            r10 = r4
            goto L85
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            og.od.m10798c(r11)
            java.lang.String[] r8 = r8.f42790g
            r8 = r8[r10]
            java.lang.String[] r10 = z7.n0.f42783l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L87
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = p020v.a1.m14328h(r6, r5, r4)
            r0.f42768a = r10
            r0.f42769b = r2
            r0.f42770c = r11
            r0.f42771d = r9
            r0.f42772e = r8
            r0.f42775h = r3
            java.lang.Object r4 = pg.u9.m11886a(r10, r4, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            int r9 = r9 + r3
            goto L50
        L87:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.n0.m16380d(z7.n0, z7.e0, int, ww.c):java.lang.Object");
    }

    /* renamed from: e */
    public final void m16381e(InterfaceC2137a onRefreshScheduled, InterfaceC2137a onRefreshCompleted) {
        AbstractC4154l.m8923f(onRefreshScheduled, "onRefreshScheduled");
        AbstractC4154l.m8923f(onRefreshCompleted, "onRefreshCompleted");
        if (this.f42793j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            tx.c0.m13502y(this.f42784a.m16390i(), new C7265y("Room Invalidation Tracker Refresh"), null, new C8769a(this, onRefreshCompleted, null, 5), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16382f(ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof z7.l0
            if (r0 == 0) goto L13
            r0 = r8
            z7.l0 r0 = (z7.l0) r0
            int r1 = r0.f42780d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42780d = r1
            goto L18
        L13:
            z7.l0 r0 = new z7.l0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f42778b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f42780d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            c9.e r0 = r0.f42777a
            og.od.m10798c(r8)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r8 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            og.od.m10798c(r8)
            z7.w r8 = r7.f42784a
            c9.e r2 = r8.f42837g
            boolean r4 = r2.m2608r()
            if (r4 == 0) goto L5e
            z7.i0 r4 = new z7.i0     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r6 = 2
            r4.<init>(r7, r5, r6)     // Catch: java.lang.Throwable -> L58
            r0.f42777a = r2     // Catch: java.lang.Throwable -> L58
            r0.f42780d = r3     // Catch: java.lang.Throwable -> L58
            r3 = 0
            java.lang.Object r8 = r8.m16400w(r3, r4, r0)     // Catch: java.lang.Throwable -> L58
            if (r8 != r1) goto L53
            return r1
        L53:
            r0 = r2
        L54:
            r0.m2592K()
            goto L5e
        L58:
            r8 = move-exception
            r0 = r2
        L5a:
            r0.m2592K()
            throw r8
        L5e:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.n0.m16382f(ww.c):java.lang.Object");
    }

    /* renamed from: g */
    public final C6361k m16383g(String[] strArr) {
        C6964h c6964h = new C6964h();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f42786c.get(lowerCase);
            if (set != null) {
                c6964h.addAll(set);
            } else {
                c6964h.add(str);
            }
        }
        String[] strArr2 = (String[]) qe.m10855a(c6964h).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr2[i10];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) this.f42789f.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i10] = num.intValue();
        }
        return new C6361k(strArr2, iArr);
    }
}
