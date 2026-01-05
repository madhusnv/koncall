package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.InterfaceC1797j;
import java.util.ArrayList;
import p001o.g9e;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes2.dex */
public class C1790c implements InterfaceC1796i, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Context f5576a;

    /* renamed from: b */
    public LayoutInflater f5577b;

    /* renamed from: c */
    public C1792e f5578c;

    /* renamed from: d */
    public ExpandedMenuView f5579d;

    /* renamed from: e */
    public int f5580e;

    /* renamed from: f */
    public int f5581f;

    /* renamed from: g */
    public int f5582g;

    /* renamed from: h */
    public InterfaceC1796i.a f5583h;

    /* renamed from: q */
    public a f5584q;

    /* renamed from: s */
    public int f5585s;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    public class a extends BaseAdapter {

        /* renamed from: a */
        public int f5586a = -1;

        public a() {
            m4007a();
        }

        /* renamed from: a */
        public void m4007a() {
            C1794g c1794gM4062x = C1790c.this.f5578c.m4062x();
            if (c1794gM4062x != null) {
                ArrayList arrayListM4016B = C1790c.this.f5578c.m4016B();
                int size = arrayListM4016B.size();
                for (int i = 0; i < size; i++) {
                    if (((C1794g) arrayListM4016B.get(i)) == c1794gM4062x) {
                        this.f5586a = i;
                        return;
                    }
                }
            }
            this.f5586a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1794g getItem(int i) {
            ArrayList arrayListM4016B = C1790c.this.f5578c.m4016B();
            int i2 = i + C1790c.this.f5580e;
            int i3 = this.f5586a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C1794g) arrayListM4016B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C1790c.this.f5578c.m4016B().size() - C1790c.this.f5580e;
            return this.f5586a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C1790c c1790c = C1790c.this;
                view = c1790c.f5577b.inflate(c1790c.f5582g, viewGroup, false);
            }
            ((InterfaceC1797j.a) view).mo3948c(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m4007a();
            super.notifyDataSetChanged();
        }
    }

    public C1790c(Context context, int i) {
        this(i, 0);
        this.f5576a = context;
        this.f5577b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m4003a() {
        if (this.f5584q == null) {
            this.f5584q = new a();
        }
        return this.f5584q;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: b */
    public void mo3963b(C1792e c1792e, boolean z) {
        InterfaceC1796i.a aVar = this.f5583h;
        if (aVar != null) {
            aVar.mo3835b(c1792e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: c */
    public boolean mo3964c(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: d */
    public void mo3965d(InterfaceC1796i.a aVar) {
        this.f5583h = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: e */
    public void mo3987e(Parcelable parcelable) {
        m4005m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: f */
    public boolean mo3966f(SubMenuC1799l subMenuC1799l) {
        if (!subMenuC1799l.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC1793f(subMenuC1799l).m4066d(null);
        InterfaceC1796i.a aVar = this.f5583h;
        if (aVar == null) {
            return true;
        }
        aVar.mo3836c(subMenuC1799l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: g */
    public Parcelable mo3988g() {
        if (this.f5579d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m4006n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    public int getId() {
        return this.f5585s;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: h */
    public void mo3967h(boolean z) {
        a aVar = this.f5584q;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: i */
    public boolean mo3989i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: j */
    public boolean mo3968j(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: k */
    public void mo3969k(Context context, C1792e c1792e) {
        if (this.f5581f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f5581f);
            this.f5576a = contextThemeWrapper;
            this.f5577b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f5576a != null) {
            this.f5576a = context;
            if (this.f5577b == null) {
                this.f5577b = LayoutInflater.from(context);
            }
        }
        this.f5578c = c1792e;
        a aVar = this.f5584q;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public InterfaceC1797j m4004l(ViewGroup viewGroup) {
        if (this.f5579d == null) {
            this.f5579d = (ExpandedMenuView) this.f5577b.inflate(g9e.abc_expanded_menu_layout, viewGroup, false);
            if (this.f5584q == null) {
                this.f5584q = new a();
            }
            this.f5579d.setAdapter((ListAdapter) this.f5584q);
            this.f5579d.setOnItemClickListener(this);
        }
        return this.f5579d;
    }

    /* renamed from: m */
    public void m4005m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f5579d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: n */
    public void m4006n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f5579d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f5578c.m4029P(this.f5584q.getItem(i), this, 0);
    }

    public C1790c(int i, int i2) {
        this.f5582g = i;
        this.f5581f = i2;
    }
}
