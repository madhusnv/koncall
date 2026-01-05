package yv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.i18n.phonenumbers.C1404a;
import com.google.i18n.phonenumbers.NumberParseException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import k2.i2;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import sk.C6863k;
import sq.n2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.f */
/* loaded from: classes3.dex */
public final class C8791f {

    /* renamed from: a */
    public static final C8791f f42457a = new C8791f();

    /* renamed from: b */
    public static final i2 f42458b = new i2(new n2(20));

    /* renamed from: b */
    public static C6863k m16169b(String toNumber, String region) {
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(region, "region");
        try {
            return C1404a.m4499e().m4517t(toNumber, region);
        } catch (NumberParseException e2) {
            e2.printStackTrace();
            throw e2;
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                throw new Exception("Phone Number " + toNumber + " country " + Locale.getDefault().getCountry(), e10);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: c */
    public static boolean m16170c(String str) {
        if (str != null && !str.equals("")) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z6 = false;
            while (i10 <= length) {
                boolean z10 = AbstractC4154l.m8924g(str.charAt(!z6 ? i10 : length), 32) <= 0;
                if (z6) {
                    if (!z10) {
                        break;
                    }
                    length--;
                } else if (z10) {
                    i10++;
                } else {
                    z6 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() != 0 && !str.equalsIgnoreCase("null")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m16171d(String str) {
        return !m16170c(str);
    }

    /* renamed from: e */
    public static boolean m16172e(String numberWithCountryCode, String countryRegion) {
        AbstractC4154l.m8923f(numberWithCountryCode, "numberWithCountryCode");
        AbstractC4154l.m8923f(countryRegion, "countryRegion");
        try {
            C1404a c1404aM4499e = C1404a.m4499e();
            if (countryRegion.length() != 0) {
                if (!AbstractC5178p.m10116x(numberWithCountryCode, "+", false)) {
                    numberWithCountryCode = "+".concat(numberWithCountryCode);
                }
                String strM4512l = c1404aM4499e.m4512l(c1404aM4499e.m4517t(numberWithCountryCode, ""));
                if (m16171d(strM4512l)) {
                    if (AbstractC5185w.m10130l(strM4512l, countryRegion, true)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public static String m16173f(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    String string = byteArrayOutputStream.toString();
                    AbstractC4154l.m8920c(string);
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            throw e2;
        }
    }

    /* renamed from: g */
    public static boolean m16174g(Context context, String str) {
        AbstractC4154l.m8923f(context, "<this>");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16175a(java.util.List r8, rn.C6590s r9, h1.C2771b r10, lu.C4525k r11, ww.AbstractC8193c r12) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r12 instanceof yv.C8790e
            if (r0 == 0) goto L13
            r0 = r12
            yv.e r0 = (yv.C8790e) r0
            int r1 = r0.f42456c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42456c = r1
            goto L18
        L13:
            yv.e r0 = new yv.e
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.f42454a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f42456c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L38
            if (r2 == r6) goto L34
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            goto L34
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            og.od.m10798c(r12)
            goto L64
        L38:
            og.od.m10798c(r12)
            if (r8 == 0) goto L5c
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L4f
            java.util.List r8 = kotlin.jvm.internal.d0.m8905b(r8)
            r0.f42456c = r6
            r11.invoke(r8, r0)
            if (r3 != r1) goto L64
            goto L63
        L4f:
            java.util.List r8 = kotlin.jvm.internal.d0.m8905b(r8)
            r0.f42456c = r5
            java.lang.Object r8 = r9.invoke(r8, r0)
            if (r8 != r1) goto L64
            goto L63
        L5c:
            r0.f42456c = r4
            r10.invoke(r0)
            if (r3 != r1) goto L64
        L63:
            return r1
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.C8791f.m16175a(java.util.List, rn.s, h1.b, lu.k, ww.c):java.lang.Object");
    }
}
