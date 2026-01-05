package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.appcompat.view.menu.SubMenuC1799l;
import androidx.recyclerview.widget.C2410p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import p001o.cc;

/* loaded from: classes3.dex */
public class nsb implements InterfaceC1796i {

    /* renamed from: H */
    public ColorStateList f37240H;

    /* renamed from: L */
    public Drawable f37241L;

    /* renamed from: M */
    public RippleDrawable f37242M;

    /* renamed from: Q */
    public int f37243Q;

    /* renamed from: X */
    public int f37244X;

    /* renamed from: Y */
    public int f37245Y;

    /* renamed from: Z */
    public int f37246Z;

    /* renamed from: a */
    public NavigationMenuView f37247a;

    /* renamed from: b */
    public LinearLayout f37248b;

    /* renamed from: c */
    public InterfaceC1796i.a f37249c;

    /* renamed from: d */
    public C1792e f37250d;

    /* renamed from: e */
    public int f37251e;

    /* renamed from: f */
    public C15655c f37252f;

    /* renamed from: g */
    public LayoutInflater f37253g;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public int n0;
    public int o0;
    public int p0;

    /* renamed from: q */
    public ColorStateList f37255q;

    /* renamed from: y */
    public ColorStateList f37258y;

    /* renamed from: h */
    public int f37254h = 0;

    /* renamed from: s */
    public int f37256s = 0;

    /* renamed from: x */
    public boolean f37257x = true;
    public boolean m0 = true;
    public int q0 = -1;
    public final View.OnClickListener r0 = new ViewOnClickListenerC15653a();

    /* renamed from: o.nsb$a */
    public class ViewOnClickListenerC15653a implements View.OnClickListener {
        public ViewOnClickListenerC15653a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            nsb.this.m41058Y(true);
            C1794g itemData = ((NavigationMenuItemView) view).getItemData();
            nsb nsbVar = nsb.this;
            boolean zM4029P = nsbVar.f37250d.m4029P(itemData, nsbVar, 0);
            if (itemData != null && itemData.isCheckable() && zM4029P) {
                nsb.this.f37252f.m41090s(itemData);
            } else {
                z = false;
            }
            nsb.this.m41058Y(false);
            if (z) {
                nsb.this.mo3967h(false);
            }
        }
    }

    /* renamed from: o.nsb$b */
    public static class C15654b extends AbstractC15664l {
        public C15654b(View view) {
            super(view);
        }
    }

    /* renamed from: o.nsb$c */
    public class C15655c extends RecyclerView.AbstractC2371h {

        /* renamed from: a */
        public final ArrayList f37260a = new ArrayList();

        /* renamed from: b */
        public C1794g f37261b;

        /* renamed from: c */
        public boolean f37262c;

        /* renamed from: o.nsb$c$a */
        public class a extends db {

            /* renamed from: d */
            public final /* synthetic */ int f37264d;

            /* renamed from: e */
            public final /* synthetic */ boolean f37265e;

            public a(int i, boolean z) {
                this.f37264d = i;
                this.f37265e = z;
            }

            @Override // p001o.db
            /* renamed from: g */
            public void mo5938g(View view, cc ccVar) {
                super.mo5938g(view, ccVar);
                ccVar.r0(cc.C12629f.m20832a(C15655c.this.m41079h(this.f37264d), 1, 1, 1, this.f37265e, view.isSelected()));
            }
        }

        public C15655c() {
            m41087p();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f37260a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemViewType(int i) {
            InterfaceC15657e interfaceC15657e = (InterfaceC15657e) this.f37260a.get(i);
            if (interfaceC15657e instanceof C15658f) {
                return 2;
            }
            if (interfaceC15657e instanceof C15656d) {
                return 3;
            }
            if (interfaceC15657e instanceof C15659g) {
                return ((C15659g) interfaceC15657e).m41098a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: h */
        public final int m41079h(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (nsb.this.f37252f.getItemViewType(i3) == 2 || nsb.this.f37252f.getItemViewType(i3) == 3) {
                    i2--;
                }
            }
            return i2;
        }

        /* renamed from: i */
        public final void m41080i(int i, int i2) {
            while (i < i2) {
                ((C15659g) this.f37260a.get(i)).f37270b = true;
                i++;
            }
        }

        /* renamed from: j */
        public Bundle m41081j() {
            Bundle bundle = new Bundle();
            C1794g c1794g = this.f37261b;
            if (c1794g != null) {
                bundle.putInt("android:menu:checked", c1794g.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f37260a.size();
            for (int i = 0; i < size; i++) {
                InterfaceC15657e interfaceC15657e = (InterfaceC15657e) this.f37260a.get(i);
                if (interfaceC15657e instanceof C15659g) {
                    C1794g c1794gM41098a = ((C15659g) interfaceC15657e).m41098a();
                    View actionView = c1794gM41098a != null ? c1794gM41098a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(c1794gM41098a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: k */
        public C1794g m41082k() {
            return this.f37261b;
        }

        /* renamed from: l */
        public int m41083l() {
            int i = 0;
            for (int i2 = 0; i2 < nsb.this.f37252f.getItemCount(); i2++) {
                int itemViewType = nsb.this.f37252f.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(AbstractC15664l abstractC15664l, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    C15658f c15658f = (C15658f) this.f37260a.get(i);
                    abstractC15664l.f9794a.setPaddingRelative(nsb.this.h0, c15658f.m41097b(), nsb.this.i0, c15658f.m41096a());
                    return;
                }
                TextView textView = (TextView) abstractC15664l.f9794a;
                textView.setText(((C15659g) this.f37260a.get(i)).m41098a().getTitle());
                gjh.m28914m(textView, nsb.this.f37254h);
                textView.setPaddingRelative(nsb.this.j0, textView.getPaddingTop(), nsb.this.k0, textView.getPaddingBottom());
                ColorStateList colorStateList = nsb.this.f37255q;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                m41089r(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC15664l.f9794a;
            navigationMenuItemView.setIconTintList(nsb.this.f37240H);
            navigationMenuItemView.setTextAppearance(nsb.this.f37256s);
            ColorStateList colorStateList2 = nsb.this.f37258y;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = nsb.this.f37241L;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = nsb.this.f37242M;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            C15659g c15659g = (C15659g) this.f37260a.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c15659g.f37270b);
            nsb nsbVar = nsb.this;
            int i2 = nsbVar.f37243Q;
            int i3 = nsbVar.f37244X;
            navigationMenuItemView.setPadding(i2, i3, i2, i3);
            navigationMenuItemView.setIconPadding(nsb.this.f37245Y);
            nsb nsbVar2 = nsb.this;
            if (nsbVar2.l0) {
                navigationMenuItemView.setIconSize(nsbVar2.f37246Z);
            }
            navigationMenuItemView.setMaxLines(nsb.this.n0);
            navigationMenuItemView.m14757D(c15659g.m41098a(), nsb.this.f37257x);
            m41089r(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC15664l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                nsb nsbVar = nsb.this;
                return new C15661i(nsbVar.f37253g, viewGroup, nsbVar.r0);
            }
            if (i == 1) {
                return new C15663k(nsb.this.f37253g, viewGroup);
            }
            if (i == 2) {
                return new C15662j(nsb.this.f37253g, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new C15654b(nsb.this.f37248b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(AbstractC15664l abstractC15664l) {
            if (abstractC15664l instanceof C15661i) {
                ((NavigationMenuItemView) abstractC15664l.f9794a).m14758E();
            }
        }

        /* renamed from: p */
        public final void m41087p() {
            if (this.f37262c) {
                return;
            }
            this.f37262c = true;
            this.f37260a.clear();
            this.f37260a.add(new C15656d());
            int size = nsb.this.f37250d.m4020G().size();
            int i = -1;
            boolean z = false;
            int size2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C1794g c1794g = (C1794g) nsb.this.f37250d.m4020G().get(i2);
                if (c1794g.isChecked()) {
                    m41090s(c1794g);
                }
                if (c1794g.isCheckable()) {
                    c1794g.m4088t(false);
                }
                if (c1794g.hasSubMenu()) {
                    SubMenu subMenu = c1794g.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f37260a.add(new C15658f(nsb.this.p0, 0));
                        }
                        this.f37260a.add(new C15659g(c1794g));
                        int size3 = this.f37260a.size();
                        int size4 = subMenu.size();
                        boolean z2 = false;
                        for (int i3 = 0; i3 < size4; i3++) {
                            C1794g c1794g2 = (C1794g) subMenu.getItem(i3);
                            if (c1794g2.isVisible()) {
                                if (!z2 && c1794g2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (c1794g2.isCheckable()) {
                                    c1794g2.m4088t(false);
                                }
                                if (c1794g2.isChecked()) {
                                    m41090s(c1794g2);
                                }
                                this.f37260a.add(new C15659g(c1794g2));
                            }
                        }
                        if (z2) {
                            m41080i(size3, this.f37260a.size());
                        }
                    }
                } else {
                    int groupId = c1794g.getGroupId();
                    if (groupId != i) {
                        size2 = this.f37260a.size();
                        z = c1794g.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList arrayList = this.f37260a;
                            int i4 = nsb.this.p0;
                            arrayList.add(new C15658f(i4, i4));
                        }
                    } else if (!z && c1794g.getIcon() != null) {
                        m41080i(size2, this.f37260a.size());
                        z = true;
                    }
                    C15659g c15659g = new C15659g(c1794g);
                    c15659g.f37270b = z;
                    this.f37260a.add(c15659g);
                    i = groupId;
                }
            }
            this.f37262c = false;
        }

        /* renamed from: q */
        public void m41088q(Bundle bundle) {
            C1794g c1794gM41098a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C1794g c1794gM41098a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f37262c = true;
                int size = this.f37260a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    InterfaceC15657e interfaceC15657e = (InterfaceC15657e) this.f37260a.get(i2);
                    if ((interfaceC15657e instanceof C15659g) && (c1794gM41098a2 = ((C15659g) interfaceC15657e).m41098a()) != null && c1794gM41098a2.getItemId() == i) {
                        m41090s(c1794gM41098a2);
                        break;
                    }
                    i2++;
                }
                this.f37262c = false;
                m41087p();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f37260a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC15657e interfaceC15657e2 = (InterfaceC15657e) this.f37260a.get(i3);
                    if ((interfaceC15657e2 instanceof C15659g) && (c1794gM41098a = ((C15659g) interfaceC15657e2).m41098a()) != null && (actionView = c1794gM41098a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(c1794gM41098a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: r */
        public final void m41089r(View view, int i, boolean z) {
            wvi.m0(view, new a(i, z));
        }

        /* renamed from: s */
        public void m41090s(C1794g c1794g) {
            if (this.f37261b == c1794g || !c1794g.isCheckable()) {
                return;
            }
            C1794g c1794g2 = this.f37261b;
            if (c1794g2 != null) {
                c1794g2.setChecked(false);
            }
            this.f37261b = c1794g;
            c1794g.setChecked(true);
        }

        /* renamed from: t */
        public void m41091t(boolean z) {
            this.f37262c = z;
        }

        /* renamed from: u */
        public void m41092u() {
            int size = this.f37260a.size();
            m41087p();
            notifyDataSetChanged();
            if (size == this.f37260a.size()) {
                notifyItemRangeChanged(0, this.f37260a.size());
            }
        }

        /* renamed from: v */
        public final void m41093v() {
            for (int i = 0; i < this.f37260a.size(); i++) {
                if (this.f37260a.get(i) instanceof C15658f) {
                    notifyItemChanged(i);
                }
            }
        }

        /* renamed from: w */
        public final void m41094w() {
            for (int i = 0; i < this.f37260a.size(); i++) {
                if ((this.f37260a.get(i) instanceof C15659g) && getItemViewType(i) == 1) {
                    notifyItemChanged(i);
                }
            }
        }

        /* renamed from: x */
        public final void m41095x() {
            for (int i = 0; i < this.f37260a.size(); i++) {
                if ((this.f37260a.get(i) instanceof C15659g) && getItemViewType(i) == 0) {
                    notifyItemChanged(i);
                }
            }
        }
    }

    /* renamed from: o.nsb$d */
    public static class C15656d implements InterfaceC15657e {
    }

    /* renamed from: o.nsb$e */
    public interface InterfaceC15657e {
    }

    /* renamed from: o.nsb$f */
    public static class C15658f implements InterfaceC15657e {

        /* renamed from: a */
        public final int f37267a;

        /* renamed from: b */
        public final int f37268b;

        public C15658f(int i, int i2) {
            this.f37267a = i;
            this.f37268b = i2;
        }

        /* renamed from: a */
        public int m41096a() {
            return this.f37268b;
        }

        /* renamed from: b */
        public int m41097b() {
            return this.f37267a;
        }
    }

    /* renamed from: o.nsb$g */
    public static class C15659g implements InterfaceC15657e {

        /* renamed from: a */
        public final C1794g f37269a;

        /* renamed from: b */
        public boolean f37270b;

        public C15659g(C1794g c1794g) {
            this.f37269a = c1794g;
        }

        /* renamed from: a */
        public C1794g m41098a() {
            return this.f37269a;
        }
    }

    /* renamed from: o.nsb$h */
    public class C15660h extends C2410p {
        public C15660h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C2410p, p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.q0(cc.C12628e.m20830a(nsb.this.f37252f.m41083l(), 1, false));
        }
    }

    /* renamed from: o.nsb$i */
    public static class C15661i extends AbstractC15664l {
        public C15661i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(n9e.design_navigation_item, viewGroup, false));
            this.f9794a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: o.nsb$j */
    public static class C15662j extends AbstractC15664l {
        public C15662j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(n9e.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: o.nsb$k */
    public static class C15663k extends AbstractC15664l {
        public C15663k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(n9e.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: o.nsb$l */
    public static abstract class AbstractC15664l extends RecyclerView.d0 {
        public AbstractC15664l(View view) {
            super(view);
        }
    }

    /* renamed from: A */
    public int m41034A() {
        return this.j0;
    }

    /* renamed from: B */
    public final boolean m41035B() {
        return m41065q() > 0;
    }

    /* renamed from: C */
    public View m41036C(int i) {
        View viewInflate = this.f37253g.inflate(i, (ViewGroup) this.f37248b, false);
        m41060l(viewInflate);
        return viewInflate;
    }

    /* renamed from: D */
    public void m41037D(boolean z) {
        if (this.m0 != z) {
            this.m0 = z;
            c0();
        }
    }

    /* renamed from: E */
    public void m41038E(C1794g c1794g) {
        this.f37252f.m41090s(c1794g);
    }

    /* renamed from: F */
    public void m41039F(int i) {
        this.i0 = i;
        m41059Z();
    }

    /* renamed from: G */
    public void m41040G(int i) {
        this.h0 = i;
        m41059Z();
    }

    /* renamed from: H */
    public void m41041H(int i) {
        this.f37251e = i;
    }

    /* renamed from: I */
    public void m41042I(Drawable drawable) {
        this.f37241L = drawable;
        b0();
    }

    /* renamed from: J */
    public void m41043J(RippleDrawable rippleDrawable) {
        this.f37242M = rippleDrawable;
        b0();
    }

    /* renamed from: K */
    public void m41044K(int i) {
        this.f37243Q = i;
        b0();
    }

    /* renamed from: L */
    public void m41045L(int i) {
        this.f37245Y = i;
        b0();
    }

    /* renamed from: M */
    public void m41046M(int i) {
        if (this.f37246Z != i) {
            this.f37246Z = i;
            this.l0 = true;
            b0();
        }
    }

    /* renamed from: N */
    public void m41047N(ColorStateList colorStateList) {
        this.f37240H = colorStateList;
        b0();
    }

    /* renamed from: O */
    public void m41048O(int i) {
        this.n0 = i;
        b0();
    }

    /* renamed from: P */
    public void m41049P(int i) {
        this.f37256s = i;
        b0();
    }

    /* renamed from: Q */
    public void m41050Q(boolean z) {
        this.f37257x = z;
        b0();
    }

    /* renamed from: R */
    public void m41051R(ColorStateList colorStateList) {
        this.f37258y = colorStateList;
        b0();
    }

    /* renamed from: S */
    public void m41052S(int i) {
        this.f37244X = i;
        b0();
    }

    /* renamed from: T */
    public void m41053T(int i) {
        this.q0 = i;
        NavigationMenuView navigationMenuView = this.f37247a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: U */
    public void m41054U(ColorStateList colorStateList) {
        this.f37255q = colorStateList;
        a0();
    }

    /* renamed from: V */
    public void m41055V(int i) {
        this.k0 = i;
        a0();
    }

    /* renamed from: W */
    public void m41056W(int i) {
        this.j0 = i;
        a0();
    }

    /* renamed from: X */
    public void m41057X(int i) {
        this.f37254h = i;
        a0();
    }

    /* renamed from: Y */
    public void m41058Y(boolean z) {
        C15655c c15655c = this.f37252f;
        if (c15655c != null) {
            c15655c.m41091t(z);
        }
    }

    /* renamed from: Z */
    public final void m41059Z() {
        C15655c c15655c = this.f37252f;
        if (c15655c != null) {
            c15655c.m41093v();
        }
    }

    public final void a0() {
        C15655c c15655c = this.f37252f;
        if (c15655c != null) {
            c15655c.m41094w();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: b */
    public void mo3963b(C1792e c1792e, boolean z) {
        InterfaceC1796i.a aVar = this.f37249c;
        if (aVar != null) {
            aVar.mo3835b(c1792e, z);
        }
    }

    public final void b0() {
        C15655c c15655c = this.f37252f;
        if (c15655c != null) {
            c15655c.m41095x();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: c */
    public boolean mo3964c(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    public final void c0() {
        int i = (m41035B() || !this.m0) ? 0 : this.o0;
        NavigationMenuView navigationMenuView = this.f37247a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: e */
    public void mo3987e(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f37247a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f37252f.m41088q(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f37248b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: f */
    public boolean mo3966f(SubMenuC1799l subMenuC1799l) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: g */
    public Parcelable mo3988g() {
        Bundle bundle = new Bundle();
        if (this.f37247a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f37247a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C15655c c15655c = this.f37252f;
        if (c15655c != null) {
            bundle.putBundle("android:menu:adapter", c15655c.m41081j());
        }
        if (this.f37248b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f37248b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    public int getId() {
        return this.f37251e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: h */
    public void mo3967h(boolean z) {
        C15655c c15655c = this.f37252f;
        if (c15655c != null) {
            c15655c.m41092u();
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
        this.f37253g = LayoutInflater.from(context);
        this.f37250d = c1792e;
        this.p0 = context.getResources().getDimensionPixelOffset(x6e.design_navigation_separator_vertical_padding);
    }

    /* renamed from: l */
    public void m41060l(View view) {
        this.f37248b.addView(view);
        NavigationMenuView navigationMenuView = this.f37247a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: m */
    public void m41061m(r9j r9jVar) {
        int iM46397l = r9jVar.m46397l();
        if (this.o0 != iM46397l) {
            this.o0 = iM46397l;
            c0();
        }
        NavigationMenuView navigationMenuView = this.f37247a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, r9jVar.m46394i());
        wvi.m55120g(this.f37248b, r9jVar);
    }

    /* renamed from: n */
    public C1794g m41062n() {
        return this.f37252f.m41082k();
    }

    /* renamed from: o */
    public int m41063o() {
        return this.i0;
    }

    /* renamed from: p */
    public int m41064p() {
        return this.h0;
    }

    /* renamed from: q */
    public int m41065q() {
        return this.f37248b.getChildCount();
    }

    /* renamed from: r */
    public Drawable m41066r() {
        return this.f37241L;
    }

    /* renamed from: s */
    public int m41067s() {
        return this.f37243Q;
    }

    /* renamed from: t */
    public int m41068t() {
        return this.f37245Y;
    }

    /* renamed from: u */
    public int m41069u() {
        return this.n0;
    }

    /* renamed from: v */
    public ColorStateList m41070v() {
        return this.f37258y;
    }

    /* renamed from: w */
    public ColorStateList m41071w() {
        return this.f37240H;
    }

    /* renamed from: x */
    public int m41072x() {
        return this.f37244X;
    }

    /* renamed from: y */
    public InterfaceC1797j m41073y(ViewGroup viewGroup) {
        if (this.f37247a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f37253g.inflate(n9e.design_navigation_menu, viewGroup, false);
            this.f37247a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C15660h(this.f37247a));
            if (this.f37252f == null) {
                C15655c c15655c = new C15655c();
                this.f37252f = c15655c;
                c15655c.setHasStableIds(true);
            }
            int i = this.q0;
            if (i != -1) {
                this.f37247a.setOverScrollMode(i);
            }
            LinearLayout linearLayout = (LinearLayout) this.f37253g.inflate(n9e.design_navigation_item_header, (ViewGroup) this.f37247a, false);
            this.f37248b = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f37247a.setAdapter(this.f37252f);
        }
        return this.f37247a;
    }

    /* renamed from: z */
    public int m41074z() {
        return this.k0;
    }
}
