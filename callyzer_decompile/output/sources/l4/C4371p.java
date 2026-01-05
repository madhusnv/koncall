package l4;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import z1.InputConnectionC8855o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.p */
/* loaded from: classes.dex */
public class C4371p extends InputConnectionC4370o {
    @Override // l4.InputConnectionC4370o, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnectionC8855o inputConnectionC8855o = this.f21927b;
        if (inputConnectionC8855o != null) {
            return inputConnectionC8855o.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
