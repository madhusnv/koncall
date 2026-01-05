package e6;

import a1.c0;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e6.d */
/* loaded from: classes.dex */
public final class C1961d extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ c0 f9203a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1961d(InputConnection inputConnection, c0 c0Var) {
        super(inputConnection, false);
        this.f9203a = c0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        C8986c c8986c = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c8986c = new C8986c(8, new C1963f(inputContentInfo));
        }
        if (this.f9203a.m30l(c8986c, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
