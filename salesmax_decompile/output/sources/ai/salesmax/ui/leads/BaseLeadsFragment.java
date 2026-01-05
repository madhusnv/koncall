package ai.salesmax.ui.leads;

import ai.salesmax.AbstractC0059a;
import ai.salesmax.RecordingDialogFragment;
import ai.salesmax.StreamingVoiceNoteFragment;
import ai.salesmax.model.AutoCallConfig;
import ai.salesmax.model.ChatMessageSummary;
import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.FileData;
import ai.salesmax.model.LeadPlaceCall;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.Template;
import ai.salesmax.model.TemplateTypes;
import ai.salesmax.model.UploadedFileSummary;
import ai.salesmax.model.VideoMeeting;
import ai.salesmax.model.WhatsAppTemplates;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import ai.salesmax.services.model.CloudTelephonyClickToCallResponse;
import ai.salesmax.ui.BaseFragment;
import ai.salesmax.ui.leads.BaseLeadsFragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.DialogInterfaceC1782a;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC2145n;
import androidx.lifecycle.C2151t;
import androidx.lifecycle.b0;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.C2332c;
import androidx.navigation.fragment.AbstractC2338a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.Team;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC10973a;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import p001o.am7;
import p001o.bub;
import p001o.cba;
import p001o.ch3;
import p001o.ck6;
import p001o.cpf;
import p001o.d83;
import p001o.dge;
import p001o.dh3;
import p001o.du7;
import p001o.e84;
import p001o.eb0;
import p001o.ecc;
import p001o.f9g;
import p001o.fu5;
import p001o.gd1;
import p001o.gd2;
import p001o.gge;
import p001o.ggh;
import p001o.gu3;
import p001o.hae;
import p001o.hd1;
import p001o.hpb;
import p001o.id5;
import p001o.iuf;
import p001o.j0f;
import p001o.jgg;
import p001o.jm7;
import p001o.jvi;
import p001o.k11;
import p001o.kf9;
import p001o.l8j;
import p001o.l9f;
import p001o.ll7;
import p001o.lpc;
import p001o.mii;
import p001o.n64;
import p001o.n8e;
import p001o.n9c;
import p001o.nl7;
import p001o.nta;
import p001o.oga;
import p001o.p9e;
import p001o.q5g;
import p001o.qae;
import p001o.rd9;
import p001o.s6d;
import p001o.sq8;
import p001o.szb;
import p001o.tc1;
import p001o.th1;
import p001o.tl7;
import p001o.uf8;
import p001o.uk7;
import p001o.uq8;
import p001o.v10;
import p001o.vdf;
import p001o.vgf;
import p001o.vqf;
import p001o.wi0;
import p001o.wre;
import p001o.wx9;
import p001o.xca;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;
import p001o.z9b;

/* loaded from: classes.dex */
public class BaseLeadsFragment extends BaseFragment implements ecc {

    /* renamed from: H */
    public k11 f2443H;

    /* renamed from: L */
    public PaginatedDataModel f2444L;

    /* renamed from: M */
    public PaginatedDataModel f2445M;

    /* renamed from: Q */
    public l8j f2446Q;

    /* renamed from: X */
    public boolean f2447X;

    /* renamed from: Y */
    public boolean f2448Y;

    /* renamed from: Z */
    public String f2449Z;

    /* renamed from: h */
    public wx9 f2450h;
    public DialogC10973a h0;
    public l9f i0;
    public hpb j0;
    public long k0;
    public Handler l0;
    public List m0;
    public String n0;
    public EngagementSummary o0;
    public uf8 p0;

    /* renamed from: q */
    public eb0 f2451q;
    public gd2 q0;
    public View r0;

    /* renamed from: s */
    public cba f2452s;
    public final RecyclerView.InterfaceC2382s s0;

    /* renamed from: x */
    public d83 f2453x;

    /* renamed from: y */
    public ggh f2454y;

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$a */
    public /* synthetic */ class C0889a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2455a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2456b;

        static {
            int[] iArr = new int[wx9.values().length];
            try {
                iArr[wx9.ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wx9.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wx9.MY_TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2455a = iArr;
            int[] iArr2 = new int[ResultsChangedEvent.ResultsChangedEventType.values().length];
            try {
                iArr2[ResultsChangedEvent.ResultsChangedEventType.INSERTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ResultsChangedEvent.ResultsChangedEventType.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ResultsChangedEvent.ResultsChangedEventType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f2456b = iArr2;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$b */
    public static final class C0890b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ ChatMessages f2457a;

        /* renamed from: b */
        public final /* synthetic */ BaseLeadsFragment f2458b;

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f2459a;

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
                f2459a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0890b(ChatMessages chatMessages, BaseLeadsFragment baseLeadsFragment) {
            super(1);
            this.f2457a = chatMessages;
            this.f2458b = baseLeadsFragment;
        }

        /* renamed from: a */
        public final void m1872a(yne yneVar) {
            BaseLeadsFragment baseLeadsFragment = this.f2458b;
            int i = a.f2459a[yneVar.m58025c().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                jm7.v0(baseLeadsFragment.requireActivity(), "Couldn't send message!!", 0, 0, 12, null);
            } else {
                ChatMessageSummary chatMessageSummary = (ChatMessageSummary) yneVar.m58023a();
                if (chatMessageSummary != null) {
                    chatMessageSummary.toChatMessages();
                }
                jm7.v0(baseLeadsFragment.requireActivity(), "Message sent sucessfully!!", 0, 0, 12, null);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1872a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$c */
    public static final class C0891c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ cpf f2460a;

        /* renamed from: b */
        public final /* synthetic */ BaseLeadsFragment f2461b;

        /* renamed from: c */
        public final /* synthetic */ hpb f2462c;

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f2463a;

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
                f2463a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0891c(cpf cpfVar, BaseLeadsFragment baseLeadsFragment, hpb hpbVar) {
            super(1);
            this.f2460a = cpfVar;
            this.f2461b = baseLeadsFragment;
            this.f2462c = hpbVar;
        }

        /* renamed from: c */
        public static final void m1874c(cpf cpfVar, BaseLeadsFragment baseLeadsFragment, yne yneVar, hpb hpbVar) {
            sq8.m48649h(cpfVar, "$templateBinding");
            sq8.m48649h(baseLeadsFragment, "this$0");
            sq8.m48649h(hpbVar, "$fileTemplatesLiveData");
            cpfVar.r0.m13584d();
            cpfVar.r0.setVisibility(8);
            baseLeadsFragment.f2444L = (PaginatedDataModel) yneVar.m58023a();
            hpbVar.setValue(baseLeadsFragment.f2444L);
        }

        /* renamed from: b */
        public final void m1875b(final yne yneVar) {
            final cpf cpfVar = this.f2460a;
            final BaseLeadsFragment baseLeadsFragment = this.f2461b;
            final hpb hpbVar = this.f2462c;
            int i = a.f2463a[yneVar.m58025c().ordinal()];
            if (i == 1) {
                if (yneVar.m58023a() != null) {
                    j0f.m33008i(new Runnable() { // from class: o.kd1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseLeadsFragment.C0891c.m1874c(cpfVar, baseLeadsFragment, yneVar, hpbVar);
                        }
                    });
                }
            } else if (i == 2) {
                cpfVar.r0.m13584d();
                cpfVar.r0.setVisibility(8);
            } else {
                if (i != 3) {
                    return;
                }
                cpfVar.r0.m13583c();
                cpfVar.r0.setVisibility(0);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1875b((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$d */
    public static final class C0892d extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ String f2465b;

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$d$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f2466a;

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
                f2466a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0892d(String str) {
            super(1);
            this.f2465b = str;
        }

        /* renamed from: c */
        public static final void m1877c(BaseLeadsFragment baseLeadsFragment, String str, yne yneVar) {
            sq8.m48649h(baseLeadsFragment, "this$0");
            sq8.m48649h(str, "$searchTerm");
            baseLeadsFragment.f2449Z = str;
            vgf.m52765k().b0(baseLeadsFragment.O2());
            hpb hpbVar = baseLeadsFragment.j0;
            if (hpbVar == null) {
                return;
            }
            Object objM58023a = yneVar.m58023a();
            sq8.m48646e(objM58023a);
            hpbVar.setValue(objM58023a);
        }

        /* renamed from: b */
        public final void m1878b(final yne yneVar) {
            final BaseLeadsFragment baseLeadsFragment = BaseLeadsFragment.this;
            final String str = this.f2465b;
            int i = a.f2466a[yneVar.m58025c().ordinal()];
            if (i == 1) {
                if (yneVar.m58023a() != null) {
                    j0f.m33008i(new Runnable() { // from class: o.ld1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseLeadsFragment.C0892d.m1877c(baseLeadsFragment, str, yneVar);
                        }
                    });
                }
            } else if (i == 2) {
                baseLeadsFragment.s2().v0.m13584d();
                baseLeadsFragment.s2().v0.setVisibility(8);
            } else {
                if (i != 3) {
                    return;
                }
                baseLeadsFragment.P2();
                baseLeadsFragment.s2().v0.m13583c();
                baseLeadsFragment.s2().v0.setVisibility(0);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1878b((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$e */
    public static final class C0893e extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ cpf f2467a;

        /* renamed from: b */
        public final /* synthetic */ BaseLeadsFragment f2468b;

        /* renamed from: c */
        public final /* synthetic */ hpb f2469c;

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$e$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f2470a;

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
                f2470a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0893e(cpf cpfVar, BaseLeadsFragment baseLeadsFragment, hpb hpbVar) {
            super(1);
            this.f2467a = cpfVar;
            this.f2468b = baseLeadsFragment;
            this.f2469c = hpbVar;
        }

        /* renamed from: c */
        public static final void m1880c(cpf cpfVar, BaseLeadsFragment baseLeadsFragment, yne yneVar, hpb hpbVar) {
            sq8.m48649h(cpfVar, "$templateBinding");
            sq8.m48649h(baseLeadsFragment, "this$0");
            sq8.m48649h(hpbVar, "$whatsAppTemplatesLiveData");
            cpfVar.r0.m13584d();
            cpfVar.r0.setVisibility(8);
            baseLeadsFragment.f2445M = (PaginatedDataModel) yneVar.m58023a();
            hpbVar.setValue(baseLeadsFragment.f2445M);
        }

        /* renamed from: b */
        public final void m1881b(final yne yneVar) {
            if (yneVar != null) {
                final cpf cpfVar = this.f2467a;
                final BaseLeadsFragment baseLeadsFragment = this.f2468b;
                final hpb hpbVar = this.f2469c;
                int i = a.f2470a[yneVar.m58025c().ordinal()];
                if (i == 1) {
                    if (yneVar.m58023a() != null) {
                        j0f.m33008i(new Runnable() { // from class: o.md1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseLeadsFragment.C0893e.m1880c(cpfVar, baseLeadsFragment, yneVar, hpbVar);
                            }
                        });
                    }
                } else if (i == 2) {
                    cpfVar.r0.m13584d();
                    cpfVar.r0.setVisibility(8);
                } else {
                    if (i != 3) {
                        return;
                    }
                    cpfVar.r0.m13583c();
                    cpfVar.r0.setVisibility(0);
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1881b((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$f */
    public static final class C0894f implements ck6 {

        /* renamed from: b */
        public final /* synthetic */ PaginatedDataModel f2472b;

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$f$a */
        public static final class a implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ BaseLeadsFragment f2473a;

            /* renamed from: b */
            public final /* synthetic */ View f2474b;

            /* renamed from: c */
            public final /* synthetic */ Object f2475c;

            /* renamed from: d */
            public final /* synthetic */ int f2476d;

            /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$f$a$a, reason: collision with other inner class name */
            public static final class C19527a implements gu3 {

                /* renamed from: a */
                public final /* synthetic */ BaseLeadsFragment f2477a;

                /* renamed from: b */
                public final /* synthetic */ Leads f2478b;

                public C19527a(BaseLeadsFragment baseLeadsFragment, Leads leads) {
                    this.f2477a = baseLeadsFragment;
                    this.f2478b = leads;
                }

                /* renamed from: c */
                public static final void m1886c(boolean z, BaseLeadsFragment baseLeadsFragment, Leads leads) {
                    sq8.m48649h(baseLeadsFragment, "this$0");
                    if (!z) {
                        jm7.v0(baseLeadsFragment.requireActivity(), "You don't have Whatsapp Business Account setup.", 0, 0, 12, null);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(baseLeadsFragment.getString(hae.argumentLeads), leads);
                    bundle.putString(baseLeadsFragment.getString(hae.argumentChatWindowMode), "standalone");
                    Context contextRequireContext = baseLeadsFragment.requireContext();
                    sq8.m48648g(contextRequireContext, "requireContext(...)");
                    rd9.m46558b(contextRequireContext);
                    baseLeadsFragment.d1(AbstractC2338a.m8705a(baseLeadsFragment), z8e.leads_start, z8e.action_leads_to_chat_window, bundle);
                }

                @Override // p001o.gu3
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    m1887b(((Boolean) obj).booleanValue());
                }

                /* renamed from: b */
                public final void m1887b(final boolean z) {
                    final BaseLeadsFragment baseLeadsFragment = this.f2477a;
                    final Leads leads = this.f2478b;
                    j0f.m33008i(new Runnable() { // from class: o.od1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseLeadsFragment.C0894f.a.C19527a.m1886c(z, baseLeadsFragment, leads);
                        }
                    });
                }
            }

            /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$f$a$b */
            public static final class b implements gu3 {

                /* renamed from: a */
                public final /* synthetic */ BaseLeadsFragment f2479a;

                /* renamed from: b */
                public final /* synthetic */ Leads f2480b;

                /* renamed from: c */
                public final /* synthetic */ int f2481c;

                /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$f$a$b$a, reason: collision with other inner class name */
                public static final class C19528a extends kf9 implements xk7 {

                    /* renamed from: a */
                    public final /* synthetic */ Leads f2482a;

                    /* renamed from: b */
                    public final /* synthetic */ BaseLeadsFragment f2483b;

                    /* renamed from: c */
                    public final /* synthetic */ int f2484c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19528a(Leads leads, BaseLeadsFragment baseLeadsFragment, int i) {
                        super(1);
                        this.f2482a = leads;
                        this.f2483b = baseLeadsFragment;
                        this.f2484c = i;
                    }

                    /* renamed from: a */
                    public final void m1891a(EngagementSummary engagementSummary) {
                        sq8.m48649h(engagementSummary, "it3");
                        this.f2482a.setOpenVideoCallDetail(null);
                        RecyclerView.AbstractC2371h adapter = this.f2483b.s2().t0.getAdapter();
                        if (adapter != null) {
                            adapter.notifyItemChanged(this.f2484c);
                        }
                    }

                    @Override // p001o.xk7
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m1891a((EngagementSummary) obj);
                        return y3i.f54824a;
                    }
                }

                public b(BaseLeadsFragment baseLeadsFragment, Leads leads, int i) {
                    this.f2479a = baseLeadsFragment;
                    this.f2480b = leads;
                    this.f2481c = i;
                }

                /* renamed from: c */
                public static final void m1889c(BaseLeadsFragment baseLeadsFragment, Tasks tasks, Leads leads, int i) {
                    sq8.m48649h(baseLeadsFragment, "this$0");
                    sq8.m48649h(tasks, "$fetchedVideoEngagement");
                    C19528a c19528a = new C19528a(leads, baseLeadsFragment, i);
                    Context contextRequireContext = baseLeadsFragment.requireContext();
                    sq8.m48648g(contextRequireContext, "requireContext(...)");
                    xca viewLifecycleOwner = baseLeadsFragment.getViewLifecycleOwner();
                    sq8.m48648g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    LayoutInflater layoutInflater = baseLeadsFragment.getLayoutInflater();
                    sq8.m48648g(layoutInflater, "getLayoutInflater(...)");
                    sq8.m48646e(leads);
                    jvi.m34596j(contextRequireContext, baseLeadsFragment, viewLifecycleOwner, layoutInflater, tasks, leads, c19528a);
                }

                @Override // p001o.gu3
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final void accept(Engagement engagement) throws NumberFormatException {
                    sq8.m48649h(engagement, "it2");
                    final Tasks task = new EngagementSummary(engagement).toTask();
                    final BaseLeadsFragment baseLeadsFragment = this.f2479a;
                    final Leads leads = this.f2480b;
                    final int i = this.f2481c;
                    j0f.m33008i(new Runnable() { // from class: o.pd1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseLeadsFragment.C0894f.a.b.m1889c(baseLeadsFragment, task, leads, i);
                        }
                    });
                }
            }

            /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$f$a$c */
            public static final class c extends kf9 implements xk7 {

                /* renamed from: a */
                public final /* synthetic */ BaseLeadsFragment f2485a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(BaseLeadsFragment baseLeadsFragment) {
                    super(1);
                    this.f2485a = baseLeadsFragment;
                }

                /* renamed from: c */
                public static final void m1893c(BaseLeadsFragment baseLeadsFragment, CloudTelephonyClickToCallResponse cloudTelephonyClickToCallResponse) {
                    sq8.m48649h(baseLeadsFragment, "this$0");
                    sq8.m48649h(cloudTelephonyClickToCallResponse, "$resp");
                    jm7.v0(baseLeadsFragment.requireActivity(), cloudTelephonyClickToCallResponse.getMessage(), 0, 0, 12, null);
                }

                /* renamed from: b */
                public final void m1894b(final CloudTelephonyClickToCallResponse cloudTelephonyClickToCallResponse) {
                    sq8.m48649h(cloudTelephonyClickToCallResponse, "resp");
                    final BaseLeadsFragment baseLeadsFragment = this.f2485a;
                    j0f.m33008i(new Runnable() { // from class: o.qd1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseLeadsFragment.C0894f.a.c.m1893c(baseLeadsFragment, cloudTelephonyClickToCallResponse);
                        }
                    });
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m1894b((CloudTelephonyClickToCallResponse) obj);
                    return y3i.f54824a;
                }
            }

            public a(BaseLeadsFragment baseLeadsFragment, View view, Object obj, int i) {
                this.f2473a = baseLeadsFragment;
                this.f2474b = view;
                this.f2475c = obj;
                this.f2476d = i;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Leads leads) {
                if (this.f2473a.f2447X) {
                    this.f2474b.performHapticFeedback(1);
                    RecyclerView.AbstractC2379p layoutManager = this.f2473a.s2().t0.getLayoutManager();
                    if (layoutManager != null) {
                        int i = this.f2476d;
                        BaseLeadsFragment baseLeadsFragment = this.f2473a;
                        if (layoutManager.mo9033S(i) != null) {
                            leads.setSelected(!leads.isSelected());
                            Fragment parentFragment = baseLeadsFragment.getParentFragment();
                            sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.ui.leads.LeadsFragment");
                            ((LeadsFragment) parentFragment).s7(leads.isSelected(), leads);
                            RecyclerView.AbstractC2371h adapter = baseLeadsFragment.s2().t0.getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemChanged(i);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                int id = this.f2474b.getId();
                if (id == z8e.leadOwnerName) {
                    Object obj = this.f2475c;
                    if (obj instanceof Leads) {
                        this.f2473a.h3(((Leads) obj).getContactOwnerID());
                        return;
                    }
                    return;
                }
                if (id == z8e.leadCall) {
                    this.f2474b.performHapticFeedback(1);
                    if (this.f2473a.getActivity() == null || !(!leads.getPhoneNumbers().isEmpty())) {
                        return;
                    }
                    BaseLeadsFragment baseLeadsFragment2 = this.f2473a;
                    if (!baseLeadsFragment2.a1(baseLeadsFragment2.Y0())) {
                        BaseLeadsFragment baseLeadsFragment3 = this.f2473a;
                        sq8.m48646e(leads);
                        BaseFragment.T0(baseLeadsFragment3, leads, 0, 2, null);
                        return;
                    }
                    if ((!leads.getPhoneNumbers().isEmpty()) && leads.getPhoneNumbers().size() == 1) {
                        String str = leads.getPhoneNumbers().get(0);
                        sq8.m48648g(str, "get(...)");
                        FragmentActivity fragmentActivityRequireActivity = this.f2473a.requireActivity();
                        sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
                        jm7.m34050j(str, fragmentActivityRequireActivity, leads);
                        return;
                    }
                    if (!(!leads.getPhoneNumbers().isEmpty()) || leads.getPhoneNumbers().size() <= 1) {
                        return;
                    }
                    BaseLeadsFragment baseLeadsFragment4 = this.f2473a;
                    Context contextRequireContext = baseLeadsFragment4.requireContext();
                    sq8.m48648g(contextRequireContext, "requireContext(...)");
                    sq8.m48646e(leads);
                    baseLeadsFragment4.A3(contextRequireContext, leads, "call");
                    return;
                }
                if (id == z8e.leadCallCloud) {
                    this.f2474b.performHapticFeedback(1);
                    if (this.f2473a.getActivity() == null || !(!leads.getPhoneNumbers().isEmpty())) {
                        return;
                    }
                    c cVar = new c(this.f2473a);
                    String str2 = leads.getPhoneNumbers().get(0);
                    sq8.m48648g(str2, "get(...)");
                    FragmentActivity fragmentActivityRequireActivity2 = this.f2473a.requireActivity();
                    sq8.m48648g(fragmentActivityRequireActivity2, "requireActivity(...)");
                    jm7.m34056p(str2, fragmentActivityRequireActivity2, leads, null, cVar, 8, null);
                    return;
                }
                if (id == z8e.leadAdd) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(this.f2473a.getString(hae.argumentLeads), leads);
                    bundle.putBoolean(this.f2473a.getString(hae.argumentLeadsOpenAddSheet), true);
                    BaseLeadsFragment baseLeadsFragment5 = this.f2473a;
                    baseLeadsFragment5.d1(AbstractC2338a.m8705a(baseLeadsFragment5), z8e.leads_start, z8e.action_leads_to_leadDetails, bundle);
                    return;
                }
                if (id == z8e.leadEdit) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(this.f2473a.getString(hae.argumentLeads), leads);
                    BaseLeadsFragment baseLeadsFragment6 = this.f2473a;
                    baseLeadsFragment6.d1(AbstractC2338a.m8705a(baseLeadsFragment6), z8e.leads_start, z8e.action_leads_to_editLead, bundle2);
                    return;
                }
                if (id == z8e.leadMessage) {
                    if (this.f2473a.getActivity() != null && (!leads.getPhoneNumbers().isEmpty()) && (this.f2475c instanceof Leads)) {
                        BaseLeadsFragment baseLeadsFragment7 = this.f2473a;
                        Context contextRequireContext2 = baseLeadsFragment7.requireContext();
                        sq8.m48648g(contextRequireContext2, "requireContext(...)");
                        baseLeadsFragment7.b3(contextRequireContext2, (Leads) this.f2475c);
                        return;
                    }
                    return;
                }
                if (id == z8e.leadShare) {
                    if (this.f2473a.getActivity() != null) {
                        sq8.m48646e(leads);
                        FragmentActivity fragmentActivityRequireActivity3 = this.f2473a.requireActivity();
                        sq8.m48648g(fragmentActivityRequireActivity3, "requireActivity(...)");
                        jm7.q0(leads, fragmentActivityRequireActivity3);
                        return;
                    }
                    return;
                }
                if (id == z8e.leadWhatsapp) {
                    if (this.f2473a.getContext() != null) {
                        BaseLeadsFragment baseLeadsFragment8 = this.f2473a;
                        Context contextRequireContext3 = baseLeadsFragment8.requireContext();
                        sq8.m48648g(contextRequireContext3, "requireContext(...)");
                        baseLeadsFragment8.i3(contextRequireContext3, leads);
                        return;
                    }
                    return;
                }
                if (id == z8e.leadVoiceNote) {
                    this.f2474b.performHapticFeedback(1);
                    if (this.f2473a.getContext() == null || !(this.f2475c instanceof Leads) || this.f2473a.getChildFragmentManager().W0()) {
                        return;
                    }
                    try {
                        if (AbstractC0059a.m132a().m3214B()) {
                            StreamingVoiceNoteFragment streamingVoiceNoteFragmentM78a = StreamingVoiceNoteFragment.f198f.m78a((Leads) this.f2475c);
                            streamingVoiceNoteFragmentM78a.setStyle(2, qae.FullWidthDialog);
                            streamingVoiceNoteFragmentM78a.show(this.f2473a.getChildFragmentManager(), "StreamingVoiceNoteDialog");
                            this.f2473a.getChildFragmentManager().h0();
                        } else {
                            RecordingDialogFragment recordingDialogFragmentM76b = RecordingDialogFragment.C0032a.m76b(RecordingDialogFragment.f181M, (Leads) this.f2475c, null, 2, null);
                            recordingDialogFragmentM76b.setStyle(2, qae.FullWidthDialog);
                            recordingDialogFragmentM76b.show(this.f2473a.getChildFragmentManager(), "AudioRecordDialog");
                            this.f2473a.getChildFragmentManager().h0();
                            recordingDialogFragmentM76b.b1();
                        }
                        return;
                    } catch (IllegalStateException e) {
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to show recording dialog: ");
                        sb.append(message);
                        return;
                    }
                }
                if (id == z8e.leadConversation) {
                    this.f2474b.performHapticFeedback(1);
                    wi0.r0(null, 1, null).u0(new C19527a(this.f2473a, leads));
                    return;
                }
                if (id == z8e.leadInfo || id == z8e.ivContactProfilePic) {
                    this.f2474b.performHapticFeedback(1);
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(this.f2473a.getString(hae.argumentLeads), leads);
                    Context contextRequireContext4 = this.f2473a.requireContext();
                    sq8.m48648g(contextRequireContext4, "requireContext(...)");
                    rd9.m46558b(contextRequireContext4);
                    BaseLeadsFragment baseLeadsFragment9 = this.f2473a;
                    baseLeadsFragment9.d1(AbstractC2338a.m8705a(baseLeadsFragment9), z8e.leads_start, z8e.action_leads_to_leadDetails, bundle3);
                    return;
                }
                if ((id == z8e.paymentPendingBlock || id == z8e.ivPaymentMethod) || id == z8e.paymentAmount) {
                    this.f2474b.performHapticFeedback(1);
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(this.f2473a.getString(hae.argumentLeadId), leads.getContactID());
                    Context contextRequireContext5 = this.f2473a.requireContext();
                    sq8.m48648g(contextRequireContext5, "requireContext(...)");
                    rd9.m46558b(contextRequireContext5);
                    BaseLeadsFragment baseLeadsFragment10 = this.f2473a;
                    baseLeadsFragment10.d1(AbstractC2338a.m8705a(baseLeadsFragment10), z8e.leads_start, z8e.action_leads_to_payments, bundle4);
                    return;
                }
                if (id == z8e.btnJoinMeeting) {
                    this.f2474b.performHapticFeedback(1);
                    if (leads.getOpenVideoCallDetail() != null) {
                        VideoMeeting openVideoCallDetail = leads.getOpenVideoCallDetail();
                        sq8.m48646e(openVideoCallDetail);
                        if (openVideoCallDetail.getVideoCallLink().length() > 0) {
                            Context contextRequireContext6 = this.f2473a.requireContext();
                            sq8.m48648g(contextRequireContext6, "requireContext(...)");
                            BaseLeadsFragment baseLeadsFragment11 = this.f2473a;
                            VideoMeeting openVideoCallDetail2 = leads.getOpenVideoCallDetail();
                            sq8.m48646e(openVideoCallDetail2);
                            du7.m23833a(contextRequireContext6, baseLeadsFragment11, openVideoCallDetail2.getVideoCallLink());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (id == z8e.btnUpdateMeetingStatus) {
                    if (leads.getOpenVideoCallDetail() != null) {
                        VideoMeeting openVideoCallDetail3 = leads.getOpenVideoCallDetail();
                        sq8.m48646e(openVideoCallDetail3);
                        if (openVideoCallDetail3.getId().length() > 0) {
                            VideoMeeting openVideoCallDetail4 = leads.getOpenVideoCallDetail();
                            sq8.m48646e(openVideoCallDetail4);
                            wi0.f0(openVideoCallDetail4.getId()).u0(new b(this.f2473a, leads, this.f2476d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (id == z8e.itemLeadRoot) {
                    View viewFindViewById = this.f2474b.findViewById(z8e.actionGroup);
                    boolean z = viewFindViewById.getVisibility() == 0;
                    View viewM2 = this.f2473a.M2();
                    if (viewM2 != null) {
                        th1.m49867s(viewM2, false);
                    }
                    this.f2473a.r3(null);
                    th1.m49867s(viewFindViewById, !z);
                    this.f2473a.r3(viewFindViewById);
                }
            }
        }

        public C0894f(PaginatedDataModel paginatedDataModel) {
            this.f2472b = paginatedDataModel;
        }

        /* renamed from: e */
        public static final Leads m1883e(PaginatedDataModel paginatedDataModel, int i) {
            sq8.m48649h(paginatedDataModel, "$dataModel");
            return (Leads) paginatedDataModel.get(i);
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            ck6.C12696a.m21336b(this, view, i, obj);
            if (view.getId() != z8e.leadMessage) {
                try {
                    if (view.getId() != z8e.itemLeadRoot) {
                        View viewM2 = BaseLeadsFragment.this.M2();
                        if (viewM2 != null) {
                            th1.m49867s(viewM2, false);
                        }
                        BaseLeadsFragment.this.r3(null);
                    }
                    BaseLeadsFragment.this.f2447X = true;
                    Leads leads = (Leads) this.f2472b.get(i);
                    leads.setSelected(leads.isSelected() ? false : true);
                    ((CheckBox) view.getRootView().findViewById(z8e.itemCheckBox)).setChecked(leads.isSelected());
                    Fragment parentFragment = BaseLeadsFragment.this.getParentFragment();
                    sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.ui.leads.LeadsFragment");
                    ((LeadsFragment) parentFragment).s7(leads.isSelected(), leads);
                    RecyclerView.AbstractC2371h adapter = BaseLeadsFragment.this.s2().t0.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if ((obj instanceof Leads) && BaseLeadsFragment.this.getActivity() != null) {
                Leads leads2 = (Leads) obj;
                if (!leads2.getPhoneNumbers().isEmpty()) {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    String str = leads2.getPhoneNumbers().get(0);
                    sq8.m48648g(str, "get(...)");
                    intent.setData(Uri.parse("smsto:" + str));
                    if (intent.resolveActivity(BaseLeadsFragment.this.requireContext().getPackageManager()) != null) {
                        BaseLeadsFragment.this.startActivity(Intent.createChooser(intent, "Choose messaging app"));
                    }
                }
            }
            return true;
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, final int i, Object obj) {
            sq8.m48649h(view, "view");
            Context contextRequireContext = BaseLeadsFragment.this.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                final PaginatedDataModel paginatedDataModel = this.f2472b;
                j0f.m33009j(new Callable() { // from class: o.nd1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return BaseLeadsFragment.C0894f.m1883e(paginatedDataModel, i);
                    }
                }, new a(BaseLeadsFragment.this, view, obj, i));
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$g */
    public static final class C0895g extends jgg implements nl7 {

        /* renamed from: a */
        public int f2486a;

        /* renamed from: b */
        public /* synthetic */ Object f2487b;

        public C0895g(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C0895g c0895g = new C0895g(n64Var);
            c0895g.f2487b = obj;
            return c0895g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C0895g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f2486a;
            if (i == 0) {
                wre.m54934b(obj);
                oga ogaVar = (oga) this.f2487b;
                yne yneVarM58027b = yne.C18447a.m58027b(yne.f55736e, null, "No teams found", null, 4, null);
                this.f2486a = 1;
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

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$h */
    public static final class C0896h implements RecyclerView.InterfaceC2382s {
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

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$i */
    public static final class C0897i extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ AbstractC2333d f2489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0897i(AbstractC2333d abstractC2333d) {
            super(1);
            this.f2489b = abstractC2333d;
        }

        /* renamed from: b */
        public static final boolean m1897b(String str, Leads leads) {
            return Objects.equals(leads.getContactID(), str);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(final String str) {
            PaginatedDataModel paginatedDataModel;
            C2151t c2151tM8556h;
            PaginatedDataModel paginatedDataModel2;
            hpb hpbVar = BaseLeadsFragment.this.j0;
            if (hpbVar != null && (paginatedDataModel2 = (PaginatedDataModel) hpbVar.getValue()) != null) {
                paginatedDataModel2.deleteItemsByPredicate(new Predicate() { // from class: o.rd1
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return BaseLeadsFragment.C0897i.m1897b(str, (Leads) obj);
                    }
                });
            }
            C2332c c2332cM8590F = this.f2489b.m8590F();
            if (c2332cM8590F != null && (c2151tM8556h = c2332cM8590F.m8556h()) != null) {
            }
            hpb hpbVar2 = BaseLeadsFragment.this.j0;
            if (((hpbVar2 == null || (paginatedDataModel = (PaginatedDataModel) hpbVar2.getValue()) == null) ? 0 : paginatedDataModel.size()) == 0) {
                BaseLeadsFragment.x3(BaseLeadsFragment.this, false, 1, null);
            }
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$j */
    public static final class C0898j extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ AbstractC2333d f2491b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0898j(AbstractC2333d abstractC2333d) {
            super(1);
            this.f2491b = abstractC2333d;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Integer) obj);
            return y3i.f54824a;
        }

        public final void invoke(Integer num) {
            C2151t c2151tM8556h;
            sq8.m48646e(num);
            if (num.intValue() > 0) {
                BaseLeadsFragment.n2(BaseLeadsFragment.this, "", false, 2, null);
            }
            C2332c c2332cM8590F = this.f2491b.m8590F();
            if (c2332cM8590F == null || (c2151tM8556h = c2332cM8590F.m8556h()) == null) {
                return;
            }
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$k */
    public static final class C0899k extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ AbstractC2333d f2493b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0899k(AbstractC2333d abstractC2333d) {
            super(1);
            this.f2493b = abstractC2333d;
        }

        /* renamed from: c */
        public static final boolean m1899c(Leads leads, Leads leads2) {
            return Objects.equals(leads2.getContactID(), leads.getContactID());
        }

        /* renamed from: b */
        public final void m1900b(final Leads leads) {
            C2151t c2151tM8556h;
            PaginatedDataModel paginatedDataModel;
            leads.getContactID();
            hpb hpbVar = BaseLeadsFragment.this.j0;
            if (hpbVar != null && (paginatedDataModel = (PaginatedDataModel) hpbVar.getValue()) != null) {
                paginatedDataModel.updateItemByPredicate(new Predicate() { // from class: o.sd1
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return BaseLeadsFragment.C0899k.m1899c(leads, (Leads) obj);
                    }
                }, leads);
            }
            C2332c c2332cM8590F = this.f2493b.m8590F();
            if (c2332cM8590F == null || (c2151tM8556h = c2332cM8590F.m8556h()) == null) {
                return;
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1900b((Leads) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$l */
    public static final class C0900l implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ hpb f2494a;

        public C0900l(hpb hpbVar) {
            this.f2494a = hpbVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            this.f2494a.setValue((editable == null || (string = editable.toString()) == null) ? null : f9g.Z0(string).toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$m */
    public static final class C0901m extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ uk7 f2495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0901m(uk7 uk7Var) {
            super(1);
            this.f2495a = uk7Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            this.f2495a.invoke();
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$n */
    public static final class C0902n extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ uk7 f2496a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0902n(uk7 uk7Var) {
            super(1);
            this.f2496a = uk7Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            this.f2496a.invoke();
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$o */
    public static final class C0903o extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ cpf f2498b;

        /* renamed from: c */
        public final /* synthetic */ Leads f2499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0903o(cpf cpfVar, Leads leads) {
            super(1);
            this.f2498b = cpfVar;
            this.f2499c = leads;
        }

        /* renamed from: a */
        public final void m1901a(PaginatedDataModel paginatedDataModel) {
            BaseLeadsFragment baseLeadsFragment = BaseLeadsFragment.this;
            sq8.m48646e(paginatedDataModel);
            baseLeadsFragment.o3(paginatedDataModel, this.f2498b, this.f2499c);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1901a((PaginatedDataModel) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$p */
    public static final class C0904p extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ cpf f2501b;

        /* renamed from: c */
        public final /* synthetic */ Leads f2502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0904p(cpf cpfVar, Leads leads) {
            super(1);
            this.f2501b = cpfVar;
            this.f2502c = leads;
        }

        /* renamed from: a */
        public final void m1902a(PaginatedDataModel paginatedDataModel) {
            BaseLeadsFragment baseLeadsFragment = BaseLeadsFragment.this;
            sq8.m48646e(paginatedDataModel);
            baseLeadsFragment.t3(paginatedDataModel, this.f2501b, this.f2502c);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1902a((PaginatedDataModel) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$q */
    public static final class C0905q extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ hpb f2503a;

        /* renamed from: b */
        public final /* synthetic */ hpb f2504b;

        /* renamed from: c */
        public final /* synthetic */ BaseLeadsFragment f2505c;

        /* renamed from: d */
        public final /* synthetic */ z9b f2506d;

        /* renamed from: e */
        public final /* synthetic */ cpf f2507e;

        /* renamed from: f */
        public final /* synthetic */ z9b f2508f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0905q(hpb hpbVar, hpb hpbVar2, BaseLeadsFragment baseLeadsFragment, z9b z9bVar, cpf cpfVar, z9b z9bVar2) {
            super(0);
            this.f2503a = hpbVar;
            this.f2504b = hpbVar2;
            this.f2505c = baseLeadsFragment;
            this.f2506d = z9bVar;
            this.f2507e = cpfVar;
            this.f2508f = z9bVar2;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68679invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68679invoke() {
            String str = (String) this.f2503a.getValue();
            if (str == null) {
                str = "";
            }
            String str2 = (String) this.f2504b.getValue();
            String str3 = str2 != null ? str2 : "";
            if ("Whatsapp Templates".equals(str)) {
                this.f2505c.r2(str, str3, this.f2508f, this.f2507e);
            } else {
                this.f2505c.o2(str, str3, this.f2506d, this.f2507e);
            }
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$r */
    public static final class C0906r implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f2509a;

        public C0906r(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f2509a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f2509a;
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
            this.f2509a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$s */
    public static final class C0907s extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$s$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f2511a;

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
                f2511a = iArr;
            }
        }

        public C0907s() {
            super(1);
        }

        /* renamed from: a */
        public final void m1903a(yne yneVar) {
            int i = a.f2511a[yneVar.m58025c().ordinal()];
            if (i == 1) {
                jm7.v0(BaseLeadsFragment.this.requireActivity(), "Message sent sucessfully!!", 0, 0, 12, null);
            } else {
                if (i != 2) {
                    return;
                }
                jm7.v0(BaseLeadsFragment.this.requireActivity(), "Couldn't send message!!", 0, 0, 12, null);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1903a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$t */
    public static final class C0908t extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f2512g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0908t(List list, C0909u c0909u) {
            super(c0909u, null, false, null, 14, null);
            this.f2512g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_teams;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f2512g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f2512g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$u */
    public static final class C0909u implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ List f2513a;

        /* renamed from: b */
        public final /* synthetic */ BaseLeadsFragment f2514b;

        public C0909u(List list, BaseLeadsFragment baseLeadsFragment) {
            this.f2513a = list;
            this.f2514b = baseLeadsFragment;
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
            Iterator it = this.f2513a.iterator();
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
                int iIndexOf = this.f2513a.indexOf(leadsTeam);
                if (iIndexOf >= 0 && (adapter = this.f2514b.s2().u0.getAdapter()) != null) {
                    adapter.notifyItemChanged(iIndexOf);
                }
            }
            LeadsTeam leadsTeam2 = (LeadsTeam) this.f2513a.get(i);
            leadsTeam2.setSelected(true);
            ((CheckBox) view.findViewById(z8e.chipData)).setChecked(true);
            this.f2514b.P2();
            this.f2514b.n0 = leadsTeam2.getTeamId();
            BaseLeadsFragment baseLeadsFragment = this.f2514b;
            String str = baseLeadsFragment.f2449Z;
            if (str == null) {
                str = "";
            }
            baseLeadsFragment.p2(str);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$v */
    public static final class C0910v extends iuf {

        /* renamed from: g */
        public final /* synthetic */ PaginatedDataModel f2515g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0910v(PaginatedDataModel paginatedDataModel, C0911w c0911w) {
            super(c0911w, null, false, null, 14, null);
            this.f2515g = paginatedDataModel;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_file_template_to_send;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            String.valueOf(i);
            Template template = (Template) this.f2515g.get(i);
            template.setShowSelection(false);
            template.setHighLightTerm("");
            template.setPosition(Integer.valueOf(i));
            sq8.m48646e(template);
            return template;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f2515g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$w */
    public static final class C0911w implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ PaginatedDataModel f2516a;

        /* renamed from: b */
        public final /* synthetic */ cpf f2517b;

        /* renamed from: c */
        public final /* synthetic */ BaseLeadsFragment f2518c;

        /* renamed from: d */
        public final /* synthetic */ Leads f2519d;

        public C0911w(PaginatedDataModel paginatedDataModel, cpf cpfVar, BaseLeadsFragment baseLeadsFragment, Leads leads) {
            this.f2516a = paginatedDataModel;
            this.f2517b = cpfVar;
            this.f2518c = baseLeadsFragment;
            this.f2519d = leads;
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            Account accountM39156f;
            sq8.m48649h(view, "view");
            int id = view.getId();
            String id2 = null;
            if (!((id == z8e.itemLeadRoot || id == z8e.sendMessageActionButton) || id == z8e.ivContactProfilePic)) {
                if (id == z8e.textMessage && (obj instanceof Template)) {
                    Template template = (Template) obj;
                    template.setExpanded(!template.isExpanded());
                    if (template.isExpanded()) {
                        MaterialTextView materialTextView = (MaterialTextView) view;
                        materialTextView.setMaxLines(50);
                        materialTextView.setEllipsize(null);
                        return;
                    } else {
                        MaterialTextView materialTextView2 = (MaterialTextView) view;
                        materialTextView2.setMaxLines(5);
                        materialTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof Template) {
                this.f2517b.p0.setAdapter(null);
                DialogC10973a dialogC10973a = this.f2518c.h0;
                if (dialogC10973a == null) {
                    sq8.m48667z("bottomSheetDialog");
                    dialogC10973a = null;
                }
                dialogC10973a.dismiss();
                mii miiVarM54444J = wi0.m54444J();
                if (miiVarM54444J != null && (accountM39156f = miiVarM54444J.m39156f()) != null) {
                    id2 = accountM39156f.getId();
                }
                String str = id2;
                FragmentActivity fragmentActivityRequireActivity = this.f2518c.requireActivity();
                sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
                BaseLeadsFragment baseLeadsFragment = this.f2518c;
                LayoutInflater layoutInflater = baseLeadsFragment.getLayoutInflater();
                sq8.m48648g(layoutInflater, "getLayoutInflater(...)");
                Context contextRequireContext = this.f2518c.requireContext();
                sq8.m48648g(contextRequireContext, "requireContext(...)");
                Leads leads = this.f2519d;
                l9f l9fVar = this.f2518c.i0;
                EngagementSummary engagementSummaryL2 = this.f2518c.L2();
                sq8.m48646e(str);
                vdf.m52627x(fragmentActivityRequireActivity, baseLeadsFragment, layoutInflater, contextRequireContext, (Template) obj, "", leads, l9fVar, (1024 & 256) != 0 ? new EngagementSummary(null, 1, 0 == true ? 1 : 0) : engagementSummaryL2, str, (1024 & 1024) != 0 ? "template" : null);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$x */
    public static final class C0912x extends iuf {

        /* renamed from: g */
        public final /* synthetic */ PaginatedDataModel f2520g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0912x(PaginatedDataModel paginatedDataModel, C0913y c0913y) {
            super(c0913y, null, false, null, 14, null);
            this.f2520g = paginatedDataModel;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_waba_template_to_send;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            String.valueOf(i);
            WhatsAppTemplates whatsAppTemplates = (WhatsAppTemplates) this.f2520g.get(i);
            whatsAppTemplates.setShowSelection(false);
            whatsAppTemplates.setHighLightTerm("");
            whatsAppTemplates.setPosition(Integer.valueOf(i));
            sq8.m48646e(whatsAppTemplates);
            return whatsAppTemplates;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f2520g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$y */
    public static final class C0913y implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ PaginatedDataModel f2521a;

        /* renamed from: b */
        public final /* synthetic */ cpf f2522b;

        /* renamed from: c */
        public final /* synthetic */ BaseLeadsFragment f2523c;

        /* renamed from: d */
        public final /* synthetic */ Leads f2524d;

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$y$a */
        public static final class a implements v10 {

            /* renamed from: a */
            public final /* synthetic */ dge f2525a;

            /* renamed from: b */
            public final /* synthetic */ BaseLeadsFragment f2526b;

            public a(dge dgeVar, BaseLeadsFragment baseLeadsFragment) {
                this.f2525a = dgeVar;
                this.f2526b = baseLeadsFragment;
            }

            /* renamed from: c */
            public static final void m1905c(dge dgeVar, BaseLeadsFragment baseLeadsFragment, ChatMessages chatMessages) {
                sq8.m48649h(dgeVar, "$apiCalled");
                sq8.m48649h(baseLeadsFragment, "this$0");
                sq8.m48649h(chatMessages, "$message");
                if (dgeVar.f19803a) {
                    return;
                }
                dgeVar.f19803a = true;
                baseLeadsFragment.l2(chatMessages, true);
            }

            @Override // p001o.v10
            /* renamed from: a */
            public void mo1026a(final ChatMessages chatMessages) {
                sq8.m48649h(chatMessages, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                final dge dgeVar = this.f2525a;
                final BaseLeadsFragment baseLeadsFragment = this.f2526b;
                j0f.m33008i(new Runnable() { // from class: o.td1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseLeadsFragment.C0913y.a.m1905c(dgeVar, baseLeadsFragment, chatMessages);
                    }
                });
            }
        }

        public C0913y(PaginatedDataModel paginatedDataModel, cpf cpfVar, BaseLeadsFragment baseLeadsFragment, Leads leads) {
            this.f2521a = paginatedDataModel;
            this.f2522b = cpfVar;
            this.f2523c = baseLeadsFragment;
            this.f2524d = leads;
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            int id = view.getId();
            DialogC10973a dialogC10973a = null;
            if (!((id == z8e.itemLeadRoot || id == z8e.sendMessageActionButton) || id == z8e.ivContactProfilePic)) {
                if (id == z8e.textMessage && (obj instanceof WhatsAppTemplates)) {
                    WhatsAppTemplates whatsAppTemplates = (WhatsAppTemplates) obj;
                    whatsAppTemplates.setExpanded(!whatsAppTemplates.isExpanded());
                    if (whatsAppTemplates.isExpanded()) {
                        MaterialTextView materialTextView = (MaterialTextView) view;
                        materialTextView.setMaxLines(50);
                        materialTextView.setEllipsize(null);
                        return;
                    } else {
                        MaterialTextView materialTextView2 = (MaterialTextView) view;
                        materialTextView2.setMaxLines(5);
                        materialTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof WhatsAppTemplates) {
                this.f2522b.p0.setAdapter(null);
                DialogC10973a dialogC10973a2 = this.f2523c.h0;
                if (dialogC10973a2 == null) {
                    sq8.m48667z("bottomSheetDialog");
                } else {
                    dialogC10973a = dialogC10973a2;
                }
                dialogC10973a.dismiss();
                dge dgeVar = new dge();
                BaseLeadsFragment baseLeadsFragment = this.f2523c;
                FragmentActivity fragmentActivityRequireActivity = baseLeadsFragment.requireActivity();
                sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
                Leads leads = this.f2524d;
                LayoutInflater layoutInflater = this.f2523c.getLayoutInflater();
                sq8.m48648g(layoutInflater, "getLayoutInflater(...)");
                l9f l9fVar = this.f2523c.i0;
                uf8 uf8Var = this.f2523c.p0;
                sq8.m48646e(uf8Var);
                new vqf(baseLeadsFragment, fragmentActivityRequireActivity, (WhatsAppTemplates) obj, leads, null, layoutInflater, l9fVar, false, "template", uf8Var, null, this.f2523c.q0, new a(dgeVar, this.f2523c));
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$z */
    public static final class C0914z extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Boolean f2527a;

        /* renamed from: b */
        public final /* synthetic */ FileData f2528b;

        /* renamed from: c */
        public final /* synthetic */ BaseLeadsFragment f2529c;

        /* renamed from: d */
        public final /* synthetic */ Leads f2530d;

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$z$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ BaseLeadsFragment f2531a;

            /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$z$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C19529a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f2532a;

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
                    f2532a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BaseLeadsFragment baseLeadsFragment) {
                super(1);
                this.f2531a = baseLeadsFragment;
            }

            /* renamed from: c */
            public static final void m1908c(BaseLeadsFragment baseLeadsFragment) {
                sq8.m48649h(baseLeadsFragment, "this$0");
                jm7.v0(baseLeadsFragment.requireActivity(), "Voice Note successfully added", 0, 0, 12, null);
            }

            /* renamed from: b */
            public final void m1909b(yne yneVar) {
                final BaseLeadsFragment baseLeadsFragment = this.f2531a;
                if (C19529a.f2532a[yneVar.m58025c().ordinal()] != 1) {
                    return;
                }
                j0f.m33008i(new Runnable() { // from class: o.ud1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseLeadsFragment.C0914z.a.m1908c(baseLeadsFragment);
                    }
                });
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m1909b((yne) obj);
                return y3i.f54824a;
            }
        }

        /* renamed from: ai.salesmax.ui.leads.BaseLeadsFragment$z$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f2533a;

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
                f2533a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0914z(Boolean bool, FileData fileData, BaseLeadsFragment baseLeadsFragment, Leads leads) {
            super(1);
            this.f2527a = bool;
            this.f2528b = fileData;
            this.f2529c = baseLeadsFragment;
            this.f2530d = leads;
        }

        /* renamed from: a */
        public final void m1906a(yne yneVar) {
            Account accountM39156f;
            if (yneVar != null) {
                Boolean bool = this.f2527a;
                FileData fileData = this.f2528b;
                BaseLeadsFragment baseLeadsFragment = this.f2529c;
                Leads leads = this.f2530d;
                if (b.f2533a[yneVar.m58025c().ordinal()] != 1) {
                    return;
                }
                try {
                    if (yneVar.m58023a() != null) {
                        String str = "";
                        if (!sq8.m48644c(bool, Boolean.TRUE)) {
                            Tasks tasks = new Tasks(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, null, null, null, null, null, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, 0L, 0L, null, null, 0L, 0L, null, null, null, null, null, 0L, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0L, 0L, null, null, 0L, 0L, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, -1, -1, -1, 2097151, null);
                            tasks.setClientID(leads.getContactID());
                            String primaryTeamId = leads.getPrimaryTeamId();
                            if (primaryTeamId != null) {
                                tasks.setPrimaryTeamId(primaryTeamId);
                            }
                            tasks.setTaskEngagementType("NOTE");
                            String fileUrl = ((UploadedFileSummary) yneVar.m58023a()).getFileUrl();
                            if (fileUrl != null) {
                                str = fileUrl;
                            }
                            fileData.setUploadedUri(str);
                            fileData.setUploadedFileId(((UploadedFileSummary) yneVar.m58023a()).getId());
                            fileData.setSuccess(true);
                            fileData.setUploaded(true);
                            tasks.setNoteAdditionMethod("VOICE");
                            tasks.setFileList(ch3.m21242g(fileData));
                            wi0.m54469i(th1.m49863o(tasks, null, 1, null), "NOTE", null, 4, null).observe(baseLeadsFragment.getViewLifecycleOwner(), new C0906r(new a(baseLeadsFragment)));
                            return;
                        }
                        String fileUrl2 = ((UploadedFileSummary) yneVar.m58023a()).getFileUrl();
                        if (fileUrl2 != null) {
                            str = fileUrl2;
                        }
                        fileData.setUploadedUri(str);
                        fileData.setUploadedFileId(((UploadedFileSummary) yneVar.m58023a()).getId());
                        fileData.setSuccess(true);
                        fileData.setUploaded(true);
                        mii miiVarM54444J = wi0.m54444J();
                        String id = (miiVarM54444J == null || (accountM39156f = miiVarM54444J.m39156f()) == null) ? null : accountM39156f.getId();
                        Template template = new Template(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 67108863, null);
                        template.setId(((UploadedFileSummary) yneVar.m58023a()).getId());
                        template.setFileList(ch3.m21242g(fileData));
                        template.setTemplateType("voice-note");
                        FragmentActivity fragmentActivityRequireActivity = baseLeadsFragment.requireActivity();
                        sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
                        LayoutInflater layoutInflater = baseLeadsFragment.getLayoutInflater();
                        sq8.m48648g(layoutInflater, "getLayoutInflater(...)");
                        Context contextRequireContext = baseLeadsFragment.requireContext();
                        sq8.m48648g(contextRequireContext, "requireContext(...)");
                        l9f l9fVar = baseLeadsFragment.i0;
                        EngagementSummary engagementSummaryL2 = baseLeadsFragment.L2();
                        sq8.m48646e(id);
                        vdf.m52627x(fragmentActivityRequireActivity, baseLeadsFragment, layoutInflater, contextRequireContext, template, "whatsapp", leads, l9fVar, engagementSummaryL2, id, "voice-note");
                    }
                } catch (Exception unused) {
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1906a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLeadsFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void B3(BaseLeadsFragment baseLeadsFragment, Context context, Leads leads, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNumberSelectionDialog");
        }
        if ((i & 4) != 0) {
            str = "whatsapp";
        }
        baseLeadsFragment.A3(context, leads, str);
    }

    public static final Integer C2(BaseLeadsFragment baseLeadsFragment, PaginatedDataModel paginatedDataModel, Integer num) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(num);
        return Integer.valueOf(baseLeadsFragment.A2(paginatedDataModel, num.intValue()));
    }

    public static final void C3(Leads leads, DialogInterfaceC1782a dialogInterfaceC1782a, String str, BaseLeadsFragment baseLeadsFragment, Context context, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(leads, "$lead");
        sq8.m48649h(dialogInterfaceC1782a, "$dialog");
        sq8.m48649h(str, "$type");
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48649h(context, "$context");
        String number = leads.getPhoneNumbersWithWhatsapp().get(i).getNumber();
        dialogInterfaceC1782a.dismiss();
        if (!sq8.m48644c(str, "call")) {
            baseLeadsFragment.m3(context, number);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = baseLeadsFragment.requireActivity();
        sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
        jm7.m34050j(number, fragmentActivityRequireActivity, leads);
    }

    public static final void E3(BaseLeadsFragment baseLeadsFragment) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        k11 k11Var = baseLeadsFragment.f2443H;
        if (k11Var == null) {
            sq8.m48667z("autoCallViewModel");
            k11Var = null;
        }
        AutoCallConfig autoCallConfigM34851g = k11Var.m34851g();
        if (autoCallConfigM34851g != null) {
            autoCallConfigM34851g.setAdhocListType("Auto Calling From Leads");
        }
        hpb hpbVar = baseLeadsFragment.j0;
        if (hpbVar != null) {
            sq8.m48646e(hpbVar);
            if (hpbVar.getValue() != null) {
                if (autoCallConfigM34851g != null) {
                    hpb hpbVar2 = baseLeadsFragment.j0;
                    sq8.m48646e(hpbVar2);
                    Object value = hpbVar2.getValue();
                    sq8.m48646e(value);
                    PaginatedDataModel<LeadPlaceCall> map = ((PaginatedDataModel) value).map(new Function() { // from class: o.mc1
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return BaseLeadsFragment.F3((Leads) obj);
                        }
                    });
                    sq8.m48648g(map, "map(...)");
                    autoCallConfigM34851g.setContactIds(map);
                }
                BaseFragment.e1(baseLeadsFragment, AbstractC2338a.m8705a(baseLeadsFragment), z8e.leads_start, z8e.action_leads_to_autoCallSetup, null, 4, null);
            }
        }
    }

    public static final void F2(PaginatedDataModel paginatedDataModel, int i, BaseLeadsFragment baseLeadsFragment) {
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(baseLeadsFragment, "this$0");
        String strM27487b = fu5.m27487b(((Leads) paginatedDataModel.get(i)).getCurrentSortByValue(), ((Leads) paginatedDataModel.get(i)).getSortedByDataType());
        baseLeadsFragment.s2().r0.setVisibility(0);
        if (strM27487b != null) {
            MaterialTextView materialTextView = baseLeadsFragment.s2().r0;
            String upperCase = strM27487b.toUpperCase(Locale.ROOT);
            sq8.m48648g(upperCase, "toUpperCase(...)");
            materialTextView.setText(upperCase);
        }
    }

    public static final LeadPlaceCall F3(Leads leads) {
        String contactID = leads.getContactID();
        Date lastCalledTime = leads.getLastCalledTime();
        Long updatedAt = leads.getUpdatedAt();
        ArrayList<String> phoneNumbers = leads.getPhoneNumbers();
        if (!(phoneNumbers.size() > 0)) {
            phoneNumbers = null;
        }
        return new LeadPlaceCall(contactID, lastCalledTime, updatedAt, phoneNumbers != null ? phoneNumbers.get(0) : null);
    }

    public static final Object H2(BaseLeadsFragment baseLeadsFragment, long j, PaginatedDataModel paginatedDataModel, Integer num) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(num);
        int iIntValue = num.intValue();
        String str = baseLeadsFragment.f2449Z;
        if (str == null) {
            str = "";
        }
        return baseLeadsFragment.E2(paginatedDataModel, iIntValue, str, j);
    }

    public static final void J2(final dge dgeVar, final BaseLeadsFragment baseLeadsFragment, final PaginatedDataModel paginatedDataModel, final RecyclerView.AbstractC2371h abstractC2371h, final ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTime");
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(abstractC2371h, "$adapter");
        j0f.m33008i(new Runnable() { // from class: o.nc1
            @Override // java.lang.Runnable
            public final void run() {
                BaseLeadsFragment.K2(dgeVar, baseLeadsFragment, paginatedDataModel, abstractC2371h, resultsChangedEvent);
            }
        });
    }

    public static final void K2(dge dgeVar, BaseLeadsFragment baseLeadsFragment, PaginatedDataModel paginatedDataModel, RecyclerView.AbstractC2371h abstractC2371h, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTime");
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(abstractC2371h, "$adapter");
        if (dgeVar.f19803a) {
            baseLeadsFragment.s2().v0.m13584d();
            baseLeadsFragment.s2().v0.setVisibility(8);
            if (paginatedDataModel.size() == 0) {
                x3(baseLeadsFragment, false, 1, null);
            } else {
                baseLeadsFragment.P2();
            }
            dgeVar.f19803a = false;
        }
        sq8.m48646e(resultsChangedEvent);
        baseLeadsFragment.V2(abstractC2371h, resultsChangedEvent);
    }

    public static final void R2(cpf cpfVar) {
        sq8.m48649h(cpfVar, "$templateBinding");
        cpfVar.j0(false);
    }

    public static final boolean U2(String str, Leads leads) {
        sq8.m48649h(str, "$contactId");
        return Objects.equals(leads.getContactID(), str);
    }

    public static final void W2(final BaseLeadsFragment baseLeadsFragment, View view) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        Context contextRequireContext = baseLeadsFragment.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        if (bub.m19823b(contextRequireContext)) {
            baseLeadsFragment.l0.postDelayed(new Runnable() { // from class: o.jd1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseLeadsFragment.X2(this.f30183a);
                }
            }, 300L);
        }
    }

    public static final void X2(BaseLeadsFragment baseLeadsFragment) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        BaseFragment.e1(baseLeadsFragment, AbstractC2338a.m8705a(baseLeadsFragment), z8e.leads_start, z8e.action_leads_to_importContacts, null, 4, null);
    }

    public static final void Y2(final BaseLeadsFragment baseLeadsFragment, View view) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        Context contextRequireContext = baseLeadsFragment.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        if (bub.m19823b(contextRequireContext)) {
            baseLeadsFragment.l0.postDelayed(new Runnable() { // from class: o.lc1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseLeadsFragment.Z2(this.f33591a);
                }
            }, 300L);
        }
    }

    public static final void Z2(BaseLeadsFragment baseLeadsFragment) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        BaseFragment.e1(baseLeadsFragment, AbstractC2338a.m8705a(baseLeadsFragment), z8e.leads_start, z8e.action_leads_to_addLead, null, 4, null);
    }

    public static final void a3(BaseLeadsFragment baseLeadsFragment, View view) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        if (baseLeadsFragment.getParentFragment() instanceof LeadsFragment) {
            Fragment parentFragment = baseLeadsFragment.getParentFragment();
            sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.ui.leads.LeadsFragment");
            LeadsFragment.C4((LeadsFragment) parentFragment, false, 1, null);
        }
    }

    public static final void c3(BaseLeadsFragment baseLeadsFragment, DialogInterface dialogInterface) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        DialogC10973a dialogC10973a = baseLeadsFragment.h0;
        if (dialogC10973a == null) {
            sq8.m48667z("bottomSheetDialog");
            dialogC10973a = null;
        }
        View viewFindViewById = dialogC10973a.findViewById(n8e.design_bottom_sheet);
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(viewFindViewById);
            sq8.m48648g(bottomSheetBehaviorQ0, "from(...)");
            th1.m49858j(viewFindViewById);
            bottomSheetBehaviorQ0.Z0(3);
        }
    }

    public static final void d3(cpf cpfVar, gge ggeVar, hpb hpbVar, ChipGroup chipGroup, int i) {
        Chip chip;
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(ggeVar, "$prevSelection");
        sq8.m48649h(hpbVar, "$selectedTemplateTypeLive");
        sq8.m48649h(chipGroup, "<anonymous parameter 0>");
        if (i == -1 || (chip = (Chip) cpfVar.w0.findViewById(i)) == null) {
            return;
        }
        String string = chip.getText().toString();
        if (sq8.m48644c(ggeVar.f25106a, string)) {
            return;
        }
        hpbVar.setValue(string);
        ggeVar.f25106a = string;
    }

    public static final void e3(View view) {
    }

    public static final void f3(cpf cpfVar, BaseLeadsFragment baseLeadsFragment, View view) {
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(baseLeadsFragment, "this$0");
        DialogC10973a dialogC10973a = null;
        cpfVar.p0.setAdapter(null);
        DialogC10973a dialogC10973a2 = baseLeadsFragment.h0;
        if (dialogC10973a2 == null) {
            sq8.m48667z("bottomSheetDialog");
        } else {
            dialogC10973a = dialogC10973a2;
        }
        dialogC10973a.dismiss();
    }

    public static final void g3(BaseLeadsFragment baseLeadsFragment, Leads leads, View view) {
        Account accountM39156f;
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48649h(leads, "$lead");
        Template template = new Template(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 67108863, null);
        DialogC10973a dialogC10973a = baseLeadsFragment.h0;
        if (dialogC10973a == null) {
            sq8.m48667z("bottomSheetDialog");
            dialogC10973a = null;
        }
        dialogC10973a.dismiss();
        mii miiVarM54444J = wi0.m54444J();
        String id = (miiVarM54444J == null || (accountM39156f = miiVarM54444J.m39156f()) == null) ? null : accountM39156f.getId();
        FragmentActivity fragmentActivityRequireActivity = baseLeadsFragment.requireActivity();
        sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
        LayoutInflater layoutInflater = baseLeadsFragment.getLayoutInflater();
        sq8.m48648g(layoutInflater, "getLayoutInflater(...)");
        Context contextRequireContext = baseLeadsFragment.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        l9f l9fVar = baseLeadsFragment.i0;
        EngagementSummary engagementSummary = baseLeadsFragment.o0;
        sq8.m48646e(id);
        vdf.m52627x(fragmentActivityRequireActivity, baseLeadsFragment, layoutInflater, contextRequireContext, template, "", leads, l9fVar, (1024 & 256) != 0 ? new EngagementSummary(null, 1, 0 == true ? 1 : 0) : engagementSummary, id, (1024 & 1024) != 0 ? "template" : null);
    }

    public static /* synthetic */ void n2(BaseLeadsFragment baseLeadsFragment, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: currentItem");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseLeadsFragment.m2(str, z);
    }

    public static final void p3(final dge dgeVar, final cpf cpfVar, final C0910v c0910v, final PaginatedDataModel paginatedDataModel, final BaseLeadsFragment baseLeadsFragment, final ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTimeTemplate");
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(c0910v, "$templateAdapter");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(baseLeadsFragment, "this$0");
        j0f.m33008i(new Runnable() { // from class: o.yc1
            @Override // java.lang.Runnable
            public final void run() {
                BaseLeadsFragment.q3(dgeVar, cpfVar, c0910v, paginatedDataModel, baseLeadsFragment, resultsChangedEvent);
            }
        });
    }

    public static final void q3(dge dgeVar, cpf cpfVar, C0910v c0910v, PaginatedDataModel paginatedDataModel, BaseLeadsFragment baseLeadsFragment, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTimeTemplate");
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(c0910v, "$templateAdapter");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(baseLeadsFragment, "this$0");
        if (dgeVar.f19803a) {
            cpfVar.p0.setItemAnimator(null);
            cpfVar.p0.setAdapter(c0910v);
            dgeVar.f19803a = false;
            if (paginatedDataModel.size() == 0) {
                baseLeadsFragment.y3(cpfVar);
            } else {
                baseLeadsFragment.Q2(cpfVar);
            }
        }
        c0910v.notifyItemRangeInserted(resultsChangedEvent.start(), resultsChangedEvent.count());
    }

    public static final ResultsChangeListener u2(BaseLeadsFragment baseLeadsFragment, PaginatedDataModel paginatedDataModel, RecyclerView.AbstractC2371h abstractC2371h) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(abstractC2371h);
        return baseLeadsFragment.I2(paginatedDataModel, abstractC2371h);
    }

    public static final void u3(final dge dgeVar, final cpf cpfVar, final C0912x c0912x, final ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTimeTemplate");
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(c0912x, "$templateAdapter");
        j0f.m33008i(new Runnable() { // from class: o.zc1
            @Override // java.lang.Runnable
            public final void run() {
                BaseLeadsFragment.v3(dgeVar, cpfVar, c0912x, resultsChangedEvent);
            }
        });
    }

    public static final void v3(dge dgeVar, cpf cpfVar, C0912x c0912x, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTimeTemplate");
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(c0912x, "$templateAdapter");
        if (dgeVar.f19803a) {
            cpfVar.p0.setItemAnimator(null);
            cpfVar.p0.setAdapter(c0912x);
            dgeVar.f19803a = false;
        }
        c0912x.notifyItemRangeInserted(resultsChangedEvent.start(), resultsChangedEvent.count());
    }

    public static final Integer x2(BaseLeadsFragment baseLeadsFragment, PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        return Integer.valueOf(baseLeadsFragment.v2(paginatedDataModel));
    }

    public static /* synthetic */ void x3(BaseLeadsFragment baseLeadsFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNoContent");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseLeadsFragment.w3(z);
    }

    public static final Object z2(BaseLeadsFragment baseLeadsFragment, PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(baseLeadsFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "dataModel");
        return baseLeadsFragment.new C0894f(paginatedDataModel);
    }

    public static final void z3(cpf cpfVar) {
        sq8.m48649h(cpfVar, "$templateBinding");
        cpfVar.j0(true);
    }

    public final int A2(PaginatedDataModel paginatedDataModel, int i) {
        return p9e.item_lead;
    }

    public final void A3(final Context context, final Leads leads, final String str) {
        View viewInflate = LayoutInflater.from(context).inflate(p9e.dialog_select_number, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(z8e.listViewPhoneNumbers);
        listView.setAdapter((ListAdapter) new s6d(context, leads.getPhoneNumbersWithWhatsapp()));
        final DialogInterfaceC1782a dialogInterfaceC1782aCreate = new nta(context).setTitle("Select Number").setView(viewInflate).create();
        sq8.m48648g(dialogInterfaceC1782aCreate, "create(...)");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.pc1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                BaseLeadsFragment.C3(leads, dialogInterfaceC1782aCreate, str, this, context, adapterView, view, i, j);
            }
        });
        dialogInterfaceC1782aCreate.show();
    }

    public final ll7 B2() {
        return new gd1(this);
    }

    public AbstractC2145n D2(String str) {
        sq8.m48649h(str, "searchTerm");
        int i = C0889a.f2455a[this.f2450h.ordinal()];
        if (i == 1) {
            return N2().m20684z(str);
        }
        if (i == 2) {
            return N2().m20676q(str);
        }
        if (i != 3) {
            throw new szb();
        }
        List listM21246k = null;
        if (f9g.d0(this.n0)) {
            return e84.m24521b(null, 0L, new C0895g(null), 3, null);
        }
        cba cbaVarN2 = N2();
        String str2 = this.n0;
        List list = this.m0;
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
        return cbaVarN2.m20667B(str2, listM21246k, str);
    }

    public final void D3() {
        j0f.m33008i(new Runnable() { // from class: o.ic1
            @Override // java.lang.Runnable
            public final void run() {
                BaseLeadsFragment.E3(this.f28445a);
            }
        });
    }

    @Override // p001o.ecc
    /* renamed from: E */
    public void mo946E(String str, String str2, String str3, Leads leads, Boolean bool) {
        sq8.m48649h(str, "filePath");
        sq8.m48649h(str2, "fileName");
        sq8.m48649h(str3, "fileMimeType");
        File file = new File(str);
        if (getContext() == null) {
            return;
        }
        FileData fileData = new FileData(1, FileProvider.m5839h(requireContext(), requireContext().getPackageName() + ".provider", file), str2, str3, null, null, false, false, false, null, null, null, null, null, null, "VOICE_NOTE", null, "Voice Note", null, false, null, null, null, "Engagement", "body", null, null, null, 243105776, null);
        sq8.m48646e(leads);
        G3(fileData, bool, leads);
    }

    public final Object E2(final PaginatedDataModel paginatedDataModel, int i, String str, long j) {
        String.valueOf(i);
        Leads leads = (Leads) paginatedDataModel.get(i);
        cba cbaVarN2 = N2();
        sq8.m48646e(leads);
        cbaVarN2.m20673k(leads, i >= 1 ? (Leads) paginatedDataModel.get(i - 1) : null, wx9.ALL);
        if (getParentFragment() instanceof LeadsFragment) {
            Fragment parentFragment = getParentFragment();
            sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.ui.leads.LeadsFragment");
            leads.setSelected(((LeadsFragment) parentFragment).e5().contains(leads.getContactID()));
        }
        leads.setShowSelection(this.f2447X);
        leads.setHighLightTerm(str);
        leads.setPosition(Integer.valueOf(i));
        leads.setLastItemSeenAt(j);
        leads.setCloudTelephonyEnabled(N2().m20670E());
        RecyclerView.AbstractC2379p layoutManager = s2().t0.getLayoutManager();
        sq8.m48647f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        final int iL2 = ((LinearLayoutManager) layoutManager).l2();
        String.valueOf(iL2);
        if (paginatedDataModel.size() <= 0 || iL2 == -1) {
            s2().r0.setVisibility(8);
        } else {
            j0f.m33008i(new Runnable() { // from class: o.kc1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseLeadsFragment.F2(paginatedDataModel, iL2, this);
                }
            });
        }
        return leads;
    }

    public final ll7 G2(long j) {
        return new tc1(this, j);
    }

    public final void G3(FileData fileData, Boolean bool, Leads leads) {
        if (getContext() == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        Uri contentUri = fileData.getContentUri();
        sq8.m48646e(contentUri);
        wi0.H0(contextRequireContext, contentUri, fileData.getFileName(), fileData.getMimeType(), fileData.getDocumentCategory(), fileData.getDocumentSubCategory(), null, null, fileData.getUploadSource()).observeForever(new C0906r(new C0914z(bool, fileData, this, leads)));
    }

    public final ResultsChangeListener I2(final PaginatedDataModel paginatedDataModel, final RecyclerView.AbstractC2371h abstractC2371h) {
        sq8.m48649h(paginatedDataModel, "dataModel");
        sq8.m48649h(abstractC2371h, "adapter");
        final dge dgeVar = new dge();
        dgeVar.f19803a = true;
        return new ResultsChangeListener() { // from class: o.jc1
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                BaseLeadsFragment.J2(dgeVar, this, paginatedDataModel, abstractC2371h, resultsChangedEvent);
            }
        };
    }

    public final EngagementSummary L2() {
        return this.o0;
    }

    public final View M2() {
        return this.r0;
    }

    public final cba N2() {
        cba cbaVar = this.f2452s;
        if (cbaVar != null) {
            return cbaVar;
        }
        sq8.m48667z("viewModel");
        return null;
    }

    public final wx9 O2() {
        return this.f2450h;
    }

    public final void P2() {
        s2().l0(false);
        s2().k0(false);
        s2().m0(false);
        eb0 eb0VarS2 = s2();
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        eb0VarS2.j0(bub.m19823b(contextRequireContext));
    }

    public final void Q2(final cpf cpfVar) {
        sq8.m48649h(cpfVar, "templateBinding");
        j0f.m33008i(new Runnable() { // from class: o.bd1
            @Override // java.lang.Runnable
            public final void run() {
                BaseLeadsFragment.R2(cpfVar);
            }
        });
    }

    public final boolean S2(Context context, String str) throws PackageManager.NameNotFoundException {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void T2(final String str) {
        PaginatedDataModel paginatedDataModel;
        PaginatedDataModel paginatedDataModel2;
        sq8.m48649h(str, "contactId");
        hpb hpbVar = this.j0;
        if (hpbVar != null && (paginatedDataModel2 = (PaginatedDataModel) hpbVar.getValue()) != null) {
            paginatedDataModel2.deleteItemsByPredicate(new Predicate() { // from class: o.oc1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return BaseLeadsFragment.U2(str, (Leads) obj);
                }
            });
        }
        hpb hpbVar2 = this.j0;
        if (((hpbVar2 == null || (paginatedDataModel = (PaginatedDataModel) hpbVar2.getValue()) == null) ? 0 : paginatedDataModel.size()) == 0) {
            x3(this, false, 1, null);
        }
    }

    public final void V2(RecyclerView.AbstractC2371h abstractC2371h, ResultsChangedEvent resultsChangedEvent) {
        ResultsChangedEvent.ResultsChangedEventType resultsChangedEventTypeEventType = resultsChangedEvent.eventType();
        int i = resultsChangedEventTypeEventType == null ? -1 : C0889a.f2456b[resultsChangedEventTypeEventType.ordinal()];
        if (i == 1) {
            abstractC2371h.notifyItemRangeInserted(resultsChangedEvent.start(), resultsChangedEvent.count());
            RecyclerView.AbstractC2379p layoutManager = s2().t0.getLayoutManager();
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

    public final void b3(Context context, final Leads leads) {
        DialogC10973a dialogC10973a;
        final cpf cpfVarH0 = cpf.h0(getLayoutInflater());
        sq8.m48648g(cpfVarH0, "inflate(...)");
        DialogC10973a dialogC10973a2 = new DialogC10973a(context, qae.SheetDialog);
        this.h0 = dialogC10973a2;
        dialogC10973a2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.qc1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BaseLeadsFragment.c3(this.f41609a, dialogInterface);
            }
        });
        DialogC10973a dialogC10973a3 = this.h0;
        if (dialogC10973a3 == null) {
            sq8.m48667z("bottomSheetDialog");
            dialogC10973a3 = null;
        }
        dialogC10973a3.setContentView(cpfVarH0.m25689B());
        List listM0 = wi0.m0(false, true, 1, null);
        if (listM0.size() > 0) {
            cpfVarH0.t0.setText(((TemplateTypes) listM0.get(0)).getViewValue());
            cpfVarH0.t0.setChecked(true);
        }
        if (listM0.size() > 1) {
            cpfVarH0.u0.setText(((TemplateTypes) listM0.get(1)).getViewValue());
        } else {
            cpfVarH0.u0.setVisibility(8);
        }
        if (listM0.size() > 2) {
            cpfVarH0.v0.setText(((TemplateTypes) listM0.get(2)).getViewValue());
            cpfVarH0.v0.setVisibility(0);
        } else {
            cpfVarH0.v0.setVisibility(8);
        }
        final gge ggeVar = new gge();
        ggeVar.f25106a = ((TemplateTypes) listM0.get(0)).getViewValue();
        final hpb hpbVar = new hpb();
        hpbVar.setValue(((TemplateTypes) listM0.get(0)).getViewValue());
        hpb hpbVar2 = new hpb("");
        cpfVarH0.z0.addTextChangedListener(new C0900l(hpbVar2));
        cpfVarH0.w0.setOnCheckedChangeListener(new ChipGroup.InterfaceC10998c() { // from class: o.rc1
            @Override // com.google.android.material.chip.ChipGroup.InterfaceC10998c
            /* renamed from: a */
            public final void mo14414a(ChipGroup chipGroup, int i) {
                BaseLeadsFragment.d3(cpfVarH0, ggeVar, hpbVar, chipGroup, i);
            }
        });
        z9b z9bVar = new z9b();
        z9b z9bVar2 = new z9b();
        C0905q c0905q = new C0905q(hpbVar, hpbVar2, this, z9bVar2, cpfVarH0, z9bVar);
        z9bVar2.addSource(hpbVar, new C0906r(new C0901m(c0905q)));
        z9bVar2.addSource(hpbVar2, new C0906r(new C0902n(c0905q)));
        z9bVar2.observe(getViewLifecycleOwner(), new C0906r(new C0903o(cpfVarH0, leads)));
        z9bVar.observe(getViewLifecycleOwner(), new C0906r(new C0904p(cpfVarH0, leads)));
        cpfVarH0.m25689B().setOnClickListener(new View.OnClickListener() { // from class: o.sc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseLeadsFragment.e3(view);
            }
        });
        cpfVarH0.x0.setOnClickListener(new View.OnClickListener() { // from class: o.uc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseLeadsFragment.f3(cpfVarH0, this, view);
            }
        });
        cpfVarH0.s0.setOnClickListener(new View.OnClickListener() { // from class: o.vc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseLeadsFragment.g3(this.f50100a, leads, view);
            }
        });
        DialogC10973a dialogC10973a4 = this.h0;
        if (dialogC10973a4 == null) {
            sq8.m48667z("bottomSheetDialog");
            dialogC10973a = null;
        } else {
            dialogC10973a = dialogC10973a4;
        }
        dialogC10973a.show();
    }

    public final void h3(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(getString(hae.argumentUser), str);
        d1(AbstractC2338a.m8705a(this), z8e.leads_start, z8e.action_leads_to_userDetails, bundle);
    }

    public final void i3(Context context, Leads leads) {
        if ((leads != null ? leads.getPhoneNumbers() : null) != null && leads.getPhoneNumbers().size() == 1) {
            m3(context, leads.getPhoneNumbers().get(0));
            return;
        }
        if ((leads != null ? leads.getPhoneNumbers() : null) == null || leads.getPhoneNumbers().size() <= 1) {
            return;
        }
        B3(this, context, leads, null, 4, null);
    }

    public final void j3() {
        this.f2447X = false;
        RecyclerView.AbstractC2371h adapter = s2().t0.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void k3() {
        this.f2449Z = null;
    }

    public final void l2(ChatMessages chatMessages, boolean z) {
        if (getContext() == null) {
            return;
        }
        if (z && chatMessages.getMessageFile() != null) {
            FileData messageFile = chatMessages.getMessageFile();
            sq8.m48646e(messageFile);
            String uploadedUri = messageFile.getUploadedUri();
            if (uploadedUri == null || f9g.d0(uploadedUri)) {
                FileData messageFile2 = chatMessages.getMessageFile();
                sq8.m48646e(messageFile2);
                l3(messageFile2, chatMessages);
                return;
            }
        }
        d83 d83Var = this.f2453x;
        if (d83Var == null) {
            sq8.m48667z("chatsViewModel");
            d83Var = null;
        }
        d83Var.m22533O(ChatMessages.toChatMessageSummary$default(chatMessages, null, 1, null)).observe(getViewLifecycleOwner(), new C0906r(new C0890b(chatMessages, this)));
    }

    public final void l3(FileData fileData, ChatMessages chatMessages) {
        d83 d83Var = this.f2453x;
        d83 d83Var2 = null;
        if (d83Var == null) {
            sq8.m48667z("chatsViewModel");
            d83Var = null;
        }
        if (!d83Var.m22527H(fileData.getMimeType())) {
            jm7.v0(requireActivity(), fileData.getMimeType() + " type of files couldn't be uploaded", 0, 0, 12, null);
            return;
        }
        d83 d83Var3 = this.f2453x;
        if (d83Var3 == null) {
            sq8.m48667z("chatsViewModel");
        } else {
            d83Var2 = d83Var3;
        }
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        d83Var2.m22536R(contextRequireContext, fileData, chatMessages).observe(getViewLifecycleOwner(), new C0906r(new C0907s()));
    }

    public final void m2(String str, boolean z) {
        sq8.m48649h(str, "searchText");
        if (!Objects.equals(this.f2449Z, str) || h1()) {
            W0(false);
            this.f2449Z = str;
            this.f2447X = z;
            p2(str);
        }
    }

    public final void m3(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        boolean zM3262x = AbstractC0059a.m132a().m3262x();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + str + "&text="));
        if (zM3262x) {
            intent.setPackage("com.whatsapp.w4b");
        } else {
            intent.setPackage("com.whatsapp");
        }
        if (!S2(context, String.valueOf(intent.getPackage()))) {
            if (sq8.m48644c(String.valueOf(intent.getPackage()), "com.whatsapp.w4b")) {
                jm7.v0(requireActivity(), "Whatsapp Business not installed on your device", 0, 0, 12, null);
                return;
            } else {
                jm7.v0(requireActivity(), "Whatsapp not installed on your device", 0, 0, 12, null);
                return;
            }
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            if (sq8.m48644c(String.valueOf(intent.getPackage()), "com.whatsapp.w4b")) {
                jm7.v0(requireActivity(), "Whatsapp Business not installed on your device", 0, 0, 12, null);
            } else {
                jm7.v0(requireActivity(), "Whatsapp not installed on your device", 0, 0, 12, null);
            }
        }
    }

    public final void n3(List list) {
        s2().u0.setAdapter(new C0908t(list, new C0909u(list, this)));
        s2().u0.m9089k(this.s0);
        if (list.size() == 1) {
            s2().u0.setVisibility(8);
        }
    }

    public final void o2(String str, String str2, hpb hpbVar, cpf cpfVar) {
        sq8.m48649h(str, "selectedTemplateType");
        sq8.m48649h(str2, "searchTerm");
        sq8.m48649h(hpbVar, "fileTemplatesLiveData");
        sq8.m48649h(cpfVar, "templateBinding");
        PaginatedDataModel paginatedDataModel = this.f2444L;
        ggh gghVar = null;
        if (paginatedDataModel != null) {
            if (paginatedDataModel != null) {
                paginatedDataModel.reset();
            }
            this.f2444L = null;
        }
        if (this.f2444L == null) {
            ggh gghVar2 = this.f2454y;
            if (gghVar2 == null) {
                sq8.m48667z("templateViewModel");
                gghVar2 = null;
            }
            mii miiVarM28601n = gghVar2.m28601n();
            if (miiVarM28601n == null || miiVarM28601n.m39171u() == null) {
                return;
            }
            ggh gghVar3 = this.f2454y;
            if (gghVar3 == null) {
                sq8.m48667z("templateViewModel");
            } else {
                gghVar = gghVar3;
            }
            gghVar.m28598j(str, ch3.m21246k(), str2).observe(getViewLifecycleOwner(), new C0906r(new C0891c(cpfVar, this, hpbVar)));
        }
    }

    public final void o3(final PaginatedDataModel paginatedDataModel, final cpf cpfVar, Leads leads) {
        sq8.m48649h(paginatedDataModel, "dataModel");
        sq8.m48649h(cpfVar, "templateBinding");
        sq8.m48649h(leads, "lead");
        final dge dgeVar = new dge();
        dgeVar.f19803a = true;
        final C0910v c0910v = new C0910v(paginatedDataModel, new C0911w(paginatedDataModel, cpfVar, this, leads));
        c0910v.setStateRestorationPolicy(RecyclerView.AbstractC2371h.a.PREVENT_WHEN_EMPTY);
        paginatedDataModel.addResultsChangedListener(getViewLifecycleOwner(), new ResultsChangeListener() { // from class: o.xc1
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                BaseLeadsFragment.p3(dgeVar, cpfVar, c0910v, paginatedDataModel, this, resultsChangedEvent);
            }
        });
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            s3((cba) new b0(fragmentActivityRequireActivity).m6505a(cba.class));
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity2, "requireActivity(...)");
            this.f2454y = (ggh) new b0(fragmentActivityRequireActivity2).m6505a(ggh.class);
            FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity3, "requireActivity(...)");
            this.f2446Q = (l8j) new b0(fragmentActivityRequireActivity3).m6505a(l8j.class);
            FragmentActivity fragmentActivityRequireActivity4 = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity4, "requireActivity(...)");
            this.f2453x = (d83) new b0(fragmentActivityRequireActivity4).m6505a(d83.class);
            FragmentActivity fragmentActivityRequireActivity5 = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity5, "requireActivity(...)");
            this.f2443H = (k11) new b0(fragmentActivityRequireActivity5).m6505a(k11.class);
            if (this.f2450h == wx9.MY_TEAM) {
                mii miiVarM20669D = N2().m20669D();
                AuthorizationLevel authorizationLevelM39162l = miiVarM20669D != null ? miiVarM20669D.m39162l() : null;
                if (AuthorizationLevel.SUPERADMIN == authorizationLevelM39162l || AuthorizationLevel.ADMIN == authorizationLevelM39162l) {
                    List listM54451Q = wi0.m54451Q();
                    if (listM54451Q.size() <= 0) {
                        this.m0 = listM54451Q;
                        return;
                    }
                    Team teamJustId = Team.justId("ALL");
                    sq8.m48648g(teamJustId, "justId(...)");
                    ArrayList arrayListM21242g = ch3.m21242g(new LeadsTeam(teamJustId));
                    arrayListM21242g.addAll(listM54451Q);
                    this.m0 = arrayListM21242g;
                    return;
                }
                List listM54453S = wi0.m54453S();
                if (listM54453S.size() <= 0) {
                    this.m0 = listM54453S;
                    return;
                }
                Team teamJustId2 = Team.justId("ALL");
                sq8.m48648g(teamJustId2, "justId(...)");
                ArrayList arrayListM21242g2 = ch3.m21242g(new LeadsTeam(teamJustId2));
                arrayListM21242g2.addAll(listM54453S);
                this.m0 = arrayListM21242g2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f2451q == null) {
            eb0 eb0VarH0 = eb0.h0(layoutInflater, viewGroup, false);
            this.f2451q = eb0VarH0;
            if (eb0VarH0 != null) {
                Long lM27895v = vgf.m52765k().m27895v(this.f2450h);
                sq8.m48648g(lM27895v, "getLastLeadsSeenAt(...)");
                this.k0 = lM27895v.longValue();
                hpb hpbVar = this.j0;
                sq8.m48646e(hpbVar);
                lpc lpcVarQ2 = q2(hpbVar, this.k0);
                eb0VarH0.t0.setItemAnimator(null);
                eb0VarH0.t0.setAdapter(lpcVarQ2);
                if (this.f2450h == wx9.MY_TEAM) {
                    Object objOrElse = Optional.ofNullable(this.m0).orElse(new ArrayList());
                    sq8.m48648g(objOrElse, "orElse(...)");
                    List list = (List) objOrElse;
                    if (list.isEmpty()) {
                        w3(true);
                    } else {
                        this.n0 = ((LeadsTeam) list.get(0)).getTeamId();
                        ((LeadsTeam) list.get(0)).setSelected(true);
                        n3(list);
                    }
                } else {
                    eb0VarH0.u0.setVisibility(8);
                }
            }
        }
        View viewM25689B = s2().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        PaginatedDataModel paginatedDataModel;
        super.onDestroy();
        hpb hpbVar = this.j0;
        if (hpbVar != null && (paginatedDataModel = (PaginatedDataModel) hpbVar.getValue()) != null) {
            paginatedDataModel.reset();
        }
        this.j0 = null;
        this.m0 = null;
        this.f2444L = null;
        this.f2445M = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f2451q != null) {
            s2().t0.setAdapter(null);
            s2().u0.setAdapter(null);
        }
        this.r0 = null;
        this.l0.removeCallbacksAndMessages(null);
        DialogC10973a dialogC10973a = this.h0;
        if (dialogC10973a != null) {
            if (dialogC10973a == null) {
                sq8.m48667z("bottomSheetDialog");
                dialogC10973a = null;
            }
            if (dialogC10973a.isShowing()) {
                DialogC10973a dialogC10973a2 = this.h0;
                if (dialogC10973a2 == null) {
                    sq8.m48667z("bottomSheetDialog");
                    dialogC10973a2 = null;
                }
                dialogC10973a2.dismiss();
            }
        }
        this.f2451q = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C2151t c2151tM8556h;
        hpb hpbVarM6585e;
        C2151t c2151tM8556h2;
        hpb hpbVarM6585e2;
        C2151t c2151tM8556h3;
        hpb hpbVarM6585e3;
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC2333d abstractC2333dM8705a = AbstractC2338a.m8705a(this);
        C2332c c2332cM8590F = abstractC2333dM8705a.m8590F();
        if (c2332cM8590F != null && (c2151tM8556h3 = c2332cM8590F.m8556h()) != null && (hpbVarM6585e3 = c2151tM8556h3.m6585e("deleteLeadId")) != null) {
            hpbVarM6585e3.observe(getViewLifecycleOwner(), new C0906r(new C0897i(abstractC2333dM8705a)));
        }
        C2332c c2332cM8590F2 = abstractC2333dM8705a.m8590F();
        if (c2332cM8590F2 != null && (c2151tM8556h2 = c2332cM8590F2.m8556h()) != null && (hpbVarM6585e2 = c2151tM8556h2.m6585e("importedLeadCount")) != null) {
            hpbVarM6585e2.observe(getViewLifecycleOwner(), new C0906r(new C0898j(abstractC2333dM8705a)));
        }
        C2332c c2332cM8590F3 = abstractC2333dM8705a.m8590F();
        if (c2332cM8590F3 != null && (c2151tM8556h = c2332cM8590F3.m8556h()) != null && (hpbVarM6585e = c2151tM8556h.m6585e("updateLead")) != null) {
            hpbVarM6585e.observe(getViewLifecycleOwner(), new C0906r(new C0899k(abstractC2333dM8705a)));
        }
        s2().o0.r0.setOnClickListener(new View.OnClickListener() { // from class: o.cd1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseLeadsFragment.W2(this.f17856a, view2);
            }
        });
        s2().o0.n0.setOnClickListener(new View.OnClickListener() { // from class: o.dd1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseLeadsFragment.Y2(this.f19598a, view2);
            }
        });
        s2().p0.n0.setOnClickListener(new View.OnClickListener() { // from class: o.ed1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseLeadsFragment.a3(this.f21406a, view2);
            }
        });
        eb0 eb0VarS2 = s2();
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        eb0VarS2.j0(bub.m19823b(contextRequireContext));
    }

    public final void p2(String str) {
        sq8.m48649h(str, "searchTerm");
        this.f2448Y = !f9g.d0(str);
        D2(str).observe(getViewLifecycleOwner(), new C0906r(new C0892d(str)));
    }

    public final lpc q2(AbstractC2145n abstractC2145n, long j) {
        lpc lpcVar = new lpc(getViewLifecycleOwner(), abstractC2145n, y2(), null, true, null, G2(j), B2(), w2(), t2());
        lpcVar.setStateRestorationPolicy(RecyclerView.AbstractC2371h.a.PREVENT_WHEN_EMPTY);
        return lpcVar;
    }

    public final void r2(String str, String str2, hpb hpbVar, cpf cpfVar) {
        sq8.m48649h(str, "selectedTemplateType");
        sq8.m48649h(str2, "searchTerm");
        sq8.m48649h(hpbVar, "whatsAppTemplatesLiveData");
        sq8.m48649h(cpfVar, "templateBinding");
        PaginatedDataModel paginatedDataModel = this.f2444L;
        l8j l8jVar = null;
        if (paginatedDataModel != null || this.f2445M != null) {
            if (paginatedDataModel != null) {
                paginatedDataModel.reset();
            }
            this.f2444L = null;
            PaginatedDataModel paginatedDataModel2 = this.f2445M;
            if (paginatedDataModel2 != null) {
                paginatedDataModel2.reset();
            }
            this.f2445M = null;
        }
        if (this.f2445M == null && "Whatsapp Templates".equals(str)) {
            l8j l8jVar2 = this.f2446Q;
            if (l8jVar2 == null) {
                sq8.m48667z("whatsAppTemplateViewModel");
                l8jVar2 = null;
            }
            mii miiVarM36801h = l8jVar2.m36801h();
            if (miiVarM36801h == null || miiVarM36801h.m39171u() == null) {
                return;
            }
            l8j l8jVar3 = this.f2446Q;
            if (l8jVar3 == null) {
                sq8.m48667z("whatsAppTemplateViewModel");
            } else {
                l8jVar = l8jVar3;
            }
            l8jVar.m36800g("APPROVED", str2).observe(getViewLifecycleOwner(), new C0906r(new C0893e(cpfVar, this, hpbVar)));
        }
    }

    public final void r3(View view) {
        this.r0 = view;
    }

    public final eb0 s2() {
        eb0 eb0Var = this.f2451q;
        sq8.m48646e(eb0Var);
        return eb0Var;
    }

    public final void s3(cba cbaVar) {
        sq8.m48649h(cbaVar, "<set-?>");
        this.f2452s = cbaVar;
    }

    public final ll7 t2() {
        return new hd1(this);
    }

    public final void t3(PaginatedDataModel paginatedDataModel, final cpf cpfVar, Leads leads) {
        sq8.m48649h(paginatedDataModel, "dataModel");
        sq8.m48649h(cpfVar, "templateBinding");
        sq8.m48649h(leads, "lead");
        final dge dgeVar = new dge();
        dgeVar.f19803a = true;
        final C0912x c0912x = new C0912x(paginatedDataModel, new C0913y(paginatedDataModel, cpfVar, this, leads));
        c0912x.setStateRestorationPolicy(RecyclerView.AbstractC2371h.a.PREVENT_WHEN_EMPTY);
        paginatedDataModel.addResultsChangedListener(getViewLifecycleOwner(), new ResultsChangeListener() { // from class: o.wc1
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                BaseLeadsFragment.u3(dgeVar, cpfVar, c0912x, resultsChangedEvent);
            }
        });
    }

    public final int v2(PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(paginatedDataModel, "dataModel");
        return paginatedDataModel.size();
    }

    public final Function w2() {
        return new Function() { // from class: o.id1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseLeadsFragment.x2(this.f28474a, (PaginatedDataModel) obj);
            }
        };
    }

    public final void w3(boolean z) {
        if (z) {
            s2().m0(true);
            s2().l0(false);
            s2().k0(false);
            eb0 eb0VarS2 = s2();
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            eb0VarS2.j0(bub.m19823b(contextRequireContext));
            return;
        }
        if (N2().m20683y().m53581E()) {
            String str = this.f2449Z;
            if (str == null) {
                str = "";
            }
            if (!(str.length() > 0)) {
                s2().l0(true);
                s2().k0(false);
                s2().m0(false);
                eb0 eb0VarS22 = s2();
                Context contextRequireContext2 = requireContext();
                sq8.m48648g(contextRequireContext2, "requireContext(...)");
                eb0VarS22.j0(bub.m19823b(contextRequireContext2));
                return;
            }
        }
        s2().l0(false);
        s2().k0(true);
        s2().m0(false);
        eb0 eb0VarS23 = s2();
        Context contextRequireContext3 = requireContext();
        sq8.m48648g(contextRequireContext3, "requireContext(...)");
        eb0VarS23.j0(bub.m19823b(contextRequireContext3));
    }

    public final Function y2() {
        return new Function() { // from class: o.fd1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseLeadsFragment.z2(this.f23143a, (PaginatedDataModel) obj);
            }
        };
    }

    public final void y3(final cpf cpfVar) {
        sq8.m48649h(cpfVar, "templateBinding");
        j0f.m33008i(new Runnable() { // from class: o.ad1
            @Override // java.lang.Runnable
            public final void run() {
                BaseLeadsFragment.z3(cpfVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLeadsFragment(wx9 wx9Var) {
        sq8.m48649h(wx9Var, "viewOptionType");
        this.f2450h = wx9Var;
        this.f2444L = PaginatedDataModel.empty();
        this.f2445M = PaginatedDataModel.empty();
        int i = 2;
        this.i0 = new l9f(this, null, i, 0 == true ? 1 : 0);
        this.j0 = new hpb();
        this.l0 = new Handler(Looper.getMainLooper());
        this.n0 = "";
        this.o0 = new EngagementSummary(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.p0 = new uf8(this);
        this.q0 = new gd2(this, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.s0 = new C0896h();
    }

    public /* synthetic */ BaseLeadsFragment(wx9 wx9Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? wx9.ALL : wx9Var);
    }
}
