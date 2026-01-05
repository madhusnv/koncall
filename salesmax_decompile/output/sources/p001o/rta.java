package p001o;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class rta {

    /* renamed from: a */
    public final InterfaceC16669d f44054a;

    /* renamed from: b */
    public final qta f44055b;

    /* renamed from: c */
    public final View f44056c;

    /* renamed from: o.rta$b */
    public static class C16667b implements InterfaceC16669d {

        /* renamed from: a */
        public OnBackInvokedCallback f44057a;

        public C16667b() {
        }

        @Override // p001o.rta.InterfaceC16669d
        /* renamed from: a */
        public void mo47158a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f44057a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f44057a);
            this.f44057a = null;
        }

        @Override // p001o.rta.InterfaceC16669d
        /* renamed from: b */
        public void mo47159b(qta qtaVar, View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f44057a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackMo47160c = mo47160c(qtaVar);
                this.f44057a = onBackInvokedCallbackMo47160c;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackMo47160c);
            }
        }

        /* renamed from: c */
        public OnBackInvokedCallback mo47160c(final qta qtaVar) {
            Objects.requireNonNull(qtaVar);
            return new OnBackInvokedCallback() { // from class: o.tta
                public final void onBackInvoked() {
                    qtaVar.mo14175d();
                }
            };
        }

        /* renamed from: d */
        public boolean m47161d() {
            return this.f44057a != null;
        }
    }

    /* renamed from: o.rta$c */
    public static class C16668c extends C16667b {

        /* renamed from: o.rta$c$a */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a */
            public final /* synthetic */ qta f44058a;

            public a(qta qtaVar) {
                this.f44058a = qtaVar;
            }

            public void onBackCancelled() {
                if (C16668c.this.m47161d()) {
                    this.f44058a.mo14172a();
                }
            }

            public void onBackInvoked() {
                this.f44058a.mo14175d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C16668c.this.m47161d()) {
                    this.f44058a.mo14174c(new l91(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C16668c.this.m47161d()) {
                    this.f44058a.mo14173b(new l91(backEvent));
                }
            }
        }

        public C16668c() {
            super();
        }

        @Override // p001o.rta.C16667b
        /* renamed from: c */
        public OnBackInvokedCallback mo47160c(qta qtaVar) {
            return new a(qtaVar);
        }
    }

    /* renamed from: o.rta$d */
    public interface InterfaceC16669d {
        /* renamed from: a */
        void mo47158a(View view);

        /* renamed from: b */
        void mo47159b(qta qtaVar, View view, boolean z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rta(View view) {
        this((qta) view, view);
    }

    /* renamed from: a */
    public static InterfaceC16669d m47152a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new C16668c();
        }
        if (i >= 33) {
            return new C16667b();
        }
        return null;
    }

    /* renamed from: b */
    public boolean m47153b() {
        return this.f44054a != null;
    }

    /* renamed from: c */
    public void m47154c() {
        m47155d(false);
    }

    /* renamed from: d */
    public final void m47155d(boolean z) {
        InterfaceC16669d interfaceC16669d = this.f44054a;
        if (interfaceC16669d != null) {
            interfaceC16669d.mo47159b(this.f44055b, this.f44056c, z);
        }
    }

    /* renamed from: e */
    public void m47156e() {
        m47155d(true);
    }

    /* renamed from: f */
    public void m47157f() {
        InterfaceC16669d interfaceC16669d = this.f44054a;
        if (interfaceC16669d != null) {
            interfaceC16669d.mo47158a(this.f44056c);
        }
    }

    public rta(qta qtaVar, View view) {
        this.f44054a = m47152a();
        this.f44055b = qtaVar;
        this.f44056c = view;
    }
}
