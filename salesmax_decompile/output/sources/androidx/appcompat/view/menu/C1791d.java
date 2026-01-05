package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC1797j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes2.dex */
public class C1791d extends BaseAdapter {

    /* renamed from: a */
    public C1792e f5588a;

    /* renamed from: b */
    public int f5589b = -1;

    /* renamed from: c */
    public boolean f5590c;

    /* renamed from: d */
    public final boolean f5591d;

    /* renamed from: e */
    public final LayoutInflater f5592e;

    /* renamed from: f */
    public final int f5593f;

    public C1791d(C1792e c1792e, LayoutInflater layoutInflater, boolean z, int i) {
        this.f5591d = z;
        this.f5592e = layoutInflater;
        this.f5588a = c1792e;
        this.f5593f = i;
        m4009a();
    }

    /* renamed from: a */
    public void m4009a() {
        C1794g c1794gM4062x = this.f5588a.m4062x();
        if (c1794gM4062x != null) {
            ArrayList arrayListM4016B = this.f5588a.m4016B();
            int size = arrayListM4016B.size();
            for (int i = 0; i < size; i++) {
                if (((C1794g) arrayListM4016B.get(i)) == c1794gM4062x) {
                    this.f5589b = i;
                    return;
                }
            }
        }
        this.f5589b = -1;
    }

    /* renamed from: b */
    public C1792e m4010b() {
        return this.f5588a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1794g getItem(int i) {
        ArrayList arrayListM4016B = this.f5591d ? this.f5588a.m4016B() : this.f5588a.m4020G();
        int i2 = this.f5589b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1794g) arrayListM4016B.get(i);
    }

    /* renamed from: d */
    public void m4012d(boolean z) {
        this.f5590c = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5589b < 0 ? (this.f5591d ? this.f5588a.m4016B() : this.f5588a.m4020G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5592e.inflate(this.f5593f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f5588a.mo4022I() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC1797j.a aVar = (InterfaceC1797j.a) view;
        if (this.f5590c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo3948c(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m4009a();
        super.notifyDataSetChanged();
    }
}
