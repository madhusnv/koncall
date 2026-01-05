package p001o;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hfe implements InputConnection {

    /* renamed from: a */
    public final ij8 f26782a;

    /* renamed from: b */
    public final boolean f26783b;

    /* renamed from: c */
    public int f26784c;

    /* renamed from: d */
    public chh f26785d;

    /* renamed from: e */
    public int f26786e;

    /* renamed from: f */
    public boolean f26787f;

    /* renamed from: g */
    public final List f26788g;

    /* renamed from: h */
    public boolean f26789h;

    public hfe(chh chhVar, ij8 ij8Var, boolean z) {
        sq8.m48649h(chhVar, "initState");
        sq8.m48649h(ij8Var, "eventCallback");
        this.f26782a = ij8Var;
        this.f26783b = z;
        this.f26785d = chhVar;
        this.f26788g = new ArrayList();
        this.f26789h = true;
    }

    /* renamed from: a */
    public final void m30359a(g36 g36Var) {
        m30360b();
        try {
            this.f26788g.add(g36Var);
        } finally {
            m30361c();
        }
    }

    /* renamed from: b */
    public final boolean m30360b() {
        this.f26784c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.f26789h;
        return z ? m30360b() : z;
    }

    /* renamed from: c */
    public final boolean m30361c() {
        int i = this.f26784c - 1;
        this.f26784c = i;
        if (i == 0 && (!this.f26788g.isEmpty())) {
            this.f26782a.mo32188d(kh3.T0(this.f26788g));
            this.f26788g.clear();
        }
        return this.f26784c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f26789h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f26788g.clear();
        this.f26784c = 0;
        this.f26789h = false;
        this.f26782a.mo32186b(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f26789h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        sq8.m48649h(inputContentInfo, "inputContentInfo");
        boolean z = this.f26789h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f26789h;
        return z ? this.f26783b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f26789h;
        if (z) {
            m30359a(new uj3(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* renamed from: d */
    public final void m30362d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f26789h;
        if (!z) {
            return z;
        }
        m30359a(new hl5(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f26789h;
        if (!z) {
            return z;
        }
        m30359a(new il5(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return m30361c();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.f26789h;
        if (!z) {
            return z;
        }
        m30359a(new k07());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f26785d.m21289c(), kih.m35762i(this.f26785d.m21288b()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f26787f = z;
        if (z) {
            this.f26786e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return oj8.m42293a(this.f26785d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (kih.m35759f(this.f26785d.m21288b())) {
            return null;
        }
        return dhh.m23155a(this.f26785d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return dhh.m23156b(this.f26785d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return dhh.m23157c(this.f26785d, i).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.f26789h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m30359a(new aif(0, this.f26785d.m21289c().length()));
                    break;
                case R.id.cut:
                    m30362d(277);
                    break;
                case R.id.copy:
                    m30362d(278);
                    break;
                case R.id.paste:
                    m30362d(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int iM22976a;
        boolean z = this.f26789h;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    iM22976a = df8.f19732b.m22978c();
                    break;
                case 3:
                    iM22976a = df8.f19732b.m22982g();
                    break;
                case 4:
                    iM22976a = df8.f19732b.m22983h();
                    break;
                case 5:
                    iM22976a = df8.f19732b.m22979d();
                    break;
                case 6:
                    iM22976a = df8.f19732b.m22977b();
                    break;
                case 7:
                    iM22976a = df8.f19732b.m22981f();
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("IME sends unsupported Editor Action: ");
                    sb.append(i);
                    iM22976a = df8.f19732b.m22976a();
                    break;
            }
        } else {
            iM22976a = df8.f19732b.m22976a();
        }
        this.f26782a.mo32187c(iM22976a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f26789h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z = this.f26789h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        boolean z = this.f26789h;
        if (!z) {
            return z;
        }
        this.f26782a.mo32185a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f26789h;
        if (z) {
            m30359a(new xhf(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f26789h;
        if (z) {
            m30359a(new yhf(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.f26789h;
        if (!z) {
            return z;
        }
        m30359a(new aif(i, i2));
        return true;
    }
}
