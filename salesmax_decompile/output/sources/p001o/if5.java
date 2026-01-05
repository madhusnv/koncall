package p001o;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes5.dex */
public class if5 implements MovementMethod {

    /* renamed from: a */
    public static if5 f28591a;

    /* renamed from: a */
    public static MovementMethod m32048a() {
        if (f28591a == null) {
            f28591a = new if5();
        }
        return f28591a;
    }

    @Override // android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public void initialize(TextView textView, Spannable spannable) {
        Selection.setSelection(spannable, 0);
    }

    @Override // android.text.method.MovementMethod
    public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public void onTakeFocus(TextView textView, Spannable spannable, int i) {
    }

    @Override // android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }
}
