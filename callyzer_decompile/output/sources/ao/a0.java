package ao;

import android.database.Cursor;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.Iterator;
import java.util.Map;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import yv.C8791f;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C8791f f2896a;

    /* renamed from: b */
    public c0 f2897b;

    /* renamed from: c */
    public Cursor f2898c;

    /* renamed from: d */
    public LocalDateTime f2899d;

    /* renamed from: e */
    public StringBuilder f2900e;

    /* renamed from: f */
    public Map f2901f;

    /* renamed from: g */
    public Iterator f2902g;

    /* renamed from: h */
    public a0 f2903h;

    /* renamed from: j */
    public LocalDateTime f2904j;

    /* renamed from: k */
    public C8800o f2905k;

    /* renamed from: l */
    public LocalDateTime f2906l;

    /* renamed from: m */
    public int f2907m;

    /* renamed from: n */
    public int f2908n;

    /* renamed from: p */
    public int f2909p;

    /* renamed from: q */
    public int f2910q;

    /* renamed from: r */
    public int f2911r;

    /* renamed from: s */
    public int f2912s;

    /* renamed from: t */
    public int f2913t;

    /* renamed from: v */
    public /* synthetic */ Object f2914v;

    /* renamed from: w */
    public final /* synthetic */ c0 f2915w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f2915w = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1385d(ao.c0 r9, ww.AbstractC8193c r10) throws java.lang.Exception {
        /*
            boolean r0 = r10 instanceof ao.C0387z
            if (r0 == 0) goto L13
            r0 = r10
            ao.z r0 = (ao.C0387z) r0
            int r1 = r0.f3080d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3080d = r1
            goto L18
        L13:
            ao.z r0 = new ao.z
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f3079c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3080d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.StringBuilder r9 = r0.f3078b
            ao.c0 r0 = r0.f3077a
            og.od.m10798c(r10)
            goto L72
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            ao.c0 r9 = r0.f3077a
            og.od.m10798c(r10)
            goto L4a
        L3c:
            og.od.m10798c(r10)
            r0.f3077a = r9
            r0.f3080d = r4
            java.lang.Object r10 = r9.m1396k(r0)
            if (r10 != r1) goto L4a
            goto L6d
        L4a:
            java.lang.StringBuilder r10 = (java.lang.StringBuilder) r10
            long r4 = r9.f2937o
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L94
            xm.x1 r2 = r9.f2927e
            r0.f3077a = r9
            r0.f3078b = r10
            r0.f3080d = r3
            yx.d r3 = r2.f40994d
            uw.h r3 = r3.f42488a
            xm.r0 r4 = new xm.r0
            r5 = 0
            r6 = 6
            r4.<init>(r2, r5, r6)
            java.lang.Object r0 = tx.c0.m13475K(r3, r4, r0)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r8 = r0
            r0 = r9
            r9 = r10
            r10 = r8
        L72:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != 0) goto L94
            java.lang.String r10 = " >>> No CallLog found "
            r9.append(r10)
            yv.t r10 = r0.f2928f
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r9, r0)
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "No CallLog Found"
            r0.<init>(r1)
            r10.m16239n(r9, r0)
        L94:
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.a0.m1385d(ao.c0, ww.c):java.lang.Object");
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        a0 a0Var = new a0(this.f2915w, interfaceC7559c);
        a0Var.f2914v = obj;
        return a0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x010b: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:268), block:B:40:0x010a */
    /* JADX WARN: Path cross not found for [B:119:0x0314, B:124:0x0323], limit reached: 194 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0339 A[Catch: Exception -> 0x0109, TryCatch #4 {Exception -> 0x0109, blocks: (B:37:0x0101, B:133:0x0378, B:135:0x037f, B:150:0x043f, B:117:0x030c, B:119:0x0314, B:121:0x031c, B:125:0x0331, B:127:0x0339, B:129:0x0348, B:124:0x0323, B:47:0x0134, B:113:0x02dd, B:50:0x0146, B:54:0x015c), top: B:204:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037f A[Catch: Exception -> 0x0109, TRY_LEAVE, TryCatch #4 {Exception -> 0x0109, blocks: (B:37:0x0101, B:133:0x0378, B:135:0x037f, B:150:0x043f, B:117:0x030c, B:119:0x0314, B:121:0x031c, B:125:0x0331, B:127:0x0339, B:129:0x0348, B:124:0x0323, B:47:0x0134, B:113:0x02dd, B:50:0x0146, B:54:0x015c), top: B:204:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e3 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ed, blocks: (B:32:0x00dd, B:139:0x03ce, B:141:0x03e3), top: B:198:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043f A[Catch: Exception -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0109, blocks: (B:37:0x0101, B:133:0x0378, B:135:0x037f, B:150:0x043f, B:117:0x030c, B:119:0x0314, B:121:0x031c, B:125:0x0331, B:127:0x0339, B:129:0x0348, B:124:0x0323, B:47:0x0134, B:113:0x02dd, B:50:0x0146, B:54:0x015c), top: B:204:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0483 A[Catch: Exception -> 0x04cd, TryCatch #2 {Exception -> 0x04cd, blocks: (B:164:0x04c1, B:157:0x047d, B:159:0x0483, B:161:0x048d, B:169:0x04d1, B:166:0x04c9), top: B:200:0x04c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ec A[PHI: r0 r4
      0x01ec: PHI (r0v20 yv.f) = (r0v17 yv.f), (r0v33 yv.f) binds: [B:78:0x01e8, B:59:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v5 java.lang.Object) binds: [B:78:0x01e8, B:59:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025d  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x04bd -> B:200:0x04c1). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
