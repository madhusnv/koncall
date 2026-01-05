package l4;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import g4.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import rw.AbstractC6663m;
import u8.AbstractC7370r;
import ul.AbstractC7473a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.u */
/* loaded from: classes.dex */
public final class InputConnectionC4376u implements InputConnection {

    /* renamed from: a */
    public final d0 f21929a;

    /* renamed from: b */
    public final boolean f21930b;

    /* renamed from: c */
    public int f21931c;

    /* renamed from: d */
    public C4381z f21932d;

    /* renamed from: e */
    public int f21933e;

    /* renamed from: f */
    public boolean f21934f;

    /* renamed from: g */
    public final ArrayList f21935g = new ArrayList();

    /* renamed from: h */
    public boolean f21936h = true;

    public InputConnectionC4376u(C4381z c4381z, d0 d0Var, boolean z6) {
        this.f21929a = d0Var;
        this.f21930b = z6;
        this.f21932d = c4381z;
    }

    /* renamed from: a */
    public final void m9150a(InterfaceC4362g interfaceC4362g) {
        this.f21931c++;
        try {
            this.f21935g.add(interfaceC4362g);
        } finally {
            m9151b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: b */
    public final boolean m9151b() {
        int i10 = this.f21931c - 1;
        this.f21931c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f21935g;
            if (!arrayList.isEmpty()) {
                ((AbstractC4155m) ((e0) this.f21929a.f21881b).f21889f).invoke(AbstractC6663m.d0(arrayList));
                arrayList.clear();
            }
        }
        return this.f21931c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z6 = this.f21936h;
        if (!z6) {
            return z6;
        }
        this.f21931c++;
        return true;
    }

    /* renamed from: c */
    public final void m9152c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z6 = this.f21936h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f21935g.clear();
        this.f21931c = 0;
        this.f21936h = false;
        ArrayList arrayList = ((e0) this.f21929a.f21881b).f21884a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC4154l.m8918a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z6 = this.f21936h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z6 = this.f21936h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z6 = this.f21936h;
        return z6 ? this.f21930b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z6 = this.f21936h;
        if (z6) {
            m9150a(new C4356a(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z6 = this.f21936h;
        if (!z6) {
            return z6;
        }
        m9150a(new C4360e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z6 = this.f21936h;
        if (!z6) {
            return z6;
        }
        m9150a(new C4361f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m9151b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z6 = this.f21936h;
        if (!z6) {
            return z6;
        }
        m9150a(new C4364i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        C4381z c4381z = this.f21932d;
        return TextUtils.getCapsMode(c4381z.f21945a.f13620b, n0.m6458e(c4381z.f21946b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z6 = (i10 & 1) != 0;
        this.f21934f = z6;
        if (z6) {
            this.f21933e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC7370r.m13789b(this.f21932d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (n0.m6455b(this.f21932d.f21946b)) {
            return null;
        }
        return AbstractC7473a.m14276a(this.f21932d).f13620b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC7473a.m14277b(this.f21932d, i10).f13620b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC7473a.m14278c(this.f21932d, i10).f13620b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z6 = this.f21936h;
        if (z6) {
            z6 = false;
            switch (i10) {
                case R.id.selectAll:
                    m9150a(new C4379x(0, this.f21932d.f21945a.f13620b.length()));
                    break;
                case R.id.cut:
                    m9152c(277);
                    return false;
                case R.id.copy:
                    m9152c(278);
                    return false;
                case R.id.paste:
                    m9152c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.f21936h
            if (r0 == 0) goto L29
            r0 = 1
            if (r4 == 0) goto La
            switch(r4) {
                case 2: goto L16;
                case 3: goto L14;
                case 4: goto L12;
                case 5: goto L10;
                case 6: goto Le;
                case 7: goto Lc;
                default: goto La;
            }
        La:
            r4 = r0
            goto L17
        Lc:
            r4 = 5
            goto L17
        Le:
            r4 = 7
            goto L17
        L10:
            r4 = 6
            goto L17
        L12:
            r4 = 4
            goto L17
        L14:
            r4 = 3
            goto L17
        L16:
            r4 = 2
        L17:
            l4.d0 r1 = r3.f21929a
            java.lang.Object r1 = r1.f21881b
            l4.e0 r1 = (l4.e0) r1
            java.lang.Object r1 = r1.f21890g
            ex.c r1 = (ex.InterfaceC2139c) r1
            l4.j r2 = new l4.j
            r2.<init>(r4)
            r1.invoke(r2)
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.InputConnectionC4376u.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z6 = this.f21936h;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f21936h
            if (r0 == 0) goto L79
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            l4.d0 r4 = r9.f21929a
            java.lang.Object r4 = r4.f21881b
            l4.e0 r4 = (l4.e0) r4
            java.lang.Object r4 = r4.f21895l
            l4.c r4 = (l4.C4358c) r4
            java.lang.Object r7 = r4.f21863c
            monitor-enter(r7)
            r4.f21866f = r5     // Catch: java.lang.Throwable -> L71
            r4.f21867g = r6     // Catch: java.lang.Throwable -> L71
            r4.f21868h = r1     // Catch: java.lang.Throwable -> L71
            r4.f21869i = r10     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L73
            r4.f21865e = r2     // Catch: java.lang.Throwable -> L71
            l4.z r10 = r4.f21870j     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L73
            r4.m9069a()     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r10 = move-exception
            goto L77
        L73:
            r4.f21864d = r3     // Catch: java.lang.Throwable -> L71
            monitor-exit(r7)
            return r2
        L77:
            monitor-exit(r7)
            throw r10
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.InputConnectionC4376u.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qw.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f21936h;
        if (!z6) {
            return z6;
        }
        ((BaseInputConnection) ((e0) this.f21929a.f21881b).f21893j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z6 = this.f21936h;
        if (z6) {
            m9150a(new C4377v(i10, i11));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z6 = this.f21936h;
        if (z6) {
            m9150a(new C4378w(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z6 = this.f21936h;
        if (!z6) {
            return z6;
        }
        m9150a(new C4379x(i10, i11));
        return true;
    }
}
