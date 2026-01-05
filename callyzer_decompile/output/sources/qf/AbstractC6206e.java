package qf;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.credentials.playservices.HiddenActivity;
import c9.C0910e;
import com.google.android.gms.internal.measurement.h0;
import e1.C1904f;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import l4.C4367l;
import ng.C5070u;
import pf.C5905e;
import rf.C6496a;
import rf.C6500e;
import rf.C6513r;
import rf.DialogInterfaceOnCancelListenerC6508m;
import rf.e0;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qf.e */
/* loaded from: classes.dex */
public abstract class AbstractC6206e {

    /* renamed from: a */
    public final Context f30187a;

    /* renamed from: b */
    public final String f30188b;

    /* renamed from: c */
    public final C0910e f30189c;

    /* renamed from: d */
    public final InterfaceC6203b f30190d;

    /* renamed from: e */
    public final C6496a f30191e;

    /* renamed from: f */
    public final Looper f30192f;

    /* renamed from: g */
    public final int f30193g;

    /* renamed from: h */
    public final C6513r f30194h;

    /* renamed from: i */
    public final C5070u f30195i;

    /* renamed from: j */
    public final C6500e f30196j;

    public AbstractC6206e(Context context, HiddenActivity hiddenActivity, C0910e c0910e, InterfaceC6203b interfaceC6203b, C6205d c6205d) {
        e0 e0Var;
        AbstractC6840z.m13037h(context, "Null context is not permitted.");
        AbstractC6840z.m13037h(c0910e, "Api must not be null.");
        AbstractC6840z.m13037h(c6205d, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC6840z.m13037h(applicationContext, "The provided context did not have an application context.");
        this.f30187a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f30188b = attributionTag;
        this.f30189c = c0910e;
        this.f30190d = interfaceC6203b;
        this.f30192f = c6205d.f30186b;
        C6496a c6496a = new C6496a(c0910e, interfaceC6203b, attributionTag);
        this.f30191e = c6496a;
        this.f30194h = new C6513r(this);
        C6500e c6500eM12515g = C6500e.m12515g(applicationContext);
        this.f30196j = c6500eM12515g;
        this.f30193g = c6500eM12515g.f31230h.getAndIncrement();
        this.f30195i = c6205d.f30185a;
        if (hiddenActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            WeakHashMap weakHashMap = e0.f31238b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(hiddenActivity);
            if (weakReference == null || (e0Var = (e0) weakReference.get()) == null) {
                try {
                    e0Var = (e0) hiddenActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (e0Var == null || e0Var.isRemoving()) {
                        e0Var = new e0();
                        hiddenActivity.getFragmentManager().beginTransaction().add(e0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(hiddenActivity, new WeakReference(e0Var));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            DialogInterfaceOnCancelListenerC6508m dialogInterfaceOnCancelListenerC6508mMo12522b = e0Var.mo12522b();
            if (dialogInterfaceOnCancelListenerC6508mMo12522b == null) {
                Object obj = C5905e.f28745c;
                dialogInterfaceOnCancelListenerC6508mMo12522b = new DialogInterfaceOnCancelListenerC6508m(e0Var, c6500eM12515g);
            }
            dialogInterfaceOnCancelListenerC6508mMo12522b.f31250f.add(c6496a);
            c6500eM12515g.m12516b(dialogInterfaceOnCancelListenerC6508mMo12522b);
        }
        h0 h0Var = c6500eM12515g.f31236p;
        h0Var.sendMessage(h0Var.obtainMessage(7, this));
    }

    /* renamed from: a */
    public final C4367l m12222a() {
        C4367l c4367l = new C4367l(25, false);
        Set set = Collections.EMPTY_SET;
        if (((C1904f) c4367l.f21921b) == null) {
            c4367l.f21921b = new C1904f(0);
        }
        ((C1904f) c4367l.f21921b).addAll(set);
        Context context = this.f30187a;
        c4367l.f21923d = context.getClass().getName();
        c4367l.f21922c = context.getPackageName();
        return c4367l;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yg.C8656m m12223b(int r14, hd.C2893e r15) {
        /*
            r13 = this;
            yg.g r0 = new yg.g
            r0.<init>()
            ng.u r1 = r13.f30195i
            rf.e r3 = r13.f30196j
            r3.getClass()
            int r4 = r15.f15923b
            if (r4 == 0) goto L82
            rf.a r5 = r13.f30191e
            boolean r2 = r3.m12517c()
            if (r2 != 0) goto L19
            goto L56
        L19:
            sf.l r2 = sf.C6826l.m13020b()
            java.lang.Object r2 = r2.f32467a
            sf.m r2 = (sf.C6827m) r2
            r6 = 1
            if (r2 == 0) goto L58
            boolean r7 = r2.f32470b
            if (r7 == 0) goto L56
            boolean r2 = r2.f32471c
            java.util.concurrent.ConcurrentHashMap r7 = r3.f31232k
            java.lang.Object r7 = r7.get(r5)
            rf.p r7 = (rf.C6511p) r7
            if (r7 == 0) goto L54
            qf.c r8 = r7.f31256f
            boolean r9 = r8 instanceof sf.AbstractC6819e
            if (r9 == 0) goto L56
            sf.e r8 = (sf.AbstractC6819e) r8
            sf.f0 r9 = r8.f32401y
            if (r9 == 0) goto L54
            boolean r9 = r8.m12997c()
            if (r9 != 0) goto L54
            sf.f r2 = rf.C6516u.m12545a(r7, r8, r4)
            if (r2 == 0) goto L56
            int r8 = r7.f31266p
            int r8 = r8 + r6
            r7.f31266p = r8
            boolean r6 = r2.f32406c
            goto L58
        L54:
            r6 = r2
            goto L58
        L56:
            r2 = 0
            goto L70
        L58:
            rf.u r2 = new rf.u
            r7 = 0
            if (r6 == 0) goto L63
            long r9 = java.lang.System.currentTimeMillis()
            goto L64
        L63:
            r9 = r7
        L64:
            if (r6 == 0) goto L6a
            long r7 = android.os.SystemClock.elapsedRealtime()
        L6a:
            r11 = r9
            r8 = r7
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r8)
        L70:
            if (r2 == 0) goto L82
            yg.m r4 = r0.f41930a
            com.google.android.gms.internal.measurement.h0 r5 = r3.f31236p
            r5.getClass()
            rf.n r6 = new rf.n
            r7 = 0
            r6.<init>(r5, r7)
            r4.m15975b(r6, r2)
        L82:
            rf.a0 r2 = new rf.a0
            r2.<init>(r14, r15, r0, r1)
            java.util.concurrent.atomic.AtomicInteger r14 = r3.f31231j
            rf.w r15 = new rf.w
            int r14 = r14.get()
            r15.<init>(r2, r14, r13)
            com.google.android.gms.internal.measurement.h0 r14 = r3.f31236p
            r1 = 4
            android.os.Message r15 = r14.obtainMessage(r1, r15)
            r14.sendMessage(r15)
            yg.m r14 = r0.f41930a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.AbstractC6206e.m12223b(int, hd.e):yg.m");
    }
}
