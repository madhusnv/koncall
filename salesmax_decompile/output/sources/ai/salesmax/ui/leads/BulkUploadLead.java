package ai.salesmax.ui.leads;

import ai.salesmax.model.AssignmentOutcome;
import ai.salesmax.model.BulkUploadMapping;
import ai.salesmax.model.FileData;
import ai.salesmax.ui.BaseFragment;
import ai.salesmax.ui.leads.BulkUploadLead;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import java.util.ArrayList;
import p001o.b6g;
import p001o.bn1;
import p001o.cba;
import p001o.dn1;
import p001o.id5;
import p001o.jm7;
import p001o.lq0;
import p001o.pq0;
import p001o.sq8;
import p001o.tm1;
import p001o.uf8;
import p001o.uz6;
import p001o.v0c;
import p001o.ym1;
import p001o.zm1;

/* loaded from: classes.dex */
public final class BulkUploadLead extends BaseFragment implements b6g {

    /* renamed from: X */
    public static final C0915a f2534X = new C0915a(null);

    /* renamed from: Y */
    public static final int f2535Y = 8;

    /* renamed from: H */
    public ym1 f2536H;

    /* renamed from: L */
    public final uf8 f2537L = new uf8(this);

    /* renamed from: M */
    public ArrayList f2538M = new ArrayList();

    /* renamed from: Q */
    public View f2539Q;

    /* renamed from: h */
    public tm1 f2540h;

    /* renamed from: q */
    public cba f2541q;

    /* renamed from: s */
    public bn1 f2542s;

    /* renamed from: x */
    public dn1 f2543x;

    /* renamed from: y */
    public zm1 f2544y;

    /* renamed from: ai.salesmax.ui.leads.BulkUploadLead$a */
    public static final class C0915a {
        public C0915a() {
        }

        public /* synthetic */ C0915a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BulkUploadLead$b */
    public static final class C0916b implements pq0 {
        @Override // p001o.pq0
        /* renamed from: a */
        public void mo1028a(AssignmentOutcome assignmentOutcome) {
            sq8.m48649h(assignmentOutcome, "assignmentOutcome");
        }
    }

    /* renamed from: ai.salesmax.ui.leads.BulkUploadLead$c */
    public static final class C0917c implements uf8.InterfaceC17374a {

        /* renamed from: a */
        public final /* synthetic */ Context f2545a;

        /* renamed from: b */
        public final /* synthetic */ BulkUploadLead f2546b;

        public C0917c(Context context, BulkUploadLead bulkUploadLead) {
            this.f2545a = context;
            this.f2546b = bulkUploadLead;
        }

        @Override // p001o.uf8.InterfaceC17374a
        /* renamed from: a */
        public void mo955a(Uri uri) {
            sq8.m48649h(uri, "uri");
            ContentResolver contentResolver = this.f2545a.getContentResolver();
            sq8.m48646e(contentResolver);
            String strK0 = jm7.k0(contentResolver, uri);
            if (strK0 == null) {
                strK0 = "UnKnown";
            }
            String str = strK0;
            String strM52179c = uz6.f49700a.m52179c(this.f2545a, uri);
            System.out.println((Object) str);
            System.out.println((Object) strM52179c);
            FileData fileData = new FileData(this.f2546b.f2538M.size() + 1, uri, str, strM52179c, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 268435440, null);
            this.f2546b.f2538M.add(fileData);
            this.f2546b.t1().j0(fileData);
        }

        @Override // p001o.uf8.InterfaceC17374a
        /* renamed from: b */
        public void mo956b() {
        }

        @Override // p001o.uf8.InterfaceC17374a
        /* renamed from: c */
        public void mo957c() {
        }
    }

    public static final void u1(BulkUploadLead bulkUploadLead, View view) {
        sq8.m48649h(bulkUploadLead, "this$0");
        Context contextRequireContext = bulkUploadLead.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        bulkUploadLead.w1(contextRequireContext);
    }

    public static final void v1(BulkUploadLead bulkUploadLead, View view) {
        sq8.m48649h(bulkUploadLead, "this$0");
        Context contextRequireContext = bulkUploadLead.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        LayoutInflater layoutInflater = bulkUploadLead.getLayoutInflater();
        sq8.m48648g(layoutInflater, "getLayoutInflater(...)");
        lq0.m37675q(contextRequireContext, bulkUploadLead, layoutInflater, true, "lead", new C0916b());
    }

    @Override // p001o.b6g
    /* renamed from: W */
    public void mo1910W() {
        throw new v0c("An operation is not implemented: Not yet implemented");
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f2541q = (cba) new b0(fragmentActivityRequireActivity).m6505a(cba.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f2540h == null) {
            this.f2540h = tm1.h0(layoutInflater, viewGroup, false);
        }
        this.f2542s = new bn1("Upload Excel or CSV File", new View.OnClickListener() { // from class: o.vm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BulkUploadLead.u1(this.f50532a, view);
            }
        });
        this.f2543x = new dn1("Give it a Name");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BulkUploadMapping("Name", "", "abc"));
        arrayList.add(new BulkUploadMapping("Company Name", "", "pqr"));
        arrayList.add(new BulkUploadMapping("Mobile Number", "", "xyz"));
        this.f2544y = new zm1("Map the fields from your file", arrayList);
        this.f2536H = new ym1("Assign These Leads", new View.OnClickListener() { // from class: o.wm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BulkUploadLead.v1(this.f52330a, view);
            }
        });
        t1().o0.m16126Q(this, this.f2542s, this.f2543x, this.f2544y, this.f2536H).m16154c("Upload Leads").m16153b();
        View viewM25689B = t1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f2540h = null;
        this.f2539Q = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // p001o.b6g
    /* renamed from: s */
    public void mo1911s() {
        throw new v0c("An operation is not implemented: Not yet implemented");
    }

    public final tm1 t1() {
        tm1 tm1Var = this.f2540h;
        sq8.m48646e(tm1Var);
        return tm1Var;
    }

    public final void w1(Context context) {
        if (!this.f2538M.isEmpty()) {
            jm7.v0(requireActivity(), "Only one entry of attachment is allowed", 0, 0, 12, null);
        } else {
            uf8.m51533d(this.f2537L, new C0917c(context, this), null, 2, null);
        }
    }
}
