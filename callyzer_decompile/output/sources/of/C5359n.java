package of;

import ag.ThreadFactoryC0141a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import com.amplifyframework.core.model.ModelIdentifier;
import cv.C1517m;
import d3.AbstractC1548b;
import d3.AbstractC1554h;
import d3.C1559m;
import d3.h0;
import ex.InterfaceC2139c;
import gi.InterfaceC2618a;
import hd.AbstractC2894f;
import hd.AbstractC2895g;
import hd.C2901m;
import hd.C2903o;
import hd.C2904p;
import hd.C2909u;
import hd.EnumC2908t;
import ii.C3272n;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import nx.AbstractC5185w;
import og.cg;
import og.d2;
import og.dg;
import og.wd;
import pg.AbstractC5934o;
import pg.n7;
import q7.C6136c;
import qw.C6361k;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.n */
/* loaded from: classes.dex */
public final class C5359n implements InterfaceC2618a {

    /* renamed from: e */
    public static C5359n f26302e;

    /* renamed from: a */
    public int f26303a;

    /* renamed from: b */
    public final Object f26304b;

    /* renamed from: c */
    public Object f26305c;

    /* renamed from: d */
    public Object f26306d;

    public /* synthetic */ C5359n(int i10, Object obj, Object obj2, Object obj3) {
        this.f26304b = obj;
        this.f26303a = i10;
        this.f26305c = obj2;
        this.f26306d = obj3;
    }

    /* renamed from: J */
    public static synchronized C5359n m10484J(Context context) {
        try {
            if (f26302e == null) {
                f26302e = new C5359n(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC0141a("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f26302e;
    }

    /* renamed from: d */
    public static void m10485d(C5359n c5359n, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = c5359n.f26303a;
        }
        throw new DeserializationException("Unexpected JSON token at offset " + i10 + "; " + str, null);
    }

    /* renamed from: A */
    public void m10486A(float f6) {
        ((Paint) this.f26304b).setStrokeWidth(f6);
    }

    /* renamed from: B */
    public void m10487B(int i10) {
        ((Paint) this.f26304b).setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* renamed from: C */
    public void m10488C() {
        C2909u c2909u = (C2909u) this.f26306d;
        int size = c2909u.f15942a.size();
        m10503j();
        while (c2909u.f15942a.size() > size) {
            m10503j();
        }
    }

    /* renamed from: D */
    public AbstractC5934o m10489D() {
        Character chM10501g = m10501g();
        if (chM10501g != null && chM10501g.charValue() == ']') {
            m10497b();
            return C2901m.f15935b;
        }
        C2909u c2909u = (C2909u) this.f26306d;
        c2909u.f15943b.add(new C1517m(21));
        return m10511r();
    }

    /* renamed from: E */
    public AbstractC5934o m10490E() {
        Character chM10501g = m10501g();
        if (chM10501g != null && chM10501g.charValue() == ']') {
            m10497b();
            return C2901m.f15935b;
        }
        if (chM10501g == null || chM10501g.charValue() != ',') {
            m10494I(chM10501g, ",", "]");
            throw null;
        }
        m10496a(',');
        return m10511r();
    }

    /* renamed from: F */
    public AbstractC5934o m10491F() {
        Character chM10501g = m10501g();
        if (chM10501g == null || chM10501g.charValue() != ':') {
            m10494I(chM10501g, ":");
            throw null;
        }
        m10496a(':');
        C2909u c2909u = (C2909u) this.f26306d;
        c2909u.f15943b.add(new C1517m(23));
        return m10511r();
    }

    /* renamed from: G */
    public AbstractC5934o m10492G() {
        Character chM10501g = m10501g();
        if (chM10501g != null && chM10501g.charValue() == '}') {
            m10498c();
            return C2903o.f15937b;
        }
        if (chM10501g != null && chM10501g.charValue() == '\"') {
            return m10509p();
        }
        m10494I(chM10501g, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "}");
        throw null;
    }

    /* renamed from: H */
    public AbstractC5934o m10493H() {
        Character chM10501g = m10501g();
        if (chM10501g != null && chM10501g.charValue() == '}') {
            m10498c();
            return C2903o.f15937b;
        }
        if (chM10501g == null || chM10501g.charValue() != ',') {
            m10494I(chM10501g, ",", "}");
            throw null;
        }
        m10496a(',');
        m10501g();
        return m10509p();
    }

    /* renamed from: I */
    public void m10494I(Character ch2, String... strArr) {
        String str = strArr.length > 1 ? " one of" : "";
        m10485d(this, "found `" + ch2 + "`, expected" + str + ' ' + AbstractC6662l.m12702E(strArr, ", ", new C1517m(22), 30), 0, 6);
        throw null;
    }

    /* renamed from: K */
    public synchronized C8656m m10495K(C5358m c5358m) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(c5358m.toString());
            }
            if (!((ServiceConnectionC5357l) this.f26306d).m10481d(c5358m)) {
                ServiceConnectionC5357l serviceConnectionC5357l = new ServiceConnectionC5357l(this);
                this.f26306d = serviceConnectionC5357l;
                serviceConnectionC5357l.m10481d(c5358m);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c5358m.f26298b.f41930a;
    }

    /* renamed from: a */
    public void m10496a(char c2) {
        byte[] bArr = (byte[]) this.f26304b;
        int i10 = this.f26303a;
        char c10 = (char) bArr[i10];
        if (c10 == c2) {
            this.f26303a = i10 + 1;
            return;
        }
        m10485d(this, ("Unexpected char `" + c10 + "` expected `" + c2 + '`').toString(), i10, 4);
        throw null;
    }

    /* renamed from: b */
    public void m10497b() {
        m10496a(']');
        C2909u c2909u = (C2909u) this.f26306d;
        EnumC2908t enumC2908t = (EnumC2908t) wd.m11034b(c2909u.f15942a);
        boolean z6 = enumC2908t == EnumC2908t.ArrayFirstValueOrEnd || enumC2908t == EnumC2908t.ArrayNextValueOrEnd;
        int i10 = this.f26303a - 1;
        if (z6) {
            c2909u.f15943b.add(new C1517m(24));
        } else {
            m10485d(this, "Unexpected close `]` encountered", i10, 4);
            throw null;
        }
    }

    /* renamed from: c */
    public void m10498c() {
        m10496a('}');
        C2909u c2909u = (C2909u) this.f26306d;
        EnumC2908t enumC2908t = (EnumC2908t) wd.m11034b(c2909u.f15942a);
        boolean z6 = enumC2908t == EnumC2908t.ObjectFirstKeyOrEnd || enumC2908t == EnumC2908t.ObjectNextKeyOrEnd;
        int i10 = this.f26303a - 1;
        if (z6) {
            c2909u.f15943b.add(new C1517m(25));
        } else {
            m10485d(this, "Unexpected close `}` encountered", i10, 4);
            throw null;
        }
    }

    /* renamed from: e */
    public int m10499e() {
        Paint.Cap strokeCap = ((Paint) this.f26304b).getStrokeCap();
        int i10 = strokeCap == null ? -1 : AbstractC1554h.f7746a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: f */
    public int m10500f() {
        Paint.Join strokeJoin = ((Paint) this.f26304b).getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : AbstractC1554h.f7747b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: g */
    public Character m10501g() {
        while (true) {
            Character chM10505l = m10505l();
            if (chM10505l == null || !d2.m10603f(chM10505l.charValue())) {
                break;
            }
            this.f26303a++;
        }
        return m10505l();
    }

    /* renamed from: h */
    public char m10502h() {
        char cM10506m = m10506m();
        this.f26303a++;
        return cM10506m;
    }

    @Override // gi.InterfaceC2618a
    /* renamed from: i */
    public byte[] mo67i(int i10, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        C3272n c3272n = (C3272n) this.f26304b;
        if (i10 > this.f26303a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) c3272n.get()).update(bArr);
        return Arrays.copyOf(((Mac) c3272n.get()).doFinal(), i10);
    }

    /* renamed from: j */
    public AbstractC5934o m10503j() {
        AbstractC5934o abstractC5934oM10504k = m10504k();
        this.f26305c = null;
        C2909u c2909u = (C2909u) this.f26306d;
        List list = c2909u.f15943b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2139c) it.next()).invoke(c2909u.f15942a);
        }
        list.clear();
        return abstractC5934oM10504k;
    }

    /* renamed from: k */
    public AbstractC5934o m10504k() {
        AbstractC5934o abstractC5934oM10511r;
        AbstractC5934o abstractC5934o = (AbstractC5934o) this.f26305c;
        if (abstractC5934o != null) {
            return abstractC5934o;
        }
        try {
            switch (AbstractC2894f.f15926a[((EnumC2908t) wd.m11034b(((C2909u) this.f26306d).f15942a)).ordinal()]) {
                case 1:
                    abstractC5934oM10511r = m10511r();
                    break;
                case 2:
                    abstractC5934oM10511r = m10489D();
                    break;
                case 3:
                    abstractC5934oM10511r = m10490E();
                    break;
                case 4:
                    abstractC5934oM10511r = m10492G();
                    break;
                case 5:
                    abstractC5934oM10511r = m10493H();
                    break;
                case 6:
                    abstractC5934oM10511r = m10491F();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            this.f26305c = abstractC5934oM10511r;
            return abstractC5934oM10511r;
        } catch (DeserializationException e2) {
            throw e2;
        } catch (Exception e10) {
            throw new DeserializationException(e10);
        }
    }

    /* renamed from: l */
    public Character m10505l() {
        byte[] bArr = (byte[]) this.f26304b;
        int i10 = this.f26303a;
        AbstractC4154l.m8923f(bArr, "<this>");
        Byte bValueOf = (i10 < 0 || i10 >= bArr.length) ? null : Byte.valueOf(bArr[i10]);
        if (bValueOf != null) {
            return Character.valueOf((char) bValueOf.byteValue());
        }
        return null;
    }

    /* renamed from: m */
    public char m10506m() {
        Character chM10505l = m10505l();
        if (chM10505l != null) {
            return chM10505l.charValue();
        }
        throw new IllegalStateException("Unexpected EOF");
    }

    /* renamed from: n */
    public void m10507n(StringBuilder sb2) {
        while (AbstractC6663m.m12767z(AbstractC2895g.f15927a, m10505l())) {
            sb2.append(m10502h());
        }
    }

    /* renamed from: o */
    public void m10508o(String str, AbstractC5934o abstractC5934o) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            m10496a(str.charAt(i10));
        }
    }

    /* renamed from: p */
    public C2904p m10509p() {
        char cM10506m = m10506m();
        if (cM10506m != '\"') {
            m10494I(Character.valueOf(cM10506m), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            throw null;
        }
        String strM10510q = m10510q();
        C2909u c2909u = (C2909u) this.f26306d;
        c2909u.f15943b.add(new C1517m(26));
        return new C2904p(strM10510q);
    }

    /* renamed from: q */
    public String m10510q() {
        byte[] bArr = (byte[]) this.f26304b;
        m10496a('\"');
        int i10 = this.f26303a;
        char cM10506m = m10506m();
        boolean z6 = false;
        while (cM10506m != '\"') {
            if (cM10506m == '\\') {
                m10502h();
                char cM10502h = m10502h();
                if (cM10502h != '\"' && cM10502h != '/' && cM10502h != '\\' && cM10502h != 'b' && cM10502h != 'f' && cM10502h != 'n' && cM10502h != 'r' && cM10502h != 't') {
                    if (cM10502h != 'u') {
                        m10485d(this, "Invalid escape character: `" + cM10502h + '`', this.f26303a - 1, 4);
                        throw null;
                    }
                    int i11 = this.f26303a;
                    int i12 = i11 + 4;
                    if (i12 >= bArr.length) {
                        m10485d(this, "Unexpected EOF reading escaped unicode string", i11, 4);
                        throw null;
                    }
                    this.f26303a = i12;
                }
                z6 = true;
            } else {
                Set set = AbstractC2895g.f15927a;
                if (cM10506m >= 0 && cM10506m < ' ') {
                    m10485d(this, "Unexpected control character: `" + cM10506m + '`', 0, 6);
                    throw null;
                }
                this.f26303a++;
            }
            cM10506m = m10506m();
        }
        String strM10127i = AbstractC5185w.m10127i(bArr, i10, this.f26303a, false);
        m10496a('\"');
        if (!z6) {
            return strM10127i;
        }
        try {
            return AbstractC2895g.m7016a(strM10127i);
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Invalid escaped string";
            }
            m10485d(this, message, i10 - 1, 4);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (kotlin.jvm.internal.AbstractC4154l.m8924g(r5, r4.f21638b) <= 0) goto L52;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pg.AbstractC5934o m10511r() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.C5359n.m10511r():pg.o");
    }

    /* renamed from: s */
    public void m10512s(float f6) {
        ((Paint) this.f26304b).setAlpha((int) Math.rint(f6 * 255.0f));
    }

    /* renamed from: t */
    public void m10513t(int i10) {
        if (this.f26303a == i10) {
            return;
        }
        this.f26303a = i10;
        Paint paint = (Paint) this.f26304b;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1548b.m5091c(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC1548b.m5093e(i10)));
        }
    }

    /* renamed from: u */
    public void m10514u(long j6) {
        ((Paint) this.f26304b).setColor(h0.m5149u(j6));
    }

    /* renamed from: v */
    public void m10515v(C1559m c1559m) {
        this.f26306d = c1559m;
        ((Paint) this.f26304b).setColorFilter(c1559m != null ? c1559m.f7785a : null);
    }

    /* renamed from: w */
    public void m10516w(int i10) {
        ((Paint) this.f26304b).setFilterBitmap(!(i10 == 0));
    }

    /* renamed from: x */
    public void m10517x(Shader shader) {
        this.f26305c = shader;
        ((Paint) this.f26304b).setShader(shader);
    }

    /* renamed from: y */
    public void m10518y(int i10) {
        ((Paint) this.f26304b).setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* renamed from: z */
    public void m10519z(int i10) {
        ((Paint) this.f26304b).setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 2 ? Paint.Join.BEVEL : i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public C5359n(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f26306d = new ServiceConnectionC5357l(this);
        this.f26303a = 1;
        this.f26305c = scheduledExecutorService;
        this.f26304b = context.getApplicationContext();
    }

    public C5359n(C4409i c4409i, int i10) {
        this.f26304b = c4409i.f22050f;
        this.f26303a = i10;
        C6136c c6136c = c4409i.f22052h;
        this.f26305c = c6136c.m12163a();
        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        this.f26306d = bundleM11799a;
        c6136c.f29899h.m6569c(bundleM11799a);
    }

    public C5359n(Paint paint) {
        this.f26304b = paint;
        this.f26303a = 3;
    }

    public C5359n(Bundle state) {
        AbstractC4154l.m8923f(state, "state");
        String string = state.getString("nav-entry-state:id");
        if (string != null) {
            this.f26304b = string;
            this.f26303a = cg.m10587b("nav-entry-state:destination-id", state);
            this.f26305c = cg.m10588c("nav-entry-state:args", state);
            this.f26306d = cg.m10588c("nav-entry-state:saved-state", state);
            return;
        }
        dg.m10615b("nav-entry-state:id");
        throw null;
    }

    public C5359n(String str, SecretKeySpec secretKeySpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        C3272n c3272n = new C3272n(this);
        this.f26304b = c3272n;
        this.f26305c = str;
        this.f26306d = secretKeySpec;
        if (secretKeySpec.getEncoded().length >= 16) {
            switch (str) {
                case "HMACSHA1":
                    this.f26303a = 20;
                    break;
                case "HMACSHA256":
                    this.f26303a = 32;
                    break;
                case "HMACSHA384":
                    this.f26303a = 48;
                    break;
                case "HMACSHA512":
                    this.f26303a = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            c3272n.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public C5359n(byte[] data) {
        AbstractC4154l.m8923f(data, "data");
        this.f26304b = data;
        this.f26306d = new C2909u();
    }
}
