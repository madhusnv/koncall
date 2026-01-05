package b2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import cd.C0955j;
import com.google.firebase.encoders.EncodingException;
import com.sun.mail.util.AbstractC1452a;
import dd.C1692j;
import dd.C1700r;
import dy.AbstractC1856d;
import e1.C1903e;
import ex.InterfaceC2137a;
import ex.InterfaceC2143g;
import g1.C2431k;
import hy.C3060k;
import hy.InterfaceC3055f;
import iz.C3378k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import jj.InterfaceC3778c;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import l0.RunnableC4307g;
import l4.C4367l;
import lj.C4481d;
import lj.C4482e;
import ly.C4586j;
import m2.C4640e;
import n1.AbstractC4941a;
import og.ch;
import og.gc;
import og.vf;
import og.wf;
import p009j.AbstractC3500a;
import p013o.C5232r;
import pf.C5902b;
import pf.C5904d;
import pg.m8;
import pg.o8;
import pg.s8;
import rf.DialogInterfaceOnCancelListenerC6508m;
import rw.AbstractC6662l;
import s1.AbstractC6731z;
import s1.C6713h;
import s1.InterfaceC6722q;
import w3.t2;
import yh.C8661e;
import yh.C8669m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.l */
/* loaded from: classes.dex */
public class C0554l {

    /* renamed from: a */
    public final /* synthetic */ int f3777a;

    /* renamed from: b */
    public int f3778b;

    /* renamed from: c */
    public Object f3779c;

    /* renamed from: d */
    public Object f3780d;

    public C0554l(byte b10, int i10) {
        this.f3777a = i10;
        switch (i10) {
            case 8:
                this.f3779c = Collections.synchronizedMap(new C1903e(0));
                this.f3778b = 0;
                break;
            case 9:
                this.f3779c = new C4640e(new C6713h[16]);
                break;
            case 10:
            case 11:
            default:
                this.f3779c = new Object[8];
                this.f3778b = 0;
                break;
            case 12:
                this.f3779c = AbstractC1856d.m5490a();
                break;
        }
    }

    /* renamed from: i */
    public static void m1631i(C0554l c0554l, int i10, int i11, int i12, int i13, int i14, int i15) {
        long[] jArr = (long[]) c0554l.f3779c;
        int i16 = c0554l.f3778b;
        int i17 = i16 + 3;
        c0554l.f3778b = i17;
        int length = jArr.length;
        if (length <= i17) {
            int iMax = Math.max(length * 2, i17);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
            c0554l.f3779c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) c0554l.f3780d, iMax);
            AbstractC4154l.m8922e(jArrCopyOf2, "copyOf(...)");
            c0554l.f3780d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) c0554l.f3779c;
        jArr2[i16] = (i11 << 32) | (i12 & 4294967295L);
        jArr2[i16 + 1] = (i14 & 4294967295L) | (i13 << 32);
        int i18 = i15 & 67108863;
        jArr2[i16 + 2] = (0 << 63) | (0 << 62) | (1 << 61) | (0 << 52) | (i18 << 26) | (i10 & 67108863);
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j6 = jArr2[i20];
            if ((((int) j6) & 67108863) == i18) {
                jArr2[i20] = (j6 & (-2301339409586323457L)) | (((i16 - i19) & 511) << 52);
                return;
            }
        }
    }

    /* renamed from: a */
    public void m1632a(int i10, InterfaceC6722q interfaceC6722q) {
        if (i10 < 0) {
            AbstractC4941a.m9884a("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        C6713h c6713h = new C6713h(this.f3778b, i10, interfaceC6722q);
        this.f3778b += i10;
        ((C4640e) this.f3779c).m9506b(c6713h);
    }

    /* renamed from: b */
    public void m1633b() {
        C3378k c3378k;
        ImageView imageView = (ImageView) this.f3779c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            p013o.r0.m10286a(drawable);
        }
        if (drawable == null || (c3378k = (C3378k) this.f3780d) == null) {
            return;
        }
        C5232r.m10284d(drawable, c3378k, imageView.getDrawableState());
    }

    /* renamed from: c */
    public C8669m m1634c() {
        C8661e c8661e = (C8661e) this.f3780d;
        if (c8661e != null) {
            throw c8661e.m16002a();
        }
        C8669m c8669mM16009b = C8669m.m16009b(this.f3778b, (Object[]) this.f3779c, this);
        C8661e c8661e2 = (C8661e) this.f3780d;
        if (c8661e2 == null) {
            return c8669mM16009b;
        }
        throw c8661e2.m16002a();
    }

    /* renamed from: d */
    public void m1635d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        ((String) this.f3780d).concat(str);
    }

    /* renamed from: e */
    public C6713h m1636e(int i10) {
        if (i10 < 0 || i10 >= this.f3778b) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index ", ", size ");
            sbM4567n.append(this.f3778b);
            AbstractC4941a.m9887d(sbM4567n.toString());
        }
        C6713h c6713h = (C6713h) this.f3780d;
        if (c6713h != null) {
            int i11 = c6713h.f32068a;
            if (i10 < c6713h.f32069b + i11 && i11 <= i10) {
                return c6713h;
            }
        }
        C4640e c4640e = (C4640e) this.f3779c;
        C6713h c6713h2 = (C6713h) c4640e.f22884a[AbstractC6731z.m12880e(i10, c4640e)];
        this.f3780d = c6713h2;
        return c6713h2;
    }

    /* renamed from: f */
    public int m1637f(Object obj) {
        e1.d0 d0Var = (e1.d0) this.f3779c;
        int iM5535d = d0Var.m5535d(obj);
        if (iM5535d >= 0) {
            return d0Var.f8949c[iM5535d];
        }
        return -1;
    }

    /* renamed from: g */
    public Object m1638g(int i10) {
        Object[] objArr = (Object[]) this.f3780d;
        int i11 = i10 - this.f3778b;
        if (i11 < 0 || i11 > AbstractC6662l.m12735y(objArr)) {
            return null;
        }
        return objArr[i11];
    }

    /* renamed from: h */
    public String m1639h() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f3778b + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = ((Object[]) this.f3779c)[i11];
            if (obj instanceof InterfaceC3055f) {
                InterfaceC3055f interfaceC3055f = (InterfaceC3055f) obj;
                if (!AbstractC4154l.m8918a(interfaceC3055f.mo7280e(), C3060k.f16414c)) {
                    int i12 = ((int[]) this.f3780d)[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(interfaceC3055f.mo7282g(i12));
                    }
                } else if (((int[]) this.f3780d)[i11] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f3780d)[i11]);
                    sb2.append("]");
                }
            } else if (obj != C4586j.f22718a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    /* renamed from: j */
    public void m1640j(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f3779c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC3500a.f18348e;
        C4367l c4367lM9117H = C4367l.m9117H(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
        c6.v0.m2527i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c4367lM9117H.f21922c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = s8.m11864b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                p013o.r0.m10286a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c4367lM9117H.m9140t(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(p013o.r0.m10287b(typedArray.getInt(3, -1), null));
            }
            c4367lM9117H.m9124I();
        } catch (Throwable th2) {
            c4367lM9117H.m9124I();
            throw th2;
        }
    }

    /* renamed from: k */
    public void m1641k(Object obj, Object obj2) {
        int i10 = (this.f3778b + 1) * 2;
        Object[] objArr = (Object[]) this.f3779c;
        if (i10 > objArr.length) {
            this.f3779c = Arrays.copyOf(objArr, o8.m11810a(objArr.length, i10));
        }
        m8.m11790a(obj, obj2);
        Object[] objArr2 = (Object[]) this.f3779c;
        int i11 = this.f3778b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f3778b = i11 + 1;
    }

    /* renamed from: l */
    public void m1642l(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.f3778b) * 2;
            Object[] objArr = (Object[]) this.f3779c;
            if (size > objArr.length) {
                this.f3779c = Arrays.copyOf(objArr, o8.m11810a(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m1641k(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        if (r9 != r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0116, code lost:
    
        if (r9 == r2) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:36:0x00a6, B:38:0x00ae), top: B:62:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6 A[EXC_TOP_SPLITTER, PHI: r0 r8
      0x00a6: PHI (r0v3 dy.a) = (r0v1 dy.a), (r0v5 dy.a) binds: [B:34:0x00a2, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r8v15 tx.p) = (r8v13 tx.p), (r8v19 tx.p) binds: [B:34:0x00a2, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m1643m(ex.InterfaceC2139c r8, ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0554l.m1643m(ex.c, ww.c):java.lang.Object");
    }

    /* renamed from: n */
    public void m1644n(int i10, InterfaceC2143g interfaceC2143g) {
        int i11 = i10 & 67108863;
        long[] jArr = (long[]) this.f3779c;
        int i12 = this.f3778b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 67108863) == i11) {
                long j6 = jArr[i13];
                long j10 = jArr[i13 + 1];
                interfaceC2143g.mo1450c(Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) j6), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10));
                return;
            }
        }
    }

    /* renamed from: o */
    public void m1645o(String str, C5904d c5904d) {
        int i10 = this.f3778b + 1;
        Object[] objArr = (Object[]) this.f3779c;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f3779c = Arrays.copyOf(objArr, i12);
        }
        Object[] objArr2 = (Object[]) this.f3779c;
        int i13 = this.f3778b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = c5904d;
        this.f3778b = i13 + 1;
    }

    /* renamed from: p */
    public void m1646p(DialogInterfaceOnCancelListenerC6508m dialogInterfaceOnCancelListenerC6508m) {
        Map map = (Map) this.f3779c;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", dialogInterfaceOnCancelListenerC6508m);
        if (this.f3778b > 0) {
            new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper(), 4).post(new RunnableC4307g(11, this, dialogInterfaceOnCancelListenerC6508m, false));
        }
    }

    /* renamed from: q */
    public byte[] m1647q(int i10) throws IOException {
        og.p0 p0Var;
        InterfaceC3778c interfaceC3778c;
        p020v.x0 x0Var = (p020v.x0) this.f3779c;
        ((vf) this.f3780d).f26873h = Boolean.valueOf(1 == (i10 ^ 1));
        vf vfVar = (vf) this.f3780d;
        vfVar.f26871f = Boolean.FALSE;
        x0Var.f36754b = new wf(vfVar);
        try {
            ch.m10592b();
            ch chVar = ch.f26366c;
            if (i10 == 0) {
                gc gcVar = new gc(x0Var);
                C4481d c4481d = new C4481d();
                chVar.m10593a(c4481d);
                c4481d.f22312d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    C4482e c4482e = new C4482e(stringWriter, c4481d.f22309a, c4481d.f22310b, c4481d.f22311c, c4481d.f22312d);
                    c4482e.m9330g(gcVar);
                    c4482e.m9332i();
                    c4482e.f22314b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            gc gcVar2 = new gc(x0Var);
            og.q0 q0Var = new og.q0();
            q0Var.f26756a = new HashMap();
            q0Var.f26757b = new HashMap();
            q0Var.f26758c = og.q0.f26755d;
            chVar.m10593a(q0Var);
            HashMap map = new HashMap((HashMap) q0Var.f26756a);
            HashMap map2 = new HashMap((HashMap) q0Var.f26757b);
            og.o0 o0Var = (og.o0) q0Var.f26758c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                p0Var = new og.p0(byteArrayOutputStream, map, map2, o0Var);
                interfaceC3778c = (InterfaceC3778c) map.get(gc.class);
            } catch (IOException unused2) {
            }
            if (interfaceC3778c == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(gc.class)));
            }
            interfaceC3778c.mo5788a(gcVar2, p0Var);
            return byteArrayOutputStream.toByteArray();
        } catch (UnsupportedEncodingException e2) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000c A[SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1648r(int r10, int r11, android.content.Intent r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f3779c
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            rf.m r1 = (rf.DialogInterfaceOnCancelListenerC6508m) r1
            java.util.concurrent.atomic.AtomicReference r2 = r1.f31247c
            rf.e r3 = r1.f31251g
            java.util.concurrent.atomic.AtomicReference r4 = r1.f31247c
            java.lang.Object r2 = r2.get()
            rf.d0 r2 = (rf.d0) r2
            r5 = 3
            r6 = 0
            r7 = 1
            if (r10 == r7) goto L55
            r7 = 2
            if (r10 == r7) goto L2d
            goto L87
        L2d:
            pf.e r7 = r1.f31249e
            android.app.Activity r1 = r1.m12525a()
            int r8 = pf.C5906f.f28747a
            int r1 = r7.m11516c(r1, r8)
            if (r1 != 0) goto L48
            r4.set(r6)
            com.google.android.gms.internal.measurement.h0 r1 = r3.f31236p
            android.os.Message r2 = r1.obtainMessage(r5)
            r1.sendMessage(r2)
            goto Lc
        L48:
            if (r2 == 0) goto Lc
            pf.b r5 = r2.f31218b
            int r5 = r5.f28736b
            r7 = 18
            if (r5 != r7) goto L87
            if (r1 != r7) goto L87
            goto Lc
        L55:
            r1 = -1
            if (r11 != r1) goto L65
            r4.set(r6)
            com.google.android.gms.internal.measurement.h0 r1 = r3.f31236p
            android.os.Message r2 = r1.obtainMessage(r5)
            r1.sendMessage(r2)
            goto Lc
        L65:
            if (r11 != 0) goto L87
            if (r2 == 0) goto Lc
            r1 = 13
            if (r12 == 0) goto L73
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r1 = r12.getIntExtra(r5, r1)
        L73:
            pf.b r5 = new pf.b
            pf.b r8 = r2.f31218b
            java.lang.String r8 = r8.toString()
            r5.<init>(r7, r1, r6, r8)
            int r1 = r2.f31217a
            r4.set(r6)
            r3.m12520h(r5, r1)
            goto Lc
        L87:
            if (r2 == 0) goto Lc
            pf.b r1 = r2.f31218b
            int r2 = r2.f31217a
            r4.set(r6)
            r3.m12520h(r1, r2)
            goto Lc
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0554l.m1648r(int, int, android.content.Intent):void");
    }

    /* renamed from: s */
    public void m1649s(Bundle bundle) {
        this.f3778b = 1;
        this.f3780d = bundle;
        for (Map.Entry entry : ((Map) this.f3779c).entrySet()) {
            ((DialogInterfaceOnCancelListenerC6508m) entry.getValue()).m12526b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* renamed from: t */
    public void m1650t(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f3779c).entrySet()) {
            Bundle bundle2 = new Bundle();
            rf.d0 d0Var = (rf.d0) ((DialogInterfaceOnCancelListenerC6508m) entry.getValue()).f31247c.get();
            if (d0Var != null) {
                C5902b c5902b = d0Var.f31218b;
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", d0Var.f31217a);
                bundle2.putInt("failed_status", c5902b.f28736b);
                bundle2.putParcelable("failed_resolution", c5902b.f28737c);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public String toString() {
        switch (this.f3777a) {
            case 3:
                return m1639h();
            case 7:
                StringBuilder sb2 = new StringBuilder();
                if (((iz.f0) this.f3779c) == iz.f0.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f3778b);
                sb2.append(' ');
                sb2.append((String) this.f3780d);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0554l(int i10, char c2) {
        this.f3777a = i10;
    }

    public C0554l(String str, String[] strArr) {
        String string;
        this.f3777a = 13;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f3780d = string;
        this.f3779c = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23) {
            int i10 = 2;
            while (i10 <= 7 && !Log.isLoggable((String) this.f3779c, i10)) {
                i10++;
            }
            this.f3778b = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public C0554l(p020v.x0 x0Var, int i10) {
        this.f3777a = 6;
        this.f3780d = new vf();
        this.f3779c = x0Var;
        ch.m10592b();
        this.f3778b = i10;
    }

    public C0554l(iz.f0 protocol, int i10, String str) {
        this.f3777a = 7;
        AbstractC4154l.m8923f(protocol, "protocol");
        this.f3779c = protocol;
        this.f3778b = i10;
        this.f3780d = str;
    }

    public C0554l(ImageView imageView) {
        this.f3777a = 5;
        this.f3778b = 0;
        this.f3779c = imageView;
    }

    public C0554l(C4266h c4266h, AbstractC6731z abstractC6731z) {
        this.f3777a = 10;
        C0554l c0554lMo12097k = abstractC6731z.mo12097k();
        int i10 = c4266h.f21646a;
        if (i10 < 0) {
            AbstractC4941a.m9886c("negative nearestRange.first");
        }
        int iMin = Math.min(c4266h.f21647b, c0554lMo12097k.f3778b - 1);
        if (iMin < i10) {
            e1.d0 d0Var = e1.o0.f9033a;
            AbstractC4154l.m8921d(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f3779c = d0Var;
            this.f3780d = new Object[0];
            this.f3778b = 0;
            return;
        }
        int i11 = (iMin - i10) + 1;
        this.f3780d = new Object[i11];
        this.f3778b = i10;
        e1.d0 d0Var2 = new e1.d0(i11);
        C2431k c2431k = new C2431k(i10, iMin, d0Var2, this);
        C4640e c4640e = (C4640e) c0554lMo12097k.f3779c;
        if (i10 < 0 || i10 >= c0554lMo12097k.f3778b) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index ", ", size ");
            sbM4567n.append(c0554lMo12097k.f3778b);
            AbstractC4941a.m9887d(sbM4567n.toString());
        }
        if (iMin < 0 || iMin >= c0554lMo12097k.f3778b) {
            StringBuilder sbM4567n2 = AbstractC1452a.m4567n(iMin, "Index ", ", size ");
            sbM4567n2.append(c0554lMo12097k.f3778b);
            AbstractC4941a.m9887d(sbM4567n2.toString());
        }
        if (iMin < i10) {
            AbstractC4941a.m9884a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i10 + ')');
        }
        int iM12880e = AbstractC6731z.m12880e(i10, c4640e);
        int i12 = ((C6713h) c4640e.f22884a[iM12880e]).f32068a;
        while (i12 <= iMin) {
            C6713h c6713h = (C6713h) c4640e.f22884a[iM12880e];
            c2431k.invoke(c6713h);
            i12 += c6713h.f32069b;
            iM12880e++;
        }
        this.f3779c = d0Var2;
    }

    public C0554l(C0955j c0955j) {
        this.f3777a = 1;
        this.f3779c = (C1692j) ((InterfaceC2137a) c0955j.f5732a.f25543f).invoke();
        this.f3778b = c0955j.f5733b;
        this.f3780d = (C1700r) ((InterfaceC2137a) c0955j.f5734c.f25543f).invoke();
    }

    public C0554l(t2 t2Var) {
        this.f3777a = 0;
        this.f3779c = t2Var;
    }

    public C0554l(int i10) {
        this.f3777a = 14;
        this.f3779c = new Object[i10 * 2];
        this.f3778b = 0;
    }
}
