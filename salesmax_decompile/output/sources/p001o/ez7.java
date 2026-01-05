package p001o;

import ai.salesmax.view.WrapContentViewPager;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import p001o.ck6;

/* loaded from: classes.dex */
public abstract class ez7 {

    /* renamed from: o.ez7$a */
    public static final class C13291a extends iuf {

        /* renamed from: g */
        public final /* synthetic */ Object f22445g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13291a(Object obj, C13292b c13292b) {
            super(c13292b, null, false, null, 14, null);
            this.f22445g = obj;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_tasks;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            Object obj = ((ArrayList) this.f22445g).get(i);
            sq8.m48648g(obj, "get(...)");
            return obj;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return ((ArrayList) this.f22445g).size();
        }
    }

    /* renamed from: o.ez7$b */
    public static final class C13292b implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ ck6 f22446a;

        public C13292b(ck6 ck6Var) {
            this.f22446a = ck6Var;
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
            this.f22446a.mo708b(view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: o.ez7$c */
    public static final class C13293c extends iuf {

        /* renamed from: g */
        public final /* synthetic */ Object f22447g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13293c(Object obj, C13294d c13294d) {
            super(c13294d, null, false, null, 14, null);
            this.f22447g = obj;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_smart_view_home;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            Object obj = ((ArrayList) this.f22447g).get(i);
            sq8.m48648g(obj, "get(...)");
            return obj;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return ((ArrayList) this.f22447g).size();
        }
    }

    /* renamed from: o.ez7$d */
    public static final class C13294d implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ ck6 f22448a;

        public C13294d(ck6 ck6Var) {
            this.f22448a = ck6Var;
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
            this.f22448a.mo708b(view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: o.ez7$e */
    public static final class C13295e implements TabLayout.InterfaceC11137d {

        /* renamed from: a */
        public final /* synthetic */ TabLayout f22449a;

        public C13295e(TabLayout tabLayout) {
            this.f22449a = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: a */
        public void mo943a(TabLayout.C11140g c11140g) {
            sq8.m48649h(c11140g, "tab");
            this.f22449a.performHapticFeedback(1);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: b */
        public void mo944b(TabLayout.C11140g c11140g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: c */
        public void mo945c(TabLayout.C11140g c11140g) {
        }
    }

    /* renamed from: o.ez7$f */
    public static final class C13296f extends iuf {

        /* renamed from: g */
        public final /* synthetic */ Object f22450g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13296f(Object obj, C13297g c13297g) {
            super(c13297g, null, false, null, 14, null);
            this.f22450g = obj;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_home_activity;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            Object obj = ((ArrayList) this.f22450g).get(i);
            sq8.m48648g(obj, "get(...)");
            return obj;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return ((ArrayList) this.f22450g).size();
        }
    }

    /* renamed from: o.ez7$g */
    public static final class C13297g implements ck6 {
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
    public static final void m25877a(RecyclerView recyclerView, Object obj, ck6 ck6Var) {
        sq8.m48649h(ck6Var, "handler");
        if (recyclerView == null || obj == null || !(obj instanceof ArrayList)) {
            return;
        }
        recyclerView.setAdapter(new C13291a(obj, new C13292b(ck6Var)));
    }

    /* renamed from: b */
    public static final void m25878b(RecyclerView recyclerView, Object obj, ck6 ck6Var) {
        sq8.m48649h(ck6Var, "handler");
        if (recyclerView == null || obj == null || !(obj instanceof ArrayList)) {
            return;
        }
        recyclerView.setAdapter(new C13293c(obj, new C13294d(ck6Var)));
    }

    /* renamed from: c */
    public static final void m25879c(ConstraintLayout constraintLayout, Integer num, Integer num2) throws Resources.NotFoundException {
        if (num == null || num2 == null || constraintLayout == null) {
            return;
        }
        Integer[] numArr = {Integer.valueOf(hae.calls), Integer.valueOf(hae.work), Integer.valueOf(hae.more)};
        WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) constraintLayout.findViewById(num.intValue());
        TabLayout tabLayout = (TabLayout) constraintLayout.findViewById(num2.intValue());
        sq8.m48646e(wrapContentViewPager);
        wrapContentViewPager.setAdapter(new fz7(wrapContentViewPager, numArr));
        wrapContentViewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(wrapContentViewPager);
        tabLayout.m15237h(new C13295e(tabLayout));
    }

    /* renamed from: d */
    public static final void m25880d(RecyclerView recyclerView, Object obj) {
        if (recyclerView == null || obj == null || !(obj instanceof ArrayList)) {
            return;
        }
        recyclerView.setAdapter(new C13296f(obj, new C13297g()));
    }
}
