package p001o;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class l56 {

    /* renamed from: a */
    public final C15002b f33280a;

    /* renamed from: b */
    public int f33281b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c */
    public int f33282c = 0;

    /* renamed from: o.l56$a */
    public static class C15001a extends C15002b {

        /* renamed from: a */
        public final EditText f33283a;

        /* renamed from: b */
        public final t56 f33284b;

        public C15001a(EditText editText, boolean z) {
            this.f33283a = editText;
            t56 t56Var = new t56(editText, z);
            this.f33284b = t56Var;
            editText.addTextChangedListener(t56Var);
            editText.setEditableFactory(m56.getInstance());
        }

        @Override // p001o.l56.C15002b
        /* renamed from: a */
        public KeyListener mo36588a(KeyListener keyListener) {
            if (keyListener instanceof q56) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new q56(keyListener);
        }

        @Override // p001o.l56.C15002b
        /* renamed from: b */
        public InputConnection mo36589b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof o56 ? inputConnection : new o56(this.f33283a, inputConnection, editorInfo);
        }

        @Override // p001o.l56.C15002b
        /* renamed from: c */
        public void mo36590c(boolean z) {
            this.f33284b.m49410c(z);
        }
    }

    /* renamed from: o.l56$b */
    public static class C15002b {
        /* renamed from: a */
        public abstract KeyListener mo36588a(KeyListener keyListener);

        /* renamed from: b */
        public abstract InputConnection mo36589b(InputConnection inputConnection, EditorInfo editorInfo);

        /* renamed from: c */
        public abstract void mo36590c(boolean z);
    }

    public l56(EditText editText, boolean z) {
        fgd.m26664h(editText, "editText cannot be null");
        this.f33280a = new C15001a(editText, z);
    }

    /* renamed from: a */
    public KeyListener m36585a(KeyListener keyListener) {
        return this.f33280a.mo36588a(keyListener);
    }

    /* renamed from: b */
    public InputConnection m36586b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f33280a.mo36589b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void m36587c(boolean z) {
        this.f33280a.mo36590c(z);
    }
}
