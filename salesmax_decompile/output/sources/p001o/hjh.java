package p001o;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class hjh implements ccc {
    /* renamed from: b */
    public static CharSequence m30671b(Context context, ClipData.Item item, int i) {
        if ((i & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    /* renamed from: c */
    public static void m30672c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // p001o.ccc
    /* renamed from: a */
    public n24 mo20848a(View view, n24 n24Var) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(n24Var);
        }
        if (n24Var.m40010d() == 2) {
            return n24Var;
        }
        ClipData clipDataM40008b = n24Var.m40008b();
        int iM40009c = n24Var.m40009c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataM40008b.getItemCount(); i++) {
            CharSequence charSequenceM30671b = m30671b(context, clipDataM40008b.getItemAt(i), iM40009c);
            if (charSequenceM30671b != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceM30671b);
                } else {
                    m30672c(editable, charSequenceM30671b);
                    z = true;
                }
            }
        }
        return null;
    }
}
