package p001o;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes2.dex */
public abstract class i46 {

    /* renamed from: a */
    public static final String[] f28010a = new String[0];

    /* renamed from: o.i46$a */
    public static class C14154a {
        /* renamed from: a */
        public static void m31492a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m31484a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f28010a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f28010a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f28010a;
    }

    /* renamed from: b */
    public static boolean m31485b(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    public static boolean m31486c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m31487d(EditorInfo editorInfo, String[] strArr) {
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

    /* renamed from: e */
    public static void m31488e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        fgd.m26663g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C14154a.m31492a(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            m31490g(editorInfo, null, 0, 0);
            return;
        }
        if (m31486c(editorInfo.inputType)) {
            m31490g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m31490g(editorInfo, charSequence, i4, i5);
        } else {
            m31491h(editorInfo, charSequence, i4, i5);
        }
    }

    /* renamed from: f */
    public static void m31489f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14154a.m31492a(editorInfo, charSequence, 0);
        } else {
            m31488e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    public static void m31490g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    public static void m31491h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int iMin = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int iMin2 = Math.min(i, i5 - iMin);
        int i6 = i - iMin2;
        if (m31485b(charSequence, i6, 0)) {
            i6++;
            iMin2--;
        }
        if (m31485b(charSequence, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        CharSequence charSequenceConcat = i4 != i3 ? TextUtils.concat(charSequence.subSequence(i6, i6 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i6, iMin2 + i4 + iMin + i6);
        int i7 = iMin2 + 0;
        m31490g(editorInfo, charSequenceConcat, i7, i4 + i7);
    }
}
