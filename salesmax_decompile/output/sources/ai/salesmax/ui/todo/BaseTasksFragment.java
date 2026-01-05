package ai.salesmax.ui.todo;

import ai.salesmax.AbstractC0059a;
import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import ai.salesmax.model.TaskCategoryList;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import ai.salesmax.ui.BaseFragment;
import ai.salesmax.ui.todo.BaseTasksFragment;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC2145n;
import androidx.lifecycle.C2151t;
import androidx.lifecycle.b0;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.C2332c;
import androidx.navigation.fragment.AbstractC2338a;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import p000.C2674b;
import p001o.am7;
import p001o.bub;
import p001o.ch3;
import p001o.ck6;
import p001o.dge;
import p001o.dh3;
import p001o.hae;
import p001o.hpb;
import p001o.id5;
import p001o.iuf;
import p001o.j0f;
import p001o.ja8;
import p001o.kf9;
import p001o.kh3;
import p001o.ll7;
import p001o.lpc;
import p001o.mii;
import p001o.n9c;
import p001o.nd;
import p001o.p9e;
import p001o.q5g;
import p001o.rog;
import p001o.ryh;
import p001o.se1;
import p001o.sq8;
import p001o.szb;
import p001o.te1;
import p001o.tl7;
import p001o.tph;
import p001o.uk3;
import p001o.uyh;
import p001o.wi0;
import p001o.wqh;
import p001o.xca;
import p001o.xe1;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.yqb;
import p001o.z8e;

/* loaded from: classes2.dex */
public class BaseTasksFragment extends BaseFragment {

    /* renamed from: H */
    public String f4203H;

    /* renamed from: L */
    public Handler f4204L;

    /* renamed from: M */
    public hpb f4205M;

    /* renamed from: Q */
    public long f4206Q;

    /* renamed from: X */
    public List f4207X;

    /* renamed from: Y */
    public String f4208Y;

    /* renamed from: Z */
    public String f4209Z;

    /* renamed from: h */
    public wqh f4210h;
    public lpc h0;
    public Map i0;
    public PropertyDefinition j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public List n0;
    public final RecyclerView.InterfaceC2382s o0;
    public final RecyclerView.InterfaceC2382s p0;

    /* renamed from: q */
    public yqb f4211q;

    /* renamed from: s */
    public tph f4212s;

    /* renamed from: x */
    public AutoCompleteListModel f4213x;

    /* renamed from: y */
    public boolean f4214y;

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$a */
    public /* synthetic */ class C1451a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4215a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4216b;

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
            f4215a = iArr;
            int[] iArr2 = new int[wqh.values().length];
            try {
                iArr2[wqh.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[wqh.ME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[wqh.MY_TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[wqh.ME_ENGAGEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[wqh.MY_TEAM_ENGAGEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[wqh.ALL_ENGAGEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f4216b = iArr2;
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$b */
    public static final class C1452b implements ck6 {

        /* renamed from: b */
        public final /* synthetic */ PaginatedDataModel f4218b;

        public C1452b(PaginatedDataModel paginatedDataModel) {
            this.f4218b = paginatedDataModel;
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            ck6.C12696a.m21336b(this, view, i, obj);
            try {
                BaseTasksFragment.this.f4214y = true;
                BaseTasksFragment.this.R1().n0(BaseTasksFragment.this.f4214y);
                Tasks tasks = (Tasks) this.f4218b.get(i);
                tasks.setSelected(!tasks.isSelected());
                ((CheckBox) view.getRootView().findViewById(z8e.cbTaskSelect)).setChecked(tasks.isSelected());
                Fragment parentFragment = BaseTasksFragment.this.getParentFragment();
                sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.ui.todo.TodoFragment");
                ((TodoFragment) parentFragment).x2(tasks.isSelected(), tasks);
                RecyclerView.AbstractC2371h adapter = BaseTasksFragment.this.R1().s0.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            Context contextRequireContext = BaseTasksFragment.this.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Tasks tasks = (Tasks) this.f4218b.get(i);
                if (BaseTasksFragment.this.f4214y) {
                    view.performHapticFeedback(1);
                    RecyclerView.AbstractC2379p layoutManager = BaseTasksFragment.this.R1().s0.getLayoutManager();
                    if (layoutManager != null) {
                        BaseTasksFragment baseTasksFragment = BaseTasksFragment.this;
                        if (layoutManager.mo9033S(i) != null) {
                            tasks.setSelected(!tasks.isSelected());
                            Fragment parentFragment = baseTasksFragment.getParentFragment();
                            sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.ui.todo.TodoFragment");
                            ((TodoFragment) parentFragment).x2(tasks.isSelected(), tasks);
                            RecyclerView.AbstractC2371h adapter = baseTasksFragment.R1().s0.getAdapter();
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
                view.performHapticFeedback(1);
                int id = view.getId();
                if ((id == z8e.tvClientName_alternate || id == z8e.tvClientName) || id == z8e.ivClientProfilePic) {
                    if (obj instanceof Tasks) {
                        BaseTasksFragment.this.s2(((Tasks) obj).getClientID());
                        return;
                    }
                    return;
                }
                if (id == z8e.chip_1) {
                    if (obj instanceof Tasks) {
                        BaseTasksFragment.this.t2(((Tasks) obj).getTaskAssignedToID());
                        return;
                    }
                    return;
                }
                if (id != z8e.taskComplete) {
                    if (obj != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(BaseTasksFragment.this.getString(hae.argumentEngagementID), ((Tasks) obj).getId());
                        BaseTasksFragment baseTasksFragment2 = BaseTasksFragment.this;
                        baseTasksFragment2.d1(AbstractC2338a.m8705a(baseTasksFragment2), z8e.todo_start, z8e.action_todo_to_taskDetails, bundle);
                        return;
                    }
                    return;
                }
                if (obj instanceof Tasks) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean(BaseTasksFragment.this.getString(hae.argumentTasksOpenUpdateSheet), true);
                    bundle2.putString(BaseTasksFragment.this.getString(hae.argumentEngagementID), ((Tasks) obj).getId());
                    BaseTasksFragment baseTasksFragment3 = BaseTasksFragment.this;
                    baseTasksFragment3.d1(AbstractC2338a.m8705a(baseTasksFragment3), z8e.todo_start, z8e.action_todo_to_taskDetails, bundle2);
                }
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$c */
    public static final class C1453c extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4220a;

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
                f4220a = iArr;
            }
        }

        /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$c$b */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return uk3.m51674d(((TaskCategoryList) obj).getKey(), ((TaskCategoryList) obj2).getKey());
            }
        }

        public C1453c() {
            super(1);
        }

        /* renamed from: a */
        public final void m2892a(yne yneVar) {
            BaseTasksFragment baseTasksFragment = BaseTasksFragment.this;
            int i = a.f4220a[yneVar.m58025c().ordinal()];
            if (i != 1) {
                if (i != 3) {
                    return;
                }
                baseTasksFragment.o2();
                return;
            }
            if (yneVar.m58023a() != null) {
                List<TaskCategoryList> list = (List) yneVar.m58023a();
                if (list != null) {
                    ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
                    for (TaskCategoryList taskCategoryList : list) {
                        if (sq8.m48644c(taskCategoryList.getKey(), baseTasksFragment.i2())) {
                            taskCategoryList.setSelected(true);
                        }
                        arrayList.add(y3i.f54824a);
                    }
                }
                List list2 = (List) yneVar.m58023a();
                if (list2 != null) {
                    kh3.I0(list2, new b());
                }
                Object objM58023a = yneVar.m58023a();
                sq8.m48646e(objM58023a);
                baseTasksFragment.n0 = (List) objM58023a;
                baseTasksFragment.z2(baseTasksFragment.n0);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2892a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$d */
    public static final class C1454d extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$d$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4222a;

            static {
                int[] iArr = new int[q5g.values().length];
                try {
                    iArr[q5g.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q5g.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q5g.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4222a = iArr;
            }
        }

        public C1454d() {
            super(1);
        }

        /* renamed from: a */
        public final void m2893a(yne yneVar) {
            if (yneVar != null) {
                BaseTasksFragment baseTasksFragment = BaseTasksFragment.this;
                if (a.f4222a[yneVar.m58025c().ordinal()] != 1) {
                    return;
                }
                if (yneVar.m58023a() != null) {
                    baseTasksFragment.j0 = (PropertyDefinition) kh3.h0((List) yneVar.m58023a());
                }
                baseTasksFragment.y2(baseTasksFragment.l2());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2893a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$e */
    public static final class C1455e extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ String f4224b;

        /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$e$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4225a;

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
                f4225a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1455e(String str) {
            super(1);
            this.f4224b = str;
        }

        /* renamed from: a */
        public final void m2894a(yne yneVar) {
            BaseTasksFragment baseTasksFragment = BaseTasksFragment.this;
            String str = this.f4224b;
            int i = a.f4225a[yneVar.m58025c().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    baseTasksFragment.R1().u0.m13584d();
                    baseTasksFragment.R1().u0.setVisibility(8);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    baseTasksFragment.o2();
                    baseTasksFragment.R1().u0.m13583c();
                    baseTasksFragment.R1().u0.setVisibility(0);
                    return;
                }
            }
            if (yneVar.m58023a() != null) {
                baseTasksFragment.f4209Z = str;
                hpb hpbVar = baseTasksFragment.f4205M;
                if (hpbVar == null) {
                    return;
                }
                Object objM58023a = yneVar.m58023a();
                sq8.m48646e(objM58023a);
                hpbVar.setValue(objM58023a);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2894a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$f */
    public static final class C1456f implements RecyclerView.InterfaceC2382s {
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

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$g */
    public static final class C1457g implements RecyclerView.InterfaceC2382s {
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

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$h */
    public static final class C1458h extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ AbstractC2333d f4227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1458h(AbstractC2333d abstractC2333d) {
            super(1);
            this.f4227b = abstractC2333d;
        }

        /* renamed from: b */
        public static final boolean m2896b(String str, Tasks tasks) {
            return Objects.equals(tasks.getId(), str);
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
            hpb hpbVar = BaseTasksFragment.this.f4205M;
            if (hpbVar != null && (paginatedDataModel2 = (PaginatedDataModel) hpbVar.getValue()) != null) {
                paginatedDataModel2.deleteItemsByPredicate(new Predicate() { // from class: o.bf1
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return BaseTasksFragment.C1458h.m2896b(str, (Tasks) obj);
                    }
                });
            }
            C2332c c2332cM8590F = this.f4227b.m8590F();
            if (c2332cM8590F != null && (c2151tM8556h = c2332cM8590F.m8556h()) != null) {
            }
            hpb hpbVar2 = BaseTasksFragment.this.f4205M;
            if (((hpbVar2 == null || (paginatedDataModel = (PaginatedDataModel) hpbVar2.getValue()) == null) ? 0 : paginatedDataModel.size()) == 0) {
                BaseTasksFragment.this.C2();
                BaseTasksFragment.this.R1().s0.setVisibility(4);
            } else {
                BaseTasksFragment.this.o2();
                BaseTasksFragment.this.R1().s0.setVisibility(0);
            }
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$i */
    public static final class C1459i implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f4228a;

        public C1459i(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f4228a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f4228a;
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
            this.f4228a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$j */
    public static final class C1460j extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f4229g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1460j(List list, C1461k c1461k) {
            super(c1461k, null, false, null, 14, null);
            this.f4229g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_task_category_select;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f4229g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f4229g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$k */
    public static final class C1461k implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ List f4230a;

        /* renamed from: b */
        public final /* synthetic */ BaseTasksFragment f4231b;

        public C1461k(List list, BaseTasksFragment baseTasksFragment) {
            this.f4230a = list;
            this.f4231b = baseTasksFragment;
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
            view.performHapticFeedback(1);
            if (view.getId() == z8e.chipData && (obj instanceof TaskCategoryList)) {
                int size = this.f4230a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TaskCategoryList taskCategoryList = (TaskCategoryList) this.f4230a.get(i2);
                    if (taskCategoryList.isSelected()) {
                        taskCategoryList.setSelected(false);
                        RecyclerView.AbstractC2371h adapter = this.f4231b.R1().r0.getAdapter();
                        if (adapter != null) {
                            adapter.notifyItemChanged(i2);
                        }
                    }
                }
                TaskCategoryList taskCategoryList2 = (TaskCategoryList) obj;
                taskCategoryList2.setSelected(true);
                this.f4231b.w2(taskCategoryList2.getKey());
                AbstractC0059a.m132a().n1(this.f4231b.i2());
                this.f4231b.v2();
                BaseTasksFragment baseTasksFragment = this.f4231b;
                String str = baseTasksFragment.f4209Z;
                if (str == null) {
                    str = "";
                }
                baseTasksFragment.M1(str, false);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$l */
    public static final class C1462l extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f4232g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1462l(List list, C1463m c1463m, rog rogVar) {
            super(c1463m, null, false, rogVar, 6, null);
            this.f4232g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_teams;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f4232g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f4232g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.todo.BaseTasksFragment$m */
    public static final class C1463m implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ List f4233a;

        /* renamed from: b */
        public final /* synthetic */ BaseTasksFragment f4234b;

        public C1463m(List list, BaseTasksFragment baseTasksFragment) {
            this.f4233a = list;
            this.f4234b = baseTasksFragment;
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
            Iterator it = this.f4233a.iterator();
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
                int iIndexOf = this.f4233a.indexOf(leadsTeam);
                if (iIndexOf >= 0 && (adapter = this.f4234b.R1().t0.getAdapter()) != null) {
                    adapter.notifyItemChanged(iIndexOf);
                }
            }
            LeadsTeam leadsTeam2 = (LeadsTeam) this.f4233a.get(i);
            this.f4234b.x2(leadsTeam2.getTeamId());
            leadsTeam2.setSelected(true);
            RecyclerView.AbstractC2371h adapter2 = this.f4234b.R1().t0.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(i);
            }
            this.f4234b.o2();
            this.f4234b.v2();
            BaseTasksFragment.N1(this.f4234b, "", false, 2, null);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseTasksFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final boolean F2(String str, Tasks tasks) {
        sq8.m48649h(str, "$taskId");
        return Objects.equals(tasks.getId(), str);
    }

    public static /* synthetic */ void N1(BaseTasksFragment baseTasksFragment, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: currentItem");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseTasksFragment.M1(str, z);
    }

    public static final ResultsChangeListener T1(BaseTasksFragment baseTasksFragment, PaginatedDataModel paginatedDataModel, RecyclerView.AbstractC2371h abstractC2371h) {
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(abstractC2371h);
        return baseTasksFragment.f2(paginatedDataModel, abstractC2371h);
    }

    public static final Integer W1(BaseTasksFragment baseTasksFragment, PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        return Integer.valueOf(baseTasksFragment.U1(paginatedDataModel));
    }

    public static final Object Y1(BaseTasksFragment baseTasksFragment, PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "dataModel");
        return baseTasksFragment.new C1452b(paginatedDataModel);
    }

    public static final Integer b2(BaseTasksFragment baseTasksFragment, PaginatedDataModel paginatedDataModel, Integer num) {
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(num);
        return Integer.valueOf(baseTasksFragment.Z1(paginatedDataModel, num.intValue()));
    }

    public static final Object e2(BaseTasksFragment baseTasksFragment, long j, PaginatedDataModel paginatedDataModel, Integer num) {
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48646e(paginatedDataModel);
        sq8.m48646e(num);
        int iIntValue = num.intValue();
        String str = baseTasksFragment.f4209Z;
        if (str == null) {
            str = "";
        }
        return baseTasksFragment.c2(paginatedDataModel, iIntValue, str, j);
    }

    public static final void g2(final dge dgeVar, final BaseTasksFragment baseTasksFragment, final PaginatedDataModel paginatedDataModel, final RecyclerView.AbstractC2371h abstractC2371h, final ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTime");
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(abstractC2371h, "$adapter");
        j0f.m33008i(new Runnable() { // from class: o.ze1
            @Override // java.lang.Runnable
            public final void run() {
                BaseTasksFragment.h2(dgeVar, baseTasksFragment, paginatedDataModel, abstractC2371h, resultsChangedEvent);
            }
        });
    }

    public static final void h2(dge dgeVar, BaseTasksFragment baseTasksFragment, PaginatedDataModel paginatedDataModel, RecyclerView.AbstractC2371h abstractC2371h, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTime");
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48649h(paginatedDataModel, "$dataModel");
        sq8.m48649h(abstractC2371h, "$adapter");
        if (dgeVar.f19803a) {
            baseTasksFragment.R1().u0.m13584d();
            baseTasksFragment.R1().u0.setVisibility(8);
            if (paginatedDataModel.size() == 0) {
                baseTasksFragment.C2();
                baseTasksFragment.R1().s0.setVisibility(4);
            } else {
                baseTasksFragment.o2();
                baseTasksFragment.R1().s0.setVisibility(0);
            }
            dgeVar.f19803a = false;
        }
        sq8.m48646e(resultsChangedEvent);
        baseTasksFragment.p2(abstractC2371h, resultsChangedEvent);
    }

    public static final void q2(BaseTasksFragment baseTasksFragment) {
        AutoCompleteTextView autoCompleteTextView;
        sq8.m48649h(baseTasksFragment, "this$0");
        yqb yqbVar = baseTasksFragment.f4211q;
        if (yqbVar == null || (autoCompleteTextView = yqbVar.w0) == null) {
            return;
        }
        autoCompleteTextView.setText((CharSequence) baseTasksFragment.f4203H, false);
    }

    public static final void r2(BaseTasksFragment baseTasksFragment, List list, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(baseTasksFragment, "this$0");
        sq8.m48649h(list, "$list");
        baseTasksFragment.f4203H = (String) list.get(i);
        AbstractC0059a.m132a().n1(baseTasksFragment.f4203H);
        baseTasksFragment.v2();
        String str = baseTasksFragment.f4209Z;
        if (str == null) {
            str = "";
        }
        N1(baseTasksFragment, str, false, 2, null);
    }

    public final void A2(List list) {
        R1().t0.setAdapter(new C1462l(list, new C1463m(list, this), new rog(false, this.m0, 1, null)));
        R1().t0.m9089k(this.p0);
        if (list.size() == 0) {
            R1().t0.setVisibility(8);
        }
    }

    public final void B2(tph tphVar) {
        sq8.m48649h(tphVar, "<set-?>");
        this.f4212s = tphVar;
    }

    public final void C2() {
        if (n2().m50306r().m53286F()) {
            String str = this.f4209Z;
            if (str == null) {
                str = "";
            }
            if (!(str.length() > 0)) {
                R1().l0(true);
                R1().k0(false);
                yqb yqbVarR1 = R1();
                Context contextRequireContext = requireContext();
                sq8.m48648g(contextRequireContext, "requireContext(...)");
                yqbVarR1.j0(bub.m19823b(contextRequireContext));
                return;
            }
        }
        R1().l0(false);
        R1().k0(true);
        yqb yqbVarR12 = R1();
        Context contextRequireContext2 = requireContext();
        sq8.m48648g(contextRequireContext2, "requireContext(...)");
        yqbVarR12.j0(bub.m19823b(contextRequireContext2));
    }

    public final void D2(boolean z) {
        if (z) {
            R1().m0(true);
            yqb yqbVarR1 = R1();
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            yqbVarR1.j0(bub.m19823b(contextRequireContext));
        }
    }

    public final void E2(final String str) {
        PaginatedDataModel paginatedDataModel;
        PaginatedDataModel paginatedDataModel2;
        sq8.m48649h(str, "taskId");
        hpb hpbVar = this.f4205M;
        if (hpbVar != null && (paginatedDataModel2 = (PaginatedDataModel) hpbVar.getValue()) != null) {
            paginatedDataModel2.deleteItemsByPredicate(new Predicate() { // from class: o.af1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return BaseTasksFragment.F2(str, (Tasks) obj);
                }
            });
        }
        hpb hpbVar2 = this.f4205M;
        if (((hpbVar2 == null || (paginatedDataModel = (PaginatedDataModel) hpbVar2.getValue()) == null) ? 0 : paginatedDataModel.size()) == 0) {
            C2();
        }
    }

    public final void M1(String str, boolean z) {
        sq8.m48649h(str, "searchText");
        if (this.f4203H.length() == 0) {
            this.f4203H = "";
        }
        if (!Objects.equals(this.f4209Z, str) || h1()) {
            W0(false);
            this.f4209Z = str;
            m2(str, this.f4203H);
            if (z) {
                j2(this.f4203H);
            }
        }
    }

    public final AbstractC2145n O1(String str, String str2) {
        List listM50305q = n2().m50305q();
        ArrayList arrayList = null;
        switch (C1451a.f4216b[this.f4210h.ordinal()]) {
            case 1:
                return n2().m50297h(str, str2, listM50305q);
            case 2:
                return n2().m50300k(str, str2, listM50305q);
            case 3:
                tph tphVarN2 = n2();
                String str3 = this.f4208Y;
                List list = this.f4207X;
                if (list != null) {
                    arrayList = new ArrayList(dh3.m23088v(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((LeadsTeam) it.next()).getId());
                    }
                }
                return tphVarN2.m50302m(str3, arrayList == null ? ch3.m21246k() : arrayList, str, str2, listM50305q);
            case 4:
                return n2().m50300k(str, str2, listM50305q);
            case 5:
                tph tphVarN22 = n2();
                String str4 = this.f4208Y;
                List list2 = this.f4207X;
                if (list2 != null) {
                    arrayList = new ArrayList(dh3.m23088v(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((LeadsTeam) it2.next()).getId());
                    }
                }
                return tphVarN22.m50302m(str4, arrayList == null ? ch3.m21246k() : arrayList, str, str2, listM50305q);
            case 6:
                return n2().m50297h(str, str2, listM50305q);
            default:
                throw new szb();
        }
    }

    public final AbstractC2145n P1(String str, String str2) {
        List listM21246k = null;
        switch (C1451a.f4216b[this.f4210h.ordinal()]) {
            case 1:
                return n2().m50298i(str, str2);
            case 2:
                return n2().m50301l(str, str2);
            case 3:
                tph tphVarN2 = n2();
                String str3 = this.f4208Y;
                List list = this.f4207X;
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
                return tphVarN2.m50303n(str3, listM21246k, str, str2);
            case 4:
                return n2().m50301l(str, str2);
            case 5:
                tph tphVarN22 = n2();
                String str4 = this.f4208Y;
                List list2 = this.f4207X;
                if (list2 != null) {
                    listM21246k = new ArrayList(dh3.m23088v(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        listM21246k.add(((LeadsTeam) it2.next()).getId());
                    }
                }
                if (listM21246k == null) {
                    listM21246k = ch3.m21246k();
                }
                return tphVarN22.m50303n(str4, listM21246k, str, str2);
            case 6:
                return n2().m50298i(str, str2);
            default:
                throw new szb();
        }
    }

    public final lpc Q1(AbstractC2145n abstractC2145n, long j) {
        lpc lpcVar = new lpc(getViewLifecycleOwner(), abstractC2145n, X1(), null, true, null, d2(j), a2(), V1(), S1());
        lpcVar.setStateRestorationPolicy(RecyclerView.AbstractC2371h.a.PREVENT_WHEN_EMPTY);
        return lpcVar;
    }

    public final yqb R1() {
        yqb yqbVar = this.f4211q;
        sq8.m48646e(yqbVar);
        return yqbVar;
    }

    public final ll7 S1() {
        return new te1(this);
    }

    public final int U1(PaginatedDataModel paginatedDataModel) {
        sq8.m48649h(paginatedDataModel, "dataModel");
        return paginatedDataModel.size();
    }

    public final Function V1() {
        return new Function() { // from class: o.we1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseTasksFragment.W1(this.f51827a, (PaginatedDataModel) obj);
            }
        };
    }

    public final Function X1() {
        return new Function() { // from class: o.re1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseTasksFragment.Y1(this.f43428a, (PaginatedDataModel) obj);
            }
        };
    }

    public final int Z1(PaginatedDataModel paginatedDataModel, int i) {
        return p9e.item_tasks;
    }

    public final ll7 a2() {
        return new se1(this);
    }

    public final Object c2(PaginatedDataModel paginatedDataModel, int i, String str, long j) {
        Object obj = paginatedDataModel.get(i);
        sq8.m48648g(obj, "get(...)");
        Tasks tasks = (Tasks) obj;
        if (getParentFragment() instanceof TodoFragment) {
            Fragment parentFragment = getParentFragment();
            sq8.m48647f(parentFragment, "null cannot be cast to non-null type ai.salesmax.ui.todo.TodoFragment");
            tasks.setSelected(kh3.m35708X(((TodoFragment) parentFragment).J1(), tasks.getId()));
        }
        tasks.setShowSelection(this.f4214y);
        tasks.setTaskAutocloseInDays((String) this.i0.getOrDefault(tasks.getTaskEngagementType(), ""));
        return tasks;
    }

    public final ll7 d2(long j) {
        return new xe1(this, j);
    }

    public final ResultsChangeListener f2(final PaginatedDataModel paginatedDataModel, final RecyclerView.AbstractC2371h abstractC2371h) {
        final dge dgeVar = new dge();
        dgeVar.f19803a = true;
        return new ResultsChangeListener() { // from class: o.ye1
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                BaseTasksFragment.g2(dgeVar, this, paginatedDataModel, abstractC2371h, resultsChangedEvent);
            }
        };
    }

    public final String i2() {
        return this.f4203H;
    }

    public final void j2(String str) {
        xca viewLifecycleOwner = getViewLifecycleOwner();
        sq8.m48648g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        String str2 = this.f4209Z;
        if (str2 == null) {
            str2 = "";
        }
        O1(str2, str).observe(viewLifecycleOwner, new C1459i(new C1453c()));
    }

    public final void k2() {
        wi0.g0("taskType").observe(getViewLifecycleOwner(), new C1459i(new C1454d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map l2() {
        List<ryh> listM21246k;
        List<PropertyOptions> possibleValues;
        HashMap map = new HashMap();
        PropertyDefinition propertyDefinition = this.j0;
        if (propertyDefinition == null || (possibleValues = propertyDefinition.getPossibleValues()) == null) {
            listM21246k = ch3.m21246k();
        } else {
            ArrayList<ryh> arrayList = new ArrayList(dh3.m23088v(possibleValues, 10));
            for (PropertyOptions propertyOptions : possibleValues) {
                arrayList.add(uyh.of(propertyOptions.getValue(), ja8.f30035c.fromJson(propertyOptions.getOtherAttributes(), Map.class)));
            }
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
            for (ryh ryhVar : arrayList) {
                Object obj = ryhVar.f44265a;
                Object obj2 = ryhVar.f44266b;
                sq8.m48648g(obj2, "_2");
                arrayList2.add(uyh.of(obj, ((Map) obj2).getOrDefault("taskAutoCloseDays", "")));
            }
            listM21246k = (ArrayList) kh3.M0(arrayList2, new ArrayList());
            if (listM21246k == null) {
            }
        }
        for (ryh ryhVar2 : listM21246k) {
            map.put(ryhVar2.f44265a, String.valueOf(ryhVar2.f44266b));
        }
        return map;
    }

    public final void m2(String str, String str2) {
        xca viewLifecycleOwner = getViewLifecycleOwner();
        sq8.m48648g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        P1(str, str2).observe(viewLifecycleOwner, new C1459i(new C1455e(str)));
    }

    public final tph n2() {
        tph tphVar = this.f4212s;
        if (tphVar != null) {
            return tphVar;
        }
        sq8.m48667z("viewModel");
        return null;
    }

    public final void o2() {
        R1().l0(false);
        R1().k0(false);
        R1().m0(false);
        yqb yqbVarR1 = R1();
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        yqbVarR1.j0(bub.m19823b(contextRequireContext));
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            B2((tph) new b0(fragmentActivityRequireActivity).m6505a(tph.class));
        }
        List listM50305q = n2().m50305q();
        String str = (String) listM50305q.get(0);
        sq8.m48647f(listM50305q, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        this.f4213x = new AutoCompleteListModel(str, (ArrayList) listM50305q);
        if (this.f4210h == wqh.MY_TEAM) {
            mii miiVarM50307s = n2().m50307s();
            AuthorizationLevel authorizationLevelM39162l = miiVarM50307s != null ? miiVarM50307s.m39162l() : null;
            if (AuthorizationLevel.SUPERADMIN == authorizationLevelM39162l || AuthorizationLevel.ADMIN == authorizationLevelM39162l) {
                List listM54451Q = wi0.m54451Q();
                if (listM54451Q.size() <= 0) {
                    this.f4207X = listM54451Q;
                    return;
                }
                Team teamJustId = Team.justId("ALL");
                sq8.m48648g(teamJustId, "justId(...)");
                ArrayList arrayListM21242g = ch3.m21242g(new LeadsTeam(teamJustId));
                arrayListM21242g.addAll(listM54451Q);
                this.f4207X = arrayListM21242g;
                return;
            }
            List listM54453S = wi0.m54453S();
            if (listM54453S.size() <= 0) {
                this.f4207X = listM54453S;
                return;
            }
            Team teamJustId2 = Team.justId("ALL");
            sq8.m48648g(teamJustId2, "justId(...)");
            ArrayList arrayListM21242g2 = ch3.m21242g(new LeadsTeam(teamJustId2));
            arrayListM21242g2.addAll(listM54453S);
            this.f4207X = arrayListM21242g2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4211q == null) {
            this.f4211q = yqb.h0(layoutInflater, viewGroup, false);
            hpb hpbVar = this.f4205M;
            sq8.m48646e(hpbVar);
            this.h0 = Q1(hpbVar, this.f4206Q);
            R1().s0.setItemAnimator(null);
            R1().s0.setAdapter(this.h0);
            yqb yqbVarR1 = R1();
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            yqbVarR1.j0(bub.m19823b(contextRequireContext));
            if (this.f4210h == wqh.MY_TEAM) {
                Object objOrElse = Optional.ofNullable(this.f4207X).orElse(new ArrayList());
                sq8.m48648g(objOrElse, "orElse(...)");
                List list = (List) objOrElse;
                if (list.isEmpty()) {
                    D2(true);
                } else {
                    this.f4208Y = ((LeadsTeam) list.get(0)).getTeamId();
                    ((LeadsTeam) list.get(0)).setSelected(true);
                    A2(list);
                }
            } else {
                R1().t0.setVisibility(8);
            }
        }
        View viewM25689B = R1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        PaginatedDataModel paginatedDataModel;
        super.onDestroy();
        lpc lpcVar = this.h0;
        if (lpcVar != null) {
            lpcVar.m37597o();
        }
        this.h0 = null;
        hpb hpbVar = this.f4205M;
        if (hpbVar != null && (paginatedDataModel = (PaginatedDataModel) hpbVar.getValue()) != null) {
            paginatedDataModel.reset();
        }
        this.f4205M = null;
        this.f4207X = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f4204L.removeCallbacksAndMessages(null);
        if (this.f4211q != null) {
            R1().s0.setAdapter(null);
            R1().t0.setAdapter(null);
            R1().w0.setAdapter(null);
            R1().w0.setText((CharSequence) null);
            R1().w0.clearListSelection();
            R1().w0.setOnItemClickListener(null);
            R1().v0.setEndIconMode(0);
            R1().v0.setEndIconDrawable((Drawable) null);
            R1().v0.setEndIconTintList(null);
            R1().v0.m15384z();
            R1().v0.m15347A();
            R1().v0.removeAllViews();
        }
        this.f4211q = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C2151t c2151tM8556h;
        hpb hpbVarM6585e;
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        k2();
        R1().n0(this.f4214y);
        final List listM50305q = n2().m50305q();
        ArrayList arrayList = new ArrayList();
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            R1().w0.setAdapter(new C2674b(contextRequireContext, R.layout.simple_spinner_dropdown_item, listM50305q.toArray(new String[0])));
        }
        if (this.f4203H.length() == 0) {
            if (String.valueOf(AbstractC0059a.m132a().m3224L()).length() > 0) {
                this.f4203H = String.valueOf(AbstractC0059a.m132a().m3224L());
            } else {
                this.f4203H = (String) listM50305q.get(0);
                AbstractC0059a.m132a().n1(this.f4203H);
            }
        }
        int size = listM50305q.size();
        for (int i = 0; i < size; i++) {
            TaskCategoryList taskCategoryList = new TaskCategoryList(null, false, null, 7, null);
            taskCategoryList.setKey((String) listM50305q.get(i));
            taskCategoryList.setSelected(sq8.m48644c(taskCategoryList.getKey(), this.f4203H));
            if (taskCategoryList.isSelected()) {
                this.k0 = i;
            }
            arrayList.add(taskCategoryList);
        }
        if (!this.n0.isEmpty()) {
            z2(this.n0);
        }
        R1().w0.postDelayed(new Runnable() { // from class: o.ue1
            @Override // java.lang.Runnable
            public final void run() {
                BaseTasksFragment.q2(this.f48751a);
            }
        }, 10L);
        R1().w0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.ve1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i2, long j) {
                BaseTasksFragment.r2(this.f50227a, listM50305q, adapterView, view2, i2, j);
            }
        });
        AbstractC2333d abstractC2333dM8705a = AbstractC2338a.m8705a(this);
        C2332c c2332cM8590F = abstractC2333dM8705a.m8590F();
        if (c2332cM8590F == null || (c2151tM8556h = c2332cM8590F.m8556h()) == null || (hpbVarM6585e = c2151tM8556h.m6585e("deleteTaskId")) == null) {
            return;
        }
        hpbVarM6585e.observe(getViewLifecycleOwner(), new C1459i(new C1458h(abstractC2333dM8705a)));
    }

    public final void p2(RecyclerView.AbstractC2371h abstractC2371h, ResultsChangedEvent resultsChangedEvent) {
        ResultsChangedEvent.ResultsChangedEventType resultsChangedEventTypeEventType = resultsChangedEvent.eventType();
        int i = resultsChangedEventTypeEventType == null ? -1 : C1451a.f4215a[resultsChangedEventTypeEventType.ordinal()];
        if (i == 1) {
            abstractC2371h.notifyItemRangeInserted(resultsChangedEvent.start(), resultsChangedEvent.count());
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

    public final void s2(String str) {
        if (str.length() > 0) {
            Bundle bundle = new Bundle();
            bundle.putString(getString(hae.argumentLeadId), str);
            d1(AbstractC2338a.m8705a(this), z8e.todo_start, z8e.action_task_to_leadDetails, bundle);
        }
    }

    public final void t2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(getString(hae.argumentUser), str);
        d1(AbstractC2338a.m8705a(this), z8e.todo_start, z8e.action_task_to_userDetails, bundle);
    }

    public final void u2() {
        this.f4214y = false;
        R1().n0(this.f4214y);
        RecyclerView.AbstractC2371h adapter = R1().s0.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void v2() {
        this.f4209Z = null;
    }

    public final void w2(String str) {
        sq8.m48649h(str, "<set-?>");
        this.f4203H = str;
    }

    public final void x2(String str) {
        sq8.m48649h(str, "<set-?>");
        this.f4208Y = str;
    }

    public final void y2(Map map) {
        sq8.m48649h(map, "<set-?>");
        this.i0 = map;
    }

    public final void z2(List list) {
        C1460j c1460j = new C1460j(list, new C1461k(list, this));
        c1460j.setStateRestorationPolicy(RecyclerView.AbstractC2371h.a.PREVENT_WHEN_EMPTY);
        R1().r0.setAdapter(c1460j);
        R1().r0.m9089k(this.o0);
        R1().r0.s1(this.k0);
    }

    public BaseTasksFragment(wqh wqhVar) {
        sq8.m48649h(wqhVar, "viewOptionType");
        this.f4210h = wqhVar;
        this.f4203H = "";
        this.f4204L = new Handler(Looper.getMainLooper());
        this.f4205M = new hpb();
        this.f4208Y = "";
        this.i0 = new HashMap();
        this.l0 = true;
        Boolean boolM40355p = nd.m40355p();
        sq8.m48648g(boolM40355p, "isAccountDealManual(...)");
        this.m0 = boolM40355p.booleanValue();
        this.n0 = new ArrayList();
        this.o0 = new C1456f();
        this.p0 = new C1457g();
    }

    public /* synthetic */ BaseTasksFragment(wqh wqhVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? wqh.ALL : wqhVar);
    }
}
