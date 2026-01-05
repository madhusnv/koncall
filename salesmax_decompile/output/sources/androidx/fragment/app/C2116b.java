package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC2117c;
import androidx.fragment.app.AbstractC2126l;
import androidx.fragment.app.C2116b;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.message.TokenParser;
import p001o.dh3;
import p001o.ec2;
import p001o.gge;
import p001o.hh3;
import p001o.hwc;
import p001o.kf9;
import p001o.kh3;
import p001o.kwi;
import p001o.l91;
import p001o.pcc;
import p001o.sq8;
import p001o.tq;
import p001o.uk7;
import p001o.vi7;
import p001o.vo0;
import p001o.vyh;
import p001o.wvi;
import p001o.xi7;
import p001o.xk7;
import p001o.y3i;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes2.dex */
public final class C2116b extends AbstractC2126l {

    /* renamed from: androidx.fragment.app.b$a */
    public static final class a extends AbstractC2126l.b {

        /* renamed from: d */
        public final b f7497d;

        /* renamed from: androidx.fragment.app.b$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC19559a implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ AbstractC2126l.d f7498a;

            /* renamed from: b */
            public final /* synthetic */ ViewGroup f7499b;

            /* renamed from: c */
            public final /* synthetic */ View f7500c;

            /* renamed from: d */
            public final /* synthetic */ a f7501d;

            public AnimationAnimationListenerC19559a(AbstractC2126l.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f7498a = dVar;
                this.f7499b = viewGroup;
                this.f7500c = view;
                this.f7501d = aVar;
            }

            /* renamed from: b */
            public static final void m6284b(ViewGroup viewGroup, View view, a aVar) {
                sq8.m48649h(viewGroup, "$container");
                sq8.m48649h(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.m6282h().m6293a().m6475e(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                sq8.m48649h(animation, "animation");
                final ViewGroup viewGroup = this.f7499b;
                final View view = this.f7500c;
                final a aVar = this.f7501d;
                viewGroup.post(new Runnable() { // from class: o.ch5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2116b.a.AnimationAnimationListenerC19559a.m6284b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.P0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Animation from operation ");
                    sb.append(this.f7498a);
                    sb.append(" has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                sq8.m48649h(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                sq8.m48649h(animation, "animation");
                if (FragmentManager.P0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Animation from operation ");
                    sb.append(this.f7498a);
                    sb.append(" has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            sq8.m48649h(bVar, "animationInfo");
            this.f7497d = bVar;
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: c */
        public void mo6280c(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            AbstractC2126l.d dVarM6293a = this.f7497d.m6293a();
            View view = dVarM6293a.m6478h().mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f7497d.m6293a().m6475e(this);
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(dVarM6293a);
                sb.append(" has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: d */
        public void mo6281d(ViewGroup viewGroup) throws Resources.NotFoundException {
            sq8.m48649h(viewGroup, "container");
            if (this.f7497d.m6294b()) {
                this.f7497d.m6293a().m6475e(this);
                return;
            }
            Context context = viewGroup.getContext();
            AbstractC2126l.d dVarM6293a = this.f7497d.m6293a();
            View view = dVarM6293a.m6478h().mView;
            b bVar = this.f7497d;
            sq8.m48648g(context, "context");
            AbstractC2117c.a aVarM6285c = bVar.m6285c(context);
            if (aVarM6285c == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Animation animation = aVarM6285c.f7544a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (dVarM6293a.m6477g() != AbstractC2126l.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f7497d.m6293a().m6475e(this);
                return;
            }
            viewGroup.startViewTransition(view);
            AbstractC2117c.b bVar2 = new AbstractC2117c.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC19559a(dVarM6293a, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(dVarM6293a);
                sb.append(" has started.");
            }
        }

        /* renamed from: h */
        public final b m6282h() {
            return this.f7497d;
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    public static final class b extends f {

        /* renamed from: b */
        public final boolean f7502b;

        /* renamed from: c */
        public boolean f7503c;

        /* renamed from: d */
        public AbstractC2117c.a f7504d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC2126l.d dVar, boolean z) {
            super(dVar);
            sq8.m48649h(dVar, "operation");
            this.f7502b = z;
        }

        /* renamed from: c */
        public final AbstractC2117c.a m6285c(Context context) throws Resources.NotFoundException {
            sq8.m48649h(context, "context");
            if (this.f7503c) {
                return this.f7504d;
            }
            AbstractC2117c.a aVarM6329b = AbstractC2117c.m6329b(context, m6293a().m6478h(), m6293a().m6477g() == AbstractC2126l.d.b.VISIBLE, this.f7502b);
            this.f7504d = aVarM6329b;
            this.f7503c = true;
            return aVarM6329b;
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    public static final class c extends AbstractC2126l.b {

        /* renamed from: d */
        public final b f7505d;

        /* renamed from: e */
        public AnimatorSet f7506e;

        /* renamed from: androidx.fragment.app.b$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ ViewGroup f7507a;

            /* renamed from: b */
            public final /* synthetic */ View f7508b;

            /* renamed from: c */
            public final /* synthetic */ boolean f7509c;

            /* renamed from: d */
            public final /* synthetic */ AbstractC2126l.d f7510d;

            /* renamed from: e */
            public final /* synthetic */ c f7511e;

            public a(ViewGroup viewGroup, View view, boolean z, AbstractC2126l.d dVar, c cVar) {
                this.f7507a = viewGroup;
                this.f7508b = view;
                this.f7509c = z;
                this.f7510d = dVar;
                this.f7511e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sq8.m48649h(animator, "anim");
                this.f7507a.endViewTransition(this.f7508b);
                if (this.f7509c) {
                    AbstractC2126l.d.b bVarM6477g = this.f7510d.m6477g();
                    View view = this.f7508b;
                    sq8.m48648g(view, "viewToAnimate");
                    bVarM6477g.applyState(view, this.f7507a);
                }
                this.f7511e.m6289h().m6293a().m6475e(this.f7511e);
                if (FragmentManager.P0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Animator from operation ");
                    sb.append(this.f7510d);
                    sb.append(" has ended.");
                }
            }
        }

        public c(b bVar) {
            sq8.m48649h(bVar, "animatorInfo");
            this.f7505d = bVar;
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: b */
        public boolean mo6286b() {
            return true;
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: c */
        public void mo6280c(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            AnimatorSet animatorSet = this.f7506e;
            if (animatorSet == null) {
                this.f7505d.m6293a().m6475e(this);
                return;
            }
            AbstractC2126l.d dVarM6293a = this.f7505d.m6293a();
            if (!dVarM6293a.m6483m()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f7513a.m6291a(animatorSet);
            }
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(dVarM6293a);
                sb.append(" has been canceled");
                sb.append(dVarM6293a.m6483m() ? " with seeking." : ".");
                sb.append(TokenParser.SP);
            }
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: d */
        public void mo6281d(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            AbstractC2126l.d dVarM6293a = this.f7505d.m6293a();
            AnimatorSet animatorSet = this.f7506e;
            if (animatorSet == null) {
                this.f7505d.m6293a().m6475e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(dVarM6293a);
                sb.append(" has started.");
            }
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: e */
        public void mo6287e(l91 l91Var, ViewGroup viewGroup) {
            sq8.m48649h(l91Var, "backEvent");
            sq8.m48649h(viewGroup, "container");
            AbstractC2126l.d dVarM6293a = this.f7505d.m6293a();
            AnimatorSet animatorSet = this.f7506e;
            if (animatorSet == null) {
                this.f7505d.m6293a().m6475e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVarM6293a.m6478h().mTransitioning) {
                return;
            }
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Adding BackProgressCallbacks for Animators to operation ");
                sb.append(dVarM6293a);
            }
            long jM6290a = d.f7512a.m6290a(animatorSet);
            long jM36806a = (long) (l91Var.m36806a() * jM6290a);
            if (jM36806a == 0) {
                jM36806a = 1;
            }
            if (jM36806a == jM6290a) {
                jM36806a = jM6290a - 1;
            }
            if (FragmentManager.P0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting currentPlayTime to ");
                sb2.append(jM36806a);
                sb2.append(" for Animator ");
                sb2.append(animatorSet);
                sb2.append(" on operation ");
                sb2.append(dVarM6293a);
            }
            e.f7513a.m6292b(animatorSet, jM36806a);
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: f */
        public void mo6288f(ViewGroup viewGroup) throws Resources.NotFoundException {
            sq8.m48649h(viewGroup, "container");
            if (this.f7505d.m6294b()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.f7505d;
            sq8.m48648g(context, "context");
            AbstractC2117c.a aVarM6285c = bVar.m6285c(context);
            this.f7506e = aVarM6285c != null ? aVarM6285c.f7545b : null;
            AbstractC2126l.d dVarM6293a = this.f7505d.m6293a();
            Fragment fragmentM6478h = dVarM6293a.m6478h();
            boolean z = dVarM6293a.m6477g() == AbstractC2126l.d.b.GONE;
            View view = fragmentM6478h.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f7506e;
            if (animatorSet != null) {
                animatorSet.addListener(new a(viewGroup, view, z, dVarM6293a, this));
            }
            AnimatorSet animatorSet2 = this.f7506e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        /* renamed from: h */
        public final b m6289h() {
            return this.f7505d;
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    public static final class d {

        /* renamed from: a */
        public static final d f7512a = new d();

        /* renamed from: a */
        public final long m6290a(AnimatorSet animatorSet) {
            sq8.m48649h(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: androidx.fragment.app.b$e */
    public static final class e {

        /* renamed from: a */
        public static final e f7513a = new e();

        /* renamed from: a */
        public final void m6291a(AnimatorSet animatorSet) {
            sq8.m48649h(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        /* renamed from: b */
        public final void m6292b(AnimatorSet animatorSet, long j) {
            sq8.m48649h(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    public static class f {

        /* renamed from: a */
        public final AbstractC2126l.d f7514a;

        public f(AbstractC2126l.d dVar) {
            sq8.m48649h(dVar, "operation");
            this.f7514a = dVar;
        }

        /* renamed from: a */
        public final AbstractC2126l.d m6293a() {
            return this.f7514a;
        }

        /* renamed from: b */
        public final boolean m6294b() {
            AbstractC2126l.d.b bVar;
            View view = this.f7514a.m6478h().mView;
            AbstractC2126l.d.b bVarM6488a = view != null ? AbstractC2126l.d.b.Companion.m6488a(view) : null;
            AbstractC2126l.d.b bVarM6477g = this.f7514a.m6477g();
            return bVarM6488a == bVarM6477g || !(bVarM6488a == (bVar = AbstractC2126l.d.b.VISIBLE) || bVarM6477g == bVar);
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    public static final class g extends AbstractC2126l.b {

        /* renamed from: d */
        public final List f7515d;

        /* renamed from: e */
        public final AbstractC2126l.d f7516e;

        /* renamed from: f */
        public final AbstractC2126l.d f7517f;

        /* renamed from: g */
        public final xi7 f7518g;

        /* renamed from: h */
        public final Object f7519h;

        /* renamed from: i */
        public final ArrayList f7520i;

        /* renamed from: j */
        public final ArrayList f7521j;

        /* renamed from: k */
        public final vo0 f7522k;

        /* renamed from: l */
        public final ArrayList f7523l;

        /* renamed from: m */
        public final ArrayList f7524m;

        /* renamed from: n */
        public final vo0 f7525n;

        /* renamed from: o */
        public final vo0 f7526o;

        /* renamed from: p */
        public final boolean f7527p;

        /* renamed from: q */
        public final ec2 f7528q;

        /* renamed from: r */
        public Object f7529r;

        /* renamed from: androidx.fragment.app.b$g$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: b */
            public final /* synthetic */ ViewGroup f7531b;

            /* renamed from: c */
            public final /* synthetic */ Object f7532c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f7531b = viewGroup;
                this.f7532c = obj;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68699invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68699invoke() {
                g.this.m6314v().mo9928e(this.f7531b, this.f7532c);
            }
        }

        /* renamed from: androidx.fragment.app.b$g$b */
        public static final class b extends kf9 implements uk7 {

            /* renamed from: b */
            public final /* synthetic */ ViewGroup f7534b;

            /* renamed from: c */
            public final /* synthetic */ Object f7535c;

            /* renamed from: d */
            public final /* synthetic */ gge f7536d;

            /* renamed from: androidx.fragment.app.b$g$b$a */
            public static final class a extends kf9 implements uk7 {

                /* renamed from: a */
                public final /* synthetic */ g f7537a;

                /* renamed from: b */
                public final /* synthetic */ Object f7538b;

                /* renamed from: c */
                public final /* synthetic */ ViewGroup f7539c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f7537a = gVar;
                    this.f7538b = obj;
                    this.f7539c = viewGroup;
                }

                /* renamed from: c */
                public static final void m6319c(g gVar, ViewGroup viewGroup) {
                    sq8.m48649h(gVar, "this$0");
                    sq8.m48649h(viewGroup, "$container");
                    Iterator it = gVar.m6315w().iterator();
                    while (it.hasNext()) {
                        AbstractC2126l.d dVarM6293a = ((h) it.next()).m6293a();
                        View view = dVarM6293a.m6478h().getView();
                        if (view != null) {
                            dVarM6293a.m6477g().applyState(view, viewGroup);
                        }
                    }
                }

                /* renamed from: d */
                public static final void m6320d(g gVar) {
                    sq8.m48649h(gVar, "this$0");
                    FragmentManager.P0(2);
                    Iterator it = gVar.m6315w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).m6293a().m6475e(gVar);
                    }
                }

                @Override // p001o.uk7
                public /* bridge */ /* synthetic */ Object invoke() {
                    m68701invoke();
                    return y3i.f54824a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m68701invoke() {
                    List listM6315w = this.f7537a.m6315w();
                    boolean z = true;
                    if (!(listM6315w instanceof Collection) || !listM6315w.isEmpty()) {
                        Iterator it = listM6315w.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!((h) it.next()).m6293a().m6483m()) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (z) {
                        FragmentManager.P0(2);
                        xi7 xi7VarM6314v = this.f7537a.m6314v();
                        Object objM6311s = this.f7537a.m6311s();
                        sq8.m48646e(objM6311s);
                        final g gVar = this.f7537a;
                        final ViewGroup viewGroup = this.f7539c;
                        xi7VarM6314v.mo9927d(objM6311s, new Runnable() { // from class: o.jh5
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2116b.g.b.a.m6319c(gVar, viewGroup);
                            }
                        });
                        return;
                    }
                    FragmentManager.P0(2);
                    ec2 ec2Var = new ec2();
                    xi7 xi7VarM6314v2 = this.f7537a.m6314v();
                    Fragment fragmentM6478h = ((h) this.f7537a.m6315w().get(0)).m6293a().m6478h();
                    Object obj = this.f7538b;
                    final g gVar2 = this.f7537a;
                    xi7VarM6314v2.mo9941w(fragmentM6478h, obj, ec2Var, new Runnable() { // from class: o.kh5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2116b.g.b.a.m6320d(gVar2);
                        }
                    });
                    ec2Var.m24745a();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, gge ggeVar) {
                super(0);
                this.f7534b = viewGroup;
                this.f7535c = obj;
                this.f7536d = ggeVar;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68700invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68700invoke() {
                g gVar = g.this;
                gVar.m6308C(gVar.m6314v().mo9931j(this.f7534b, this.f7535c));
                boolean z = g.this.m6311s() != null;
                Object obj = this.f7535c;
                ViewGroup viewGroup = this.f7534b;
                if (!z) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.f7536d.f25106a = new a(g.this, obj, viewGroup);
                if (FragmentManager.P0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Started executing operations from ");
                    sb.append(g.this.m6312t());
                    sb.append(" to ");
                    sb.append(g.this.m6313u());
                }
            }
        }

        public g(List list, AbstractC2126l.d dVar, AbstractC2126l.d dVar2, xi7 xi7Var, Object obj, ArrayList arrayList, ArrayList arrayList2, vo0 vo0Var, ArrayList arrayList3, ArrayList arrayList4, vo0 vo0Var2, vo0 vo0Var3, boolean z) {
            sq8.m48649h(list, "transitionInfos");
            sq8.m48649h(xi7Var, "transitionImpl");
            sq8.m48649h(arrayList, "sharedElementFirstOutViews");
            sq8.m48649h(arrayList2, "sharedElementLastInViews");
            sq8.m48649h(vo0Var, "sharedElementNameMapping");
            sq8.m48649h(arrayList3, "enteringNames");
            sq8.m48649h(arrayList4, "exitingNames");
            sq8.m48649h(vo0Var2, "firstOutViews");
            sq8.m48649h(vo0Var3, "lastInViews");
            this.f7515d = list;
            this.f7516e = dVar;
            this.f7517f = dVar2;
            this.f7518g = xi7Var;
            this.f7519h = obj;
            this.f7520i = arrayList;
            this.f7521j = arrayList2;
            this.f7522k = vo0Var;
            this.f7523l = arrayList3;
            this.f7524m = arrayList4;
            this.f7525n = vo0Var2;
            this.f7526o = vo0Var3;
            this.f7527p = z;
            this.f7528q = new ec2();
        }

        /* renamed from: A */
        public static final void m6295A(AbstractC2126l.d dVar, g gVar) {
            sq8.m48649h(dVar, "$operation");
            sq8.m48649h(gVar, "this$0");
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(dVar);
                sb.append(" has completed");
            }
            dVar.m6475e(gVar);
        }

        /* renamed from: p */
        public static final void m6302p(AbstractC2126l.d dVar, AbstractC2126l.d dVar2, g gVar) {
            sq8.m48649h(gVar, "this$0");
            vi7.m52849a(dVar.m6478h(), dVar2.m6478h(), gVar.f7527p, gVar.f7526o, false);
        }

        /* renamed from: q */
        public static final void m6303q(xi7 xi7Var, View view, Rect rect) {
            sq8.m48649h(xi7Var, "$impl");
            sq8.m48649h(rect, "$lastInEpicenterRect");
            xi7Var.m56331k(view, rect);
        }

        /* renamed from: r */
        public static final void m6304r(ArrayList arrayList) {
            sq8.m48649h(arrayList, "$transitioningViews");
            vi7.m52851d(arrayList, 4);
        }

        /* renamed from: y */
        public static final void m6305y(AbstractC2126l.d dVar, g gVar) {
            sq8.m48649h(dVar, "$operation");
            sq8.m48649h(gVar, "this$0");
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(dVar);
                sb.append(" has completed");
            }
            dVar.m6475e(gVar);
        }

        /* renamed from: z */
        public static final void m6306z(gge ggeVar) {
            sq8.m48649h(ggeVar, "$seekCancelLambda");
            uk7 uk7Var = (uk7) ggeVar.f25106a;
            if (uk7Var != null) {
                uk7Var.invoke();
            }
        }

        /* renamed from: B */
        public final void m6307B(ArrayList arrayList, ViewGroup viewGroup, uk7 uk7Var) {
            vi7.m52851d(arrayList, 4);
            ArrayList arrayListM56332q = this.f7518g.m56332q(this.f7521j);
            if (FragmentManager.P0(2)) {
                Iterator it = this.f7520i.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    sq8.m48648g(next, "sharedElementFirstOutViews");
                    View view = (View) next;
                    StringBuilder sb = new StringBuilder();
                    sb.append("View: ");
                    sb.append(view);
                    sb.append(" Name: ");
                    sb.append(wvi.m55096I(view));
                }
                Iterator it2 = this.f7521j.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    sq8.m48648g(next2, "sharedElementLastInViews");
                    View view2 = (View) next2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("View: ");
                    sb2.append(view2);
                    sb2.append(" Name: ");
                    sb2.append(wvi.m55096I(view2));
                }
            }
            uk7Var.invoke();
            this.f7518g.m56333y(viewGroup, this.f7520i, this.f7521j, arrayListM56332q, this.f7522k);
            vi7.m52851d(arrayList, 0);
            this.f7518g.mo9921A(this.f7519h, this.f7520i, this.f7521j);
        }

        /* renamed from: C */
        public final void m6308C(Object obj) {
            this.f7529r = obj;
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: b */
        public boolean mo6286b() {
            boolean z;
            if (!this.f7518g.mo9932m()) {
                return false;
            }
            List<h> list = this.f7515d;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = true;
            } else {
                for (h hVar : list) {
                    if (!(Build.VERSION.SDK_INT >= 34 && hVar.m6324f() != null && this.f7518g.mo9933n(hVar.m6324f()))) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            if (!z) {
                return false;
            }
            Object obj = this.f7519h;
            return obj == null || this.f7518g.mo9933n(obj);
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: c */
        public void mo6280c(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            this.f7528q.m24745a();
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: d */
        public void mo6281d(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.f7515d) {
                    AbstractC2126l.d dVarM6293a = hVar.m6293a();
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Container ");
                        sb.append(viewGroup);
                        sb.append(" has not been laid out. Completing operation ");
                        sb.append(dVarM6293a);
                    }
                    hVar.m6293a().m6475e(this);
                }
                return;
            }
            Object obj = this.f7529r;
            if (obj != null) {
                xi7 xi7Var = this.f7518g;
                sq8.m48646e(obj);
                xi7Var.mo9926c(obj);
                if (FragmentManager.P0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ending execution of operations from ");
                    sb2.append(this.f7516e);
                    sb2.append(" to ");
                    sb2.append(this.f7517f);
                    return;
                }
                return;
            }
            hwc hwcVarM6310o = m6310o(viewGroup, this.f7517f, this.f7516e);
            ArrayList arrayList = (ArrayList) hwcVarM6310o.m31227a();
            Object objM31228b = hwcVarM6310o.m31228b();
            List list = this.f7515d;
            ArrayList<AbstractC2126l.d> arrayList2 = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).m6293a());
            }
            for (final AbstractC2126l.d dVar : arrayList2) {
                this.f7518g.mo9941w(dVar.m6478h(), objM31228b, this.f7528q, new Runnable() { // from class: o.dh5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2116b.g.m6305y(dVar, this);
                    }
                });
            }
            m6307B(arrayList, viewGroup, new a(viewGroup, objM31228b));
            if (FragmentManager.P0(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Completed executing operations from ");
                sb3.append(this.f7516e);
                sb3.append(" to ");
                sb3.append(this.f7517f);
            }
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: e */
        public void mo6287e(l91 l91Var, ViewGroup viewGroup) {
            sq8.m48649h(l91Var, "backEvent");
            sq8.m48649h(viewGroup, "container");
            Object obj = this.f7529r;
            if (obj != null) {
                this.f7518g.mo9938t(obj, l91Var.m36806a());
            }
        }

        @Override // androidx.fragment.app.AbstractC2126l.b
        /* renamed from: f */
        public void mo6288f(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                Iterator it = this.f7515d.iterator();
                while (it.hasNext()) {
                    AbstractC2126l.d dVarM6293a = ((h) it.next()).m6293a();
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Container ");
                        sb.append(viewGroup);
                        sb.append(" has not been laid out. Skipping onStart for operation ");
                        sb.append(dVarM6293a);
                    }
                }
                return;
            }
            if (m6316x() && this.f7519h != null && !mo6286b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring shared elements transition ");
                sb2.append(this.f7519h);
                sb2.append(" between ");
                sb2.append(this.f7516e);
                sb2.append(" and ");
                sb2.append(this.f7517f);
                sb2.append(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (mo6286b() && m6316x()) {
                final gge ggeVar = new gge();
                hwc hwcVarM6310o = m6310o(viewGroup, this.f7517f, this.f7516e);
                ArrayList arrayList = (ArrayList) hwcVarM6310o.m31227a();
                Object objM31228b = hwcVarM6310o.m31228b();
                List list = this.f7515d;
                ArrayList<AbstractC2126l.d> arrayList2 = new ArrayList(dh3.m23088v(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).m6293a());
                }
                for (final AbstractC2126l.d dVar : arrayList2) {
                    this.f7518g.mo9942x(dVar.m6478h(), objM31228b, this.f7528q, new Runnable() { // from class: o.eh5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2116b.g.m6306z(ggeVar);
                        }
                    }, new Runnable() { // from class: o.fh5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2116b.g.m6295A(dVar, this);
                        }
                    });
                }
                m6307B(arrayList, viewGroup, new b(viewGroup, objM31228b, ggeVar));
            }
        }

        /* renamed from: n */
        public final void m6309n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (kwi.m36270a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    sq8.m48648g(childAt, "child");
                    m6309n(arrayList, childAt);
                }
            }
        }

        /* renamed from: o */
        public final hwc m6310o(ViewGroup viewGroup, AbstractC2126l.d dVar, final AbstractC2126l.d dVar2) {
            Iterator it;
            final AbstractC2126l.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it2 = this.f7515d.iterator();
            boolean z = false;
            View view2 = null;
            while (it2.hasNext()) {
                if (((h) it2.next()).m6325g() && dVar2 != null && dVar3 != null && (!this.f7522k.isEmpty()) && this.f7519h != null) {
                    vi7.m52849a(dVar.m6478h(), dVar2.m6478h(), this.f7527p, this.f7525n, true);
                    pcc.m43344a(viewGroup, new Runnable() { // from class: o.gh5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2116b.g.m6302p(dVar3, dVar2, this);
                        }
                    });
                    this.f7520i.addAll(this.f7525n.values());
                    if (!this.f7524m.isEmpty()) {
                        Object obj = this.f7524m.get(0);
                        sq8.m48648g(obj, "exitingNames[0]");
                        view2 = (View) this.f7525n.get((String) obj);
                        this.f7518g.mo9940v(this.f7519h, view2);
                    }
                    this.f7521j.addAll(this.f7526o.values());
                    if (!this.f7523l.isEmpty()) {
                        Object obj2 = this.f7523l.get(0);
                        sq8.m48648g(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f7526o.get((String) obj2);
                        if (view3 != null) {
                            final xi7 xi7Var = this.f7518g;
                            pcc.m43344a(viewGroup, new Runnable() { // from class: o.hh5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2116b.g.m6303q(xi7Var, view3, rect);
                                }
                            });
                            z = true;
                        }
                    }
                    this.f7518g.mo9943z(this.f7519h, view, this.f7520i);
                    xi7 xi7Var2 = this.f7518g;
                    Object obj3 = this.f7519h;
                    xi7Var2.mo9937s(obj3, null, null, null, null, obj3, this.f7521j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = this.f7515d.iterator();
            Object objMo9935p = null;
            Object objMo9935p2 = null;
            while (it3.hasNext()) {
                h hVar = (h) it3.next();
                AbstractC2126l.d dVarM6293a = hVar.m6293a();
                Object objMo9930h = this.f7518g.mo9930h(hVar.m6324f());
                if (objMo9930h != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    it = it3;
                    View view4 = dVarM6293a.m6478h().mView;
                    Object obj4 = objMo9935p2;
                    sq8.m48648g(view4, "operation.fragment.mView");
                    m6309n(arrayList2, view4);
                    if (this.f7519h != null && (dVarM6293a == dVar2 || dVarM6293a == dVar3)) {
                        if (dVarM6293a == dVar2) {
                            arrayList2.removeAll(kh3.V0(this.f7520i));
                        } else {
                            arrayList2.removeAll(kh3.V0(this.f7521j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f7518g.mo9924a(objMo9930h, view);
                    } else {
                        this.f7518g.mo9925b(objMo9930h, arrayList2);
                        this.f7518g.mo9937s(objMo9930h, objMo9930h, arrayList2, null, null, null, null);
                        if (dVarM6293a.m6477g() == AbstractC2126l.d.b.GONE) {
                            dVarM6293a.m6486q(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(dVarM6293a.m6478h().mView);
                            this.f7518g.mo9936r(objMo9930h, dVarM6293a.m6478h().mView, arrayList3);
                            pcc.m43344a(viewGroup, new Runnable() { // from class: o.ih5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2116b.g.m6304r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarM6293a.m6477g() == AbstractC2126l.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z) {
                            this.f7518g.mo9939u(objMo9930h, rect);
                        }
                        if (FragmentManager.P0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Entering Transition: ");
                            sb.append(objMo9930h);
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                sq8.m48648g(next, "transitioningViews");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("View: ");
                                sb2.append((View) next);
                            }
                        }
                    } else {
                        this.f7518g.mo9940v(objMo9930h, view2);
                        if (FragmentManager.P0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Exiting Transition: ");
                            sb3.append(objMo9930h);
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Object next2 = it5.next();
                                sq8.m48648g(next2, "transitioningViews");
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("View: ");
                                sb4.append((View) next2);
                            }
                        }
                    }
                    if (hVar.m6326h()) {
                        objMo9935p = this.f7518g.mo9935p(objMo9935p, objMo9930h, null);
                        dVar3 = dVar;
                        it3 = it;
                        objMo9935p2 = obj4;
                    } else {
                        objMo9935p2 = this.f7518g.mo9935p(obj4, objMo9930h, null);
                    }
                } else {
                    it = it3;
                }
                dVar3 = dVar;
                it3 = it;
            }
            Object objMo9934o = this.f7518g.mo9934o(objMo9935p, objMo9935p2, this.f7519h);
            if (FragmentManager.P0(2)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Final merged transition: ");
                sb5.append(objMo9934o);
            }
            return new hwc(arrayList, objMo9934o);
        }

        /* renamed from: s */
        public final Object m6311s() {
            return this.f7529r;
        }

        /* renamed from: t */
        public final AbstractC2126l.d m6312t() {
            return this.f7516e;
        }

        /* renamed from: u */
        public final AbstractC2126l.d m6313u() {
            return this.f7517f;
        }

        /* renamed from: v */
        public final xi7 m6314v() {
            return this.f7518g;
        }

        /* renamed from: w */
        public final List m6315w() {
            return this.f7515d;
        }

        /* renamed from: x */
        public final boolean m6316x() {
            List list = this.f7515d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).m6293a().m6478h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    public static final class h extends f {

        /* renamed from: b */
        public final Object f7540b;

        /* renamed from: c */
        public final boolean f7541c;

        /* renamed from: d */
        public final Object f7542d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC2126l.d dVar, boolean z, boolean z2) {
            Object returnTransition;
            super(dVar);
            sq8.m48649h(dVar, "operation");
            AbstractC2126l.d.b bVarM6477g = dVar.m6477g();
            AbstractC2126l.d.b bVar = AbstractC2126l.d.b.VISIBLE;
            if (bVarM6477g == bVar) {
                Fragment fragmentM6478h = dVar.m6478h();
                returnTransition = z ? fragmentM6478h.getReenterTransition() : fragmentM6478h.getEnterTransition();
            } else {
                Fragment fragmentM6478h2 = dVar.m6478h();
                returnTransition = z ? fragmentM6478h2.getReturnTransition() : fragmentM6478h2.getExitTransition();
            }
            this.f7540b = returnTransition;
            this.f7541c = dVar.m6477g() == bVar ? z ? dVar.m6478h().getAllowReturnTransitionOverlap() : dVar.m6478h().getAllowEnterTransitionOverlap() : true;
            this.f7542d = z2 ? z ? dVar.m6478h().getSharedElementReturnTransition() : dVar.m6478h().getSharedElementEnterTransition() : null;
        }

        /* renamed from: c */
        public final xi7 m6321c() {
            xi7 xi7VarM6322d = m6322d(this.f7540b);
            xi7 xi7VarM6322d2 = m6322d(this.f7542d);
            if (xi7VarM6322d == null || xi7VarM6322d2 == null || xi7VarM6322d == xi7VarM6322d2) {
                return xi7VarM6322d == null ? xi7VarM6322d2 : xi7VarM6322d;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m6293a().m6478h() + " returned Transition " + this.f7540b + " which uses a different Transition  type than its shared element transition " + this.f7542d).toString());
        }

        /* renamed from: d */
        public final xi7 m6322d(Object obj) {
            if (obj == null) {
                return null;
            }
            xi7 xi7Var = vi7.f50411b;
            if (xi7Var != null && xi7Var.mo9929g(obj)) {
                return xi7Var;
            }
            xi7 xi7Var2 = vi7.f50412c;
            if (xi7Var2 != null && xi7Var2.mo9929g(obj)) {
                return xi7Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m6293a().m6478h() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        public final Object m6323e() {
            return this.f7542d;
        }

        /* renamed from: f */
        public final Object m6324f() {
            return this.f7540b;
        }

        /* renamed from: g */
        public final boolean m6325g() {
            return this.f7542d != null;
        }

        /* renamed from: h */
        public final boolean m6326h() {
            return this.f7541c;
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    public static final class i extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Collection f7543a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.f7543a = collection;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            sq8.m48649h(entry, "entry");
            return Boolean.valueOf(kh3.m35708X(this.f7543a, wvi.m55096I((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2116b(ViewGroup viewGroup) {
        super(viewGroup);
        sq8.m48649h(viewGroup, "container");
    }

    /* renamed from: G */
    public static final void m6273G(C2116b c2116b, AbstractC2126l.d dVar) {
        sq8.m48649h(c2116b, "this$0");
        sq8.m48649h(dVar, "$operation");
        c2116b.m6447c(dVar);
    }

    /* renamed from: F */
    public final void m6274F(List list) throws Resources.NotFoundException {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList2, ((b) it.next()).m6293a().m6476f());
        }
        boolean z = !arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = m6461t().getContext();
            AbstractC2126l.d dVarM6293a = bVar.m6293a();
            sq8.m48648g(context, "context");
            AbstractC2117c.a aVarM6285c = bVar.m6285c(context);
            if (aVarM6285c != null) {
                if (aVarM6285c.f7545b == null) {
                    arrayList.add(bVar);
                } else {
                    Fragment fragmentM6478h = dVarM6293a.m6478h();
                    if (!(!dVarM6293a.m6476f().isEmpty())) {
                        if (dVarM6293a.m6477g() == AbstractC2126l.d.b.GONE) {
                            dVarM6293a.m6486q(false);
                        }
                        dVarM6293a.m6473b(new c(bVar));
                        z2 = true;
                    } else if (FragmentManager.P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Ignoring Animator set on ");
                        sb.append(fragmentM6478h);
                        sb.append(" as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            AbstractC2126l.d dVarM6293a2 = bVar2.m6293a();
            Fragment fragmentM6478h2 = dVarM6293a2.m6478h();
            if (z) {
                if (FragmentManager.P0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(fragmentM6478h2);
                    sb2.append(" as Animations cannot run alongside Transitions.");
                }
            } else if (!z2) {
                dVarM6293a2.m6473b(new a(bVar2));
            } else if (FragmentManager.P0(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Ignoring Animation set on ");
                sb3.append(fragmentM6478h2);
                sb3.append(" as Animations cannot run alongside Animators.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02b1 A[RETURN] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6275H(List list, boolean z, AbstractC2126l.d dVar, AbstractC2126l.d dVar2) {
        Object objMo9922B;
        boolean z2;
        xi7 xi7Var;
        Iterator it;
        ArrayList<String> sharedElementSourceNames;
        ArrayList<String> sharedElementTargetNames;
        hwc hwcVarM53620a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((h) obj).m6294b()) {
                arrayList.add(obj);
            }
        }
        ArrayList<h> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((h) obj2).m6321c() != null) {
                arrayList2.add(obj2);
            }
        }
        xi7 xi7Var2 = null;
        for (h hVar : arrayList2) {
            xi7 xi7VarM6321c = hVar.m6321c();
            if (!(xi7Var2 == null || xi7VarM6321c == xi7Var2)) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.m6293a().m6478h() + " returned Transition " + hVar.m6324f() + " which uses a different Transition type than other Fragments.").toString());
            }
            xi7Var2 = xi7VarM6321c;
        }
        if (xi7Var2 == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        vo0 vo0Var = new vo0();
        ArrayList<String> arrayList5 = new ArrayList<>();
        ArrayList<String> arrayList6 = new ArrayList<>();
        vo0 vo0Var2 = new vo0();
        vo0 vo0Var3 = new vo0();
        Iterator it2 = arrayList2.iterator();
        ArrayList<String> arrayList7 = arrayList5;
        ArrayList<String> arrayList8 = arrayList6;
        loop3: while (true) {
            objMo9922B = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (!hVar2.m6325g() || dVar == null || dVar2 == null) {
                    xi7Var = xi7Var2;
                    it = it2;
                } else {
                    objMo9922B = xi7Var2.mo9922B(xi7Var2.mo9930h(hVar2.m6323e()));
                    sharedElementSourceNames = dVar2.m6478h().getSharedElementSourceNames();
                    sq8.m48648g(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = dVar.m6478h().getSharedElementSourceNames();
                    sq8.m48648g(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames2 = dVar.m6478h().getSharedElementTargetNames();
                    sq8.m48648g(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames2.size();
                    it = it2;
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i2));
                        ArrayList<String> arrayList9 = sharedElementTargetNames2;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                        }
                        i2++;
                        size = i3;
                        sharedElementTargetNames2 = arrayList9;
                    }
                    sharedElementTargetNames = dVar2.m6478h().getSharedElementTargetNames();
                    sq8.m48648g(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                    if (z) {
                        dVar.m6478h().getEnterTransitionCallback();
                        dVar2.m6478h().getExitTransitionCallback();
                        hwcVarM53620a = vyh.m53620a(null, null);
                    } else {
                        dVar.m6478h().getExitTransitionCallback();
                        dVar2.m6478h().getEnterTransitionCallback();
                        hwcVarM53620a = vyh.m53620a(null, null);
                    }
                    tq.m50332a(hwcVarM53620a.m31227a());
                    tq.m50332a(hwcVarM53620a.m31228b());
                    int size2 = sharedElementSourceNames.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        String str = sharedElementSourceNames.get(i4);
                        int i5 = size2;
                        sq8.m48648g(str, "exitingNames[i]");
                        String str2 = sharedElementTargetNames.get(i4);
                        sq8.m48648g(str2, "enteringNames[i]");
                        vo0Var.put(str, str2);
                        i4++;
                        size2 = i5;
                        xi7Var2 = xi7Var2;
                    }
                    xi7Var = xi7Var2;
                    if (FragmentManager.P0(2)) {
                        Iterator<String> it3 = sharedElementTargetNames.iterator();
                        while (it3.hasNext()) {
                            String next = it3.next();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Name: ");
                            sb.append(next);
                        }
                        Iterator<String> it4 = sharedElementSourceNames.iterator();
                        while (it4.hasNext()) {
                            String next2 = it4.next();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Name: ");
                            sb2.append(next2);
                        }
                    }
                    View view = dVar.m6478h().mView;
                    sq8.m48648g(view, "firstOut.fragment.mView");
                    m6276I(vo0Var2, view);
                    vo0Var2.m53077u(sharedElementSourceNames);
                    vo0Var.m53077u(vo0Var2.keySet());
                    View view2 = dVar2.m6478h().mView;
                    sq8.m48648g(view2, "lastIn.fragment.mView");
                    m6276I(vo0Var3, view2);
                    vo0Var3.m53077u(sharedElementTargetNames);
                    vo0Var3.m53077u(vo0Var.values());
                    vi7.m52850c(vo0Var, vo0Var3);
                    Collection collectionKeySet = vo0Var.keySet();
                    sq8.m48648g(collectionKeySet, "sharedElementNameMapping.keys");
                    m6277J(vo0Var2, collectionKeySet);
                    Collection collectionValues = vo0Var.values();
                    sq8.m48648g(collectionValues, "sharedElementNameMapping.values");
                    m6277J(vo0Var3, collectionValues);
                    if (vo0Var.isEmpty()) {
                        break;
                    }
                    arrayList8 = sharedElementSourceNames;
                    arrayList7 = sharedElementTargetNames;
                }
                it2 = it;
                xi7Var2 = xi7Var;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Ignoring shared elements transition ");
            sb3.append(objMo9922B);
            sb3.append(" between ");
            sb3.append(dVar);
            sb3.append(" and ");
            sb3.append(dVar2);
            sb3.append(" as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList3.clear();
            arrayList4.clear();
            arrayList8 = sharedElementSourceNames;
            arrayList7 = sharedElementTargetNames;
            it2 = it;
            xi7Var2 = xi7Var;
        }
        xi7 xi7Var3 = xi7Var2;
        if (objMo9922B == null) {
            if (arrayList2.isEmpty()) {
                z2 = true;
                if (z2) {
                    return;
                }
            } else {
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    if (!(((h) it5.next()).m6324f() == null)) {
                        z2 = false;
                        break;
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
        }
        g gVar = new g(arrayList2, dVar, dVar2, xi7Var3, objMo9922B, arrayList3, arrayList4, vo0Var, arrayList7, arrayList8, vo0Var2, vo0Var3, z);
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ((h) it6.next()).m6293a().m6473b(gVar);
        }
    }

    /* renamed from: I */
    public final void m6276I(Map map, View view) {
        String strM55096I = wvi.m55096I(view);
        if (strM55096I != null) {
            map.put(strM55096I, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    sq8.m48648g(childAt, "child");
                    m6276I(map, childAt);
                }
            }
        }
    }

    /* renamed from: J */
    public final void m6277J(vo0 vo0Var, Collection collection) {
        Set setEntrySet = vo0Var.entrySet();
        sq8.m48648g(setEntrySet, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        hh3.m30451K(setEntrySet, new i(collection));
    }

    /* renamed from: K */
    public final void m6278K(List list) {
        Fragment fragmentM6478h = ((AbstractC2126l.d) kh3.r0(list)).m6478h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2126l.d dVar = (AbstractC2126l.d) it.next();
            dVar.m6478h().mAnimationInfo.f7369c = fragmentM6478h.mAnimationInfo.f7369c;
            dVar.m6478h().mAnimationInfo.f7370d = fragmentM6478h.mAnimationInfo.f7370d;
            dVar.m6478h().mAnimationInfo.f7371e = fragmentM6478h.mAnimationInfo.f7371e;
            dVar.m6478h().mAnimationInfo.f7372f = fragmentM6478h.mAnimationInfo.f7372f;
        }
    }

    @Override // androidx.fragment.app.AbstractC2126l
    /* renamed from: d */
    public void mo6279d(List list, boolean z) throws Resources.NotFoundException {
        Object obj;
        Object next;
        sq8.m48649h(list, "operations");
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC2126l.d dVar = (AbstractC2126l.d) next;
            AbstractC2126l.d.b.a aVar = AbstractC2126l.d.b.Companion;
            View view = dVar.m6478h().mView;
            sq8.m48648g(view, "operation.fragment.mView");
            AbstractC2126l.d.b bVarM6488a = aVar.m6488a(view);
            AbstractC2126l.d.b bVar = AbstractC2126l.d.b.VISIBLE;
            if (bVarM6488a == bVar && dVar.m6477g() != bVar) {
                break;
            }
        }
        AbstractC2126l.d dVar2 = (AbstractC2126l.d) next;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            AbstractC2126l.d dVar3 = (AbstractC2126l.d) objPrevious;
            AbstractC2126l.d.b.a aVar2 = AbstractC2126l.d.b.Companion;
            View view2 = dVar3.m6478h().mView;
            sq8.m48648g(view2, "operation.fragment.mView");
            AbstractC2126l.d.b bVarM6488a2 = aVar2.m6488a(view2);
            AbstractC2126l.d.b bVar2 = AbstractC2126l.d.b.VISIBLE;
            if (bVarM6488a2 != bVar2 && dVar3.m6477g() == bVar2) {
                obj = objPrevious;
                break;
            }
        }
        AbstractC2126l.d dVar4 = (AbstractC2126l.d) obj;
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(dVar2);
            sb.append(" to ");
            sb.append(dVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m6278K(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final AbstractC2126l.d dVar5 = (AbstractC2126l.d) it2.next();
            arrayList.add(new b(dVar5, z));
            arrayList2.add(new h(dVar5, z, !z ? dVar5 != dVar4 : dVar5 != dVar2));
            dVar5.m6472a(new Runnable() { // from class: o.bh5
                @Override // java.lang.Runnable
                public final void run() {
                    C2116b.m6273G(this.f16205a, dVar5);
                }
            });
        }
        m6275H(arrayList2, z, dVar2, dVar4);
        m6274F(arrayList);
    }
}
