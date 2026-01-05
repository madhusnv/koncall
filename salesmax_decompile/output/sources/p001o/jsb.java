package p001o;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.InterfaceC1796i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class jsb {

    /* renamed from: a */
    public final C1792e f31046a;

    /* renamed from: c */
    public int f31048c = 0;

    /* renamed from: d */
    public int f31049d = 0;

    /* renamed from: e */
    public int f31050e = 0;

    /* renamed from: b */
    public final List f31047b = new ArrayList();

    public jsb(C1792e c1792e) {
        this.f31046a = c1792e;
        m34481f();
    }

    /* renamed from: a */
    public int m34476a() {
        return this.f31048c;
    }

    /* renamed from: b */
    public MenuItem m34477b(int i) {
        return (MenuItem) this.f31047b.get(i);
    }

    /* renamed from: c */
    public int m34478c() {
        return this.f31049d;
    }

    /* renamed from: d */
    public int m34479d() {
        return this.f31050e;
    }

    /* renamed from: e */
    public boolean m34480e(MenuItem menuItem, InterfaceC1796i interfaceC1796i, int i) {
        return this.f31046a.m4029P(menuItem, interfaceC1796i, i);
    }

    /* renamed from: f */
    public void m34481f() {
        this.f31047b.clear();
        this.f31048c = 0;
        this.f31049d = 0;
        this.f31050e = 0;
        for (int i = 0; i < this.f31046a.size(); i++) {
            MenuItem item = this.f31046a.getItem(i);
            if (item.hasSubMenu()) {
                if (!this.f31047b.isEmpty()) {
                    if (!(this.f31047b.get(r3.size() - 1) instanceof nv5) && item.isVisible()) {
                        this.f31047b.add(new nv5());
                    }
                }
                this.f31047b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f31047b.add(item2);
                    this.f31048c++;
                    if (item2.isVisible()) {
                        this.f31049d++;
                    }
                }
                this.f31047b.add(new nv5());
            } else {
                this.f31047b.add(item);
                this.f31048c++;
                if (item.isVisible()) {
                    this.f31049d++;
                    this.f31050e++;
                }
            }
        }
        if (this.f31047b.isEmpty()) {
            return;
        }
        if (this.f31047b.get(r0.size() - 1) instanceof nv5) {
            this.f31047b.remove(r0.size() - 1);
        }
    }

    /* renamed from: g */
    public int m34482g() {
        return this.f31047b.size();
    }
}
