package k1;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4167y;
import p3.C5819q;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.x */
/* loaded from: classes.dex */
public final class C3949x extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public Object f20292b;

    /* renamed from: c */
    public Object f20293c;

    /* renamed from: d */
    public Object f20294d;

    /* renamed from: e */
    public C4167y f20295e;

    /* renamed from: f */
    public j2 f20296f;

    /* renamed from: g */
    public C5819q f20297g;

    /* renamed from: h */
    public boolean f20298h;

    /* renamed from: j */
    public float f20299j;

    /* renamed from: k */
    public int f20300k;

    /* renamed from: l */
    public /* synthetic */ Object f20301l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC4155m f20302m;

    /* renamed from: n */
    public final /* synthetic */ C4167y f20303n;

    /* renamed from: p */
    public final /* synthetic */ x0 f20304p;

    /* renamed from: q */
    public final /* synthetic */ AbstractC4155m f20305q;

    /* renamed from: r */
    public final /* synthetic */ AbstractC4155m f20306r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2137a f20307s;

    /* renamed from: t */
    public final /* synthetic */ AbstractC4155m f20308t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3949x(InterfaceC2137a interfaceC2137a, C4167y c4167y, x0 x0Var, InterfaceC2142f interfaceC2142f, InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a2, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20302m = (AbstractC4155m) interfaceC2137a;
        this.f20303n = c4167y;
        this.f20304p = x0Var;
        this.f20305q = (AbstractC4155m) interfaceC2142f;
        this.f20306r = (AbstractC4155m) interfaceC2141e;
        this.f20307s = interfaceC2137a2;
        this.f20308t = (AbstractC4155m) interfaceC2139c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ex.f, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ex.e, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C3949x c3949x = new C3949x(this.f20302m, this.f20303n, this.f20304p, this.f20305q, this.f20306r, this.f20307s, this.f20308t, interfaceC7559c);
        c3949x.f20301l = obj;
        return c3949x;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C3949x) create((p3.f0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0435, code lost:
    
        if (r5.m11384b(r7, r24) == r1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04a3, code lost:
    
        if (r4 == r1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0520, code lost:
    
        if (r4 == com.skydoves.balloon.internals.DefinitionKt.NO_Float_VALUE) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x017f, code lost:
    
        if (r6 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02e2, code lost:
    
        if (r3 == r1) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e0 A[PHI: r2 r4 r5 r6 r7 r9 r11 r12 r13 r16 r18
      0x01e0: PHI (r2v14 float) = (r2v12 float), (r2v15 float) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r4v11 kotlin.jvm.internal.y) = (r4v9 kotlin.jvm.internal.y), (r4v14 kotlin.jvm.internal.y) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r5v7 p3.f0) = (r5v5 p3.f0), (r5v10 p3.f0) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r6v8 p3.f0) = (r6v6 p3.f0), (r6v12 p3.f0) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r7v4 p3.q) = (r7v2 p3.q), (r7v5 p3.q) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r9v5 k1.j2) = (r9v3 k1.j2), (r9v6 k1.j2) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r11v2 kotlin.jvm.internal.y) = (r11v0 kotlin.jvm.internal.y), (r11v9 kotlin.jvm.internal.y) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r12v4 kotlin.jvm.internal.y) = (r12v2 kotlin.jvm.internal.y), (r12v5 kotlin.jvm.internal.y) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r13v2 java.lang.Object) = (r13v1 java.lang.Object), (r13v12 java.lang.Object) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r16v7 long) = (r16v5 long), (r16v8 long) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r18v7 long) = (r18v5 long), (r18v8 long) binds: [B:11:0x00e4, B:35:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b1  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [ex.e, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v26, types: [ex.f, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x030c -> B:91:0x02ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0345 -> B:115:0x0347). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x03ec -> B:158:0x0416). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0412 -> B:158:0x0416). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0435 -> B:162:0x0439). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x044a -> B:85:0x02af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x04a3 -> B:176:0x04a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0199 -> B:78:0x0299). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0218 -> B:47:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0262 -> B:78:0x0299). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x026a -> B:34:0x01c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x028d -> B:75:0x0290). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C3949x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
