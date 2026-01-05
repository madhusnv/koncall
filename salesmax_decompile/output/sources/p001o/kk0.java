package p001o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p001o.n24;

/* loaded from: classes2.dex */
public abstract class kk0 {

    /* renamed from: o.kk0$a */
    public static final class C14850a {
        /* renamed from: a */
        public static boolean m35794a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                wvi.c0(textView, new n24.C15473a(dragEvent.getClipData(), 3).m40012a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        public static boolean m35795b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            wvi.c0(view, new n24.C15473a(dragEvent.getClipData(), 3).m40012a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m35791a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && wvi.m55090C(view) != null) {
            Activity activityM35793c = m35793c(view);
            if (activityM35793c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? C14850a.m35794a(dragEvent, (TextView) view, activityM35793c) : C14850a.m35795b(dragEvent, view, activityM35793c);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m35792b(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || wvi.m55090C(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            wvi.c0(textView, new n24.C15473a(primaryClip, 1).m40014c(i != 16908322 ? 1 : 0).m40012a());
        }
        return true;
    }

    /* renamed from: c */
    public static Activity m35793c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
