package p001o;

import android.os.Handler;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p001o.p69;

/* loaded from: classes2.dex */
public final class abj {

    /* renamed from: a */
    public static final abj f14458a = new abj();

    /* renamed from: b */
    public static final AtomicReference f14459b = new AtomicReference(zaj.f56865a.m59093a());

    /* renamed from: c */
    public static final int f14460c = 8;

    /* renamed from: o.abj$a */
    public static final class ViewOnAttachStateChangeListenerC12134a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ p69 f14461a;

        public ViewOnAttachStateChangeListenerC12134a(p69 p69Var) {
            this.f14461a = p69Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            sq8.m48649h(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            sq8.m48649h(view, "v");
            view.removeOnAttachStateChangeListener(this);
            p69.C15966a.m42999a(this.f14461a, null, 1, null);
        }
    }

    /* renamed from: o.abj$b */
    public static final class C12135b extends jgg implements nl7 {

        /* renamed from: a */
        public int f14462a;

        /* renamed from: b */
        public final /* synthetic */ uee f14463b;

        /* renamed from: c */
        public final /* synthetic */ View f14464c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12135b(uee ueeVar, View view, n64 n64Var) {
            super(2, n64Var);
            this.f14463b = ueeVar;
            this.f14464c = view;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C12135b(this.f14463b, this.f14464c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            View view;
            Object objM51918f = uq8.m51918f();
            int i = this.f14462a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    uee ueeVar = this.f14463b;
                    this.f14462a = 1;
                    if (ueeVar.c0(this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                if (bbj.m18554f(view) == this.f14463b) {
                    bbj.m18557i(this.f14464c, null);
                }
                return y3i.f54824a;
            } finally {
                if (bbj.m18554f(this.f14464c) == this.f14463b) {
                    bbj.m18557i(this.f14464c, null);
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C12135b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public final uee m16824a(View view) {
        sq8.m48649h(view, "rootView");
        uee ueeVarMo59092a = ((zaj) f14459b.get()).mo59092a(view);
        bbj.m18557i(view, ueeVarMo59092a);
        kt7 kt7Var = kt7.f32697a;
        Handler handler = view.getHandler();
        sq8.m48648g(handler, "rootView.handler");
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC12134a(rm1.m46952d(kt7Var, rw7.m47209b(handler, "windowRecomposer cleanup").v0(), null, new C12135b(ueeVarMo59092a, view, null), 2, null)));
        return ueeVarMo59092a;
    }
}
