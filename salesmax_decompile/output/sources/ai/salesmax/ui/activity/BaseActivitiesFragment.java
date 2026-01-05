package ai.salesmax.ui.activity;

import ai.salesmax.model.Activities;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import ai.salesmax.ui.BaseFragment;
import ai.salesmax.ui.activity.BaseActivitiesFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC2145n;
import androidx.lifecycle.b0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.navigation.fragment.AbstractC2338a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Comment;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.Team;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import p001o.am7;
import p001o.be5;
import p001o.bub;
import p001o.ch3;
import p001o.ck6;
import p001o.dge;
import p001o.dh3;
import p001o.e84;
import p001o.f9g;
import p001o.fb1;
import p001o.fu5;
import p001o.gn;
import p001o.gq9;
import p001o.gu3;
import p001o.hae;
import p001o.hb1;
import p001o.hf5;
import p001o.hpb;
import p001o.iad;
import p001o.ib1;
import p001o.id5;
import p001o.iuf;
import p001o.j0f;
import p001o.je5;
import p001o.jgg;
import p001o.jm7;
import p001o.jnd;
import p001o.kf9;
import p001o.ll7;
import p001o.lmh;
import p001o.lpc;
import p001o.lv;
import p001o.mad;
import p001o.mii;
import p001o.mv;
import p001o.n64;
import p001o.n9c;
import p001o.nl7;
import p001o.oga;
import p001o.p9e;
import p001o.q5g;
import p001o.q9e;
import p001o.s2b;
import p001o.sq8;
import p001o.szb;
import p001o.tl7;
import p001o.uq8;
import p001o.uqb;
import p001o.vgf;
import p001o.w7e;
import p001o.wi0;
import p001o.wre;
import p001o.wx0;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;

/* loaded from: classes.dex */
public class BaseActivitiesFragment extends BaseFragment {

    /* renamed from: H */
    public lv f393H;

    /* renamed from: L */
    public hpb f394L;

    /* renamed from: M */
    public long f395M;

    /* renamed from: Q */
    public List f396Q;

    /* renamed from: X */
    public String f397X;

    /* renamed from: Y */
    public String f398Y;

    /* renamed from: Z */
    public ExoPlayer f399Z;

    /* renamed from: h */
    public mv f400h;
    public int h0;
    public long i0;
    public final RecyclerView.InterfaceC2382s j0;
    public boolean k0;
    public final RunnableC0304l l0;

    /* renamed from: q */
    public uqb f401q;

    /* renamed from: s */
    public gn f402s;

    /* renamed from: x */
    public boolean f403x;

    /* renamed from: y */
    public Handler f404y;

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$a */
    public /* synthetic */ class C0293a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f405a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f406b;

        static {
            int[] iArr = new int[ResultsChangedEvent.ResultsChangedEventType.values().length];
            try {
                iArr[ResultsChangedEvent.ResultsChangedEventType.INSERTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultsChangedEvent.ResultsChangedEventType.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResultsChangedEvent.ResultsChangedEventType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f405a = iArr;
            int[] iArr2 = new int[mv.values().length];
            try {
                iArr2[mv.ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[mv.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[mv.MY_TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f406b = iArr2;
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$b */
    public static final class C0294b extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ String f408b;

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f409a;

            static {
                int[] iArr = new int[q5g.values().length];
                try {
                    iArr[q5g.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q5g.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q5g.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f409a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0294b(String str) {
            super(1);
            this.f408b = str;
        }

        /* renamed from: c */
        public static final void m712c(BaseActivitiesFragment baseActivitiesFragment, String str, yne yneVar) {
            sq8.m48649h(baseActivitiesFragment, "this$0");
            sq8.m48649h(str, "$searchText");
            baseActivitiesFragment.f398Y = str;
            vgf.m52765k().m27866O(baseActivitiesFragment.t2());
            hpb hpbVar = baseActivitiesFragment.f394L;
            if (hpbVar == null) {
                return;
            }
            Object objM58023a = yneVar.m58023a();
            sq8.m48646e(objM58023a);
            hpbVar.setValue(objM58023a);
        }

        /* renamed from: b */
        public final void m713b(final yne yneVar) {
            if (yneVar != null) {
                final BaseActivitiesFragment baseActivitiesFragment = BaseActivitiesFragment.this;
                final String str = this.f408b;
                int i = a.f409a[yneVar.m58025c().ordinal()];
                if (i == 1) {
                    baseActivitiesFragment.E2(baseActivitiesFragment.s2().m29124z());
                    if (yneVar.m58023a() != null) {
                        j0f.m33008i(new Runnable() { // from class: o.nb1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseActivitiesFragment.C0294b.m712c(baseActivitiesFragment, str, yneVar);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    baseActivitiesFragment.Y1().v0.m13584d();
                    baseActivitiesFragment.Y1().v0.setVisibility(8);
                } else {
                    if (i != 3) {
                        return;
                    }
                    baseActivitiesFragment.Y1().v0.m13583c();
                    baseActivitiesFragment.Y1().v0.setVisibility(0);
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m713b((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$c */
    public static final class C0295c extends jgg implements nl7 {

        /* renamed from: a */
        public int f410a;

        /* renamed from: b */
        public /* synthetic */ Object f411b;

        public C0295c(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C0295c c0295c = new C0295c(n64Var);
            c0295c.f411b = obj;
            return c0295c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C0295c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f410a;
            if (i == 0) {
                wre.m54934b(obj);
                oga ogaVar = (oga) this.f411b;
                yne yneVarM58027b = yne.C18447a.m58027b(yne.f55736e, null, "No teams found", null, 4, null);
                this.f410a = 1;
                if (ogaVar.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d */
    public static final class C0296d implements ck6 {

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d$a */
        public static final class a implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ BaseActivitiesFragment f413a;

            /* renamed from: b */
            public final /* synthetic */ View f414b;

            /* renamed from: c */
            public final /* synthetic */ int f415c;

            public a(BaseActivitiesFragment baseActivitiesFragment, View view, int i) {
                this.f413a = baseActivitiesFragment;
                this.f414b = view;
                this.f415c = i;
            }

            /* renamed from: c */
            public static final void m716c(View view, BaseActivitiesFragment baseActivitiesFragment, EngagementSummary engagementSummary, int i) {
                sq8.m48649h(view, "$view");
                sq8.m48649h(baseActivitiesFragment, "this$0");
                sq8.m48649h(engagementSummary, "$engagement");
                Object parent = view.getParent();
                sq8.m48647f(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                View viewFindViewById = view2.findViewById(z8e.seekBar);
                sq8.m48648g(viewFindViewById, "findViewById(...)");
                View viewFindViewById2 = view2.findViewById(z8e.tvDuration);
                sq8.m48648g(viewFindViewById2, "findViewById(...)");
                ShapeableImageView shapeableImageView = (ShapeableImageView) view;
                baseActivitiesFragment.x2(engagementSummary, i, shapeableImageView, (SeekBar) viewFindViewById, (TextView) viewFindViewById2);
            }

            @Override // p001o.gu3
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(Engagement engagement) {
                sq8.m48649h(engagement, "it");
                if (this.f413a.getContext() != null) {
                    final EngagementSummary engagementSummary = new EngagementSummary(engagement);
                    if (engagementSummary.getCallRecordingUrl() != null) {
                        final View view = this.f414b;
                        final BaseActivitiesFragment baseActivitiesFragment = this.f413a;
                        final int i = this.f415c;
                        j0f.m33008i(new Runnable() { // from class: o.ob1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseActivitiesFragment.C0296d.a.m716c(view, baseActivitiesFragment, engagementSummary, i);
                            }
                        });
                    } else {
                        jm7.v0(this.f413a.requireActivity(), "Could not find recording to play!!!", 0, 0, 12, null);
                    }
                }
                this.f413a.F2(false);
            }
        }

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d$b */
        public static final class b implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ BaseActivitiesFragment f416a;

            /* renamed from: b */
            public final /* synthetic */ C0296d f417b;

            /* renamed from: c */
            public final /* synthetic */ Object f418c;

            public b(BaseActivitiesFragment baseActivitiesFragment, C0296d c0296d, Object obj) {
                this.f416a = baseActivitiesFragment;
                this.f417b = c0296d;
                this.f418c = obj;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                sq8.m48649h(th, "err");
                this.f416a.F2(false);
                this.f417b.getClass();
                String relatedObjectId = ((Activities) this.f418c).getRelatedObjectId();
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find engagement by id ");
                sb.append(relatedObjectId);
            }
        }

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d$c */
        public static final class c implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ BaseActivitiesFragment f419a;

            /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d$c$a */
            public static final class a extends kf9 implements xk7 {

                /* renamed from: a */
                public final /* synthetic */ BaseActivitiesFragment f420a;

                /* renamed from: b */
                public final /* synthetic */ LeadsSummary f421b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(BaseActivitiesFragment baseActivitiesFragment, LeadsSummary leadsSummary) {
                    super(1);
                    this.f420a = baseActivitiesFragment;
                    this.f421b = leadsSummary;
                }

                /* renamed from: a */
                public final void m722a(Context context) {
                    sq8.m48649h(context, "$this$checkIfFragmentAttached");
                    this.f420a.v2(this.f421b);
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m722a((Context) obj);
                    return y3i.f54824a;
                }
            }

            public c(BaseActivitiesFragment baseActivitiesFragment) {
                this.f419a = baseActivitiesFragment;
            }

            /* renamed from: c */
            public static final void m720c(BaseActivitiesFragment baseActivitiesFragment, LeadsSummary leadsSummary) {
                sq8.m48649h(baseActivitiesFragment, "this$0");
                sq8.m48649h(leadsSummary, "$leadsSummary");
                baseActivitiesFragment.S1(new a(baseActivitiesFragment, leadsSummary));
            }

            @Override // p001o.gu3
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(Contact contact) {
                sq8.m48649h(contact, "it");
                final LeadsSummary leadsSummary = new LeadsSummary(contact);
                final BaseActivitiesFragment baseActivitiesFragment = this.f419a;
                j0f.m33008i(new Runnable() { // from class: o.pb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseActivitiesFragment.C0296d.c.m720c(baseActivitiesFragment, leadsSummary);
                    }
                });
                this.f419a.F2(false);
            }
        }

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d$d */
        public static final class d implements gu3 {

            /* renamed from: b */
            public final /* synthetic */ Object f423b;

            public d(Object obj) {
                this.f423b = obj;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                sq8.m48649h(th, "err");
                C0296d.this.getClass();
                String relatedObjectId = ((Activities) this.f423b).getRelatedObjectId();
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find contact by id ");
                sb.append(relatedObjectId);
            }
        }

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d$e */
        public static final class e implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ BaseActivitiesFragment f424a;

            public e(BaseActivitiesFragment baseActivitiesFragment) {
                this.f424a = baseActivitiesFragment;
            }

            /* renamed from: c */
            public static final void m725c(BaseActivitiesFragment baseActivitiesFragment, EngagementSummary engagementSummary) {
                sq8.m48649h(baseActivitiesFragment, "this$0");
                sq8.m48649h(engagementSummary, "$engagement");
                baseActivitiesFragment.R1(engagementSummary.getId(), engagementSummary.getEngagementType());
            }

            @Override // p001o.gu3
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(Comment comment) {
                sq8.m48649h(comment, "it");
                if (comment.getEngagement() != null) {
                    Engagement engagement = comment.getEngagement();
                    sq8.m48648g(engagement, "getEngagement(...)");
                    final EngagementSummary engagementSummary = new EngagementSummary(engagement);
                    if (this.f424a.getContext() != null) {
                        final BaseActivitiesFragment baseActivitiesFragment = this.f424a;
                        j0f.m33008i(new Runnable() { // from class: o.qb1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseActivitiesFragment.C0296d.e.m725c(baseActivitiesFragment, engagementSummary);
                            }
                        });
                    }
                }
                this.f424a.F2(false);
            }
        }

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$d$f */
        public static final class f implements gu3 {

            /* renamed from: b */
            public final /* synthetic */ Object f426b;

            public f(Object obj) {
                this.f426b = obj;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                sq8.m48649h(th, "err");
                C0296d.this.getClass();
                String relatedObjectId = ((Activities) this.f426b).getRelatedObjectId();
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find comment by id ");
                sb.append(relatedObjectId);
            }
        }

        public C0296d() {
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            ck6.C12696a.m21336b(this, view, i, obj);
            try {
                sq8.m48647f(obj, "null cannot be cast to non-null type ai.salesmax.model.Activities");
                Activities activities = (Activities) obj;
                int id = view.getId();
                if (id == z8e.chip_user) {
                    BaseActivitiesFragment.this.L2(view, activities, true);
                } else if (id == z8e.chip_1) {
                    BaseActivitiesFragment.this.L2(view, activities, false);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return true;
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            String activityDoneById;
            String toPersonId;
            sq8.m48649h(view, "view");
            Context contextRequireContext = BaseActivitiesFragment.this.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                int id = view.getId();
                if (id == z8e.chip_1) {
                    if (!(obj instanceof Activities) || (toPersonId = ((Activities) obj).getToPersonId()) == null) {
                        return;
                    }
                    BaseActivitiesFragment.this.y2(toPersonId);
                    return;
                }
                if (id == z8e.chip_user) {
                    if (!(obj instanceof Activities) || (activityDoneById = ((Activities) obj).getActivityDoneById()) == null) {
                        return;
                    }
                    BaseActivitiesFragment.this.z2(activityDoneById);
                    return;
                }
                if (id == z8e.btnPlayPause) {
                    if (!(obj instanceof Activities) || BaseActivitiesFragment.this.b2()) {
                        return;
                    }
                    BaseActivitiesFragment.this.F2(true);
                    wi0.f0(((Activities) obj).getRelatedObjectId()).v0(new a(BaseActivitiesFragment.this, view, i), new b(BaseActivitiesFragment.this, this, obj));
                    return;
                }
                if (id == z8e.playRecordingBlock || !(obj instanceof Activities)) {
                    return;
                }
                Activities activities = (Activities) obj;
                if (sq8.m48644c(activities.getRelatedObjectType(), "ENGAGEMENT") && !BaseActivitiesFragment.this.b2()) {
                    BaseActivitiesFragment.this.F2(true);
                    BaseActivitiesFragment.this.R1(activities.getRelatedObjectId(), jm7.m34028N(activities.getActivityType()));
                }
                if (sq8.m48644c(activities.getRelatedObjectType(), "CONTACT") && !BaseActivitiesFragment.this.b2()) {
                    BaseActivitiesFragment.this.F2(true);
                    wi0.a0(activities.getRelatedObjectId()).v0(new c(BaseActivitiesFragment.this), new d(obj));
                }
                if (!sq8.m48644c(activities.getRelatedObjectType(), "COMMENT") || BaseActivitiesFragment.this.b2()) {
                    return;
                }
                BaseActivitiesFragment.this.F2(true);
                wi0.m54460Z(activities.getRelatedObjectId()).v0(new e(BaseActivitiesFragment.this), new f(obj));
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$e */
    public static final class C0297e implements RecyclerView.InterfaceC2382s {
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
        /* renamed from: a */
        public void mo728a(RecyclerView recyclerView, MotionEvent motionEvent) {
            sq8.m48649h(recyclerView, "rv");
            sq8.m48649h(motionEvent, "e");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
        /* renamed from: c */
        public boolean mo729c(RecyclerView recyclerView, MotionEvent motionEvent) {
            sq8.m48649h(recyclerView, "rv");
            sq8.m48649h(motionEvent, "e");
            if (motionEvent.getAction() != 2) {
                return false;
            }
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
        /* renamed from: e */
        public void mo730e(boolean z) {
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$f */
    public static final class C0298f implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ int f428b;

        /* renamed from: c */
        public final /* synthetic */ ShapeableImageView f429c;

        /* renamed from: d */
        public final /* synthetic */ SeekBar f430d;

        /* renamed from: e */
        public final /* synthetic */ TextView f431e;

        /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$f$a */
        public static final class a implements mad.InterfaceC15266d {

            /* renamed from: a */
            public final /* synthetic */ ShapeableImageView f432a;

            /* renamed from: b */
            public final /* synthetic */ SeekBar f433b;

            /* renamed from: c */
            public final /* synthetic */ BaseActivitiesFragment f434c;

            /* renamed from: d */
            public final /* synthetic */ TextView f435d;

            public a(ShapeableImageView shapeableImageView, SeekBar seekBar, BaseActivitiesFragment baseActivitiesFragment, TextView textView) {
                this.f432a = shapeableImageView;
                this.f433b = seekBar;
                this.f434c = baseActivitiesFragment;
                this.f435d = textView;
            }

            @Override // p001o.mad.InterfaceC15266d
            /* renamed from: F */
            public void mo734F(int i) {
                if (i != 4) {
                    return;
                }
                this.f432a.setImageResource(w7e.ic_play);
                this.f433b.setProgress(0);
                this.f434c.i0 = 0L;
                this.f434c.h0 = -1;
                ExoPlayer exoPlayer = this.f434c.f399Z;
                if (exoPlayer != null) {
                    exoPlayer.release();
                }
                this.f434c.f399Z = null;
                this.f434c.f404y.removeCallbacks(this.f434c.l0);
                this.f435d.setText(this.f434c.U1(0L));
                this.f435d.setVisibility(8);
            }

            @Override // p001o.mad.InterfaceC15266d
            /* renamed from: K */
            public void mo735K(iad iadVar) {
                sq8.m48649h(iadVar, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                String message = iadVar.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Error: ");
                sb.append(message);
                jm7.v0(this.f434c.requireActivity(), "Error playing audio", 0, 0, 12, null);
            }

            @Override // p001o.mad.InterfaceC15266d
            /* renamed from: M */
            public void mo736M(lmh lmhVar, int i) {
                ExoPlayer exoPlayer;
                sq8.m48649h(lmhVar, "timeline");
                if (i != 1 || (exoPlayer = this.f434c.f399Z) == null) {
                    return;
                }
                SeekBar seekBar = this.f433b;
                BaseActivitiesFragment baseActivitiesFragment = this.f434c;
                TextView textView = this.f435d;
                ShapeableImageView shapeableImageView = this.f432a;
                long duration = exoPlayer.getDuration();
                if (duration <= 0 || duration == -9223372036854775807L) {
                    return;
                }
                seekBar.setMax((int) duration);
                baseActivitiesFragment.N2(seekBar, textView);
                shapeableImageView.setImageResource(w7e.ic_pause);
            }

            @Override // p001o.mad.InterfaceC15266d
            public void q0(boolean z) {
                if (z) {
                    this.f434c.f404y.post(this.f434c.l0);
                } else {
                    this.f434c.f404y.removeCallbacks(this.f434c.l0);
                }
            }
        }

        public C0298f(int i, ShapeableImageView shapeableImageView, SeekBar seekBar, TextView textView) {
            this.f428b = i;
            this.f429c = shapeableImageView;
            this.f430d = seekBar;
            this.f431e = textView;
        }

        /* renamed from: c */
        public static final void m732c(BaseActivitiesFragment baseActivitiesFragment, int i, URL url, ShapeableImageView shapeableImageView, SeekBar seekBar, TextView textView) {
            sq8.m48649h(baseActivitiesFragment, "this$0");
            sq8.m48649h(url, "$fileUrl");
            sq8.m48649h(shapeableImageView, "$btnPlayPause");
            sq8.m48649h(seekBar, "$seekBar");
            sq8.m48649h(textView, "$tvDuration");
            ExoPlayer.C2189b c2189b = new ExoPlayer.C2189b(baseActivitiesFragment.requireContext());
            Context contextRequireContext = baseActivitiesFragment.requireContext();
            be5 be5Var = new be5();
            be5Var.m18784m(true);
            y3i y3iVar = y3i.f54824a;
            ExoPlayer exoPlayerM6842f = c2189b.m6844m(new hf5(contextRequireContext, be5Var)).m6842f();
            exoPlayerM6842f.a0(wx0.f52810g, true);
            s2b s2bVarM47470a = new s2b.C16718c().m47476g(url.toString()).m47470a();
            sq8.m48648g(s2bVarM47470a, "build(...)");
            jnd jndVarM34136g = new jnd.C14620b(new je5.C14508b()).mo6940e(s2bVarM47470a);
            sq8.m48648g(jndVarM34136g, "createMediaSource(...)");
            exoPlayerM6842f.mo6829q(jndVarM34136g);
            exoPlayerM6842f.mo31986n(s2bVarM47470a);
            exoPlayerM6842f.mo7137f();
            exoPlayerM6842f.mo7144s(true);
            exoPlayerM6842f.mo31984h(baseActivitiesFragment.i0);
            exoPlayerM6842f.mo7117G(new a(shapeableImageView, seekBar, baseActivitiesFragment, textView));
            baseActivitiesFragment.f399Z = exoPlayerM6842f;
            baseActivitiesFragment.h0 = i;
        }

        @Override // p001o.gu3
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(final URL url) {
            sq8.m48649h(url, "fileUrl");
            try {
                Handler handler = new Handler(Looper.getMainLooper());
                final BaseActivitiesFragment baseActivitiesFragment = BaseActivitiesFragment.this;
                final int i = this.f428b;
                final ShapeableImageView shapeableImageView = this.f429c;
                final SeekBar seekBar = this.f430d;
                final TextView textView = this.f431e;
                handler.post(new Runnable() { // from class: o.rb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseActivitiesFragment.C0298f.m732c(baseActivitiesFragment, i, url, shapeableImageView, seekBar, textView);
                    }
                });
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Error preparing ExoPlayer: ");
                sb.append(message);
                jm7.v0(BaseActivitiesFragment.this.requireActivity(), "Error playing audio", 0, 0, 12, null);
            }
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$g */
    public static final class C0299g implements gu3 {
        public C0299g() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "err");
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Error downloading file: ");
            sb.append(message);
            jm7.v0(BaseActivitiesFragment.this.requireActivity(), "Couldn't find file to play", 0, 0, 12, null);
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$h */
    public static final class C0300h implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f437a;

        public C0300h(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f437a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f437a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n9c) && (obj instanceof am7)) {
                return sq8.m48644c(mo37a(), ((am7) obj).mo37a());
            }
            return false;
        }

        public final int hashCode() {
            return mo37a().hashCode();
        }

        @Override // p001o.n9c
        public final /* synthetic */ void onChanged(Object obj) {
            this.f437a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$i */
    public static final class C0301i extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f438g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0301i(List list, C0302j c0302j) {
            super(c0302j, null, false, null, 14, null);
            this.f438g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_teams;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f438g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f438g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$j */
    public static final class C0302j implements ck6 {

        /* renamed from: b */
        public final /* synthetic */ List f440b;

        public C0302j(List list) {
            this.f440b = list;
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            Object next;
            RecyclerView.AbstractC2371h adapter;
            sq8.m48649h(view, "view");
            Context contextRequireContext = BaseActivitiesFragment.this.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Iterator it = this.f440b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((LeadsTeam) next).isSelected()) {
                            break;
                        }
                    }
                }
                LeadsTeam leadsTeam = (LeadsTeam) next;
                if (leadsTeam != null) {
                    leadsTeam.setSelected(false);
                    int iIndexOf = this.f440b.indexOf(leadsTeam);
                    if (iIndexOf >= 0 && (adapter = BaseActivitiesFragment.this.Y1().u0.getAdapter()) != null) {
                        adapter.notifyItemChanged(iIndexOf);
                    }
                }
                LeadsTeam leadsTeam2 = (LeadsTeam) this.f440b.get(i);
                leadsTeam2.setSelected(true);
                ((CheckBox) view.findViewById(z8e.chipData)).setChecked(true);
                BaseActivitiesFragment.this.u2();
                BaseActivitiesFragment.this.G2(leadsTeam2.getTeamId());
                BaseActivitiesFragment baseActivitiesFragment = BaseActivitiesFragment.this;
                String str = baseActivitiesFragment.f398Y;
                if (str == null) {
                    str = "";
                }
                baseActivitiesFragment.V1(str);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$k */
    public static final class C0303k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final /* synthetic */ TextView f442b;

        public C0303k(TextView textView) {
            this.f442b = textView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (seekBar != null) {
                    seekBar.performHapticFeedback(1);
                }
                long j = i;
                ExoPlayer exoPlayer = BaseActivitiesFragment.this.f399Z;
                if (exoPlayer != null) {
                    exoPlayer.mo31984h(j);
                }
                this.f442b.setText(BaseActivitiesFragment.this.U1(j));
                BaseActivitiesFragment.this.i0 = j;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: ai.salesmax.ui.activity.BaseActivitiesFragment$l */
    public static final class RunnableC0304l implements Runnable {
        public RunnableC0304l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            View view2;
            if (!BaseActivitiesFragment.this.isAdded() || BaseActivitiesFragment.this.f401q == null || BaseActivitiesFragment.this.Y1().t0 == null) {
                BaseActivitiesFragment.this.f404y.removeCallbacks(this);
                return;
            }
            ExoPlayer exoPlayer = BaseActivitiesFragment.this.f399Z;
            if (exoPlayer != null) {
                BaseActivitiesFragment baseActivitiesFragment = BaseActivitiesFragment.this;
                RecyclerView.d0 d0VarC0 = baseActivitiesFragment.Y1().t0.c0(baseActivitiesFragment.h0);
                TextView textView = null;
                SeekBar seekBar = (d0VarC0 == null || (view2 = d0VarC0.f9794a) == null) ? null : (SeekBar) view2.findViewById(z8e.seekBar);
                RecyclerView.d0 d0VarC02 = baseActivitiesFragment.Y1().t0.c0(baseActivitiesFragment.h0);
                if (d0VarC02 != null && (view = d0VarC02.f9794a) != null) {
                    textView = (TextView) view.findViewById(z8e.tvDuration);
                }
                if (seekBar != null && textView != null) {
                    seekBar.setProgress((int) exoPlayer.e0());
                    textView.setVisibility(0);
                    textView.setText(baseActivitiesFragment.U1(exoPlayer.e0()));
                }
                baseActivitiesFragment.f404y.postDelayed(this, 200L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseActivitiesFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void K2(BaseActivitiesFragment baseActivitiesFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNoContent");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseActivitiesFragment.J2(z);
    }

    public static final boolean M2(BaseActivitiesFragment baseActivitiesFragment, MenuItem menuItem) {
        sq8.m48649h(baseActivitiesFragment, "this$0");
        jm7.v0(baseActivitiesFragment.requireActivity(), (String) menuItem.getTitle(), 0, 0, 12, null);
        return false;
    }

    public static final ResultsChangeListener a2(BaseActivitiesFragment baseActivitiesFragment, PaginatedDataModel paginatedDataModel, RecyclerView.AbstractC2371h abstractC2371h) {
        sq8.m48649h(baseActivitiesFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(abstractC2371h);
        return baseActivitiesFragment.o2(paginatedDataModel, abstractC2371h);
    }

    public static final Integer e2(BaseActivitiesFragment baseActivitiesFragment, PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(baseActivitiesFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        return Integer.valueOf(baseActivitiesFragment.c2(paginatedDataModel));
    }

    public static final Object g2(BaseActivitiesFragment baseActivitiesFragment, PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(baseActivitiesFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "dataModel");
        return baseActivitiesFragment.new C0296d();
    }

    public static final Integer j2(BaseActivitiesFragment baseActivitiesFragment, PaginatedDataModel paginatedDataModel, Integer num) {
        sq8.m48649h(baseActivitiesFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(num);
        return Integer.valueOf(baseActivitiesFragment.h2(paginatedDataModel, num.intValue()));
    }

    public static final void l2(PaginatedDataModel paginatedDataModel, int i, BaseActivitiesFragment baseActivitiesFragment) {
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(baseActivitiesFragment, "this$0");
        String strM27487b = fu5.m27487b(((Activities) paginatedDataModel.get(i)).getCurrentSortByValue(), ((Activities) paginatedDataModel.get(i)).getSortedByDataType());
        baseActivitiesFragment.Y1().r0.setVisibility(0);
        if (strM27487b != null) {
            MaterialTextView materialTextView = baseActivitiesFragment.Y1().r0;
            String upperCase = strM27487b.toUpperCase(Locale.ROOT);
            sq8.m48648g(upperCase, "toUpperCase(...)");
            materialTextView.setText(upperCase);
        }
    }

    public static final Object n2(BaseActivitiesFragment baseActivitiesFragment, long j, PaginatedDataModel paginatedDataModel, Integer num) {
        sq8.m48649h(baseActivitiesFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(num);
        int iIntValue = num.intValue();
        String str = baseActivitiesFragment.f398Y;
        if (str == null) {
            str = "";
        }
        return baseActivitiesFragment.k2(paginatedDataModel, iIntValue, str, j);
    }

    public static final void p2(final dge dgeVar, final BaseActivitiesFragment baseActivitiesFragment, final PaginatedDataModel paginatedDataModel, final RecyclerView.AbstractC2371h abstractC2371h, final ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTime");
        sq8.m48649h(baseActivitiesFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(abstractC2371h, "$adapter");
        j0f.m33008i(new Runnable() { // from class: o.mb1
            @Override // java.lang.Runnable
            public final void run() {
                BaseActivitiesFragment.q2(dgeVar, baseActivitiesFragment, paginatedDataModel, abstractC2371h, resultsChangedEvent);
            }
        });
    }

    public static final void q2(dge dgeVar, BaseActivitiesFragment baseActivitiesFragment, PaginatedDataModel paginatedDataModel, RecyclerView.AbstractC2371h abstractC2371h, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTime");
        sq8.m48649h(baseActivitiesFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(abstractC2371h, "$adapter");
        if (dgeVar.f19803a) {
            baseActivitiesFragment.Y1().v0.m13584d();
            baseActivitiesFragment.Y1().v0.setVisibility(8);
            if (paginatedDataModel.size() == 0) {
                K2(baseActivitiesFragment, false, 1, null);
            } else {
                baseActivitiesFragment.u2();
            }
            dgeVar.f19803a = false;
        }
        sq8.m48646e(resultsChangedEvent);
        baseActivitiesFragment.w2(abstractC2371h, resultsChangedEvent);
    }

    public final void A2() {
        View view;
        View view2;
        View view3;
        ShapeableImageView shapeableImageView;
        ExoPlayer exoPlayer = this.f399Z;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        if (this.f399Z != null) {
            this.f404y.removeCallbacks(this.l0);
        }
        RecyclerView.d0 d0VarC0 = Y1().t0.c0(this.h0);
        if (d0VarC0 != null && (view3 = d0VarC0.f9794a) != null && (shapeableImageView = (ShapeableImageView) view3.findViewById(z8e.btnPlayPause)) != null) {
            shapeableImageView.setImageResource(w7e.ic_play);
        }
        SeekBar seekBar = null;
        TextView textView = (d0VarC0 == null || (view2 = d0VarC0.f9794a) == null) ? null : (TextView) view2.findViewById(z8e.tvDuration);
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (d0VarC0 != null && (view = d0VarC0.f9794a) != null) {
            seekBar = (SeekBar) view.findViewById(z8e.seekBar);
        }
        if (seekBar == null) {
            return;
        }
        seekBar.setProgress(0);
    }

    public final void B2(EngagementSummary engagementSummary, int i, ShapeableImageView shapeableImageView, SeekBar seekBar, TextView textView) {
        ExoPlayer exoPlayer = this.f399Z;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.f399Z = null;
        String callRecordingUrl = engagementSummary.getCallRecordingUrl();
        if (callRecordingUrl == null) {
            return;
        }
        gq9.m29296o(callRecordingUrl).v0(new C0298f(i, shapeableImageView, seekBar, textView), new C0299g());
    }

    public final void C2() {
        this.i0 = 0L;
        this.h0 = -1;
        ExoPlayer exoPlayer = this.f399Z;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        ExoPlayer exoPlayer2 = this.f399Z;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        this.f399Z = null;
    }

    public final void D2() {
        this.f398Y = null;
    }

    public final void E2(lv lvVar) {
        sq8.m48649h(lvVar, "<set-?>");
        this.f393H = lvVar;
    }

    public final void F2(boolean z) {
        this.k0 = z;
    }

    public final void G2(String str) {
        sq8.m48649h(str, "<set-?>");
        this.f397X = str;
    }

    public final void H2(List list) {
        Y1().u0.setAdapter(new C0301i(list, new C0302j(list)));
        Y1().u0.m9089k(this.j0);
        if (list.size() == 1) {
            Y1().u0.setVisibility(8);
        }
    }

    public final void I2(gn gnVar) {
        sq8.m48649h(gnVar, "<set-?>");
        this.f402s = gnVar;
    }

    public final void J2(boolean z) {
        if (z) {
            Y1().m0(true);
            Y1().l0(false);
            Y1().k0(false);
            uqb uqbVarY1 = Y1();
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            uqbVarY1.j0(bub.m19823b(contextRequireContext));
            return;
        }
        if (s2().m29124z().m37968C()) {
            String str = this.f398Y;
            if (str == null) {
                str = "";
            }
            if (!(str.length() > 0)) {
                Y1().l0(true);
                Y1().k0(false);
                Y1().m0(false);
                uqb uqbVarY12 = Y1();
                Context contextRequireContext2 = requireContext();
                sq8.m48648g(contextRequireContext2, "requireContext(...)");
                uqbVarY12.j0(bub.m19823b(contextRequireContext2));
                return;
            }
        }
        Y1().l0(false);
        Y1().k0(true);
        Y1().m0(false);
        uqb uqbVarY13 = Y1();
        Context contextRequireContext3 = requireContext();
        sq8.m48648g(contextRequireContext3, "requireContext(...)");
        uqbVarY13.j0(bub.m19823b(contextRequireContext3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r3.setAccessible(true);
        r7 = r3.get(r8);
        r9 = java.lang.Class.forName(r7.getClass().getName()).getMethod("setForceShowIcon", java.lang.Boolean.TYPE);
        p001o.sq8.m48648g(r9, "getMethod(...)");
        r9.invoke(r7, java.lang.Boolean.TRUE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L2(View view, Activities activities, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(view, "view");
        sq8.m48649h(activities, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.getMenuInflater().inflate(q9e.share_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: o.lb1
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return BaseActivitiesFragment.M2(this.f33539a, menuItem);
            }
        });
        if (Build.VERSION.SDK_INT >= 29) {
            popupMenu.setForceShowIcon(true);
        } else {
            try {
                Field[] declaredFields = popupMenu.getClass().getDeclaredFields();
                sq8.m48646e(declaredFields);
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field = declaredFields[i];
                    if (sq8.m48644c("mPopup", field.getName())) {
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        popupMenu.show();
    }

    public final void N2(SeekBar seekBar, TextView textView) {
        seekBar.setOnSeekBarChangeListener(new C0303k(textView));
    }

    public final void R1(String str, String str2) {
        sq8.m48649h(str, "engagementId");
        sq8.m48649h(str2, "engagementType");
        this.k0 = false;
        Bundle bundle = new Bundle();
        bundle.putString(getString(hae.argumentEngagementID), str);
        switch (str2.hashCode()) {
            case -1577559662:
                if (!str2.equals("WHATSAPP")) {
                    return;
                }
                break;
            case 82233:
                if (!str2.equals("SMS")) {
                    return;
                }
                break;
            case 2060894:
                if (str2.equals("CALL")) {
                    C2();
                    d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_callDetails, bundle);
                    return;
                }
                return;
            case 2402290:
                if (str2.equals("NOTE")) {
                    C2();
                    d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_notesDetails, bundle);
                    return;
                }
                return;
            case 2567557:
                if (str2.equals("TASK")) {
                    C2();
                    d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_taskDetails, bundle);
                    return;
                }
                return;
            case 66081660:
                if (!str2.equals("EMAIL")) {
                    return;
                }
                break;
            case 81679659:
                if (str2.equals("VISIT")) {
                    C2();
                    d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_visitDetails, bundle);
                    return;
                }
                return;
            default:
                return;
        }
        C2();
        d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_messageDetails, bundle);
    }

    public final void S1(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "operation");
        if (!isAdded() || getContext() == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        xk7Var.invoke(contextRequireContext);
    }

    public final void T1(String str) {
        sq8.m48649h(str, "searchText");
        C2();
        if (!Objects.equals(this.f398Y, str) || h1()) {
            W0(false);
            this.f398Y = str;
            V1(str);
        }
    }

    public final String U1(long j) {
        long j2 = j / 1000;
        long j3 = 60;
        return (j2 / j3) + ":" + f9g.o0(String.valueOf(j2 % j3), 2, '0');
    }

    public final void V1(String str) {
        W1(str).observe(getViewLifecycleOwner(), new C0300h(new C0294b(str)));
    }

    public final AbstractC2145n W1(String str) {
        int i = C0293a.f406b[this.f400h.ordinal()];
        if (i == 1) {
            return s2().m29107B(str);
        }
        if (i == 2) {
            return s2().m29106A(str);
        }
        if (i != 3) {
            throw new szb();
        }
        List listM21246k = null;
        if (!(!f9g.d0(this.f397X))) {
            return e84.m24521b(null, 0L, new C0295c(null), 3, null);
        }
        gn gnVarS2 = s2();
        String str2 = this.f397X;
        List list = this.f396Q;
        if (list != null) {
            listM21246k = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listM21246k.add(((LeadsTeam) it.next()).getId());
            }
        }
        if (listM21246k == null) {
            listM21246k = ch3.m21246k();
        }
        return gnVarS2.m29109D(str2, listM21246k, str);
    }

    public final lpc X1(AbstractC2145n abstractC2145n, long j) {
        lpc lpcVar = new lpc(getViewLifecycleOwner(), abstractC2145n, f2(), null, true, null, m2(j), i2(), d2(), Z1());
        lpcVar.setStateRestorationPolicy(RecyclerView.AbstractC2371h.a.PREVENT_WHEN_EMPTY);
        return lpcVar;
    }

    public final uqb Y1() {
        uqb uqbVar = this.f401q;
        sq8.m48646e(uqbVar);
        return uqbVar;
    }

    public final ll7 Z1() {
        return new fb1(this);
    }

    public final boolean b2() {
        return this.k0;
    }

    public final int c2(PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(paginatedDataModel, "dataModel");
        return paginatedDataModel.size();
    }

    public final Function d2() {
        return new Function() { // from class: o.gb1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseActivitiesFragment.e2(this.f24843a, (PaginatedDataModel) obj);
            }
        };
    }

    public final Function f2() {
        return new Function() { // from class: o.eb1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseActivitiesFragment.g2(this.f21266a, (PaginatedDataModel) obj);
            }
        };
    }

    public final int h2(PaginatedDataModel paginatedDataModel, int i) {
        return p9e.item_lead_activity;
    }

    public final ll7 i2() {
        return new hb1(this);
    }

    public final Object k2(final PaginatedDataModel paginatedDataModel, int i, String str, long j) {
        Activities activities = (Activities) paginatedDataModel.get(i);
        gn gnVarS2 = s2();
        sq8.m48646e(activities);
        gnVarS2.m29120s(activities, i >= 1 ? (Activities) paginatedDataModel.get(i - 1) : null, mv.ALL);
        activities.setPosition(Integer.valueOf(i));
        activities.setLastItemSeenAt(j);
        RecyclerView.AbstractC2379p layoutManager = Y1().t0.getLayoutManager();
        sq8.m48647f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        final int iL2 = ((LinearLayoutManager) layoutManager).l2();
        String.valueOf(iL2);
        if (paginatedDataModel.size() > 0 && iL2 != -1) {
            j0f.m33008i(new Runnable() { // from class: o.jb1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseActivitiesFragment.l2(paginatedDataModel, iL2, this);
                }
            });
        }
        return activities;
    }

    public final ll7 m2(long j) {
        return new ib1(this, j);
    }

    public final ResultsChangeListener o2(final PaginatedDataModel paginatedDataModel, final RecyclerView.AbstractC2371h abstractC2371h) {
        final dge dgeVar = new dge();
        dgeVar.f19803a = true;
        return new ResultsChangeListener() { // from class: o.kb1
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                BaseActivitiesFragment.p2(dgeVar, this, paginatedDataModel, abstractC2371h, resultsChangedEvent);
            }
        };
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            I2((gn) new b0(fragmentActivityRequireActivity).m6505a(gn.class));
            if (this.f400h == mv.MY_TEAM) {
                mii miiVarM29111F = s2().m29111F();
                AuthorizationLevel authorizationLevelM39162l = miiVarM29111F != null ? miiVarM29111F.m39162l() : null;
                if (AuthorizationLevel.SUPERADMIN == authorizationLevelM39162l || AuthorizationLevel.ADMIN == authorizationLevelM39162l) {
                    List listM54451Q = wi0.m54451Q();
                    if (listM54451Q.size() <= 0) {
                        this.f396Q = listM54451Q;
                        return;
                    }
                    Team teamJustId = Team.justId("ALL");
                    sq8.m48648g(teamJustId, "justId(...)");
                    ArrayList arrayListM21242g = ch3.m21242g(new LeadsTeam(teamJustId));
                    arrayListM21242g.addAll(listM54451Q);
                    this.f396Q = arrayListM21242g;
                    return;
                }
                List listM54453S = wi0.m54453S();
                if (listM54453S.size() <= 0) {
                    this.f396Q = listM54453S;
                    return;
                }
                Team teamJustId2 = Team.justId("ALL");
                sq8.m48648g(teamJustId2, "justId(...)");
                ArrayList arrayListM21242g2 = ch3.m21242g(new LeadsTeam(teamJustId2));
                arrayListM21242g2.addAll(listM54453S);
                this.f396Q = arrayListM21242g2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f401q == null) {
            uqb uqbVarH0 = uqb.h0(layoutInflater, viewGroup, false);
            this.f401q = uqbVarH0;
            if (uqbVarH0 != null) {
                Long lM27882i = vgf.m52765k().m27882i(this.f400h);
                sq8.m48648g(lM27882i, "getLastActivitiesSeenAt(...)");
                this.f395M = lM27882i.longValue();
                hpb hpbVar = this.f394L;
                sq8.m48646e(hpbVar);
                lpc lpcVarX1 = X1(hpbVar, this.f395M);
                uqbVarH0.t0.setItemAnimator(null);
                uqbVarH0.t0.setAdapter(lpcVarX1);
                Context contextRequireContext = requireContext();
                sq8.m48648g(contextRequireContext, "requireContext(...)");
                uqbVarH0.j0(bub.m19823b(contextRequireContext));
                if (this.f400h == mv.MY_TEAM) {
                    Object objOrElse = Optional.ofNullable(this.f396Q).orElse(new ArrayList());
                    sq8.m48648g(objOrElse, "orElse(...)");
                    List list = (List) objOrElse;
                    if (list.isEmpty()) {
                        J2(true);
                    } else {
                        this.f397X = ((LeadsTeam) list.get(0)).getTeamId();
                        ((LeadsTeam) list.get(0)).setSelected(true);
                        H2(list);
                    }
                } else {
                    uqbVarH0.u0.setVisibility(8);
                }
            }
        }
        View viewM25689B = Y1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        PaginatedDataModel paginatedDataModel;
        super.onDestroy();
        ExoPlayer exoPlayer = this.f399Z;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.f399Z = null;
        hpb hpbVar = this.f394L;
        if (hpbVar != null && (paginatedDataModel = (PaginatedDataModel) hpbVar.getValue()) != null) {
            paginatedDataModel.reset();
        }
        this.f394L = null;
        this.f396Q = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f401q != null) {
            Y1().t0.setAdapter(null);
            Y1().u0.setAdapter(null);
        }
        this.f404y.removeCallbacks(this.l0);
        this.f404y.removeCallbacksAndMessages(null);
        this.f401q = null;
    }

    public final String r2() {
        return this.f397X;
    }

    public final gn s2() {
        gn gnVar = this.f402s;
        if (gnVar != null) {
            return gnVar;
        }
        sq8.m48667z("viewModel");
        return null;
    }

    public final mv t2() {
        return this.f400h;
    }

    public final void u2() {
        Y1().l0(false);
        Y1().k0(false);
        Y1().m0(false);
        uqb uqbVarY1 = Y1();
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        uqbVarY1.j0(bub.m19823b(contextRequireContext));
    }

    public final void v2(LeadsSummary leadsSummary) {
        sq8.m48649h(leadsSummary, "leadsSummary");
        Bundle bundle = new Bundle();
        bundle.putParcelable(getString(hae.argumentLeads), leadsSummary.toLeads());
        C2();
        d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_leadDetails, bundle);
    }

    public final void w2(RecyclerView.AbstractC2371h abstractC2371h, ResultsChangedEvent resultsChangedEvent) {
        ResultsChangedEvent.ResultsChangedEventType resultsChangedEventTypeEventType = resultsChangedEvent.eventType();
        int i = resultsChangedEventTypeEventType == null ? -1 : C0293a.f405a[resultsChangedEventTypeEventType.ordinal()];
        if (i == 1) {
            abstractC2371h.notifyItemRangeInserted(resultsChangedEvent.start(), resultsChangedEvent.count());
            RecyclerView.AbstractC2379p layoutManager = Y1().t0.getLayoutManager();
            sq8.m48647f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            if (((LinearLayoutManager) layoutManager).l2() == 0) {
                abstractC2371h.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == 2) {
            abstractC2371h.notifyItemChanged(resultsChangedEvent.start(), Integer.valueOf(resultsChangedEvent.count()));
        } else if (i != 3) {
            abstractC2371h.notifyItemChanged(resultsChangedEvent.start(), Integer.valueOf(resultsChangedEvent.count()));
        } else {
            abstractC2371h.notifyItemRangeRemoved(resultsChangedEvent.start(), resultsChangedEvent.count());
        }
    }

    public final void x2(EngagementSummary engagementSummary, int i, ShapeableImageView shapeableImageView, SeekBar seekBar, TextView textView) {
        shapeableImageView.performHapticFeedback(1);
        if (this.h0 == i) {
            ExoPlayer exoPlayer = this.f399Z;
            if (exoPlayer != null && exoPlayer.mo31982V()) {
                ExoPlayer exoPlayer2 = this.f399Z;
                this.i0 = exoPlayer2 != null ? exoPlayer2.e0() : 0L;
                ExoPlayer exoPlayer3 = this.f399Z;
                if (exoPlayer3 != null) {
                    exoPlayer3.pause();
                }
                shapeableImageView.setImageResource(w7e.ic_play);
                return;
            }
        }
        if (this.h0 != i) {
            A2();
            this.i0 = 0L;
        }
        B2(engagementSummary, i, shapeableImageView, seekBar, textView);
    }

    public final void y2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(getString(hae.argumentLeadId), str);
        C2();
        d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_leadDetails, bundle);
    }

    public final void z2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(getString(hae.argumentUser), str);
        C2();
        d1(AbstractC2338a.m8705a(this), z8e.activity_start, z8e.action_activity_to_userDetails, bundle);
    }

    public BaseActivitiesFragment(mv mvVar) {
        sq8.m48649h(mvVar, "viewOptionType");
        this.f400h = mvVar;
        this.f403x = true;
        this.f404y = new Handler(Looper.getMainLooper());
        this.f394L = new hpb();
        this.f397X = "";
        this.h0 = -1;
        this.j0 = new C0297e();
        this.l0 = new RunnableC0304l();
    }

    public /* synthetic */ BaseActivitiesFragment(mv mvVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? mv.ALL : mvVar);
    }
}
