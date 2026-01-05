package g6;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import c6.C0877g;
import c6.InterfaceC0876f;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g6.j */
/* loaded from: classes.dex */
public final class C2535j {
    /* renamed from: a */
    public static C0877g m6561a(View view, C0877g c0877g) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c0877g);
        }
        InterfaceC0876f interfaceC0876f = c0877g.f5450a;
        if (interfaceC0876f.mo2308f() == 2) {
            return c0877g;
        }
        ClipData clipDataMo2303a = interfaceC0876f.mo2303a();
        int iMo2306d = interfaceC0876f.mo2306d();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z6 = false;
        for (int i10 = 0; i10 < clipDataMo2303a.getItemCount(); i10++) {
            ClipData.Item itemAt = clipDataMo2303a.getItemAt(i10);
            if ((iMo2306d & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z6) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
