package p001o;

import android.graphics.Typeface;
import android.os.Handler;
import p001o.bc7;
import p001o.wb7;

/* loaded from: classes2.dex */
public class h32 {

    /* renamed from: a */
    public final bc7.C12353c f26156a;

    /* renamed from: b */
    public final Handler f26157b;

    /* renamed from: o.h32$a */
    public class RunnableC13843a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ bc7.C12353c f26158a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f26159b;

        public RunnableC13843a(bc7.C12353c c12353c, Typeface typeface) {
            this.f26158a = c12353c;
            this.f26159b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26158a.mo18596b(this.f26159b);
        }
    }

    /* renamed from: o.h32$b */
    public class RunnableC13844b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ bc7.C12353c f26161a;

        /* renamed from: b */
        public final /* synthetic */ int f26162b;

        public RunnableC13844b(bc7.C12353c c12353c, int i) {
            this.f26161a = c12353c;
            this.f26162b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26161a.mo18595a(this.f26162b);
        }
    }

    public h32(bc7.C12353c c12353c, Handler handler) {
        this.f26156a = c12353c;
        this.f26157b = handler;
    }

    /* renamed from: a */
    public final void m29770a(int i) {
        this.f26157b.post(new RunnableC13844b(this.f26156a, i));
    }

    /* renamed from: b */
    public void m29771b(wb7.C17810e c17810e) {
        if (c17810e.m54166a()) {
            m29772c(c17810e.f51726a);
        } else {
            m29770a(c17810e.f51727b);
        }
    }

    /* renamed from: c */
    public final void m29772c(Typeface typeface) {
        this.f26157b.post(new RunnableC13843a(this.f26156a, typeface));
    }
}
