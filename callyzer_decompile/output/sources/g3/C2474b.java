package g3;

import a3.C0045d;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import c3.C0847b;
import c3.C0848c;
import c3.C0850e;
import c6.AbstractC0880j;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1555i;
import d3.c0;
import d3.d0;
import d3.e0;
import d3.g0;
import d3.h0;
import f2.C2193p;
import f3.AbstractC2197c;
import f3.C2196b;
import kotlin.jvm.internal.AbstractC4155m;
import of.C5359n;
import og.c2;
import og.ze;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g3.b */
/* loaded from: classes.dex */
public final class C2474b {

    /* renamed from: a */
    public final InterfaceC2476d f13414a;

    /* renamed from: f */
    public Outline f13419f;

    /* renamed from: j */
    public float f13423j;

    /* renamed from: k */
    public h0 f13424k;

    /* renamed from: l */
    public g0 f13425l;

    /* renamed from: m */
    public C1555i f13426m;

    /* renamed from: n */
    public boolean f13427n;

    /* renamed from: o */
    public C2196b f13428o;

    /* renamed from: p */
    public C5359n f13429p;

    /* renamed from: q */
    public int f13430q;

    /* renamed from: s */
    public boolean f13432s;

    /* renamed from: t */
    public long f13433t;

    /* renamed from: u */
    public long f13434u;

    /* renamed from: v */
    public long f13435v;

    /* renamed from: w */
    public boolean f13436w;

    /* renamed from: x */
    public RectF f13437x;

    /* renamed from: b */
    public InterfaceC6747c f13415b = AbstractC2197c.f10127a;

    /* renamed from: c */
    public EnumC6757m f13416c = EnumC6757m.Ltr;

    /* renamed from: d */
    public AbstractC4155m f13417d = C2473a.f13411b;

    /* renamed from: e */
    public final C0045d f13418e = new C0045d(13, this);

    /* renamed from: g */
    public boolean f13420g = true;

    /* renamed from: h */
    public long f13421h = 0;

    /* renamed from: i */
    public long f13422i = 9205357640488583168L;

    /* renamed from: r */
    public final C2193p f13431r = new C2193p();

    static {
        int i10 = AbstractC2481i.f13515a;
        int i11 = AbstractC2481i.f13515a;
    }

    public C2474b(InterfaceC2476d interfaceC2476d) {
        this.f13414a = interfaceC2476d;
        interfaceC2476d.mo6371D(false);
        this.f13433t = 0L;
        this.f13434u = 0L;
        this.f13435v = 9205357640488583168L;
    }

    /* renamed from: a */
    public final void m6362a() {
        Outline outline;
        if (this.f13420g) {
            boolean z6 = this.f13436w;
            Outline outline2 = null;
            InterfaceC2476d interfaceC2476d = this.f13414a;
            if (z6 || interfaceC2476d.mo6376I() > DefinitionKt.NO_Float_VALUE) {
                g0 g0Var = this.f13425l;
                if (g0Var != null) {
                    RectF rectF = this.f13437x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f13437x = rectF;
                    }
                    boolean z10 = g0Var instanceof C1555i;
                    if (!z10) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((C1555i) g0Var).f7752a.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || ((C1555i) g0Var).f7752a.isConvex()) {
                        outline = this.f13419f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f13419f = outline;
                        }
                        if (i10 >= 30) {
                            AbstractC0880j.m2427k(outline, g0Var);
                        } else {
                            if (!z10) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((C1555i) g0Var).f7752a);
                        }
                        this.f13427n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f13419f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f13427n = true;
                        outline = null;
                    }
                    this.f13425l = g0Var;
                    if (outline != null) {
                        outline.setAlpha(interfaceC2476d.mo6379a());
                        outline2 = outline;
                    }
                    interfaceC2476d.mo6393p(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f13427n && this.f13436w) {
                        interfaceC2476d.mo6371D(false);
                        interfaceC2476d.mo6383f();
                    } else {
                        interfaceC2476d.mo6371D(this.f13436w);
                    }
                } else {
                    interfaceC2476d.mo6371D(this.f13436w);
                    Outline outline4 = this.f13419f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f13419f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM11098d = ze.m11098d(this.f13434u);
                    long j6 = this.f13421h;
                    long j10 = this.f13422i;
                    if (j10 != 9205357640488583168L) {
                        jM11098d = j10;
                    }
                    int i11 = (int) (j6 >> 32);
                    int i12 = (int) (j6 & 4294967295L);
                    int i13 = (int) (jM11098d >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (jM11098d & 4294967295L)) + Float.intBitsToFloat(i12)), this.f13423j);
                    outline5.setAlpha(interfaceC2476d.mo6379a());
                    interfaceC2476d.mo6393p(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i13)) << 32));
                }
            } else {
                interfaceC2476d.mo6371D(false);
                interfaceC2476d.mo6393p(null, 0L);
            }
        }
        this.f13420g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6363b() {
        /*
            r15 = this;
            boolean r0 = r15.f13432s
            if (r0 == 0) goto L69
            int r0 = r15.f13430q
            if (r0 != 0) goto L69
            f2.p r0 = r15.f13431r
            java.lang.Object r1 = r0.f10111b
            g3.b r1 = (g3.C2474b) r1
            if (r1 == 0) goto L16
            r1.m6366e()
            r1 = 0
            r0.f10111b = r1
        L16:
            java.lang.Object r0 = r0.f10113d
            e1.k0 r0 = (e1.k0) r0
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = r0.f9006b
            long[] r2 = r0.f9005a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L61
            r4 = 0
            r5 = r4
        L27:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5c
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L41:
            if (r10 >= r8) goto L5a
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            g3.b r11 = (g3.C2474b) r11
            r11.m6366e()
        L56:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L41
        L5a:
            if (r8 != r9) goto L61
        L5c:
            if (r5 == r3) goto L61
            int r5 = r5 + 1
            goto L27
        L61:
            r0.m5582b()
        L64:
            g3.d r0 = r15.f13414a
            r0.mo6383f()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.C2474b.m6363b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Type inference failed for: r1v5, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6364c(f3.InterfaceC2198d r15) {
        /*
            r14 = this;
            f2.p r0 = r14.f13431r
            java.lang.Object r1 = r0.f10111b
            g3.b r1 = (g3.C2474b) r1
            r0.f10112c = r1
            java.lang.Object r1 = r0.f10113d
            e1.k0 r1 = (e1.k0) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.m5588h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f10114e
            e1.k0 r2 = (e1.k0) r2
            if (r2 != 0) goto L23
            int r2 = e1.t0.f9058a
            e1.k0 r2 = new e1.k0
            r2.<init>()
            r0.f10114e = r2
        L23:
            r2.m5590j(r1)
            r1.m5582b()
        L29:
            r1 = 1
            r0.f10110a = r1
            kotlin.jvm.internal.m r1 = r14.f13417d
            r1.invoke(r15)
            r15 = 0
            r0.f10110a = r15
            java.lang.Object r1 = r0.f10112c
            g3.b r1 = (g3.C2474b) r1
            if (r1 == 0) goto L3d
            r1.m6366e()
        L3d:
            java.lang.Object r0 = r0.f10114e
            e1.k0 r0 = (e1.k0) r0
            if (r0 == 0) goto L90
            boolean r1 = r0.m5588h()
            if (r1 == 0) goto L90
            java.lang.Object[] r1 = r0.f9006b
            long[] r2 = r0.f9005a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8d
            r4 = r15
        L53:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L88
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6d:
            if (r9 >= r7) goto L86
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L82
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            g3.b r10 = (g3.C2474b) r10
            r10.m6366e()
        L82:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6d
        L86:
            if (r7 != r8) goto L8d
        L88:
            if (r4 == r3) goto L8d
            int r4 = r4 + 1
            goto L53
        L8d:
            r0.m5582b()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.C2474b.m6364c(f3.d):void");
    }

    /* renamed from: d */
    public final h0 m6365d() {
        h0 d0Var;
        h0 h0Var = this.f13424k;
        g0 g0Var = this.f13425l;
        if (h0Var != null) {
            return h0Var;
        }
        if (g0Var != null) {
            c0 c0Var = new c0(g0Var);
            this.f13424k = c0Var;
            return c0Var;
        }
        long jM11098d = ze.m11098d(this.f13434u);
        long j6 = this.f13421h;
        long j10 = this.f13422i;
        if (j10 != 9205357640488583168L) {
            jM11098d = j10;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM11098d >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM11098d & 4294967295L)) + fIntBitsToFloat2;
        if (this.f13423j > DefinitionKt.NO_Float_VALUE) {
            d0Var = new e0(c2.m10570a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            d0Var = new d0(new C0848c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f13424k = d0Var;
        return d0Var;
    }

    /* renamed from: e */
    public final void m6366e() {
        this.f13430q--;
        m6363b();
    }

    /* renamed from: f */
    public final void m6367f(long j6, long j10, float f6) {
        if (C0847b.m2271b(this.f13421h, j6) && C0850e.m2290a(this.f13422i, j10) && this.f13423j == f6 && this.f13425l == null) {
            return;
        }
        this.f13424k = null;
        this.f13425l = null;
        this.f13420g = true;
        this.f13427n = false;
        this.f13421h = j6;
        this.f13422i = j10;
        this.f13423j = f6;
        m6362a();
    }
}
