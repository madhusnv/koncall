package com.sun.mail.util;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import d3.C1565s;
import ex.InterfaceC2141e;
import gm.C2650s;
import gm.C2651t;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import jw.C3859b;
import jw.InterfaceC3861d;
import k2.C3966o;
import k2.C3977z;
import k2.c1;
import k2.e1;
import k2.m1;
import k2.s0;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import pg.f9;
import qw.a0;
import s4.InterfaceC6747c;
import v3.C7636h;
import y4.C8541b;
import y4.C8545f;
import y4.C8552m;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.sun.mail.util.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1452a {
    /* renamed from: A */
    public static void m4550A(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    /* renamed from: B */
    public static void m4551B(StringBuilder sb2, String str, String str2, int i10, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public static /* synthetic */ void m4552C(InterfaceC4026c interfaceC4026c) throws Exception {
        boolean zIsTerminated;
        if (interfaceC4026c instanceof AutoCloseable) {
            interfaceC4026c.close();
            return;
        }
        if (!(interfaceC4026c instanceof ExecutorService)) {
            if (interfaceC4026c instanceof TypedArray) {
                ((TypedArray) interfaceC4026c).recycle();
                return;
            } else if (interfaceC4026c instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) interfaceC4026c).release();
                return;
            } else {
                if (!(interfaceC4026c instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) interfaceC4026c).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) interfaceC4026c;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z6) {
                    executorService.shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: D */
    public static byte[] m4553D(ASN1Sequence aSN1Sequence, int i10) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10)).getOctets();
    }

    /* renamed from: a */
    public static int m4554a(float f6, float f10, float f11) {
        return Math.round((f6 + f10) * f11);
    }

    /* renamed from: b */
    public static int m4555b(float f6, int i10, int i11) {
        return (Float.hashCode(f6) + i10) * i11;
    }

    /* renamed from: c */
    public static int m4556c(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    /* renamed from: d */
    public static int m4557d(int i10, int i11, long j6) {
        return (Long.hashCode(j6) + i10) * i11;
    }

    /* renamed from: e */
    public static int m4558e(int i10, int i11, boolean z6) {
        return (Boolean.hashCode(z6) + i10) * i11;
    }

    /* renamed from: f */
    public static int m4559f(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    /* renamed from: g */
    public static String m4560g(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    /* renamed from: h */
    public static String m4561h(String str, String str2) {
        return str + str2;
    }

    /* renamed from: i */
    public static String m4562i(StringBuilder sb2, float f6, char c2) {
        sb2.append(f6);
        sb2.append(c2);
        return sb2.toString();
    }

    /* renamed from: j */
    public static String m4563j(StringBuilder sb2, int i10, char c2) {
        sb2.append(i10);
        sb2.append(c2);
        return sb2.toString();
    }

    /* renamed from: k */
    public static String m4564k(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: l */
    public static String m4565l(C3966o c3966o, int i10, int i11, C3966o c3966o2, boolean z6) {
        c3966o.m8607Y(i10);
        String strM11629c = f9.m11629c(c3966o2, i11);
        c3966o.m8623p(z6);
        return strM11629c;
    }

    /* renamed from: m */
    public static StringBuilder m4566m(int i10, int i11, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    /* renamed from: n */
    public static StringBuilder m4567n(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    /* renamed from: o */
    public static StringBuilder m4568o(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    /* renamed from: p */
    public static InterfaceC3861d m4569p(C2651t c2651t, int i10) {
        return C3859b.m8404a(new C2650s(c2651t, i10));
    }

    /* renamed from: q */
    public static c1 m4570q(long j6, C3966o c3966o) {
        c1 c1Var = new c1(j6);
        c3966o.j0(c1Var);
        return c1Var;
    }

    /* renamed from: r */
    public static e1 m4571r(a0 a0Var, s0 s0Var, C3966o c3966o) {
        e1 e1Var = new e1(a0Var, s0Var);
        c3966o.j0(e1Var);
        return e1Var;
    }

    /* renamed from: s */
    public static m1 m4572s(long j6, C3977z c3977z) {
        return c3977z.mo8541a(new C1565s(j6));
    }

    /* renamed from: t */
    public static ASN1EncodableVector m4573t(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    /* renamed from: u */
    public static C8541b m4574u(C8545f c8545f, String str, String str2) {
        AbstractC4154l.m8923f(c8545f, str);
        return new C8541b(str2);
    }

    /* renamed from: v */
    public static C8552m m4575v(InterfaceC6747c interfaceC6747c, C3966o c3966o) {
        C8552m c8552m = new C8552m(interfaceC6747c);
        c3966o.j0(c8552m);
        return c8552m;
    }

    /* renamed from: w */
    public static void m4576w(int i10, InterfaceC2141e interfaceC2141e, C3966o c3966o, boolean z6) {
        interfaceC2141e.invoke(c3966o, Integer.valueOf(i10));
        c3966o.m8623p(z6);
    }

    /* renamed from: x */
    public static void m4577x(int i10, C3966o c3966o, int i11, C7636h c7636h) {
        c3966o.j0(Integer.valueOf(i10));
        c3966o.m8610c(Integer.valueOf(i11), c7636h);
    }

    /* renamed from: y */
    public static /* synthetic */ void m4578y(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: z */
    public static void m4579z(String str, String str2, C8805t c8805t) {
        c8805t.m16231f(str + str2);
    }
}
