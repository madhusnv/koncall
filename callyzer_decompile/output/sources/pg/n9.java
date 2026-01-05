package pg;

import android.view.inputmethod.ExtractedText;
import l4.C4381z;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n9 {

    /* renamed from: a */
    public static final /* synthetic */ int f29001a = 0;

    /* renamed from: a */
    public static final ExtractedText m11803a(C4381z c4381z) {
        ExtractedText extractedText = new ExtractedText();
        String str = c4381z.f21945a.f13620b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j6 = c4381z.f21946b;
        extractedText.selectionStart = g4.n0.m6458e(j6);
        extractedText.selectionEnd = g4.n0.m6457d(j6);
        extractedText.flags = !AbstractC5178p.m10117y(c4381z.f21945a.f13620b, '\n') ? 1 : 0;
        return extractedText;
    }
}
