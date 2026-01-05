package p000;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.Template;
import ai.salesmax.model.TemplateTypes;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC10973a;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11949k;
import p001o.am7;
import p001o.ck6;
import p001o.cpf;
import p001o.dge;
import p001o.gge;
import p001o.hpb;
import p001o.iuf;
import p001o.j0f;
import p001o.kf9;
import p001o.mii;
import p001o.n8e;
import p001o.n9c;
import p001o.p9e;
import p001o.q5g;
import p001o.qae;
import p001o.sq8;
import p001o.th1;
import p001o.tl7;
import p001o.wi0;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;
import p001o.z9b;

/* renamed from: k */
/* loaded from: classes.dex */
public abstract class AbstractC11949k {

    /* renamed from: k$a */
    public static final class a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ cpf f13938a;

        /* renamed from: b */
        public final /* synthetic */ hpb f13939b;

        /* renamed from: k$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C19582a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f13940a;

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
                f13940a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cpf cpfVar, hpb hpbVar) {
            super(1);
            this.f13938a = cpfVar;
            this.f13939b = hpbVar;
        }

        /* renamed from: c */
        public static final void m16246c(cpf cpfVar, hpb hpbVar, yne yneVar) {
            sq8.m48649h(cpfVar, "$templateBinding");
            sq8.m48649h(hpbVar, "$fileTemplatesLiveData");
            cpfVar.r0.m13584d();
            cpfVar.r0.setVisibility(8);
            hpbVar.setValue(yneVar.m58023a());
        }

        /* renamed from: b */
        public final void m16247b(final yne yneVar) {
            if (yneVar != null) {
                final cpf cpfVar = this.f13938a;
                final hpb hpbVar = this.f13939b;
                int i = C19582a.f13940a[yneVar.m58025c().ordinal()];
                if (i == 1) {
                    if (yneVar.m58023a() != null) {
                        j0f.m33008i(new Runnable() { // from class: j
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC11949k.a.m16246c(cpfVar, hpbVar, yneVar);
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
            m16247b((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: k$b */
    public static final class b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f13941a;

        /* renamed from: b */
        public final /* synthetic */ z9b f13942b;

        /* renamed from: c */
        public final /* synthetic */ cpf f13943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, z9b z9bVar, cpf cpfVar) {
            super(1);
            this.f13941a = fragment;
            this.f13942b = z9bVar;
            this.f13943c = cpfVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            Fragment fragment = this.f13941a;
            sq8.m48646e(str);
            AbstractC11949k.m16235g(fragment, str, this.f13942b, this.f13943c);
        }
    }

    /* renamed from: k$c */
    public static final class c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f13944a;

        /* renamed from: b */
        public final /* synthetic */ DialogC10973a f13945b;

        /* renamed from: c */
        public final /* synthetic */ cpf f13946c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11952l f13947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, DialogC10973a dialogC10973a, cpf cpfVar, InterfaceC11952l interfaceC11952l) {
            super(1);
            this.f13944a = fragment;
            this.f13945b = dialogC10973a;
            this.f13946c = cpfVar;
            this.f13947d = interfaceC11952l;
        }

        /* renamed from: a */
        public final void m16248a(PaginatedDataModel paginatedDataModel) {
            Fragment fragment = this.f13944a;
            DialogC10973a dialogC10973a = this.f13945b;
            sq8.m48646e(paginatedDataModel);
            AbstractC11949k.m16242n(fragment, dialogC10973a, paginatedDataModel, this.f13946c, this.f13947d);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m16248a((PaginatedDataModel) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: k$d */
    public static final class d implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f13948a;

        public d(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f13948a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f13948a;
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
            this.f13948a.invoke(obj);
        }
    }

    /* renamed from: k$e */
    public static final class e extends iuf {

        /* renamed from: g */
        public final /* synthetic */ PaginatedDataModel f13949g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PaginatedDataModel paginatedDataModel, f fVar) {
            super(fVar, null, false, null, 14, null);
            this.f13949g = paginatedDataModel;
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
            Template template = (Template) this.f13949g.get(i);
            template.setShowSelection(false);
            template.setHighLightTerm("");
            template.setPosition(Integer.valueOf(i));
            sq8.m48646e(template);
            return template;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f13949g.size();
        }
    }

    /* renamed from: k$f */
    public static final class f implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ PaginatedDataModel f13950a;

        /* renamed from: b */
        public final /* synthetic */ cpf f13951b;

        /* renamed from: c */
        public final /* synthetic */ DialogC10973a f13952c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11952l f13953d;

        public f(PaginatedDataModel paginatedDataModel, cpf cpfVar, DialogC10973a dialogC10973a, InterfaceC11952l interfaceC11952l) {
            this.f13950a = paginatedDataModel;
            this.f13951b = cpfVar;
            this.f13952c = dialogC10973a;
            this.f13953d = interfaceC11952l;
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
            if ((id == z8e.itemLeadRoot || id == z8e.sendMessageActionButton) || id == z8e.ivContactProfilePic) {
                if (obj instanceof Template) {
                    this.f13951b.p0.setAdapter(null);
                    this.f13952c.dismiss();
                    this.f13953d.mo2051a((Template) obj);
                    return;
                }
                return;
            }
            if (id == z8e.textMessage && (obj instanceof Template)) {
                Template template = (Template) obj;
                template.setExpanded(!template.isExpanded());
                if (template.isExpanded()) {
                    MaterialTextView materialTextView = (MaterialTextView) view;
                    materialTextView.setMaxLines(50);
                    materialTextView.setEllipsize(null);
                } else {
                    MaterialTextView materialTextView2 = (MaterialTextView) view;
                    materialTextView2.setMaxLines(5);
                    materialTextView2.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: g */
    public static final void m16235g(Fragment fragment, String str, hpb hpbVar, cpf cpfVar) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(str, "selectedTemplateType");
        sq8.m48649h(hpbVar, "fileTemplatesLiveData");
        sq8.m48649h(cpfVar, "templateBinding");
        mii miiVarM54444J = wi0.m54444J();
        if (miiVarM54444J == null || miiVarM54444J.m39171u() == null) {
            return;
        }
        wi0.m54457W(str, null, null, 6, null).observe(fragment.getViewLifecycleOwner(), new d(new a(cpfVar, hpbVar)));
    }

    /* renamed from: h */
    public static final List m16236h(String str) {
        ArrayList arrayList = new ArrayList();
        if (sq8.m48644c(str, "template")) {
            TemplateTypes templateTypes = new TemplateTypes(null, null, false, 7, null);
            templateTypes.setValue(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            templateTypes.setViewValue(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            templateTypes.setSelected(true);
            arrayList.add(templateTypes);
            TemplateTypes templateTypes2 = new TemplateTypes(null, null, false, 7, null);
            templateTypes2.setValue("document");
            templateTypes2.setViewValue("document");
            arrayList.add(templateTypes2);
        } else if (sq8.m48644c(str, "script")) {
            TemplateTypes templateTypes3 = new TemplateTypes(null, null, false, 7, null);
            templateTypes3.setValue("script");
            templateTypes3.setViewValue("Calling Script");
            templateTypes3.setSelected(true);
            arrayList.add(templateTypes3);
        }
        return arrayList;
    }

    /* renamed from: i */
    public static final void m16237i(Fragment fragment, LayoutInflater layoutInflater, Context context, String str, InterfaceC11952l interfaceC11952l) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(layoutInflater, "layoutInflater");
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "selectionType");
        sq8.m48649h(interfaceC11952l, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        final cpf cpfVarH0 = cpf.h0(layoutInflater);
        sq8.m48648g(cpfVarH0, "inflate(...)");
        final DialogC10973a dialogC10973a = new DialogC10973a(context, qae.SheetDialog);
        dialogC10973a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AbstractC11949k.m16238j(dialogC10973a, dialogInterface);
            }
        });
        dialogC10973a.setContentView(cpfVarH0.m25689B());
        List listM16236h = m16236h(str);
        cpfVarH0.t0.setText(((TemplateTypes) listM16236h.get(0)).getViewValue());
        if (listM16236h.size() > 1) {
            cpfVarH0.u0.setText(((TemplateTypes) listM16236h.get(1)).getViewValue());
            cpfVarH0.u0.setVisibility(8);
        } else {
            cpfVarH0.u0.setVisibility(8);
        }
        cpfVarH0.t0.setChecked(true);
        final gge ggeVar = new gge();
        ggeVar.f25106a = ((TemplateTypes) listM16236h.get(0)).getValue();
        final hpb hpbVar = new hpb();
        hpbVar.setValue(((TemplateTypes) listM16236h.get(0)).getValue());
        cpfVarH0.w0.setOnCheckedChangeListener(new ChipGroup.InterfaceC10998c() { // from class: e
            @Override // com.google.android.material.chip.ChipGroup.InterfaceC10998c
            /* renamed from: a */
            public final void mo14414a(ChipGroup chipGroup, int i) {
                AbstractC11949k.m16239k(cpfVarH0, ggeVar, hpbVar, chipGroup, i);
            }
        });
        z9b z9bVar = new z9b();
        z9bVar.addSource(hpbVar, new d(new b(fragment, z9bVar, cpfVarH0)));
        z9bVar.observe(fragment.getViewLifecycleOwner(), new d(new c(fragment, dialogC10973a, cpfVarH0, interfaceC11952l)));
        cpfVarH0.m25689B().setOnClickListener(new View.OnClickListener() { // from class: f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC11949k.m16240l(view);
            }
        });
        cpfVarH0.x0.setOnClickListener(new View.OnClickListener() { // from class: g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC11949k.m16241m(cpfVarH0, dialogC10973a, view);
            }
        });
        dialogC10973a.show();
    }

    /* renamed from: j */
    public static final void m16238j(DialogC10973a dialogC10973a, DialogInterface dialogInterface) {
        sq8.m48649h(dialogC10973a, "$bottomSheetDialog");
        View viewFindViewById = dialogC10973a.findViewById(n8e.design_bottom_sheet);
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(viewFindViewById);
            sq8.m48648g(bottomSheetBehaviorQ0, "from(...)");
            th1.m49858j(viewFindViewById);
            bottomSheetBehaviorQ0.Z0(3);
        }
    }

    /* renamed from: k */
    public static final void m16239k(cpf cpfVar, gge ggeVar, hpb hpbVar, ChipGroup chipGroup, int i) {
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

    /* renamed from: l */
    public static final void m16240l(View view) {
    }

    /* renamed from: m */
    public static final void m16241m(cpf cpfVar, DialogC10973a dialogC10973a, View view) {
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(dialogC10973a, "$bottomSheetDialog");
        cpfVar.p0.setAdapter(null);
        dialogC10973a.dismiss();
    }

    /* renamed from: n */
    public static final void m16242n(Fragment fragment, DialogC10973a dialogC10973a, PaginatedDataModel paginatedDataModel, final cpf cpfVar, InterfaceC11952l interfaceC11952l) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(dialogC10973a, "bottomSheetDialog");
        sq8.m48649h(paginatedDataModel, "dataModel");
        sq8.m48649h(cpfVar, "templateBinding");
        sq8.m48649h(interfaceC11952l, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        final dge dgeVar = new dge();
        dgeVar.f19803a = true;
        final e eVar = new e(paginatedDataModel, new f(paginatedDataModel, cpfVar, dialogC10973a, interfaceC11952l));
        eVar.setStateRestorationPolicy(RecyclerView.AbstractC2371h.a.PREVENT_WHEN_EMPTY);
        paginatedDataModel.addResultsChangedListener(fragment.getViewLifecycleOwner(), new ResultsChangeListener() { // from class: h
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                AbstractC11949k.m16243o(dgeVar, cpfVar, eVar, resultsChangedEvent);
            }
        });
    }

    /* renamed from: o */
    public static final void m16243o(final dge dgeVar, final cpf cpfVar, final e eVar, final ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTimeTemplate");
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(eVar, "$templateAdapter");
        j0f.m33008i(new Runnable() { // from class: i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11949k.m16244p(dgeVar, cpfVar, eVar, resultsChangedEvent);
            }
        });
    }

    /* renamed from: p */
    public static final void m16244p(dge dgeVar, cpf cpfVar, e eVar, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(dgeVar, "$firstTimeTemplate");
        sq8.m48649h(cpfVar, "$templateBinding");
        sq8.m48649h(eVar, "$templateAdapter");
        if (dgeVar.f19803a) {
            cpfVar.p0.setItemAnimator(null);
            cpfVar.p0.setAdapter(eVar);
            dgeVar.f19803a = false;
        }
        eVar.notifyItemRangeInserted(resultsChangedEvent.start(), resultsChangedEvent.count());
    }
}
