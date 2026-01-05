package a1;

import a9.C0073l;
import android.os.Process;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b0.C0512d;
import c0.b1;
import c0.e1;
import c0.k1;
import c0.q0;
import com.amplifyframework.storage.s3.operation.AWSS3StorageGetPresignedUrlOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageListOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathGetPresignedUrlOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathListOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathRemoveOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageRemoveOperation;
import ef.C2049i;
import f2.C2186i;
import ff.InterfaceC2283b;
import h0.C2764d;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import m2.C4640e;
import org.bouncycastle.iana.AEADAlgorithm;
import p004e.DialogC1879n;
import p004e.ViewTreeObserverOnDrawListenerC1875j;
import p020v.C7608r;
import p020v.C7612v;
import p020v.EnumC7610t;
import q0.C6062c;
import q0.C6069j;
import q0.C6070k;
import q0.C6072m;
import r0.C6414e;
import ug.g1;
import wj.C8090p;
import x4.C8299i;
import x4.C8302l;
import zj.C8986c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.w */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0024w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f94a;

    /* renamed from: b */
    public final /* synthetic */ Object f95b;

    public /* synthetic */ RunnableC0024w(int i10, Object obj) {
        this.f94a = i10;
        this.f95b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, qw.g] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        switch (this.f94a) {
            case 0:
                ((C0013l) this.f95b).m97c();
                return;
            case 1:
                C0512d c0512d = (C0512d) this.f95b;
                C8299i c8299i = (C8299i) c0512d.f3580g;
                if (c8299i != null) {
                    c8299i.m15507b(null);
                    c0512d.f3580g = null;
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) this.f95b;
                Process.setThreadPriority(-3);
                runnable.run();
                return;
            case 3:
                q0 q0Var = (q0) this.f95b;
                synchronized (q0Var.f5198z) {
                    try {
                        q0Var.f5196C = null;
                        b1 b1Var = q0Var.f5195B;
                        if (b1Var != null) {
                            q0Var.f5195B = null;
                            q0Var.mo2215f(b1Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 4:
                ((k1) this.f95b).m2165p();
                return;
            case 5:
                View view = (View) this.f95b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 6:
                ((AWSS3StorageGetPresignedUrlOperation) this.f95b).lambda$start$1();
                return;
            case 7:
                ((AWSS3StorageListOperation) this.f95b).lambda$start$1();
                return;
            case 8:
                AWSS3StoragePathGetPresignedUrlOperation.start$lambda$0((AWSS3StoragePathGetPresignedUrlOperation) this.f95b);
                return;
            case 9:
                AWSS3StoragePathListOperation.start$lambda$0((AWSS3StoragePathListOperation) this.f95b);
                return;
            case 10:
                AWSS3StoragePathRemoveOperation.start$lambda$0((AWSS3StoragePathRemoveOperation) this.f95b);
                return;
            case 11:
                ((AWSS3StorageRemoveOperation) this.f95b).lambda$start$1();
                return;
            case 12:
                C8090p c8090p = (C8090p) this.f95b;
                ((C2049i) ((InterfaceC2283b) c8090p.f38726d)).m5776z(new c0(9, c8090p));
                return;
            case 13:
                ViewTreeObserverOnDrawListenerC1875j viewTreeObserverOnDrawListenerC1875j = (ViewTreeObserverOnDrawListenerC1875j) this.f95b;
                Runnable runnable2 = viewTreeObserverOnDrawListenerC1875j.f8887b;
                if (runnable2 != null) {
                    runnable2.run();
                    viewTreeObserverOnDrawListenerC1875j.f8887b = null;
                    return;
                }
                return;
            case 14:
                DialogC1879n.m5510a((DialogC1879n) this.f95b);
                return;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C2186i.setRippleState$lambda$2((C2186i) this.f95b);
                return;
            case 16:
                ((C0005d) ((e1) this.f95b).f5079b).getClass();
                return;
            case 17:
                ((C2764d) this.f95b).m6756b();
                return;
            case 18:
                C7608r c7608r = (C7608r) this.f95b;
                if (c7608r.f36679c.f36723e == EnumC7610t.PENDING_OPEN || c7608r.f36679c.f36723e == EnumC7610t.OPENING_WITH_ERROR) {
                    c7608r.f36679c.m14447L(false);
                    return;
                }
                return;
            case 19:
                g1 g1Var = (g1) this.f95b;
                if (((C7612v) g1Var.f35448a).f36723e == EnumC7610t.OPENED) {
                    ((C7612v) g1Var.f35448a).m14440E();
                    return;
                }
                return;
            case 20:
                ((C8302l) this.f95b).cancel(true);
                return;
            case 21:
                ((C8299i) this.f95b).m15507b(null);
                return;
            case 22:
                ((ScheduledFuture) this.f95b).cancel(true);
                return;
            case 23:
                l4.e0 e0Var = (l4.e0) this.f95b;
                C4367l c4367l = (C4367l) e0Var.f21887d;
                Boolean bool = null;
                e0Var.f21897n = null;
                C4640e c4640e = (C4640e) e0Var.f21896m;
                View view2 = (View) e0Var.f21886c;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    c4640e.m9511h();
                    return;
                }
                Object[] objArr = c4640e.f22884a;
                int i10 = c4640e.f22886c;
                Boolean boolValueOf = null;
                for (int i11 = 0; i11 < i10; i11++) {
                    l4.b0 b0Var = (l4.b0) objArr[i11];
                    int i12 = l4.c0.f21879a[b0Var.ordinal()];
                    if (i12 == 1) {
                        bool = Boolean.TRUE;
                    } else if (i12 != 2) {
                        if ((i12 == 3 || i12 == 4) && !AbstractC4154l.m8918a(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(b0Var == l4.b0.ShowKeyboard);
                        }
                    } else {
                        bool = Boolean.FALSE;
                    }
                    boolValueOf = bool;
                }
                c4640e.m9511h();
                if (AbstractC4154l.m8918a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c4367l.f21922c.getValue()).restartInput((View) c4367l.f21921b);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((C8986c) ((C8989c) c4367l.f21923d).f43339b).mo2347p();
                    } else {
                        ((C8986c) ((C8989c) c4367l.f21923d).f43339b).mo2346f();
                    }
                }
                if (AbstractC4154l.m8918a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c4367l.f21922c.getValue()).restartInput((View) c4367l.f21921b);
                    return;
                }
                return;
            case 24:
                ((C6070k) this.f95b).close();
                return;
            case 25:
                C6062c c6062c = (C6062c) this.f95b;
                c6062c.f29573j = true;
                c6062c.m12068d();
                return;
            case 26:
                C6072m c6072m = (C6072m) ((C4367l) this.f95b).f21923d;
                if (c6072m != null) {
                    Iterator it = c6072m.values().iterator();
                    while (it.hasNext()) {
                        ((C6069j) it.next()).m12075b();
                    }
                    return;
                }
                return;
            case 27:
                C6414e c6414e = (C6414e) this.f95b;
                c6414e.f30936f = true;
                c6414e.m12421d();
                return;
            case 28:
                C6072m c6072m2 = (C6072m) ((C0073l) this.f95b).f267d;
                if (c6072m2 != null) {
                    Iterator it2 = c6072m2.values().iterator();
                    while (it2.hasNext()) {
                        ((C6069j) it2.next()).m12075b();
                    }
                    return;
                }
                return;
            default:
                tx.e1 e1Var = (tx.e1) this.f95b;
                if (e1Var != null) {
                    e1Var.mo13510j(null);
                    return;
                }
                return;
        }
    }
}
