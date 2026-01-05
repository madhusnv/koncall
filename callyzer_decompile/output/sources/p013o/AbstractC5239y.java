package p013o;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import c4.C0861k;
import c6.C0875e;
import c6.InterfaceC0874d;
import c6.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.y */
/* loaded from: classes.dex */
public abstract class AbstractC5239y {
    /* renamed from: a */
    public static boolean m10304a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0874d c0861k;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0861k = new C0861k(clipData, 3);
            } else {
                C0875e c0875e = new C0875e();
                c0875e.f5441b = clipData;
                c0875e.f5442c = 3;
                c0861k = c0875e;
            }
            v0.m2524f(textView, c0861k.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    /* renamed from: b */
    public static boolean m10305b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0874d c0861k;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0861k = new C0861k(clipData, 3);
        } else {
            C0875e c0875e = new C0875e();
            c0875e.f5441b = clipData;
            c0875e.f5442c = 3;
            c0861k = c0875e;
        }
        v0.m2524f(view, c0861k.build());
        return true;
    }
}
