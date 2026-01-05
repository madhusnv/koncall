package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC1782a;
import androidx.appcompat.view.menu.InterfaceC1796i;
import org.objectweb.asm.Opcodes;
import p001o.g9e;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes2.dex */
public class DialogInterfaceOnKeyListenerC1793f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1796i.a {

    /* renamed from: a */
    public C1792e f5621a;

    /* renamed from: b */
    public DialogInterfaceC1782a f5622b;

    /* renamed from: c */
    public C1790c f5623c;

    /* renamed from: d */
    public InterfaceC1796i.a f5624d;

    public DialogInterfaceOnKeyListenerC1793f(C1792e c1792e) {
        this.f5621a = c1792e;
    }

    /* renamed from: a */
    public void m4065a() {
        DialogInterfaceC1782a dialogInterfaceC1782a = this.f5622b;
        if (dialogInterfaceC1782a != null) {
            dialogInterfaceC1782a.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
    /* renamed from: b */
    public void mo3835b(C1792e c1792e, boolean z) {
        if (z || c1792e == this.f5621a) {
            m4065a();
        }
        InterfaceC1796i.a aVar = this.f5624d;
        if (aVar != null) {
            aVar.mo3835b(c1792e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
    /* renamed from: c */
    public boolean mo3836c(C1792e c1792e) {
        InterfaceC1796i.a aVar = this.f5624d;
        if (aVar != null) {
            return aVar.mo3836c(c1792e);
        }
        return false;
    }

    /* renamed from: d */
    public void m4066d(IBinder iBinder) {
        C1792e c1792e = this.f5621a;
        DialogInterfaceC1782a.a aVar = new DialogInterfaceC1782a.a(c1792e.m4061w());
        C1790c c1790c = new C1790c(aVar.getContext(), g9e.abc_list_menu_item_layout);
        this.f5623c = c1790c;
        c1790c.mo3965d(this);
        this.f5621a.m4041b(this.f5623c);
        aVar.mo3868a(this.f5623c.m4003a(), this);
        View viewM4015A = c1792e.m4015A();
        if (viewM4015A != null) {
            aVar.mo3870c(viewM4015A);
        } else {
            aVar.mo3871d(c1792e.m4063y()).setTitle(c1792e.m4064z());
        }
        aVar.mo3877j(this);
        DialogInterfaceC1782a dialogInterfaceC1782aCreate = aVar.create();
        this.f5622b = dialogInterfaceC1782aCreate;
        dialogInterfaceC1782aCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f5622b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= Opcodes.ACC_DEPRECATED;
        this.f5622b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5621a.m4028O((C1794g) this.f5623c.m4003a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f5623c.mo3963b(this.f5621a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f5622b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f5622b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f5621a.m4044e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f5621a.performShortcut(i, keyEvent, 0);
    }
}
