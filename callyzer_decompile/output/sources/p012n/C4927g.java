package p012n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.g */
/* loaded from: classes.dex */
public final class C4927g extends BaseAdapter {

    /* renamed from: a */
    public final MenuC4929i f24526a;

    /* renamed from: b */
    public int f24527b = -1;

    /* renamed from: c */
    public boolean f24528c;

    /* renamed from: d */
    public final boolean f24529d;

    /* renamed from: e */
    public final LayoutInflater f24530e;

    /* renamed from: f */
    public final int f24531f;

    public C4927g(MenuC4929i menuC4929i, LayoutInflater layoutInflater, boolean z6, int i10) {
        this.f24529d = z6;
        this.f24530e = layoutInflater;
        this.f24526a = menuC4929i;
        this.f24531f = i10;
        m9850a();
    }

    /* renamed from: a */
    public final void m9850a() {
        MenuC4929i menuC4929i = this.f24526a;
        MenuItemC4930j menuItemC4930j = menuC4929i.f24551s;
        if (menuItemC4930j != null) {
            menuC4929i.m9860i();
            ArrayList arrayList = menuC4929i.f24542j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((MenuItemC4930j) arrayList.get(i10)) == menuItemC4930j) {
                    this.f24527b = i10;
                    return;
                }
            }
        }
        this.f24527b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC4930j getItem(int i10) {
        ArrayList arrayListM9862k;
        boolean z6 = this.f24529d;
        MenuC4929i menuC4929i = this.f24526a;
        if (z6) {
            menuC4929i.m9860i();
            arrayListM9862k = menuC4929i.f24542j;
        } else {
            arrayListM9862k = menuC4929i.m9862k();
        }
        int i11 = this.f24527b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (MenuItemC4930j) arrayListM9862k.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM9862k;
        boolean z6 = this.f24529d;
        MenuC4929i menuC4929i = this.f24526a;
        if (z6) {
            menuC4929i.m9860i();
            arrayListM9862k = menuC4929i.f24542j;
        } else {
            arrayListM9862k = menuC4929i.m9862k();
        }
        return this.f24527b < 0 ? arrayListM9862k.size() : arrayListM9862k.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f24530e.inflate(this.f24531f, viewGroup, false);
        }
        int i11 = getItem(i10).f24556b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f24556b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f24526a.mo9863l() && i11 != i13) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        InterfaceC4936p interfaceC4936p = (InterfaceC4936p) view;
        if (this.f24528c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC4936p.mo550a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m9850a();
        super.notifyDataSetChanged();
    }
}
