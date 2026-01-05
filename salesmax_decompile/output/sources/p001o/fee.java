package p001o;

import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p001o.ck6;

/* loaded from: classes.dex */
public abstract class fee {

    /* renamed from: o.fee$a */
    public static final class C13411a extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f23196g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13411a(List list, C13412b c13412b) {
            super(c13412b, null, false, null, 14, null);
            this.f23196g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_recent_action;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f23196g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f23196g.size();
        }
    }

    /* renamed from: o.fee$b */
    public static final class C13412b implements ck6 {
        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: a */
    public static final void m26520a(RecyclerView recyclerView, List list) {
        if (list == null) {
            list = ch3.m21246k();
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(new C13411a(list, new C13412b()));
        }
    }
}
