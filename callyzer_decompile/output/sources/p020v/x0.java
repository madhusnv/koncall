package p020v;

import a9.C0073l;
import ai.AbstractC0160q;
import ai.C0150g;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import android.view.Surface;
import bd.C0645a;
import bi.C0663b;
import c0.r0;
import c0.u1;
import c9.C0910e;
import c9.C0917l;
import ch.C0972b;
import cj.C0975a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.AbstractC1397x;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.components.DependencyException;
import com.google.firebase.installations.C1401a;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import dx.AbstractC1851a;
import eb.i3;
import ei.C2055a;
import h6.ExecutorC2852h;
import hi.d2;
import hi.o1;
import hi.r1;
import hi.x1;
import hi.y0;
import hi.y1;
import hi.z0;
import hq.C3009n;
import i0.b2;
import i0.c2;
import i0.g2;
import i0.v0;
import iz.C3370c;
import iz.C3389v;
import iz.C3391x;
import iz.i0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import ji.C3773g;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import kz.AbstractC4297c;
import l0.AbstractC4308h;
import l0.RunnableC4307g;
import mm.C4791b;
import nf.C5047i;
import nj.InterfaceC5076b;
import nx.AbstractC5178p;
import of.C5347b;
import of.C5349d;
import of.C5358m;
import of.C5359n;
import of.ExecutorC5353h;
import og.pe;
import og.ud;
import oj.C5391c;
import oj.C5396h;
import oj.EnumC5394f;
import oj.InterfaceC5395g;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p013o.C5232r;
import p013o.q1;
import p013o.v1;
import p021w.C7843i;
import p024z.C8834c;
import pg.a7;
import pg.l8;
import pg.q6;
import pg.s8;
import pg.t8;
import qc.C6169o;
import qi.C6219b;
import qi.C6228k;
import qi.C6232o;
import qi.C6234q;
import qi.C6235r;
import qi.InterfaceC6220c;
import qj.InterfaceC6237b;
import qw.C6361k;
import rj.C6555a;
import rj.InterfaceC6558d;
import rw.AbstractC6674x;
import rw.C6669s;
import s1.u0;
import sc.C6803w;
import tb.C7105p;
import tc.InterfaceC7116a;
import u5.AbstractC7339a;
import vg.C7709a;
import vw.EnumC7794a;
import w3.C7892j;
import ww.AbstractC8193c;
import xm.C8418z;
import xm.s2;
import xm.y5;
import yb.AbstractC8610b;
import yb.EnumC8611c;
import yg.C8656m;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import z1.C8849i;
import zh.InterfaceFutureC8957d;
import zj.C8985b;
import zj.C8986c;
import zm.EnumC8991a;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 implements InterfaceC6220c {

    /* renamed from: a */
    public final /* synthetic */ int f36753a;

    /* renamed from: b */
    public Object f36754b;

    /* renamed from: c */
    public Object f36755c;

    /* renamed from: d */
    public Object f36756d;

    /* renamed from: e */
    public Object f36757e;

    /* renamed from: f */
    public Object f36758f;

    /* renamed from: g */
    public Object f36759g;

    public /* synthetic */ x0(int i10, boolean z6) {
        this.f36753a = i10;
    }

    /* renamed from: L */
    public static void m14459L(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C5232r.f25627b;
        }
        drawableMutate.setColorFilter(C5232r.m10282b(i10, mode));
    }

    /* renamed from: Q */
    public static void m14460Q(InterfaceC7116a interfaceC7116a, InterfaceC7116a interfaceC7116a2, C6169o c6169o) {
        if (AbstractC4154l.m8918a(interfaceC7116a2.getUrl(), interfaceC7116a.getUrl())) {
            return;
        }
        C0645a c0645a = c6169o.f30059c;
        EnumC8611c enumC8611c = EnumC8611c.ACCOUNT_ID_BASED_ENDPOINT;
        if (AbstractC8610b.m15955a(c0645a, enumC8611c) && !AbstractC5178p.m10116x(interfaceC7116a2.getUrl().f382h, (CharSequence) ud.m10978d(c0645a.f4118c, AbstractC8610b.f41874b), false)) {
            AbstractC8610b.m15958d(c0645a, enumC8611c);
        }
        EnumC8611c enumC8611c2 = EnumC8611c.SERVICE_ENDPOINT_OVERRIDE;
        if (AbstractC8610b.m15955a(c0645a, enumC8611c2)) {
            AbstractC8610b.m15958d(c0645a, enumC8611c2);
        }
    }

    /* renamed from: h */
    public static void m14461h(x0 x0Var, String str) {
        ((C8805t) x0Var.f36758f).m16231f(str + "");
    }

    /* renamed from: i */
    public static boolean m14462i(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static void m14463l(String str, C4147e c4147e, Object obj) {
        if (c4147e.m8915d(obj)) {
            return;
        }
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, " invalid type conversion: found ");
        sbM11245p.append(a0.m8901a(obj.getClass()));
        sbM11245p.append("; expected ");
        sbM11245p.append(c4147e);
        throw new IllegalStateException(sbM11245p.toString().toString());
    }

    /* renamed from: m */
    public static ColorStateList m14464m(Context context, int i10) {
        int iM10299c = v1.m10299c(context, R.attr.colorControlHighlight);
        int iM10298b = v1.m10298b(context, R.attr.colorButtonNormal);
        int[] iArr = v1.f25659b;
        int[] iArr2 = v1.f25661d;
        int iM13732b = AbstractC7339a.m13732b(iM10299c, i10);
        return new ColorStateList(new int[][]{iArr, iArr2, v1.f25660c, v1.f25663f}, new int[]{iM10298b, iM13732b, AbstractC7339a.m13732b(iM10299c, i10), i10});
    }

    /* renamed from: t */
    public static LayerDrawable m14465t(q1 q1Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableM10278c = q1Var.m10278c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM10278c2 = q1Var.m10278c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM10278c instanceof BitmapDrawable) && drawableM10278c.getIntrinsicWidth() == dimensionPixelSize && drawableM10278c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM10278c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM10278c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM10278c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM10278c2 instanceof BitmapDrawable) && drawableM10278c2.getIntrinsicWidth() == dimensionPixelSize && drawableM10278c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM10278c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM10278c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM10278c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0035, B:28:0x0098, B:22:0x0069, B:24:0x006f, B:21:0x005b), top: B:35:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [tc.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:28:0x0098). Please report as a decompilation issue!!! */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14466A(tc.C7122g r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14466A(tc.g, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:20:0x0072). Please report as a decompilation issue!!! */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14467B(java.lang.Object r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof qc.C6175u
            if (r0 == 0) goto L13
            r0 = r10
            qc.u r0 = (qc.C6175u) r0
            int r1 = r0.f30107g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30107g = r1
            goto L18
        L13:
            qc.u r0 = new qc.u
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f30105e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30107g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r9 = r0.f30104d
            qc.m r2 = r0.f30103c
            java.util.Iterator r4 = r0.f30102b
            qc.m r5 = r0.f30101a
            og.od.m10798c(r10)
            goto L72
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            og.od.m10798c(r10)
            qc.m r10 = new qc.m
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Any"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r9, r2)
            java.lang.Object r2 = r8.f36754b
            bd.a r2 = (bd.C0645a) r2
            r10.<init>(r2, r9)
            java.lang.Object r9 = r8.f36755c
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r4 = r9
            r5 = r10
            r9 = r2
            r2 = r5
        L55:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L80
            java.lang.Object r10 = r4.next()
            zb.c r10 = (zb.InterfaceC8909c) r10
            r0.f30101a = r5
            r0.f30102b = r4
            r0.f30103c = r2
            r0.f30104d = r9
            r0.f30107g = r3
            java.lang.Object r10 = r10.modifyBeforeSerialization(r2, r0)
            if (r10 != r1) goto L72
            return r1
        L72:
            java.lang.Object r6 = r8.f36756d
            sc.w r6 = (sc.C6803w) r6
            kotlin.jvm.internal.e r6 = r6.f32333a
            java.lang.String r7 = "modifyBeforeSerialization"
            m14463l(r7, r6, r10)
            r5.f30049a = r10
            goto L55
        L80:
            java.lang.Object r9 = r2.f30049a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14467B(java.lang.Object, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0035, B:28:0x0098, B:22:0x0069, B:24:0x006f, B:21:0x005b), top: B:35:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [tc.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:28:0x0098). Please report as a decompilation issue!!! */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14468C(tc.C7122g r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14468C(tc.g, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0035, B:28:0x0098, B:22:0x0069, B:24:0x006f, B:21:0x005b), top: B:35:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [tc.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:28:0x0098). Please report as a decompilation issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14469D(tc.C7122g r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14469D(tc.g, ww.c):java.lang.Object");
    }

    /* renamed from: E */
    public C0073l m14470E() {
        C0073l c0073l = new C0073l();
        Object objM12786n = C6669s.f31944a;
        c0073l.f268e = objM12786n;
        c0073l.f264a = (C3391x) this.f36754b;
        c0073l.f265b = (String) this.f36755c;
        c0073l.f267d = (i0) this.f36757e;
        Map map = (Map) this.f36758f;
        if (!map.isEmpty()) {
            objM12786n = AbstractC6674x.m12786n(map);
        }
        c0073l.f268e = objM12786n;
        c0073l.f266c = ((C3389v) this.f36756d).m7789j();
        return c0073l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14471F(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ko.C4140h
            if (r0 == 0) goto L13
            r0 = r7
            ko.h r0 = (ko.C4140h) r0
            int r1 = r0.f21131c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21131c = r1
            goto L18
        L13:
            ko.h r0 = new ko.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f21129a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21131c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r7)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            og.od.m10798c(r7)
            goto L50
        L38:
            og.od.m10798c(r7)
            java.lang.Object r7 = r6.f36757e
            xm.z r7 = (xm.C8418z) r7
            r0.f21131c = r5
            fn.i r7 = r7.f41069a
            km.a r7 = r7.f10585a
            km.o r7 = (km.C4120o) r7
            java.lang.String r2 = "App_Version"
            java.lang.Object r7 = r7.m8883e(r2, r0)
            if (r7 != r1) goto L50
            goto L62
        L50:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = 183(0xb7, float:2.56E-43)
            if (r7 >= r2) goto L63
            r0.f21131c = r4
            java.lang.Object r7 = r6.m14486p(r0)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14471F(ww.c):java.lang.Object");
    }

    /* renamed from: G */
    public C8986c m14472G() throws GeneralSecurityException, IOException {
        int i10 = 2;
        try {
            C0663b c0663b = (C0663b) this.f36757e;
            if (c0663b != null) {
                try {
                    y1 y1Var = (y1) C5047i.m9973S((C0910e) this.f36754b, c0663b).f24823b;
                    AbstractC1397x abstractC1397x = (AbstractC1397x) y1Var.mo4165f(EnumC1399z.NEW_BUILDER);
                    abstractC1397x.m4460c();
                    AbstractC1397x.m4457d(abstractC1397x.f7128b, y1Var);
                    return new C8986c(i10, (hi.v1) abstractC1397x);
                } catch (InvalidProtocolBufferException | GeneralSecurityException unused) {
                }
            }
            y1 y1VarM7233t = y1.m7233t(((C0910e) this.f36754b).m2586E(), C1390q.m4366a());
            if (y1VarM7233t.m7235p() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            AbstractC1397x abstractC1397x2 = (AbstractC1397x) y1VarM7233t.mo4165f(EnumC1399z.NEW_BUILDER);
            abstractC1397x2.m4460c();
            AbstractC1397x.m4457d(abstractC1397x2.f7128b, y1VarM7233t);
            return new C8986c(i10, (hi.v1) abstractC1397x2);
        } catch (FileNotFoundException unused2) {
            if (((C0150g) this.f36758f) == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            hi.v1 v1VarM7232s = y1.m7232s();
            C8986c c8986c = new C8986c(i10, v1VarM7232s);
            C0150g c0150g = (C0150g) this.f36758f;
            synchronized (c8986c) {
                r1 r1Var = c0150g.f481a;
                synchronized (c8986c) {
                    x1 x1VarM16463m = c8986c.m16463m(r1Var);
                    v1VarM7232s.m4460c();
                    y1.m7231n((y1) v1VarM7232s.f7128b, x1VarM16463m);
                    int iM7082q = AbstractC0160q.m371a((y1) c8986c.m16461e().f24823b).m7092o().m7082q();
                    synchronized (c8986c) {
                        for (int i11 = 0; i11 < ((y1) ((hi.v1) c8986c.f43336b).f7128b).m7235p(); i11++) {
                            try {
                                x1 x1VarM7234o = ((y1) ((hi.v1) c8986c.f43336b).f7128b).m7234o(i11);
                                if (x1VarM7234o.m7223r() == iM7082q) {
                                    if (!x1VarM7234o.m7225t().equals(o1.ENABLED)) {
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iM7082q);
                                    }
                                    hi.v1 v1Var = (hi.v1) c8986c.f43336b;
                                    v1Var.m4460c();
                                    y1.m7230m((y1) v1Var.f7128b, iM7082q);
                                    if (((C0663b) this.f36757e) != null) {
                                        C5047i c5047iM16461e = c8986c.m16461e();
                                        C0917l c0917l = (C0917l) this.f36755c;
                                        C0663b c0663b2 = (C0663b) this.f36757e;
                                        y1 y1Var2 = (y1) c5047iM16461e.f24823b;
                                        byte[] bArrMo308a = c0663b2.mo308a(y1Var2.m4157c(), new byte[0]);
                                        try {
                                            if (!y1.m7233t(c0663b2.mo309b(bArrMo308a, new byte[0]), C1390q.m4366a()).equals(y1Var2)) {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                            y0 y0VarM7240p = z0.m7240p();
                                            C1381h c1381hM4277c = AbstractC1382i.m4277c(0, bArrMo308a.length, bArrMo308a);
                                            y0VarM7240p.m4460c();
                                            z0.m7238m((z0) y0VarM7240p.f7128b, c1381hM4277c);
                                            d2 d2VarM371a = AbstractC0160q.m371a(y1Var2);
                                            y0VarM7240p.m4460c();
                                            z0.m7239n((z0) y0VarM7240p.f7128b, d2VarM371a);
                                            if (!((SharedPreferences.Editor) c0917l.f5594b).putString((String) c0917l.f5595c, q6.m11831c(((z0) y0VarM7240p.m4458a()).m4157c())).commit()) {
                                                throw new IOException("Failed to write to SharedPreferences");
                                            }
                                        } catch (InvalidProtocolBufferException unused3) {
                                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                        }
                                    } else {
                                        C5047i c5047iM16461e2 = c8986c.m16461e();
                                        C0917l c0917l2 = (C0917l) this.f36755c;
                                        if (!((SharedPreferences.Editor) c0917l2.f5594b).putString((String) c0917l2.f5595c, q6.m11831c(((y1) c5047iM16461e2.f24823b).m4157c())).commit()) {
                                            throw new IOException("Failed to write to SharedPreferences");
                                        }
                                    }
                                    return c8986c;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        throw new GeneralSecurityException("key not found: " + iM7082q);
                    }
                }
            }
        }
    }

    /* renamed from: H */
    public C0663b m14473H() throws KeyStoreException {
        C2055a c2055a = new C2055a();
        boolean zM5780c = c2055a.m5780c((String) this.f36756d);
        if (!zM5780c) {
            try {
                C2055a.m5778a((String) this.f36756d);
            } catch (GeneralSecurityException | ProviderException unused) {
                return null;
            }
        }
        try {
            return c2055a.m5779b((String) this.f36756d);
        } catch (GeneralSecurityException | ProviderException e2) {
            if (zM5780c) {
                throw new KeyStoreException(AbstractC5601a.m11238i("the master key ", (String) this.f36756d, " exists but is unusable"), e2);
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14474I(java.util.List r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ko.C4141i
            if (r0 == 0) goto L13
            r0 = r6
            ko.i r0 = (ko.C4141i) r0
            int r1 = r0.f21136e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21136e = r1
            goto L18
        L13:
            ko.i r0 = new ko.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f21134c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21136e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f21133b
            java.util.Iterator r2 = r0.f21132a
            og.od.m10798c(r6)
            goto L3d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r6)
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r2 = r5
            r5 = r6
        L3d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r2.next()
            mm.b r6 = (mm.C4791b) r6
            r0.f21132a = r2
            r0.f21133b = r5
            r0.f21136e = r3
            java.lang.Object r6 = r4.m14475J(r6, r0)
            if (r6 != r1) goto L3d
            return r1
        L56:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14474I(java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: J */
    public Object m14475J(C4791b c4791b, AbstractC8193c abstractC8193c) {
        ((C8805t) this.f36759g).m16231f("fixWrongNotFound >> getFileSizeFromAws >> setting recording back to not found >> " + c4791b);
        xm.x1 x1Var = (xm.x1) this.f36755c;
        EnumC8993c enumC8993c = EnumC8993c.NOT_FOUND;
        EnumSet enumSet = c4791b.f23835d;
        enumSet.remove(EnumC8991a.SYNC_CALL_RECORDING_UPDATE);
        Object objM15657H = x1Var.m15657H(C4791b.m9712a(c4791b, null, null, enumSet, enumC8993c, null, null, null, null, false, 4071), abstractC8193c);
        return objM15657H == EnumC7794a.COROUTINE_SUSPENDED ? objM15657H : qw.a0.f30746a;
    }

    /* renamed from: K */
    public void m14476K(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String strEncodeToString;
        boolean zM11118e;
        EnumC5394f enumC5394f;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C3773g c3773g = (C3773g) this.f36754b;
        c3773g.m8293a();
        bundle.putString("gmp_app_id", c3773g.f19664c.f19678b);
        u0 u0Var = (u0) this.f36755c;
        synchronized (u0Var) {
            try {
                if (u0Var.f32143a == 0) {
                    try {
                        packageInfo = ((Context) u0Var.f32145c).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        e2.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        u0Var.f32143a = packageInfo.versionCode;
                    }
                }
                i10 = u0Var.f32143a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((u0) this.f36755c).m12863b());
        u0 u0Var2 = (u0) this.f36755c;
        synchronized (u0Var2) {
            try {
                if (((String) u0Var2.f32147e) == null) {
                    u0Var2.m12865e();
                }
                str3 = (String) u0Var2.f32147e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        C3773g c3773g2 = (C3773g) this.f36754b;
        c3773g2.m8293a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(c3773g2.f19663b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((C6555a) l8.m11760a(((C1401a) ((InterfaceC6558d) this.f36759g)).m4472d())).f31407a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) l8.m11760a(((C1401a) ((InterfaceC6558d) this.f36759g)).m4471c()));
        bundle.putString("cliv", "fcm-25.0.0");
        InterfaceC5395g interfaceC5395g = (InterfaceC5395g) ((InterfaceC6237b) this.f36758f).get();
        C8985b c8985b = (C8985b) ((InterfaceC6237b) this.f36757e).get();
        if (interfaceC5395g == null || c8985b == null) {
            return;
        }
        C5391c c5391c = (C5391c) interfaceC5395g;
        synchronized (c5391c) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C5396h c5396h = (C5396h) c5391c.f27073a.get();
            synchronized (c5396h) {
                zM11118e = c5396h.m11118e(C5396h.f27082b, jCurrentTimeMillis);
            }
            if (zM11118e) {
                synchronized (c5396h) {
                    c5396h.f27085a.m6594a(new C3009n(17, c5396h, c5396h.m11115b(System.currentTimeMillis())));
                }
                enumC5394f = EnumC5394f.GLOBAL;
            } else {
                enumC5394f = EnumC5394f.NONE;
            }
        }
        if (enumC5394f != EnumC5394f.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(enumC5394f.getCode()));
            bundle.putString("Firebase-Client", c8985b.m16458a());
        }
    }

    /* renamed from: M */
    public C8656m m14477M(String str, String str2, Bundle bundle) {
        int i10;
        try {
            m14476K(str, str2, bundle);
            C5347b c5347b = (C5347b) this.f36756d;
            ExecutorC5353h executorC5353h = ExecutorC5353h.f26280c;
            C0972b c0972b = c5347b.f26267c;
            if (c0972b.m2751u() < 12000000) {
                return c0972b.m2752v() != 0 ? c5347b.m10476a(bundle).m15981h(executorC5353h, new C8849i(11, c5347b, bundle)) : l8.m11764e(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C5359n c5359nM10484J = C5359n.m10484J(c5347b.f26266b);
            synchronized (c5359nM10484J) {
                i10 = c5359nM10484J.f26303a;
                c5359nM10484J.f26303a = i10 + 1;
            }
            return c5359nM10484J.m10495K(new C5358m(i10, 1, bundle, 1)).m15980g(executorC5353h, C5349d.f26273b);
        } catch (InterruptedException | ExecutionException e2) {
            return l8.m11764e(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:
    
        if (m14474I(r7, r5) == r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d3, code lost:
    
        if (m14474I(r7, r5) == r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0305, code lost:
    
        if (m14474I(r7, r5) == r6) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0328 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0232  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01f3 -> B:15:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x021b -> B:88:0x0219). Please report as a decompilation issue!!! */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14478N(java.util.List r29, mm.C4802m r30, ww.AbstractC8193c r31) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14478N(java.util.List, mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: O */
    public Object m14479O(Class cls) {
        C4147e c4147eM8901a = a0.m8901a(cls);
        return AbstractC1851a.m5483b(c4147eM8901a).cast(((Map) this.f36758f).get(c4147eM8901a));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14480P(int r21, android.net.Uri r22, ww.AbstractC8193c r23) throws java.lang.SecurityException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14480P(int, android.net.Uri, ww.c):java.lang.Object");
    }

    /* renamed from: R */
    public void m14481R(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.f36754b = new C0910e(context, str, str2);
        this.f36755c = new C0917l(context, str, str2);
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: a */
    public Object mo12234a(Class cls) {
        if (!((Set) this.f36754b).contains(C6234q.m12250a(cls))) {
            throw new DependencyException(AbstractC1452a.m4560g("Attempting to request an undeclared dependency ", cls, "."));
        }
        Object objMo12234a = ((InterfaceC6220c) this.f36759g).mo12234a(cls);
        if (!cls.equals(InterfaceC5076b.class)) {
            return objMo12234a;
        }
        return new C6235r();
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: b */
    public C6232o mo12235b(C6234q c6234q) {
        if (((Set) this.f36756d).contains(c6234q)) {
            return ((InterfaceC6220c) this.f36759g).mo12235b(c6234q);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + c6234q + ">.");
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: c */
    public InterfaceC6237b mo12236c(Class cls) {
        return mo12240g(C6234q.m12250a(cls));
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: d */
    public Object mo12237d(C6234q c6234q) {
        if (((Set) this.f36754b).contains(c6234q)) {
            return ((InterfaceC6220c) this.f36759g).mo12237d(c6234q);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + c6234q + ".");
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: e */
    public InterfaceC6237b mo12238e(C6234q c6234q) {
        if (((Set) this.f36758f).contains(c6234q)) {
            return ((InterfaceC6220c) this.f36759g).mo12238e(c6234q);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + c6234q + ">>.");
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: f */
    public Set mo12239f(C6234q c6234q) {
        if (((Set) this.f36757e).contains(c6234q)) {
            return ((InterfaceC6220c) this.f36759g).mo12239f(c6234q);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + c6234q + ">.");
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: g */
    public InterfaceC6237b mo12240g(C6234q c6234q) {
        if (((Set) this.f36755c).contains(c6234q)) {
            return ((InterfaceC6220c) this.f36759g).mo12240g(c6234q);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + c6234q + ">.");
    }

    /* renamed from: j */
    public synchronized C8986c m14482j() {
        C8986c c8986c;
        try {
            if (((String) this.f36756d) != null) {
                this.f36757e = m14473H();
            }
            this.f36759g = m14472G();
            c8986c = new C8986c(9);
            c8986c.f43336b = (C8986c) this.f36759g;
        } catch (Throwable th2) {
            throw th2;
        }
        return c8986c;
    }

    /* renamed from: k */
    public C3370c m14483k() {
        C3370c c3370c = (C3370c) this.f36759g;
        if (c3370c != null) {
            return c3370c;
        }
        C3370c c3370c2 = C3370c.f17794n;
        C3370c c3370cM11535a = a7.m11535a((C3389v) this.f36756d);
        this.f36759g = c3370cM11535a;
        return c3370cM11535a;
    }

    /* renamed from: n */
    public g2 m14484n() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f36757e;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        b2 b2VarM7301e = b2.m7301e((w0) this.f36756d, size);
        b2VarM7301e.f16425b.f4191a = 1;
        u1 u1Var = new u1(surface);
        this.f36754b = u1Var;
        InterfaceFutureC8957d interfaceFutureC8957dM9034d = AbstractC4308h.m9034d(u1Var.f16604e);
        C7105p c7105p = new C7105p(16, surface, surfaceTexture);
        interfaceFutureC8957dM9034d.mo9026a(new RunnableC4307g(0, interfaceFutureC8957dM9034d, c7105p), t8.m11872a());
        b2VarM7301e.m7304c((u1) this.f36754b, c0.a0.f5035d, -1);
        c2 c2Var = (c2) this.f36759g;
        if (c2Var != null) {
            c2Var.m7307b();
        }
        c2 c2Var2 = new c2(new r0(3, this));
        this.f36759g = c2Var2;
        b2VarM7301e.f16429f = c2Var2;
        return b2VarM7301e.m7305d();
    }

    /* renamed from: o */
    public C8656m m14485o(C8656m c8656m) {
        return c8656m.m15980g(new ExecutorC2852h(0), new C7892j(7, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        if (r2.m15633r(r0, r4) != r5) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:61:0x01c3, B:65:0x01d0], limit reached: 78 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01e2 -> B:13:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01e5 -> B:70:0x01e6). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14486p(ww.AbstractC8193c r26) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14486p(ww.c):java.lang.Object");
    }

    /* renamed from: q */
    public void m14487q(g1 g1Var) {
        ArrayList arrayListM14490u = m14490u();
        int size = arrayListM14490u.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM14490u.get(i10);
            i10++;
            g1 g1Var2 = (g1) obj;
            if (g1Var2 == g1Var) {
                return;
            }
            synchronized (g1Var2.f36544a) {
                try {
                    List list = g1Var2.f36554k;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((v0) it.next()).m7417b();
                        }
                        g1Var2.f36554k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g1Var2.f36564u.m177p();
        }
    }

    /* renamed from: r */
    public ArrayList m14488r() {
        ArrayList arrayList;
        synchronized (this.f36755c) {
            arrayList = new ArrayList((LinkedHashSet) this.f36756d);
        }
        return arrayList;
    }

    /* renamed from: s */
    public C6232o m14489s(Class cls) {
        return mo12235b(C6234q.m12250a(cls));
    }

    public String toString() {
        switch (this.f36753a) {
            case 4:
                Map map = (Map) this.f36758f;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Request{method=");
                sb2.append((String) this.f36755c);
                sb2.append(", url=");
                sb2.append((C3391x) this.f36754b);
                C3389v c3389v = (C3389v) this.f36756d;
                if (c3389v.size() != 0) {
                    sb2.append(", headers=[");
                    int i10 = 0;
                    for (Object obj : c3389v) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        C6361k c6361k = (C6361k) obj;
                        String str = (String) c6361k.f30755a;
                        String str2 = (String) c6361k.f30756b;
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(str);
                        sb2.append(':');
                        if (AbstractC4297c.m9006j(str)) {
                            str2 = "██";
                        }
                        sb2.append(str2);
                        i10 = i11;
                    }
                    sb2.append(']');
                }
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public ArrayList m14490u() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f36755c) {
            arrayList = new ArrayList();
            arrayList.addAll(m14488r());
            synchronized (this.f36755c) {
                arrayList2 = new ArrayList((LinkedHashSet) this.f36758f);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: v */
    public ColorStateList m14491v(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return s8.m11863a(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131230801) {
            return s8.m11863a(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return m14464m(context, v1.m10299c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return m14464m(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return m14464m(context, v1.m10299c(context, R.attr.colorAccent));
            }
            if (i10 == 2131230796 || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return s8.m11863a(context, R.color.abc_tint_spinner);
            }
            if (m14462i(i10, (int[]) this.f36755c)) {
                return v1.m10300d(context, R.attr.colorControlNormal);
            }
            if (m14462i(i10, (int[]) this.f36758f)) {
                return s8.m11863a(context, R.color.abc_tint_default);
            }
            if (m14462i(i10, (int[]) this.f36759g)) {
                return s8.m11863a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return s8.m11863a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM10300d = v1.m10300d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM10300d == null || !colorStateListM10300d.isStateful()) {
            iArr[0] = v1.f25659b;
            iArr2[0] = v1.m10298b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = v1.f25662e;
            iArr2[1] = v1.m10299c(context, R.attr.colorControlActivated);
            iArr[2] = v1.f25663f;
            iArr2[2] = v1.m10299c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = v1.f25659b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM10300d.getColorForState(iArr3, 0);
            iArr[1] = v1.f25662e;
            iArr2[1] = v1.m10299c(context, R.attr.colorControlActivated);
            iArr[2] = v1.f25663f;
            iArr2[2] = colorStateListM10300d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14492w(ww.AbstractC8193c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof rn.C6572a
            if (r0 == 0) goto L13
            r0 = r11
            rn.a r0 = (rn.C6572a) r0
            int r1 = r0.f31462d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31462d = r1
            goto L18
        L13:
            rn.a r0 = new rn.a
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f31460b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31462d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            og.od.m10798c(r11)     // Catch: java.lang.Exception -> L2a
            goto L84
        L2a:
            r11 = move-exception
            goto Lae
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            java.util.ArrayList r2 = r0.f31459a
            og.od.m10798c(r11)     // Catch: java.lang.Exception -> L2a
            goto L52
        L3b:
            og.od.m10798c(r11)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2a
            r2.<init>()     // Catch: java.lang.Exception -> L2a
            java.lang.Object r11 = r10.f36755c     // Catch: java.lang.Exception -> L2a
            xm.y5 r11 = (xm.y5) r11     // Catch: java.lang.Exception -> L2a
            r0.f31459a = r2     // Catch: java.lang.Exception -> L2a
            r0.f31462d = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r11 = r11.m15696l(r0)     // Catch: java.lang.Exception -> L2a
            if (r11 != r1) goto L52
            goto L83
        L52:
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Exception -> L2a
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L2a
        L58:
            boolean r5 = r11.hasNext()     // Catch: java.lang.Exception -> L2a
            r6 = 0
            if (r5 == 0) goto L79
            java.lang.Object r5 = r11.next()     // Catch: java.lang.Exception -> L2a
            mm.m r5 = (mm.C4802m) r5     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = r10.f36759g     // Catch: java.lang.Exception -> L2a
            yx.d r7 = (yx.C8810d) r7     // Catch: java.lang.Exception -> L2a
            ps.c0 r8 = new ps.c0     // Catch: java.lang.Exception -> L2a
            r9 = 9
            r8.<init>(r10, r5, r6, r9)     // Catch: java.lang.Exception -> L2a
            r5 = 3
            tx.g0 r5 = tx.c0.m13482e(r7, r6, r8, r5)     // Catch: java.lang.Exception -> L2a
            r2.add(r5)     // Catch: java.lang.Exception -> L2a
            goto L58
        L79:
            r0.f31459a = r6     // Catch: java.lang.Exception -> L2a
            r0.f31462d = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r11 = tx.c0.m13483f(r2, r0)     // Catch: java.lang.Exception -> L2a
            if (r11 != r1) goto L84
        L83:
            return r1
        L84:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L2a
            r0 = 0
            if (r11 == 0) goto L91
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L91
        L8f:
            r4 = r0
            goto La9
        L91:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L2a
        L95:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Exception -> L2a
            com.websoptimization.callyzerbiz.data.model.response.FeatureStatusResponse r1 = (com.websoptimization.callyzerbiz.data.model.response.FeatureStatusResponse) r1     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L95
            boolean r1 = r1.m4781a()     // Catch: java.lang.Exception -> L2a
            if (r1 != r4) goto L95
        La9:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L2a
            return r11
        Lae:
            java.lang.Object r0 = r10.f36758f
            yv.t r0 = (yv.C8805t) r0
            java.lang.String r11 = r11.getMessage()
            java.lang.String r1 = "AttachCallRecordingUseCase >>> failed to get customer feature status : "
            com.sun.mail.util.AbstractC1452a.m4579z(r1, r11, r0)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14492w(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x0082, B:29:0x008c, B:30:0x008f, B:22:0x0063, B:24:0x0069, B:31:0x0092, B:21:0x0056), top: B:43:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x0082, B:29:0x008c, B:30:0x008f, B:22:0x0063, B:24:0x0069, B:31:0x0092, B:21:0x0056), top: B:43:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x0082, B:29:0x008c, B:30:0x008f, B:22:0x0063, B:24:0x0069, B:31:0x0092, B:21:0x0056), top: B:43:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:27:0x0082). Please report as a decompilation issue!!! */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14493x(java.lang.Object r12, tc.C7122g r13, uc.C7394a r14, ww.AbstractC8193c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof qc.C6171q
            if (r0 == 0) goto L13
            r0 = r15
            qc.q r0 = (qc.C6171q) r0
            int r1 = r0.f30071h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30071h = r1
            goto L18
        L13:
            qc.q r0 = new qc.q
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f30069f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30071h
            java.lang.String r3 = "modifyBeforeAttemptCompletion"
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            int r12 = r0.f30068e
            int r13 = r0.f30067d
            qc.k r14 = r0.f30066c
            java.util.Iterator r2 = r0.f30065b
            v.x0 r5 = r0.f30064a
            og.od.m10798c(r15)     // Catch: java.lang.Throwable -> L37
            qw.n r15 = (qw.C6364n) r15     // Catch: java.lang.Throwable -> L37
            java.lang.Object r15 = r15.f30758a     // Catch: java.lang.Throwable -> L37
            goto L82
        L37:
            r0 = move-exception
            r12 = r0
            goto L9a
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            og.od.m10798c(r15)
            java.lang.Object r6 = r11.f36757e
            if (r6 == 0) goto Lbb
            qc.k r5 = new qc.k
            java.lang.Object r15 = r11.f36754b
            r10 = r15
            bd.a r10 = (bd.C0645a) r10
            r7 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = r11.f36755c     // Catch: java.lang.Throwable -> L37
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L37
            r13 = 0
            r2 = r12
            r12 = r13
            r14 = r5
            r5 = r11
        L63:
            boolean r15 = r2.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r15 == 0) goto L92
            java.lang.Object r15 = r2.next()     // Catch: java.lang.Throwable -> L37
            zb.c r15 = (zb.InterfaceC8909c) r15     // Catch: java.lang.Throwable -> L37
            r0.f30064a = r5     // Catch: java.lang.Throwable -> L37
            r0.f30065b = r2     // Catch: java.lang.Throwable -> L37
            r0.f30066c = r14     // Catch: java.lang.Throwable -> L37
            r0.f30067d = r13     // Catch: java.lang.Throwable -> L37
            r0.f30068e = r12     // Catch: java.lang.Throwable -> L37
            r0.f30071h = r4     // Catch: java.lang.Throwable -> L37
            java.lang.Object r15 = r15.mo16556modifyBeforeAttemptCompletiongIAlus(r14, r0)     // Catch: java.lang.Throwable -> L37
            if (r15 != r1) goto L82
            return r1
        L82:
            java.lang.Object r6 = r5.f36756d     // Catch: java.lang.Throwable -> L37
            sc.w r6 = (sc.C6803w) r6     // Catch: java.lang.Throwable -> L37
            kotlin.jvm.internal.e r6 = r6.f32334b     // Catch: java.lang.Throwable -> L37
            boolean r7 = r15 instanceof qw.C6363m     // Catch: java.lang.Throwable -> L37
            if (r7 != 0) goto L8f
            m14463l(r3, r6, r15)     // Catch: java.lang.Throwable -> L37
        L8f:
            r14.f30040b = r15     // Catch: java.lang.Throwable -> L37
            goto L63
        L92:
            java.lang.Object r12 = r14.f30040b     // Catch: java.lang.Throwable -> L37
            qw.n r13 = new qw.n     // Catch: java.lang.Throwable -> L37
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L37
            goto L9e
        L9a:
            qw.m r13 = og.od.m10796a(r12)
        L9e:
            java.lang.Throwable r12 = qw.C6364n.m12363a(r13)
            if (r12 != 0) goto Lb6
            qw.n r13 = (qw.C6364n) r13
            java.lang.Object r12 = r13.f30758a
            java.lang.Object r13 = r11.f36756d
            sc.w r13 = (sc.C6803w) r13
            kotlin.jvm.internal.e r13 = r13.f32334b
            boolean r14 = r12 instanceof qw.C6363m
            if (r14 != 0) goto Lba
            m14463l(r3, r13, r12)
            goto Lba
        Lb6:
            qw.m r12 = og.od.m10796a(r12)
        Lba:
            return r12
        Lbb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Required value was null."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14493x(java.lang.Object, tc.g, uc.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x008a, B:29:0x0094, B:30:0x0097, B:22:0x006b, B:24:0x0071, B:31:0x009a, B:21:0x005e), top: B:43:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x008a, B:29:0x0094, B:30:0x0097, B:22:0x006b, B:24:0x0071, B:31:0x009a, B:21:0x005e), top: B:43:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x002f, B:27:0x008a, B:29:0x0094, B:30:0x0097, B:22:0x006b, B:24:0x0071, B:31:0x009a, B:21:0x005e), top: B:43:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0087 -> B:27:0x008a). Please report as a decompilation issue!!! */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14494y(java.lang.Object r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14494y(java.lang.Object, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:28:0x0081, B:22:0x005f, B:24:0x0065, B:21:0x0051), top: B:35:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0080 -> B:28:0x0081). Please report as a decompilation issue!!! */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14495z(pc.C5884l r10, ww.AbstractC8193c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof qc.C6173s
            if (r0 == 0) goto L13
            r0 = r11
            qc.s r0 = (qc.C6173s) r0
            int r1 = r0.f30088j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30088j = r1
            goto L18
        L13:
            qc.s r0 = new qc.s
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f30086g
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30088j
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r10 = r0.f30085f
            int r2 = r0.f30084e
            qc.p r4 = r0.f30083d
            qc.p r5 = r0.f30082c
            java.util.Iterator r6 = r0.f30081b
            qc.p r7 = r0.f30080a
            og.od.m10798c(r11)     // Catch: java.lang.Throwable -> L33
            goto L81
        L33:
            r10 = move-exception
            goto L8f
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            og.od.m10798c(r11)
            java.lang.Object r11 = r9.f36757e
            if (r11 == 0) goto L9b
            qc.p r2 = new qc.p
            tc.a r4 = r10.f28690a
            uc.a r10 = r10.f28691b
            java.lang.Object r5 = r9.f36754b
            bd.a r5 = (bd.C0645a) r5
            r2.<init>(r11, r4, r10, r5)
            java.lang.Object r10 = r9.f36755c     // Catch: java.lang.Throwable -> L33
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L33
            r11 = 0
            r6 = r10
            r10 = r11
            r4 = r2
            r5 = r4
            r2 = r10
        L5f:
            boolean r11 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r11 == 0) goto L93
            java.lang.Object r11 = r6.next()     // Catch: java.lang.Throwable -> L33
            zb.c r11 = (zb.InterfaceC8909c) r11     // Catch: java.lang.Throwable -> L33
            r0.f30080a = r4     // Catch: java.lang.Throwable -> L33
            r0.f30081b = r6     // Catch: java.lang.Throwable -> L33
            r0.f30082c = r5     // Catch: java.lang.Throwable -> L33
            r0.f30083d = r4     // Catch: java.lang.Throwable -> L33
            r0.f30084e = r2     // Catch: java.lang.Throwable -> L33
            r0.f30085f = r10     // Catch: java.lang.Throwable -> L33
            r0.f30088j = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r11 = r11.modifyBeforeDeserialization(r4, r0)     // Catch: java.lang.Throwable -> L33
            if (r11 != r1) goto L80
            return r1
        L80:
            r7 = r4
        L81:
            uc.a r11 = (uc.C7394a) r11     // Catch: java.lang.Throwable -> L33
            r4.getClass()     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = "<set-?>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r11, r8)     // Catch: java.lang.Throwable -> L33
            r4.f30062c = r11     // Catch: java.lang.Throwable -> L33
            r4 = r7
            goto L5f
        L8f:
            qw.m r5 = og.od.m10796a(r10)
        L93:
            og.od.m10798c(r5)
            qc.p r5 = (qc.C6170p) r5
            uc.a r10 = r5.f30062c
            return r10
        L9b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Required value was null."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.x0.m14495z(pc.l, ww.c):java.lang.Object");
    }

    public x0(String str, String str2, Set set) {
        this.f36753a = 12;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f36754b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f36756d = str;
        this.f36757e = str2;
        this.f36758f = C7709a.f37238a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f36755c = Collections.unmodifiableSet(hashSet);
    }

    public x0(s2 recordingRepository, xm.x1 callLogRepository, y5 userSIMRepository, C8418z appPreferencesRepository, C8803r networkMonitorUtil, C8805t c8805t) {
        this.f36753a = 5;
        AbstractC4154l.m8923f(recordingRepository, "recordingRepository");
        AbstractC4154l.m8923f(callLogRepository, "callLogRepository");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        this.f36754b = recordingRepository;
        this.f36755c = callLogRepository;
        this.f36756d = userSIMRepository;
        this.f36757e = appPreferencesRepository;
        this.f36758f = networkMonitorUtil;
        this.f36759g = c8805t;
    }

    public x0(Context context, y5 userSIMRepository, xm.x1 callLogsRepository, s2 callRecordingRepository, C8805t c8805t, C8810d c8810d) {
        this.f36753a = 11;
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(callLogsRepository, "callLogsRepository");
        AbstractC4154l.m8923f(callRecordingRepository, "callRecordingRepository");
        this.f36754b = context;
        this.f36755c = userSIMRepository;
        this.f36756d = callLogsRepository;
        this.f36757e = callRecordingRepository;
        this.f36758f = c8805t;
        this.f36759g = c8810d;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public x0(C0073l builder) {
        this.f36753a = 4;
        AbstractC4154l.m8923f(builder, "builder");
        C3391x c3391x = (C3391x) builder.f264a;
        if (c3391x != null) {
            this.f36754b = c3391x;
            this.f36755c = (String) builder.f265b;
            this.f36756d = ((i3) builder.f266c).m5727e();
            this.f36757e = (i0) builder.f267d;
            this.f36758f = AbstractC6674x.m12785m(builder.f268e);
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public x0(C6219b c6219b, InterfaceC6220c interfaceC6220c) {
        this.f36753a = 10;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<C6228k> set = c6219b.f30215c;
        Set set2 = c6219b.f30219g;
        for (C6228k c6228k : set) {
            int i10 = c6228k.f30240c;
            int i11 = c6228k.f30239b;
            boolean z6 = i10 == 0;
            C6234q c6234q = c6228k.f30238a;
            if (z6) {
                if (i11 == 2) {
                    hashSet4.add(c6234q);
                } else {
                    hashSet.add(c6234q);
                }
            } else if (i10 == 2) {
                hashSet3.add(c6234q);
            } else if (i11 == 2) {
                hashSet5.add(c6234q);
            } else {
                hashSet2.add(c6234q);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(C6234q.m12250a(InterfaceC5076b.class));
        }
        this.f36754b = Collections.unmodifiableSet(hashSet);
        this.f36755c = Collections.unmodifiableSet(hashSet2);
        this.f36756d = Collections.unmodifiableSet(hashSet3);
        this.f36757e = Collections.unmodifiableSet(hashSet4);
        this.f36758f = Collections.unmodifiableSet(hashSet5);
        this.f36759g = interfaceC6220c;
    }

    public x0(ExecutorC3900j executorC3900j) {
        this.f36753a = 13;
        this.f36755c = new Object();
        this.f36756d = new LinkedHashSet();
        this.f36757e = new LinkedHashSet();
        this.f36758f = new LinkedHashSet();
        this.f36759g = new h0(this);
        this.f36754b = executorC3900j;
    }

    public x0(C0645a execContext, ArrayList interceptors, C6803w c6803w) {
        this.f36753a = 9;
        AbstractC4154l.m8923f(execContext, "execContext");
        AbstractC4154l.m8923f(interceptors, "interceptors");
        this.f36754b = execContext;
        this.f36755c = interceptors;
        this.f36756d = c6803w;
    }

    public x0(C7843i c7843i, q0 q0Var, C7602l c7602l) {
        Size size;
        this.f36753a = 0;
        C8834c c8834c = new C8834c();
        Size size2 = null;
        this.f36759g = null;
        this.f36756d = new w0();
        this.f36758f = c7602l;
        Size[] sizeArrM14011v = c7843i.m14825c().m14011v(34);
        if (sizeArrM14011v == null) {
            og.u1.m10943b("MeteringRepeating");
            size = new Size(0, 0);
        } else {
            if (c8834c.f42537a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrM14011v) {
                    if (C8834c.f42536c.compare(size3, C8834c.f42535b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrM14011v = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrM14011v);
            Collections.sort(listAsList, new C0975a(8));
            Size sizeM14426e = q0Var.m14426e();
            long jMin = Math.min(sizeM14426e.getWidth() * sizeM14426e.getHeight(), 307200L);
            int length = sizeArrM14011v.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                Size size4 = sizeArrM14011v[i10];
                long width = size4.getWidth() * size4.getHeight();
                if (width == jMin) {
                    size = size4;
                    break;
                } else if (width <= jMin) {
                    i10++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.f36757e = size;
        Objects.toString(size);
        og.u1.m10942a("MeteringRepeating");
        this.f36755c = m14484n();
    }

    public x0(int i10) {
        this.f36753a = i10;
        switch (i10) {
            case 6:
                this.f36754b = new int[]{2131230811, 2131230809, 2131230735};
                this.f36755c = new int[]{2131230759, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f36756d = new int[]{2131230808, 2131230810, 2131230752, R.drawable.abc_text_cursor_material, 2131230805, 2131230806, 2131230807};
                this.f36757e = new int[]{2131230784, R.drawable.abc_cab_background_internal_bg, 2131230783};
                this.f36758f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f36759g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            default:
                this.f36754b = null;
                this.f36755c = null;
                this.f36756d = null;
                this.f36757e = null;
                this.f36758f = null;
                break;
        }
    }

    public x0(C3773g c3773g, u0 u0Var, InterfaceC6237b interfaceC6237b, InterfaceC6237b interfaceC6237b2, InterfaceC6558d interfaceC6558d) {
        this.f36753a = 15;
        c3773g.m8293a();
        C5347b c5347b = new C5347b(c3773g.f19662a);
        this.f36754b = c3773g;
        this.f36755c = u0Var;
        this.f36756d = c5347b;
        this.f36757e = interfaceC6237b;
        this.f36758f = interfaceC6237b2;
        this.f36759g = interfaceC6558d;
    }

    public x0(Handler handler, i3 i3Var, i3 i3Var2, ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d, ExecutorC3900j executorC3900j, x0 x0Var) {
        this.f36753a = 14;
        this.f36754b = executorC3900j;
        this.f36755c = scheduledExecutorServiceC3894d;
        this.f36756d = handler;
        this.f36757e = x0Var;
        this.f36758f = i3Var;
        this.f36759g = i3Var2;
    }
}
