package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public class cbb extends ce1 implements Menu {

    /* renamed from: d */
    public final ydg f17757d;

    public cbb(Context context, ydg ydgVar) {
        super(context);
        if (ydgVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f17757d = ydgVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m21033c(this.f17757d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f17757d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m21033c(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m21034d(this.f17757d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m21035e();
        this.f17757d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f17757d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m21033c(this.f17757d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m21033c(this.f17757d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f17757d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f17757d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f17757d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f17757d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m21036f(i);
        this.f17757d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m21037g(i);
        this.f17757d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f17757d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f17757d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f17757d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f17757d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f17757d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m21033c(this.f17757d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m21034d(this.f17757d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m21033c(this.f17757d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m21034d(this.f17757d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m21033c(this.f17757d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m21034d(this.f17757d.addSubMenu(i, i2, i3, i4));
    }
}
