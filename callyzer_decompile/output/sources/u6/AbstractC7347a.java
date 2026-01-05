package u6;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u6.a */
/* loaded from: classes.dex */
public abstract class AbstractC7347a {

    /* renamed from: a */
    public static final Object f34979a = new Object();

    /* renamed from: a */
    public static boolean m13753a(Editable editable, KeyEvent keyEvent, boolean z6) {
        AbstractC7348b[] abstractC7348bArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC7348bArr = (AbstractC7348b[]) editable.getSpans(selectionStart, selectionEnd, AbstractC7348b.class)) != null && abstractC7348bArr.length > 0) {
                for (AbstractC7348b abstractC7348b : abstractC7348bArr) {
                    int spanStart = editable.getSpanStart(null);
                    int spanEnd = editable.getSpanEnd(null);
                    if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m13754b() {
        synchronized (f34979a) {
            y0.m11056f("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", false);
        }
    }
}
