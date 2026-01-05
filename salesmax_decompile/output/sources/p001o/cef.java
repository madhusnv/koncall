package p001o;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class cef {

    /* renamed from: a */
    public static final cef f18009a = new cef();

    /* renamed from: g */
    public static final boolean m21087g(View view) {
        if (a94.m16694d(cef.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            cef cefVar = f18009a;
            if (!cefVar.m21090c((TextView) view) && !cefVar.m21088a((TextView) view) && !cefVar.m21091d((TextView) view) && !cefVar.m21093f((TextView) view) && !cefVar.m21092e((TextView) view)) {
                if (!cefVar.m21089b((TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            a94.m16692b(th, cef.class);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m21088a(TextView textView) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            String strM38996h = new mge("\\s").m38996h(owi.m42740k(textView), "");
            int length = strM38996h.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; -1 < i2; i2--) {
                    char cCharAt = strM38996h.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iM45485f = qh2.m45485f(cCharAt);
                    if (z && (iM45485f = iM45485f * 2) > 9) {
                        iM45485f = (iM45485f % 10) + 1;
                    }
                    i += iM45485f;
                    z = !z;
                }
                return i % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m21089b(TextView textView) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            boolean z = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String strM42740k = owi.m42740k(textView);
            if (strM42740k == null) {
                return false;
            }
            if (strM42740k.length() != 0) {
                z = false;
            }
            if (z) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(strM42740k).matches();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m21090c(TextView textView) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: d */
    public final boolean m21091d(TextView textView) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: e */
    public final boolean m21092e(TextView textView) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean m21093f(TextView textView) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
