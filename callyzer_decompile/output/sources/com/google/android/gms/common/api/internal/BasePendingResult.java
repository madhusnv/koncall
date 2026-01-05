package com.google.android.gms.common.api.internal;

import android.os.Looper;
import ci.C0973a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import og.dd;
import qf.AbstractC6209h;
import qf.InterfaceC6211j;
import rf.C6507l;
import rf.C6513r;
import rf.HandlerC6499d;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC6211j> extends dd {

    /* renamed from: k */
    public static final C0973a f6012k = new C0973a(10);

    /* renamed from: f */
    public InterfaceC6211j f6017f;

    /* renamed from: g */
    public Status f6018g;

    /* renamed from: h */
    public volatile boolean f6019h;

    /* renamed from: i */
    public boolean f6020i;

    /* renamed from: b */
    public final Object f6013b = new Object();

    /* renamed from: c */
    public final CountDownLatch f6014c = new CountDownLatch(1);

    /* renamed from: d */
    public final ArrayList f6015d = new ArrayList();

    /* renamed from: e */
    public final AtomicReference f6016e = new AtomicReference();

    /* renamed from: j */
    public boolean f6021j = false;

    public BasePendingResult(AbstractC6209h abstractC6209h) {
        new HandlerC6499d(abstractC6209h != null ? ((C6513r) abstractC6209h).f31270b.f30192f : Looper.getMainLooper(), 1);
        new WeakReference(abstractC6209h);
    }

    /* renamed from: a */
    public final void m3093a(C6507l c6507l) {
        synchronized (this.f6013b) {
            try {
                if (m3096d()) {
                    c6507l.m12524a(this.f6018g);
                } else {
                    this.f6015d.add(c6507l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public abstract InterfaceC6211j mo3094b(Status status);

    /* renamed from: c */
    public final void m3095c(Status status) {
        synchronized (this.f6013b) {
            try {
                if (!m3096d()) {
                    m3097e(mo3094b(status));
                    this.f6020i = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m3096d() {
        return this.f6014c.getCount() == 0;
    }

    /* renamed from: e */
    public final void m3097e(InterfaceC6211j interfaceC6211j) {
        synchronized (this.f6013b) {
            try {
                if (this.f6020i) {
                    return;
                }
                m3096d();
                AbstractC6840z.m13038i("Results have already been set", !m3096d());
                AbstractC6840z.m13038i("Result has already been consumed", !this.f6019h);
                this.f6017f = interfaceC6211j;
                this.f6018g = interfaceC6211j.mo3091a();
                this.f6014c.countDown();
                ArrayList arrayList = this.f6015d;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C6507l) arrayList.get(i10)).m12524a(this.f6018g);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
