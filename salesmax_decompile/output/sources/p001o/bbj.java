package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.imf;
import p001o.p69;

/* loaded from: classes2.dex */
public abstract class bbj {

    /* renamed from: a */
    public static final Map f15880a = new LinkedHashMap();

    /* renamed from: o.bbj$a */
    public static final class ViewOnAttachStateChangeListenerC12345a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f15881a;

        /* renamed from: b */
        public final /* synthetic */ uee f15882b;

        public ViewOnAttachStateChangeListenerC12345a(View view, uee ueeVar) {
            this.f15881a = view;
            this.f15882b = ueeVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            sq8.m48649h(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            sq8.m48649h(view, "v");
            this.f15881a.removeOnAttachStateChangeListener(this);
            this.f15882b.m51433S();
        }
    }

    /* renamed from: o.bbj$b */
    public static final class C12346b implements InterfaceC2142k {

        /* renamed from: a */
        public final /* synthetic */ h84 f15883a;

        /* renamed from: b */
        public final /* synthetic */ h0d f15884b;

        /* renamed from: c */
        public final /* synthetic */ uee f15885c;

        /* renamed from: d */
        public final /* synthetic */ gge f15886d;

        /* renamed from: e */
        public final /* synthetic */ View f15887e;

        /* renamed from: o.bbj$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f15888a;

            static {
                int[] iArr = new int[AbstractC2139h.a.values().length];
                try {
                    iArr[AbstractC2139h.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f15888a = iArr;
            }
        }

        /* renamed from: o.bbj$b$b */
        public static final class b extends jgg implements nl7 {

            /* renamed from: a */
            public int f15889a;

            /* renamed from: b */
            public /* synthetic */ Object f15890b;

            /* renamed from: c */
            public final /* synthetic */ gge f15891c;

            /* renamed from: d */
            public final /* synthetic */ uee f15892d;

            /* renamed from: e */
            public final /* synthetic */ xca f15893e;

            /* renamed from: f */
            public final /* synthetic */ C12346b f15894f;

            /* renamed from: g */
            public final /* synthetic */ View f15895g;

            /* renamed from: o.bbj$b$b$a */
            public static final class a extends jgg implements nl7 {

                /* renamed from: a */
                public int f15896a;

                /* renamed from: b */
                public final /* synthetic */ q4g f15897b;

                /* renamed from: c */
                public final /* synthetic */ imb f15898c;

                /* renamed from: o.bbj$b$b$a$a, reason: collision with other inner class name */
                public static final class C19583a implements z37 {

                    /* renamed from: a */
                    public final /* synthetic */ imb f15899a;

                    public C19583a(imb imbVar) {
                        this.f15899a = imbVar;
                    }

                    /* renamed from: a */
                    public final Object m18558a(float f, n64 n64Var) {
                        this.f15899a.m32400b(f);
                        return y3i.f54824a;
                    }

                    @Override // p001o.z37
                    public /* bridge */ /* synthetic */ Object emit(Object obj, n64 n64Var) {
                        return m18558a(((Number) obj).floatValue(), n64Var);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(q4g q4gVar, imb imbVar, n64 n64Var) {
                    super(2, n64Var);
                    this.f15897b = q4gVar;
                    this.f15898c = imbVar;
                }

                @Override // p001o.vb1
                public final n64 create(Object obj, n64 n64Var) {
                    return new a(this.f15897b, this.f15898c, n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    Object objM51918f = uq8.m51918f();
                    int i = this.f15896a;
                    if (i == 0) {
                        wre.m54934b(obj);
                        q4g q4gVar = this.f15897b;
                        C19583a c19583a = new C19583a(this.f15898c);
                        this.f15896a = 1;
                        if (q4gVar.mo9775a(c19583a, this) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    throw new qe9();
                }

                @Override // p001o.nl7
                public final Object invoke(h84 h84Var, n64 n64Var) {
                    return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(gge ggeVar, uee ueeVar, xca xcaVar, C12346b c12346b, View view, n64 n64Var) {
                super(2, n64Var);
                this.f15891c = ggeVar;
                this.f15892d = ueeVar;
                this.f15893e = xcaVar;
                this.f15894f = c12346b;
                this.f15895g = view;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                b bVar = new b(this.f15891c, this.f15892d, this.f15893e, this.f15894f, this.f15895g, n64Var);
                bVar.f15890b = obj;
                return bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                p69 p69Var;
                p69 p69VarM46952d;
                Object objM51918f = uq8.m51918f();
                int i = this.f15889a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p69Var = (p69) this.f15890b;
                    try {
                        wre.m54934b(obj);
                        if (p69Var != null) {
                            p69.C15966a.m42999a(p69Var, null, 1, null);
                        }
                        this.f15893e.getLifecycle().mo6524d(this.f15894f);
                        return y3i.f54824a;
                    } catch (Throwable th) {
                        th = th;
                        if (p69Var != null) {
                            p69.C15966a.m42999a(p69Var, null, 1, null);
                        }
                        this.f15893e.getLifecycle().mo6524d(this.f15894f);
                        throw th;
                    }
                }
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f15890b;
                try {
                    imb imbVar = (imb) this.f15891c.f25106a;
                    if (imbVar != null) {
                        Context applicationContext = this.f15895g.getContext().getApplicationContext();
                        sq8.m48648g(applicationContext, "context.applicationContext");
                        q4g q4gVarM18553e = bbj.m18553e(applicationContext);
                        imbVar.m32400b(((Number) q4gVarM18553e.getValue()).floatValue());
                        p69VarM46952d = rm1.m46952d(h84Var, null, null, new a(q4gVarM18553e, imbVar, null), 3, null);
                    } else {
                        p69VarM46952d = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    p69Var = null;
                }
                try {
                    uee ueeVar = this.f15892d;
                    this.f15890b = p69VarM46952d;
                    this.f15889a = 1;
                    if (ueeVar.p0(this) == objM51918f) {
                        return objM51918f;
                    }
                    p69Var = p69VarM46952d;
                    if (p69Var != null) {
                    }
                    this.f15893e.getLifecycle().mo6524d(this.f15894f);
                    return y3i.f54824a;
                } catch (Throwable th3) {
                    p69Var = p69VarM46952d;
                    th = th3;
                    if (p69Var != null) {
                    }
                    this.f15893e.getLifecycle().mo6524d(this.f15894f);
                    throw th;
                }
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C12346b(h84 h84Var, h0d h0dVar, uee ueeVar, gge ggeVar, View view) {
            this.f15883a = h84Var;
            this.f15884b = h0dVar;
            this.f15885c = ueeVar;
            this.f15886d = ggeVar;
            this.f15887e = view;
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            sq8.m48649h(xcaVar, "source");
            sq8.m48649h(aVar, "event");
            int i = a.f15888a[aVar.ordinal()];
            if (i == 1) {
                rm1.m46952d(this.f15883a, null, l84.UNDISPATCHED, new b(this.f15886d, this.f15885c, xcaVar, this, this.f15887e, null), 1, null);
                return;
            }
            if (i == 2) {
                h0d h0dVar = this.f15884b;
                if (h0dVar != null) {
                    h0dVar.m29724e();
                }
                this.f15885c.o0();
                return;
            }
            if (i == 3) {
                this.f15885c.d0();
            } else {
                if (i != 4) {
                    return;
                }
                this.f15885c.m51433S();
            }
        }
    }

    /* renamed from: o.bbj$c */
    public static final class C12347c extends jgg implements nl7 {

        /* renamed from: a */
        public Object f15900a;

        /* renamed from: b */
        public int f15901b;

        /* renamed from: c */
        public /* synthetic */ Object f15902c;

        /* renamed from: d */
        public final /* synthetic */ ContentResolver f15903d;

        /* renamed from: e */
        public final /* synthetic */ Uri f15904e;

        /* renamed from: f */
        public final /* synthetic */ C12348d f15905f;

        /* renamed from: g */
        public final /* synthetic */ jg2 f15906g;

        /* renamed from: h */
        public final /* synthetic */ Context f15907h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12347c(ContentResolver contentResolver, Uri uri, C12348d c12348d, jg2 jg2Var, Context context, n64 n64Var) {
            super(2, n64Var);
            this.f15903d = contentResolver;
            this.f15904e = uri;
            this.f15905f = c12348d;
            this.f15906g = jg2Var;
            this.f15907h = context;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12347c c12347c = new C12347c(this.f15903d, this.f15904e, this.f15905f, this.f15906g, this.f15907h, n64Var);
            c12347c.f15902c = obj;
            return c12347c;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:17:0x0049, B:21:0x0059, B:23:0x0061), top: B:36:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:36:0x0049). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C12347c c12347c;
            z37 z37Var;
            sg2 it;
            Object objMo23482a;
            Object objM51918f = uq8.m51918f();
            int i = this.f15901b;
            try {
            } catch (Throwable th) {
                th = th;
                c12347c = this;
            }
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    z37Var = (z37) this.f15902c;
                    this.f15903d.registerContentObserver(this.f15904e, false, this.f15905f);
                    it = this.f15906g.iterator();
                } else if (i == 1) {
                    it = (sg2) this.f15900a;
                    z37 z37Var2 = (z37) this.f15902c;
                    wre.m54934b(obj);
                    z37 z37Var3 = z37Var2;
                    c12347c = this;
                    if (!((Boolean) obj).booleanValue()) {
                        it.next();
                        Float fM39303c = ml1.m39303c(Settings.Global.getFloat(c12347c.f15907h.getContentResolver(), "animator_duration_scale", 1.0f));
                        c12347c.f15902c = z37Var3;
                        c12347c.f15900a = it;
                        c12347c.f15901b = 2;
                        if (z37Var3.emit(fM39303c, c12347c) == objM51918f) {
                            return objM51918f;
                        }
                        z37Var = z37Var3;
                        c12347c.f15902c = z37Var;
                        c12347c.f15900a = it;
                        c12347c.f15901b = 1;
                        objMo23482a = it.mo23482a(c12347c);
                        if (objMo23482a != objM51918f) {
                            return objM51918f;
                        }
                        z37Var3 = z37Var;
                        obj = objMo23482a;
                        if (!((Boolean) obj).booleanValue()) {
                            c12347c.f15903d.unregisterContentObserver(c12347c.f15905f);
                            return y3i.f54824a;
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (sg2) this.f15900a;
                    z37 z37Var4 = (z37) this.f15902c;
                    wre.m54934b(obj);
                    z37Var = z37Var4;
                }
                c12347c.f15902c = z37Var;
                c12347c.f15900a = it;
                c12347c.f15901b = 1;
                objMo23482a = it.mo23482a(c12347c);
                if (objMo23482a != objM51918f) {
                }
            } catch (Throwable th2) {
                th = th2;
                c12347c.f15903d.unregisterContentObserver(c12347c.f15905f);
                throw th;
            }
            c12347c = this;
        }

        @Override // p001o.nl7
        public final Object invoke(z37 z37Var, n64 n64Var) {
            return ((C12347c) create(z37Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.bbj$d */
    public static final class C12348d extends ContentObserver {

        /* renamed from: a */
        public final /* synthetic */ jg2 f15908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12348d(jg2 jg2Var, Handler handler) {
            super(handler);
            this.f15908a = jg2Var;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            this.f15908a.mo23472g(y3i.f54824a);
        }
    }

    /* renamed from: b */
    public static final uee m18550b(View view, q74 q74Var, AbstractC2139h abstractC2139h) {
        h0d h0dVar;
        sq8.m48649h(view, "<this>");
        sq8.m48649h(q74Var, "coroutineContext");
        if (q74Var.get(p64.f39391p) == null || q74Var.get(plb.f40230u) == null) {
            q74Var = tf0.f46973H.m49800a().plus(q74Var);
        }
        plb plbVar = (plb) q74Var.get(plb.f40230u);
        if (plbVar != null) {
            h0d h0dVar2 = new h0d(plbVar);
            h0dVar2.m29723b();
            h0dVar = h0dVar2;
        } else {
            h0dVar = null;
        }
        gge ggeVar = new gge();
        q74 imbVar = (hmb) q74Var.get(hmb.f27170v);
        if (imbVar == null) {
            imbVar = new imb();
            ggeVar.f25106a = imbVar;
        }
        q74 q74VarPlus = q74Var.plus(h0dVar != null ? h0dVar : e66.f21035a).plus(imbVar);
        uee ueeVar = new uee(q74VarPlus);
        ueeVar.d0();
        h84 h84VarM31707a = i84.m31707a(q74VarPlus);
        if (abstractC2139h == null) {
            xca xcaVarM47365a = rzi.m47365a(view);
            abstractC2139h = xcaVarM47365a != null ? xcaVarM47365a.getLifecycle() : null;
        }
        if (abstractC2139h != null) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC12345a(view, ueeVar));
            abstractC2139h.mo6521a(new C12346b(h84VarM31707a, h0dVar, ueeVar, ggeVar, view));
            return ueeVar;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ uee m18551c(View view, q74 q74Var, AbstractC2139h abstractC2139h, int i, Object obj) {
        if ((i & 1) != 0) {
            q74Var = e66.f21035a;
        }
        if ((i & 2) != 0) {
            abstractC2139h = null;
        }
        return m18550b(view, q74Var, abstractC2139h);
    }

    /* renamed from: d */
    public static final bp3 m18552d(View view) {
        sq8.m48649h(view, "<this>");
        bp3 bp3VarM18554f = m18554f(view);
        if (bp3VarM18554f != null) {
            return bp3VarM18554f;
        }
        for (ViewParent parent = view.getParent(); bp3VarM18554f == null && (parent instanceof View); parent = parent.getParent()) {
            bp3VarM18554f = m18554f((View) parent);
        }
        return bp3VarM18554f;
    }

    /* renamed from: e */
    public static final q4g m18553e(Context context) {
        q4g q4gVar;
        Map map = f15880a;
        synchronized (map) {
            Object objM24286t = map.get(context);
            if (objM24286t == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                jg2 jg2VarM49824b = tg2.m49824b(-1, null, null, 6, null);
                objM24286t = e47.m24286t(e47.m24281o(new C12347c(contentResolver, uriFor, new C12348d(jg2VarM49824b, lw7.m37994a(Looper.getMainLooper())), jg2VarM49824b, context, null)), i84.m31708b(), imf.C14327a.m32414b(imf.f28923a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, objM24286t);
            }
            q4gVar = (q4g) objM24286t;
        }
        return q4gVar;
    }

    /* renamed from: f */
    public static final bp3 m18554f(View view) {
        sq8.m48649h(view, "<this>");
        Object tag = view.getTag(s8e.androidx_compose_ui_view_composition_context);
        if (tag instanceof bp3) {
            return (bp3) tag;
        }
        return null;
    }

    /* renamed from: g */
    public static final View m18555g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    /* renamed from: h */
    public static final uee m18556h(View view) {
        sq8.m48649h(view, "<this>");
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        View viewM18555g = m18555g(view);
        bp3 bp3VarM18554f = m18554f(viewM18555g);
        if (bp3VarM18554f == null) {
            return abj.f14458a.m16824a(viewM18555g);
        }
        if (bp3VarM18554f instanceof uee) {
            return (uee) bp3VarM18554f;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    /* renamed from: i */
    public static final void m18557i(View view, bp3 bp3Var) {
        sq8.m48649h(view, "<this>");
        view.setTag(s8e.androidx_compose_ui_view_composition_context, bp3Var);
    }
}
