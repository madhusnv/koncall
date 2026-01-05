package ai.salesmax.ui.settings;

import ai.salesmax.model.WorkingHours;
import ai.salesmax.ui.settings.WorkingHoursFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.AbstractC2338a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p001o.am7;
import p001o.ck6;
import p001o.gcj;
import p001o.id5;
import p001o.iuf;
import p001o.jkf;
import p001o.kf9;
import p001o.n9c;
import p001o.p9e;
import p001o.q5g;
import p001o.sq8;
import p001o.tl7;
import p001o.tpb;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;

/* loaded from: classes.dex */
public final class WorkingHoursFragment extends Fragment {

    /* renamed from: d */
    public static final C1405a f4094d = new C1405a(null);

    /* renamed from: e */
    public static final int f4095e = 8;

    /* renamed from: a */
    public jkf f4096a;

    /* renamed from: b */
    public gcj f4097b;

    /* renamed from: c */
    public List f4098c = new ArrayList();

    /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$a */
    public static final class C1405a {
        public C1405a() {
        }

        public /* synthetic */ C1405a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$c */
    public static final class C1407c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ gcj f4100a;

        /* renamed from: b */
        public final /* synthetic */ WorkingHoursFragment f4101b;

        /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4102a;

            static {
                int[] iArr = new int[q5g.values().length];
                try {
                    iArr[q5g.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q5g.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q5g.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4102a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1407c(gcj gcjVar, WorkingHoursFragment workingHoursFragment) {
            super(1);
            this.f4100a = gcjVar;
            this.f4101b = workingHoursFragment;
        }

        /* renamed from: a */
        public final void m2844a(yne yneVar) {
            gcj gcjVar = this.f4100a;
            WorkingHoursFragment workingHoursFragment = this.f4101b;
            int i = a.f4102a[yneVar.m58025c().ordinal()];
            if (i == 2) {
                gcjVar.getClass();
                AbstractC2338a.m8705a(workingHoursFragment).f0();
            } else {
                if (i != 3) {
                    return;
                }
                gcjVar.getClass();
                String strM58024b = yneVar.m58024b();
                StringBuilder sb = new StringBuilder();
                sb.append("Working hours couldn't be saved ");
                sb.append(strM58024b);
                yneVar.m58026d();
                AbstractC2338a.m8705a(workingHoursFragment).f0();
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2844a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$d */
    public static final class C1408d extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$d$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4104a;

            static {
                int[] iArr = new int[q5g.values().length];
                try {
                    iArr[q5g.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q5g.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q5g.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4104a = iArr;
            }
        }

        public C1408d() {
            super(1);
        }

        /* renamed from: a */
        public final void m2845a(yne yneVar) {
            List list;
            WorkingHoursFragment workingHoursFragment = WorkingHoursFragment.this;
            if (a.f4104a[yneVar.m58025c().ordinal()] == 2 && (list = (List) yneVar.m58023a()) != null) {
                workingHoursFragment.Q0(list);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2845a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$e */
    public static final class C1409e implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f4105a;

        public C1409e(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f4105a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f4105a;
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
            this.f4105a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$f */
    public static final class C1410f extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f4106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1410f(List list, C1411g c1411g) {
            super(c1411g, null, false, null, 14, null);
            this.f4106g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_working_hours;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f4106g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f4106g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.settings.WorkingHoursFragment$g */
    public static final class C1411g implements ck6 {
        public C1411g() {
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
            if (obj instanceof WorkingHours) {
                if (view.getId() == z8e.startTime || view.getId() == z8e.startTimeTitle) {
                    WorkingHoursFragment.this.R0((WorkingHours) obj, "start");
                } else if (view.getId() == z8e.endTime || view.getId() == z8e.endTimeTitle) {
                    WorkingHoursFragment.this.R0((WorkingHours) obj, "end");
                }
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    public static final void O0(WorkingHoursFragment workingHoursFragment, gcj gcjVar, View view) {
        sq8.m48649h(workingHoursFragment, "this$0");
        sq8.m48649h(gcjVar, "$this_apply");
        Stream stream = workingHoursFragment.f4098c.stream();
        final C1406b c1406b = new tpb() { // from class: ai.salesmax.ui.settings.WorkingHoursFragment.b
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return Boolean.valueOf(((WorkingHours) obj).isSelected());
            }
        };
        if (!stream.anyMatch(new Predicate() { // from class: o.fcj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return WorkingHoursFragment.P0(c1406b, obj);
            }
        })) {
            AbstractC2338a.m8705a(workingHoursFragment).f0();
            return;
        }
        jkf jkfVar = workingHoursFragment.f4096a;
        if (jkfVar == null) {
            sq8.m48667z("viewModel");
            jkfVar = null;
        }
        jkfVar.m33931T(workingHoursFragment.f4098c).observe(workingHoursFragment.getViewLifecycleOwner(), new C1409e(new C1407c(gcjVar, workingHoursFragment)));
    }

    public static final boolean P0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    public static final void S0(MaterialTimePicker materialTimePicker, String str, WorkingHours workingHours, WorkingHoursFragment workingHoursFragment, View view) {
        String str2;
        sq8.m48649h(materialTimePicker, "$picker");
        sq8.m48649h(str, "$settingFor");
        sq8.m48649h(workingHours, "$workingHour");
        sq8.m48649h(workingHoursFragment, "this$0");
        int iU0 = materialTimePicker.U0();
        int iV0 = materialTimePicker.V0();
        if (materialTimePicker.U0() > 12) {
            iU0 -= 12;
            str2 = "PM";
        } else {
            str2 = "AM";
        }
        if (sq8.m48644c(str, "start")) {
            workingHours.setStartTime(iU0 + "." + iV0 + " " + str2);
        } else if (sq8.m48644c(str, "end")) {
            workingHours.setEndTime(iU0 + "." + iV0 + " " + str2);
        }
        workingHours.setSelected(true);
        RecyclerView.AbstractC2371h adapter = workingHoursFragment.N0().q0.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public static final void T0(View view) {
    }

    public static final void U0(DialogInterface dialogInterface) {
    }

    public static final void V0(DialogInterface dialogInterface) {
    }

    public final gcj N0() {
        gcj gcjVar = this.f4097b;
        sq8.m48646e(gcjVar);
        return gcjVar;
    }

    public final void Q0(List list) {
        this.f4098c = list;
        N0().q0.setAdapter(new C1410f(list, new C1411g()));
    }

    public final void R0(final WorkingHours workingHours, final String str) {
        String str2;
        int i = 9;
        if (sq8.m48644c(str, "start")) {
            str2 = "Select Start Time";
        } else if (sq8.m48644c(str, "end")) {
            str2 = "Select End Time";
            i = 18;
        } else {
            str2 = "";
        }
        MaterialTimePicker.C11165d c11165dM15516n = new MaterialTimePicker.C11165d().m15515m(DateFormat.is24HourFormat(requireContext()) ? 1 : 0).m15513k(i).m15514l(30).m15516n(str2);
        sq8.m48648g(c11165dM15516n, "setTitleText(...)");
        final MaterialTimePicker materialTimePickerM15512j = c11165dM15516n.m15512j();
        sq8.m48648g(materialTimePickerM15512j, "build(...)");
        if (isAdded() && !isDetached()) {
            materialTimePickerM15512j.show(requireActivity().getSupportFragmentManager(), "tag");
        }
        materialTimePickerM15512j.S0(new View.OnClickListener() { // from class: o.bcj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorkingHoursFragment.S0(materialTimePickerM15512j, str, workingHours, this, view);
            }
        });
        materialTimePickerM15512j.R0(new View.OnClickListener() { // from class: o.ccj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorkingHoursFragment.T0(view);
            }
        });
        materialTimePickerM15512j.P0(new DialogInterface.OnCancelListener() { // from class: o.dcj
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                WorkingHoursFragment.U0(dialogInterface);
            }
        });
        materialTimePickerM15512j.Q0(new DialogInterface.OnDismissListener() { // from class: o.ecj
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                WorkingHoursFragment.V0(dialogInterface);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4097b == null) {
            final gcj gcjVarH0 = gcj.h0(layoutInflater, viewGroup, false);
            gcjVarH0.o0.setOnClickListener(new View.OnClickListener() { // from class: o.acj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WorkingHoursFragment.O0(this.f14518a, gcjVarH0, view);
                }
            });
            this.f4097b = gcjVarH0;
        }
        View viewM25689B = N0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f4097b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
        jkf jkfVar = (jkf) new b0(fragmentActivityRequireActivity).m6505a(jkf.class);
        this.f4096a = jkfVar;
        if (jkfVar == null) {
            sq8.m48667z("viewModel");
            jkfVar = null;
        }
        jkfVar.m33947x().observe(getViewLifecycleOwner(), new C1409e(new C1408d()));
    }
}
