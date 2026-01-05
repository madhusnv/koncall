package p001o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p001o.vm;

/* loaded from: classes2.dex */
public class ndg extends ActionMode {

    /* renamed from: a */
    public final Context f36725a;

    /* renamed from: b */
    public final vm f36726b;

    /* renamed from: o.ndg$a */
    public static class C15549a implements vm.InterfaceC17615a {

        /* renamed from: a */
        public final ActionMode.Callback f36727a;

        /* renamed from: b */
        public final Context f36728b;

        /* renamed from: c */
        public final ArrayList f36729c = new ArrayList();

        /* renamed from: d */
        public final ktf f36730d = new ktf();

        public C15549a(Context context, ActionMode.Callback callback) {
            this.f36728b = context;
            this.f36727a = callback;
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: a */
        public boolean mo3837a(vm vmVar, Menu menu) {
            return this.f36727a.onCreateActionMode(m40392e(vmVar), m40393f(menu));
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: b */
        public void mo3838b(vm vmVar) {
            this.f36727a.onDestroyActionMode(m40392e(vmVar));
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: c */
        public boolean mo3839c(vm vmVar, MenuItem menuItem) {
            return this.f36727a.onActionItemClicked(m40392e(vmVar), new zab(this.f36728b, (aeg) menuItem));
        }

        @Override // p001o.vm.InterfaceC17615a
        /* renamed from: d */
        public boolean mo3840d(vm vmVar, Menu menu) {
            return this.f36727a.onPrepareActionMode(m40392e(vmVar), m40393f(menu));
        }

        /* renamed from: e */
        public ActionMode m40392e(vm vmVar) {
            int size = this.f36729c.size();
            for (int i = 0; i < size; i++) {
                ndg ndgVar = (ndg) this.f36729c.get(i);
                if (ndgVar != null && ndgVar.f36726b == vmVar) {
                    return ndgVar;
                }
            }
            ndg ndgVar2 = new ndg(this.f36728b, vmVar);
            this.f36729c.add(ndgVar2);
            return ndgVar2;
        }

        /* renamed from: f */
        public final Menu m40393f(Menu menu) {
            Menu menu2 = (Menu) this.f36730d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            cbb cbbVar = new cbb(this.f36728b, (ydg) menu);
            this.f36730d.put(menu, cbbVar);
            return cbbVar;
        }
    }

    public ndg(Context context, vm vmVar) {
        this.f36725a = context;
        this.f36726b = vmVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f36726b.mo3931c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f36726b.mo3932d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new cbb(this.f36725a, (ydg) this.f36726b.mo3933e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f36726b.mo3934f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f36726b.mo3935g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f36726b.m52960h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f36726b.mo3936i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f36726b.m52961j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f36726b.mo3937k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f36726b.mo3938l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f36726b.mo3939m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f36726b.mo3941o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f36726b.m52962p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f36726b.mo3943r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f36726b.mo3944s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f36726b.mo3940n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f36726b.mo3942q(i);
    }
}
