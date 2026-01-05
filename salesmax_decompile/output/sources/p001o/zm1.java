package p001o;

import ai.salesmax.model.BulkUploadMapping;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import ernestoyaquello.com.verticalstepperform.AbstractC11918b;
import java.util.List;
import p001o.ck6;

/* loaded from: classes2.dex */
public final class zm1 extends AbstractC11918b {

    /* renamed from: n */
    public static final C18681a f57391n = new C18681a(null);

    /* renamed from: o */
    public static final int f57392o = 8;

    /* renamed from: m */
    public List f57393m;

    /* renamed from: o.zm1$a */
    public static final class C18681a {
        public C18681a() {
        }

        public /* synthetic */ C18681a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.zm1$b */
    public static final class C18682b extends iuf {
        public C18682b(C18683c c18683c) {
            super(c18683c, null, false, null, 14, null);
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_bulk_upload_mapping;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            List list = zm1.this.f57393m;
            if (list == null) {
                sq8.m48667z("mappingOptions");
                list = null;
            }
            return list.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            List list = zm1.this.f57393m;
            if (list == null) {
                sq8.m48667z("mappingOptions");
                list = null;
            }
            return list.size();
        }
    }

    /* renamed from: o.zm1$c */
    public static final class C18683c implements ck6 {
        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            boolean z = obj instanceof BulkUploadMapping;
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm1(String str, List list) {
        super(str);
        sq8.m48649h(list, "mappingOptions");
        this.f57393m = list;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: A */
    public void mo16155A(boolean z) {
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public String mo16183k() {
        return "";
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public AbstractC11918b.b mo16191s(String str) {
        sq8.m48649h(str, "stepData");
        return new AbstractC11918b.b(true);
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo16164J(String str) {
        sq8.m48649h(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: c */
    public View mo16175c() {
        View viewInflate = LayoutInflater.from(m16177e()).inflate(p9e.sheet_bulk_add_mapping, (ViewGroup) null, false);
        sq8.m48648g(viewInflate, "inflate(...)");
        View viewFindViewById = viewInflate.findViewById(z8e.rvMappingList);
        sq8.m48647f(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) viewFindViewById).setAdapter(new C18682b(new C18683c()));
        return viewInflate;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: l */
    public String mo16184l() {
        return "";
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: x */
    public void mo16196x(boolean z) {
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: y */
    public void mo16197y(boolean z) {
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: z */
    public void mo16198z(boolean z) {
    }
}
