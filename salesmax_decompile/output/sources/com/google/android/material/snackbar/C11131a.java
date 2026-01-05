package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes3.dex */
public class C11131a {

    /* renamed from: e */
    public static C11131a f13005e;

    /* renamed from: a */
    public final Object f13006a = new Object();

    /* renamed from: b */
    public final Handler f13007b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    public c f13008c;

    /* renamed from: d */
    public c f13009d;

    /* renamed from: com.google.android.material.snackbar.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C11131a.this.m15194d((c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    public interface b {
        /* renamed from: a */
        void mo15180a(int i);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    public static class c {

        /* renamed from: a */
        public final WeakReference f13011a;

        /* renamed from: b */
        public int f13012b;

        /* renamed from: c */
        public boolean f13013c;

        public c(int i, b bVar) {
            this.f13011a = new WeakReference(bVar);
            this.f13012b = i;
        }

        /* renamed from: a */
        public boolean m15205a(b bVar) {
            return bVar != null && this.f13011a.get() == bVar;
        }
    }

    /* renamed from: c */
    public static C11131a m15191c() {
        if (f13005e == null) {
            f13005e = new C11131a();
        }
        return f13005e;
    }

    /* renamed from: a */
    public final boolean m15192a(c cVar, int i) {
        b bVar = (b) cVar.f13011a.get();
        if (bVar == null) {
            return false;
        }
        this.f13007b.removeCallbacksAndMessages(cVar);
        bVar.mo15180a(i);
        return true;
    }

    /* renamed from: b */
    public void m15193b(b bVar, int i) {
        synchronized (this.f13006a) {
            if (m15196f(bVar)) {
                m15192a(this.f13008c, i);
            } else if (m15197g(bVar)) {
                m15192a(this.f13009d, i);
            }
        }
    }

    /* renamed from: d */
    public void m15194d(c cVar) {
        synchronized (this.f13006a) {
            if (this.f13008c == cVar || this.f13009d == cVar) {
                m15192a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m15195e(b bVar) {
        boolean z;
        synchronized (this.f13006a) {
            z = m15196f(bVar) || m15197g(bVar);
        }
        return z;
    }

    /* renamed from: f */
    public final boolean m15196f(b bVar) {
        c cVar = this.f13008c;
        return cVar != null && cVar.m15205a(bVar);
    }

    /* renamed from: g */
    public final boolean m15197g(b bVar) {
        c cVar = this.f13009d;
        return cVar != null && cVar.m15205a(bVar);
    }

    /* renamed from: h */
    public void m15198h(b bVar) {
        synchronized (this.f13006a) {
            if (m15196f(bVar)) {
                this.f13008c = null;
                if (this.f13009d != null) {
                    m15204n();
                }
            }
        }
    }

    /* renamed from: i */
    public void m15199i(b bVar) {
        synchronized (this.f13006a) {
            if (m15196f(bVar)) {
                m15202l(this.f13008c);
            }
        }
    }

    /* renamed from: j */
    public void m15200j(b bVar) {
        synchronized (this.f13006a) {
            if (m15196f(bVar)) {
                c cVar = this.f13008c;
                if (!cVar.f13013c) {
                    cVar.f13013c = true;
                    this.f13007b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public void m15201k(b bVar) {
        synchronized (this.f13006a) {
            if (m15196f(bVar)) {
                c cVar = this.f13008c;
                if (cVar.f13013c) {
                    cVar.f13013c = false;
                    m15202l(cVar);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m15202l(c cVar) {
        int i = cVar.f13012b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.f13007b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f13007b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    /* renamed from: m */
    public void m15203m(int i, b bVar) {
        synchronized (this.f13006a) {
            if (m15196f(bVar)) {
                c cVar = this.f13008c;
                cVar.f13012b = i;
                this.f13007b.removeCallbacksAndMessages(cVar);
                m15202l(this.f13008c);
                return;
            }
            if (m15197g(bVar)) {
                this.f13009d.f13012b = i;
            } else {
                this.f13009d = new c(i, bVar);
            }
            c cVar2 = this.f13008c;
            if (cVar2 == null || !m15192a(cVar2, 4)) {
                this.f13008c = null;
                m15204n();
            }
        }
    }

    /* renamed from: n */
    public final void m15204n() {
        c cVar = this.f13009d;
        if (cVar != null) {
            this.f13008c = cVar;
            this.f13009d = null;
            b bVar = (b) cVar.f13011a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f13008c = null;
            }
        }
    }
}
