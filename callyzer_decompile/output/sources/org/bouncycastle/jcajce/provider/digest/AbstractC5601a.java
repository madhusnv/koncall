package org.bouncycastle.jcajce.provider.digest;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import f8.C2216k;
import fd.C2271i;
import fd.C2272j;
import fd.InterfaceC2264b;
import hd.C2891c;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;
import pg.C5920a;
import pg.y8;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.bouncycastle.jcajce.provider.digest.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5601a {
    /* renamed from: A */
    public static void m11226A(String str, String str2, String str3, StringBuilder sb2, ConfigurableProvider configurableProvider) {
        sb2.append(str);
        sb2.append(str2);
        configurableProvider.addAlgorithm(str3, sb2.toString());
    }

    /* renamed from: B */
    public static void m11227B(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, sb2.toString());
    }

    /* renamed from: C */
    public static void m11228C(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    /* renamed from: D */
    public static void m11229D(LMSigParameters lMSigParameters, LMSigParameters.C56901 c56901, LMSigParameters lMSigParameters2) {
        c56901.put(Integer.valueOf(lMSigParameters.type), lMSigParameters2);
    }

    /* renamed from: a */
    public static int m11230a(int i10, int i11, int i12, int i13) {
        return (i10 * i11) + i12 + i13;
    }

    /* renamed from: b */
    public static InterfaceC2264b m11231b(C8849i c8849i, C2891c c2891c) {
        return c2891c.m7001h(new C2272j(c8849i));
    }

    /* renamed from: c */
    public static String m11232c(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    /* renamed from: d */
    public static String m11233d(int i10, String str, StringBuilder sb2) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m11234e(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    /* renamed from: f */
    public static String m11235f(String str, int i10, int i11, String str2) {
        return str + i10 + str2 + i11;
    }

    /* renamed from: g */
    public static String m11236g(String str, C2216k c2216k, String str2, C2216k c2216k2) {
        return str + c2216k + str2 + c2216k2;
    }

    /* renamed from: h */
    public static String m11237h(String str, String str2, Exception exc) {
        return str + exc + str2;
    }

    /* renamed from: i */
    public static String m11238i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: j */
    public static String m11239j(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    /* renamed from: k */
    public static String m11240k(String str, StringBuilder sb2, List list) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: l */
    public static String m11241l(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, str3);
        return string;
    }

    /* renamed from: m */
    public static String m11242m(StringBuilder sb2, boolean z6, String str) {
        sb2.append(z6);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: n */
    public static String m11243n(Key key, StringBuilder sb2, String str) {
        sb2.append(key.getClass());
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: o */
    public static String m11244o(KeySpec keySpec, StringBuilder sb2, String str) {
        sb2.append(keySpec.getClass());
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: p */
    public static StringBuilder m11245p(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    /* renamed from: q */
    public static StringBuilder m11246q(String str, String str2, String str3, StringBuilder sb2, ConfigurableProvider configurableProvider) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        return sb3;
    }

    /* renamed from: r */
    public static StringBuilder m11247r(String str, String str2, StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb2.toString());
        return new StringBuilder();
    }

    /* renamed from: s */
    public static StringBuilder m11248s(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    /* renamed from: t */
    public static ArrayList m11249t(int i10, HashMap map, ArrayList arrayList, int i11, String str) {
        map.put(Integer.valueOf(i10), arrayList);
        ArrayList arrayList2 = new ArrayList(i11);
        arrayList2.add(str);
        return arrayList2;
    }

    /* renamed from: u */
    public static HashMap m11250u(Class cls, C5920a c5920a) {
        HashMap map = new HashMap();
        map.put(cls, c5920a);
        return map;
    }

    /* renamed from: v */
    public static ECFieldElement m11251v(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    /* renamed from: w */
    public static C8849i m11252w(C2271i c2271i) {
        C8849i c8849i = new C8849i(4);
        c8849i.m16319q(c2271i);
        return c8849i;
    }

    /* renamed from: x */
    public static void m11253x(int i10, int i11, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i10, i11, aSN1ObjectIdentifier));
    }

    /* renamed from: y */
    public static void m11254y(Context context, int i10, String str, Context context2) {
        String string = context.getString(i10);
        AbstractC4154l.m8922e(string, str);
        y8.m11952g(context2, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static /* synthetic */ void m11255z(Cursor cursor) throws Exception {
        boolean zIsTerminated;
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (!(cursor instanceof ExecutorService)) {
            if (cursor instanceof TypedArray) {
                ((TypedArray) cursor).recycle();
                return;
            } else if (cursor instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cursor).release();
                return;
            } else {
                if (!(cursor instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) cursor).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cursor;
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
}
