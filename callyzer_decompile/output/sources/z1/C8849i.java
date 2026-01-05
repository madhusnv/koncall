package z1;

import a1.RunnableC0025x;
import a2.AbstractC0030c;
import a9.C0073l;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.ProcessingException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import ch.C0972b;
import com.google.gson.reflect.TypeToken;
import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import com.websoptimization.callyzerbiz.data.retrofit.ApiException;
import d9.RunnableC1669n;
import dy.AbstractC1856d;
import e1.d0;
import e1.h0;
import e1.o0;
import e9.InterfaceC1970a;
import ed.AbstractC2029e;
import ed.C2027c;
import ed.InterfaceC2031g;
import f00.InterfaceC2173b;
import fd.C2271i;
import g00.C2417b;
import g00.EnumC2418c;
import h00.AbstractC2765a;
import h00.InterfaceC2766b;
import h6.C2856l;
import i0.EnumC3089t;
import i0.EnumC3090u;
import i0.EnumC3091v;
import i0.EnumC3092w;
import i0.InterfaceC3093x;
import i0.m0;
import i0.r2;
import i00.C3107l;
import i00.InterfaceC3099d;
import i00.InterfaceC3102g;
import i00.p0;
import id.AbstractC3243m;
import id.C3239i;
import id.C3241k;
import id.C3242l;
import im.e1;
import im.q0;
import im.s0;
import im.y0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jd.AbstractC3755e;
import jd.AbstractC3756f;
import jd.C3751a;
import jd.C3752b;
import jd.C3753c;
import ji.C3773g;
import k0.ExecutorC3900j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import l0.InterfaceC4303c;
import l1.C4327p;
import l4.C4367l;
import nd.EnumC5011b;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nx.C5172j;
import nx.C5174l;
import o6.b0;
import od.C5338b;
import od.C5342f;
import of.C5347b;
import of.C5349d;
import of.ExecutorC5353h;
import og.ce;
import og.d2;
import og.mc;
import og.nd;
import og.u1;
import org.bouncycastle.asn1.BERTags;
import org.json.JSONException;
import org.json.JSONObject;
import p020v.C7597g;
import p020v.a1;
import p021w.C7841g;
import pg.i8;
import q0.C6062c;
import q0.C6069j;
import q0.C6070k;
import qw.C6361k;
import qw.EnumC6359i;
import rc.C6493d;
import s1.C6727v;
import sj.C6849a;
import sj.C6850b;
import sj.EnumC6852d;
import t3.h1;
import th.C7158h;
import th.C7159i;
import u8.C7356d;
import u8.C7361i;
import uh.InterfaceC7458c;
import uw.InterfaceC7564h;
import yg.C8656m;
import yg.InterfaceC8644a;
import ym.C8697h;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.i */
/* loaded from: classes.dex */
public class C8849i implements InterfaceC2766b, InterfaceC3102g, InterfaceC8644a, InterfaceC4303c, InterfaceC2031g, h1, InterfaceC7458c, InterfaceC3093x {

    /* renamed from: a */
    public final /* synthetic */ int f42582a;

    /* renamed from: b */
    public Object f42583b;

    /* renamed from: c */
    public Object f42584c;

    public /* synthetic */ C8849i(int i10, Object obj, Object obj2) {
        this.f42582a = i10;
        this.f42583b = obj;
        this.f42584c = obj2;
    }

    /* renamed from: u */
    public static int m16310u(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d0  */
    @Override // i00.InterfaceC3102g
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5818A(i00.InterfaceC3099d r11, i00.p0 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C8849i.mo5818A(i00.d, i00.p0):void");
    }

    /* renamed from: B */
    public C6361k m16311B() {
        C3241k c3241kM16312C = m16312C();
        m16317J();
        C0972b c0972b = (C0972b) this.f42583b;
        int i10 = c0972b.f5783b;
        String str = (String) c0972b.f5785d;
        char cM2747q = c0972b.m2747q("trying to read attribute equals");
        if (cM2747q != '=') {
            String str2 = "Unexpected '" + cM2747q + "' while trying to read attribute equals";
            int iMax = Math.max(0, c0972b.f5784c - 3);
            int iMin = Math.min(i10 - 1, c0972b.f5784c + 3);
            String strSubstring = str.substring(iMax, iMin + 1);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            throw new DeserializationException(AbstractC0030c.m115f('\n', str2, "At offset " + c0972b.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax, " ") + '^')));
        }
        m16317J();
        char cM2747q2 = c0972b.m2747q("trying to read attribute value");
        if (cM2747q2 != '\'' && cM2747q2 != '\"') {
            String str3 = "Unexpected '" + cM2747q2 + "' while trying to read attribute value";
            int iMax2 = Math.max(0, c0972b.f5784c - 3);
            int iMin2 = Math.min(i10 - 1, c0972b.f5784c + 3);
            String strSubstring2 = str.substring(iMax2, iMin2 + 1);
            AbstractC4154l.m8922e(strSubstring2, "substring(...)");
            throw new DeserializationException(AbstractC0030c.m115f('\n', str3, "At offset " + c0972b.f5784c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring2, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax2, " ") + '^')));
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char cM2747q3 = c0972b.m2747q("trying to read a string");
            if (cM2747q3 == '&') {
                sb2.append(m16314E());
            } else {
                if (cM2747q3 == '<') {
                    int iMax3 = Math.max(0, c0972b.f5784c - 3);
                    int iMin3 = Math.min(i10 - 1, c0972b.f5784c + 3);
                    String strSubstring3 = str.substring(iMax3, iMin3 + 1);
                    AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                    throw new DeserializationException(m0.m7378k("Unexpected '<' while trying to read a string\n", "At offset " + c0972b.f5784c + " (showing range " + iMax3 + '-' + iMin3 + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring3, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax3, " ") + '^')));
                }
                if (cM2747q3 == cM2747q2) {
                    return new C6361k(c3241kM16312C, sb2.toString());
                }
                sb2.append(cM2747q3);
            }
        }
    }

    /* renamed from: C */
    public C3241k m16312C() {
        C0972b c0972b = (C0972b) this.f42583b;
        String str = (String) c0972b.f5785d;
        int i10 = c0972b.f5783b;
        char cCharAt = str.charAt(c0972b.f5784c);
        int i11 = 65;
        if ((AbstractC4154l.m8924g(97, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 122) > 0) && ((AbstractC4154l.m8924g(65, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 90) > 0) && cCharAt != ':' && cCharAt != '_' && ((AbstractC4154l.m8924g(BERTags.PRIVATE, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 214) > 0) && ((AbstractC4154l.m8924g(216, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 246) > 0) && ((AbstractC4154l.m8924g(248, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 767) > 0) && ((AbstractC4154l.m8924g(880, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 893) > 0) && ((AbstractC4154l.m8924g(895, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 8191) > 0) && ((AbstractC4154l.m8924g(8204, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 8205) > 0) && ((AbstractC4154l.m8924g(8304, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 8591) > 0) && ((AbstractC4154l.m8924g(11264, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 12271) > 0) && (AbstractC4154l.m8924g(12289, cCharAt) > 0 || AbstractC4154l.m8924g(cCharAt, 55295) > 0))))))))))) {
            String str2 = "Found '" + cCharAt + "' but expected a valid XML start name character";
            int iMax = Math.max(0, c0972b.f5784c - 3);
            int iMin = Math.min(i10 - 1, c0972b.f5784c + 3);
            String strSubstring = str.substring(iMax, iMin + 1);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            throw new DeserializationException(AbstractC0030c.m115f('\n', str2, "At offset " + c0972b.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax, " ") + '^')));
        }
        int i12 = c0972b.f5784c + 1;
        while (i12 < i10) {
            char cCharAt2 = str.charAt(i12);
            if ((AbstractC4154l.m8924g(97, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 122) > 0) && ((AbstractC4154l.m8924g(i11, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 90) > 0) && ((AbstractC4154l.m8924g(48, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 57) > 0) && cCharAt2 != ':' && cCharAt2 != '-' && cCharAt2 != '.' && cCharAt2 != '_' && cCharAt2 != 183 && ((AbstractC4154l.m8924g(BERTags.PRIVATE, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 214) > 0) && ((AbstractC4154l.m8924g(216, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 246) > 0) && ((AbstractC4154l.m8924g(248, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 767) > 0) && ((AbstractC4154l.m8924g(768, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 879) > 0) && ((AbstractC4154l.m8924g(880, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 893) > 0) && ((AbstractC4154l.m8924g(895, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 8191) > 0) && ((AbstractC4154l.m8924g(8204, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 8205) > 0) && ((AbstractC4154l.m8924g(8255, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 8256) > 0) && ((AbstractC4154l.m8924g(8304, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 8591) > 0) && (AbstractC4154l.m8924g(11264, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 12271) > 0))))))))))))) {
                if (AbstractC4154l.m8924g(12289, cCharAt2) > 0 || AbstractC4154l.m8924g(cCharAt2, 55295) > 0) {
                    break;
                }
            }
            i12++;
            i11 = 65;
        }
        String strM2750t = c0972b.m2750t(i12);
        c0972b.f5784c = i12;
        List listM10111V = AbstractC5178p.m10111V(strM2750t, new char[]{':'}, 0, 6);
        if (!listM10111V.isEmpty()) {
            Iterator it = listM10111V.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    String strM14328h = a1.m14328h('\'', "Cannot understand qualified name '", strM2750t);
                    int iMax2 = Math.max(0, c0972b.f5784c - 3);
                    int iMin2 = Math.min(i10 - 1, c0972b.f5784c + 3);
                    String strSubstring2 = str.substring(iMax2, iMin2 + 1);
                    AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                    throw new DeserializationException(AbstractC0030c.m115f('\n', strM14328h, "At offset " + c0972b.f5784c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring2, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax2, " ") + '^')));
                }
            }
        }
        int size = listM10111V.size();
        if (size == 1) {
            return new C3241k((String) listM10111V.get(0), null);
        }
        if (size == 2) {
            return new C3241k((String) listM10111V.get(1), (String) listM10111V.get(0));
        }
        String strM14328h2 = a1.m14328h('\'', "Cannot understand qualified name '", strM2750t);
        int iMax3 = Math.max(0, c0972b.f5784c - 3);
        int iMin3 = Math.min(i10 - 1, c0972b.f5784c + 3);
        String strSubstring3 = str.substring(iMax3, iMin3 + 1);
        AbstractC4154l.m8922e(strSubstring3, "substring(...)");
        throw new DeserializationException(AbstractC0030c.m115f('\n', strM14328h2, "At offset " + c0972b.f5784c + " (showing range " + iMax3 + '-' + iMin3 + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring3, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax3, " ") + '^')));
    }

    /* renamed from: D */
    public C6850b m16313D() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m16321s());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        EnumC6852d enumC6852d = EnumC6852d.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", enumC6852d.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = C6850b.f32521h;
        C6849a c6849a = new C6849a();
        c6849a.f32518f = 0L;
        c6849a.f32520h = (byte) (c6849a.f32520h | 2);
        c6849a.m13048b(enumC6852d);
        c6849a.f32517e = 0L;
        c6849a.f32520h = (byte) (c6849a.f32520h | 1);
        c6849a.f32513a = strOptString;
        c6849a.m13048b(EnumC6852d.values()[iOptInt]);
        c6849a.f32515c = strOptString2;
        c6849a.f32516d = strOptString3;
        c6849a.f32518f = jOptLong;
        byte b10 = (byte) (c6849a.f32520h | 2);
        c6849a.f32517e = jOptLong2;
        c6849a.f32520h = (byte) (b10 | 1);
        c6849a.f32519g = strOptString4;
        return c6849a.m13047a();
    }

    /* renamed from: E */
    public char[] m16314E() {
        C0972b c0972b = (C0972b) this.f42583b;
        String strM2748r = c0972b.m2748r(";", "trying to read a char/entity reference");
        c0972b.m2734a(1, "trying to read the end of a char/entity reference");
        C5174l c5174lM10086b = AbstractC3756f.f19621a.m10086b(strM2748r);
        if (c5174lM10086b != null) {
            return ce.m10579a(Integer.parseInt((String) ((C5172j) c5174lM10086b.m10082a()).get(1)));
        }
        C5174l c5174lM10086b2 = AbstractC3756f.f19622b.m10086b(strM2748r);
        if (c5174lM10086b2 != null) {
            String str = (String) ((C5172j) c5174lM10086b2.m10082a()).get(1);
            d2.m10599b(16);
            return ce.m10579a(Integer.parseInt(str, 16));
        }
        Object obj = AbstractC3756f.f19623c.get(strM2748r);
        if (obj != null) {
            return (char[]) obj;
        }
        String strM14328h = a1.m14328h('\'', "Unknown reference '", strM2748r);
        int iMax = Math.max(0, c0972b.f5784c - 3);
        int iMin = Math.min(c0972b.f5783b - 1, c0972b.f5784c + 3);
        String strSubstring = ((String) c0972b.f5785d).substring(iMax, iMin + 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        throw new DeserializationException(AbstractC0030c.m115f('\n', strM14328h, "At offset " + c0972b.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax, " ") + '^')));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca A[PHI: r19
      0x01ca: PHI (r19v9 java.lang.Iterable) = (r19v0 java.lang.Iterable), (r19v0 java.lang.Iterable), (r19v4 java.lang.Iterable) binds: [B:39:0x01c8, B:42:0x01d9, B:46:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public id.AbstractC3243m m16315F() {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C8849i.m16315F():id.m");
    }

    /* renamed from: G */
    public int mo14820G(List list, ExecutorC3900j executorC3900j, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f42583b).setRepeatingBurst(list, new C7597g(executorC3900j, captureCallback), ((C7841g) this.f42584c).f37606a);
    }

    /* renamed from: H */
    public int mo14821H(CaptureRequest captureRequest, ExecutorC3900j executorC3900j, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f42583b).setRepeatingRequest(captureRequest, new C7597g(executorC3900j, captureCallback), ((C7841g) this.f42584c).f37606a);
    }

    /* renamed from: I */
    public void m16316I() {
        C0972b c0972b = (C0972b) this.f42583b;
        String str = (String) c0972b.f5785d;
        int iM10099J = AbstractC5178p.m10099J(str, "-->", c0972b.f5784c, false, 4);
        if (iM10099J >= 0) {
            int i10 = 3 + iM10099J;
            c0972b.m2750t(i10);
            c0972b.f5784c = i10;
            return;
        }
        String strConcat = "Unexpected end-of-doc while ".concat("looking for the end of a comment");
        int iMax = Math.max(0, c0972b.f5784c - 3);
        int iMin = Math.min(c0972b.f5783b - 1, c0972b.f5784c + 3);
        String strSubstring = str.substring(iMax, iMin + 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        throw new DeserializationException(AbstractC0030c.m115f('\n', strConcat, "At offset " + c0972b.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(c0972b.f5784c - iMax, " ") + '^')));
    }

    /* renamed from: J */
    public void m16317J() {
        C0972b c0972b = (C0972b) this.f42583b;
        while (true) {
            int i10 = c0972b.f5784c;
            if (i10 >= c0972b.f5783b) {
                return;
            }
            char cCharAt = ((String) c0972b.f5785d).charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') {
                return;
            } else {
                c0972b.f5784c++;
            }
        }
    }

    /* renamed from: K */
    public void m16318K(C7361i workSpecId, int i10) {
        AbstractC4154l.m8923f(workSpecId, "workSpecId");
        ((InterfaceC1970a) this.f42584c).m5712a(new RunnableC1669n((C7356d) this.f42583b, workSpecId, false, i10));
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: L */
    public void mo5819L(InterfaceC3099d interfaceC3099d, Throwable th2) {
        switch (this.f42582a) {
            case 6:
                ((C3107l) this.f42584c).f16669a.execute(new RunnableC0025x(13, this, (InterfaceC3102g) this.f42583b, th2));
                break;
            default:
                ((InterfaceC3102g) this.f42583b).mo5818A((C8697h) this.f42584c, p0.m7457a(th2 instanceof ApiException ? new s0(((ApiException) th2).f7377a) : th2 instanceof IOException ? new y0((IOException) th2) : new e1(th2)));
                break;
        }
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        int i10 = ((C6069j) this.f42583b).f29598f;
        if (i10 == 2 && (th2 instanceof CancellationException)) {
            u1.m10942a("SurfaceProcessorNode");
        } else {
            mc.m10762a(i10);
            u1.m10952k("SurfaceProcessorNode");
        }
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: a */
    public r2 mo7424a() {
        return (r2) this.f42583b;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: b */
    public EnumC3092w mo7425b() {
        Integer num = (Integer) ((CaptureResult) this.f42584c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC3092w.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC3092w.NONE;
        }
        if (iIntValue == 2) {
            return EnumC3092w.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC3092w.FIRED;
        }
        u1.m10943b("C2CameraCaptureResult");
        return EnumC3092w.UNKNOWN;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: c */
    public long mo7426c() {
        Long l9 = (Long) ((CaptureResult) this.f42584c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l9 == null) {
            return -1L;
        }
        return l9.longValue();
    }

    @Override // h00.InterfaceC2766b
    /* renamed from: d */
    public InterfaceC2766b mo6757d(Throwable th2) {
        ((C0073l) this.f42583b).f267d = th2;
        return this;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: e */
    public EnumC3091v mo7427e() {
        Integer num = (Integer) ((CaptureResult) this.f42584c).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC3091v.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC3091v.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC3091v.METERING;
        }
        if (iIntValue == 2) {
            return EnumC3091v.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC3091v.LOCKED;
        }
        u1.m10943b("C2CameraCaptureResult");
        return EnumC3091v.UNKNOWN;
    }

    @Override // ed.InterfaceC2031g
    public AbstractC2029e evaluate(Object obj) {
        AbstractC2029e abstractC2029eEvaluate = ((InterfaceC2031g) this.f42583b).evaluate(obj);
        if (!(abstractC2029eEvaluate instanceof C2027c)) {
            return abstractC2029eEvaluate;
        }
        InterfaceC7564h interfaceC7564h = (InterfaceC7564h) this.f42584c;
        C5338b c5338b = new C5338b(13);
        EnumC5011b enumC5011b = EnumC5011b.Debug;
        String strM8913b = a0.m8901a(C6493d.class).m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        u1.m10948g(interfaceC7564h, enumC5011b, strM8913b, null, c5338b);
        return abstractC2029eEvaluate;
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) {
        Bundle bundle;
        C5347b c5347b = (C5347b) this.f42583b;
        Bundle bundle2 = (Bundle) this.f42584c;
        c5347b.getClass();
        return (c8656m.m15985l() && (bundle = (Bundle) c8656m.m15983j()) != null && bundle.containsKey("google.messenger")) ? c5347b.m10476a(bundle2).m15986m(ExecutorC5353h.f26280c, C5349d.f26275d) : c8656m;
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        C6070k c6070k = (C6070k) obj;
        c6070k.getClass();
        try {
            ((C6062c) ((C4367l) this.f42584c).f21921b).mo12067c(c6070k);
        } catch (ProcessingException unused) {
            u1.m10944c("SurfaceProcessorNode");
        }
    }

    @Override // t3.h1
    /* renamed from: h */
    public boolean mo13308h(Object obj, Object obj2) {
        C6727v c6727v = (C6727v) this.f42583b;
        return AbstractC4154l.m8918a(c6727v.m12868b(obj), c6727v.m12868b(obj2));
    }

    @Override // h00.InterfaceC2766b
    /* renamed from: i */
    public InterfaceC2766b mo6758i(Object obj, String str) {
        C0073l c0073l = (C0073l) this.f42583b;
        if (((ArrayList) c0073l.f266c) == null) {
            c0073l.f266c = new ArrayList(4);
        }
        ((ArrayList) c0073l.f266c).add(new C2417b(str, obj));
        return this;
    }

    @Override // t3.h1
    /* renamed from: j */
    public void mo13309j(e1.y0 y0Var) {
        d0 d0Var = (d0) this.f42584c;
        d0Var.m5532a();
        Iterator it = y0Var.iterator();
        while (true) {
            h0 h0Var = (h0) it;
            if (!h0Var.hasNext()) {
                return;
            }
            Object next = h0Var.next();
            Object objM12868b = ((C6727v) this.f42583b).m12868b(next);
            int iM5535d = d0Var.m5535d(objM12868b);
            int i10 = iM5535d >= 0 ? d0Var.f8949c[iM5535d] : 0;
            if (i10 == 7) {
                y0Var.remove(next);
            } else {
                d0Var.m5539h(i10 + 1, objM12868b);
            }
        }
    }

    @Override // h00.InterfaceC2766b
    /* renamed from: k */
    public InterfaceC2766b mo6759k(C5342f c5342f) {
        ((C0073l) this.f42583b).f265b = (String) c5342f.get();
        return this;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: l */
    public EnumC3089t mo7428l() {
        Integer num = (Integer) ((CaptureResult) this.f42584c).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC3089t.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC3089t.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC3089t.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC3089t.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC3089t.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                u1.m10943b("C2CameraCaptureResult");
                return EnumC3089t.UNKNOWN;
            }
        }
        return EnumC3089t.SEARCHING;
    }

    @Override // h00.InterfaceC2766b
    /* renamed from: m */
    public void mo6760m() {
        StringBuilder sb2;
        C0073l c0073l = (C0073l) this.f42583b;
        if (((String) c0073l.f268e) == null) {
            c0073l.f268e = "z1.i";
        }
        InterfaceC2173b interfaceC2173b = (InterfaceC2173b) this.f42584c;
        Throwable th2 = (Throwable) c0073l.f267d;
        int i10 = 0;
        Object[] objArr = new Object[th2 == null ? 0 : 1];
        if (th2 != null) {
            objArr[0] = th2;
        }
        ArrayList arrayList = (ArrayList) c0073l.f266c;
        if (arrayList == null || arrayList.isEmpty()) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C2417b c2417b = (C2417b) obj;
                sb2.append(c2417b.f10910a);
                sb2.append('=');
                sb2.append(c2417b.f10911b);
                sb2.append(' ');
            }
        }
        String string = (String) c0073l.f265b;
        if (sb2 != null) {
            sb2.append(string);
            string = sb2.toString();
        }
        int i11 = AbstractC2765a.f15336a[((EnumC2418c) c0073l.f264a).ordinal()];
        if (i11 == 1) {
            interfaceC2173b.mo5845u(string, objArr);
            return;
        }
        if (i11 == 2) {
            interfaceC2173b.mo5839o(string, objArr);
            return;
        }
        if (i11 == 3) {
            interfaceC2173b.mo5847w(string, objArr);
        } else if (i11 == 4) {
            interfaceC2173b.mo5834j(string, objArr);
        } else {
            if (i11 != 5) {
                return;
            }
            interfaceC2173b.mo5838n(string, objArr);
        }
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: n */
    public CaptureResult mo7429n() {
        return (CaptureResult) this.f42584c;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: o */
    public EnumC3090u mo7430o() {
        Integer num = (Integer) ((CaptureResult) this.f42584c).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC3090u.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                u1.m10943b("C2CameraCaptureResult");
                break;
        }
        return EnumC3090u.UNKNOWN;
    }

    /* renamed from: p */
    public int mo14822p(List list, ExecutorC3900j executorC3900j, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f42583b).captureBurst(list, new C7597g(executorC3900j, captureCallback), ((C7841g) this.f42584c).f37606a);
    }

    /* renamed from: q */
    public void m16319q(C2271i c2271i) {
        ArrayList arrayList = (ArrayList) this.f42583b;
        c2271i.f10279b = arrayList.size();
        arrayList.add(c2271i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m16320r(java.lang.Object r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f42584c
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            boolean r1 = r7 instanceof ec.C2013k
            if (r1 == 0) goto L17
            r1 = r7
            ec.k r1 = (ec.C2013k) r1
            int r2 = r1.f9550e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f9550e = r2
            goto L1c
        L17:
            ec.k r1 = new ec.k
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.f9548c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f9550e
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            dy.c r6 = r1.f9547b
            java.lang.Object r1 = r1.f9546a
            og.od.m10798c(r7)
            r7 = r6
            r6 = r1
            goto L4d
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            og.od.m10798c(r7)
            java.lang.Object r7 = r5.f42583b
            dy.c r7 = (dy.C1855c) r7
            r1.f9546a = r6
            r1.f9547b = r7
            r1.f9550e = r4
            java.lang.Object r1 = r7.mo1768h(r1)
            if (r1 != r2) goto L4d
            return r2
        L4d:
            r1 = 0
            boolean r2 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.remove(r6)     // Catch: java.lang.Throwable -> L66
            kotlin.jvm.internal.AbstractC4154l.m8920c(r2)     // Catch: java.lang.Throwable -> L66
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L66
        L5e:
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L66
            r7.mo1769j(r1)
            return r6
        L66:
            r6 = move-exception
            r7.mo1769j(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C8849i.m16320r(java.lang.Object, ww.c):java.lang.Object");
    }

    /* renamed from: s */
    public File m16321s() {
        if (((File) this.f42583b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f42583b) == null) {
                        C3773g c3773g = (C3773g) this.f42584c;
                        c3773g.m8293a();
                        this.f42583b = new File(c3773g.f19662a.getFilesDir(), "PersistedInstallation." + ((C3773g) this.f42584c).m8295d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f42583b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qw.g] */
    /* renamed from: t */
    public InputMethodManager m16322t() {
        return (InputMethodManager) this.f42584c.getValue();
    }

    /* renamed from: v */
    public void m16323v(C6850b c6850b) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c6850b.f32522a);
            jSONObject.put("Status", c6850b.f32523b.ordinal());
            jSONObject.put("AuthToken", c6850b.f32524c);
            jSONObject.put("RefreshToken", c6850b.f32525d);
            jSONObject.put("TokenCreationEpochInSecs", c6850b.f32527f);
            jSONObject.put("ExpiresInSecs", c6850b.f32526e);
            jSONObject.put("FisError", c6850b.f32528g);
            C3773g c3773g = (C3773g) this.f42584c;
            c3773g.m8293a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c3773g.f19662a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m16321s())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: w */
    public void m16324w() {
        ((SparseIntArray) this.f42583b).clear();
    }

    /* renamed from: x */
    public AbstractC3243m m16325x() {
        char cCharAt;
        C3751a c3751a = C3751a.f19609b;
        C0972b c0972b = (C0972b) this.f42583b;
        i8 i8Var = (i8) this.f42584c;
        Object obj = C3751a.f19610c;
        if (i8Var.equals(obj)) {
            return null;
        }
        if (i8Var instanceof C3752b) {
            C3752b c3752b = (C3752b) i8Var;
            C3753c c3753c = c3752b.f19614b;
            if (c3753c != null) {
                obj = c3753c;
            }
            this.f42584c = obj;
            return new C3239i(c3752b.f19615c, c3752b.f19613a);
        }
        boolean z6 = true;
        if (!(i8Var instanceof C3753c)) {
            if (!i8Var.equals(C3751a.f19611d)) {
                if (!i8Var.equals(c3751a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m16317J();
                return m16315F();
            }
            m16317J();
            while (c0972b.m2738g("<?")) {
                while (true) {
                    int i10 = c0972b.f5784c;
                    if (i10 >= c0972b.f5783b || (cCharAt = ((String) c0972b.f5785d).charAt(i10)) == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ') {
                        break;
                    }
                    c0972b.f5784c++;
                }
                m16317J();
                while (!c0972b.m2738g("?>")) {
                    m16311B();
                    m16317J();
                }
                m16317J();
            }
            this.f42584c = c3751a;
            return m16325x();
        }
        if (c0972b.m2745o("<") && !c0972b.m2745o("<![CDATA[")) {
            return m16315F();
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char cM2747q = c0972b.m2747q("reading text node");
            if (cM2747q == '\t' || cM2747q == '\n' || cM2747q == '\r' || cM2747q == ' ') {
                sb2.append(cM2747q);
            } else {
                if (cM2747q == '&') {
                    sb2.append(m16314E());
                } else if (cM2747q == '<') {
                    if (!c0972b.m2738g("!--")) {
                        if (!c0972b.m2738g("![CDATA[")) {
                            break;
                        }
                        String strM2748r = c0972b.m2748r("]]>", "trying to read CDATA content");
                        c0972b.m2734a(3, "trying to read end of CATA");
                        sb2.append(strM2748r);
                    } else {
                        m16316I();
                    }
                } else {
                    sb2.append(cM2747q);
                }
                z6 = false;
            }
        }
        c0972b.m2749s("looking for the beginning of a tag");
        String string = sb2.toString();
        C3753c c3753c2 = (C3753c) ((i8) this.f42584c);
        boolean z10 = c3753c2.f19618c;
        boolean zM2745o = c0972b.m2745o("</");
        C3753c c3753cM8279c = C3753c.m8279c(c3753c2);
        this.f42584c = c3753cM8279c;
        if (!z6 || (!z10 && zM2745o)) {
            return new C3242l(c3753cM8279c.f19619d, string);
        }
        AbstractC3243m abstractC3243mM16325x = m16325x();
        AbstractC4154l.m8920c(abstractC3243mM16325x);
        return abstractC3243mM16325x;
    }

    /* renamed from: y */
    public void m16326y(String str) {
        Object objM8857d = im.h0.m7641a().m8857d(str, new TypeToken<BaseResponse<String>>() { // from class: com.websoptimization.callyzerbiz.data.retrofit.NetworkResponseCall$enqueue$1$processRequestFailed403Response$$inlined$fromJson$1
        }.getType());
        AbstractC4154l.m8920c(objM8857d);
        ((InterfaceC3102g) this.f42583b).mo5818A((C8697h) this.f42584c, p0.m7457a(new q0((BaseResponse) objM8857d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m16327z(kb.C4042f r6, kb.C4043g r7, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f42584c
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            boolean r1 = r8 instanceof ec.C2014l
            if (r1 == 0) goto L17
            r1 = r8
            ec.l r1 = (ec.C2014l) r1
            int r2 = r1.f9556f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f9556f = r2
            goto L1c
        L17:
            ec.l r1 = new ec.l
            r1.<init>(r5, r8)
        L1c:
            java.lang.Object r8 = r1.f9554d
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f9556f
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            dy.c r6 = r1.f9553c
            java.lang.Object r7 = r1.f9552b
            java.lang.Object r1 = r1.f9551a
            og.od.m10798c(r8)
            r8 = r6
            r6 = r1
            goto L51
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            og.od.m10798c(r8)
            java.lang.Object r8 = r5.f42583b
            dy.c r8 = (dy.C1855c) r8
            r1.f9551a = r6
            r1.f9552b = r7
            r1.f9553c = r8
            r1.f9556f = r4
            java.lang.Object r1 = r8.mo1768h(r1)
            if (r1 != r2) goto L51
            return r2
        L51:
            r1 = 0
            boolean r2 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L75
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L73
            r3 = 100
            if (r2 != r3) goto L75
            java.util.Set r2 = r0.keySet()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "<get-keys>(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r2, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = rw.AbstractC6663m.m12741E(r2)     // Catch: java.lang.Throwable -> L73
            r0.remove(r2)     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            r6 = move-exception
            goto L8e
        L75:
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> L73
            boolean r7 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L88
            java.lang.Object r7 = r0.remove(r6)     // Catch: java.lang.Throwable -> L73
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)     // Catch: java.lang.Throwable -> L73
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> L73
        L88:
            qw.a0 r6 = qw.a0.f30746a     // Catch: java.lang.Throwable -> L73
            r8.mo1769j(r1)
            return r6
        L8e:
            r8.mo1769j(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C8849i.m16327z(kb.f, kb.g, ww.c):java.lang.Object");
    }

    @Override // uh.InterfaceC7458c
    public Object zza() {
        return new C7158h(((C2856l) ((C4327p) this.f42583b).f21788b).f15864a, (C7159i) ((InterfaceC7458c) this.f42584c).zza());
    }

    public /* synthetic */ C8849i(int i10, Object obj, Object obj2, boolean z6) {
        this.f42582a = i10;
        this.f42584c = obj;
        this.f42583b = obj2;
    }

    public /* synthetic */ C8849i(int i10, boolean z6) {
        this.f42582a = i10;
    }

    public C8849i(int i10) {
        this.f42582a = i10;
        switch (i10) {
            case 4:
                this.f42583b = new ArrayList();
                this.f42584c = new LinkedHashSet();
                break;
            case 22:
                this.f42583b = new AtomicInteger();
                this.f42584c = new AtomicInteger();
                break;
            case 24:
                this.f42583b = new SparseIntArray();
                this.f42584c = new SparseIntArray();
                break;
            default:
                this.f42583b = AbstractC1856d.m5490a();
                this.f42584c = new LinkedHashMap();
                break;
        }
    }

    public C8849i(AbstractC8894w abstractC8894w) {
        this.f42582a = 26;
        this.f42583b = abstractC8894w;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC4154l.m8922e(setNewSetFromMap, "newSetFromMap(...)");
        this.f42584c = setNewSetFromMap;
    }

    public C8849i(CameraCaptureSession cameraCaptureSession, C7841g c7841g) {
        this.f42582a = 21;
        cameraCaptureSession.getClass();
        this.f42583b = cameraCaptureSession;
        this.f42584c = c7841g;
    }

    public C8849i(C0972b c0972b) {
        this.f42582a = 7;
        this.f42583b = c0972b;
        this.f42584c = C3751a.f19611d;
    }

    public C8849i(C7356d processor, InterfaceC1970a workTaskExecutor) {
        this.f42582a = 17;
        AbstractC4154l.m8923f(processor, "processor");
        AbstractC4154l.m8923f(workTaskExecutor, "workTaskExecutor");
        this.f42583b = processor;
        this.f42584c = workTaskExecutor;
    }

    public C8849i(View view) {
        this.f42582a = 0;
        this.f42583b = view;
        this.f42584c = nd.m10781b(EnumC6359i.NONE, new b0(21, this));
    }

    public C8849i(C3773g c3773g) {
        this.f42582a = 15;
        this.f42584c = c3773g;
    }

    public C8849i(C6727v c6727v) {
        this.f42582a = 14;
        this.f42583b = c6727v;
        d0 d0Var = o0.f9033a;
        this.f42584c = new d0();
    }

    public C8849i(InterfaceC2031g policy, InterfaceC7564h coroutineContext) {
        this.f42582a = 13;
        AbstractC4154l.m8923f(policy, "policy");
        AbstractC4154l.m8923f(coroutineContext, "coroutineContext");
        this.f42583b = policy;
        this.f42584c = coroutineContext;
    }

    public C8849i(ExecutorC3900j executorC3900j) {
        this.f42582a = 20;
        this.f42584c = new AtomicBoolean(true);
    }
}
