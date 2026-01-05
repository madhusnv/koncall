package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.call.observer.FileRecordingObserver;
import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.event.PreferenceChangeEvent;
import ai.salesmax.model.event.PreferenceChangeEventListener;
import ai.salesmax.util.Prefs;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.p69;

/* loaded from: classes.dex */
public final class ife implements PreferenceChangeEventListener {

    /* renamed from: f */
    public static final C14278a f28606f = new C14278a(null);

    /* renamed from: g */
    public static final int f28607g = 8;

    /* renamed from: h */
    public static ife f28608h = new ife();

    /* renamed from: i */
    public static final jg2 f28609i = tg2.m49824b(50, null, null, 6, null);

    /* renamed from: j */
    public static h84 f28610j = p74.f39487a.m43082j();

    /* renamed from: k */
    public static final yu1 f28611k = yu1.f56041h.m58316a();

    /* renamed from: b */
    public volatile m0f f28613b;

    /* renamed from: c */
    public volatile FileRecordingObserver f28614c;

    /* renamed from: e */
    public p69 f28616e;

    /* renamed from: a */
    public final tu1 f28612a = tu1.f47778e.m50641a();

    /* renamed from: d */
    public final AtomicBoolean f28615d = new AtomicBoolean(false);

    /* renamed from: o.ife$a */
    public static final class C14278a {
        public C14278a() {
        }

        public /* synthetic */ C14278a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ife m32075a() {
            return ife.f28608h;
        }
    }

    /* renamed from: o.ife$b */
    public static final class C14279b extends jgg implements nl7 {

        /* renamed from: a */
        public int f28617a;

        /* renamed from: b */
        public final /* synthetic */ rz1 f28618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14279b(rz1 rz1Var, n64 n64Var) {
            super(2, n64Var);
            this.f28618b = rz1Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14279b(this.f28618b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f28617a;
            if (i == 0) {
                wre.m54934b(obj);
                jg2 jg2Var = ife.f28609i;
                rz1 rz1Var = this.f28618b;
                this.f28617a = 1;
                if (jg2Var.mo23475l(rz1Var, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14279b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.ife$c */
    public static final class C14280c extends jgg implements nl7 {

        /* renamed from: a */
        public long f28619a;

        /* renamed from: b */
        public int f28620b;

        /* renamed from: c */
        public /* synthetic */ Object f28621c;

        public C14280c(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14280c c14280c = ife.this.new C14280c(n64Var);
            c14280c.f28621c = obj;
            return c14280c;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007b -> B:17:0x004a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b1 -> B:35:0x00b5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cc -> B:17:0x004a). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            h84 h84Var;
            long jM18605h;
            C14280c c14280c;
            Throwable th;
            long j;
            h84 h84Var2;
            Object obj2;
            C14280c c14280c2;
            CancellationException e;
            Object objM51918f = uq8.m51918f();
            int i = this.f28620b;
            if (i == 0) {
                wre.m54934b(obj);
                h84Var = (h84) this.f28621c;
                jM18605h = 1000;
                c14280c = this;
                if (!i84.m31713g(h84Var)) {
                }
            } else if (i == 1) {
                long j2 = this.f28619a;
                h84 h84Var3 = (h84) this.f28621c;
                try {
                    wre.m54934b(obj);
                    j = j2;
                    h84Var2 = h84Var3;
                    obj2 = objM51918f;
                    c14280c2 = this;
                } catch (CancellationException e2) {
                    e = e2;
                    j = j2;
                    h84Var2 = h84Var3;
                    obj2 = objM51918f;
                    c14280c2 = this;
                    if (!i84.m31713g(h84Var2)) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = j2;
                    h84Var2 = h84Var3;
                    obj2 = objM51918f;
                    c14280c2 = this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Recording consumer crashed – restart in ");
                    sb.append(j);
                    sb.append(" ms");
                    FirebaseCrashlytics.getInstance().recordException(th);
                    c14280c2.f28621c = h84Var2;
                    c14280c2.f28619a = j;
                    c14280c2.f28620b = 2;
                    if (nk5.m40720b(j, c14280c2) == obj2) {
                    }
                }
                rz1 rz1Var = (rz1) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Consumed event: ");
                sb2.append(rz1Var);
                ife.this.m32069h(rz1Var);
                c14280c = c14280c2;
                objM51918f = obj2;
                h84Var = h84Var2;
                jM18605h = 1000;
                if (!i84.m31713g(h84Var)) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = this.f28619a;
                h84Var = (h84) this.f28621c;
                wre.m54934b(obj);
                c14280c = this;
                jM18605h = bce.m18605h(j3 * 2, 60000L);
                if (!i84.m31713g(h84Var)) {
                    try {
                    } catch (CancellationException e3) {
                        Object obj3 = objM51918f;
                        c14280c2 = c14280c;
                        e = e3;
                        j = jM18605h;
                        h84Var2 = h84Var;
                        obj2 = obj3;
                        if (!i84.m31713g(h84Var2)) {
                        }
                    } catch (Throwable th3) {
                        Object obj4 = objM51918f;
                        c14280c2 = c14280c;
                        th = th3;
                        j = jM18605h;
                        h84Var2 = h84Var;
                        obj2 = obj4;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Recording consumer crashed – restart in ");
                        sb3.append(j);
                        sb3.append(" ms");
                        FirebaseCrashlytics.getInstance().recordException(th);
                        c14280c2.f28621c = h84Var2;
                        c14280c2.f28619a = j;
                        c14280c2.f28620b = 2;
                        if (nk5.m40720b(j, c14280c2) == obj2) {
                        }
                    }
                    jg2 jg2Var = ife.f28609i;
                    c14280c.f28621c = h84Var;
                    c14280c.f28619a = jM18605h;
                    c14280c.f28620b = 1;
                    Object objMo23476m = jg2Var.mo23476m(c14280c);
                    if (objMo23476m == objM51918f) {
                        return objM51918f;
                    }
                    Object obj5 = objM51918f;
                    c14280c2 = c14280c;
                    obj = objMo23476m;
                    j = jM18605h;
                    h84Var2 = h84Var;
                    obj2 = obj5;
                    try {
                    } catch (CancellationException e4) {
                        e = e4;
                        if (!i84.m31713g(h84Var2)) {
                            throw e;
                        }
                        c14280c = c14280c2;
                        objM51918f = obj2;
                        h84Var = h84Var2;
                        jM18605h = j;
                        if (!i84.m31713g(h84Var)) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append("Recording consumer crashed – restart in ");
                        sb32.append(j);
                        sb32.append(" ms");
                        FirebaseCrashlytics.getInstance().recordException(th);
                        c14280c2.f28621c = h84Var2;
                        c14280c2.f28619a = j;
                        c14280c2.f28620b = 2;
                        if (nk5.m40720b(j, c14280c2) == obj2) {
                            return obj2;
                        }
                        c14280c = c14280c2;
                        objM51918f = obj2;
                        h84Var = h84Var2;
                        j3 = j;
                        jM18605h = bce.m18605h(j3 * 2, 60000L);
                        if (!i84.m31713g(h84Var)) {
                        }
                    }
                    rz1 rz1Var2 = (rz1) obj;
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("Consumed event: ");
                    sb22.append(rz1Var2);
                    ife.this.m32069h(rz1Var2);
                    c14280c = c14280c2;
                    objM51918f = obj2;
                    h84Var = h84Var2;
                    jM18605h = 1000;
                    if (!i84.m31713g(h84Var)) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14280c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    static {
        f28608h.m32066e();
    }

    /* renamed from: k */
    public static /* synthetic */ void m32064k(ife ifeVar, Context context, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            uri = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        ifeVar.m32071j(context, uri, str);
    }

    /* renamed from: d */
    public final void m32065d(rz1 rz1Var) {
        sq8.m48649h(rz1Var, "callRecording");
        rm1.m46952d(f28610j, null, null, new C14279b(rz1Var, null), 3, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Received event: ");
        sb.append(rz1Var);
    }

    /* renamed from: e */
    public final void m32066e() {
        h84 h84VarM32067f = m32067f();
        p69 p69Var = this.f28616e;
        boolean z = false;
        if (p69Var != null && p69Var.mo22428a()) {
            z = true;
        }
        if (z) {
            return;
        }
        this.f28616e = rm1.m46952d(h84VarM32067f, null, null, new C14280c(null), 3, null);
    }

    /* renamed from: f */
    public final synchronized h84 m32067f() {
        if (!i84.m31713g(f28610j)) {
            p69 p69Var = this.f28616e;
            if (p69Var != null) {
                p69.C15966a.m42999a(p69Var, null, 1, null);
            }
            this.f28616e = null;
            f28610j = p74.f39487a.m43082j();
        }
        return f28610j;
    }

    /* renamed from: g */
    public final void m32068g(Context context, Prefs prefs) {
        sq8.m48649h(context, "context");
        if (prefs != null && prefs.m3251m() && ((prefs.m3252n() != null || prefs.m3253o() != null) && !this.f28615d.get())) {
            m32071j(context, prefs.m3252n(), prefs.m3253o());
        }
        m32066e();
    }

    /* renamed from: h */
    public final void m32069h(rz1 rz1Var) {
        CallEngagement callEngagementM58315z = f28611k.m58315z(rz1Var);
        tu1 tu1Var = this.f28612a;
        Context contextM47303a = rz1Var.m47303a();
        sq8.m48646e(contextM47303a);
        tu1Var.u0(contextM47303a, callEngagementM58315z);
    }

    /* renamed from: i */
    public final void m32070i(Context context) {
        m0f m0fVar;
        FileRecordingObserver fileRecordingObserver = this.f28614c;
        if (fileRecordingObserver != null) {
            fileRecordingObserver.startWatching();
            this.f28615d.set(true);
        }
        if (Build.VERSION.SDK_INT < 30 || (m0fVar = this.f28613b) == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, true, m0fVar);
        this.f28615d.set(true);
    }

    /* renamed from: j */
    public final synchronized void m32071j(Context context, Uri uri, String str) {
        y3i y3iVar;
        if (n3d.f36317a.m40047e(context)) {
            y3i y3iVar2 = null;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Going to register file observer for recording with location ");
                sb.append(str);
                sb.append(" and path: ");
                sb.append(uri);
                if (this.f28614c != null) {
                    m32074n(context);
                }
                this.f28614c = FileRecordingObserver.f258e.m147b(context, str, uri);
                m32070i(context);
                y3iVar = y3i.f54824a;
            } else {
                y3iVar = null;
            }
            if (y3iVar == null) {
                m32074n(context);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                if (uri != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Going to register content observer for recording with location ");
                    sb2.append(uri);
                    this.f28613b = new m0f(new Handler(Looper.getMainLooper()), context, uri, str);
                    m32070i(context);
                    y3iVar2 = y3i.f54824a;
                }
                if (y3iVar2 == null) {
                    m32074n(context);
                }
            }
        } else {
            m32074n(context);
        }
    }

    /* renamed from: l */
    public final void m32072l(Context context, Prefs prefs) {
        sq8.m48649h(context, "context");
        m32068g(context, prefs);
    }

    /* renamed from: m */
    public final void m32073m(Context context) {
        sq8.m48649h(context, "context");
        m32074n(context);
        p69 p69Var = this.f28616e;
        if (p69Var != null) {
            p69.C15966a.m42999a(p69Var, null, 1, null);
        }
        this.f28616e = null;
        i84.m31710d(f28610j, null, 1, null);
        f28610j = p74.f39487a.m43082j();
    }

    /* renamed from: n */
    public final void m32074n(Context context) {
        m0f m0fVar;
        FileRecordingObserver fileRecordingObserver = this.f28614c;
        if (fileRecordingObserver != null) {
            fileRecordingObserver.stopWatching();
            FileRecordingObserver.f258e.m146a();
            this.f28615d.set(false);
        }
        if (Build.VERSION.SDK_INT < 30 || (m0fVar = this.f28613b) == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(m0fVar);
        this.f28615d.set(false);
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(PreferenceChangeEvent preferenceChangeEvent) {
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(Context context, PreferenceChangeEvent preferenceChangeEvent) {
        sq8.m48649h(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("received event for preference change in recording manager: ");
        sb.append(preferenceChangeEvent);
        if (preferenceChangeEvent != null) {
            if (preferenceChangeEvent.getEventType() == PreferenceChangeEvent.EventType.PREF_CALL_RECORDING_SYNC) {
                if (!mri.f35877a.m39583a(preferenceChangeEvent.getPrefValue())) {
                    m32074n(context);
                    return;
                }
                if (Build.VERSION.SDK_INT < 30) {
                    Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
                    m32064k(this, context, null, prefsM127c != null ? prefsM127c.m3253o() : null, 2, null);
                    return;
                }
                SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
                Prefs prefsM127c2 = c0044a.m127c();
                Uri uriM3252n = prefsM127c2 != null ? prefsM127c2.m3252n() : null;
                Prefs prefsM127c3 = c0044a.m127c();
                m32071j(context, uriM3252n, prefsM127c3 != null ? prefsM127c3.m3253o() : null);
                return;
            }
            if (preferenceChangeEvent.getEventType() == PreferenceChangeEvent.EventType.PREF_CALL_RECORDING_STORAGE) {
                String strM39585c = mri.f35877a.m39585c(preferenceChangeEvent.getPrefValue());
                if (strM39585c == null) {
                    m32074n(context);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Prefs prefsM127c4 = SuperfoneApplication.f225c.m127c();
                        m32071j(context, prefsM127c4 != null ? prefsM127c4.m3252n() : null, strM39585c);
                        return;
                    }
                    return;
                }
            }
            if (preferenceChangeEvent.getEventType() == PreferenceChangeEvent.EventType.PREF_CALL_RECORDING_ROOT_URI) {
                Uri uriM39586d = mri.f35877a.m39586d(preferenceChangeEvent.getPrefValue());
                if (uriM39586d == null) {
                    m32074n(context);
                } else {
                    Prefs prefsM127c5 = SuperfoneApplication.f225c.m127c();
                    m32071j(context, uriM39586d, prefsM127c5 != null ? prefsM127c5.m3253o() : null);
                }
            }
        }
    }
}
