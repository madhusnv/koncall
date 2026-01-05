package p001o;

import android.view.Surface;
import androidx.media3.common.C2181a;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface zui {

    /* renamed from: o.zui$a */
    public interface InterfaceC18713a {

        /* renamed from: a */
        public static final InterfaceC18713a f57733a = new a();

        /* renamed from: o.zui$a$a */
        public class a implements InterfaceC18713a {
            @Override // p001o.zui.InterfaceC18713a
            /* renamed from: a */
            public void mo36453a(zui zuiVar, bvi bviVar) {
            }

            @Override // p001o.zui.InterfaceC18713a
            /* renamed from: b */
            public void mo36454b(zui zuiVar) {
            }

            @Override // p001o.zui.InterfaceC18713a
            /* renamed from: c */
            public void mo36455c(zui zuiVar) {
            }
        }

        /* renamed from: a */
        void mo36453a(zui zuiVar, bvi bviVar);

        /* renamed from: b */
        void mo36454b(zui zuiVar);

        /* renamed from: c */
        void mo36455c(zui zuiVar);
    }

    /* renamed from: o.zui$b */
    public static final class C18714b extends Exception {

        /* renamed from: a */
        public final C2181a f57734a;

        public C18714b(Throwable th, C2181a c2181a) {
            super(th);
            this.f57734a = c2181a;
        }
    }

    /* renamed from: b */
    boolean mo53134b();

    /* renamed from: c */
    void mo53135c();

    /* renamed from: d */
    void mo53136d(gui guiVar);

    /* renamed from: e */
    long mo53137e(long j, boolean z);

    /* renamed from: f */
    void mo53138f();

    /* renamed from: g */
    void mo53139g(long j, long j2);

    /* renamed from: h */
    void mo53140h(List list);

    /* renamed from: i */
    void mo53141i(float f);

    boolean isInitialized();

    boolean isReady();

    /* renamed from: j */
    void mo53142j(int i, C2181a c2181a);

    /* renamed from: k */
    void mo53143k(long j, long j2);

    /* renamed from: m */
    boolean mo53144m();

    /* renamed from: n */
    void mo53145n(C2181a c2181a);

    /* renamed from: o */
    void mo53146o(boolean z);

    /* renamed from: p */
    Surface mo53147p();

    /* renamed from: q */
    void mo53148q();

    /* renamed from: r */
    void mo53149r();

    void release();

    /* renamed from: s */
    void mo53150s();

    /* renamed from: t */
    void mo53151t(InterfaceC18713a interfaceC18713a, Executor executor);

    /* renamed from: u */
    void mo53152u(Surface surface, fvf fvfVar);

    /* renamed from: v */
    void mo53153v(boolean z);
}
