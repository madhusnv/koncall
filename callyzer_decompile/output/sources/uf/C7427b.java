package uf;

import al.C0182j;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.room.CallyzerDatabase;
import d3.C1555i;
import d3.c0;
import d3.h0;
import d3.l0;
import g4.C2492h;
import i0.v0;
import io.C3328c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jg.AbstractC3762a;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import l0.InterfaceC4303c;
import l4.i0;
import l4.k0;
import nx.AbstractC5178p;
import og.lg;
import og.u1;
import p020v.b0;
import p020v.g1;
import p020v.o0;
import p020v.x0;
import p023y.AbstractC8523a;
import pg.l8;
import rf.InterfaceC6505j;
import s3.AbstractC6744a;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import sf.C6828n;
import ug.a0;
import ug.h4;
import ug.w0;
import v3.AbstractC7634f;
import v3.b2;
import wi.AbstractC8074x;
import wi.C8062l;
import wi.CallableC8060j;
import xi.ExecutorC8384b;
import y7.c1;
import y7.f0;
import y7.g0;
import yg.C8650g;
import yg.C8656m;
import yg.InterfaceC8644a;
import zd.C8937a;
import zd.C8938b;
import zd.C8940d;
import zd.C8942f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uf.b */
/* loaded from: classes.dex */
public /* synthetic */ class C7427b implements InterfaceC6505j, w0, k0, InterfaceC4303c, l0, c1, InterfaceC8644a {

    /* renamed from: a */
    public final /* synthetic */ int f35230a;

    /* renamed from: b */
    public final Object f35231b;

    public /* synthetic */ C7427b(int i10, Object obj) {
        this.f35230a = i10;
        this.f35231b = obj;
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        switch (this.f35230a) {
            case 4:
                synchronized (((o0) this.f35231b).f36644a) {
                    try {
                        ((o0) this.f35231b).f36647d.m14385p();
                        int iOrdinal = ((o0) this.f35231b).f36653j.ordinal();
                        if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                            Objects.toString(((o0) this.f35231b).f36653j);
                            u1.m10952k("CaptureSession");
                            ((o0) this.f35231b).m14411e();
                        }
                    } finally {
                    }
                }
                return;
            default:
                g1 g1Var = (g1) this.f35231b;
                synchronized (g1Var.f36544a) {
                    try {
                        List list = g1Var.f36554k;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((v0) it.next()).m7417b();
                            }
                            g1Var.f36554k = null;
                        }
                    } finally {
                    }
                }
                g1Var.f36564u.m177p();
                x0 x0Var = g1Var.f36545b;
                x0Var.m14487q(g1Var);
                synchronized (x0Var.f36755c) {
                    ((LinkedHashSet) x0Var.f36758f).remove(g1Var);
                }
                return;
        }
    }

    @Override // ug.w0
    /* renamed from: a */
    public /* synthetic */ void mo13809a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        ((h4) this.f35231b).m13946A(str, i10, th2, bArr, map);
    }

    @Override // rf.InterfaceC6505j
    public void accept(Object obj, Object obj2) {
        C8650g c8650g = (C8650g) obj2;
        C7426a c7426a = (C7426a) ((C7429d) obj).m13009t();
        C6828n c6828n = (C6828n) this.f35231b;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c7426a.f6441g);
        AbstractC3762a.m8287c(parcelObtain, c6828n);
        try {
            c7426a.f6440f.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            c8650g.m15969b(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // y7.c1
    /* renamed from: b */
    public int mo13810b(View view) {
        return (view.getLeft() - ((g0) view.getLayoutParams()).f41640b.left) - ((ViewGroup.MarginLayoutParams) ((g0) view.getLayoutParams())).leftMargin;
    }

    /* renamed from: c */
    public void m13811c(v3.g0 g0Var) {
        if (!g0Var.m14578H()) {
            AbstractC6744a.m12907b("DepthSortedSet.add called on an unattached node");
        }
        ((b2) this.f35231b).add(g0Var);
    }

    @Override // y7.c1
    /* renamed from: d */
    public int mo13812d() {
        return ((f0) this.f35231b).m15850A();
    }

    /* renamed from: e */
    public C8942f m13813e() {
        C8938b c8938bM16419n;
        C0182j c0182j = (C0182j) this.f35231b;
        C8940d c8940d = (C8940d) c0182j.f557d;
        synchronized (c8940d) {
            c0182j.m412c(true);
            c8938bM16419n = c8940d.m16419n(((C8937a) c0182j.f555b).f42913a);
        }
        if (c8938bM16419n != null) {
            return new C8942f(c8938bM16419n);
        }
        return null;
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo20f(C8656m c8656m) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.f35231b);
        return l8.m11765f(arrayList);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public /* bridge */ /* synthetic */ void mo65g(Object obj) {
        switch (this.f35230a) {
            case 4:
                break;
            default:
                break;
        }
    }

    /* renamed from: h */
    public int m13814h() {
        return ((CallyzerDatabase) ((ug.g1) this.f35231b).f35448a).m16392k().mo9272K().getVersion();
    }

    @Override // d3.l0
    /* renamed from: i */
    public h0 mo399i(long j6, EnumC6757m enumC6757m, InterfaceC6747c interfaceC6747c) {
        return new c0((C1555i) this.f35231b);
    }

    @Override // y7.c1
    /* renamed from: j */
    public int mo13815j() {
        f0 f0Var = (f0) this.f35231b;
        return f0Var.f41632n - f0Var.m15851B();
    }

    /* renamed from: k */
    public void m13816k(int i10, Object obj) {
        if (i10 == 6 || i10 == 7 || i10 == 8) {
        }
        ((ProfileInstallReceiver) this.f35231b).setResultCode(i10);
    }

    @Override // y7.c1
    /* renamed from: l */
    public View mo13817l(int i10) {
        return ((f0) this.f35231b).m15857u(i10);
    }

    @Override // y7.c1
    /* renamed from: m */
    public int mo13818m(View view) {
        return view.getRight() + ((g0) view.getLayoutParams()).f41640b.right + ((ViewGroup.MarginLayoutParams) ((g0) view.getLayoutParams())).rightMargin;
    }

    /* renamed from: n */
    public void m13819n(C3328c c3328c, Thread thread, Throwable th2) {
        C8656m c8656mM15981h;
        C8062l c8062l = (C8062l) this.f35231b;
        synchronized (c8062l) {
            Objects.toString(th2);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            lg.m10753b();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ExecutorC8384b executorC8384b = c8062l.f38603e.f40063a;
            CallableC8060j callableC8060j = new CallableC8060j(c8062l, jCurrentTimeMillis, th2, thread, c3328c);
            synchronized (executorC8384b.f40060b) {
                c8656mM15981h = executorC8384b.f40061c.m15981h(executorC8384b.f40059a, new b0(10, callableC8060j));
                executorC8384b.f40061c = c8656mM15981h;
            }
            try {
                AbstractC8074x.m15214a(c8656mM15981h);
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    /* renamed from: o */
    public boolean m13820o(v3.g0 g0Var) {
        if (!g0Var.m14578H()) {
            AbstractC6744a.m12907b("DepthSortedSet.remove called on an unattached node");
        }
        return ((b2) this.f35231b).remove(g0Var);
    }

    /* renamed from: p */
    public void m13821p(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f35231b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            RecyclerView.m1313H(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public String toString() {
        switch (this.f35230a) {
            case 6:
                return ((b2) this.f35231b).toString();
            default:
                return super.toString();
        }
    }

    @Override // l4.k0
    /* renamed from: y */
    public i0 mo6334y(C2492h text) {
        AbstractC4154l.m8923f(text, "text");
        Pattern patternCompile = Pattern.compile("-");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(text);
        String strM4561h = "";
        String strReplaceAll = matcher.replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        if (strReplaceAll.length() >= 11) {
            strReplaceAll = AbstractC5178p.m10114Y(strReplaceAll, new C4266h(0, 10, 1));
        }
        int length = strReplaceAll.length();
        for (int i10 = 0; i10 < length; i10++) {
            strM4561h = strM4561h + strReplaceAll.charAt(i10);
            if (i10 == 2 || i10 == 6) {
                strM4561h = AbstractC1452a.m4561h(strM4561h, "-");
            }
        }
        return new i0(new C2492h(strM4561h), (a0) this.f35231b);
    }

    public C7427b(int i10) {
        this.f35230a = i10;
        switch (i10) {
            case 6:
                this.f35231b = new b2(AbstractC7634f.f36811b);
                break;
            case 17:
                this.f35231b = (ExtraCroppingQuirk) AbstractC8523a.f41447a.m5729g(ExtraCroppingQuirk.class);
                break;
            default:
                this.f35231b = new a0(18);
                break;
        }
    }

    public C7427b(Context context) {
        boolean zIsEmpty;
        this.f35230a = 10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f35231b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e2.getMessage();
            }
        }
    }
}
