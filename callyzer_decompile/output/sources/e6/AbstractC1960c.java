package e6;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e6.c */
/* loaded from: classes.dex */
public abstract class AbstractC1960c {

    /* renamed from: a */
    public static final String[] f9202a = new String[0];

    /* renamed from: a */
    public static String[] m5707a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            if (strArr != null) {
                return strArr;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    return stringArray;
                }
            }
        }
        return f9202a;
    }

    /* renamed from: b */
    public static void m5708b(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: c */
    public static void m5709c(EditorInfo editorInfo, CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            AbstractC1958a.m5705a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            AbstractC1958a.m5705a(editorInfo, charSequence);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = charSequence.length();
        if (i13 < 0 || i11 > length) {
            m5711e(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            m5711e(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m5711e(editorInfo, charSequence, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(charSequence.length() - i11, i17 - Math.min(i13, (int) (i17 * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        m5711e(editorInfo, i16 != i15 ? TextUtils.concat(charSequence.subSequence(i18, i18 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    /* renamed from: d */
    public static void m5710d(EditorInfo editorInfo, boolean z6) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC1959b.m5706a(editorInfo, z6);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z6);
    }

    /* renamed from: e */
    public static void m5711e(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }
}
