package c9;

import a1.C0007f;
import a1.RunnableC0012k;
import a1.RunnableC0025x;
import a6.C0058f;
import a9.C0073l;
import ak.CallableC0167f;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.work.impl.WorkDatabase_Impl;
import bk.C0674e;
import bk.C0676g;
import bl.C0689a;
import c0.C0811d;
import c0.C0812e;
import c0.EnumC0826s;
import c5.C0863a;
import c5.C0867e;
import c5.C0869g;
import c5.C0870h;
import c6.InterfaceC0893w;
import c6.v0;
import c6.v1;
import c6.y1;
import cj.C0977c;
import cj.C0979e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.gson.JsonIOException;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.R;
import dg.C1714c;
import e1.C1917s;
import ej.C2057b;
import ej.C2060e;
import ek.AbstractC2065e;
import ek.C2062b;
import ek.C2064d;
import gm.a0;
import i0.f0;
import i0.g1;
import i0.m1;
import i0.n1;
import i0.o0;
import i00.InterfaceC3106k;
import io.C3328c;
import iz.l0;
import iz.n0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.EnumC4099s;
import kotlin.jvm.internal.AbstractC4154l;
import l0.InterfaceC4303c;
import l1.C4327p;
import m2.C4640e;
import n0.AbstractC4940a;
import og.mc;
import og.pe;
import og.u1;
import oj.C5392d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p020v.j0;
import pf.C5905e;
import pg.l8;
import pg.s8;
import pg.t8;
import pg.z9;
import ph.C5950e;
import q0.C6069j;
import q0.C6070k;
import q0.InterfaceC6071l;
import rk.C6564a;
import rk.EnumC6565b;
import ty.C7273g;
import ug.C7451v;
import uh.C7469n;
import v0.C7622f;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.InterfaceC7645q;
import v3.c0;
import v3.g0;
import w2.AbstractC7878q;
import w3.C7892j;
import wi.AbstractC8057g;
import wi.C8062l;
import xi.C8386d;
import xm.C8418z;
import xm.q4;
import y4.C8543d;
import yg.C8650g;
import yg.C8656m;
import yg.InterfaceC8646c;
import yg.InterfaceC8649f;
import z5.ViewTreeObserverOnPreDrawListenerC8868a;
import z7.C8896y;
import zj.C8986c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.v */
/* loaded from: classes.dex */
public class C0927v implements InterfaceC8649f, n1, InterfaceC3106k, InterfaceC0893w, InterfaceC4303c, InterfaceC8646c {

    /* renamed from: a */
    public final /* synthetic */ int f5667a;

    /* renamed from: b */
    public Object f5668b;

    /* renamed from: c */
    public Object f5669c;

    public /* synthetic */ C0927v(int i10, Object obj, Object obj2) {
        this.f5667a = i10;
        this.f5669c = obj;
        this.f5668b = obj2;
    }

    /* renamed from: d */
    public static C0927v m2697d(Context context) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C0927v(12, channel, fileLockLock, false);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: f */
    public static void m2698f(g0 g0Var) {
        if (g0Var.f36833L.f36931d == c0.Idle && !g0Var.m14605r() && !g0Var.m14606s() && !g0Var.f44836h0 && g0Var.m14579I()) {
            AbstractC7878q abstractC7878q = (AbstractC7878q) g0Var.f36832K.f22542f;
            if ((abstractC7878q.f37673d & 256) != 0) {
                while (abstractC7878q != null) {
                    if ((abstractC7878q.f37672c & 256) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q;
                        ?? c4640e = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof InterfaceC7645q) {
                                InterfaceC7645q interfaceC7645q = (InterfaceC7645q) abstractC7642nM14545f;
                                interfaceC7645q.mo7495W(AbstractC7634f.m14561v(interfaceC7645q, 256));
                            } else if ((abstractC7642nM14545f.f37672c & 256) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q2 = abstractC7642nM14545f.f36953r;
                                int i10 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e = c4640e;
                                while (abstractC7878q2 != null) {
                                    if ((abstractC7878q2.f37672c & 256) != 0) {
                                        i10++;
                                        c4640e = c4640e;
                                        if (i10 == 1) {
                                            abstractC7642nM14545f = abstractC7878q2;
                                        } else {
                                            if (c4640e == 0) {
                                                c4640e = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7642nM14545f != 0) {
                                                c4640e.m9506b(abstractC7642nM14545f);
                                                abstractC7642nM14545f = 0;
                                            }
                                            c4640e.m9506b(abstractC7878q2);
                                        }
                                    }
                                    abstractC7878q2 = abstractC7878q2.f37675f;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                        }
                    }
                    if ((abstractC7878q.f37673d & 256) == 0) {
                        break;
                    } else {
                        abstractC7878q = abstractC7878q.f37675f;
                    }
                }
            }
        }
        g0Var.f36841Z = false;
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i11 = c4640eM14613z.f22886c;
        for (int i12 = 0; i12 < i11; i12++) {
            m2698f((g0) objArr[i12]);
        }
    }

    /* renamed from: n */
    public static void m2699n(C0927v c0927v, C8543d c8543d, float f6, int i10) {
        if ((i10 & 2) != 0) {
            f6 = 0;
        }
        c0927v.m2705m(c8543d, f6, 0);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        int i10 = ((C6069j) this.f5668b).f29598f;
        if (i10 == 2 && (th2 instanceof CancellationException)) {
            u1.m10942a("DualSurfaceProcessorNode");
        } else {
            mc.m10762a(i10);
            u1.m10952k("DualSurfaceProcessorNode");
        }
    }

    @Override // i0.n1
    /* renamed from: a */
    public void mo2184a(Executor executor, m1 m1Var) {
        synchronized (((HashMap) this.f5669c)) {
            g1 g1Var = (g1) ((HashMap) this.f5669c).get(m1Var);
            if (g1Var != null) {
                g1Var.f16463a.set(false);
            }
            g1 g1Var2 = new g1(executor, (C0007f) m1Var);
            ((HashMap) this.f5669c).put(m1Var, g1Var2);
            t8.m11875d().execute(new RunnableC0025x(11, this, g1Var, g1Var2));
        }
    }

    @Override // i00.InterfaceC3106k
    /* renamed from: b */
    public Object mo2700b(Object obj) {
        n0 n0Var = (n0) obj;
        C4088h c4088h = (C4088h) this.f5668b;
        l0 l0Var = n0Var.f17962a;
        if (l0Var == null) {
            l0Var = new l0(n0Var.mo7462n(), z9.m11972a(n0Var.mo7461j()));
            n0Var.f17962a = l0Var;
        }
        C6564a c6564a = new C6564a(l0Var);
        EnumC4099s enumC4099s = c4088h.f20980h;
        if (enumC4099s == null) {
            enumC4099s = EnumC4099s.LEGACY_STRICT;
        }
        c6564a.H0(enumC4099s);
        try {
            Object objMo8851b = ((AbstractC4103w) this.f5669c).mo8851b(c6564a);
            if (c6564a.E0() == EnumC6565b.END_DOCUMENT) {
                return objMo8851b;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            n0Var.close();
        }
    }

    @Override // i0.n1
    /* renamed from: c */
    public void mo2185c(m1 m1Var) {
        synchronized (((HashMap) this.f5669c)) {
            try {
                g1 g1Var = (g1) ((HashMap) this.f5669c).remove(m1Var);
                if (g1Var != null) {
                    g1Var.f16463a.set(false);
                    t8.m11875d().execute(new RunnableC0012k(22, this, g1Var));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c6.InterfaceC0893w
    /* renamed from: e */
    public y1 mo2531e(View view, y1 y1Var) {
        v1 v1Var = y1Var.f5541a;
        C0058f c0058f = (C0058f) this.f5668b;
        C1714c c1714c = (C1714c) this.f5669c;
        int i10 = c1714c.f8340a;
        int i11 = c1714c.f8341b;
        int i12 = c1714c.f8342c;
        boolean z6 = c0058f.f233a;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0058f.f234b;
        bottomSheetBehavior.f6773r = y1Var.m2538a();
        Field field = v0.f5527a;
        boolean z10 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z11 = bottomSheetBehavior.f6768m;
        if (z11) {
            int i13 = v1Var.mo2477l().f34960d;
            bottomSheetBehavior.f6772q = i13;
            paddingBottom = i13 + i12;
        }
        if (bottomSheetBehavior.f6769n) {
            paddingLeft = v1Var.mo2477l().f34957a + (z10 ? i11 : i10);
        }
        if (bottomSheetBehavior.f6770o) {
            if (!z10) {
                i10 = i11;
            }
            paddingRight = v1Var.mo2477l().f34959c + i10;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (z6) {
            bottomSheetBehavior.f6766k = v1Var.mo2512i().f34960d;
        }
        if (!z11 && !z6) {
            return y1Var;
        }
        bottomSheetBehavior.m4056G();
        return y1Var;
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        C6070k c6070k = (C6070k) obj;
        c6070k.getClass();
        try {
            ((InterfaceC6071l) ((C0073l) this.f5669c).f264a).mo12067c(c6070k);
        } catch (ProcessingException unused) {
            u1.m10944c("DualSurfaceProcessorNode");
        }
    }

    /* renamed from: h */
    public C2064d m2701h(C0676g c0676g) throws JSONException, FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = c0676g.f4263g;
        long j6 = c0676g.f4262f;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2);
                }
                String strOptString = jSONArray2.optString(0, "");
                C0676g c0676gM1949c = ((C0674e) this.f5668b).m1949c();
                String string3 = null;
                if (c0676gM1949c == null) {
                    string = null;
                } else {
                    try {
                        string = c0676gM1949c.f4258b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    C0676g c0676gM1949c2 = ((C0674e) this.f5669c).m1949c();
                    if (c0676gM1949c2 != null) {
                        try {
                            string3 = c0676gM1949c2.f4258b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i11 = AbstractC2065e.f9677a;
                C2062b c2062b = new C2062b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                c2062b.f9665a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                c2062b.f9666b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                c2062b.f9667c = strOptString;
                c2062b.f9668d = string;
                c2062b.f9669e = j6;
                c2062b.f9670f = (byte) (c2062b.f9670f | 1);
                hashSet.add(c2062b.m5789a());
            } catch (JSONException e2) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e2);
            }
        }
        return new C2064d(hashSet);
    }

    /* renamed from: i */
    public C7273g m2702i(String str) {
        String strM9046c;
        String str2;
        if (str.equals("/")) {
            return new C7273g("", "/");
        }
        if (str.isEmpty() || ".".equals(str) || "./".equals(str)) {
            synchronized (this) {
                strM9046c = (String) this.f5669c;
                if (strM9046c == null) {
                    strM9046c = ((C4327p) this.f5668b).m9046c(".");
                    this.f5669c = strM9046c;
                }
            }
            return m2702i(strM9046c);
        }
        String strSubstring = str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
        int iLastIndexOf = strSubstring.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strSubstring2 = iLastIndexOf == 0 ? "/" : strSubstring.substring(0, iLastIndexOf);
            strSubstring = strSubstring.substring(1 + iLastIndexOf);
            str2 = strSubstring2;
        }
        return (".".equals(strSubstring) || "..".equals(strSubstring)) ? m2702i(((C4327p) this.f5668b).m9046c(str)) : new C7273g(str2, strSubstring);
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m c8656m) {
        C7469n c7469n = (C7469n) this.f5668b;
        C8650g c8650g = (C8650g) this.f5669c;
        synchronized (c7469n.f36066f) {
            c7469n.f36065e.remove(c8650g);
        }
    }

    /* renamed from: k */
    public ArrayList m2703k(String str) {
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        c8896yM16401j.mo9278q(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5668b;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM10840o.getCount());
            while (cursorM10840o.moveToNext()) {
                arrayList.add(cursorM10840o.getString(0));
            }
            return arrayList;
        } finally {
            cursorM10840o.close();
            c8896yM16401j.m16402u();
        }
    }

    /* renamed from: l */
    public void mo2704l() {
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.f5668b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            s8.m11864b(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        m2708r(theme, typedValue);
    }

    /* renamed from: m */
    public void m2705m(C8543d c8543d, float f6, float f10) {
        int i10 = c8543d.f41501b;
        String str = "start";
        if (i10 != -2) {
            if (i10 == -1) {
                str = "end";
            } else if (i10 == 0) {
                str = "left";
            } else if (i10 == 1) {
                str = "right";
            }
        }
        C0863a c0863a = new C0863a(new char[0]);
        c0863a.m2317m(C0870h.m2333m(c8543d.f41500a.toString()));
        c0863a.m2317m(C0870h.m2333m(str));
        c0863a.m2317m(new C0867e(f6));
        c0863a.m2317m(new C0867e(f10));
        ((C0869g) this.f5668b).m2315E((String) this.f5669c, c0863a);
    }

    /* renamed from: o */
    public void m2706o() throws IOException {
        try {
            ((FileLock) this.f5669c).release();
            ((FileChannel) this.f5668b).close();
        } catch (IOException unused) {
        }
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) throws Throwable {
        FileWriter fileWriter;
        switch (this.f5667a) {
            case 2:
                C3328c c3328c = (C3328c) this.f5669c;
                JSONObject jSONObject = (JSONObject) ((C8386d) this.f5668b).f40065c.f40059a.submit(new CallableC0167f(3, this)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    C8986c c8986c = (C8986c) c3328c.f17611c;
                    c8986c.getClass();
                    C2057b c2057bMo5782f = (jSONObject.getInt("settings_version") != 3 ? new C5392d(8) : new C5950e(8)).mo5782f((C7451v) c8986c.f43336b, jSONObject);
                    C8989c c8989c = (C8989c) c3328c.f17613e;
                    long j6 = c2057bMo5782f.f9646c;
                    c8989c.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    try {
                        jSONObject.put("expires_at", j6);
                        fileWriter = new FileWriter((File) c8989c.f43339b);
                    } catch (Exception unused) {
                        fileWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        fileWriter2 = fileWriter;
                        AbstractC8057g.m15188b(fileWriter2);
                        throw th;
                    }
                    AbstractC8057g.m15188b(fileWriter);
                    jSONObject.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    String str = (String) ((C2060e) c3328c.f17610b).f9655f;
                    SharedPreferences.Editor editorEdit = ((Context) c3328c.f17609a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    ((AtomicReference) c3328c.f17616h).set(c2057bMo5782f);
                    ((C8650g) ((AtomicReference) c3328c.f17617i).get()).m15971d(c2057bMo5782f);
                }
                return l8.m11765f(null);
            default:
                Boolean bool = (Boolean) obj;
                C8062l c8062l = (C8062l) this.f5669c;
                if (bool.booleanValue()) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    boolean zBooleanValue = bool.booleanValue();
                    C0073l c0073l = c8062l.f38600b;
                    if (zBooleanValue) {
                        ((C8650g) c0073l.f268e).m15971d(null);
                        return ((C8656m) this.f5668b).m15986m(c8062l.f38603e.f40063a, new C7622f(this));
                    }
                    c0073l.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                Log.isLoggable("FirebaseCrashlytics", 2);
                Iterator it = C0979e.m2769x(((File) c8062l.f38605g.f5804c).listFiles(C8062l.f38597r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                C0979e c0979e = ((C0977c) c8062l.f38611m.f5803b).f5797b;
                C0977c.m2755a(C0979e.m2769x(((File) c0979e.f5806e).listFiles()));
                C0977c.m2755a(C0979e.m2769x(((File) c0979e.f5807f).listFiles()));
                C0977c.m2755a(C0979e.m2769x(((File) c0979e.f5808g).listFiles()));
                c8062l.f38615q.m15971d(null);
                return l8.m11765f(null);
        }
    }

    /* renamed from: q */
    public void mo2707q(a0 a0Var) {
        this.f5669c = a0Var;
        View viewFindViewById = ((MainActivity) this.f5668b).findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8868a(this, viewFindViewById, 0));
    }

    /* renamed from: r */
    public void m2708r(Resources.Theme theme, TypedValue typedValue) {
        int i10;
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i10 = typedValue.resourceId) == 0) {
            return;
        }
        ((MainActivity) this.f5668b).setTheme(i10);
    }

    /* renamed from: s */
    public void m2709s(f0 f0Var, C0812e c0812e) {
        C0811d c0811d;
        if (c0812e == null || c0812e.f5074a != 8) {
            switch (j0.f36608a[f0Var.ordinal()]) {
                case 1:
                    o0 o0Var = (o0) this.f5668b;
                    synchronized (o0Var.f16543b) {
                        Iterator it = o0Var.f16546e.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c0811d = new C0811d(EnumC0826s.PENDING_OPEN, null);
                            } else if (((i0.n0) ((Map.Entry) it.next()).getValue()).f16538a == f0.CLOSING) {
                                c0811d = new C0811d(EnumC0826s.OPENING, null);
                            }
                        }
                    }
                    break;
                case 2:
                    c0811d = new C0811d(EnumC0826s.OPENING, c0812e);
                    break;
                case 3:
                case 4:
                    c0811d = new C0811d(EnumC0826s.OPEN, c0812e);
                    break;
                case 5:
                case 6:
                    c0811d = new C0811d(EnumC0826s.CLOSING, c0812e);
                    break;
                case 7:
                case 8:
                    c0811d = new C0811d(EnumC0826s.CLOSED, c0812e);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + f0Var);
            }
        } else {
            c0811d = new C0811d(EnumC0826s.CLOSED, c0812e);
        }
        c0811d.toString();
        Objects.toString(f0Var);
        Objects.toString(c0812e);
        u1.m10942a("CameraStateMachine");
        if (Objects.equals((C0811d) ((d7.g0) this.f5669c).mo5314d(), c0811d)) {
            return;
        }
        c0811d.toString();
        u1.m10942a("CameraStateMachine");
        ((d7.g0) this.f5669c).m5319i(c0811d);
    }

    public /* synthetic */ C0927v(int i10, Object obj, Object obj2, boolean z6) {
        this.f5667a = i10;
        this.f5668b = obj;
        this.f5669c = obj2;
    }

    public /* synthetic */ C0927v(int i10, boolean z6) {
        this.f5667a = i10;
    }

    public C0927v(C8418z appPreferenceRepository, q4 sessionConfigurationRepository) {
        this.f5667a = 20;
        AbstractC4154l.m8923f(appPreferenceRepository, "appPreferenceRepository");
        AbstractC4154l.m8923f(sessionConfigurationRepository, "sessionConfigurationRepository");
        this.f5668b = appPreferenceRepository;
        this.f5669c = sessionConfigurationRepository;
    }

    public C0927v(WorkDatabase_Impl workDatabase_Impl) {
        this.f5667a = 0;
        this.f5668b = workDatabase_Impl;
        this.f5669c = new C0907b(workDatabase_Impl, 6);
        new C0913h(workDatabase_Impl, 20);
    }

    public C0927v(o0 o0Var) {
        this.f5667a = 17;
        this.f5668b = o0Var;
        d7.g0 g0Var = new d7.g0();
        this.f5669c = g0Var;
        g0Var.m5319i(new C0811d(EnumC0826s.CLOSED, null));
    }

    public C0927v(C4327p c4327p) {
        this.f5667a = 15;
        this.f5668b = c4327p;
    }

    public C0927v(int i10) {
        this.f5667a = i10;
        switch (i10) {
            case 6:
                this.f5668b = new C0689a(22);
                this.f5669c = new C1917s(16);
                break;
            case 9:
                this.f5668b = (ImageCaptureFailedForSpecificCombinationQuirk) AbstractC4940a.f24615a.m5729g(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.f5669c = (PreviewGreenTintQuirk) AbstractC4940a.f24615a.m5729g(PreviewGreenTintQuirk.class);
                break;
            case 13:
                C5905e c5905e = C5905e.f28746d;
                this.f5668b = new SparseIntArray();
                this.f5669c = c5905e;
                break;
            case 18:
                this.f5668b = new C4640e(new g0[16]);
                break;
            default:
                this.f5668b = new d7.g0();
                this.f5669c = new HashMap();
                break;
        }
    }

    public C0927v(int i10, C0869g c0869g) {
        this.f5667a = 21;
        this.f5668b = c0869g;
        String str = "start";
        if (i10 != -2) {
            if (i10 == -1) {
                str = "end";
            } else if (i10 == 0) {
                str = "left";
            } else if (i10 == 1) {
                str = "right";
            }
        }
        this.f5669c = str;
    }

    public C0927v(ArrayList arrayList, ArrayList arrayList2) {
        this.f5667a = 14;
        int size = arrayList.size();
        this.f5668b = new int[size];
        this.f5669c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f5668b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f5669c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public C0927v(int i10, int i11) {
        this.f5667a = 14;
        this.f5668b = new int[]{i10, i11};
        this.f5669c = new float[]{DefinitionKt.NO_Float_VALUE, 1.0f};
    }

    public C0927v(MainActivity mainActivity) {
        this.f5667a = 23;
        this.f5668b = mainActivity;
        this.f5669c = new C7892j(18);
    }

    public C0927v(int i10, int i11, int i12) {
        this.f5667a = 14;
        this.f5668b = new int[]{i10, i11, i12};
        this.f5669c = new float[]{DefinitionKt.NO_Float_VALUE, 0.5f, 1.0f};
    }
}
