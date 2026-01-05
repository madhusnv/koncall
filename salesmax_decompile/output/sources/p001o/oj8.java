package p001o;

import android.view.inputmethod.ExtractedText;

/* loaded from: classes2.dex */
public abstract class oj8 {
    /* renamed from: a */
    public static final ExtractedText m42293a(chh chhVar) {
        sq8.m48649h(chhVar, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = chhVar.m21289c();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = chhVar.m21289c().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = kih.m35762i(chhVar.m21288b());
        extractedText.selectionEnd = kih.m35761h(chhVar.m21288b());
        extractedText.flags = !f9g.m26305O(chhVar.m21289c(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
