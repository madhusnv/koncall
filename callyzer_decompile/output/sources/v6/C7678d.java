package v6;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import u6.AbstractC7347a;
import ug.C7455z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v6.d */
/* loaded from: classes.dex */
public final class C7678d implements KeyListener {

    /* renamed from: a */
    public final KeyListener f37164a;

    /* renamed from: b */
    public final C7455z f37165b;

    public C7678d(KeyListener keyListener) {
        C7455z c7455z = new C7455z(20);
        this.f37164a = keyListener;
        this.f37165b = c7455z;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f37164a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f37164a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z6;
        this.f37165b.getClass();
        if (i10 != 67 ? i10 != 112 ? false : AbstractC7347a.m13753a(editable, keyEvent, true) : AbstractC7347a.m13753a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || this.f37164a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f37164a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f37164a.onKeyUp(view, editable, i10, keyEvent);
    }
}
