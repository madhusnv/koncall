package a1;

import a2.AbstractC0030c;
import a9.C0069h;
import ah.AbstractC0143a;
import ai.C0156m;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import aw.C0465e;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.SerializationException;
import b00.C0529n;
import bj.C0669a;
import bk.RunnableC0683n;
import bl.C0689a;
import c0.v1;
import c5.AbstractC0865c;
import c5.C0867e;
import c5.C0870h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.C1286b;
import com.google.android.material.datepicker.C1339c;
import com.google.android.material.datepicker.C1350n;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.MailLogger;
import com.websoptimization.callyzerbiz.R;
import cv.C1513i;
import d3.InterfaceC1563q;
import d5.InterfaceC1600d;
import d7.AbstractServiceC1652x;
import d7.C1651w;
import d7.EnumC1644p;
import d7.v0;
import df.C1703b;
import df.C1704c;
import df.EnumC1705d;
import e1.C1917s;
import e1.j0;
import e1.r0;
import e6.InterfaceC1964g;
import ef.C2049i;
import ef.InterfaceC2044d;
import ex.InterfaceC2141e;
import f3.C2196b;
import fd.C2271i;
import fd.C2272j;
import fd.InterfaceC2264b;
import fd.InterfaceC2269g;
import fe.InterfaceC2281e;
import g5.C2517g;
import g5.C2518h;
import g5.EnumC2516f;
import gi.InterfaceC2618a;
import h1.InterfaceC2779j;
import h5.C2843a;
import hc.AbstractC2887j;
import hd.C2889a;
import hd.C2891c;
import hd.C2902n;
import hd.C2903o;
import hd.C2904p;
import hd.C2905q;
import hf.AbstractC2919a;
import i0.AbstractC3084o;
import i0.m0;
import id.AbstractC3243m;
import id.C3241k;
import ii.AbstractC3275q;
import ii.C3269k;
import jakarta.mail.internet.C3654c;
import jakarta.mail.internet.C3660i;
import jakarta.mail.internet.C3675x;
import jakarta.mail.internet.ParseException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.zip.Adler32;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import k0.RunnableScheduledFutureC3893c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import kd.C4056a;
import kd.C4057b;
import kd.C4058c;
import ke.ComponentCallbacks2C4071l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kw.C4258c;
import kw.EnumC4256a;
import l0.AbstractC4308h;
import l0.InterfaceC4303c;
import nf.C5047i;
import of.C5359n;
import og.f1;
import og.nd;
import og.y0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.AbstractC5933n;
import pg.AbstractC5934o;
import pg.n6;
import pg.p6;
import pg.t8;
import ph.C5950e;
import rw.C6661k;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import td.C7126c;
import td.EnumC7143t;
import ue.EnumC7422d;
import wd.C7998f;
import x4.C8299i;
import x4.InterfaceC8300j;
import xe.C8357i;
import y4.C8552m;
import z1.C8849i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.d */
/* loaded from: classes.dex */
public class C0005d implements InterfaceC4303c, InterfaceC1964g, InterfaceC2281e, InterfaceC2264b, InterfaceC2269g, InterfaceC2618a, InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ int f23a;

    /* renamed from: b */
    public Object f24b;

    /* renamed from: c */
    public Object f25c;

    /* renamed from: d */
    public Object f26d;

    public /* synthetic */ C0005d(int i10, Object obj, Object obj2, Object obj3) {
        this.f23a = i10;
        this.f26d = obj;
        this.f24b = obj2;
        this.f25c = obj3;
    }

    /* renamed from: l */
    public static final void m31l(C0005d c0005d, Network network, boolean z6) {
        boolean z10;
        Network[] allNetworks = ((ConnectivityManager) c0005d.f24b).getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (AbstractC4154l.m8918a(network2, network)) {
                z10 = z6;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) c0005d.f24b).getNetworkCapabilities(network2);
                z10 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z10) {
                z11 = true;
                break;
            }
            i10++;
        }
        ComponentCallbacks2C4071l componentCallbacks2C4071l = (ComponentCallbacks2C4071l) c0005d.f25c;
        synchronized (componentCallbacks2C4071l) {
            try {
                if (((C7998f) componentCallbacks2C4071l.f20935a.get()) != null) {
                    componentCallbacks2C4071l.f20939e = z11;
                } else {
                    componentCallbacks2C4071l.m8845b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void m0(C0005d c0005d, String name) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0005d.f25c;
        AbstractC4154l.m8923f(name, "name");
        C6661k c6661k = (C6661k) c0005d.f26d;
        C4056a c4056a = (C4056a) c6661k.m12693t();
        C4056a c4056a2 = new C4056a((c4056a != null ? c4056a.f20905a : -1) + 1, new C3241k(name, null), linkedHashMap);
        linkedHashMap.clear();
        if (c4056a != null) {
            c4056a.f20908d.add(new C4057b(c4056a2));
        }
        c6661k.addLast(c4056a2);
    }

    /* renamed from: o */
    public static String m32o(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return m0.m7379l(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return AbstractC1452a.m4561h(str, string);
    }

    /* renamed from: q */
    public static void m33q(C0005d c0005d, String name) {
        c0005d.getClass();
        AbstractC4154l.m8923f(name, "name");
        c0005d.m72p(new C3241k(name, null));
    }

    /* renamed from: A */
    public void m34A(String str, String str2) {
        ((HashMap) this.f26d).put(str, str2);
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: B */
    public long mo35B() {
        return ((C2891c) this.f24b).mo35B();
    }

    /* renamed from: C */
    public void m36C(ArrayList arrayList, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1321040851);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(arrayList) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            EnumC4256a enumC4256a = (EnumC4256a) this.f24b;
            if (enumC4256a == EnumC4256a.Default) {
                c3966o.m8607Y(5004770);
                boolean zM8616i = c3966o.m8616i(this);
                Object objM8596M = c3966o.m8596M();
                if (zM8616i || objM8596M == C3961j.f20408a) {
                    objM8596M = new C4258c(this, null);
                    c3966o.j0(objM8596M);
                }
                c3966o.m8623p(false);
                C3953b.m8503f((InterfaceC2141e) objM8596M, arrayList, c3966o);
            } else if (enumC4256a != EnumC4256a.None) {
                throw new NoWhenBranchMatchedException();
            }
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1513i(this, arrayList, i10, 3);
        }
    }

    /* renamed from: D */
    public boolean mo37D(int i10) {
        return i10 % 100 < 60;
    }

    /* renamed from: E */
    public boolean m38E(String str) {
        try {
            C0005d c0005d = new C0005d(str);
            String str2 = (String) this.f25c;
            String str3 = (String) this.f24b;
            if ((str3 == null && ((String) c0005d.f24b) == null) || (str3 != null && str3.equalsIgnoreCase((String) c0005d.f24b))) {
                String str4 = (String) c0005d.f25c;
                if (str2 != null && str2.startsWith("*")) {
                    return true;
                }
                if (str4 != null && str4.startsWith("*")) {
                    return true;
                }
                if (str2 == null && str4 == null) {
                    return true;
                }
                if (str2 != null) {
                    if (str2.equalsIgnoreCase(str4)) {
                        return true;
                    }
                }
            }
        } catch (ParseException unused) {
        }
        return false;
    }

    /* renamed from: F */
    public boolean m39F(int i10, C2517g c2517g, C8552m c8552m) {
        C2843a c2843a = (C2843a) this.f25c;
        EnumC2516f[] enumC2516fArr = c2517g.f13772L;
        int[] iArr = c2517g.f13801o;
        c2843a.f15846a = enumC2516fArr[0];
        c2843a.f15847b = enumC2516fArr[1];
        c2843a.f15848c = c2517g.m6519l();
        c2843a.f15849d = c2517g.m6518k();
        c2843a.f15854i = false;
        c2843a.f15855j = i10;
        EnumC2516f enumC2516f = c2843a.f15846a;
        EnumC2516f enumC2516f2 = EnumC2516f.MATCH_CONSTRAINT;
        boolean z6 = enumC2516f == enumC2516f2;
        boolean z10 = c2843a.f15847b == enumC2516f2;
        boolean z11 = z6 && c2517g.f13776P > DefinitionKt.NO_Float_VALUE;
        boolean z12 = z10 && c2517g.f13776P > DefinitionKt.NO_Float_VALUE;
        if (z11 && iArr[0] == 4) {
            c2843a.f15846a = EnumC2516f.FIXED;
        }
        if (z12 && iArr[1] == 4) {
            c2843a.f15847b = EnumC2516f.FIXED;
        }
        c8552m.m15816b(c2517g, c2843a);
        c2517g.m6508H(c2843a.f15850e);
        c2517g.m6505E(c2843a.f15851f);
        c2517g.f13812z = c2843a.f15853h;
        c2517g.m6502B(c2843a.f15852g);
        c2843a.f15855j = 0;
        return c2843a.f15854i;
    }

    /* renamed from: G */
    public AbstractC3243m m40G() {
        C6661k c6661k = (C6661k) this.f25c;
        AbstractC3243m abstractC3243mM16325x = (AbstractC3243m) (c6661k.isEmpty() ? null : c6661k.removeFirst());
        if (abstractC3243mM16325x == null) {
            abstractC3243mM16325x = ((C8849i) this.f24b).m16325x();
        }
        this.f26d = abstractC3243mM16325x;
        return abstractC3243mM16325x;
    }

    /* renamed from: H */
    public Date m41H() {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int index = parsePosition.getIndex();
        try {
            return o0();
        } catch (Exception e2) {
            MailLogger mailLogger = C3660i.f19360a;
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                mailLogger.log(level, AbstractC1452a.m4564k(new StringBuilder("Bad date: '"), (String) this.f24b, "'"), (Throwable) e2);
            }
            parsePosition.setErrorIndex(parsePosition.getIndex());
            parsePosition.setIndex(index);
            return null;
        }
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        c8299i.m15506a(new RunnableC0683n(2, this), t8.m11872a());
        ((RunnableScheduledFutureC3893c) this.f26d).f19992a.set(c8299i);
        return "HandlerScheduledFuture-" + ((Callable) this.f25c).toString();
    }

    /* renamed from: J */
    public int m42J(int i10, int i11, boolean z6) throws java.text.ParseException {
        int iDigit;
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11 && m56X()) {
            int i14 = i13 * 10;
            int iM76u = m76u();
            if (48 > iM76u || iM76u > 57) {
                if (iM76u != -1) {
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                }
                iDigit = -1;
            } else {
                iDigit = Character.digit((char) iM76u, 10);
            }
            i13 = i14 + iDigit;
            i12++;
        }
        if (i12 >= i10 && (i12 != i11 || z6 || !m56X())) {
            return i13;
        }
        parsePosition.setIndex(parsePosition.getIndex() - i12);
        throw new java.text.ParseException(AbstractC5601a.m11238i("Invalid input: expected ", i10 == i11 ? Integer.toString(i10) : AbstractC5601a.m11235f("between ", i10, i11, " and "), " ASCII digits"), parsePosition.getIndex());
    }

    /* renamed from: K */
    public void m43K(char c2) throws java.text.ParseException {
        if (h0(c2)) {
            return;
        }
        throw new java.text.ParseException("Invalid input: expected '" + c2 + "'", ((ParsePosition) this.f25c).getIndex());
    }

    /* renamed from: L */
    public int mo44L() {
        i0();
        return m42J(1, 2, false);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        switch (this.f23a) {
            case 0:
                ((C0007f) this.f26d).f41f = null;
                ArrayList arrayList = (ArrayList) this.f24b;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((i0.e0) this.f25c).mo7333p((AbstractC3084o) obj);
                    }
                    arrayList.clear();
                    break;
                }
                break;
            default:
                C8299i c8299i = (C8299i) this.f25c;
                if (!(th2 instanceof CancellationException)) {
                    c8299i.m15507b(null);
                    break;
                } else {
                    y0.m11056f(null, c8299i.m15509d(new v1(AbstractC1452a.m4564k(new StringBuilder(), (String) this.f26d, " cancelled."), th2)));
                    break;
                }
        }
    }

    /* renamed from: N */
    public void m46N() throws java.text.ParseException {
        if (!i0()) {
            throw new java.text.ParseException("Invalid input: expected FWS", ((ParsePosition) this.f25c).getIndex());
        }
    }

    /* renamed from: O */
    public void mo47O() throws java.text.ParseException {
        m46N();
    }

    /* renamed from: P */
    public void mo48P() throws java.text.ParseException {
        m46N();
    }

    /* renamed from: Q */
    public int mo49Q() {
        return m42J(2, 2, false);
    }

    /* renamed from: R */
    public int mo50R() {
        return m42J(2, 2, false);
    }

    /* renamed from: S */
    public int mo51S() throws java.text.ParseException {
        if (m56X()) {
            return -1;
        }
        i0();
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int iM76u = m76u();
        if (iM76u == -1) {
            throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
        }
        int i10 = 1;
        if (iM76u == 70) {
            if (j0('r', 'i')) {
                i10 = 6;
                m43K(',');
                return i10;
            }
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
        }
        if (iM76u == 77) {
            if (j0('o', 'n')) {
                i10 = 2;
                m43K(',');
                return i10;
            }
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
        }
        if (iM76u == 87) {
            if (j0('e', 'd')) {
                i10 = 4;
                m43K(',');
                return i10;
            }
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
        }
        if (iM76u == 83) {
            if (!j0('u', 'n')) {
                if (j0('a', 't')) {
                    i10 = 7;
                }
                parsePosition.setIndex(parsePosition.getIndex() - 1);
                throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
            }
            m43K(',');
            return i10;
        }
        if (iM76u == 84) {
            if (j0('u', 'e')) {
                i10 = 3;
            } else if (j0('h', 'u')) {
                i10 = 5;
            }
            m43K(',');
            return i10;
        }
        parsePosition.setIndex(parsePosition.getIndex() - 1);
        throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
    }

    /* renamed from: T */
    public int mo52T() {
        return m42J(2, 2, false);
    }

    /* renamed from: U */
    public int mo53U() throws java.text.ParseException {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int iM42J = m42J(4, 8, false);
        if (iM42J >= 1900) {
            return iM42J;
        }
        parsePosition.setIndex(parsePosition.getIndex() - 4);
        while (((String) this.f24b).charAt(parsePosition.getIndex() - 1) == '0') {
            parsePosition.setIndex(parsePosition.getIndex() - 1);
        }
        throw new java.text.ParseException("Invalid year", parsePosition.getIndex());
    }

    /* renamed from: V */
    public int mo54V() {
        return m55W();
    }

    /* renamed from: W */
    public int m55W() throws java.text.ParseException {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int iM76u = m76u();
        if (iM76u != 43 && iM76u != 45) {
            if (iM76u != -1) {
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            }
            throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
        }
        int iM42J = m42J(4, 4, true);
        if (mo37D(iM42J)) {
            return ((iM42J % 100) + ((iM42J / 100) * 60)) * (iM76u != 43 ? 1 : -1);
        }
        parsePosition.setIndex(parsePosition.getIndex() - 5);
        throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
    }

    /* renamed from: X */
    public boolean m56X() {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int index = parsePosition.getIndex();
        String str = (String) this.f24b;
        return index < str.length() && '0' <= str.charAt(parsePosition.getIndex()) && str.charAt(parsePosition.getIndex()) <= '9';
    }

    /* renamed from: Y */
    public boolean mo57Y() {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int index = parsePosition.getIndex();
        String str = (String) this.f24b;
        if (index < str.length()) {
            return str.charAt(parsePosition.getIndex()) == ' ' || str.charAt(parsePosition.getIndex()) == '\t' || str.charAt(parsePosition.getIndex()) == '\r';
        }
        return false;
    }

    /* renamed from: Z */
    public void m58Z(EnumC1644p enumC1644p) {
        v0 v0Var = (v0) this.f26d;
        if (v0Var != null) {
            v0Var.run();
        }
        v0 v0Var2 = new v0((C1651w) this.f24b, enumC1644p);
        this.f26d = v0Var2;
        ((Handler) this.f25c).postAtFrontOfQueue(v0Var2);
    }

    @Override // fe.InterfaceC2281e
    /* renamed from: a */
    public boolean mo59a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f24b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public void a0(C8357i c8357i, int i10, boolean z6) {
        C1703b c1703b = (C1703b) this.f26d;
        Context context = (Context) this.f24b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c8357i.f39998a;
        String str2 = c8357i.f39998a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC7422d enumC7422d = c8357i.f40000c;
        adler32.update(byteBufferAllocate.putInt(AbstractC2919a.m7025a(enumC7422d)).array());
        byte[] bArr = c8357i.f39999b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z6) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        f1.m10638b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c8357i);
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((C2049i) ((InterfaceC2044d) this.f25c)).m5772h().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(AbstractC2919a.m7025a(enumC7422d))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c1703b.m5397a(enumC7422d, jLongValue, i10));
            Set set = ((C1704c) c1703b.f8310b.get(enumC7422d)).f8313c;
            if (set.contains(EnumC1705d.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC1705d.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC1705d.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", AbstractC2919a.m7025a(enumC7422d));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c8357i, Integer.valueOf(value), Long.valueOf(c1703b.m5397a(enumC7422d, jLongValue, i10)), lValueOf, Integer.valueOf(i10)};
            if (Log.isLoggable(f1.m10639c("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: b */
    public Uri mo60b() {
        return (Uri) this.f24b;
    }

    public void b0(InterfaceC1563q interfaceC1563q) {
        ((C2196b) this.f26d).f10123a.f10121c = interfaceC1563q;
    }

    public void c0(InterfaceC6747c interfaceC6747c) {
        ((C2196b) this.f26d).f10123a.f10119a = interfaceC6747c;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f23a) {
            case 4:
                C0005d c0005d = new C0005d(((C1286b) this.f25c).clone());
                ArrayList arrayList = (ArrayList) this.f24b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ArrayList) c0005d.f24b).add(((C1286b) obj).clone());
                }
                return c0005d;
            default:
                return super.clone();
        }
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: d */
    public String mo62d() {
        return ((C2891c) this.f24b).mo62d();
    }

    public void d0(EnumC6757m enumC6757m) {
        ((C2196b) this.f26d).f10123a.f10120b = enumC6757m;
    }

    @Override // fd.InterfaceC2264b
    /* renamed from: e */
    public void mo63e() {
        ((C5359n) this.f25c).m10488C();
    }

    public void e0(long j6) {
        ((C2196b) this.f26d).f10123a.f10122d = j6;
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: f */
    public int mo64f() {
        return ((C2891c) this.f24b).mo64f();
    }

    public boolean f0(char c2, char c10) {
        return h0(c2) || h0(c10);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        switch (this.f23a) {
            case 0:
                ((C0007f) this.f26d).f41f = null;
                break;
            default:
                AbstractC4308h.m9035e((InterfaceFutureC8957d) this.f24b, (C8299i) this.f25c);
                break;
        }
    }

    public boolean g0(char c2, char c10, char c11, char c12) {
        if (!f0(c2, c10)) {
            return false;
        }
        if (f0(c11, c12)) {
            return true;
        }
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        parsePosition.setIndex(parsePosition.getIndex() - 1);
        return false;
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: h */
    public Uri mo66h() {
        return (Uri) this.f26d;
    }

    public boolean h0(char c2) {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int index = parsePosition.getIndex();
        String str = (String) this.f24b;
        if (index >= str.length() || str.charAt(parsePosition.getIndex()) != c2) {
            return false;
        }
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return true;
    }

    @Override // gi.InterfaceC2618a
    /* renamed from: i */
    public byte[] mo67i(int i10, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrM11820g;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher = (Cipher) C3269k.f17466e.m7622a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f24b);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrM11820g = p6.m11819f((iMax - 1) * 16, bArr, 0, (byte[]) this.f25c, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrM11820g = p6.m11820g(bArrCopyOf, (byte[]) this.f26d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipher.doFinal(p6.m11819f(0, bArrDoFinal, i11 * 16, bArr, 16));
        }
        return Arrays.copyOf(cipher.doFinal(p6.m11820g(bArrM11820g, bArrDoFinal)), i10);
    }

    public boolean i0() {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        if (h0(' ')) {
            if (mo57Y()) {
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            }
            return true;
        }
        if (!mo57Y()) {
            return false;
        }
        int index = parsePosition.getIndex();
        if (k0()) {
            while (j0('\r', '\n')) {
                if (!k0()) {
                    parsePosition.setIndex(index);
                    return false;
                }
            }
        } else if (!j0('\r', '\n') || !k0()) {
            parsePosition.setIndex(index);
            return false;
        }
        return true;
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: j */
    public ClipDescription mo68j() {
        return (ClipDescription) this.f25c;
    }

    public boolean j0(char c2, char c10) {
        if (!h0(c2)) {
            return false;
        }
        if (h0(c10)) {
            return true;
        }
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        parsePosition.setIndex(parsePosition.getIndex() - 1);
        return false;
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: k */
    public Object mo69k() {
        return null;
    }

    public boolean k0() {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int index = parsePosition.getIndex();
        while (f0(' ', '\t')) {
        }
        return parsePosition.getIndex() > index;
    }

    public void l0(C2518h c2518h, int i10, int i11, int i12) {
        c2518h.getClass();
        int i13 = c2518h.f13781U;
        int i14 = c2518h.f13782V;
        c2518h.f13781U = 0;
        c2518h.f13782V = 0;
        c2518h.m6508H(i11);
        c2518h.m6505E(i12);
        if (i13 < 0) {
            c2518h.f13781U = 0;
        } else {
            c2518h.f13781U = i13;
        }
        if (i14 < 0) {
            c2518h.f13782V = 0;
        } else {
            c2518h.f13782V = i14;
        }
        C2518h c2518h2 = (C2518h) this.f26d;
        c2518h2.f44247j0 = i10;
        c2518h2.m6535L();
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: m */
    public AbstractC2887j mo70m() {
        return ((C2891c) this.f24b).mo70m();
    }

    @Override // fd.InterfaceC2264b
    /* renamed from: n */
    public Integer mo71n() {
        C2272j c2272j = (C2272j) this.f26d;
        C5359n c5359n = (C5359n) this.f25c;
        AbstractC5934o abstractC5934oM10504k = c5359n.m10504k();
        boolean zEquals = abstractC5934oM10504k.equals(C2903o.f15937b);
        C2905q c2905q = C2905q.f15939b;
        Integer numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        Object obj = null;
        if (zEquals) {
            AbstractC5934o abstractC5934oM10503j = c5359n.m10503j();
            if (abstractC5934oM10503j.getClass() != C2903o.class) {
                throw new DeserializationException("expected " + kotlin.jvm.internal.a0.m8901a(C2903o.class) + "; found " + kotlin.jvm.internal.a0.m8901a(abstractC5934oM10503j.getClass()));
            }
        } else if (!abstractC5934oM10504k.equals(C2902n.f15936b)) {
            if (abstractC5934oM10504k.equals(c2905q)) {
                AbstractC5934o abstractC5934oM10503j2 = c5359n.m10503j();
                if (abstractC5934oM10503j2.getClass() != C2905q.class) {
                    throw new DeserializationException("expected " + kotlin.jvm.internal.a0.m8901a(C2905q.class) + "; found " + kotlin.jvm.internal.a0.m8901a(abstractC5934oM10503j2.getClass()));
                }
            } else {
                AbstractC5934o abstractC5934oM10503j3 = c5359n.m10503j();
                if (abstractC5934oM10503j3.getClass() != C2904p.class) {
                    throw new DeserializationException("expected " + kotlin.jvm.internal.a0.m8901a(C2904p.class) + "; found " + kotlin.jvm.internal.a0.m8901a(abstractC5934oM10503j3.getClass()));
                }
                String str = ((C2904p) abstractC5934oM10503j3).f15938b;
                ArrayList arrayList = c2272j.f10281d;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (AbstractC5933n.m11794b((C2271i) obj2).equals(str)) {
                        obj = obj2;
                        break;
                    }
                }
                C2271i c2271i = (C2271i) obj;
                if (c2272j.f10280c.contains(new C2889a(str))) {
                    c5359n.m10488C();
                    return mo71n();
                }
                numValueOf = Integer.valueOf(c2271i != null ? c2271i.f10279b : -1);
            }
        }
        if (numValueOf == null || !c5359n.m10504k().equals(c2905q)) {
            return numValueOf;
        }
        AbstractC5934o abstractC5934oM10503j4 = c5359n.m10503j();
        if (abstractC5934oM10503j4.getClass() == C2905q.class) {
            return mo71n();
        }
        throw new DeserializationException("expected " + kotlin.jvm.internal.a0.m8901a(C2905q.class) + "; found " + kotlin.jvm.internal.a0.m8901a(abstractC5934oM10503j4.getClass()));
    }

    public void n0(String text) {
        AbstractC4154l.m8923f(text, "text");
        C6661k c6661k = (C6661k) this.f26d;
        if (c6661k.isEmpty()) {
            throw new SerializationException("Attempted to serialize text or attribute without containing tag");
        }
        C4056a c4056a = (C4056a) c6661k.last();
        c4056a.getClass();
        c4056a.f20908d.add(new C4058c(text));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0140, code lost:
    
        if (g0('e', 'E', 'b', 'B') == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date o0() throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0005d.o0():java.util.Date");
    }

    /* renamed from: p */
    public void m72p(C3241k c3241k) {
        C6661k c6661k = (C6661k) this.f26d;
        C4056a c4056a = (C4056a) (c6661k.isEmpty() ? null : c6661k.removeLast());
        if (c4056a == null) {
            throw new SerializationException("Unexpected end of tag while no tags are open");
        }
        C3241k c3241k2 = c4056a.f20906b;
        if (c3241k2.equals(c3241k)) {
            if (c6661k.isEmpty()) {
                c4056a.m8838b((StringBuilder) this.f24b);
            }
        } else {
            throw new SerializationException("Tried to end tag " + c3241k + " but expected end of " + c3241k2 + " tag");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p0(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ko.C4136d
            if (r0 == 0) goto L13
            r0 = r5
            ko.d r0 = (ko.C4136d) r0
            int r1 = r0.f21114c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21114c = r1
            goto L18
        L13:
            ko.d r0 = new ko.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f21112a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21114c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            java.lang.Object r5 = r4.f25c
            nn.e r5 = (nn.C5113e) r5
            r0.f21114c = r3
            xm.z r5 = r5.f25030a
            fn.i r5 = r5.f41069a
            km.a r5 = r5.f10585a
            km.o r5 = (km.C4120o) r5
            java.lang.String r2 = "App_Version"
            java.lang.Object r5 = r5.m8883e(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0 = 150(0x96, float:2.1E-43)
            if (r5 >= r0) goto L5e
            java.lang.Object r5 = r4.f24b
            uo.j r5 = (uo.C7485j) r5
            java.lang.Object r0 = r4.f26d
            android.content.Context r0 = (android.content.Context) r0
            r5.m14286c(r0)
        L5e:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0005d.p0(ww.c):java.lang.Object");
    }

    public void q0(C2518h c2518h) {
        ArrayList arrayList = (ArrayList) this.f24b;
        arrayList.clear();
        int size = c2518h.f44244g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2517g c2517g = (C2517g) c2518h.f44244g0.get(i10);
            EnumC2516f[] enumC2516fArr = c2517g.f13772L;
            EnumC2516f enumC2516f = enumC2516fArr[0];
            EnumC2516f enumC2516f2 = EnumC2516f.MATCH_CONSTRAINT;
            if (enumC2516f == enumC2516f2 || enumC2516fArr[1] == enumC2516f2) {
                arrayList.add(c2517g);
            }
        }
        c2518h.f44246i0.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bj.C0669a m73r() throws java.lang.Throwable {
        /*
            r8 = this;
            xi.C8386d.m15553b()
            r0 = 0
            java.lang.Object r1 = r8.f24b     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r8.f25c     // Catch: java.lang.Throwable -> La3
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = m32o(r1, r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 2
            android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> La3
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> La0
            r2.<init>(r1)     // Catch: java.lang.Throwable -> La0
            java.net.URLConnection r1 = r2.openConnection()     // Catch: java.lang.Throwable -> La0
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> La0
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L56
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r8.f26d     // Catch: java.lang.Throwable -> L56
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L56
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L56
        L3a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L58
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L56
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L56
            r1.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L56
            goto L3a
        L56:
            r2 = move-exception
            goto La6
        L58:
            r1.connect()     // Catch: java.lang.Throwable -> L56
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L56
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L91
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L8d
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L8d
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
        L7a:
            int r6 = r0.read(r4)     // Catch: java.lang.Throwable -> L8d
            r7 = -1
            if (r6 == r7) goto L86
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> L8d
            goto L7a
        L86:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8b:
            r2 = r0
            goto L8f
        L8d:
            r0 = move-exception
            goto L8b
        L8f:
            r0 = r3
            goto La6
        L91:
            if (r3 == 0) goto L96
            r3.close()
        L96:
            r1.disconnect()
            bj.a r1 = new bj.a
            r3 = 0
            r1.<init>(r2, r0, r3)
            return r1
        La0:
            r2 = move-exception
        La1:
            r1 = r0
            goto La6
        La3:
            r1 = move-exception
            r2 = r1
            goto La1
        La6:
            if (r0 == 0) goto Lab
            r0.close()
        Lab:
            if (r1 == 0) goto Lb0
            r1.disconnect()
        Lb0:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0005d.m73r():bj.a");
    }

    /* renamed from: s */
    public float m74s(AbstractC0865c abstractC0865c) {
        HashMap map = (HashMap) this.f24b;
        HashMap map2 = (HashMap) this.f25c;
        if (!(abstractC0865c instanceof C0870h)) {
            return abstractC0865c instanceof C0867e ? ((C0867e) abstractC0865c).mo2328c() : DefinitionKt.NO_Float_VALUE;
        }
        String strM2327b = ((C0870h) abstractC0865c).m2327b();
        return map2.containsKey(strM2327b) ? ((InterfaceC1600d) map2.get(strM2327b)).value() : map.containsKey(strM2327b) ? ((Integer) map.get(strM2327b)).floatValue() : DefinitionKt.NO_Float_VALUE;
    }

    @Override // fe.InterfaceC2281e
    public void shutdown() {
        ((ConnectivityManager) this.f24b).unregisterNetworkCallback((C0069h) this.f26d);
    }

    /* renamed from: t */
    public InterfaceC1563q m75t() {
        return ((C2196b) this.f26d).f10123a.f10121c;
    }

    public String toString() {
        switch (this.f23a) {
            case 22:
                String str = (String) this.f25c;
                String str2 = (String) this.f24b;
                if (str2 == null || str == null) {
                    return "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append('/');
                sb2.append(str);
                C3675x c3675x = (C3675x) this.f26d;
                if (c3675x != null) {
                    sb2.append(c3675x.m8265i(sb2.length() + 14));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public int m76u() {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        int index = parsePosition.getIndex();
        String str = (String) this.f24b;
        if (index >= str.length()) {
            return -1;
        }
        char cCharAt = str.charAt(parsePosition.getIndex());
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return cCharAt;
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: v */
    public C7126c mo77v(EnumC7143t format) {
        AbstractC4154l.m8923f(format, "format");
        return ((C2891c) this.f24b).mo77v(format);
    }

    /* renamed from: w */
    public String m78w(String str) {
        C3675x c3675x = (C3675x) this.f26d;
        if (c3675x == null) {
            return null;
        }
        return c3675x.m8261e(str);
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: x */
    public boolean mo79x() {
        return ((C2891c) this.f24b).mo79x();
    }

    /* renamed from: y */
    public List m80y(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f24b).get(new C0156m(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* renamed from: z */
    public long m81z() {
        return ((C2196b) this.f26d).f10123a.f10122d;
    }

    public /* synthetic */ C0005d(int i10, Object obj, Object obj2, Object obj3, boolean z6) {
        this.f23a = i10;
        this.f24b = obj;
        this.f25c = obj2;
        this.f26d = obj3;
    }

    public /* synthetic */ C0005d(int i10, boolean z6) {
        this.f23a = i10;
    }

    public C0005d(int i10) {
        this.f23a = i10;
        switch (i10) {
            case 21:
                String string = UUID.randomUUID().toString();
                AbstractC4154l.m8922e(string, "toString(...)");
                C0529n c0529n = C0529n.f3647d;
                this.f25c = C5950e.m11977h(string);
                this.f26d = iz.b0.f17785f;
                this.f24b = new ArrayList();
                break;
            case 26:
                this.f24b = new C1917s(16);
                long[] jArr = r0.f9045a;
                this.f25c = new j0();
                this.f26d = new C0689a(22);
                break;
            case 27:
                this.f24b = new StringBuilder();
                this.f25c = new LinkedHashMap();
                this.f26d = new C6661k();
                break;
            default:
                this.f25c = new C1286b("", 0L, null);
                this.f26d = new C1286b("", 0L, null);
                this.f24b = new ArrayList();
                break;
        }
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: c */
    public void mo61c() {
    }

    public C0005d(C1286b c1286b) {
        this.f23a = 4;
        this.f25c = c1286b;
        this.f26d = c1286b.clone();
        this.f24b = new ArrayList();
    }

    public C0005d(EnumC4256a executionType, InterfaceC2779j[] interfaceC2779jArr) {
        this.f23a = 29;
        AbstractC4154l.m8923f(executionType, "executionType");
        this.f24b = executionType;
        this.f25c = interfaceC2779jArr;
        this.f26d = nd.m10782c(new C0465e(18, this));
    }

    public C0005d(C8849i c8849i) {
        this.f23a = 24;
        this.f24b = c8849i;
        this.f25c = new C6661k();
    }

    public C0005d(AbstractServiceC1652x abstractServiceC1652x) {
        this.f23a = 7;
        this.f24b = new C1651w(abstractServiceC1652x);
        this.f25c = new Handler();
    }

    public C0005d(String str, HashMap map) {
        this.f23a = 2;
        this.f24b = str;
        this.f25c = map;
        this.f26d = new HashMap();
    }

    public C0005d(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f23a = 20;
        AbstractC3275q.m7625a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f24b = secretKeySpec;
        Cipher cipher = (Cipher) C3269k.f17466e.m7622a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrM11796b = n6.m11796b(cipher.doFinal(new byte[16]));
        this.f25c = bArrM11796b;
        this.f26d = n6.m11796b(bArrM11796b);
    }

    public C0005d(String str) throws ParseException {
        this.f23a = 22;
        C3654c c3654c = new C3654c(str);
        C0669a c0669aM8205c = c3654c.m8205c((char) 0, false);
        String str2 = c0669aM8205c.f4226c;
        if (c0669aM8205c.f4225b == -1) {
            this.f24b = str2;
            C0669a c0669aM8205c2 = c3654c.m8205c((char) 0, false);
            if (((char) c0669aM8205c2.f4225b) == '/') {
                C0669a c0669aM8205c3 = c3654c.m8205c((char) 0, false);
                String str3 = c0669aM8205c3.f4226c;
                if (c0669aM8205c3.f4225b == -1) {
                    this.f25c = str3;
                    int i10 = c3654c.f19349d;
                    String str4 = c3654c.f19346a;
                    String strSubstring = i10 >= str4.length() ? null : str4.substring(c3654c.f19349d);
                    if (strSubstring != null) {
                        this.f26d = new C3675x(strSubstring);
                        return;
                    }
                    return;
                }
                throw new ParseException(AbstractC0030c.m121l("In Content-Type string <", str, ">, expected MIME subtype, got ", str3));
            }
            StringBuilder sbM7383p = m0.m7383p("In Content-Type string <", str, ">, expected '/', got ");
            sbM7383p.append(c0669aM8205c2.f4226c);
            throw new ParseException(sbM7383p.toString());
        }
        throw new ParseException(AbstractC0030c.m121l("In Content-Type string <", str, ">, expected MIME type, got ", str2));
    }

    public C0005d(C2196b c2196b) {
        this.f23a = 15;
        this.f26d = c2196b;
        this.f24b = new C5047i(14, this);
    }

    public C0005d(ConnectivityManager connectivityManager, ComponentCallbacks2C4071l componentCallbacks2C4071l) {
        this.f23a = 16;
        this.f24b = connectivityManager;
        this.f25c = componentCallbacks2C4071l;
        C0069h c0069h = new C0069h(1, this);
        this.f26d = c0069h;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c0069h);
    }

    public C0005d(Context context) throws Resources.NotFoundException {
        this.f23a = 5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(og.v0.m11010c(R.attr.materialCalendarStyle, context, C1350n.class.getCanonicalName()), AbstractC0143a.f463l);
        C1339c.m4093a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f26d = C1339c.m4093a(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        C1339c.m4093a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C1339c.m4093a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListM11057g = y0.m11057g(context, typedArrayObtainStyledAttributes, 6);
        this.f24b = C1339c.m4093a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        C1339c.m4093a(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f25c = C1339c.m4093a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(colorStateListM11057g.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0005d(C2518h c2518h) {
        this.f23a = 18;
        this.f24b = new ArrayList();
        this.f25c = new C2843a();
        this.f26d = c2518h;
    }

    public C0005d(Class cls) {
        this.f23a = 1;
        this.f24b = new ConcurrentHashMap();
        this.f26d = cls;
    }

    public C0005d(C5359n reader, C2272j descriptor, C2891c c2891c) {
        this.f23a = 19;
        AbstractC4154l.m8923f(reader, "reader");
        AbstractC4154l.m8923f(descriptor, "descriptor");
        this.f24b = c2891c;
        this.f25c = reader;
        this.f26d = descriptor;
    }
}
