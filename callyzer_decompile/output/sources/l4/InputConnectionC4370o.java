package l4;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import s1.C6725t;
import z1.InputConnectionC8855o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.o */
/* loaded from: classes.dex */
public class InputConnectionC4370o implements InputConnection {

    /* renamed from: a */
    public final C6725t f21926a;

    /* renamed from: b */
    public InputConnectionC8855o f21927b;

    public InputConnectionC4370o(InputConnectionC8855o inputConnectionC8855o, C6725t c6725t) {
        this.f21926a = c6725t;
        this.f21927b = inputConnectionC8855o;
    }

    /* renamed from: a */
    public final void m9149a(InputConnectionC8855o inputConnectionC8855o) {
        inputConnectionC8855o.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            if (inputConnectionC8855o != null) {
                m9149a(inputConnectionC8855o);
                this.f21927b = null;
            }
            this.f21926a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.m16331b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.setSelection(i10, i11);
        }
        return false;
    }
}
