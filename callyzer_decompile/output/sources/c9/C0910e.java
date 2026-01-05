package c9;

import a3.C0045d;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.work.impl.WorkDatabase;
import b3.C0575g;
import c0.C0812e;
import c5.AbstractC0865c;
import c5.C0869g;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.websoptimization.callyzerbiz.R;
import d3.b0;
import d3.h0;
import eb.g2;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import fd.C2271i;
import fd.C2272j;
import fd.C2273k;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2270h;
import fd.InterfaceC2276n;
import fm.C2322a;
import g4.C2492h;
import g4.n0;
import gd.C2564b;
import gd.C2565c;
import gd.C2566d;
import gd.C2567e;
import gd.C2568f;
import i0.d2;
import i0.v0;
import i4.InterfaceC3170d;
import ig.C3245a;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k0.ScheduledExecutorServiceC3894d;
import k2.C3953b;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;
import l0.InterfaceC4303c;
import l4.C4363h;
import l4.C4381z;
import l4.InterfaceC4362g;
import lx.InterfaceC4574m;
import ns.C5136b;
import nx.AbstractC5178p;
import og.jg;
import og.pe;
import og.u1;
import og.yf;
import oj.C5392d;
import om.C5403e;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p020v.C7612v;
import p020v.EnumC7610t;
import p020v.p0;
import p023y.AbstractC8523a;
import pg.d9;
import pg.q6;
import pg.t8;
import pg.y8;
import pn.C5979e;
import q3.C6104d;
import qf.C6205d;
import qi.RunnableC6224g;
import qj.InterfaceC6237b;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import sd.C6813g;
import sf.C6829o;
import sk.C6860h;
import t3.j0;
import uf.C7428c;
import ug.s3;
import v3.g0;
import w3.d1;
import w3.m0;
import wc.C7985s;
import wk.InterfaceC8101a;
import wk.InterfaceC8102b;
import xm.x1;
import xm.y5;
import y4.C8540a;
import y4.C8546g;
import y7.b1;
import y7.c1;
import yg.C8650g;
import yv.AbstractC8804s;
import yv.C8805t;
import z7.AbstractC8894w;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.e */
/* loaded from: classes.dex */
public final class C0910e implements InterfaceC2276n, InterfaceC2270h, InterfaceC3170d, InterfaceC4303c, d1, InterfaceC8102b {

    /* renamed from: a */
    public final /* synthetic */ int f5578a;

    /* renamed from: b */
    public Object f5579b;

    /* renamed from: c */
    public Object f5580c;

    public /* synthetic */ C0910e(int i10, Object obj, Object obj2) {
        this.f5578a = i10;
        this.f5579b = obj;
        this.f5580c = obj2;
    }

    /* renamed from: B */
    public static ArrayList m2582B(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5403e c5403e = (C5403e) it.next();
                arrayList.add(new C5136b(c5403e.f27119a, c5403e.f27120b, c5403e.f27123e, c5403e.f27122d, Long.valueOf(c5403e.f27121c), c5403e.f27125g, c5403e.f27124f, c5403e.f27126h, c5403e.f27127i));
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public void m2583A(C2271i c2271i, InterfaceC2139c interfaceC2139c) {
        String str = ((String) this.f5580c) + jg.m10722a(c2271i);
        Set set = c2271i.f10280c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!(((InterfaceC2265c) obj) instanceof C2565c)) {
                arrayList.add(obj);
            }
        }
        Set setF0 = AbstractC6663m.f0(arrayList);
        setF0.add(new C2565c(str));
        C2564b c2564b = new C2564b((C2566d) this.f5579b, new C2271i(c2271i.f10278a, setF0));
        interfaceC2139c.invoke(c2564b);
        C7985s c7985s = c2564b.f13970b;
        long j6 = c7985s.f38413a.f3638b;
        if (j6 == c2564b.f13971c) {
            if (j6 > 0) {
                c7985s.mo15145m(1, "&");
            }
            String strM10722a = jg.m10722a(c2564b.f13969a);
            c7985s.mo15145m(strM10722a.length(), strM10722a);
            c7985s.mo15145m(1, "=");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b9, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2584C(android.content.Context r10, android.content.res.XmlResourceParser r11) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0910e.m2584C(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: D */
    public void m2585D(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        Context context = (Context) this.f5579b;
        if (d9.m11589b(context, "android.permission.CALL_PHONE")) {
            y8.m11949d(context, R.string.please_allow_phone_call_permission_from_setting);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.CALL");
            int length = phoneNumber.length() - 1;
            int i10 = 0;
            boolean z6 = false;
            while (i10 <= length) {
                boolean z10 = AbstractC4154l.m8924g(phoneNumber.charAt(!z6 ? i10 : length), 32) <= 0;
                if (z6) {
                    if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z10) {
                    i10++;
                } else {
                    z6 = true;
                }
            }
            intent.setData(Uri.parse("tel:" + phoneNumber.subSequence(i10, length + 1).toString()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            ((C8805t) this.f5580c).m16231f("Number:=" + phoneNumber + "\t" + e2.getMessage());
            y8.m11949d(context, R.string.something_went_wrong);
        }
    }

    /* renamed from: E */
    public byte[] m2586E() throws CharConversionException, FileNotFoundException {
        String str = (String) this.f5580c;
        try {
            String string = ((SharedPreferences) this.f5579b).getString(str, null);
            if (string != null) {
                return q6.m11830b(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value " + str + " does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(AbstractC5601a.m11238i("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    /* renamed from: F */
    public void m2587F(String phoneNumber) {
        Context context = (Context) this.f5579b;
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("whatsapp://send?phone=" + PhoneNumberUtils.stripSeparators(phoneNumber)));
            intent.addFlags(268435456);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                y8.m11949d(context, R.string.intent_action_error);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ((C8805t) this.f5580c).m16234i("WhatsApp Redirection Exception", e2);
        }
    }

    /* renamed from: G */
    public void m2588G(String contactDetail) {
        AbstractC4154l.m8923f(contactDetail, "contactDetail");
        Context context = (Context) this.f5579b;
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.fromParts("sms", contactDetail, null)).addFlags(268435456));
        } catch (Exception e2) {
            e2.printStackTrace();
            y8.m11949d(context, R.string.intent_action_error);
        }
    }

    /* renamed from: H */
    public void m2589H(String value) {
        AbstractC4154l.m8923f(value, "value");
        C7985s c7985s = ((C2566d) this.f5579b).f13974a;
        String strM12988d = C6813g.f32362l.m12988d(value);
        c7985s.mo15145m(strM12988d.length(), strM12988d);
    }

    /* renamed from: I */
    public void m2590I(Object obj, InterfaceC4574m property, Object obj2) {
        AbstractC0865c abstractC0865cM5719b;
        AbstractC4154l.m8923f(property, "property");
        Object obj3 = this.f5579b;
        this.f5579b = obj2;
        C8546g c8546g = (C8546g) obj2;
        C0869g c0869g = ((C8540a) this.f5580c).f41484a;
        String name = property.getName();
        g2 g2Var = c8546g.f41505a;
        g2 g2Var2 = c8546g.f41507c;
        String str = g2Var2.f9320a;
        g2 g2Var3 = c8546g.f41506b;
        String str2 = g2Var3.f9320a;
        if (str2 == null && str == null) {
            abstractC0865cM5719b = g2Var.m5719b();
        } else {
            C0869g c0869g2 = new C0869g(new char[0]);
            if (str2 != null) {
                c0869g2.m2315E("min", g2Var3.m5719b());
            }
            if (str != null) {
                c0869g2.m2315E("max", g2Var2.m5719b());
            }
            c0869g2.m2315E("value", g2Var.m5719b());
            abstractC0865cM5719b = c0869g2;
        }
        c0869g.m2315E(name, abstractC0865cM5719b);
    }

    /* renamed from: J */
    public void m2591J(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f5579b;
        Object parent = view.getParent();
        if (parent instanceof View) {
            m2591J((View) parent, fArr);
            b0.m5097d(fArr2);
            b0.m5099f(fArr2, -view.getScrollX(), -view.getScrollY());
            m0.m14993t(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            b0.m5097d(fArr2);
            b0.m5099f(fArr2, left, top);
            m0.m14993t(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f5580c;
            view.getLocationInWindow(iArr);
            b0.m5097d(fArr2);
            b0.m5099f(fArr2, -view.getScrollX(), -view.getScrollY());
            m0.m14993t(fArr, fArr2);
            float f6 = iArr[0];
            float f10 = iArr[1];
            b0.m5097d(fArr2);
            b0.m5099f(fArr2, f6, f10);
            m0.m14993t(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        h0.m5145q(matrix, fArr2);
        m0.m14993t(fArr, fArr2);
    }

    /* renamed from: K */
    public void m2592K() {
        synchronized (this) {
            ((AtomicInteger) this.f5579b).decrementAndGet();
            if (((AtomicInteger) this.f5579b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    /* renamed from: L */
    public void m2593L(C2271i c2271i, InterfaceC2137a interfaceC2137a) {
        String str = (String) this.f5580c;
        C7985s c7985s = ((C2566d) this.f5579b).f13974a;
        if (c7985s.f38413a.f3638b > 0) {
            c7985s.mo15145m(1, "&");
        }
        if (!AbstractC5178p.m10101L(str)) {
            c7985s.mo15145m(str.length(), str);
        }
        String strM10722a = jg.m10722a(c2271i);
        c7985s.mo15145m(strM10722a.length(), strM10722a);
        c7985s.mo15145m(1, "=");
        interfaceC2137a.invoke();
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        i0.g2 g2Var;
        if (!(th2 instanceof DeferrableSurface$SurfaceClosedException)) {
            if (th2 instanceof CancellationException) {
                ((C7612v) this.f5580c).m14455w("Unable to configure camera cancelled");
                return;
            }
            EnumC7610t enumC7610t = ((C7612v) this.f5580c).f36723e;
            EnumC7610t enumC7610t2 = EnumC7610t.OPENED;
            if (enumC7610t == enumC7610t2) {
                ((C7612v) this.f5580c).m14443H(enumC7610t2, new C0812e(th2, 4), true);
            }
            ((C7612v) this.f5580c).toString();
            u1.m10944c("Camera2CameraImpl");
            C7612v c7612v = (C7612v) this.f5580c;
            if (c7612v.f36731n == ((p0) this.f5579b)) {
                c7612v.m14441F();
                return;
            }
            return;
        }
        C7612v c7612v2 = (C7612v) this.f5580c;
        v0 v0Var = ((DeferrableSurface$SurfaceClosedException) th2).f1853a;
        Iterator it = c7612v2.f36719a.m5869e().iterator();
        while (true) {
            if (!it.hasNext()) {
                g2Var = null;
                break;
            } else {
                g2Var = (i0.g2) it.next();
                if (g2Var.m7341b().contains(v0Var)) {
                    break;
                }
            }
        }
        if (g2Var != null) {
            C7612v c7612v3 = (C7612v) this.f5580c;
            ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894dM11875d = t8.m11875d();
            d2 d2Var = g2Var.f16472f;
            if (d2Var != null) {
                new Throwable();
                c7612v3.m14455w("Posting surface closed");
                scheduledExecutorServiceC3894dM11875d.execute(new RunnableC6224g(13, d2Var, g2Var));
            }
        }
    }

    /* renamed from: N */
    public void m2594N(boolean z6, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f5579b)) {
            map = new HashMap((Map) this.f5579b);
        }
        synchronized (((Map) this.f5580c)) {
            map2 = new HashMap((Map) this.f5580c);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m3095c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C8650g) entry2.getKey()).m15970c(new ApiException(status));
            }
        }
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: c */
    public void mo2595c(C2271i c2271i, int i10) {
        m2593L(c2271i, new C2567e(this, i10, 0));
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: d */
    public void mo2596d(C2271i c2271i, String value) {
        AbstractC4154l.m8923f(value, "value");
        String str = (String) this.f5580c;
        C7985s c7985s = ((C2566d) this.f5579b).f13974a;
        if (c7985s.f38413a.f3638b > 0) {
            c7985s.mo15145m(1, "&");
        }
        if (!AbstractC5178p.m10101L(str)) {
            c7985s.mo15145m(str.length(), str);
        }
        String strM10722a = jg.m10722a(c2271i);
        c7985s.mo15145m(strM10722a.length(), strM10722a);
        c7985s.mo15145m(1, "=");
        m2589H(value);
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: e */
    public void mo2597e(C2271i c2271i, C2273k c2273k) {
        c2273k.f10283b.invoke(new C2566d(((C2566d) this.f5579b).f13974a, ((String) this.f5580c) + jg.m10722a(c2271i) + '.'), c2273k.f10282a);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        if (((C7612v) this.f5580c).f36738w.m4b() == 2 && ((C7612v) this.f5580c).f36723e == EnumC7610t.OPENED) {
            ((C7612v) this.f5580c).m14442G(EnumC7610t.CONFIGURED);
        }
    }

    @Override // i4.InterfaceC3170d
    /* renamed from: i */
    public int mo2599i(int i10) {
        CharSequence charSequence = (CharSequence) this.f5579b;
        do {
            i10 = ((C2322a) this.f5580c).m6000j(i10);
            if (i10 == -1 || i10 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    @Override // i4.InterfaceC3170d
    /* renamed from: j */
    public int mo2600j(int i10) {
        do {
            i10 = ((C2322a) this.f5580c).m6002l(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f5579b).charAt(i10 - 1)));
        return i10;
    }

    @Override // w3.d1
    /* renamed from: k */
    public void mo2601k(View view, float[] fArr) {
        b0.m5097d(fArr);
        m2591J(view, fArr);
    }

    @Override // i4.InterfaceC3170d
    /* renamed from: l */
    public int mo2602l(int i10) {
        do {
            i10 = ((C2322a) this.f5580c).m6002l(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f5579b).charAt(i10)));
        return i10;
    }

    @Override // i4.InterfaceC3170d
    /* renamed from: m */
    public int mo2603m(int i10) {
        do {
            i10 = ((C2322a) this.f5580c).m6000j(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f5579b).charAt(i10 - 1)));
        return i10;
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: n */
    public void mo2604n(C2271i c2271i, boolean z6) {
        String str = (String) this.f5580c;
        C2566d c2566d = (C2566d) this.f5579b;
        C7985s c7985s = c2566d.f13974a;
        if (c7985s.f38413a.f3638b > 0) {
            c7985s.mo15145m(1, "&");
        }
        if (!AbstractC5178p.m10101L(str)) {
            c7985s.mo15145m(str.length(), str);
        }
        String strM10722a = jg.m10722a(c2271i);
        c7985s.mo15145m(strM10722a.length(), strM10722a);
        c7985s.mo15145m(1, "=");
        String strValueOf = String.valueOf(z6);
        C7985s c7985s2 = c2566d.f13974a;
        String strM12988d = C6813g.f32362l.m12988d(strValueOf);
        c7985s2.mo15145m(strM12988d.length(), strM12988d);
    }

    /* renamed from: o */
    public void m2605o(C6860h c6860h) {
        ((ConcurrentHashMap) this.f5579b).put(((InterfaceC8101a) this.f5580c).mo14177a(c6860h), c6860h);
    }

    /* renamed from: p */
    public void m2606p(Object obj, String str) {
        ((ArrayList) this.f5579b).add(i0.m0.m7379l(str, "=", String.valueOf(obj)));
    }

    /* renamed from: q */
    public C4381z m2607q(List list) {
        InterfaceC4362g interfaceC4362g;
        Exception e2;
        InterfaceC4362g interfaceC4362g2;
        try {
            int size = list.size();
            int i10 = 0;
            interfaceC4362g = null;
            while (i10 < size) {
                try {
                    interfaceC4362g2 = (InterfaceC4362g) list.get(i10);
                } catch (Exception e10) {
                    e2 = e10;
                }
                try {
                    interfaceC4362g2.mo9068a((C4363h) this.f5580c);
                    i10++;
                    interfaceC4362g = interfaceC4362g2;
                } catch (Exception e11) {
                    e2 = e11;
                    interfaceC4362g = interfaceC4362g2;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(((C4363h) this.f5580c).f21902a.m5992b());
                    sb3.append(", composition=");
                    sb3.append(((C4363h) this.f5580c).m9106c());
                    sb3.append(", selection=");
                    C4363h c4363h = (C4363h) this.f5580c;
                    sb3.append((Object) n0.m6460g(yf.m11072a(c4363h.f21903b, c4363h.f21904c)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    AbstractC6663m.m12747K(list, sb2, "\n", new C0045d(interfaceC4362g, this), 60);
                    String string = sb2.toString();
                    AbstractC4154l.m8922e(string, "toString(...)");
                    throw new RuntimeException(string, e2);
                }
            }
            C4363h c4363h2 = (C4363h) this.f5580c;
            c4363h2.getClass();
            C2492h c2492h = new C2492h(c4363h2.f21902a.toString());
            C4363h c4363h3 = (C4363h) this.f5580c;
            long jM11072a = yf.m11072a(c4363h3.f21903b, c4363h3.f21904c);
            n0 n0Var = n0.m6459f(((C4381z) this.f5579b).f21946b) ? null : new n0(jM11072a);
            C4381z c4381z = new C4381z(c2492h, n0Var != null ? n0Var.f13686a : yf.m11072a(n0.m6457d(jM11072a), n0.m6458e(jM11072a)), ((C4363h) this.f5580c).m9106c());
            this.f5579b = c4381z;
            return c4381z;
        } catch (Exception e12) {
            interfaceC4362g = null;
            e2 = e12;
        }
    }

    /* renamed from: r */
    public boolean m2608r() {
        synchronized (this) {
            if (((AtomicBoolean) this.f5580c).get()) {
                return false;
            }
            ((AtomicInteger) this.f5579b).incrementAndGet();
            return true;
        }
    }

    /* renamed from: s */
    public void m2609s(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        Context context = (Context) this.f5579b;
        Object systemService = context.getSystemService("clipboard");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AnnotatedPrivateKey.LABEL, phoneNumber));
        String str = AbstractC8804s.f42473a;
        AbstractC8804s.f42473a = "";
        if (Build.VERSION.SDK_INT < 33) {
            y8.m11951f(context, R.string.number_is_copied_to_clipboard);
        }
    }

    /* renamed from: t */
    public View m2610t(int i10, int i11, int i12, int i13) {
        b1 b1Var = (b1) this.f5580c;
        c1 c1Var = (c1) this.f5579b;
        int iMo13812d = c1Var.mo13812d();
        int iMo13815j = c1Var.mo13815j();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewMo13817l = c1Var.mo13817l(i10);
            int iMo13810b = c1Var.mo13810b(viewMo13817l);
            int iMo13818m = c1Var.mo13818m(viewMo13817l);
            b1Var.f41579b = iMo13812d;
            b1Var.f41580c = iMo13815j;
            b1Var.f41581d = iMo13810b;
            b1Var.f41582e = iMo13818m;
            if (i12 != 0) {
                b1Var.f41578a = i12;
                if (b1Var.m15834a()) {
                    return viewMo13817l;
                }
            }
            if (i13 != 0) {
                b1Var.f41578a = i13;
                if (b1Var.m15834a()) {
                    view = viewMo13817l;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public String toString() {
        switch (this.f5578a) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f5580c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f5579b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 23:
                return "ObservableProperty(value=" + this.f5579b + ')';
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public Long m2611u(String str) {
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT long_value FROM Preference where `key`=?");
        c8896yM16401j.mo9278q(1, str);
        AbstractC8894w abstractC8894w = (AbstractC8894w) this.f5579b;
        abstractC8894w.m16388b();
        Cursor cursorM10840o = pe.m10840o(abstractC8894w, c8896yM16401j, false);
        try {
            Long lValueOf = null;
            if (cursorM10840o.moveToFirst() && !cursorM10840o.isNull(0)) {
                lValueOf = Long.valueOf(cursorM10840o.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM10840o.close();
            c8896yM16401j.m16402u();
        }
    }

    /* renamed from: v */
    public j0 m2612v() {
        return (j0) ((e1) this.f5580c).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m2613w(int r7, java.lang.String r8, ww.AbstractC8193c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof mo.C4830a
            if (r0 == 0) goto L13
            r0 = r9
            mo.a r0 = (mo.C4830a) r0
            int r1 = r0.f24123d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24123d = r1
            goto L18
        L13:
            mo.a r0 = new mo.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f24121b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f24123d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            c9.e r7 = r0.f24120a
            og.od.m10798c(r9)     // Catch: java.lang.Exception -> L29
            goto L69
        L29:
            r7 = move-exception
            goto L73
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            og.od.m10798c(r9)
            java.lang.Object r9 = r6.f5579b     // Catch: java.lang.Exception -> L29
            xm.x1 r9 = (xm.x1) r9     // Catch: java.lang.Exception -> L29
            r0.f24120a = r6     // Catch: java.lang.Exception -> L29
            r0.f24123d = r3     // Catch: java.lang.Exception -> L29
            gn.x2 r9 = r9.f40991a     // Catch: java.lang.Exception -> L29
            an.g4 r9 = r9.f14958r     // Catch: java.lang.Exception -> L29
            int r2 = r8.length()     // Catch: java.lang.Exception -> L29
            r4 = 0
            if (r2 != 0) goto L58
            z7.w r8 = r9.f860a     // Catch: java.lang.Exception -> L29
            an.r1 r9 = new an.r1     // Catch: java.lang.Exception -> L29
            r2 = 9
            r9.<init>(r7, r2)     // Catch: java.lang.Exception -> L29
            java.lang.Object r7 = og.pe.m10839n(r0, r8, r3, r4, r9)     // Catch: java.lang.Exception -> L29
        L56:
            r9 = r7
            goto L65
        L58:
            z7.w r9 = r9.f860a     // Catch: java.lang.Exception -> L29
            an.s1 r2 = new an.s1     // Catch: java.lang.Exception -> L29
            r5 = 1
            r2.<init>(r8, r7, r5)     // Catch: java.lang.Exception -> L29
            java.lang.Object r7 = og.pe.m10839n(r0, r9, r3, r4, r2)     // Catch: java.lang.Exception -> L29
            goto L56
        L65:
            if (r9 != r1) goto L68
            return r1
        L68:
            r7 = r6
        L69:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L29
            r7.getClass()     // Catch: java.lang.Exception -> L29
            java.util.ArrayList r7 = m2582B(r9)     // Catch: java.lang.Exception -> L29
            return r7
        L73:
            qw.m r7 = og.od.m10796a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0910e.m2613w(int, java.lang.String, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2614x(tq.EnumC7204p r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mo.C4831b
            if (r0 == 0) goto L13
            r0 = r6
            mo.b r0 = (mo.C4831b) r0
            int r1 = r0.f24127d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24127d = r1
            goto L18
        L13:
            mo.b r0 = new mo.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f24125b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f24127d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tq.p r5 = r0.f24124a
            og.od.m10798c(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            java.lang.Object r6 = r4.f5580c
            xm.y5 r6 = (xm.y5) r6
            r0.f24124a = r5
            r0.f24127d = r3
            java.lang.Object r6 = r6.m15696l(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 0
            if (r0 != r3) goto L58
            java.lang.Object r5 = r6.get(r1)
            mm.m r5 = (mm.C4802m) r5
            java.lang.String r5 = r5.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            return r5
        L58:
            tq.p r0 = tq.EnumC7204p.ALL
            if (r5 == r0) goto L79
            tq.p r0 = tq.EnumC7204p.DEFAULT
            if (r5 != r0) goto L61
            goto L79
        L61:
            int r0 = r6.size()
            r2 = 2
            if (r0 != r2) goto L79
            tq.p r0 = tq.EnumC7204p.SIM1
            if (r5 != r0) goto L6d
            r3 = r1
        L6d:
            java.lang.Object r5 = r6.get(r3)
            mm.m r5 = (mm.C4802m) r5
            java.lang.String r5 = r5.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            return r5
        L79:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0910e.m2614x(tq.p, ww.c):java.lang.Object");
    }

    /* renamed from: y */
    public void m2615y(C0909d c0909d) {
        AbstractC8894w abstractC8894w = (AbstractC8894w) this.f5579b;
        abstractC8894w.m16388b();
        abstractC8894w.m16389c();
        try {
            ((C0907b) this.f5580c).m2547l(c0909d);
            abstractC8894w.m16399v();
        } finally {
            abstractC8894w.m16395r();
        }
    }

    /* renamed from: z */
    public boolean m2616z(View view) {
        b1 b1Var = (b1) this.f5580c;
        c1 c1Var = (c1) this.f5579b;
        int iMo13812d = c1Var.mo13812d();
        int iMo13815j = c1Var.mo13815j();
        int iMo13810b = c1Var.mo13810b(view);
        int iMo13818m = c1Var.mo13818m(view);
        b1Var.f41579b = iMo13812d;
        b1Var.f41580c = iMo13815j;
        b1Var.f41581d = iMo13810b;
        b1Var.f41582e = iMo13818m;
        b1Var.f41578a = 24579;
        return b1Var.m15834a();
    }

    public /* synthetic */ C0910e(int i10, Object obj, Object obj2, boolean z6) {
        this.f5578a = i10;
        this.f5580c = obj;
        this.f5579b = obj2;
    }

    public /* synthetic */ C0910e(int i10, boolean z6) {
        this.f5578a = i10;
    }

    public C0910e(Context context, int i10) {
        this.f5578a = i10;
        switch (i10) {
            case 17:
                this.f5579b = context;
                this.f5580c = null;
                break;
            default:
                this.f5580c = new AtomicLong(-1L);
                this.f5579b = new C7428c(context, null, C7428c.f35232k, new C6829o("mlkit:vision"), C6205d.f30184c);
                break;
        }
    }

    public /* synthetic */ C0910e(Object obj) {
        this.f5578a = 15;
        this.f5580c = obj;
        this.f5579b = new ArrayList();
    }

    public C0910e(String str, C3245a c3245a, C5392d c5392d) {
        this.f5578a = 13;
        this.f5580c = str;
        this.f5579b = c3245a;
    }

    public C0910e(s3 s3Var) {
        this.f5578a = 18;
        this.f5580c = s3Var;
    }

    public C0910e(x1 callLogsRepository, y5 userSIMRepository, C5979e c5979e) {
        this.f5578a = 11;
        AbstractC4154l.m8923f(callLogsRepository, "callLogsRepository");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f5579b = callLogsRepository;
        this.f5580c = userSIMRepository;
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: f */
    public void mo2598f() {
    }

    public C0910e(g0 g0Var, j0 j0Var) {
        this.f5578a = 20;
        this.f5579b = g0Var;
        this.f5580c = C3953b.m8517t(j0Var);
    }

    public C0910e(WorkDatabase workDatabase) {
        this.f5578a = 0;
        this.f5579b = workDatabase;
        this.f5580c = new C0907b(workDatabase);
    }

    public C0910e(C0575g c0575g) {
        this.f5578a = 1;
        this.f5579b = new AtomicInteger(0);
        this.f5580c = new AtomicBoolean(false);
    }

    public C0910e(String str) {
        this.f5578a = 25;
        this.f5579b = (ExtraSupportedOutputSizeQuirk) AbstractC8523a.f41447a.m5729g(ExtraSupportedOutputSizeQuirk.class);
        this.f5580c = new g2(str, false);
    }

    public C0910e(Context context, String str, String str2) {
        this.f5578a = 4;
        this.f5580c = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f5579b = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f5579b = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    public C0910e(InterfaceC6237b interfaceC6237b) {
        this.f5578a = 2;
        this.f5580c = Collections.synchronizedMap(new HashMap());
        this.f5579b = interfaceC6237b;
    }

    public C0910e(InterfaceC8101a interfaceC8101a) {
        this.f5578a = 22;
        this.f5579b = new ConcurrentHashMap();
        this.f5580c = interfaceC8101a;
    }

    public C0910e(C2566d c2566d, C2272j c2272j, String prefix) {
        this.f5578a = 5;
        AbstractC4154l.m8923f(prefix, "prefix");
        this.f5579b = c2566d;
        this.f5580c = prefix;
        Set<InterfaceC2265c> set = c2272j.f10280c;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2265c interfaceC2265c : set) {
            C2568f c2568f = interfaceC2265c instanceof C2568f ? (C2568f) interfaceC2265c : null;
            if (c2568f != null) {
                arrayList.add(c2568f);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C2568f c2568f2 = (C2568f) obj;
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c(c2568f2.f13979a)}), 0);
            String str = (String) this.f5580c;
            C7985s c7985s = ((C2566d) this.f5579b).f13974a;
            if (c7985s.f38413a.f3638b > 0) {
                c7985s.mo15145m(1, "&");
            }
            if (!AbstractC5178p.m10101L(str)) {
                c7985s.mo15145m(str.length(), str);
            }
            String strM10722a = jg.m10722a(c2271i);
            c7985s.mo15145m(strM10722a.length(), strM10722a);
            c7985s.mo15145m(1, "=");
            m2589H(c2568f2.f13980b);
        }
    }

    public C0910e(String str, String str2) {
        this.f5578a = 6;
        this.f5579b = str;
        this.f5580c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public C0910e(c1 c1Var) {
        this.f5578a = 24;
        this.f5579b = c1Var;
        b1 b1Var = new b1();
        b1Var.f41578a = 0;
        this.f5580c = b1Var;
    }

    public C0910e(int i10) {
        this.f5578a = i10;
        switch (i10) {
            case 14:
                this.f5579b = Collections.synchronizedMap(new WeakHashMap());
                this.f5580c = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.f5579b = new C6104d();
                this.f5580c = new C6104d();
                break;
        }
    }

    public C0910e(float[] fArr) {
        this.f5578a = 21;
        this.f5579b = fArr;
        this.f5580c = new int[2];
    }
}
