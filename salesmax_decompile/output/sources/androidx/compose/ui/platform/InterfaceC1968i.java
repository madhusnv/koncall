package androidx.compose.ui.platform;

import android.view.View;
import p001o.ded;
import p001o.eed;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;
import p001o.y3i;

/* renamed from: androidx.compose.ui.platform.i */
/* loaded from: classes2.dex */
public interface InterfaceC1968i {

    /* renamed from: a */
    public static final a f6509a = a.f6510a;

    /* renamed from: androidx.compose.ui.platform.i$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f6510a = new a();

        /* renamed from: a */
        public final InterfaceC1968i m5268a() {
            return b.f6511b;
        }
    }

    /* renamed from: androidx.compose.ui.platform.i$b */
    public static final class b implements InterfaceC1968i {

        /* renamed from: b */
        public static final b f6511b = new b();

        /* renamed from: androidx.compose.ui.platform.i$b$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f6512a;

            /* renamed from: b */
            public final /* synthetic */ ViewOnAttachStateChangeListenerC19554b f6513b;

            /* renamed from: c */
            public final /* synthetic */ eed f6514c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractComposeView abstractComposeView, ViewOnAttachStateChangeListenerC19554b viewOnAttachStateChangeListenerC19554b, eed eedVar) {
                super(0);
                this.f6512a = abstractComposeView;
                this.f6513b = viewOnAttachStateChangeListenerC19554b;
                this.f6514c = eedVar;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68693invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68693invoke() {
                this.f6512a.removeOnAttachStateChangeListener(this.f6513b);
                ded.m22911g(this.f6512a, this.f6514c);
            }
        }

        /* renamed from: androidx.compose.ui.platform.i$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC19554b implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f6515a;

            public ViewOnAttachStateChangeListenerC19554b(AbstractComposeView abstractComposeView) {
                this.f6515a = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                sq8.m48649h(view, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                sq8.m48649h(view, "v");
                if (ded.m22910f(this.f6515a)) {
                    return;
                }
                this.f6515a.m5023e();
            }
        }

        /* renamed from: androidx.compose.ui.platform.i$b$c */
        public static final class c implements eed {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f6516a;

            public c(AbstractComposeView abstractComposeView) {
                this.f6516a = abstractComposeView;
            }

            @Override // p001o.eed
            /* renamed from: b */
            public final void mo5269b() {
                this.f6516a.m5023e();
            }
        }

        @Override // androidx.compose.ui.platform.InterfaceC1968i
        /* renamed from: a */
        public uk7 mo5267a(AbstractComposeView abstractComposeView) {
            sq8.m48649h(abstractComposeView, "view");
            ViewOnAttachStateChangeListenerC19554b viewOnAttachStateChangeListenerC19554b = new ViewOnAttachStateChangeListenerC19554b(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC19554b);
            c cVar = new c(abstractComposeView);
            ded.m22905a(abstractComposeView, cVar);
            return new a(abstractComposeView, viewOnAttachStateChangeListenerC19554b, cVar);
        }
    }

    /* renamed from: a */
    uk7 mo5267a(AbstractComposeView abstractComposeView);
}
