package s1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4165w;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import q1.C6093u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ C6093u f32100a;

    /* renamed from: b */
    public final /* synthetic */ int f32101b;

    /* renamed from: c */
    public final /* synthetic */ float f32102c;

    /* renamed from: d */
    public final /* synthetic */ C4165w f32103d;

    /* renamed from: e */
    public final /* synthetic */ C4164v f32104e;

    /* renamed from: f */
    public final /* synthetic */ boolean f32105f;

    /* renamed from: g */
    public final /* synthetic */ float f32106g;

    /* renamed from: h */
    public final /* synthetic */ C4166x f32107h;

    /* renamed from: j */
    public final /* synthetic */ int f32108j;

    /* renamed from: k */
    public final /* synthetic */ C4168z f32109k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(C6093u c6093u, int i10, float f6, C4165w c4165w, C4164v c4164v, boolean z6, float f10, C4166x c4166x, int i11, C4168z c4168z) {
        super(1);
        this.f32100a = c6093u;
        this.f32101b = i10;
        this.f32102c = f6;
        this.f32103d = c4165w;
        this.f32104e = c4164v;
        this.f32105f = z6;
        this.f32106g = f10;
        this.f32107h = c4166x;
        this.f32108j = i11;
        this.f32109k = c4168z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r2
      0x0029: PHI (r2v16 float) = (r2v7 float), (r2v20 float) binds: [B:11:0x0039, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            h1.i r10 = (h1.C2778i) r10
            q1.u r0 = r9.f32100a
            int r1 = r9.f32101b
            boolean r2 = s1.n0.m12854c(r0, r1)
            kotlin.jvm.internal.v r3 = r9.f32104e
            boolean r4 = r9.f32105f
            r5 = 0
            if (r2 != 0) goto Lb5
            r2 = 0
            float r6 = r9.f32102c
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2b
            k2.e1 r2 = r10.f15457e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L29
            goto L3b
        L29:
            r6 = r2
            goto L3b
        L2b:
            k2.e1 r2 = r10.f15457e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L29
        L3b:
            kotlin.jvm.internal.w r2 = r9.f32103d
            float r7 = r2.f21161a
            float r6 = r6 - r7
            float r7 = r0.mo8445a(r6)
            boolean r8 = s1.n0.m12854c(r0, r1)
            if (r8 == 0) goto L4b
            goto Lb5
        L4b:
            boolean r8 = s1.n0.m12852a(r4, r0, r1)
            if (r8 != 0) goto Lb5
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 != 0) goto Laf
            float r7 = r2.f21161a
            float r7 = r7 + r6
            r2.f21161a = r7
            float r2 = r9.f32106g
            if (r4 == 0) goto L72
            k2.e1 r6 = r10.f15457e
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L86
            r10.m6826a()
            goto L86
        L72:
            k2.e1 r6 = r10.f15457e
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r2 = -r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L86
            r10.m6826a()
        L86:
            int r2 = r9.f32108j
            kotlin.jvm.internal.x r6 = r9.f32107h
            r7 = 2
            if (r4 == 0) goto L9f
            int r6 = r6.f21162a
            if (r6 < r7) goto Lb5
            int r6 = r0.m12129e()
            int r6 = r1 - r6
            if (r6 <= r2) goto Lb5
            int r2 = r1 - r2
            r0.m12130f(r2)
            goto Lb5
        L9f:
            int r6 = r6.f21162a
            if (r6 < r7) goto Lb5
            int r6 = r0.m12127c()
            int r6 = r6 - r1
            if (r6 <= r2) goto Lb5
            int r2 = r2 + r1
            r0.m12130f(r2)
            goto Lb5
        Laf:
            r10.m6826a()
            r3.f21160a = r5
            goto Lca
        Lb5:
            boolean r2 = s1.n0.m12852a(r4, r0, r1)
            if (r2 == 0) goto Lc4
            r0.m12130f(r1)
            r3.f21160a = r5
            r10.m6826a()
            goto Lca
        Lc4:
            boolean r10 = s1.n0.m12854c(r0, r1)
            if (r10 != 0) goto Lcd
        Lca:
            qw.a0 r10 = qw.a0.f30746a
            return r10
        Lcd:
            int r10 = r0.m12126b(r1)
            s1.i r0 = new s1.i
            kotlin.jvm.internal.z r1 = r9.f32109k
            java.lang.Object r1 = r1.f21164a
            h1.k r1 = (h1.C2780k) r1
            r0.<init>(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.m0.invoke(java.lang.Object):java.lang.Object");
    }
}
