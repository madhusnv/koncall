package z1;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import b2.y0;
import c6.e0;
import com.amplifyframework.storage.s3.transfer.RunnableC1257d;
import g4.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4356a;
import l4.C4360e;
import l4.C4361f;
import l4.C4364i;
import l4.C4377v;
import l4.C4378w;
import l4.C4379x;
import l4.C4381z;
import l4.InterfaceC4362g;
import pg.n9;
import rw.AbstractC6663m;
import s1.C6725t;
import ul.AbstractC7473a;
import v0.C7622f;
import w3.t2;
import x1.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.o */
/* loaded from: classes.dex */
public final class InputConnectionC8855o implements InputConnection {

    /* renamed from: a */
    public final C7622f f42621a;

    /* renamed from: b */
    public final boolean f42622b;

    /* renamed from: c */
    public final v0 f42623c;

    /* renamed from: d */
    public final y0 f42624d;

    /* renamed from: e */
    public final t2 f42625e;

    /* renamed from: f */
    public int f42626f;

    /* renamed from: g */
    public C4381z f42627g;

    /* renamed from: h */
    public int f42628h;

    /* renamed from: i */
    public boolean f42629i;

    /* renamed from: j */
    public final ArrayList f42630j = new ArrayList();

    /* renamed from: k */
    public boolean f42631k = true;

    public InputConnectionC8855o(C4381z c4381z, C7622f c7622f, boolean z6, v0 v0Var, y0 y0Var, t2 t2Var) {
        this.f42621a = c7622f;
        this.f42622b = z6;
        this.f42623c = v0Var;
        this.f42624d = y0Var;
        this.f42625e = t2Var;
        this.f42627g = c4381z;
    }

    /* renamed from: a */
    public final void m16330a(InterfaceC4362g interfaceC4362g) {
        this.f42626f++;
        try {
            this.f42630j.add(interfaceC4362g);
        } finally {
            m16331b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: b */
    public final boolean m16331b() {
        int i10 = this.f42626f - 1;
        this.f42626f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f42630j;
            if (!arrayList.isEmpty()) {
                ((C8854n) this.f42621a.f36778a).f42610c.invoke(AbstractC6663m.d0(arrayList));
                arrayList.clear();
            }
        }
        return this.f42626f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z6 = this.f42631k;
        if (!z6) {
            return z6;
        }
        this.f42626f++;
        return true;
    }

    /* renamed from: c */
    public final void m16332c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z6 = this.f42631k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f42630j.clear();
        this.f42626f = 0;
        this.f42631k = false;
        ArrayList arrayList = ((C8854n) this.f42621a.f36778a).f42617j;
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
        boolean z6 = this.f42631k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z6 = this.f42631k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z6 = this.f42631k;
        return z6 ? this.f42622b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z6 = this.f42631k;
        if (z6) {
            m16330a(new C4356a(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z6 = this.f42631k;
        if (!z6) {
            return z6;
        }
        m16330a(new C4360e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z6 = this.f42631k;
        if (!z6) {
            return z6;
        }
        m16330a(new C4361f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m16331b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z6 = this.f42631k;
        if (!z6) {
            return z6;
        }
        m16330a(new C4364i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        C4381z c4381z = this.f42627g;
        return TextUtils.getCapsMode(c4381z.f21945a.f13620b, n0.m6458e(c4381z.f21946b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z6 = (i10 & 1) != 0;
        this.f42629i = z6;
        if (z6) {
            this.f42628h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return n9.m11803a(this.f42627g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (n0.m6455b(this.f42627g.f21946b)) {
            return null;
        }
        return AbstractC7473a.m14276a(this.f42627g).f13620b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC7473a.m14277b(this.f42627g, i10).f13620b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC7473a.m14278c(this.f42627g, i10).f13620b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z6 = this.f42631k;
        if (z6) {
            z6 = false;
            switch (i10) {
                case R.id.selectAll:
                    m16330a(new C4379x(0, this.f42627g.f21945a.f13620b.length()));
                    break;
                case R.id.cut:
                    m16332c(277);
                    return false;
                case R.id.copy:
                    m16332c(278);
                    return false;
                case R.id.paste:
                    m16332c(279);
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
            boolean r0 = r3.f42631k
            if (r0 == 0) goto L27
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
            v0.f r1 = r3.f42621a
            java.lang.Object r1 = r1.f36778a
            z1.n r1 = (z1.C8854n) r1
            ex.c r1 = r1.f42611d
            l4.j r2 = new l4.j
            r2.<init>(r4)
            r1.invoke(r2)
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.InputConnectionC8855o.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C6725t c6725t = new C6725t(19, this);
            v0 v0Var = this.f42623c;
            int iM2369p = v0Var != null ? e0.m2369p(v0Var, handwritingGesture, this.f42624d, this.f42625e, c6725t) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC1257d(intConsumer, iM2369p, 4));
            } else {
                intConsumer.accept(iM2369p);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z6 = this.f42631k;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        v0 v0Var;
        if (Build.VERSION.SDK_INT < 34 || (v0Var = this.f42623c) == null) {
            return false;
        }
        return e0.m2370q(v0Var, previewableHandwritingGesture, this.f42624d, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f42631k
            if (r0 == 0) goto L77
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
            v0.f r4 = r9.f42621a
            java.lang.Object r4 = r4.f36778a
            z1.n r4 = (z1.C8854n) r4
            z1.k r4 = r4.f42620m
            java.lang.Object r7 = r4.f42591c
            monitor-enter(r7)
            r4.f42594f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f42595g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f42596h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f42597i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f42593e = r2     // Catch: java.lang.Throwable -> L6f
            l4.z r10 = r4.f42598j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.m16328a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f42592d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.InputConnectionC8855o.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qw.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f42631k;
        if (!z6) {
            return z6;
        }
        ((BaseInputConnection) ((C8854n) this.f42621a.f36778a).f42618k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z6 = this.f42631k;
        if (z6) {
            m16330a(new C4377v(i10, i11));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z6 = this.f42631k;
        if (z6) {
            m16330a(new C4378w(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z6 = this.f42631k;
        if (!z6) {
            return z6;
        }
        m16330a(new C4379x(i10, i11));
        return true;
    }
}
