package p001o;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C2066c;

/* loaded from: classes2.dex */
public final class q56 implements KeyListener {

    /* renamed from: a */
    public final KeyListener f41317a;

    /* renamed from: b */
    public final C16297a f41318b;

    /* renamed from: o.q56$a */
    public static class C16297a {
        /* renamed from: a */
        public boolean m44819a(Editable editable, int i, KeyEvent keyEvent) {
            return C2066c.m6066g(editable, i, keyEvent);
        }
    }

    public q56(KeyListener keyListener) {
        this(keyListener, new C16297a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f41317a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f41317a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f41318b.m44819a(editable, i, keyEvent) || this.f41317a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f41317a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f41317a.onKeyUp(view, editable, i, keyEvent);
    }

    public q56(KeyListener keyListener, C16297a c16297a) {
        this.f41317a = keyListener;
        this.f41318b = c16297a;
    }
}
